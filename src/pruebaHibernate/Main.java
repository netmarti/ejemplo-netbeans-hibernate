package pruebaHibernate;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


public class Main {

    public static void main(String[] args) {

        // Creamos los objetos
        Direccion direccion = new Direccion("Artificios", 55, null, 01210);
        Curso matematicas = new Curso("Matematicas");
        Curso fisica = new Curso("Fisica");
        List listaCursos = new ArrayList();
        listaCursos.add(matematicas);
        listaCursos.add(fisica);
        Tutor tutor = new Tutor("Netz","Romero","Computacion","Maestria");
        Alumno alumno = new Alumno("Ivan", "Rodriguez", direccion, listaCursos, tutor);

        // Guardamos el objeto alumno, automaticamente se guardan los objetos
        // asociados
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(alumno);
        session.getTransaction().commit();

        // Recuperamos el objeto guardado

        String consulta = "from Alumno where nombre='Ivan'";
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Alumno alumnoRecuperado = (Alumno)session.createQuery(consulta).list().get(0);
        System.out.println("Se recupero el alumno: "+alumno.getNombre());
        Direccion direccionRecuperada = alumnoRecuperado.getDireccion();
        System.out.println("Se recupero la direccion: "+direccionRecuperada.getCalle());
        List listaCursosRecuperada = alumnoRecuperado.getCursosInscritos();
        Curso matematicasRecuperado = (Curso)listaCursosRecuperada.get(0);
        System.out.println("Se recupero el curso: "+matematicasRecuperado.getNombre());
        Curso fisicaRecuperado = (Curso)listaCursosRecuperada.get(1);
        System.out.println("Se recupero el curso: "+fisicaRecuperado.getNombre());
        Tutor tutorRecuperado = alumnoRecuperado.getTutor();
        System.out.println("Se recupero el tutor: "+tutorRecuperado.getNombre());
    }

}
