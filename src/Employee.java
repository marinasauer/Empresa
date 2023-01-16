public class Employee {
    private String nome;
    private String sobrenome;
    private double salario;


    public Employee(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salario>0){
         this.salario = salario;
        }
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void SalarioAnual(){
        System.out.printf("Salário anual de %s %s é %.2f%n",this.getNome(),this.getSobrenome(),salario*12);
    }

    public void aumentoSalarial(){
        System.out.printf("Novo salário de %s é R$%.2f%n",this.getNome(),salario*1.1);
    }
}

