import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: 'home',
    loadComponent: () => import('./home/home.page').then((m) => m.HomePage),
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full',
  },
  {
    path: 'page1',
    loadComponent: () => import('./pages/page1/page1.page').then( m => m.Page1Page)
  },
  {
    path: 'page2',
    loadComponent: () => import('./pages/page2/page2.page').then( m => m.Page2Page)
  },
  {
    path: 'page3',
    loadComponent: () => import('./pages/page3/page3.page').then( m => m.Page3Page)
  },
];
