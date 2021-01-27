import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * 程序清单20-2
 *
 */
public class TestIterator {
    public static void main(String[] args){
        Collection<String> chinaTopUniversities= new ArrayList<>();
        chinaTopUniversities.add("Peking University");
        chinaTopUniversities.add("Tsinghua University");
        chinaTopUniversities.add("Shanghai JiaoTong University");
        chinaTopUniversities.add("Fudan Univisity");
        chinaTopUniversities.add("Zhejiang University");
        chinaTopUniversities.add("China University of Science and Technology");
        chinaTopUniversities.add("Nanjing University");

        Iterator<String>  iterator = chinaTopUniversities.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next().toUpperCase()+";");
        }
        System.out.println();

    }
}
