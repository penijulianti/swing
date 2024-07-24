/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitas;

import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author ASUS
 */
public class ensuratmasuk {
    private String no,dari,isi,lam,ket,tgl;
    private byte[] pict;
    private InputStream gbr;
    
    /**
     * @return the no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * @return the dari
     */
    public String getDari() {
        return dari;
    }

    /**
     * @param dari the dari to set
     */
    public void setDari(String dari) {
        this.dari = dari;
    }

    /**
     * @return the isi
     */
    public String getIsi() {
        return isi;
    }

    /**
     * @param isi the isi to set
     */
    public void setIsi(String isi) {
        this.isi = isi;
    }

    /**
     * @return the lam
     */
    public String getLam() {
        return lam;
    }

    /**
     * @param lam the lam to set
     */
    public void setLam(String lam) {
        this.lam = lam;
    }

    /**
     * @return the ket
     */
    public String getKet() {
        return ket;
    }

    /**
     * @param ket the ket to set
     */
    public void setKet(String ket) {
        this.ket = ket;
    }

    /**
     * @return the tgl
     */
    public String getTgl() {
        return tgl;
    }

    /**
     * @param tgl the tgl to set
     */
    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    /**
     * @return the pict
     */
    public byte[] getPict() {
        return pict;
    }

    /**
     * @param pict the pict to set
     */
    public void setPict(byte[] pict) {
        this.pict = pict;
    }

    public void setBytes(Icon icon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the gbr
     */
    public InputStream getGbr() {
        return gbr;
    }

    /**
     * @param gbr the gbr to set
     */
    public void setGbr(InputStream gbr) {
        this.gbr = gbr;
    }
}
