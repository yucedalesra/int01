import java.util.ArrayList;
import java.util.List;

public class Q01 {

    /*
    Create a Phyton function which will filter list object by containing string '123'
    and return new list object containing filtered elements

    '123' dizesini içeren liste nesnesini filtreleyecek
    ve filtrelenmiş öğeler içeren yeni liste nesnesini döndürecek bir Python işlevi oluşturun
     */

    public static void main(String[] args) {
        System.out.println(Q01.myStringList());
    }
    public static List<String> myStringList(){

        List<String> myList = new ArrayList<String>();
        List<String> myList2 = new ArrayList<String>();
        myList.add("123");
        myList.add("333");
        myList.add("444");

        for (int i = 0; i <myList.size() ; i++) {
            if (myList.get(i).contains("123")){
                myList2.add(myList.get(i));
            }

        }
        
        return myList2;
    }
}
