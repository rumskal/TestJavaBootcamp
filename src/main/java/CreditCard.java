//
//class TransProcessException extends Exception{}
//class FinancTransFaultMess extends  TransProcessException{}
//public class CreditCard {
//    public void doFinaTrans() throws RuntimeException{//A
//        try{
//            throw new FinancTransFaultMess();
//        }
//        catch(Exception e){
//            throw new NullPointerException();
//                    }
//        finally{
//            throw new TransProcessException();//B
//        }
//                }
//
//    public static void main(String[] args) {
//        new CreditCard().doFinaTrans();//c
//    }
//}
