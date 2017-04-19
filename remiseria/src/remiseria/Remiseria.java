/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remiseria;

/**
 *
 * @author tecnica
 */
public class Remiseria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion Casa = new Direccion();
        Casa.altura = 198;
        Casa.calle = "falucho";
        Casa.dpto = "A";
        Casa.localidad = "ciudadela";
        Casa.partido = "3 de febrero";
        Casa.piso = 1;

        Cliente Juan = new Cliente();

        Juan.NumCliente = 1;
        Juan.Puntaje = 8;
        Juan.Telefono = 46581123;
        Juan.nombre = "Pedro";

        Chofer Rob = new Chofer();

        Rob.Nombre = "Roberto";
        Rob.NroChofer = 1;
        Rob.Puntaje = 6;
        Rob.Telefono = 1155448877;
        Rob.licencia = "tipo B";
        Rob.vehiculo = "Auto";

        Viaje v= new Viaje();
        
       v.Costo=70;
       v.Destino="Rivadavia 125";         
       v.FormaPago=FormaPago.Efectivo;
       v.Origen="alsina 1200";
       v.chofer=Rob;
       
       v.cliente=Juan;
       
       Vehiculo a= new Vehiculo();
       
      a.Estado="Bueno";
      a.Marca="Ford";
      a.Modelo="Falcon";
      a.chofer=Rob;
      a.color=Color.Escarlata;
      a.patente=new Patente("AAA111",0);
      
      
      
              
              
         
      
       
       
     
     
               
               
    
    
    
    
    }

}
