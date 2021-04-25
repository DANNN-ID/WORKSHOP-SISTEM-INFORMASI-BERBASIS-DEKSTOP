package Tugas_2;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
    GOL     : TIF B - BONDOWOSO
*/
class Televisi {
    private final String model;  
    private int jumlahChannel = 0;
    String[] Channels = new String[jumlahChannel];
    private int volum;
   
    public Televisi(String model, int i) {
        this.model = model;
        this.jumlahChannel = i;
    }
    public String getDeskripsi() {
        return (model + jumlahChannel);
    }
    public void getChannels() {
        if (Channels.length == 0) {
            System.out.println("Belum ada channel yang di set!");
        }
        else {
            System.out.println("Channel berhasil di set");
        }
    }
    public void setChannels(String[] semuaChannel) {
        if (jumlahChannel >= semuaChannel.length) {
            Channels = semuaChannel;
            System.out.println("Informasi channel berhasil diupdate!");

        }
        else { 
            System.out.println("Maaf Tv ini hanya mampu menyimpan " + jumlahChannel + " Channel");
        }
    }
    public void setChannelAktif(int aktif) {
        if (jumlahChannel > aktif) {
            int temp = aktif - 1;
            System.out.println("Pindah channel ke : " + Channels[temp]);  
        }
        else {
            System.out.println("Channel yang Anda inginkan belum diset ");
        }  
    }
    public void setVolume(int vol) {
        System.out.println("Intensitas volume sekarang : " + vol);
    }
}

public class User_Televisi {
    public static void main(String[] args) {
        Televisi tv = new Televisi("Tv Tempoe Doeloe, 14 inches ", 10);
        String[] semuaChannel = {"RCTI","SCTV","INDOSIAR","LA TV",
                                 "METRO TV","TRANS TV","TPI",
                                 "TV 7","TVRI","TV G","AN TV"};
        String[] channelFavorit = {"RCTI","SCTV","INDOSIAR","LA TV",
                                   "METRO TV","TRANS TV","TPI","TV 7"};
        
        System.out.println("Pak Ahmad Wildan, membeli Televisi : " + tv.getDeskripsi());
        
        tv.getChannels();
        tv.setChannels(semuaChannel);
        tv.setChannels(channelFavorit);
        
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
    }
}