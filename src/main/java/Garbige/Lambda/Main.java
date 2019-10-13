package Garbige.Lambda;

public class Main {
    public static void main(String[] args) {

        Experiment experiment = x -> x+15;
        System.out.println(experiment.Experiment(1));

        int[] arr = new int[]{1,2,3,2,5,9,0,4,1,4};

        Experimant2 experimant2 = arr1 -> arr[2];
        System.out.println(experimant2.experiment2(arr));

        TrueFalse trueFalse = () -> false;
        System.out.println(trueFalse.trueFalse());

    }
}
