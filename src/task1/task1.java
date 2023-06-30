package task1;

import java.util.HashMap;
import java.util.Map;

public class task1
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", null);

        System.out.println("initial map: " + map);

        System.out.println("Modified map: " + doQuery(map));

    }
    public static String doQuery(Map<String, String> map)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<String,String> pair : map.entrySet())
        {
            if (pair.getValue() != null)
            {
                stringBuilder.append(pair.getKey() +"=" + pair.getValue()+" ");
            }

        }

        return stringBuilder.toString();
    }
}


/*
1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
        Данные для фильтрации приведены ниже в виде json-строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/


