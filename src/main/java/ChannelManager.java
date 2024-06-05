//public class ChannelManager {
//    private volatile boolean terminate = false;
//
//    private void clearQueue() {
//    }
//
//    private void clearMap() {
//    }
//
//    private void terminate(boolean hardTerminate) {
//        System.out.println("Terminating ChannelMgr:" + hardTerminate);
//
//        terminate = true;
//        synchronized (terminate) {//A
//            if (hardTerminate) {
//                clearQueue();
//                clearMap();
//            }
//            this.notify();//B
//        }
//    }
//
//    public static void main(String[] args) {
//        ChannelManager cm = new ChannelManager();
//        cm.terminate(true);
//    }
//}
