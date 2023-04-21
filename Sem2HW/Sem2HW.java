/*Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/

package Sem2HW;
import java.util.HashMap;
import java.util.Map;

public class Sem2HW {
    public static String getRequest(Map<String, String> filter)
    {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> pair : filter.entrySet())
        {
            if (pair.getValue() != null)
            {
                builder.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        builder.delete(builder.toString().length()-5,builder.toString().length());
        return builder.toString();
    }
    public static void main(String[] args) {
        Map<String, String> filters = new HashMap<String, String>();
        filters.put("name","Ivanov");
        filters.put("country","Russia");
        filters.put("city","Moscow");
        filters.put("age",null);
        System.out.println(getRequest(filters));
    }
}