/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transmitancja;

import java.util.ArrayList;
import java.util.List;
import java.math.RoundingMode;
/**
 *
 * @author Jakub
 */
public class Triangle {
    
    
    boolean direction;
    int numberOfSteps;
    double y = 0;
    List<Double> jakasNazwa3 = new ArrayList<>();
     List<Double> jakasNazwa3T = new ArrayList<>(); 
     double maxValue = 1.0;
    public Triangle(int dane) {
    numberOfSteps = dane;
    }   

    public boolean howManySteps(){
        if(numberOfSteps > 360){
            System.out.println("Nie można przyjąć tyle kroków");
            return false;
        }
        else{
            System.out.println("Wybrałeś: " + numberOfSteps + " kroków");
            return true;
        }
    }
    
    public void generateTriangle(){
        double x = 0 ;
        for(double a = 0; a < numberOfSteps; a++){
            double i = a + 25;       //żeby sygnał startował od 0, a nie od -1
            if( (Math.floor( i / 50.0 ) ) % 2 == 0){
                direction = true;
            }
            else if( (Math.floor( i / 50.0 ) ) % 2 == 1 ){
                direction = false;
            }
            if(direction){
                x = 2 * ( i % 50 );               //Na razie moga byc tylko dwa przebiegi sinusoidalne. wynika to z dzielenia przez 360 i numberOfStepsmax = 360                            
            }
            else {
                x = 2 * ( 50 - ( i % 50 ) );
            }
            jakasNazwa3.add( x / 50 - 1 );
      //      System.out.println(jakasNazwa2.get((int)a) + " jest wartością " + (a+1)+  " elementu ");
        }
    }
public void triangleTransformation(double a0, double a1,double b0,double b1, double b2, int delay){
        
     for(int j = 0 ; j <= delay;j++){
            jakasNazwa3T.add(0.0);
        }
    
    for(int i = 0; i < numberOfSteps - 1; i++){
        //    System.out.println(y + "      "+ i );    
            System.out.println(a0 + " --- " + a1+ " --- " + b0 + " --- " + b1 + " --- " + b2);
            y = (-b1-b0)/b2*y+(a0+a1)/b2 *jakasNazwa3.get(i);
            jakasNazwa3T.add(y);
            if(maxValue < Math.abs(y))
                maxValue = Math.abs(y);
        }
    }

protected double scaleToBiggest(){
        System.out.println("Zobaczymy co wypluje " + maxValue);
        return maxValue;
    }
}
