package by.epamtc.jwd.main;

import java.util.Arrays;

import static by.epamtc.jwd.util.Util.getRandomPositiveInt;

public class Task3 {
    private static int[] generateLock() {
        int[] cells = new int[10];
        int fCellNumber;
        int sCellNumber;
        int cellValue;

        fCellNumber = getRandomPositiveInt(9);
        cellValue = getRandomPositiveInt(5) + 1;
        cells[fCellNumber] = cellValue;

        do {
            sCellNumber = getRandomPositiveInt(9);
            cellValue = getRandomPositiveInt(5) + 1;
            cells[sCellNumber] = cellValue;
        } while (sCellNumber == fCellNumber);


        System.out.println(Arrays.toString(cells));

        for (int first = 1; first <= 6; first++)
            for (int second = 1; second <= 6; second++) {
                int[] candidate = cells.clone();
                candidate[0] = first;
                candidate[1] = second;

                boolean invalidValue = false;

                for (int j = 2; j < 10; j++) {
                    candidate[j] = 10 - candidate[j - 1] - candidate[j - 2];
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

        System.out.println(Arrays.toString(lock));

    }
}
