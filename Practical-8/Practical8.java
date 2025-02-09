public class Practical8{
    
    public static void main(String[] arg) {
        int size = Integer.parseInt(arg[0]);
        Practical8 pattern = new Practical8();
        System.out.println("First Pattern : --------------------------------");
        pattern.pattern1(1, size);

        System.out.println("Second Pattern : --------------------------------");
        pattern.pattern2(1, size);
        
        System.out.println("Third Pattern : --------------------------------");
        pattern.pattern3(1, size);
    }

    void pattern1(int line, int size) {
        if (line == 0) {
            return;
        }

        star(line); 
        System.out.println();

        if (line < size + 1) {
            pattern1(line + 1, size); 
        }

        star(line-1); 
        System.out.println();
    }


    void pattern2(int line, int size) {
        if (line == 0) {
            return;
        }

        space(size - line + 1); 
        star(line); 
        System.out.println();

        if (line < size) { 
            pattern2(line + 1, size);
        } else { 
            middleLine(size + 1); 
            System.out.println("");
            reversePattern2(size, 2); 
        }
    }

    void reversePattern2(int line, int spaces) {
        if (line == 0) {
            return;
        }

        space(spaces - 1); 
        slash(line); 
        System.out.println();

        reversePattern2(line - 1, spaces + 1); 
    }

    void pattern3(int line, int size) {
        if (line == 0) {
            return;
        }

        space(size - line); 
        star(2 * line - 1); 
        System.out.println();

        if (line < size) {
            pattern3(line + 1, size);
        }

        if (line < size) {
            space(size - line); 
            star(2 * line - 1); 
            System.out.println();
        }

        if (line == 1) {
            plus(2*size - 1, size -1); 
        }
    }

    void star(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("*");
        star(count - 1);
    }

    void space(int count) {
        if (count == 0) {
            return;
        }
        System.out.print(" ");
        space(count - 1);
    }

    void slash(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("/");
        slash(count - 1);
    }

    void middleLine(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("+");
        middleLine(count - 1);
    }

    void plus(int count, int spaces) {
        if (count == 0) {
            return;
        }
        space(spaces);
        System.out.println("+");
        plus(count - 1,spaces);
    }
}
