/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author claupc
 */
public class Station extends StoreStation{ 
    double dimensiune;
    
    
    public Station(){
        this.dimensiune = 10000;
    }
    
    public void add(Repository d){
        
            super.store(d);
            
    }
    
    public void searchDir(Directory d){
        
        super.search(d);
    
    }
    
}
