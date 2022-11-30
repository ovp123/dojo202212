package operator;

import java.util.List;
import java.util.stream.Collectors;

public class Plus {

    public static void main(String[] args) {

        System.out.println(1 + 1);                       // 2
        System.out.println(1 + "1");                     // 11
        System.out.println(1 + 1 + "1");                 // 21
        System.out.println(1 + 1 + "1" + 2 + 3);         // 2123
        System.out.println(1 + 1 + "1" + 2 * 3);         // 216
        System.out.println(1 + 1 + "1" + (2 + 3));       // 215
        System.out.println(1 + 'd');                     // 101
        System.out.println('d');                         // d
        System.out.println('d' + "d");                   // dd
        System.out.println('d' + 'd' + "d");             // 200d
        System.out.println(100 + "d");                   // 100d
        System.out.println((char)100 + "d");             // dd
        System.out.println((char)0144 + "d");            // dd

        System.out.println(Integer.valueOf(1) + "d");
        System.out.println((Object)Integer.valueOf(1) + "d");

//
//        System.out.println(buildRequest(List.of("arg1","arg2","arg3"), "table", List.of("arg1 = '1'")));
    }


    private static String buildRequest(List<String> fields, String table, List<String> whereCondition) {
        StringBuilder request = new StringBuilder(200);
        request.append("Select ");
        request.append(String.join(",", fields));
        request.append(" from ");
        request.append(table);
        if (whereCondition.size() > 0){
            request.append(" where ");
            request.append(String.join(" and ", whereCondition ));
        }
        request.append(" order by arg1");
        return request.toString();

    }

    private static String buildRequest2(List<String> fields, String table, List<String> whereCondition) {
        return "Select " + String.join(",", fields)
                + " from " + table
                + getWhereCondition(whereCondition)
                + " order by arg1";

    }

    private static String getWhereCondition(List<String> whereCondition) {
        return whereCondition.size() == 0 ? null :
            " where " + String.join(" and ", whereCondition);
        }
    }
