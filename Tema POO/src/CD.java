/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author claupc
 */
class CD extends Read implements Command{
    String nameDir;
    
    public CD(String name){
        this.nameDir = name;
    }
    
    @Override
    public void execute(Repository r) {
        if(super.canBeExecuted(r)){
            r.accept(this);
        }
        else{
            System.out.println("FAIL");
        }
    }
    
    @Override
    public void execute(Directory d) {
        
        for(int i = 0; i < d.size; i++){
            if(d.al.get(i) instanceof Directory){
                //formez director din fiecare director din arraylist
                Directory dir = (Directory)d.al.get(i);
                //daca numele este cel cautat
                if(dir.name.equals(this.nameDir)){
                    //salvez in newDirector
                    d.newDirector = dir;
                    break;
                }
            }
        }
    }

    @Override
    public void execute(Fisier fis) {
        
    }
   
}
