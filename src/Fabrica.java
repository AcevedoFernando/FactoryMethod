/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cezz_
 */
public abstract class Fabrica {
    
    public void showSayHello(){
        Producto prod = createProduct();
        prod.sayHello();
    }
    
    public abstract Producto createProduct();
}
