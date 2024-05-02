class Persona {

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
    }

    private String nombre;
    private int edad;
    private double altura;

    public void mostrarNombre() {
        System.out.println("mi nombre es " + this.nombre);
    }

    public void mostrarEdad() {
        System.out.println("tengo: " + this.edad + " años");
    }

    public void mostrarAltura() {
        System.out.println("mi altura " + this.altura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public int getEdad() {
        return edad;

    }

    public void setEdad(int edad) {

        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("no valido ");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {

        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("no valido ");
        }
    }

}