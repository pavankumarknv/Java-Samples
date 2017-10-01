package com.demo.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonStringToJavaMap {

    private static ObjectMapper mapper = new ObjectMapper();

    // This class converts the JSON string into a JAVA map using JACKSON-2.8.6 library
    public static void main(String args[]) throws Exception {
        System.out.println("start");
        String value = "{\"Dept1\":{\"64\":[43]},\"Dept2\":{\"61\":[6,7,8]},\"Dept3\":{\"51\":[1,2,3,4,5],\"55\":[11]}}";

        HashMap<String, Map<Long, List<Integer>>> jsonMap = null;
        try {
            jsonMap = mapper.readValue(value, new TypeReference<Map<String, Map<Long, List<Integer>>>>() {
            });
        } catch (Exception e) {
            throw new Exception("Problem with data");
        }

        System.out.println(jsonMap);
        TestDomain domain = new TestDomain();
        domain.setJsonMap(jsonMap);

        System.out.println(domain.getJsonMap().get("Dept2"));
        Map<Long, List<Integer>> data = domain.getJsonMap().get("Dept2");
        System.out.println("data:" + data.get(Long.valueOf(61l)));

        System.out.println(domain.getJsonMap().get("Dept3"));
        data = domain.getJsonMap().get("Dept3");
        System.out.println("data:" + data.get(Long.valueOf(51l)));
        System.out.println("data:" + data.get(Long.valueOf(55l)));

        System.out.println(domain.getJsonMap().get("Dept1"));
        data = domain.getJsonMap().get("Dept1");
        System.out.println("data:" + data.get(Long.valueOf(64l)));

        System.out.println("end");
    }
}
