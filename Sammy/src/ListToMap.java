import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
  
// create a list
class Studentzz {
  
    // id will act as Key
    private Integer id;
  
    // name will act as value
    private String name;
  
    public Studentzz(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }
  
    public Integer getId()
    {
        return id;
    }
  
    public String getName()
    {
        return name;
    }
}
  
// main class and method
public class ListToMap {
  
    public static void main(String[] args)
    { 
        List<Studentzz>lt = new ArrayList<Studentzz>();
  
        lt.add(new Studentzz(1, "Geeks"));
        lt.add(new Studentzz(2, "For"));
        lt.add(new Studentzz(3, "Geeks"));
  

        Map<Integer, String> map = new HashMap<>();
  
        for (Studentzz stu : lt) {
            map.put(stu.getId(), stu.getName());
        }

        System.out.println("Map  : " + map);
    }
}