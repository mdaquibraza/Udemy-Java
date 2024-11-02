public class remove_special {
    public static void main(String[] args) {
        
        String remove="a@c!dd#x%12";
        System.out.println(remove.replaceAll("[^a-z A-Z 0-9]"," "));
    }
}
