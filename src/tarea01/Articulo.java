/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01;

/**
 *
 * @author leonguevara
 */
public class Articulo {
    
    // ===========================================================
    // Atributos de la clase requeridos de acuerdo al diagrama UML
    // ===========================================================
    public int sku;
    protected int existencia;
    protected double precio;
    protected double costo;
    public String descripcion;
    
    // =========================================================
    // Métodos de la clase requeridos de acuerdo al diagrama UML
    // =========================================================
    
    // Constructor.  Este constructor recibe los datos del SKU, así como la
    //   descripción y el precio del producto.  Los otros dos atributos, la
    //   existencia y el costo, son inicializados en 0 (cero).
    public Articulo(int sku, double precio, String descripcion) {
        this.sku = sku;
        this.precio = precio;
        this.descripcion = descripcion;
        this.existencia = 0;
        this.costo = 0;
    }
    
    // compra.  Este método no regresa dato alguno.  Recibe como parámetros
    //   el número de unidades adquiridas y el costo por unidad, datos
    //   con los que actualiza los atributos de la clase.
    public void compra(int unidades, double costo) {
        // Aquí agregamos a la existencia actual la cantidad de artìculos que
        // se acaban de comprar.
        this.existencia += unidades;
        // El costo por unidad del artículo sí sobreescribe al valor anterior
        this.costo = costo;
    }
    
    // venta.  Este método recibe la cantidad de unidades a vender del
    //   artículo.  Utiliza el método verificarExistencia para saber si en el
    //   inventario existen suficientes artículos para registrar la venta.
    //   De ser así, disminuye la existencia de unidades del artìculo en el
    //   número de unidades vendidas y regresa el boolean true, indicando que
    //   sí se pudo realizar la venta.  De lo contrario, regresa el boolean
    //   false, indicando que no se pudo realizar la venta.
    public boolean venta(int unidades){
        if (verificarExistencia() >= unidades) {
            this.existencia -= unidades;
            return true;
        } else {
            return false;
        }
    }
    
    // verificarExistencia.  Este método devuelve el valor del atributo
    //   existencia.  No recibe parámetros.
    public int verificarExistencia() {
        return this.existencia;
    }
    
    // actualizaPrecio.  Este método no regresa dato alguno.  Recibe como
    //   parámetro el nuevo precio de venta por unidad del artículo y
    //   sobreescribe el valor anterior.
    public void actualizaPrecio(double precio) {
        this.precio = precio;
    }
}
