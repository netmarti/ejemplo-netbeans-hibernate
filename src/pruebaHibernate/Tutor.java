package pruebaHibernate;

public class Tutor extends Trabajador {

    private String areaEspecializacion;
    private String gradoAcademico;

    public Tutor() {
    }

    public Tutor(String nombre, String apellido, String areaEspecializacion, String gradoAcademico) {
        super(nombre, apellido);
        this.areaEspecializacion = areaEspecializacion;
        this.gradoAcademico = gradoAcademico;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

}
