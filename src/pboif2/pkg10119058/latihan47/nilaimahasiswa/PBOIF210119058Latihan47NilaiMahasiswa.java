/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan47.nilaimahasiswa;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung nilai 
 *                     mahasiswa.
 */
public class PBOIF210119058Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        
        nilai.setNilaiQuiz(30.0);
        nilai.setNilaiUts(80.0);
        nilai.setNilaiUas(40.0);
        
        double quiz = nilai.getNilaiQuiz();
        double uts = nilai.getNilaiUts();
        double uas = nilai.getNilaiUas();
        double nilaiAkhir = nilai.nilaiAkhir(quiz, uts, uas);
        char index = nilai.index(nilaiAkhir);
        // Konversi dari char ke string
        String str = String.valueOf(index);
        String keterangan = nilai.keterangan(str);
        
        System.out.println("Quiz\t\t\t = " + quiz);
        System.out.println("UTS\t\t\t = " + uts);
        System.out.println("UAS\t\t\t = " + uas);
        System.out.println();
        System.out.println();
        System.out.println("Nilai Akhir\t\t = " + nilaiAkhir);
        System.out.println();
        System.out.println();
        System.out.println("Index = " + str);
        System.out.println("Keterangan = " + keterangan);
    }
    
}
