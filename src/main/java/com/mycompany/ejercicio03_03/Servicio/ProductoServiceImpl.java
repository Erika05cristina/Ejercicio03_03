/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_03.Servicio;

import com.mycompany.ejercicio03_03.Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario R
 */
public class ProductoServiceImpl implements ProductoService {
    
    private static List<Producto> productoList = new ArrayList<>();
      
    @Override
    public void crearProducto(Producto producto) {
    this.productoList.add(producto);
          
    }

    @Override
    public List<Producto> listar() {
        return this.productoList;
        
    }
   
    @Override
    public int buscarCodigo(int codigo) {
      int retorno =0;
        for(var producto:this.productoList){
            if(codigo==producto.getCodigo()){
                retorno=producto.getCodigo();
                break;
            }
        }
        return retorno;
    }
    
}
