public class Classroom {

    public static void main(String[] args) {

        Wilder jeanClaude = new Wilder("Jean-claude", true);
        System.out.println(jeanClaude.whoAmI());
        
        Wilder henri = new Wilder("Henri");
        System.out.println(henri.whoAmI());
    }
}
