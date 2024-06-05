import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Olympics {
    private static< A extends Collection<B>,B>B add(A list, B element){
        list.add(element);
        return element;
    }

    public static void main(String[] args) {
        List<String> hosts = new ArrayList<>();
        add(hosts, "London");
        add(hosts, "Athens");
        add(hosts, "London");
        System.out.println(hosts);
    }
}
