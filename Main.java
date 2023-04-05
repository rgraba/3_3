class Main {
  public static void main(String[] args) {
    int h = 5;
    for(int i = h ; i > 0 ; i--)
    {
      for( int k = 5; i < k; k--)
        System.out.print(" ");
      for(int j = 0 ; j < i ; j++)
      {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}