export class Experiencia {
    id? : number;
    empleado : string;
    empresa : string;
    periodo: string;
    descripcion: string;

    constructor(empleado: string, empresa: string, periodo: string, descripcion: string){
        this.empleado = empleado;
        this.empresa = empresa;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }
}