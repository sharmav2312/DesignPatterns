package Adapter;

public class ClientTest {
    
    public static void main(String[] args) {
        WallSocket wallSocket = new WallSocketImpl();
        Volt v240 = wallSocket.getVolts();
        System.out.println(v240);

        MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);

        Volt v3 = mobileAdapter.get3Volt();
        System.out.println(v3);
            
        }
    }

