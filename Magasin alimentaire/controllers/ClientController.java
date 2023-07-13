import java.util.List;
import Client;

public class ClientController extends AbstractController {

    private List<Client> clients = new ArrayList();
    Scanner myObjc = new Scanner(System.in);

    public void ajouter() {

        System.out.println("Donner l'identifient de client : ");
        String id = myObjc.nextLine();
        System.out.println("Donner le nom de client : ");
        String nom = myObjc.nextLine();
        System.out.println("Donner le prenom de client : ");
        String prenom = myObjc.nextLine();
        System.out.println("Donner l'adresse de client : ");
        String adresse = myObjc.nextLine();
        System.out.println("Donner le telephone de client : ");
        String telephone = myObjc.nextLine();
        System.out.println("Donner l'email de client : ");
        String email = myObjc.nextLine();

    }

    public void supprimer() {
        System.out.println("Donner l'identifient de client a supprimer : ");
        String id = myObjc.nextLine();
        clients.removeIf(client);
    }

    public void modifier() {
        System.out.println("Donner l'identifient de client : ");
        String id = myObjc.nextLine();
        System.out.println("Donner le nom de client : ");
        String nom = myObjc.nextLine();
        System.out.println("Donner le prenom de client : ");
        String prenom = myObjc.nextLine();
        System.out.println("Donner l'adresse de client : ");
        String adresse = myObjc.nextLine();
        System.out.println("Donner le telephone de client : ");
        String telephone = myObjc.nextLine();
        System.out.println("Donner l'email de client : ");
        String email = myObjc.nextLine();
        clients.removeIf(client);
    }
}