import dao.ClientDAO;
import models.Client;

public class Main {
    public static void main(String[] args) {
        ClientDAO dao = new ClientDAO();
        Client client1 = new Client("Johan Reyes", "123456", "Managua",
                "Carazo", "github.com/Zombender",true);
        dao.save(client1);
    }
}
