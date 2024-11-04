import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { LanguagesComponent } from './languages/languages.component';
import { Language, WebService } from './web.service';
import { InfoComponent } from './info/info.component';
import { BaseChartDirective } from 'ng2-charts';
import { ChartType, ChartData, ChartOptions } from 'chart.js';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule, RouterOutlet, LanguagesComponent, BaseChartDirective, InfoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  // chart params
  chartType: ChartType = "bar";
  chartData: ChartData = {datasets:[]};
  chartOptions: ChartOptions = {
  responsive: true,
  maintainAspectRatio:false,
  indexAxis: "y",
  plugins: {
    title: {display: true, text: "Most Popular Programming Languages"},
    legend: {display: true, position:"bottom"}
  }
};
// array to hold json data
  languages : Language[] = [];
  // constructor
  constructor(web: WebService) {
    let BgColors = ['rgba(255, 99, 132, 1)',
      'rgba(54, 162, 235, 1)',
      'rgba(255, 206, 86, 1)',
      'rgba(75, 192, 192, 1)',
      'rgba(153, 102, 255, 1)',
      'rgba(255, 159, 64, 1)'];
    let BdColors = ['rgba(0, 0, 0, 1)'];
    web.getData().subscribe({
      next: json => {
        this.languages = json;
        let labels = this.languages.map(lang => lang.language);
        let data = this.languages.map(lang => lang.percent);
        
        this.chartData = {
          labels: labels,
          datasets: [{
            label: "Percent",
            data: data,
            backgroundColor: BgColors,
            borderColor: BdColors,
            borderWidth: 1
          }]
    };
      },
      error: e => console.log(e)
    });
    
    
   }
}

