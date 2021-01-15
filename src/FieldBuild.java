public class FieldBuild {
    public int size = 10;
    FieldType ft = new FieldType();
    public String[][] battlefield = new String[size][size];
    public String[][] battlefield2 = new String[size][size];
    public String[][] battlefield3 = new String[size][size];

    public void buildField() {

        // construct pole 1
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                battlefield[j][i] = ft.water;
            }
        }

        // construct pole 2
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                battlefield2[j][i] = ft.water;
            }
        }

        // viditelné pole AI
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                battlefield3[j][i] = ft.water;
            }
        }
        System.out.println("Fields constructed.");
    }

    public FieldBuild() {
    }
}
