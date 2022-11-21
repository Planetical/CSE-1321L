public class FSAb {
    int state;
    boolean active = true;

    FSAb(int s) {
        state = s;
    }

    public int goToNextState() {
        state++;
        if (state > 3) {
            state = 0;
        }
        return state;
    }

    public boolean end() {
        if (state == 3) {
            return true;
        } else {
            return false;
        }
    }

    public int showCurrentState() {
        return state;
    }

    public boolean isActive() {
        return active;
    }
}
