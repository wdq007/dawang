import java.util.LinkedHashSet;
import java.util.Set;

/**
 *  Page 57
 *  程序清单 21-3
 */
public class TestLinkedHashSet {

    public static void main(String[] args){

        Set<String> zheJiangCities = new LinkedHashSet<>();
        zheJiangCities.add("Hangzhou");
        zheJiangCities.add("Ningbo");
        zheJiangCities.add("Wenzhou");
        zheJiangCities.add("Shaoxing");
        zheJiangCities.add("Jiaxing");
        zheJiangCities.add("Huzhou");
        zheJiangCities.add("Taizhou");
        zheJiangCities.add("Jinhua");

        System.out.print(zheJiangCities);

        for(String city:zheJiangCities){
            System.out.print(city.toLowerCase()+ " ");
        }
    }
}
