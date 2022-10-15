/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasitornek_1b;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import tasitornek_1b.Sofor.Ehliyet;

/**
 *
 * @author vozturk
 */
public class Tasit {
    private int yolcuKapasitesi;
    private String marka;   
    private String model;
    
    private EnumSet<Sofor.Ehliyet> ehliyetler;    
    private Sofor surucu;    
    private List<Yolcu> yolcular;
    private boolean calisiyor;
    
    public Tasit(
            int yolcuKapasitesi, 
            String marka, 
            String model,
            Sofor.Ehliyet ehliyet,  
            Sofor.Ehliyet ... ehliyetler){
        
        this.yolcuKapasitesi = yolcuKapasitesi; 
        this.marka = marka;
        this.model = model;
        
        this.ehliyetler = EnumSet.noneOf(Ehliyet.class);
        
        this.ehliyetler.add(ehliyet);
        for(int i=0; i<ehliyetler.length; i++){
            this.ehliyetler.add(ehliyetler[i]);
        }
        
        this.calisiyor =false;   
        this.surucu=null;
        this.yolcular = new ArrayList<>();
    }
    
    public Tasit(Tasit t){
        this(t.yolcuKapasitesi, t.marka, t.model, (Ehliyet)t.ehliyetler.toArray()[0], (Ehliyet[])t.ehliyetler.toArray());
    }

    
    
    /**
     * @return the marka
     */
    public String getMarka() {
        return marka;
    }

    /**
     * @return the ehliyetler
     */
    public EnumSet<Sofor.Ehliyet> getEhliyetler() {
        return ehliyetler;
    }

    /**
     * @return the surucu
     */
    public Sofor getSurucu() {
        return surucu;
    }

    /**
     * @param surucu the surucu to set
     */
    public boolean setSurucu(Sofor surucu) {        
        Iterator iterator = this.ehliyetler.iterator();
        boolean surucuAtandi=false;
        while(iterator.hasNext()){
            Ehliyet ehliyet = (Ehliyet)iterator.next();
            if(ehliyet.equals(surucu.getEhliyet())){
                if(this.surucu !=null){
                    this.surucu.setSurulenArac(null);
                }   
                this.surucu = surucu;
                surucu.setSurulenArac(this);
                surucuAtandi=true;
            }
        }
        System.out.println(
                "Sütücü aracı "
                +(surucuAtandi?"sürebilir":"süremez")        
                + " = "+surucu.toString());
        return surucuAtandi;        
    }

    /**
     * @return the yolcular
     */
    public List<Yolcu> getYolcular() {
        return yolcular;
    }

    /**
     * @return the calisiyor
     */
    public boolean isCalisiyor() {
        return calisiyor;
    }

    /**
     * @return the yolcuKapasitesi
     */
    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }
    
    
    public void yolcuEkle(Yolcu yolcu){
        if(this.yolcular.size() < this.yolcuKapasitesi){
            this.yolcular.add(yolcu);
            System.out.println(this.toString()+" aracına yolcu eklendi. Eklenen yolcu = "+yolcu.toString());
        }
    }
    
    public boolean yolcuIndir(Yolcu indirilecekYolcu){
        return yolcular.remove(indirilecekYolcu);
    }
    
    public Yolcu yolcuIndir(int indirilecekYolcuNo){
        return yolcular.remove(indirilecekYolcuNo);
    }
    

    @Override
    public String toString(){
        return this.marka+" "+this.model;
        
    }
    
    
    
    
}
