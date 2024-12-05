import java.util.UUID;

public class DatosBoleto {

    private String IDboleto;
    private int numeroAsiento;
    private int pasilloAbordo;

    public DatosBoleto() {
        this.IDboleto = UUID.randomUUID().toString();
        this.numeroAsiento = (int) ((Math.random() * 99) + 1);
        this.pasilloAbordo = (int) ((Math.random() * 99) + 1);
    }

    public String getID() {
        return IDboleto;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public int getPasilloAbordo() {
        return pasilloAbordo;
    }

    public void mostrarDetalles() {
        System.out.println("\n---- Detalles del Boleto ----");
        System.out.println("ID del boleto: " + getID());
        System.out.println("Número de asiento: " + getNumeroAsiento());
        System.out.println("Pasillo de abordo: " + getPasilloAbordo());
    }
}
