/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_03.Controladores;

import com.mycompany.ejercicio03_03.Modelo.Pedido;
import com.mycompany.ejercicio03_03.Modelo.Producto;
import com.mycompany.ejercicio03_03.Servicio.PedidoServiceImpl;
import com.mycompany.ejercicio03_03.Servicio.ProductoServiceImpl;
import java.util.List;

/**
 *
 * @author Usuario R
 */
public class pedidoControl {

    private PedidoServiceImpl pedidoServiceImpl;
    private ProductoServiceImpl productoServiceImpl;

    public void crearPedido(String[] dataPedido, Producto producto) {

        var retorno = ("No se pudo crear el Pedido");
        var valida = true;
        var codigo = Integer.valueOf(dataPedido[0]).intValue();
        var nombreComprador = dataPedido[1];
        var totalSinIva = Float.valueOf(dataPedido[2]).floatValue();
        var tipoDeMercaderia = this.productoServiceImpl.buscarCodigo(Integer.valueOf(dataPedido[3]).intValue());
        var observaciones = dataPedido[4];
        var nombreProducto = producto;

        if (validaCodigo(codigo) == false) {
            retorno += "\n Codigo Incorrecto";
            valida = false;
        }

        if (validaNombre(nombreComprador) == false) {
            retorno += "\n Nombre mal escrito";
            valida = false;
        }

        if (validaTotalSinIva(totalSinIva) == false) {
            retorno += "\n Precio Incorrecto";
            valida = false;
        }

        if (valida==true) {         
            var pedido = new Pedido (codigo, 
                    nombreComprador, totalSinIva, tipoDeMercaderia, 
                    observaciones, nombreProducto);
            this.pedidoServiceImpl.crearPedido(pedido);           
        }
         
    }

    public boolean validaCodigo(int codigo) {

        var retorno = false;

        String numCadena = String.valueOf(codigo);
        String cadena = numCadena;

        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
            } else {
                return retorno;
            }
        }

        var cod = Integer.valueOf(codigo).intValue();

        if (cod > 0) {
            retorno = true;
        }

        return retorno;

    }

    public boolean validaNombre(String nombre) {
        var retorno = false;

        String cadena = nombre;
        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
                retorno = true;
                return retorno;
            }
        }

        return retorno;
    }

    public boolean validaTotalSinIva(float totalSinIva) {

        var retorno = false;

        String numCadena = String.valueOf(totalSinIva);
        String cadena = numCadena;

        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
            } else {
                return retorno;
            }
        }

        var costoF = Float.valueOf(totalSinIva).intValue();

        if (costoF > 0 && costoF < 10000) {
            retorno = true;
        }

        return retorno;

    }

    public List<Pedido> listar() {
        return this.pedidoServiceImpl.listar();
    }
}
