/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listas;

/**
 *
 * @author Estudiante
 */
public class Listas {

        private int tamano;
        private int[]datos;
         
        public Listas(int tamanoInicial){
        datos= new int [tamanoInicial];
        tamano=0;
        }
        
        public int getSize(){
        return tamano;
        }
        public boolean isEmpty(){
        if(tamano==0){
        return true;
        }
        return false;
        }
        public void asegurarCapacidad(){
        if(tamano==datos.length){
        int capacidad=Math.max(1,datos.length*2);
            int[] nuevo=new int[capacidad];
            for(int i=0;i<tamano;i++){
            nuevo[i]=datos[i];
            }
            datos=nuevo;
        }
        }
        public void validarIndice(int indice){
        if(indice<0){
        throw new IndexOutOfBoundsException("Indice invalido"+ indice);
                
        
               
        }
        }
        public void agregar(int valor){
            asegurarCapacidad();
        datos[tamano]=valor;
        tamano++;
        
        }
        
        public int buscar(int numero){
        
        for(int i=0;i<datos.length;i++){
        if(datos[i]==numero){
        return i;
        }
        }
        return -1;
        }
        
        public int eliminar(int indice){
        
            validarIndice(indice);
            int eliminado=datos[indice];
            
            for(int i=indice;i<tamano;i++){
            datos[i]=datos[i+1];
            }
            tamano--;
            return eliminado;
        }
        public int obtener(int indice){
        validarIndice(indice);
        return datos[indice];
        }
        
        public void insertar(int indice,int valor){
        validarIndice(indice);
        asegurarCapacidad();
        
        for(int i=tamano;i<indice;i--){datos[i]=datos[i-1];}
       
       datos[indice]=valor;
        tamano++;
        }
        
}

