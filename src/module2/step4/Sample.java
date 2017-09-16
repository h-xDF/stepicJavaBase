package module2.step4;

public class Sample {

    public static void main(String[] args) {
        String[] roles = {"1", "2"};
        String[] textLines = {"1: 1 1: 1111 1 1 ", "2: 22 2 2 2 2 2", "1: 333333333333"};

        String[] rolesTest = {"Городничий","Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textTest = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        System.out.println(printTextPerRole(roles,textLines));
        System.out.println(printTextPerRole(rolesTest,textTest));
    }


    private static String printTextPerRole(String[] roles, String[] textLines) {

        for (int i = 0; i < roles.length; i++) {
            roles[i] = roles[i] + ':';
        }

        int count = 0;
        int countRoles = roles.length;
        StringBuilder[] text = new StringBuilder[countRoles];

        for(String line : textLines) {

            count ++; // count phrases

            for (int i = 0; i < countRoles; i++) {

                /* check prefix (role)*/
                if (line.startsWith(roles[i])) {
                    if(text[i] == null) {
                        text[i] = new StringBuilder(String.valueOf(count));
                    } else {
                        text[i].append(count);
                    }
                    text[i].append(')');
                    text[i].append(line.replaceFirst(roles[i], "")); // replace "role:"
                    text[i].append('\n');

                }
            }
        }

        StringBuilder resultBuilder = null;

        for(int i = 0; i < countRoles; i++) {

            if (resultBuilder == null) {
                resultBuilder =  new StringBuilder(roles[i]);
            } else {
                resultBuilder.append(roles[i]);
            }
            resultBuilder.append('\n');
            resultBuilder.append(text[i]);
            resultBuilder.append('\n');
        }

        return resultBuilder.toString();
    }
}
