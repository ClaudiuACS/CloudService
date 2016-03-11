/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author claupc
 */
//clasa touch
class TOUCH extends Write implements Command{
    String name;
    double di;
    boolean read;
    boolean write;
    String created;
    Vector vc;
    Fisier fis;
    Directory parrent;
    
    ForPrint forPrint;
    
    public TOUCH(String nm, double dim, boolean r, boolean w, String c, Directory d, ForPrint fp) throws IOException{
        this.name = nm;
        this.di = dim;
        this.read = r;
        this.write = w;
        Permission p = new Permission(r, w);
        this.created = c;
        this.parrent = d;
        this.forPrint = fp;
        fis = new Fisier(nm, p, dim, created, parrent, forPrint);
    }
    
    @Override
    public void execute(Repository r) {
        if(super.canBeExecuted(r)){
            r.accept(this);
        }
        else{
            forPrint.toPrint += "Fail";
        }
    }

    @Override
    public void execute(Directory d) {
        d.addChild(fis);
       
    }

    @Override
    public void execute(Fisier fis) {
        
    }
    
}
