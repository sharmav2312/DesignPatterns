package Adapter;

public class WallSocketImpl implements WallSocket {

    @Override
    public Volt getVolts() {
        // TODO Auto-generated method stub
        return new Volt(240);
    }
    
}
