import java.util.ArrayList;

public class OutOfMemory {

    public static void main(String[] args) {
        OutOfMemory runTest = new OutOfMemory();
        System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        runTest.simpleTest();
    }

    private void simpleTest() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 999999999; i++) {
            arrayList.add(i);
        }
    }
}
