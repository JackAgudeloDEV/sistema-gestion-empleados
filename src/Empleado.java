public class Empleado {

    private String nombre;
    private String puesto;
    private double salario;

    // constructor
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario (double porcentaje){
            if (porcentaje <= 0){
                System.out.println("el aumento debe ser mayor a cero");
            return;
            }

            double aumento =this.salario *(porcentaje/100);
            this.salario +=aumento;

            System.out.println("el nuevo salario de: "+this.getNombre()+" es de: $"+this.salario);
    }

















}
