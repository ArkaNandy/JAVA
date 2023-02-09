package Interviewquestionsjava;

public class whitespacesremoving {
    public static void main(String[] args) {
        String s = " a    rr r   kkk   aaa  N nnn aaa   n     dd     y";
        System.out.println("Before removing the white spaces " + s);

        String y = s.replaceAll("\\s", "");
        System.out.println("After removing the white spaces " + y);
    }

}
