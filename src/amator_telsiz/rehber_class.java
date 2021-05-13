/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amator_telsiz;

/**
 *
 * @author Erkin
 */
public class rehber_class {
    
    private String AdSoyad;
    private String callsign;
    private String telefon;
    private String email;
    private String QTH;
    private String KulCih;   
    
    
    
    public rehber_class(String _AdSoyad,String _callsign,String _telefon,String _email, String _QTH, String _KulCih)
    {
        this.AdSoyad =_AdSoyad;
        this.callsign =_callsign;
        this.telefon =_telefon ;
        this.email =_email;
        this.QTH = _QTH;
        this.KulCih = _KulCih;
    
    }

    
    public String getAdSoyad()
    {
        return AdSoyad;
    }
    
    public String getcallsign()
    {
        return callsign;
    }
    
    public String gettelefon()
    {
        return telefon;
    }
     public String getemail()
    {
        return email;
    }
     public String getQTH()
    {
        return QTH;
    }
     public String getKulCih()
    {
        return KulCih;
    }
    

    
}
