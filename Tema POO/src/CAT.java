/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author claupc
 */
public class CAT extends Read implements Command{
    String name;
    ForPrint fp;
    
    public CAT(String n, ForPrint f){
        this.name = n;
        this.fp = f;
    }

    @Override
    public void execute(Repository r) {
         if(super.canBeExecuted(r)){
            r.accept(this);
        }
        else{
            this.fp.toPrint += "Fail";
        }
    }

    @Override
    public void execute(Directory d) {
        for(int i = 0; i < d.size; i++){
            //daca nu il gaseste, ca sa arunc exceptie in main
            if(i == d.size){
                this.fp.toPrint = "Not Found";
            }
            if(d.al.get(i) instanceof Fisier){
                Fisier fis = (Fisier)d.al.get(i);
                if(fis.name.equals(this.name)){
                    this.fp.toPrint += fis.toString();
                    break;
                }
            }
        }
    }

    @Override
    public void execute(Fisier fis) {
    
    }
}
