package test;

import dominio.plano;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TestPlano {

    public static void main(String[] args) {
        plano obj1=null;
        int x = 0, y = 0, op = 0,valor=0,tx=0,ty=0;
        Scanner entrada = new Scanner(System.in);
        boolean bandera,bandera1;
        do {
            bandera = false;
            try {
                System.out.println ("Coordenada iniciales X=0  &&  Y=0");
                obj1 = new plano(0, 0);
            } catch (NumberFormatException e) {
                System.out.println ( "Dato no Valido ");
                bandera = true;
            }
        } while (bandera);
        do {
            bandera1 = false;
            try {
                System.out.println  ("Menu" + "\n1. Arriba" + "\n2. Abajo" + "\n3.Izquierda" + "\n4. Derecha" + "\n5. Salir");
                op = entrada.nextInt();
            } catch (NumberFormatException e) {
                System.out.println ("Opcion no existe");
                bandera1 = true;
            } 
            if(op!=5){
                try{
                    System.out.println("Ingrese el valor");
                    valor = entrada.nextInt();
                }catch(NumberFormatException e){
                    System.out.println("Dato no valido");
                }                
            }            
            switch(op){
                case 1:
                        obj1.setArriba(valor);
                        bandera1 = true;
                        break;
                case 2:
                        obj1.setAbajo(valor);
                        bandera1 = true;
                        break;
                case 3:
                        obj1.setIzquierda(valor);
                        bandera1 = true;
                        break;
                case 4:
                        obj1.setDerecha(valor);
                        bandera1 = true;
                        break;
                case 5:
                        bandera1=false;
            }
            System.out.println("Posicion: "+ "x = "+obj1.getX()+" Y = "+obj1.getY());
            tx+=obj1.getX();
            ty+=obj1.getY();
         } while (bandera1); 
        System.out.println("Direccion final: ("  +tx+","+ty+")" );
       
    }         
}