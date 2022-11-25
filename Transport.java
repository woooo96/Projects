package sparta.exam;

public class Transport {
    public static int count=0;
    int transNum=1000;
    int gas = 100;
    int speed = 0;
    int maxPeople;
    int people;
    int defaultFare;
    String status;

    Transport () {
        count++;
        this.transNum += count;
        }

    public void addgas(int gas) {
        this.gas += gas;
        if (this.gas > 10) {
            System.out.println("주유량 = "+this.gas);
        } else {
            this.status="차고지행";
        }
    }

    public void speedChange(int speed) {
        this.speed += speed;
        System.out.println("속도 = " + this.speed);
    }



}
