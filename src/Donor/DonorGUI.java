package Donor;

import Implementation.DonarImplementation;
import Interface.ConsumerInterface;
import Interface.DonarInterface;
import User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DonorGUI {
    private List<Donor> donorList = new ArrayList<>();
    public DonorGUI() {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 2 ; i++) {
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            String userName = scanner.nextLine();
            String password = scanner.nextLine();
            String role = scanner.nextLine();

            User user = new User(i+1, firstName, lastName, userName, password, role );
            Donor donor = new Donor(user);
            donorList.add(donor);
        }
        for(Donor donor : donorList) {
            DonarInterface donorInterface = new DonarImplementation();
            User donarUser = donorInterface.getParentUser(donor);
            System.out.println(donarUser);
            ConsumerInterface consumerInterface = new DonarImplementation();
            //User consumerUser = consumerInterface.getParentUser(consumer);
        }
    }

    public static void main(String[] args) {
        new DonorGUI();
    }
}
