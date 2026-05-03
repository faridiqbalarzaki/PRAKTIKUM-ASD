package JOBSHEET3;

public class DataDosen08 {

    public void dataSemuaDosen(Dosen08[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen08 d : arrayOfDosen) {
            d.tampilData();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen08 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\n=== Jumlah Dosen Per Jenis Kelamin ===");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen08 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jumlahPria++;
            } else {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }

        System.out.println("\n=== Rata-Rata Usia Dosen ===");

        if (jumlahPria > 0)
            System.out.println("Pria   : " + ((int) totalPria / jumlahPria));
        else
            System.out.println("Pria   : 0");

        if (jumlahWanita > 0)
            System.out.println("Wanita : " + ((int) totalWanita / jumlahWanita));
        else
            System.out.println("Wanita : 0");
    }

    public void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        Dosen08 tertua = arrayOfDosen[0];

        for (Dosen08 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\n=== Dosen Tua ===");
        tertua.tampilData();
    }

    public void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        Dosen08 termuda = arrayOfDosen[0];

        for (Dosen08 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\n=== Dosen Muda ===");
        termuda.tampilData();
    }
}