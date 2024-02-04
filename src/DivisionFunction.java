public class DivisionFunction extends Model {
    @Override
    public double result() {
        return num1 / num2;
    }

    @Override
    public void setNum1(double value) {
        super.num1 = value;
    }

    @Override
    public void setNum2(double value) {
        super.num2 = value;
    }
}