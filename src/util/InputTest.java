package util;

public class InputTest {
    public static void main(String[] args) {
        Input scan = new Input();
        System.out.println(scan.getString());
        System.out.println(scan.yesNo());
        System.out.println(scan.getInt(13,88));
        System.out.println(scan.getInt());
        System.out.println(scan.getDouble(1.56565, 88.9999));
        System.out.println(scan.getDouble());
    }
}