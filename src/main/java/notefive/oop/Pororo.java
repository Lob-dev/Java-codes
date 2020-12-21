package notefive.oop;

public final class Pororo {

    private String word;

    static {
        System.out.println("Pororo.static initializer");
    }

    public Pororo() {
        System.out.println("Pororo.default constructor");
    }

    public final void hello(){
        System.out.println("Pororo.hello");
    }

    public String getWord() {
        System.out.println("words");
        return word;
    }

    public String addWord(String newWord){
        System.out.println("addWords");
        return word + newWord;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
