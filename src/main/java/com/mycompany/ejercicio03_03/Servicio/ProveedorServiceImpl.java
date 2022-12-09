/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_03.Servicio;

import com.mycompany.ejercicio03_03.Modelo.Pedido;
import com.mycompany.ejercicio03_03.Modelo.Producto;
import com.mycompany.ejercicio03_03.Modelo.Proveedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario R
 */
public class ProveedorServiceImpl implements ProveedorService {
    private static List<Proveedor> proveedorList = new ArrayList<>();
    private static List<Pedido> pedidoList = new ArrayList<>();
    
    
    @Override
    public void crearProveedor(Proveedor proveedor) {
        this.proveedorList.add(proveedor);
        
    }

    @Override
    public List<Proveedor> listar() {
        return this.proveedorList;
        
    }

    @Override
    public Pedido buscarProducto(Pedido pedido) {
        Producto retorno=null;
        for(Pedido ped:this.pedidoList){
            if(ped==pedido.()){
                retorno = pedido;
                break;
            }
        }
        }
    
    
    
}
