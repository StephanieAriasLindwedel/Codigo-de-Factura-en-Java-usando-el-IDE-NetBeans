/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;
import java.util.Scanner;
/**
 *
 * @author Stephanie
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre;
        double Precio,SubTotal=0,Pago,Total,Impuesto,Descuento;
        int Cantidad,Opc;
        Scanner Prod=new Scanner(System.in);
        do{
            System.out.println("Ingrese el nombre del producto");
            Nombre=Prod.next();
            System.out.println("Ingrese la cantidad de producto: "+Nombre+" que desea comprar");
            Cantidad= Prod.nextInt();
            System.out.println("Cual es el precio unitario del producto: "+Nombre);
            Precio=Prod.nextDouble();
            Pago=Cantidad*Precio;
            System.out.println("Desea seguir comprando?"
                    + "\n1-Si"
                    + "\n2-No");
            Opc=Prod.nextInt();
            SubTotal=SubTotal+Pago;
        }while(Opc!=2);
        Impuesto=SubTotal*0.18;
        Total=SubTotal+Impuesto;
        Descuento=Total*0.1;
        if(Total>=5000){
            System.out.println("-----FACTURA-------"
                    + "\nSubTotal: "+SubTotal
                    + "\nImpuesto: "+Impuesto 
                    + "\nTotal: "+Total
                    + "\nDescuento: "+Descuento
                    + "\nTotal a pagar: "+(Total-Descuento));
        }else{
            System.out.println("-----FACTURA-------"
                    + "\nSubTotal: "+SubTotal
                    + "\nImpuesto: "+Impuesto
                    + "\nTotal: "+Total);
        }
    }
    
}
