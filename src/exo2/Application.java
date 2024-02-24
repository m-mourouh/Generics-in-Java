package exo2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Application {
    private static Scanner scanner = new Scanner(System.in);
    private static MetierProduitImpl c = new MetierProduitImpl(new ArrayList<>());

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayProductsList();
                    break;
                case 2:
                    findProductById();
                    break;
                case 3:
                    addProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Vous avez quitté le menu ):");
                    break;
                default:
                    System.out.println("choix invalide!");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        String topBorder = "+===============================================+";
        String bottomBorder = "+===============================================+";
        String menuTitle = "|                      Menu                     |";
        String leftDivider = "| ";
        String rightDivider = " |";

        System.out.println(topBorder);
        System.out.println(menuTitle);
        System.out.println(topBorder);
        System.out.println(leftDivider + "1. Afficher la liste des produits.           " + rightDivider);
        System.out.println(leftDivider + "2. Rechercher un produit par son id.         " + rightDivider);
        System.out.println(leftDivider + "3. Ajouter un nouveau produit dans la liste. " + rightDivider);
        System.out.println(leftDivider + "4. Supprimer un produit par id.              " + rightDivider);
        System.out.println(leftDivider + "5. Quitter ce programme.                     " + rightDivider);
        System.out.println(bottomBorder);
        System.out.println("Choix: ");
    }

    private static void displayProductsList() {
        System.out.println("Liste des produits : ");
        c.getAll().forEach(System.out::println);
    }

    private static void findProductById() {
        System.out.println("Veuillez entrer l'id du produit que vous cherchez: ");
        long id = scanner.nextLong();
        Produit produit = c.findById(id);
        if (produit != null) {
            System.out.println("Le produit avec l'id " + id + ":");
            System.out.println(produit);
        } else {
            System.out.println("Le produit avec l'id " + id + ": n'existe pas");
        }

    }
    private static void addProduct(){
        System.out.println("Veuillez saisir les informations du produit: ");

        System.out.println("id: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Nom: ");
        String name = scanner.nextLine();

        System.out.println("Marque: ");
        String brand = scanner.nextLine();

        System.out.println("Prix: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Description: ");
        String description = scanner.nextLine();

        System.out.println("Nombre en stock: ");
        int quantity = scanner.nextInt();

        //create a new instance of Produit
        Produit p = new Produit(id, name, brand, price, description, quantity);
        c.add(p);
        System.out.println("Produit ajouté avec succès.");
    }
    private static void deleteProduct(){
        System.out.println("Veuillez enter l'id du produit à supprimer: ");
        long id = scanner.nextLong();
        c.delete(id);
    }
}
