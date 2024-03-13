public class OddPosition {
    public static void main(String[] args) {
        String txt = "type here to search";
        OddPositionChar(txt);
    }
    public static void OddPositionChar(String str) {
        str = str.replaceAll("\\s+", "");
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0)
            { 
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}
