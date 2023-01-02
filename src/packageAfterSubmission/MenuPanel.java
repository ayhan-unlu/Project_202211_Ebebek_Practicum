package packageAfterSubmission;

import java.util.Scanner;

public class MenuPanel {

    private static final String mainMenuPanel = "*******************************\n*   WELCOME TO PATIKA STORE   *\n*******************************\nProduct Management System:\n1 - Product Operations\n2 - Brand Operations\n3 - Listing Operations \n0 - Exit\nPlease Choose (0-3): ";

    private static final String productMenuPanel = "****************\n* PRODUCT MENU *\n****************\n1 - Add Product \n2 - Delete Productby Id\n3 - List Product by Group \n4 - List Product by ID\n5 - List Product by Brand\n0 - Return Product Management System \nPlease Choose (0-6): ";

    private static final String productGroupMenuPanel = "**********************\n* PRODUCT GROUP MENU *\n**********************\n1 - Mobile Phone \n2 - Notebook\n0 - Return Product Menu \nPlease Choose (0-3): ";

    private static final String brandMenuPanel = "**************\n* BRAND MENU *\n**************\n1 - Add Brand \n2 - List Brand \n0 - Return Product Management System\nPlease Choose (0-2): ";

    private static final String listMenuPanel = "****************\n* LISTING MENU *\n****************\n1 - List by Product Group\n2 - List by Brands \n3 - List by Product Id\n0 - Return Product Management System\nPlease Choose (0-3): ";

    private static final String invalidInputMessage = "\nSorry but You have entered an invalid number.\nPlease Try Again";

    public MenuPanel() {
    }

    public static String getMainMenuPanel() {
        return mainMenuPanel;
    }

    public static String getProductMenuPanel() {
        return productMenuPanel;
    }

    public static String getProductGroupMenuPanel() {
        return productGroupMenuPanel;
    }

    public static String getBrandmenupanel() {
        return brandMenuPanel;
    }

    public static String getListmenupanel() {
        return listMenuPanel;
    }

    public static String getInvalidInputMessage() {

        return invalidInputMessage;

    }

    public static void writeInvalidInputMessage() {
        System.out.println(getInvalidInputMessage());
    }

    public static void mainMenu() {
        boolean isError = true;
        Scanner scan = new Scanner(System.in);
        while (isError) {
            try {
                System.out.println(getMainMenuPanel());
                int selection = scan.nextInt();

                switch (selection) {

                    case 0:
                        System.out.println("\nHope to See You Soon\nBye for Now.\n");
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
                        writeInvalidInputMessage();
                        mainMenu();
                        break;
                }
                isError = false;

            } catch (Exception e) {
                writeInvalidInputMessage();
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
                System.out.println(getProductMenuPanel());
                int selection = scan.nextInt();

                switch (selection) {

                    case 0:
                        mainMenu();
                        break;
                    case 1:
                        Product.createProduct();
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
                        writeInvalidInputMessage();
                        productMenu();
                        break;
                }
                isError = false;

            } catch (Exception e) {
                writeInvalidInputMessage();
                productMenu();
            }

        }
        scan.close();

    }
    public static void productGroupMenu() {

        boolean isError = true;
        Scanner scan = new Scanner(System.in);
        while (isError) {
            try {
                System.out.println(getProductMenuPanel());
                int selection = scan.nextInt();

                switch (selection) {

                    case 0:
                        productMenu();
                        break;
                    case 1:
                     //   Product.setProductGroup("Mobile Phone");
                        break;
                    case 2:
 //   Product.setProductGroup("Notebook");
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
                        writeInvalidInputMessage();
                        productMenu();
                        break;
                }
                isError = false;

            } catch (Exception e) {
                writeInvalidInputMessage();
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
                        writeInvalidInputMessage();
                        mainMenu();
                        break;
                }
                isError = false;

            } catch (Exception e) {
                writeInvalidInputMessage();
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
                        writeInvalidInputMessage();
                        mainMenu();
                        break;
                }
                isError = false;

            } catch (Exception e) {
                writeInvalidInputMessage();
                mainMenu();
            }

        }
        scan.close();

    }
}