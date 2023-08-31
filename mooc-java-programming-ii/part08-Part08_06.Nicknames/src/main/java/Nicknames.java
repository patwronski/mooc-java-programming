
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> namenick = new HashMap<>();
        
        namenick.put("matthew", "matt");
        namenick.put("michael", "mix");
        namenick.put("arthur", "artie");
        
        System.out.println(namenick.get("matthew"));
    }

}
