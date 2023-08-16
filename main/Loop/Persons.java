package Loop;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persons {

    private void forLoop() {
        List<Person> persons = List.of();
        List<String> result = new ArrayList<>();

        for(Person p : persons) {
            if (p.getAge() > 18 && p.getAge() <= 65 && p.getName() != null && p.getName().startsWith("B")) {
                result.add(p.getName());
            }
        }
    }
    // Same solution, but slightly more readable
    private void forLoop2() {
        List<Person> persons = List.of();
        List<String> result = new ArrayList<>();

        for (Person p : persons) {
            if (p.getAge() > 18 && p.getAge() <= 65) {
                if (p.getName() != null && p.getName().startsWith("B")) {
                    result.add(p.getName());
                }
            }
        }
    }

        // loop -> filter switch
        private void streaming() {
            List<Person> persons = List.of();
            List<String> result = persons.stream()
                    .filter(p -> p.getAge() > 18)
                    .filter(p -> p.getAge() <= 65)
                    .filter(p -> p.getName() != null)
                    .filter(p -> p.getName().startsWith("B"))
                    .map(p -> p.getName())
                    .collect(Collectors.toList());
        }
    }
