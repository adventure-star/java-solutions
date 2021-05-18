public class RectTest {

    public static void main(String []args) {

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.perimeter());

        Rectangle rectangle2 = new Rectangle(100, 200);
        System.out.println(rectangle2.toString());
        System.out.println(rectangle2.area());
        System.out.println(rectangle2.perimeter());

    }
}
