/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_1_razif_27032023;

/**
 *
 * @author ACER
 */
public class KonversiBilangan3 {
    public static void main(String[] args) {
        String bilanganOktal = "76";

        // Konversi ke desimal
        int bilanganDesimal = Integer.parseInt(bilanganOktal, 8);
        System.out.println("Desimal: " + bilanganDesimal);

        // Konversi ke biner
        String bilanganBiner = Integer.toBinaryString(bilanganDesimal);
        System.out.println("Biner: " + bilanganBiner);

        // Konversi ke heksadesimal
        String bilanganHeksadesimal = Integer.toHexString(bilanganDesimal);
        System.out.println("Heksadesimal: " + bilanganHeksadesimal);
    }

}

/*
Pada baris pertama, kita mendeklarasikan method main yang merupakan method utama yang akan dieksekusi saat program dijalankan.

Pada baris kedua, sebuah string bilanganOktal diinisialisasi dengan nilai "76". Ini adalah bilangan oktal yang akan dikonversi.

Pada baris keempat, kita menggunakan metode Integer.parseInt(bilanganOktal, 8) untuk mengonversi bilanganOktal menjadi bilangan desimal. Argumen kedua, yaitu angka 8, menunjukkan bahwa bilangan yang kita berikan dalam format oktal.

Pada baris kelima, hasil konversi ke desimal disimpan dalam variabel bilanganDesimal.

Pada baris keenam, kita mencetak nilai desimal menggunakan System.out.println dan menggabungkannya dengan teks "Desimal: ".

Pada baris kesembilan, kita menggunakan metode Integer.toBinaryString(bilanganDesimal) untuk mengonversi bilanganDesimal ke dalam bentuk biner. Hasilnya disimpan dalam variabel bilanganBiner.

Pada baris kesepuluh, kita mencetak nilai biner menggunakan System.out.println dan menggabungkannya dengan teks "Biner: ".

Pada baris kesebelas, kita menggunakan metode Integer.toHexString(bilanganDesimal) untuk mengonversi bilanganDesimal ke dalam bentuk heksadesimal. Hasilnya disimpan dalam variabel bilanganHeksadesimal.

Pada baris kedua belas, kita mencetak nilai heksadesimal menggunakan System.out.println dan menggabungkannya dengan teks "Heksadesimal: ".
*/
