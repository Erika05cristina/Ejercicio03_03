/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_03.Modelo;

/**
 *
 * @author Usuario R
 */
public class Proveedor {
    private String cedula;
    private String nombre;
    private String ruta;
    private Object horaIngreso;
    private Object horaSalida;
    private Pedido codigoPedido;

    public Proveedor(String cedula, String nombre, String ruta, Object horaIngreso, 
            Object horaSalida, Pedido codigoPedido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.ruta = ruta;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.codigoPedido = codigoPedido;
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Object getHoraIngreso(Object horaIngreso) {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Object getHoraSalida(Object horaSalida) {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Pedido getPedido() {
        return codigoPedido;
    }

    public void setPedido(Pedido pedido) {
        this.codigoPedido = pedido;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "cedula=" + cedula + ", nombre=" + nombre 
                + ", ruta=" + ruta + ", horaIngreso=" + horaIngreso 
                + ", horaSalida=" + horaSalida + ", "+ codigoPedido.getCodigoPedido()+ '}';
    }

  
    
    
}
