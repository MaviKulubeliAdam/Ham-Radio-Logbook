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
public class kullanıcılar_class {
    
    private String il;
    private String yer;
    private String yükseklik;
    private String güç;
    private String band;
    private String frekans;
    private String ton;
    private String squelch;
    
    
    
    public kullanıcılar_class(String İl,String Yer,String Yükseklik,String Güç, String Band, String Frekans, String Ton, String Squelch)
    {
        this.il = İl;
        this.yer = Yer;
        this.yükseklik = Yükseklik;
        this.güç = Güç;
        this.band = Band;
        this.frekans = Frekans;
        this.ton = Ton;
        this.squelch = Squelch;
        
        
    }

    kullanıcılar_class(String string, String string0, int aInt, String string1, String string2, String string3, String string4, String string5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
    
    public String getİl()
    {
        return il;
    }
    
    public String getYer()
    {
        return yer;
    }
    
    public String getYükseklik()
    {
        return yükseklik;
    }
     public String getGüç()
    {
        return güç;
    }
     public String getBand()
    {
        return band;
    }
     public String getFrekans()
    {
        return frekans;
    }
     public String getTon()
    {
        return ton;
    }
     public String getSquelch()
    {
        return squelch;
    }


}

