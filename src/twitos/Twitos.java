package twitos;

public class Twitos {
    public Twitos() {        
    }
    
    public void displayList() {
        System.out.println("Voici ma liste de followers:");
        SQLiteTwitosWrapper wrapper = new SQLiteTwitosWrapper();
        for (String name : wrapper.getList()) {
            System.out.println(name);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Twitos t = new Twitos();
        t.displayList();
    }
}
