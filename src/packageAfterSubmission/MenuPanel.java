package packageAfterSubmission;


import java.util.Scanner;

public class MenuPanel extends PatikaStoreMain {

    public MenuPanel() {
        super();
        // MenuPanel.mainMenu();
        // Product product = new Product(null, 0, 0, 0, 0, null, null);

    }

    public static void printMainMenuPanel() {

        System.out.println(
                "*******************************\n*   WELCOME TO PATIKA STORE   *\n*******************************\nProduct Management System:\n1 - Product Operations\n2 - Brand Operations\n3 - Listing Operations \n0 - Exit\nPlease Choose (0-3): ");

    }

    public static void printProductMenuPanel() {

        System.out.println(
                "****************\n* PRODUCT MENU *\n****************\n1 - Add Product \n2 - Delete Productby Id\n3 - List Product by Group \n4 - List Product by ID\n5 - List Product by Brand\n0 - Return Product Management System \nPlease Choose (0-6): ");
    }

    public static void printBrandMenuPanel() {

        System.out.println(
                "**************\n* BRAND MENU *\n**************\n1 - Add Brand \n2 - List Brand \n0 - Return Product Management System\nPlease Choose (0-2): ");

    }

    public static void printListMenuPanel() {

        System.out.println(
                "****************\n* LISTING MENU *\n****************\n1 - List by Product Group\n2 - List by Brands \n3 - List by Product Id\n0 - Return Product Management System\nPlease Choose (0-3): ");
    }

    public static void printNotebookMenuPanel() {

        System.out.println(
                "*****************\n* NOTEBOOK MENU *\n*****************\n1 - Add a Notebook Operations\n2 - Mobile Phone Operations\n3 - Brand Listing \n0 - Exit\nPlease Choose (1-2-3-0): ");

    }

    public static void printInvalidInputMessage() {

        System.out.println("\nSorry but You have entered an invalid number.\nPlease Try Again");

    }

    public static void mainMenu() {
        boolean isError = true;
        Scanner scan = new Scanner(System.in);
        while (isError) {
            try {
                printMainMenuPanel();
                int selection = scan.nextInt();

                switch (selection) {

                    case 0:
                        System.out.println("\nHope to See You Soon\n");
                        break;
                    case 1:
                        productMenu();
                        break;
                    case 2:
                        brandMenu();
                        break;
                    case 3:
                        listMenu();
                        break;

                    default:
                        printInvalidInputMessage();
                        mainMenu();
                        break;
                }
                isError = false;

            } catch (Exception e) {
                printInvalidInputMessage();
                mainMenu();
            }

        }
        scan.close();
    }

    public static void productMenu() {

        System.out.println();
        boolean isError = true;
        Scanner scan = new Scanner(System.in);
        while (isError) {
            try {
                printProductMenuPanel();
                int selection = scan.nextInt();

                switch (selection) {

                    case 0:
                        mainMenu();
                        break;
                    case 1:
                        Product.createProductID();
                        break;
                    case 2:
                        Product.deleteProductById();

                        break;
                    case 3:
                        // Product.ListProductByGroup();

                        break;
                    case 4:
                        Product.ListProductById();

                        break;
                    case 5:
                        Product.ListProductByBrand();

                        break;

                    default:
                        printInvalidInputMessage();
                        productMenu();
                        break;
                }
                isError = false;

            } catch (Exception e) {
                printInvalidInputMessage();
                productMenu();
            }

        }
        scan.close();

    }

    public static void brandMenu() {

        System.out.println();
        boolean isError = true;
        Scanner scan = new Scanner(System.in);
        while (isError) {
            try {
                printBrandMenuPanel();
                int selection = scan.nextInt();

                switch (selection) {

                    case 0:
                        mainMenu();
                        break;
                    case 1:
                        Brand.addBrand();
                        break;
                    case 2:
                        Brand.listBrand();
                        break;
                    default:
                        printInvalidInputMessage();
                        mainMenu();
                        break;
                }
                isError = false;

            } catch (Exception e) {
                printInvalidInputMessage();
                mainMenu();
            }

        }
        scan.close();

    }

    public static void listMenu() {

        boolean isError = true;
        Scanner scan = new Scanner(System.in);
        while (isError) {
            try {
                printListMenuPanel();
                int selection = scan.nextInt();

                switch (selection) {

                    case 0:
                        mainMenu();
                        break;
                    case 1:
                        notebookMenu();
                        break;
                    case 2:
                        mobilePhoneMenu();

                        break;
                    case 3:
                        brandMenu();
                        Brand.print();
                        break;

                    default:
                        printInvalidInputMessage();
                        mainMenu();
                        break;
                }
                isError = false;

            } catch (Exception e) {
                printInvalidInputMessage();
                mainMenu();
            }

        }
        scan.close();

    }

    public static void notebookMenu() {

        System.out.println();
        boolean isError = true;
        Scanner scan = new Scanner(System.in);
        while (isError) {
            try {
                printMainMenuPanel();
                int selection = scan.nextInt();

                switch (selection) {

                    case 0:
                        System.out.println("Hope to See You Soon");
                        break;
                    case 1:
                        notebookMenu();
                        break;
                    case 2:
                        mobilePhoneMenu();

                        break;
                    case 3:
                        brandMenu();
                        Brand.print();
                        break;

                    default:
                        printInvalidInputMessage();
                        mainMenu();
                        break;
                }
                isError = false;

            } catch (Exception e) {
                printInvalidInputMessage();
                mainMenu();
            }

        }
        scan.close();

    }

    public static void mobilePhoneMenu() {

        System.out.println(
                "*******************************\n* WELCOME TO MOBILE PHONE MENU*\n*******************************\n");

    }

}
