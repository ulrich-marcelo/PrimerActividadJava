public class Lamparita {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a programar una lamparita! ");
        Lamparita pepe = new Lamparita();
        pepe.estaEncendida();
        pepe.encender();
        pepe.estaEncendida();
        pepe.apagar();
        pepe.estaEncendida();
    }

    private boolean encendida = false;

    public void encender(){
        encendida = true;
    }

    public void apagar(){
        encendida = false;
    }

    public void estaEncendida(){
        System.out.println(encendida); 
    }


}


