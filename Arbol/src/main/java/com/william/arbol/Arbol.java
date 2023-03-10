/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.william.arbol;

import javax.swing.JOptionPane;

/**
 *
 * @author wil_c
 */
public class Arbol {

    public static void main(String[] args) {
        
        int opcion = 0, elemento;
        Node arbol = new Node(100);
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                     1. Insertar
                     2. Buscar
                     3. Eliminar                                                     
                     4. Recorrer en orden                                                      
                     5. Recorrer en pre orden
                     6. Recorrer en nivel
                     7. Salir                                                                                                                                                                             
                     Menu de opciones                                                       """, "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                
                switch(opcion){
                    case 1 -> {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar elemento del nodo",
                                "Agregar nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
                                arbol.add(elemento);
                        break;
                    }

                    case 2 -> {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Buscar por valor",
                                "Buscando por valor", JOptionPane.INFORMATION_MESSAGE));
                                arbol.containsNode(elemento);
                                JOptionPane.showMessageDialog(null, "El elemento buscado es: " + arbol.containsNode(elemento), 
                                "Elemento encontrado", JOptionPane.INFORMATION_MESSAGE);     
                        break;
                    }

                    case 3 -> {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Borrar elemento",
                                "Borrando elemento del nodo", JOptionPane.INFORMATION_MESSAGE));
                                arbol.delete(elemento);
                                JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento, 
                                "Elemento encontrado", JOptionPane.INFORMATION_MESSAGE);  
                                    JOptionPane.showMessageDialog(null, "Elemento borrado exitosamente");
                                
                        break;
                    }

                    case 4 -> {
                        
                        arbol.traverseInOrder(arbol);
                        
                        break;
                    }

                    case 5 -> {
                        
                        arbol.traversePreOrder(arbol);
                        
                        break;
                    }
                    
                    case 6 -> {
                        
                        arbol.traverseLevelOrder();
                        
                        break;
                        
                      
                            
                    }
        }
            
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        }while(opcion != 7);
        
        
    
    }
        
}
