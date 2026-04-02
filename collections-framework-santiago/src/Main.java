import com.codeforall.online.interfaces.list.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new User("Tiago",24));
        arrayList.add(new User("Santiago", 33));

        System.out.println(arrayList.get(0));

    }
}