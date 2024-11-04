import { Component, Input } from '@angular/core';
import { Language } from '../web.service';

@Component({
  selector: 'app-languages',
  standalone: true,
  imports: [],
  templateUrl: './languages.component.html',
  styleUrl: './languages.component.css'
})
export class LanguagesComponent {
@Input() language: Language = {language:"",percent:0};
}
