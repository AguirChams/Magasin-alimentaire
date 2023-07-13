public class Client {
    private String id;
    private String nom;
    private String prenom;
    private String adresse;

    public Client(String id, String nom, String prenom, String adresse, String telephone, String email) {
        this.setId(id);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAdresse(adresse);
        this.setTelephone(telephone);
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    private String telephone;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}