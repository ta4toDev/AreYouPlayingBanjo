//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Richard";
        System.out.println(areYouPlayingBanjo(name));
    }
        public static String areYouPlayingBanjo(String name){
        return name.toLowerCase().charAt(0) == 'r' ? name + " You playing Banjo" : name + " You dont playing Banjo";
    }
}