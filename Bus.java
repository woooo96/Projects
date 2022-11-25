package sparta.exam;

public class Bus extends Transport{
    public Bus () {
        this.maxPeople=30;
        this.defaultFare=1000;
        this.status="운행";

        System.out.println("버스"+count+"번호 : " + this.transNum);
        System.out.println("주유량 = " + this.gas);
        System.out.println("상태 = " + this.status);
    }

    public void endStatus() {
        this.status="차고지행";
    }
    public void startStatus() {
        this.status="운행중";
    }

    boolean busStatus() {
        if (this.gas < 10) {
            this.status = "차고지행";
            System.out.println("현재 주유량 = " + this.gas);
            System.out.println("주유량이 부족합니다. 주유가 필요합니다.");
            System.out.println("현재 버스 상태 = "+this.status);
            return false;
        } else {
            this.status = "운행";
            System.out.println("현재 주유량 = " + this.gas);
            System.out.println("현재 버스 상태 = " + this.status);
            return true;
        }
    }


    public void getOnBus(int people) {
        if (this.people+people <= maxPeople) {
            if (busStatus()) {
                this.people+=people;
                System.out.println("탑승 승객 인원 = "+this.people);
                System.out.println("잔여 승객 인원 = "+(this.maxPeople-this.people));
                System.out.println("요금 = "+(people*defaultFare));
            } else {
                System.out.println("탑승이 불가능합니다.");
            }
        } else {
            System.out.println("정원 초과입니다. 다음버스를 이용해 주세요.");
        }
    }

    public void checkBus() {
        if (this.gas < 10) {
            this.status = "차고지행";
            System.out.println("주유 필요");
        }
        System.out.println("주유량 : "+this.gas);
        System.out.println("상태 : "+this.status);
    }






}
