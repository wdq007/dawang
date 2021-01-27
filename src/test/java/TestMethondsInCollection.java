import java.util.HashSet;

/**
 * Page 56
 * 程序清单21-2
 *
 */
public class TestMethondsInCollection {

    public static void main(String args[]){
        java.util.Set<String> chineseMajorCities = new HashSet<>();
        chineseMajorCities.add("Beijing");
        chineseMajorCities.add("Shanghai");
        chineseMajorCities.add("Shenzhen");
        chineseMajorCities.add("Guangzhou");
        chineseMajorCities.add("Hangzhou");

        System.out.println("Chinese major cities: "+chineseMajorCities);
        System.out.println(chineseMajorCities.size()+" major cites in China");//size返回集合中元素个数
        chineseMajorCities.remove("Guangzhou");
        System.out.println(chineseMajorCities.size()+" major cities in China now");

        java.util.Set<String> zhejiangCities = new HashSet<>();
        zhejiangCities.add("Hangzhou");
        zhejiangCities.add("Ningbo");
        zhejiangCities.add("Wenzhou");
        System.out.println("Zhenjiang major cities: " + zhejiangCities);
        System.out.println(zhejiangCities.size()+ " cities in Zhejiang");
        System.out.print("Is Chengdu in Zhejiang? "+zhejiangCities.contains("Chengdu"));

        chineseMajorCities.addAll(zhejiangCities);
        System.out.println("\nAfter add Zhejiang cities to Chinese cities, Chinese cities is " + chineseMajorCities);

        chineseMajorCities.removeAll(zhejiangCities);
        System.out.println("After remove Zhejiang cities from Chinese cites, Chinese cities is "+ chineseMajorCities);


        chineseMajorCities.retainAll(zhejiangCities);
        System.out.println("After removing non comment cities in Zhejiang citeis " + "from Chinese cities, Chinese cities are now "
        +chineseMajorCities);


    }
}
