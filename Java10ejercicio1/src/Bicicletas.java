public class Bicicletas {
    
    // creamos atributos:

    private String marca;
    private String modelo;
    private double velocidadMax;
    private boolean marchas;

    // constructor:

    public Bicicletas(String marca, String modelo, double velocidadMax, boolean marchas) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
        this.marchas = marchas;
    }

    // constructor vacio:

    public Bicicletas(){

    }

    // creación de GETTERS y de SETTERS:

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadMax() {
        return this.velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public boolean isMarchas() {
        return this.marchas;
    }

    public boolean getMarchas() {
        return this.marchas;
    }

    public void setMarchas(boolean marchas) {
        this.marchas = marchas;
    }

    // creación de toString():

    @Override
    public String toString() {
        String marcha = "";
        if(marchas){
            marcha = ", tiene marchas";
        } else {
            marcha = ", no tiene marchas";
        }
        return 
            "Marca:" + getMarca() + "; " +
            "Modelo:" + getModelo() + "; " +
            "Velocidad máxima:" + getVelocidadMax() + "; " +
            "Marchas:" + marcha;
    }

    // EXTRA: añadir métodos extra que trabajen sobre el objeto:

    public void claxon(boolean claxon){
        if (claxon){
            System.out.println("Tiene claxon");
        } else {
            System.out.println("No tiene claxon");
        }
    }

    public void tipoBicicleta(){
        if (marca.equals("Specialized")){
            System.out.println("La bicicleta es de carretera.");
        } else {
            System.out.println("La bicicleta es de montaña");
        }
    }


}
