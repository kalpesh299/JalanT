package motors;

import interfaces.Imotor;

public class DcMotor implements Imotor {
    @Override
    public void startmotor() {
        System.out.print("DC motor started");
    }

    @Override
    public void stopmotor() {
        System.out.print("DC motor stoped");
    }
}
