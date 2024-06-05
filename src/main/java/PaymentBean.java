//interface MessageDrivenBean{
//    String SERIAL = "AB123456";
//    default String getSerial(){
//        return SERIAL;
//    }
//}
//interface MessageListener{
//    String SERIALCODE = "AB123456";
//    default String getSerial(){
//        return SERIALCODE;
//    }
//}
//public class PaymentBean implements MessageDrivenBean, MessageListener{
//    public static void main(String[] args) {
//        class BulkPaymentBean extends PaymentBean{
//            @Override public String getSerial(){
//                return "AB234567";
//            }
//        };
//        System.out.println(new BulkPaymentBean().getSerial());
//    }
//}
//
