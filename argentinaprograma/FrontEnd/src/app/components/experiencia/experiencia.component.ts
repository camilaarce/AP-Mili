import { Component, OnInit } from '@angular/core';
import { Experiencia } from 'src/app/model/experiencia';
import { ExperienciaService } from 'src/app/service/experienciaService.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {
  experiencia: Experiencia[] = [];
    /*experiencias:any[]= [{
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
*/
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

  constructor(private experienciaService: ExperienciaService, private tokenService: TokenService) { }

  isLogged = false;

  ngOnInit(): void {
    this.cargarExperiencia();
    if(this.tokenService.getToken()){
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarExperiencia():void{
    this.experienciaService.lista().subscribe(
      data => {this.experiencia = data;}
    )
  }
}
