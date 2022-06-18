public class BmiService {
    public int calculate(int height, int weight) {

        int height1 = (height * height) / 100;
        int index = weight * 100 / height1;
        return index;

    }

}
