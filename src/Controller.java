public class Controller <T extends Model> {
    T model;
    View view;

    public Controller(T model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int choice;
        double result = 0;
        Logs log = new Logs();
        String txt = "";

        do {
            view.viewMenu();
            choice = view.getValue("Выберете действие: ");

            switch (choice) {

                case 1: {
                    MultiplyFunction model = new MultiplyFunction();
                    double a = view.getValue("Введите первое число: ");
                    model.setNum1(a);
                    double b = view.getValue("Введите второе число: ");
                    model.setNum2(b);
                    result = model.result();
                    txt = "Result Multiply " + log.getExpression(a, b, result, choice);
                    System.out.println("Результат: " + result + "\n");
                    break;
                }
                case 2: {
                    DivisionFunction model = new DivisionFunction();
                    double a = view.getValue("Введите первое число: ");
                    model.setNum1(a);
                    double b = view.getValue("Введите второе число: ");
                    model.setNum2(b);
                    result = model.result();
                    txt = "Result Division  " + log.getExpression(a, b, result, choice);
                    System.out.println("Результат: " + result + "\n" + '\n');
                    break;
                }
                case 3: {
                    SumFunction model = new SumFunction();
                    double a = view.getValue("Введите первое число: ");
                    model.setNum1(a);
                    double b = view.getValue("Введите второе число: ");
                    model.setNum2(b);
                    result = model.result();
                    txt = "Result Sum " + log.getExpression(a, b, result, choice);
                    System.out.println("Результат: " + result + "\n");
                    break;
                }
                case 4: {
                    SubstractionFunction model = new SubstractionFunction();
                    double a = view.getValue("Введите первое число: ");
                    model.setNum1(a);
                    double b = view.getValue("Введите второе число: ");
                    model.setNum2(b);
                    result = model.result();
                    txt = "Result Substraction " + log.getExpression(a, b, result, choice);
                    System.out.println("Результат: " + result + "\n");
                    break;
                }
                
                case 0: {
                    System.out.println("Возвращайтесь, когда понадобится!");
                    txt = "Закончил работу";
                    break;
                }
                default: {
                    System.out.println("Такого действия нет!\n");
                    break;
                }
            }
            log.writeFile(txt, "Logs.txt");
            txt = "";
        } while (choice != 0);
    }
}