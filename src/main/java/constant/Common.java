package constant;

public class Common {
    public static String commonTeacherTeachClass(String personIntroduce, int klassNumber) {
        return String.join(" ",
                personIntroduce,
                String.format(Constant.TEACHER_TEACH_CLASS, klassNumber));
    }

    public static String commonTeacherNoTeachClass(String personIntroduce) {
        return String.join(" ",
                personIntroduce,
                Constant.TEACHER_NO_TEACH_CLASS);
    }

    public static String commonTeacherTeachPerson(String personIntroduce, String student) {
        return String.join(" ",
                personIntroduce,
                String.format(Constant.TEACHER_TEACH_PERSON, student));
    }

    public static String commonTeacherNoTeachPerson(String personIntroduce, String student) {
        return String.join(" ",
                personIntroduce,
                String.format(Constant.TEACHER_NO_TEACH_PERSON, student));
    }

    public static String commonTeacherTeachClassList(String personIntroduce, String classList) {
        return String.join(" ",
                personIntroduce,
                String.format(Constant.TEACHER_TEACH_CLASS_LIST, classList));
    }

    public static String commonStudentLeader(String personIntroduce, int classNum) {
        return String.join(" ",
                personIntroduce,
                String.format(Constant.STUDENT_LEADER_INTRODUCE, classNum));
    }

    public static String commonStudentNoLeader(String personIntroduce, int classNum) {
        return String.join(" ",
                personIntroduce,
                String.format(Constant.STUDENT_INTRODUCE, classNum));
    }
}
