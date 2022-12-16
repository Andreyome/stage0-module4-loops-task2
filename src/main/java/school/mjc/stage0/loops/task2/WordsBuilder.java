package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String result="";
        int c = 0;
        while(result.length()<chars.length) {
            for (char b = chars[c]; c < chars.length;c++) {
                b = chars[c];
                result += b;
            }
        }
System.out.println(result);
    }
}
