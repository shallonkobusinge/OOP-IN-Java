package Polymorphism.MethodOverriding;

public class Takeoff {
    public static void main(String[] args) {
        CargoPilot cargoPilot = new CargoPilot();
        cargoPilot.FlyPlane();
        CivilianPilot civilianPilot = new CivilianPilot();
        civilianPilot.FlyPlane();
    }
}
