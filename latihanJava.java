/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Jabrixx
 */
public class KasusArray {

    public static void main(String[] Args)throws IOException {
        InputStreamReader Keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(Keyreader);
        int i, j;
        double total = 0;
        String[] jenis, ukuran, nama;
        int[] jumbel;
        double[] harga, jumhar, pajak, tobar;
        jenis = new String[10];
        ukuran = new String[10];
        nama = new String[10];
        jumbel = new int[10];
        jumhar = new double[10];
        harga = new double[10];
        pajak = new double[10];
        tobar = new double[10];
        System.out.println("Masukan jumlah data : ");
        j = Integer.parseInt(input.readLine());
        
        for (i = 1; i < j; i++) {
            System.out.println("data ke : " + i);
            System.out.println("Merk Helm [kyt/bmc] : ");
            jenis[i] = input.readLine();
            System.out.println("Jumlah Beli : ");
            jumbel[i] = Integer.parseInt(input.readLine());
            System.out.println("Ukuran :");
            ukuran[i] = input.readLine();
            System.out.println("");

            if (jenis[i].equalsIgnoreCase("1")) {
                nama[i] = "kyt";
                if (ukuran[i].equalsIgnoreCase("S")) {
                    harga[i] = 8000;
                } else if (ukuran[i].equalsIgnoreCase("M")) {
                    harga[i] = 7000;
                } else {
                    harga[i] = 6000;
                }
            } else {
                if (ukuran[i].equalsIgnoreCase("S")) {
                    harga[i] = 9000;
                } else if (ukuran[i].equalsIgnoreCase("M")) {
                    harga[i] = 8500;
                } else {
                    harga[i] = 7000;
                }
            }
            jumhar[i] = harga[i] * jumbel[i];
            pajak[i] = jumhar[i] * 0.1;
            tobar[i] = jumhar[i] + pajak[i];
            total = total + tobar[i];
        }
        System.out.println("Toko HELM XXX ");
        System.out.println("");

        for (i = 1; i < j; i++) {
            System.out.println("Data ke " + i);
            System.out.println("Jenis Helm " + jenis[i]);
            System.out.println("Ukuran " + ukuran[i]);
            System.out.println("Harga " + harga[i]);
            System.out.println("Jumlah Harga " + jumhar[i]);
            System.out.println("Pajak : " + pajak[i]);
            System.out.println("Total Bayar : " + tobar[i]);
        }

        System.out.println("Harga Keseluruhan : " + total);
    }

}
