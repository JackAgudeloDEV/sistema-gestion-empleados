import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombreEmpresa;
    private List<Empleado> empleados;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = new ArrayList<>();
    }


    public void contratarEmpleado (Empleado nEmpleado){
        this.empleados.add(nEmpleado);
        System.out.println("el empleado "+nEmpleado.getNombre()+" para el puesto de "+nEmpleado.getPuesto()+" con un salario de "+nEmpleado.getSalario()+" ha sido contratado");
    }

    public void listarPlanilla (){
        System.out.println("----- listado de empleados de la empresa "+this.nombreEmpresa+" -------");
            for (Empleado emp: this.empleados){
                System.out.println("nombre: "+emp.getNombre()+" puesto: "+emp.getPuesto()+" salario: "+emp.getSalario());
            }
    }

    public double carcularGastoTotalNomina(){
        double totalNomina = 0.0;
        for (Empleado emp: this.empleados){

            totalNomina += emp.getSalario();
        }
        return totalNomina;
    }


}
