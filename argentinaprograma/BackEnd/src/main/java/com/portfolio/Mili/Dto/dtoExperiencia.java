package com.portfolio.Mili.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String empleado;
    @NotBlank
    private String empresa;
    @NotBlank
    private String periodo;
    @NotBlank
    private String descripcion;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String empleado, String empresa, String periodo, String descripcion) {
        this.empleado = empleado;
        this.empresa = empresa;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
