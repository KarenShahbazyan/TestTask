import Model.Pleane;
import Service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();
        Pleane p1 = service.parametrs();
        Pleane p2 = service.parametrs();
        Pleane[] pleanes = {p1, p2,};
        System.out.println("++++++++++++++++");
            service.Pleanes(pleanes);
        System.out.println("++++++++++++");

    }
}
