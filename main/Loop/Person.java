package Loop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private String gender;
    private int age = 20;
    private List<Person> siblings;

    public Person(String name, int age, String gender, List<Person> siblings) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.siblings = siblings;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    private void forLoop() {
        List<Person> persons = List.of();
        List<String> result = new ArrayList<>();
        for (Person p : persons) {
            if (p.getAge() > 18) {
                result.add(p.getName());
            }
        }
    }
    private void streaming() {
        List<Person> persons = List.of();
        List<String> result = persons.stream()
                .filter(p -> p.getAge() > 18)
                .map(p -> p.getName())
                .collect(Collectors.toList());
    }
}
