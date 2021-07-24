/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiapotek;

/**
 *
 * @author Ichaooo
 */
public class pelanggan {
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public obat getObat() {
        return obat;
    }
    public void setObat(obat obat) {
        this.obat = obat;
    }
private String tanggal;
private String jenis;
private obat obat;
public pelanggan (){}
public pelanggan(String tanggal, String jenis, obat obat){
    this.tanggal=tanggal;
    this.jenis=jenis;
    this.obat=obat;
}
}
