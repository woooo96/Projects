package sparta.exam;

public class BusExam {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        bus1.getOnBus(2);
        bus1.addgas(-50);
        System.out.println("");
        bus1.endStatus();
        bus1.addgas(10);
        bus1.checkBus();
        bus1.startStatus();
        bus1.getOnBus(45);
        bus1.getOnBus(5);
        bus1.addgas(-55);
        bus1.busStatus();

    }
}
