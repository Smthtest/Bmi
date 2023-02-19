public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 60;
        double height = 1.57;
        double bmi = service.calculate(weight, height);
        System.out.println("Ваш ИМТ равен:");
        System.out.println(bmi);


    }
}
