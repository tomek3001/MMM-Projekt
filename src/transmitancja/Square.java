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
public class Square {
    
    
    boolean direction;
    int numberOfSteps;
    double y = 0;
    List<Double> jakasNazwa2 = new ArrayList<>();
    public Square(int dane) {
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
    
    public void generateSquare(){
        double x = 0 ;
        for(double i = 0; i < numberOfSteps; i++){
            if( (Math.floor( i / 50.0 ) ) % 2 == 0){
                direction = true;
            }
            else if( (Math.floor( i / 50.0 ) ) % 2 == 1 ){
                direction = false;
            }
            if(direction){
                x = 1;               //Na razie moga byc tylko dwa przebiegi sinusoidalne. wynika to z dzielenia przez 360 i numberOfStepsmax = 360                            
            }
            else {
                x = -1;
            }
            jakasNazwa2.add( x );
            System.out.println(jakasNazwa2.get((int)i) + " jest wartością " + (i+1)+  " elementu ");
        }
    }
    public void squareTransformation(){
        for(int i = 0; i < numberOfSteps - 1; i++){
            System.out.println(y + "      "+ i );    
            y = y + (y + jakasNazwa2.get(i))*0.1;
        }
    }
}
