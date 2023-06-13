/*
 * Baris Ke-1
 * --> Mendeklarasikan fungsi utama main yang merupakan titik masuk untuk menjalankan program Java.
 * Baris Ke-2
 * --> Mendeklarasikan variabel bilanganDesimal dengan nilai 1980. Ini adalah bilangan desimal yang akan dikonversi.
 * Baris Ke-3
 * --> Menggunakan metode Integer.toBinaryString() untuk mengonversi bilanganDesimal menjadi bentuk biner. Metode ini mengambil bilangan desimal sebagai argumen dan mengembalikan representasinya dalam bentuk string biner.
 * Baris Ke-5
 * --> Mencetak hasil konversi ke bentuk biner menggunakan System.out.println(). Pesan "Biner: " diikuti oleh nilai bilanganBiner yang telah dikonversi.
 * Baris Ke-8
 * -->enggunakan metode Integer.toHexString() untuk mengonversi bilanganDesimal menjadi bentuk heksadesimal. Metode ini mengambil bilangan desimal sebagai argumen dan mengembalikan representasinya dalam bentuk string heksadesimal.
 * Baris Ke-9
 * --> Mencetak hasil konversi ke bentuk heksadesimal menggunakan System.out.println(). Pesan "Heksadesimal: " diikuti oleh nilai bilanganHeksadesimal yang telah dikonversi.
 * Baris Ke-12
 * --> Menggunakan metode Integer.toOctalString() untuk mengonversi bilanganDesimal menjadi bentuk oktal. Metode ini mengambil bilangan desimal sebagai argumen dan mengembalikan representasinya dalam bentuk string oktal.
 * Baris Ke-13
 * --> Mencetak hasil konversi ke bentuk oktal menggunakan System.out.println(). Pesan "Oktal: " diikuti oleh nilai bilanganOktal yang telah dikonversi.
 */

/*
Pada baris pertama, kita mendefinisikan metode main sebagai titik masuk untuk eksekusi program.

Di baris kedua, kita mendeklarasikan sebuah variabel bilanganBiner yang berisi string "1001001101". Ini adalah representasi biner dari bilangan yang akan dikonversi.

Pada baris keempat, kita menggunakan metode parseInt dari kelas Integer untuk mengonversi bilanganBiner menjadi bilangan desimal. Argumen kedua, yaitu 2, memberi tahu metode bahwa string input adalah dalam format biner. Hasilnya disimpan dalam variabel bilanganDesimal.

Baris kelima mencetak hasil konversi bilangan biner ke desimal menggunakan System.out.println.

Pada baris ketujuh, kita menggunakan metode toHexString dari kelas Integer untuk mengonversi bilanganDesimal menjadi representasi heksadesimal. Hasilnya disimpan dalam variabel bilanganHeksadesimal.

Baris kedelapan mencetak hasil konversi bilangan biner ke heksadesimal menggunakan System.out.println.

Pada baris kesepuluh, kita menggunakan metode toOctalString dari kelas Integer untuk mengonversi bilanganDesimal menjadi representasi oktal. Hasilnya disimpan dalam variabel bilanganOktal.

Baris kesebelas mencetak hasil konversi bilangan biner ke oktal menggunakan System.out.println.

Jadi, program tersebut mengonversi bilangan biner "1001001101" menjadi bilangan desimal, heksadesimal, dan oktal, dan mencetak hasilnya.

*/

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

/*
Pertama, kita memiliki variabel bilanganHeksadesimal yang berisi string "47F", yang merupakan bilangan heksadesimal.

Selanjutnya, kita menggunakan metode Integer.parseInt(bilanganHeksadesimal, 16) untuk mengkonversi bilangan heksadesimal menjadi bilangan desimal. Angka 16 yang diberikan sebagai argumen kedua menunjukkan bahwa input dalam basis heksadesimal.

Hasil konversi bilangan heksadesimal ke bilangan desimal disimpan dalam variabel bilanganDesimal, dan kemudian dicetak menggunakan System.out.println.

Selanjutnya, kita menggunakan metode Integer.toBinaryString(bilanganDesimal) untuk mengkonversi bilangan desimal menjadi bilangan biner. Hasilnya disimpan dalam variabel bilanganBiner dan dicetak.

Terakhir, kita menggunakan metode Integer.toOctalString(bilanganDesimal) untuk mengkonversi bilangan desimal menjadi bilangan oktal. Hasilnya disimpan dalam variabel bilanganOktal dan dicetak.
*/

