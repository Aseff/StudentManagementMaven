package annotationtest;

import annotationtest.Teacher;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {

    public static void main(String[] args) throws Exception {
        Teacher t = new Teacher();
        Student[] ss = {new Student()};
        t.setStudents(ss);

        checknotNull(t);

    }

    public static void checknotNull(Object t) throws Exception {
        Method[] methods = t.getClass().getDeclaredMethods();

        for (int i = 0; i < methods.length; i++) {
            Method m = methods[i];
            Annotation[] annotation = m.getAnnotations();
            System.out.println(methods[i].getName());

            for (int j = 0; j < annotation.length; j++) {
                Annotation ann = annotation[j];
                if (ann.annotationType() == Boshqalmasin.class) {
                    Object result = m.invoke(t);
                    if (result == null) {
                        throw new IllegalArgumentException("Bosh qalmasin ");

                    }
                    if (result instanceof Object[]) {
                        Object[] arr = (Object[]) result;
                        if (arr.length == 0) {
                            throw new IllegalArgumentException("Array bos qalmasin");
                        }
                    }

                }

                System.out.println("ann" +ann.annotationType());
            }
            System.out.println("----------");

        }

    }

}
