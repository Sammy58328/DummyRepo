import java.io.BufferedReader;
import java.io.InputStreamReader;

class Std {
    String name;
    int roll, p, c, m;            //As the primitive data-types are not object, JAVA is not fully OOP.
    double s;

    Std()    //Using Constructor; constructor has no return type not even void
    {
        name = " ";
        roll = p = c = m = 0;
        s = 0.00;
    }

    void input() throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter the Name");
        name = reader.readLine();
        System.out.println("Enter the Roll No.:");
        roll = Integer.parseInt(reader.readLine());
        System.out.println("Enter the marks of Physics:");
        p = Integer.parseInt(reader.readLine());
        System.out.println("Enter the marks of Chemistry:");
        c = Integer.parseInt(reader.readLine());
        System.out.println("Enter the marks of Mathematics:");
        m = Integer.parseInt(reader.readLine());
    }

    void calculate() {
        s = (p + c + m) / 3;
    }

    void display() {
        System.out.println("Name : " + name + "\n Roll No.: " + roll + "\n Physics Marks: " + p + "\n Chemistry Marks: " + c + "\n Mathematics Marks: " + m + "\n Science Marks: " + s);
    }
}

class Student {
    public static void main(String args[]) throws Exception {
        Std st = new Std();
        st.input();
        st.calculate();
        st.display();
    }
}