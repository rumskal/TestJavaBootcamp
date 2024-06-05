//import java.util.concurrent.*;
//
//public class FileDownload {
//    public void downloadFile(){
//        ExecutorService exceuService = Executors.newCachedThreadPool();
//        Future result = exceuService.submit(()->System.out.print(""));
//        exceuService.shutdown();//A
//        System.out.println(result.get());//B
//    }
//
//    public static void main(String[] memo) {
//        try{
//            new FileDownload().downloadFile();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//}
