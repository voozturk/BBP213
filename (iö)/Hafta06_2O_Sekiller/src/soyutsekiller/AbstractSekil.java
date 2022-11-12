package soyutsekiller;

/**
 *
 * @author vozturk
 */
public abstract class AbstractSekil {
    protected final String sekilAdi;
    
    public AbstractSekil(String sekilAdi){
        this.sekilAdi = sekilAdi;
    }
    
    public abstract double alanHesapla();
    public abstract double cevreHesapla();
    
    public String getSekilAdi(){
        return sekilAdi;        
    }
    
    
}
