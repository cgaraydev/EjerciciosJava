package ejerciciosotros;

public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    public static int numeroPersonas = 0;

    public Persona() {
        this.id = ++numeroPersonas;
    }

    public Persona(String nombre, String tel, String email) {
        this(); //llama al constructor vacio de la clase ejerciciosotros.Persona
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ejerciciosotros.Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona p = new Persona("Camil", "123456789", "asdas@a.com");
        Persona p2 = new Persona("asdasd", "423423", "asdas@a.com");
        Persona p3 = new Persona("Camasdasdil", "42342", "asdasdasd@a.com");
        System.out.println(p.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
