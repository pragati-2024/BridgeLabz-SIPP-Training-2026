import java.util.ArrayList;

public class GenerateSubsets {

    public static void generateSubsets(
            int[] array,
            int index,
            ArrayList<Integer> subset) {

        if (index == array.length) {

            System.out.println(subset);
            return;
        }

        generateSubsets(
                array,
                index + 1,
                subset);

        subset.add(array[index]);

        generateSubsets(
                array,
                index + 1,
                subset);

        subset.remove(subset.size() - 1);
    }

    public static void main(String[] args) {

        int[] array = {1, 2};

        generateSubsets(
                array,
                0,
                new ArrayList<>());
    }
}