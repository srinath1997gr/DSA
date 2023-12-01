public class DyanmicStack extends CustomStack {

    public DyanmicStack() {
        super();
    }

    public DyanmicStack(int size) {
        super(size);
    }

    public boolean push(int size) throws StackException {
        if (isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(size);
    }

}
