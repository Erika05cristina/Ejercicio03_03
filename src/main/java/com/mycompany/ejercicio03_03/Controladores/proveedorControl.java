/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_03.Controladores;

import com.mycompany.ejercicio03_03.Modelo.Proveedor;
import com.mycompany.ejercicio03_03.Servicio.PedidoServiceImpl;
import com.mycompany.ejercicio03_03.Servicio.ProveedorServiceImpl;
import java.util.List;

/**
 *
 * @author Usuario R
 */
public class proveedorControl {

    private ProveedorServiceImpl proveedorServiceImpl = new ProveedorServiceImpl();
    private PedidoServiceImpl pedidoServiceImpl;

    public String crearProveedor(String[] dataProveedor, Object[] dataP) {

        var retorno = ("No se pudo crear el Producto");
        var valida = true;
        var cedula = dataProveedor[0];
        var nombre = dataProveedor[1];
        var ruta = dataProveedor[2];
        var horaIngreso = dataP[0];
        var horaSalida = dataP[1];
        var codigoPedido = this.pedidoServiceImpl.buscarPorCodigo(Integer.valueOf(dataProveedor[3]).intValue());;

        if (validaCedula(cedula) != 10) {
            retorno += "\n Cedula incorrecta";
            valida = false;
        }

        if (validaNombre(nombre) == false) {
            retorno += "\n Nombre mal escrito";
            valida = false;
        }

        if (validaRuta(ruta) == false) {
            retorno += "\n Ruta Incorrecta";
            valida = false;
        }

        if (valida == true) {
            var proveedor = new Proveedor(cedula,nombre,ruta,horaIngreso,horaSalida,codigoPedido);
            this.proveedorServiceImpl.crearProveedor(proveedor);
        }
        return retorno;

    }

    public int validaCedula(String cedula) {

        var retorno = 0;

        String cadena = cedula;

        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
                retorno = i + 1;
            }

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

    public boolean validaRuta(String ruta) {
        var retorno = false;

        switch (ruta) {
            case "Baños":
                retorno = true;
                break;
            case "Centro Historiso":
                retorno = true;
                break;
            case "Ricaurte":
                retorno = true;
                break;
            case "Totoracocha":
                retorno = true;
                break;
            case "El Valle":
                retorno = true;
                break;
            case "Gualaceo":
                retorno = true;
                break;
            default:
                System.out.println("Ruta no encontrada");
                break;
        }

        return retorno;
    }
public List<Proveedor> listar(){
    return this.proveedorServiceImpl.listar();
}
}
