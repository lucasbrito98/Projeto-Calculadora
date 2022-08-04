package calculadora.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Brito
 */
public class CalculadoraController {

     public static Float soma (Float n1, Float n2){
    return (n1+n2);
   
     
}


public static Float subtracao (Float n1, Float n2){

return (n1-n2);
    }


   public static Float multiplicacao (Float n1,Float n2){
       

        return (n1*n2);
}


   public static  Float divisao (Float n1, Float n2){
       if (n2==0){
           return (float)0;
       } else {
       
       return (n1 / n2);
   }
}
}
    

    




