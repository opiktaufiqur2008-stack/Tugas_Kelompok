package TugasKelompok;

import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {

        Scanner opik = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPKM;

        System.out.print("Nama mahasiswa : ");
        nama = opik.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = opik.nextLine();

        System.out.print("Jumlah dokumen yang diupload : ");
        jumlahDokumen = opik.nextInt();

        System.out.print("Peringkat juara (1/2/3 atau 0 jika bukan juara) : ");
        peringkatJuara = opik.nextInt();

        System.out.print("Status pendanaan PKM (1=lolos, 0=tidak lolos) : ");
        statusPKM = opik.nextInt();

        if (jumlahDokumen < 4) {
            int kurang = 4 - jumlahDokumen;
            System.out.println("Status : Dokumen tidak lengkap (kurang "+ kurang + " dokumen). Dana penghargaan tidak diberikan.");
        } else {
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                    || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                    || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Bukan juara 1, 2, atau 3. "
                            + "Dana penghargaan tidak diberikan.");
                }
            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                if (statusPKM == 1) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : PKM tidak lolos. "
                            + "Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Kegiatan lainnya. "
                        + "Dana penghargaan tidak diberikan.");
            }
        }
        opik.close();
    }
}

