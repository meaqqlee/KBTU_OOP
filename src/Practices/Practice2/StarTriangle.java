package Practices.Practice2;

public class StarTriangle {
    private int width;
    public StarTriangle(int width) {
        this.width = width;
    }

    public String triangle(int width) {
        StringBuilder builder = new StringBuilder();

        for(int i = 1; i <= width; i++) {
            for(int j = 0; j < i; j++) {
                builder.append("[*]");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        StarTriangle starTriangle = new StarTriangle(10);
        System.out.println(starTriangle.triangle(10));
    }
}
