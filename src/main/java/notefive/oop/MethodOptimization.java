package notefive.oop;

public class MethodOptimization {
    public static void main(String[] args) {
        Pororo pororo = new Pororo();
        Pororo pororo2 = new Pororo();
        Pororo pororo3 = new Pororo();
        Pororo pororo4 = new Pororo();
        Pororo pororo5 = new Pororo();

        pororo.hello();
        pororo2.hello();
        pororo3.hello();
        pororo4.hello();
        pororo5.hello();

        pororo.getWord();
        pororo2.getWord();
        pororo3.getWord();
        pororo4.getWord();
        pororo5.getWord();

        pororo.addWord("a");
        pororo2.addWord("b");
        pororo3.addWord("c");
        pororo4.addWord("d");
        pororo5.addWord("e");
        
    }
}
