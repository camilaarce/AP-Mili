import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent implements OnInit {

  proyectos:any[]= [{
    nombre: 'nombre1',
    descripcion: 'Descripcion1',
    fecha: 'fecha1',
    link: 'link1'
  },
  {
    nombre: 'nombre2',
    descripcion: 'Descripcion2',
    fecha: 'fecha2',
    link: 'link2'
  }]

  constructor() { }

  ngOnInit(): void {
  }

}
