package Sub9.lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaTest {
    static void main() throws ClassNotFoundException {
        Class clazz = String.class; //객체
        //Class clazz02 = new String().getClass(); //getclass
        //Class clazz03 = Class.forName("Sub9.lang.clazz"); //이름
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            //System.out.println(field);
            System.out.println(field.getType()+ " " +field.getName());
        }
        System.out.println();
        System.out.println(clazz.getSuperclass().getName());

    }
}
