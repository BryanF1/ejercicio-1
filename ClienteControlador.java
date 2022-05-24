package proyecto.src.clase1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClienteControlador {

    public int contador;
    public Cliente cliente;
        
    ClienteControlador(int cont, Cliente cli){

           setContador(cont);
           setCliente(cli);

    }
     
    void setContador(int cont){

        contador = cont;
    }
        int getContador(){
            return contador;
        }
    
    void setCliente(Cliente cli){
        cliente = cli;
    }
        Cliente getCliente(){
            return cliente;
        }

        public static void main(String[] args){
            Scanner entrada = new Scanner (System.in);
            int agregarclientes;
                
            agregarclientes = Integer.parseInt(JOptionPane.showInputDialog("agregue la cantidad de usuarios"));
                char[] clientess = new char [agregarclientes];

                System.out.println("digite los clientes");
                for(int i=0; i<agregarclientes; i++){

                    System.out.print((i+1)+"Digite un caracter");
                    clientess[i] = entrada.next().charAT(0);
                }

                System.out.println("Los usuarios son");
                for(int i=0; i < agregarclientes; i++){
                    System.out.println(clientess[i]);
                }
        }
}
