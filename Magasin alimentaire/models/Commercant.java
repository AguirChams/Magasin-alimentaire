public class Commercant extends Client {

    public Commercant(String id, String nom, String prenom, String adresse, String telephone, String email,
            String codeTVA) {
        super(id, nom, prenom, adresse, telephone, email);
        this.codeTVA = codeTVA;
    }

    private String codeTVA;

    public String getcodeTVA() {
        return codeTVA;
    }

    public void setcodeTVA(String codeTVA) {
        this.codeTVA = codeTVA;
    }
}