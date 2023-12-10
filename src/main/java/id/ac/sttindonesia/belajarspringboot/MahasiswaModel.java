package id.ac.sttindonesia.belajarspringboot;

import java.sql.Date;

public class MahasiswaModel {
    private String Nama;
    private String TempatLahir;
    private Date TanggalLahir;

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTempatLahir() {
        return this.TempatLahir;
    }

    public void setTempatLahir(String TempatLahir) {
        this.TempatLahir = TempatLahir;
    }

    public Date getTanggalLahir() {
        return this.TanggalLahir;
    }

    public void setTanggalLahir(Date TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }
    
}
