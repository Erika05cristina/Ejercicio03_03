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
    private String nombreComprador; 
    private float totalSinIva;
    private int tipoDeMercaderia;
    private String observaciones;
    private Producto codigoProducto;
    
    

    public Pedido(int codigoPedido, String nombreComprador, float totalSinIva, 
            int tipoDeMercaderia, String observaciones, Producto codigoProducto) {
        
        this.codigoPedido = codigoPedido;
        this.nombreComprador = nombreComprador;
        this.totalSinIva = totalSinIva;
        this.tipoDeMercaderia = tipoDeMercaderia;
        this.observaciones = observaciones;
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public float getTotalSinIva() {
        return totalSinIva;
    }

    public void setTotalSinIva(float totalSinIva) {
        this.totalSinIva = totalSinIva;
    }

    public int getTipoDeMercaderia() {
        return tipoDeMercaderia;
    }

    public void setTipoDeMercaderia(int tipoDeMercaderia) {
        this.tipoDeMercaderia = tipoDeMercaderia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Producto getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Producto codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

   
    @Override
    public String toString() {
        return "Pedido{" + "codigoPedido=" + codigoPedido + ", nombreContador=" 
                + nombreComprador + ", totalSinIva=" + totalSinIva 
                + ", tipoDeMercaderia=" + tipoDeMercaderia + ", observaciones=" 
                + observaciones + codigoProducto.getCodigo()+ '}';
    }
  
    
}
