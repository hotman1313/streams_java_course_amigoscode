package lectures;

import beans.Person;
import java.util.ArrayList;
import java.util.List;
import mockdata.MockData;
import org.junit.Test;

public class Lecture12 {
  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
        .collect(() -> new ArrayList<String>(), (list, el) -> list.add(el), (list1,list2) -> list1.addAll(list2));

    emails.forEach(System.out::println);
  }
}
