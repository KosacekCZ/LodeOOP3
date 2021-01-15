import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FieldBuild fb = new FieldBuild();
        FieldPrint fp = new FieldPrint();

        fb.buildField();
        fp.printField(fb.battlefield);

    }
}
