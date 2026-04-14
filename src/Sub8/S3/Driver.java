package Sub8.S3;

public class Driver {
    private sonata Sonata;
    private K5 k5;


    public void setsonatacar(sonata Sonata) {
        this.Sonata = Sonata;
    }

    public void setK5Car(K5 k5) {
        this.k5 = k5;

    }

    public void drive(){
        System.out.println("운전을 시작합니다");
        if(Sonata!=null){
            sonata.engineOn();
            sonata.accelerate();
            sonata.engineoff();
        }
        if(k5!=null){
            k5.engineon();;
            k5.accelerate();
            k5.engineoff();
        }

    }
}
