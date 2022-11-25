package sparta.exam;

public class TaxiExam {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi();

        taxi1.getOnTaxi(2, "서울역", 1);
        taxi1.addgas(-80);
        taxi1.bill();
        taxi1.getOnTaxi(5,"서울역", 1);
        taxi1.getOnTaxi(3,"구로디지털단지역", 12);
        taxi1.addgas(-20);
        taxi1.checkTaxi();
    }
}
