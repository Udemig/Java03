import java.io.*;


public class DosyaIslemleri {

    File file = new File("/Users/mehmetseyhan/Desktop/QA/Proje01/src/nasilsiniz.txt");
    File file1 = new File("yazim.rtf");

    void dosyaOku(){
        if (file.exists()){
            char[] veriler = new char[(int) file.length()];
           try{
               FileReader fileReader = new FileReader(file);
               fileReader.read(veriler);
               String okunan = new String(veriler);
               System.out.println("okunanVeri: " + okunan);

           } catch (Exception e){
               System.out.println(e.getLocalizedMessage());
           }

        } else {
            System.out.println("Dosya bulunumadi");
        }
    }

    void dosyaOlustur(){
        if (file1.exists()){

            System.out.println("Zaten boyle bir dosya var");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void dosyayaYazdir(){
        try {
            FileWriter fileWriter = new FileWriter(file,true);
            String yazi = " Buralar guzel";
            fileWriter.write(yazi);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void dosyaOku2(){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte dizi[] = new byte[(int) file.length()];
            fileInputStream.read(dizi);
            String verilerimiz = new String(dizi);
            System.out.println("okunanVeriler2: " +verilerimiz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void dosyaYazdir(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String metin = " isvec cok guzel";
            byte veriler[] = metin.getBytes();
            fileOutputStream.write(veriler);
            fileOutputStream.close();

        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    void dosyaOku3(){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String satir = bufferedReader.readLine();

            while (satir != null){
                System.out.println("satirlar: " + satir);
                satir = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e){

        }
    }

    void dosyaYazdir3(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("burasi bir yazdiri");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
