/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author claupc
 */
public class MyInvalidPathException extends Exception{
    
    public MyInvalidPathException(String st){
        st = "Invalid path";
    }
    
    public String toString(){
        String res = new String();
        res += "Invalid path";
        return res;
    }
    
}
