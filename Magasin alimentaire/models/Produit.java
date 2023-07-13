public class Produit {
    private String id;
    private String nom;
    private Float prix;
    private int stock;
    private Boolean promotion = false;
    private int remise = 0;

    public Produit(String id, String nom, Float prix, int stock, Boolean promotion, int remise) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
        this.promotion = promotion;
        this.remise = remise;
    }

    public String getNom() {
        return nom;
    }

    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        this.remise = remise;
    }

    public Boolean getPromotion() {
        return promotion;
    }

    public void setPromotion(Boolean promotion) {
        this.promotion = promotion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}