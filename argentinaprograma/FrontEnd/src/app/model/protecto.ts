export class Proyecto {
    id?: number;
    nombre: String;
    descripcion: String;
    link: String;

    constructor(nombre: String, descripcion: String, link: String){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.link = link;
    }
}