package JOBSHEET_Per6.latihan;

public class DataDosen08 {
    Dosen08[] dataDosen08 = new Dosen08[10];
    int idx;

    void tambah(Dosen08 dsn) {
        if (idx < dataDosen08.length) {
            dataDosen08[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen08[i].tampil();
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen08[j].usia > dataDosen08[j + 1].usia) {
                    Dosen08 temp = dataDosen08[j];
                    dataDosen08[j] = dataDosen08[j + 1];
                    dataDosen08[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;

            for (int j = i + 1; j < idx; j++) {
                if (dataDosen08[j].usia > dataDosen08[max].usia) {
                    max = j;
                }
            }

            Dosen08 temp = dataDosen08[max];
            dataDosen08[max] = dataDosen08[i];
            dataDosen08[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen08 temp = dataDosen08[i];
            int j = i - 1;

            while (j >= 0 && dataDosen08[j].usia < temp.usia) {
                dataDosen08[j + 1] = dataDosen08[j];
                j--;
            }

            dataDosen08[j + 1] = temp;
        }
    }

}
