public class FSA {
    int state;

    FSA(int s) {
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
}
