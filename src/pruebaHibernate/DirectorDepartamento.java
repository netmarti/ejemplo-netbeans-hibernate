package pruebaHibernate;

public class DirectorDepartamento extends Trabajador {

    private String departamento;
    private Double bonoProductividad;

    public DirectorDepartamento() {
    }

    public DirectorDepartamento(String nombre, String apellido, String departamento, Double bonoProductividad) {
        super(nombre, apellido);
        this.departamento = departamento;
        this.bonoProductividad = bonoProductividad;
    }

    public Double getBonoProductividad() {
        return bonoProductividad;
    }

    public void setBonoProductividad(Double bonoProductividad) {
        this.bonoProductividad = bonoProductividad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
