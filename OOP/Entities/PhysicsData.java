package OOP.Entities;

public class PhysicsData {
    private float mass;
    private float acceleration;
    private MotionData MD;

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public MotionData getMD() {
        return MD;
    }

    public void setMD(MotionData MD) {
        this.MD = MD;
    }
}
