package Tugas_2;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
    GOL     : TIF B - BONDOWOSO
*/
class TelevisiModern extends Televisi {
    static String TELETEXT = "Teletext";
    static String TV = "Televisi";
    private String cd = "";
    
    public TelevisiModern(String model, int i) {
        super(model, i);
    }
    @Override
    public String getDeskripsi() {
        return super.getDeskripsi(); 
    }
    @Override
    public void getChannels() {
        super.getChannels(); 
    }
    @Override
    public void setChannels(String[] semuaChannel) {
        super.setChannels(semuaChannel); 
    }
    @Override
    public void setChannelAktif(int aktif) {
        super.setChannelAktif(aktif); 
    }
    @Override
    public void setVolume(int vol) {
        super.setVolume(vol);
    }
    public void setModusTampilan(String display){
        System.out.println("Modus Tampilan : " + display);
    }
    void setHalamanTeletext(int page) {
        System.out.println("Berpindah ke halaman Teletext : " + page);
    }
    void setDiscTray(String cd) {
        this.cd = cd;
    }
    void playCD() {
        if("".equals(cd)){
            System.out.println("Tidak ada cd didalam disk tray!");
        }else{
            System.out.println("Memutar film " + cd);
        }
    }
}
class User_TelevisiModern {
    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern("Tv modern, 29 inches ", 100);
        String[] semuaChannel = {"RCTI","SCTV","INDOSIAR","LA TV",
                                 "METRO TV","TRANS TV","TPI","TV 7",
                                 "TVRI","TV G","AN TV"};
        System.out.println("Pak Ahmad Wildan, membeli Televisi : " + tv.getDeskripsi());
        
        tv.getChannels();
        tv.setChannels(semuaChannel);

        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.TV);
        tv.playCD();
        tv.setDiscTray("The Matrix");
        tv.playCD();
    }
}