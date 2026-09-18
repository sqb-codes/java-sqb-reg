public class StringMethods {
    public static void main(String[] args) {
        String name = "hello world";
        char e = name.charAt(0);    // e = 'h'
        String firstChar = String.valueOf(e);   // firstChar = "h" -> e
        firstChar = firstChar.toUpperCase();    // firstChar = "H"

        // Internally String is -> Char array
        // name = "Ravi"
        // internally - ['R', 'a', 'v', 'i']
        // name = firstChar + name.substring(1).toLowerCase();   
        //name = "H" + "ello world";

        // Alternative - Shortcut
        name = String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();

        System.out.println(name);

        String msg = "hello how are you ?";
        // O/p : Hello How Are You ?
        String words[] = msg.split(" ");    // ["hello","how","are","you","?"]
        String newMsg = "";
        for(String word: words) {
            String text = String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1).toLowerCase() + " ";
            newMsg += text;
        }
        System.out.println(newMsg);
    }
}
