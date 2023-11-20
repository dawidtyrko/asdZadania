import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Character, Integer> alphabetMap = new HashMap<>();
        String napis = "Algorytm";
        List<Character> podciag = new ArrayList<>();
        for(char c='a'; c<='z';c++){
            alphabetMap.put(c,0);
        }
        for(int i=0; i<napis.length(); i++){
            char ch = napis.toLowerCase().charAt(i);
            if(alphabetMap.containsKey(ch))
                alphabetMap.put(ch,1);
        }
        for(Map.Entry<Character,Integer> k : alphabetMap.entrySet()){
            if(k.getValue() == 0)
                podciag.add(k.getKey());
        }

        for(Character character : podciag){
            System.out.println(character);
        }
    }
}