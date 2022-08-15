import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {

  experiencias:any[]= [{
    titulo: 'Empleado 1',
    nombreEmpresa: 'Empresa 1',
    periodo: '2018-2021',
    descripcion: 'descirpcion 1'
  },
  {
    titulo: 'Empleado 2',
    nombreEmpresa: 'Empresa 2',
    periodo: '2018-2021',
    descripcion: 'descirpcion 2'
  }]

  educacion:any[]= [{
    institucion: 'Institucion 1',
    titulo: 'titulo 1',
    periodo: '2018-2021',
  },
  {
    intitucion: 'Institucion 2',
    titulo: 'titulo 2',
    periodo: '2014-2021',
  }]

  constructor() { }

  ngOnInit(): void {
  }

}
