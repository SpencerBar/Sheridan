
import { inject, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, pipe, map, filter } from 'rxjs';

// define constants
const MODEL = "llama3.2:1b";                // LLM name
const URL = "http://localhost:11434/api/";  // ollama API, make sure use your own port number


// define on interface to hold a single message
export interface Message
{
    role: string;       // user, assistant, system or tool
    time: string;
    content: string;
}


@Injectable({
  providedIn: 'root'
})
export class OllamaService
{
    // public properties
    // it is provided by provideHttpClient() helper function,
    // so import the module in app.config.ts
    http = inject(HttpClient);

    generate(prompt: string = ""): Observable<any>
    {
        // construct request body
        let body =
        {
            model: MODEL,
            prompt: prompt
        };

        // get response from ollama token by token
        // NOTE: responseType must be "text" because the response is non-standard JSON format
        return this.http.post(
            URL + "generate",
            body,
            // NOTE: must use these options to get the response correctly
            { responseType: "text", observe: "events", reportProgress: true }
        )
        // NOTE: Ollama will return multiple responses(events) until completed.
        //       The response with "type"=3 contains the actual text in partialText property.
        //       "partialText" contains a sequence of cumulative objects seperating by "\n".
        .pipe(
            filter(e => e.type == 3),
            map((e:any) =>
            {
                // convert partialText value (string) to JSON (array of objects)
                let partials = e.partialText.trim().split("\n");
                //console.log(partials);
                return partials.map((e:string) => JSON.parse(e));
            })
        );
    }

    chat(messages: Message[] = []): Observable<any> {
        // 1. make a copy of messages param to Ollama-specific, {role,content}
    
        let ollamaMessages = messages.map((m) => {
          if (m.role == 'You') return { role: 'user', content: m.content };
          else return { role: 'assistant', content: m.content };
        });
    
        // 2. construct request body including {model,messages}
    
        let body = {
          model: MODEL,
    
          messages: ollamaMessages,
        };
    
        // 3. send post request with body and options
    
        return (this.http
          .post(URL + 'chat', body, {
            responseType: 'text',
            observe: 'events',
            reportProgress: true,
          })
    
          .pipe(
            filter((e) => e.type == 3),
    
            map((e: any) => {
              // convert partialText value (string) to JSON (array of objects)
    
              let partials = e.partialText.trim().split('\n');
              return partials.map((e: string) => JSON.parse(e));
            })
          ));
    
        
      }
   
}

