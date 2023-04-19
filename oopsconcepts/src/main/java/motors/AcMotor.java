package motors;

import interfaces.Imotor;

public class AcMotor implements Imotor {
    @Override
    public void startmotor() {
        System.out.println("AC motor started");
    }

    @Override
    public void stopmotor() {
        System.out.println("AC motor stoped");
    }
}
