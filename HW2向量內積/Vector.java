
public class Vector {

    public static void main(String args[]) {
        double x[] = {0, 1};
        double y[] = {1, 0};

        System.out.println("內積值為：" + innerProduct(x, y));
        System.out.println("cosine為：" + cosine(x, y));
        System.out.println("角度為：" + Math.acos(cosine(x, y)));
    }

    static double innerProduct(double[] x, double[] y) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] * y[i];
        }
        return sum;
    }

    static double cosine(double[] x, double[] y) {
        return innerProduct(x, y) / (Math.sqrt(innerProduct(x, x)) * Math.sqrt(innerProduct(y, y)));
    }
    
}
