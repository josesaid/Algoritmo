package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mkyong.json.gson.model.Item;

import java.lang.reflect.Type;
import java.util.List;

public class GsonParseJsonArrayExample1 {

    public static void main(String[] args) {

        String json = """
                [
                  {
                    "id": 1, "name": "a"
                  },
                  {
                    "id": 2, "name": "b"
                  }
                ]
                """;

        Gson gson = new Gson();

        // create a List<Item>
        Type listItemType = new TypeToken<List<Item>>() {}.getType();

        // convert json array to List<Item>
        List<Item> list = gson.fromJson(json, listItemType);

        list.forEach(System.out::println);
    }
}
