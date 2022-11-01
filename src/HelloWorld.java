public class HelloWorld {
    int[] surrogates = {0xD83D, 0xDC7D};
    String alienEmojiString = new String(surrogates, 0, surrogates.length);
System.out.println(alienEmojiString);
System.out.println("\uD83D\uDC7D");   // alternative way
}
