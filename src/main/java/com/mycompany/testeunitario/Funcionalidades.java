/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeunitario;

/**
 *
 * @author sky
 */
public class Funcionalidades {
    
    
    int somaNum(int n1, int n2){
        return n1 + n2;
    }
    
    
    boolean par(int n){
        if(n%2==0)
            return true;
        else
            return false;
    }
    
    
    
    boolean impar(int n){
        if(n%2!=0)
            return true;
        else
            return false;
    }
    
    
    
    boolean primo(int n){
       int numDivisores = 0;
       
       for(int i=1; i<n; i++)
           if(n%i==0)
               numDivisores++;
       
        if(numDivisores == 1)
            return true;
        else
            return false;
    }
    
}
