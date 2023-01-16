import java.util.Scanner;

public class EmployeeTetst{

    public static void main(String[] args) {
        Employee empregado1 = new Employee("Marina", "Sauer",1000.00);
        Employee empregado2 = new Employee("Felipe","Sasse",5400.70);
        Employee empregado3 = new Employee("Ivania","Larios",5454.55);

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do funcionário:");
        empregado1.setNome(input.nextLine());

        System.out.println("Insira a porcentagem de aumento no salário: ");
        empregado1.setPorcentagemAumento(input.nextInt());



       empregado1.SalarioAnual();
       empregado2.SalarioAnual();
       empregado3.SalarioAnual();

       empregado1.aumentoSalarial();
       empregado2.aumentoSalarial();
       empregado3.aumentoSalarial();

    }


}