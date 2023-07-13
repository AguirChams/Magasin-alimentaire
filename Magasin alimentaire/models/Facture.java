public class Facture {
    private int numero;
    private String date;
    private String id_client;
    private String nom_client;
    private String prenom_client;
    private String adresse;
    private String[] produits;
    private int[] quantites;
    private Float[] prix;
    private Float total;

    public Facture(int numero, String date, String id_client, String nom_client, String prenom_client, String adresse,
            String[] produits, int[] quantites, Float[] prix, Float total) {
        this.numero = numero;
        this.date = date;
        this.id_client = id_client;
        this.nom_client = nom_client;
        this.prenom_client = prenom_client;
        this.adresse = adresse;
        this.produits = produits;
        this.quantites = quantites;
        this.prix = prix;
        this.total = total;
    }

    public int getNumero() {
        return numero;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float[] getPrix() {
        return prix;
    }

    public void setPrix(Float[] prix) {
        this.prix = prix;
    }

    public int[] getQuantites() {
        return quantites;
    }

    public void setQuantites(int[] quantites) {
        this.quantites = quantites;
    }

    public String[] getProduits() {
        return produits;
    }

    public void setProduits(String[] produits) {
        this.produits = produits;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPrenom_client() {
        return prenom_client;
    }

    public void setPrenom_client(String prenom_client) {
        this.prenom_client = prenom_client;
    }

    public String getId_client() {
        return id_client;
    }

    public void setId_client(String id_client) {
        this.id_client = id_client;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}