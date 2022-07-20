package constant;

public class Common {
    public static String commonTeacherTeachClass(String name, int age, int klassNumber) {
        return String.join(" ",
                String.format(Constant.PERSON_INTRODUCE, name, age),
                String.format(Constant.TEACHER_TEACH_CLASS, klassNumber));
    }

    public static String commonTeacherNoTeachClass(String name, int age) {
        return String.join(" ",
                String.format(Constant.PERSON_INTRODUCE, name, age),
                Constant.TEACHER_NO_TEACH_CLASS);
    }

    public static String commonTeacherTeachPerson(String name, int age, String student) {
        return String.join(" ",
                String.format(Constant.PERSON_INTRODUCE, name, age),
                String.format(Constant.TEACHER_TEACH_PERSON, student));
    }

    public static String commonTeacherNoTeachPerson(String name, int age, String student) {
        return String.join(" ",
                String.format(Constant.PERSON_INTRODUCE, name, age),
                String.format(Constant.TEACHER_NO_TEACH_PERSON, student));
    }

    public static String commonTeacherTeachClassList(String name, int age, String classList) {
        return String.join(" ",
                String.format(Constant.PERSON_INTRODUCE, name, age),
                String.format(Constant.TEACHER_TEACH_CLASS_LIST, classList));
    }

    public static String commonStudentLeader(String name, int age, int classNum) {
        return String.join(" ",
                String.format(Constant.PERSON_INTRODUCE, name, age),
                String.format(Constant.STUDENT_LEADER_INTRODUCE, classNum));
    }

    public static String commonStudentNoLeader(String name, int age, int classNum) {
        return String.join(" ",
                String.format(Constant.PERSON_INTRODUCE, name, age),
                String.format(Constant.STUDENT_INTRODUCE, classNum));
    }
}
