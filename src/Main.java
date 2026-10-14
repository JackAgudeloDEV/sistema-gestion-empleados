//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empresa miEmpresa = new Empresa("Tech Solutions");

        Empleado emp1 = new Empleado("jack agudelo", "dev junior", 2500);
        Empleado emp2 = new Empleado("miguel echavarria", "dev senior", 2000);

        System.out.println("--- Contrataciones ---");
        miEmpresa.contratarEmpleado(emp1);
        miEmpresa.contratarEmpleado(emp2);


        miEmpresa.listarPlanilla();

        System.out.println(" aumento de sueldo ");
        emp1.aumentarSalario(10);

        System.out.println("--- Gasto total de nomina ---");
        double totalNom = miEmpresa.carcularGastoTotalNomina();
        System.out.println("el gasto total de nomina es de: $"+totalNom);




    }
}