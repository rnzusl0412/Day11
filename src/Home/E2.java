package Home;

class AA{
    public String x(){return "A.x";}
}
class BB extends AA{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
public class E2 {
    public static void main(String[] args) {
        AA obj = new BB();
        System.out.println(obj.x());
    }
}