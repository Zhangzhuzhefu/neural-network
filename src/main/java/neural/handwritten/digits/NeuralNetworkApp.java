package neural.handwritten.digits;
import java.util.List;

public class NeuralNetworkApp {

    public static void main(String[] args){
        // load data
        List<List<Data>> data;
        Loader loader = new Loader();
        System.out.println("loading data...");
        data = loader.loadAllData();
        List<Data> trainingData = data.get(0);
        List<Data> testData = data.get(1);
        System.out.println("finished loading");

        // test
        int[] sizes = {784, 30, 10};
        Network n = new Network(sizes);
        n.sgdTrain(trainingData, testData, 50, 200, 2.);
    }

}
