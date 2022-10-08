import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  habilidades = [['HTML', 50], ['CSS', 30], ['JavaScript', 90]];
  
  constructor() { 
    
  }


  ngOnInit(): void {
  }

}
