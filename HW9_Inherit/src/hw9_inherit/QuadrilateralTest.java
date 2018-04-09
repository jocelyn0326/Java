
package hw9_inherit;

public class QuadrilateralTest {

    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);
        System.out.println("Coordinates of Quadrilateral are:");
        System.out.println(quadrilateral);
        Rectangle rectangle = new Rectangle(17.0, 14.0, 13.0, 14.0);
        System.out.println("Coordinates of Rectangle are:");
        System.out.println(rectangle);
    }

}
