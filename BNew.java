// This is a very cool class.
//second comment line
class BNew {
  
  int field1 = 99999;
  

  public BNew() {
  }

  @Override
  public String toString() {
    return "B";
  }

  public static void b1(){}

  public static void b2(){}

  public static void b3(){}

  //meaningless
  public static void complexMethod(int c) {
    for (int i = 0; i < c; i++) {
      if (i == 1) {
        System.out.println(2);
      }
      if (i == 2) {
        System.out.println(2);
      }
      if (i == 3) {
        System.out.println(2);
      }
      if (i == 4) {
        System.out.println(2);
      }
      if (i == 5) {
        System.out.println(5);
      }
      if (i == 6) {
        System.out.println(2);
      } else if (i == 7) {
        System.out.println(77);
      } else if (i == 8) {
        System.out.println(77);
      } else if (i == 9) {
        System.out.println(77);
      } else if (i == 10) {
        System.out.println(77);
      } else if (i == 11) {
        System.out.println(77);
      }
      while (c < 100) {
        c++;
        for (int j = 0; j < c; j++) {
          if (j > i) {
            System.out.println(j);
          }
          if (j > i) {
            System.out.println(j);
          }
          if (j > 10) {
            System.out.println(i);
          }
          if (j > i + 5) {
            System.out.println(i + 5);
          }
        }
        for (int k = 0; k < i + 10; k++) {
          if (k < i + 1) {
            System.out.println(k++);
          } else if (k > i + 1) {
            System.out.println(k--);
          } else if (k == i) {
            System.out.println("=");
          }
        }
      }
    }
  }
    public static void complexMethodDupl(int c) {
      for (int i = 0; i < c; i++)
      {
        if (i == 1)
        {
          System.out.println(2);
        }
        if (i == 2)
        {
          System.out.println(2);
        }
        if (i == 3)
        {
          System.out.println(2);
        }
        if (i == 4)
        {
          System.out.println(2);
        }
        if (i == 5)
        {
          System.out.println(5);
        }
        if (i == 6)
        {
          System.out.println(2);
        }
        else if (i == 7)
        {
          System.out.println(77);
        }
        else if (i == 8)
        {
          System.out.println(77);
        }
        else if (i == 9)
        {
          System.out.println(77);
        }
        else if (i == 10)
        {
          System.out.println(77);
        }
        else if (i == 11)
        {
          System.out.println(77);
        }
        while (c < 100)
        {
          c++;
          for (int j = 0; j < c; j++)
          {
            if (j > i)
            {
              System.out.println(j);
            }
            if (j > i)
            {
              System.out.println(j);
            }
            if (j > 10)
            {
              System.out.println(i);
            }
            if (j > i + 5)
            {
              System.out.println(i+5);
            }
          }
          for (int k = 0; k < i+10; k++)
          {
            if (k < i+1)
            {
              System.out.println(k++);
            }
            else if ( k > i+1)
            {
              System.out.println(k--);
            }
            else if (k==i)
            {
              System.out.println("=");
            }
          }
        }
      }

  }



}