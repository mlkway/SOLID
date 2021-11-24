package SRP;

public class Book {

    private String name;
    private String author;
    private String text;


    public Book(String name, String author, String text){
        this.text = text;
        this.author = author;
        this.name = name;
    }

    String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    Boolean isWordInText(String word){
        return text.contains(word);
    }


    // this violate the single responsibility principle we outlined earlier. to fix our mess, we shoud implement a
    // separate class that deals only with printing our texts:
    void printTextToConsole(){
        System.out.println("Prin All Books");
    }

}

/*
    To fix our violation we must make a other class wich gets a response to print our books like this:
    public class BookPrinter{
        void printTextT(////){
            //////
        }

    }
 */

