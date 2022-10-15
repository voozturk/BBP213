package bankaornek_1a;

/**
 *
 * @author vozturk
 */
public class Hesap {

    enum ParaBirimi {
        TRY("₺"), USD("$"), EUR("€");

        private String sembol;

        private ParaBirimi(String sembol) {
            this.sembol = sembol;
        }

        public String getSembol() {
            return this.sembol;
        }

    };

    enum Tip {
        BIREYSEL, KURUMSAL;
    };

    Tip tip;
    private Banka banka;
    ParaBirimi paraBirimi;
    private Musteri musteri;
    double paraMiktari;

    public Hesap(Tip tip, ParaBirimi paraBirimi, double baslangicTutari) {
        this(tip, paraBirimi);
        this.paraYatir(baslangicTutari);
    }

    public Hesap(Tip tip, ParaBirimi paraBirimi) {
        this.tip = tip;
        this.paraBirimi = paraBirimi;
        this.paraMiktari = 0;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }
    
    public Musteri getMusteri(){
        return this.musteri;
    }

    public void setBanka(Banka banka) {
        this.banka = banka;
    }

    public void paraYatir(double miktar) {
        System.out.println("Hesaba " + miktar + paraBirimi.getSembol() + " para yatırıldı.");
        this.paraMiktari += miktar;
        System.out.println("Güncel hesap tutarı =  " + this.paraMiktari + paraBirimi.getSembol());
    }

    public void paraCek(double miktar) {
        if (this.paraMiktari >= miktar) {
            System.out.println("Hesaptan " + miktar + paraBirimi.getSembol() + " para çekildi ");
            this.paraMiktari -= miktar;
            System.out.println("Güncel hesap tutarı =  " + this.paraMiktari + paraBirimi.getSembol());
        } else {
            System.out.println("Tutar yeterli değil! Verilebilecek tutar = " + this.paraMiktari + this.paraBirimi.getSembol());
            this.paraMiktari = 0;
        }
    }

}
