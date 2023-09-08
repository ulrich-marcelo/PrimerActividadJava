public class Lamparita {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a programar una lamparita! ");
        Lamparita pepe = new Lamparita();
        System.out.println(pepe.estaEncendida());
        pepe.encender();
        System.out.println(pepe.estaEncendida());
        pepe.apagar();
        System.out.println(pepe.estaEncendida());
    }

    private boolean encendida = false;

    public void encender(){
        encendida = true;
    }

    public void apagar(){
        encendida = false;
    }

    public boolean estaEncendida(){
         return encendida;
    }

    public void parpadear(){
        System.out.println("Aca parpadearia");
    }


}


