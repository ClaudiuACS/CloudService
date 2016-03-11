/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author claupc
 */
public class LSR extends Read implements Command{
    ForPrint fp;
    
    public LSR(ForPrint f){
        this.fp = f;
    }
    
    public void execute(Repository r) {
        if(super.canBeExecuted(r)){
            Directory d = (Directory)r;
            for(int i = 0; i < d.size; i++){
                if(d.al.get(i) instanceof Directory){
                    this.execute((Directory)d.al.get(i));
                    this.execute((Repository)d.al.get(i));
                }
                else
                    if(d.al.get(i) instanceof Fisier){
                        this.execute((Fisier)d.al.get(i));
                    }
                
            }
        }
    }
    

    @Override
    public void execute(Directory d) {
        String str = new String();
        str += "D: " + d.name + "\n";
        this.fp.toPrint += str;
    }

    @Override
    public void execute(Fisier fis) {
        String str = new String();
        str += "F: " + fis.name + "\n";
        this.fp.toPrint += str;
    }
    
}