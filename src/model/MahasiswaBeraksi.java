package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main (String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630460";
        mahasiswa.nama = "Yuniati";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("22-02-2000");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 =new Mahasiswa("19630461","Rafiah","22-02-2001");
        mahasiswa2.tampilkanAtribut();

    }
}