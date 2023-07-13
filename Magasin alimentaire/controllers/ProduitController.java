import java.util.List;
import Produit;

public class Produitcontroller extends AbstractController implements chercher {
    private List<Produit> produits = new ArrayList();
    Scanner myObjp = new Scanner(System.in);

    public void ajouter() {
        System.out.println("Donner l'identifient de produit : ");
        String id = myObjp.nextLine();
        System.out.println("Donner le nom de produit : ");
        String nom = myObjp.nextLine();
        System.out.println("Donner le prix de produit : ");
        Float prix = myObjp.nextLine();
        System.out.println("Donner le stock de produit : ");
        int stock = myObjp.nextLine();
        System.out.println("produit en promotion ? (true/flase) : ");
        Boolean promotion = myObjp.nextLine();
        System.out.println("Donner le remise sur produit : ");
        int remise = myObjp.nextLine();
    }

    public void supprimer() {
        System.out.println("Donner l'identifient de produit a supprimer : ");
        String id = myObjp.nextLine();
        produits.removeIf(produit);
    }

    public void modifier() {
        System.out.println("Donner l'identifient de produit : ");
        String id = myObjp.nextLine();
        System.out.println("Donner le nom de produit : ");
        String nom = myObjp.nextLine();
        System.out.println("Donner le prix de produit : ");
        Float prix = myObjp.nextLine();
        System.out.println("Donner le stock de produit : ");
        int stock = myObjp.nextLine();
        System.out.println("produit en promotion ? (true/flase) : ");
        Boolean promotion = myObjp.nextLine();
        System.out.println("Donner le remise sur produit : ");
        int remise = myObjp.nextLine();
        produits.removeIf(produit);
    }

    public void chercher() {
        System.out.println("Donner l'identifient de produit a chercher : ");
        String id = myObjp.nextLine();
        System.out.println("produit : " + produit);
        });
    }
}
