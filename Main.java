public class Main {
    public static void main(String[] args) {
        String inputfilename = "C:\\temp\\untitled\\src\\text.txt";
        String outputfilename = "C:\\temp\\untitled\\src\\chiffrierter-text.txt";
        FileMgmt fileMgmt = new FileMgmt();
        String text = fileMgmt.readFile(inputfilename);
        System.out.println(text);
        String textencoded = fileMgmt.encode(text,1);
        System.out.println(textencoded);
        if(fileMgmt.writeFile(outputfilename,textencoded))
            System.out.println("Erfolg!");
        else
            System.out.println("Keine Chiffrierter-Text Ausgabe!");
        decodeTest();
        System.out.println("Fertig!");
    }

    static void decodeTest() {
        String outputfilename = "C:\\temp\\untitled\\src\\outtext.txt";
        String inputfilename = "C:\\temp\\untitled\\src\\chiffrierter-text.txt";
        FileMgmt fileMgmt = new FileMgmt();
        String text = fileMgmt.readFile(inputfilename);
        String textencoded = fileMgmt.decode(text,1);
        if(fileMgmt.writeFile(outputfilename,textencoded))
            System.out.println("Erfolg!");
        else
            System.out.println("Keine DeChiffrierter-Text Ausgabe!");

    }
}