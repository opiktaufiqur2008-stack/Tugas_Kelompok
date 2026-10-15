package Tugas_Kelompok;
import java.util.Scanner;

public class StudiKasus2_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaan, kurangDokumen;

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara: ");
            peringkatJuara = sc.nextInt();

            if (jumlahDokumen==4) {
                
                if (peringkatJuara>0 && peringkatJuara<4) {
                    System.out.println("Dana penghargaan diberikan");
                } else {
                    System.out.println("Anda bukan juara. Dana penghargaan tidak diberikan");
                }
                
            } else if (jumlahDokumen<4) {
                kurangDokumen = 4 - jumlahDokumen;
                System.out.println("Dokumen tidak lengkap (kurang " +  kurangDokumen + " dokumen). Dana penghargaan tidak diberikan");

            } else {
                System.out.println("Jumlah dokumen melebihi yang seharusnya, coba lagi!");
            }
            
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")){

            System.out.print("Jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPendanaan = sc.nextInt();

            if(jumlahDokumen==4){

                if (statusPendanaan==1) {
                    System.out.println("Anda berhak mendapatkan dana pengahrgaan");
                } else if (statusPendanaan==0){
                    System.out.println("Anda tidak lolos pendanaan. Dana penghargaan tidak diberikan");
                } else {
                    System.out.println("Status pendanaan tidak valid. Silahkan coba lagi!");
                }
                
            } else if (jumlahDokumen<4){
                kurangDokumen = 4 - jumlahDokumen;
                System.out.println("Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan");
            } else {
                System.out.println("Jumlah dokumen melebihi yang seharusnya, coba lagi!");
            }
            
        } else {
            System.out.println("Dana penghargaan tidak diberikan karena bukan perlombaan BELMAWA/BAKORMA/MANDIRI/PKM");
        }     
    }    
}
