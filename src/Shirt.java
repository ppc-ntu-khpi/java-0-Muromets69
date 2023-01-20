public class Shirt {
  public int shirtID = 10; 
  public String description = "Be modern be cool";
  public char colorCode = 'G';
  public double price = 120.5;
  public int quantityInStock = 0;

  private String GetColorName(char c){
    switch(c){
      case 'R': return"red";
      case 'G': return"green";
      case 'B': return"blue";
      default: return"unset";
    }
  }
  
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + GetColorName(colorCode));
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } 
}