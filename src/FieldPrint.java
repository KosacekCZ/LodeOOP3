public class FieldPrint {

    public void printField(String[][] battlefield) {
        FieldBuild fb = new FieldBuild();
        String pole = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                pole = pole + fb.battlefield[j][i] + "  ";
            }
            System.out.println(pole);
            pole = "";
        }
    }

    public void printField2() {
        FieldBuild fb = new FieldBuild();
        String pole = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                pole = pole + fb.battlefield2[j][i] + "  ";
            }
            System.out.println(pole);
            pole = "";
        }

    }

    public void printField3() {
        FieldBuild fb = new FieldBuild();
        String pole = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                pole = pole + fb.battlefield3[j][i] + "  ";
            }
            System.out.println(pole);
            pole = "";
        }
    }
}

