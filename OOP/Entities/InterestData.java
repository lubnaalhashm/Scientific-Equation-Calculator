package OOP.Entities;

public class InterestData {
    private float principal;
    private float rate;
    private float time;
    private PhysicsData PD;

    public float getPrincipal() {
        return principal;
    }

    public void setPrincipal(float principal) {
        this.principal = principal;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public PhysicsData getPD() {
        return PD;
    }

    public void setPD(PhysicsData PD) {
        this.PD = PD;
    }
}
