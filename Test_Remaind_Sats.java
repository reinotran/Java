import javax.swing.*;

/**
 * Created by reinotran on 2015-11-10.
 */
public class Test_Remaind_Sats {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Mata in x: ");
        int x = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("Mata in y: ");
        int y = Integer.parseInt(s);
        int z = x%y;
         System.out.println("z: "+z);

    }
}
