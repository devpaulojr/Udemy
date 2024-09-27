import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        //List

        System.out.print("Enter your list size: ");

        int user = sc.nextInt();

        List<Emplyoee> list = new ArrayList<>();

        //Date entry

        for(int line = 0; line < user; line ++){

            System.out.println("Number: " + (line+1));

            System.out.print("Enter your id: ");
            int id = sc.nextInt();

            while(hashId(list, id)){
                System.out.print("Id already taken! try again: ");
                id = sc.nextInt();
            }

            System.out.print("Enter your name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Enter your salary: ");
            double salary = sc.nextDouble();

            Emplyoee funcionario = new Emplyoee(id, name, salary);

            list.add(funcionario);

        }

        System.out.print("Enter the employee id that will have salary increase :");
        int localeId = sc.nextInt();

        Emplyoee funcionario = list.stream().filter(x -> x.getId() == localeId).findFirst().orElse(null);

        if(funcionario == null){
            System.out.println("\n");
            System.out.println("This id does not exist!!");
        }
        else{
            System.out.println("\n");
            System.out.print("Enter your percentage: % ");
            double percentage = sc.nextDouble();

            funcionario.Addsalary(percentage);
        }

        //Output date

        System.out.println("\n");

        System.out.println("List emplyoee: ");

        for(Emplyoee emp : list){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Boolean hashId(List<Emplyoee> list, int id){
        Emplyoee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}