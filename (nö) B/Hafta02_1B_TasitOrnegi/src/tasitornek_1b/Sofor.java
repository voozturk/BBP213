
package tasitornek_1b;

/**
 *
 * @author vozturk
 */
public class Sofor extends Kisi{
    private Ehliyet ehliyet;
    
    private Tasit surulenArac ;
    
    enum Ehliyet{
        A1, A2, B, C, D, E
    };  

    public Sofor(Kisi k, Ehliyet ehliyet){
        super(k);
        this.ehliyet = ehliyet;  
        
    }

    // attribute
    // varsa enum 
    // constructor
    // getter setter
    // methods

    public Ehliyet getEhliyet() {
        return this.ehliyet;
    }

    public void setSurulenArac(Tasit surulenArac) {
        this.surulenArac = surulenArac;
    }
    
    public Tasit getSurulenArac(){
        return this.surulenArac;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+" (Ehliyeti: "+this.ehliyet+")";
    }
    
    
    
    


}
