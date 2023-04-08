public class DataTypes {
    public static void main(String[] args) {
        // Numero entero (max. 10 numeros)
        int n = 1234567890;

        //Para diferenciarlo de Int colocar una L al final
        long nL = 12345678901L;

        //Numero grande en decimales
        double nD = 123.456;

        //Para diferenciarlo de Double colocar una F al final
        float nF = 123.456F;

        var salary = 1000; //int
        //pension 3%
        var pension = salary*0.03; //double
        var totalSalary = salary - pension; //double

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Anahí Salgado"; //string
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
