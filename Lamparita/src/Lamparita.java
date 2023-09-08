public class Lamparita {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a programar una lamparita! ");
        Lamparita pepe = new Lamparita();
        pepe.encender();
        System.out.println(pepe.encendida);
    }

    public boolean encendida = false;

    public void encender(){
        encendida = true;
    }

    public void apagar(){
        encendida = false;
    }


}


