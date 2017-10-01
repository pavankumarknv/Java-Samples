package com.demo.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsTest {

    public static void main(String args[]) {
        List<Demo> demos = new ArrayList<>();
        demos.add(new Demo("Services", "sample", "S10"));
        demos.add(new Demo("Services", "sample1", "S19"));
        demos.add(new Demo("Services", "sample2", "S25"));
        demos.add(new Demo("Services", "sample3", "S99"));
        demos.add(new Demo("HR", "sample11", "H12"));
        demos.add(new Demo("HR", "sample12", "H13"));
        demos.add(new Demo("Finance", "sample13", "F8"));
        demos.add(new Demo("Finance", "sample13", "F9"));
        demos.add(new Demo("Finance", "sample13", "F11"));
        demos.add(new Demo("PR", "sample13", "P12"));
        demos.add(new Demo("MARKET", "sample13", "M1"));
        //Creating a map from the list of Object with dept as key
        Map<String, List<Demo>> passingFailing = demos.stream().collect(Collectors.groupingBy(Demo::getDept));
        System.out.println(passingFailing.keySet());

    }

}
