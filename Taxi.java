package sparta.exam;

public class Taxi extends Transport{
    int driveFare = 1000;
    int defaultDrive = 1;
    String destination;
    int destDrive;
    int defaultdrive=1;
    int fare;

    public Taxi() {
        this.maxPeople=4;
        this.defaultFare=3000;
        this.status="일반";

        System.out.println("택시"+count+"번호 : " + this.transNum);
        System.out.println("주유량 = " + this.gas);
        System.out.println("상태 = " + this.status);
    }

    public void checkTaxi() {
        if (this.gas==0) {
            this.status = "운행불가";
            System.out.println("상태 = "+this.status);
        }
        System.out.println("주유량 = "+this.gas);
        System.out.println("누적요금 = "+this.fare);

    }

    public void getOnTaxi(int people, String destination, int destDrive) {
        if (this.status.equals("일반")) {
            if (maxPeople >= people) {
                this.people = people;
                this.destination = destination;
                this.destDrive = destDrive;
                this.status = "운행 중";

                //(목적지까지거리-기본거리)*(거리당 추가요금)+기본요금;
                int sum = (destDrive - defaultdrive) * driveFare + defaultFare;
                this.fare+=sum;

                System.out.println("탑승 승객 수 = " + this.people);
                System.out.println("잔여 승객 수 = " + (maxPeople - this.people));
                System.out.println("기본 요금 확인 = " + this.defaultFare);
                System.out.println("목적지 = " + this.destination);
                System.out.println("목적지까지 거리 = " + this.destDrive);
                System.out.println("지불할 요금 = " + sum);
                System.out.println("상태 = " + this.status);
            } else {
                System.out.println("최대 승객 수 초과");
            }
        } else {
            this.status = "탑승 불가";
            System.out.println(this.status);
        }
    }

    public void bill () {
        this.status="일반";
    }


    @Override
    public void addgas(int gas) {
        super.addgas(gas);
        System.out.println("주유량 = "+this.gas);
        System.out.println("누적금액 = "+this.fare);
    }
}
