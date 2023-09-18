import java.util.Map;
import java.util.HashMap;

public class ChordDictionary {
    private Map<String, String> chordMap;

    public ChordDictionary() {
        chordMap = new HashMap<>();
        chordMap.put("A", "X02220");
        chordMap.put("B", "XX4442");
        chordMap.put("C", "X32010");
        chordMap.put("D", "XX0232");
        chordMap.put("E", "022100");
        chordMap.put("F", "XX3211");
        chordMap.put("G", "320003");
        chordMap.put("Amaj7", "X02120");
        chordMap.put("A7", "X02020");
        chordMap.put("Am", "X02210");
        chordMap.put("Am7", "X02010");
        chordMap.put("Bmaj7", "22130X");
        chordMap.put("B7", "X21202");
        chordMap.put("Bm", "XX4432");
        chordMap.put("Bm7", "X20202");
        chordMap.put("Cmaj7", "X32000");
        chordMap.put("Cm", "X310XX");
        chordMap.put("C7", "X32310");
        chordMap.put("Cm7", "X313XX");
        chordMap.put("Dmaj7", "XX0222");
        chordMap.put("D7", "XX0212");
        chordMap.put("Dm", "XX0231");
        chordMap.put("Dm7", "XX0211");
        chordMap.put("Emaj7", "021100");
        chordMap.put("E7", "020100");
        chordMap.put("Em", "022000");
        chordMap.put("Em7", "022030");
        chordMap.put("Fmaj7", "XX3210");
        chordMap.put("F7", "131211");
        chordMap.put("Fm", "XX3111");
        chordMap.put("Fm7", "131111");
        chordMap.put("Gmaj7", "3X0002");
        chordMap.put("G7", "320001");
        chordMap.put("Gm", "XX0333");
        chordMap.put("Gm7", "X13030");
        chordMap.put("MUTED", "XXXXXX");
    }

    public String getChordName(String tablature) {
        for (Map.Entry<String, String> entry : chordMap.entrySet()) {
            String chordName = entry.getKey();
            String chordTab = entry.getValue();

            if (tablature.equals(chordTab)) {
                return chordName;
            }
        }

        return "Chord not found.";
    }

    public String getChordTab(String name) {
        String chordName = chordMap.get(name);
        
        if (chordName == null) {
            return "Chord not found.";
        }

        return chordName;
    }
}
