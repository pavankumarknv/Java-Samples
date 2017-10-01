package com.demo.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestDomain {
    HashMap<String, Map<Long, List<Integer>>> jsonMap;

    public Map<String, Map<Long, List<Integer>>> getJsonMap() {
        return jsonMap;
    }

    public void setJsonMap(HashMap<String, Map<Long, List<Integer>>> jsonMap) {
        this.jsonMap = jsonMap;
    }

}
