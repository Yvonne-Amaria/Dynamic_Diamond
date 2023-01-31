import java.util.Scanner;

public class Main {
    private static String createHeaderFooter(int dSize) {
        String headerFooter = "+";
        for (int i = 0; i < dSize; i++) {
            headerFooter += "--";
        }
        headerFooter += "+";
        return headerFooter;
    }

    // Create a center space to align the Diamond
    private static String createSpaceForCenter(int totalLength, int charLength, String lineStr) {
        int lineSpaceLength = ((totalLength - (charLength + 2)) / 2);
        String spaceStr = "";

        for (int i = 0; i < lineSpaceLength; i++) {
            spaceStr += " ";
        }
        return "|" + spaceStr + lineStr + spaceStr + "|";
    }

    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        // Enter username and press Enter
        System.out.print("Input Diamond size: ");
        int dSize = myObj.nextInt();
        int midWayLength = dSize * 2;

        // Top half
        String headerFooter;
        headerFooter = createHeaderFooter(dSize);
        System.out.println(headerFooter);
        // looping through the total first half vertical length of the Diamond.
        for (int dLine = 0; dLine < dSize; ++dLine) {
            String lineStr = "";
            if (dLine != dSize - 1) {
                lineStr += "/";
            } else
                lineStr += "<";
            // for the individual construction of the horizontal piece
            for (int dChar = 0; dChar < dLine; ++dChar) {
                if (dLine % 2 == 0)
                    lineStr += "==";
                else
                    lineStr += "--";
            }
            if (dLine != dSize - 1)
                lineStr += "\\";
            else
                lineStr += ">";
            int lineLength = dLine * 2;
            lineStr = createSpaceForCenter(midWayLength, lineLength, lineStr);
            System.out.println(lineStr);
        }
        // Botton Half
        // looping through the total bottom half vertical length of the Diamond.
        for (int dLine = dSize - 2; dLine >= 0; --dLine) {
            String lineStr = "\\";
            for (int dChar = 0; dChar < dLine; dChar++) {
                if (dLine % 2 == 0)
                    lineStr += "==";
                else
                    lineStr += "--";
            }
            lineStr += "/";
            int lineLength = dLine * 2;
            lineStr = createSpaceForCenter(midWayLength, lineLength, lineStr);
            System.out.println(lineStr);

        }
        System.out.println(headerFooter);
    }
}
