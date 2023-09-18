import java.util.Scanner;

/* This program will convert guitar chords into tablature, as well as 
 * retrieve the names of chords from tablature. Its functionality only
 * works with the basic key chords (no power chords, # chords, etc.), and is
 * a great program for memorizing chord names and structures.
*/

public class GuitarTablatureProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean flag = true;
        Chord chord = new Chord();

        System.out.println("Find a chord (1), or find tab (2)");
        input = scanner.nextInt();

        if (input == 1) {
            while (flag) {
                System.out.print("Enter tablature (EADGBE): ");
                chord.tab = scanner.next();

                if (chord.tab.equals("done")) {
                    return;
                }

                System.out.println(findChord(chord));
          }
        } else if (input == 2) {
            while (flag) {
                System.out.print("Enter chord name: ");
                chord.name = scanner.next();

                if (chord.name.equals("done")) {
                    return;
                }

                System.out.println(findTab(chord));
            }
        }
    }

    public static String findChord(Chord chord) {
        String tab = chord.getTab();
        ChordDictionary dictionary = new ChordDictionary();
        String standardTuning = "EADGBE";

        if (tab.length() != standardTuning.length()) {
            return "Invalid tablature: length mismatch";
        }

        return dictionary.getChordName(tab);
    }

    public static String findTab(Chord chord) {
        ChordDictionary dictionary = new ChordDictionary();
        return dictionary.getChordTab(chord.getName());
    }
}
