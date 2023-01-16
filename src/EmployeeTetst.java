public class EmployeeTetst{

    public static void main(String[] args) {
        Employee empregado1 = new Employee("Marina", "Sauer",1300.00);
        Employee empregado2 = new Employee("Felipe","Sasse",5400.70);
        Employee empregado3 = new Employee("Ivania","Larios",5454.55);

       empregado1.SalarioAnual();
       empregado2.SalarioAnual();
       empregado3.SalarioAnual();

       empregado1.aumentoSalarial();
       empregado2.aumentoSalarial();
       empregado3.aumentoSalarial();

    }


}