import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    loadChildren: () => import('./tabs/tabs.routes').then((m) => m.routes),
  },
  {
    path: 'page3',
    loadComponent: () => import('./pages/page3/page3.page').then( m => m.Page3Page)
  },
  {
    path: 'page2',
    loadComponent: () => import('./pages/page2/page2.page').then( m => m.Page2Page)
  },
  {
  path: 'page1',
  loadComponent: () => import('./pages/page1/page1.page').then(m => m.Page1Page)
},
  {
  path: 'page1/:id',  data: {title: "Hello"},
  loadComponent: () => import('./pages/page1/page1.page').then( m => m.Page1Page)
  },

];
