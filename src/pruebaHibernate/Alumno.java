package pruebaHibernate;

import java.util.List;

public class Alumno {

    private Long numeroMatricula;
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private List cursosInscritos;
    private Tutor tutor;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, Direccion direccion, List cursosInscritos, Tutor tutor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.cursosInscritos = cursosInscritos;
        this.tutor = tutor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(List cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Long numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

}
