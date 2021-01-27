import java.util.ArrayList;
import java.util.Collection;

/**
 * 程序清单20-1
 */
public class TestCollection {
    public static void main(String[] args){

        ArrayList<String> chinaMajorCities= new ArrayList<>();
        chinaMajorCities.add("Beijing");
        chinaMajorCities.add("Shanghai");
        chinaMajorCities.add("Guangzhou");
        chinaMajorCities.add("Shenzhen");
        chinaMajorCities.add("Hangzhou");

        System.out.println("A list of cities in China Major Cities");
        System.out.println(chinaMajorCities);

        System.out.println("\nIs Shenzhen in China Major Cities? "
                +chinaMajorCities.contains("Shenzhen"));

        chinaMajorCities.remove("Shenzhen");
        System.out.println("\n"+chinaMajorCities.size()+ " cities are in China Major cities now");


        Collection<String> zheJiangMajorCities = new ArrayList<>();
        zheJiangMajorCities.add("Hangzhou");
        zheJiangMajorCities.add("Ningbo");
        zheJiangMajorCities.add("Wenzhou");
        zheJiangMajorCities.add("Shaoxing");

        System.out.println("\nA list of cities in Zhejiang Major Cities");
        System.out.println(zheJiangMajorCities);

        ArrayList<String> chinaCities = (ArrayList<String>) chinaMajorCities.clone();
        chinaCities.addAll(zheJiangMajorCities);
        System.out.println("\nCities in China Major Cities or Zhejiang Major Cities");
        System.out.println(chinaCities);

        chinaCities = (ArrayList<String>) chinaMajorCities.clone();
        chinaCities.retainAll(zheJiangMajorCities);
        System.out.println("\nCities in China Major Cities and Zhenjiang Major Cities");
        System.out.println(chinaCities);


        chinaCities = (ArrayList<String>) chinaMajorCities.clone();
        chinaCities.removeAll(zheJiangMajorCities);
        System.out.println("\nCities in China Major Cities, but not in Zhejiang Major Cities");
        System.out.println(chinaCities);

    }
}
