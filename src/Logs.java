import java.io.FileWriter;
import java.io.IOException;

public class Logs {

    public String getExpression(double num1, double num2, double result, int operation) {
        String oper = "";
        if (operation == 1) {
            oper = " + ";
        } else if (operation == 2) {
            oper = " - ";
        } else if (operation == 3) {
            oper = " * ";
        } else {
            oper = " / ";
        }
        return String.format("%s%s%s = %s", num1, oper, num2, result);
    }

    public void writeFile(String expression, String nameFile) {
        try {
            FileWriter fileWriter = new FileWriter(nameFile, true);
            fileWriter.write(expression + ";");
            fileWriter.append("\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}