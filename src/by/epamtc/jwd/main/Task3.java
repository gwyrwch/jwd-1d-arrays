package by.epamtc.jwd.main;

import static by.epamtc.jwd.util.Util.arrayToString;
import static by.epamtc.jwd.util.Util.getRandomPositiveInt;

public class Task3 {
    private static int[] generateLock() {
        final int numberOfCells = 10;
        final int maxDiceValue = 6;

        int[] cells = new int[numberOfCells];
        int fCellNumber;
        int sCellNumber;
        int cellValue;

        fCellNumber = getRandomPositiveInt(numberOfCells);
        cellValue = getRandomPositiveInt(maxDiceValue) + 1;
        cells[fCellNumber] = cellValue;

        do {
            sCellNumber = getRandomPositiveInt(numberOfCells);
            cellValue = getRandomPositiveInt(maxDiceValue) + 1;
            cells[sCellNumber] = cellValue;
        } while (sCellNumber == fCellNumber);


        System.out.println(arrayToString(cells));

        for (int first = 1; first <= maxDiceValue; first++)
            for (int second = 1; second <= maxDiceValue; second++) {
                int[] candidate = cells.clone();
                candidate[0] = first;
                candidate[1] = second;

                boolean invalidValue = false;

                for (int j = 2; j < numberOfCells; j++) {
                    candidate[j] = numberOfCells - candidate[j - 1] - candidate[j - 2];
                    if (candidate[j] > 6 || candidate[j] < 1) {
                        invalidValue = true;
                    }
                }

                if (invalidValue)
                    continue;

                if (candidate[fCellNumber] == cells[fCellNumber] && candidate[sCellNumber] == cells[sCellNumber]) {
                    return candidate;
                }
            }

        return cells;
    }

    public static void main(String[] args) {
        int[] lock = generateLock();

        System.out.println(arrayToString(lock));

    }
}
