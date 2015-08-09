import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FractionDriver {
    public static void main(String[] args) {
        int[] n = {3,5,7};
        int[] d = {9,7,5};
        for (int j = 0; j < 3; j++) {
            Fraction frac = new Fraction(n[j], d[j]);
            try {
                FileOutputStream oFile = new FileOutputStream("SerialF.dat");
                ObjectOutputStream output = new ObjectOutputStream(oFile);
                output.writeObject(frac);
                output.close();
                oFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
