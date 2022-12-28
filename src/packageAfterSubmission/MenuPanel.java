package packageAfterSubmission;

import java.util.Scanner;

public class MenuPanel extends PatikaStoreMain {

    private static final String mainMenuPanel = "*******************************\n*   WELCOME TO PATIKA STORE   *\n*******************************\nProduct Management System:\n1 - Product Operations\n2 - Brand Operations\n3 - Listing Operations \n0 - Exit\nPlease Choose (0-3): ";

    private static final String productMenuPanel = "****************\n* PRODUCT MENU *\n****************\n1 - Add Product \n2 - Delete Productby Id\n3 - List Product by Group \n4 - List Product by ID\n5 - List Product by Brand\n0 - Return Product Management System \nPlease Choose (0-6): ";

    private static final String brandMenuPanel = "**************\n* BRAND MENU *\n**************\n1 - Add Brand \n2 - List Brand \n0 - Return Product Management System\nPlease Choose (0-2): ";

    private static final String listMenuPanel = "****************\n* LISTING MENU *\n****************\n1 - List by Product Group\n2 - List by Brands \n3 - List by Product Id\n0 - Return Product Management System\nPlease Choose (0-3): ";

    private static final String invalidInputMessage = "\nSorry but You have entered an invalid number.\nPlease Try Again";

    public MenuPanel() {
        super();
        // MenuPanel.mainMenu();
        // Product product = new Product(null, 0, 0, 0, 0, null, null);
    }

    public static String getMainmenupanel() {
        return mainMenuPanel;
    }

    public static String getProductmenupanel(){
        return productMenuPanel;
    }

    public static String getBrandmenupanel(){
        return brandMenuPanel;
    }

    public static String getListmenupanel(){
        return listMenuPanel;
    }

    public static void printInvalidInputMessage() {

        System.out.println(invalidInputMessage);

    }

    public static void mainMenu() {
        boolean isError = true;
        Scanner scan = new Scanner(System.in);
        while (isError) {
            try {
                System.out.println(getMainmenupanel());
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

        boolean isError = true;
        Scanner scan = new Scanner(System.in);
        while (isError) {
            try {
                System.out.println(getProductmenupanel());
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
                System.out.println(getBrandmenupanel());
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
                System.out.println(getListmenupanel());
                int selection = scan.nextInt();

                switch (selection) {

                    case 0:
                        mainMenu();
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
}