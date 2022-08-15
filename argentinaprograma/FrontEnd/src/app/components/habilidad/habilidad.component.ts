import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-habilidad',
  templateUrl: './habilidad.component.html',
  styleUrls: ['./habilidad.component.css']
})
export class HabilidadComponent implements OnInit {
  @Input() hab: any;

  constructor() { }

  ngOnInit(): void {
  }

}
