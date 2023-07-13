public class Commande {
    private int numero;
    private String date;
    private String id_produit;

    public Commande(int numero, String date, String id_produit, String id_client, int quantite) {
        this.setNumero(numero);
        this.date = date;
        this.id_produit = id_produit;
        this.setId_client(id_client);
        this.setQuantite(quantite);
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getId_client() {
        return id_client;
    }

    public void setId_client(String id_client) {
        this.id_client = id_client;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private String id_client;
    private int quantite;

    public String getDate() {
        return date;
    }

    public String getId_produit() {
        return id_produit;
    }

    public void setId_produit(String id_produit) {
        this.id_produit = id_produit;
    }

    public void setDate(String date) {
        this.date = date;
    }
}