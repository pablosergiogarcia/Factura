/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author HP Mini
 */
public class Principal {
    public static void main(String[] args) {
        
        Cliente unCliente = new Cliente("Manuel", "Perez");
        
        Pais unPais = new Pais();
        unPais.setNombre_pais("Argentina");
        
        Provincia unaProv = new Provincia();
        unaProv.setNombre_provincia("Buenos Aires");
        
        
        FormaCobro unFormaCobro = new FormaCobro();
        unFormaCobro.setNombre("Visa");
        
        Item cocaCola = new Item();
        cocaCola.setNombre("Coca cola");
        cocaCola.setPrecio(12.43);

        Item pepsi = new Item();
        pepsi.setNombre("Pepsi");
        pepsi.setPrecio(15.43);

        
        ItemFactura unItemFacturaPepsi = new ItemFactura();
        unItemFacturaPepsi.setCantidad(2.0);
        unItemFacturaPepsi.setItem_factura(pepsi);
        unItemFacturaPepsi.setPrecio(pepsi.getPrecio());
        
        ItemFactura unItemFacturaCoca = new ItemFactura();
        unItemFacturaCoca.setCantidad(10.0);
        unItemFacturaCoca.setItem_factura(cocaCola);
        unItemFacturaCoca.setPrecio(cocaCola.getPrecio());
        
        
        
        Factura unaFactura = new Factura();
        unaFactura.setCliente(unCliente);
        unaFactura.setNumero(2354);
        unaFactura.AgregarFormaCobro(unFormaCobro);
        unaFactura.agregarItem(unItemFacturaPepsi);
        unaFactura.agregarItem(unItemFacturaCoca);
    
        System.out.println(unaFactura.getItemFactura().get(0).getItem_factura().getPrecio());
        
        
    }
    
}
