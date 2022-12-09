/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_03.Modelo;

/**
 *
 * @author Usuario R
 */
public class Pedido {
    private int codigoPedido; 
    private String nombreContador; 
    private float totalSinIva;
    private String tipoDeMercaderia;
    private String observaciones;
    private Producto nombreProducto;
    
    

    public Pedido(int codigoPedido, String nombreContador, float totalSinIva, 
            String tipoDeMercaderia, String observaciones, Producto nombreProducto) {
        
        this.codigoPedido = codigoPedido;
        this.nombreContador = nombreContador;
        this.totalSinIva = totalSinIva;
        this.tipoDeMercaderia = tipoDeMercaderia;
        this.observaciones = observaciones;
        this.nombreProducto = nombreProducto;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getNombreContador() {
        return nombreContador;
    }

    public void setNombreContador(String nombreContador) {
        this.nombreContador = nombreContador;
    }

    public float getTotalSinIva() {
        return totalSinIva;
    }

    public void setTotalSinIva(float totalSinIva) {
        this.totalSinIva = totalSinIva;
    }

    public String getTipoDeMercaderia() {
        return tipoDeMercaderia;
    }

    public void setTipoDeMercaderia(String tipoDeMercaderia) {
        this.tipoDeMercaderia = tipoDeMercaderia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Producto getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(Producto nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigoPedido=" + codigoPedido + ", nombreContador=" 
                + nombreContador + ", totalSinIva=" + totalSinIva 
                + ", tipoDeMercaderia=" + tipoDeMercaderia + ", observaciones=" 
                + observaciones + nombreProducto.getNombre() + '}';
    }

    
    
   
    
}
