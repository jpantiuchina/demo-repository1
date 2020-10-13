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

  public static void complexMethod2(int c) {
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
          for (int j = 0; j < c; j++)
          {
            if (j > k)
            {
              System.out.println(j);
            }
            for (j = 0; j < c; j++)
            {
              if (j > k)
              {
                System.out.println(j);
              }
              for (j = 0; j < c; j++)
              {
                for (j = 0; j < c; j++)
                {
                  for (j = 0; j < c; j++)
                  {
                    for (j = 0; j < c; j++)
                    {
                      for (j = 0; j < c; j++)
                      {
                        if (j > k)
                        {
                          for (j = 0; j < c; j++)
                          {
                            if (j > k)
                            {
                              System.out.println(j);
                            }
                            if (j > k)
                            {
                              System.out.println(j);
                            }
                            if (j > 10)
                            {
                              System.out.println(k);
                            }
                            if (j > k + 5)
                            {
                              System.out.println(k+5);
                            }
                          }
                          System.out.println(j);
                        }
                        if (j > k)
                        {
                          System.out.println(j);
                        }
                        if (j > 10)
                        {
                          System.out.println(k);
                        }
                        if (j > k + 5)
                        {
                          for (j = 0; j < c; j++)
                          {
                            for (j = 0; j < c; j++)
                            {
                              if (j > k)
                              {
                                System.out.println(j);
                              }
                              if (j > k)
                              {
                                System.out.println(j);
                              }
                              if (j > 10)
                              {
                                System.out.println(k);
                              }
                              if (j > k + 5)
                              {
                                System.out.println(k+5);
                              }
                            }
                            if (j > k)
                            {
                              System.out.println(j);
                            }
                            if (j > k)
                            {
                              System.out.println(j);
                            }
                            if (j > 10)
                            {
                              System.out.println(k);
                            }
                            if (j > k + 5)
                            {
                              System.out.println(k+5);
                            }
                          }
                          System.out.println(k+5);
                        }
                      }
                      if (j > k)
                      {
                        System.out.println(j);
                      }
                      if (j > k)
                      {
                        System.out.println(j);
                      }
                      if (j > 10)
                      {
                        System.out.println(k);
                      }
                      if (j > k + 5)
                      {
                        System.out.println(k+5);
                      }
                    }
                    if (j > k)
                    {
                      System.out.println(j);
                    }
                    if (j > k)
                    {
                      System.out.println(j);
                    }
                    if (j > 10)
                    {
                      System.out.println(k);
                    }
                    if (j > k + 5)
                    {
                      System.out.println(k+5);
                    }
                  }
                  if (j > k)
                  {
                    System.out.println(j);
                  }
                  if (j > k)
                  {
                    System.out.println(j);
                  }
                  if (j > 10)
                  {
                    System.out.println(k);
                  }
                  if (j > k + 5)
                  {
                    System.out.println(k+5);
                  }
                }
                if (j > k)
                {
                  System.out.println(j);
                }
                if (j > k)
                {
                  System.out.println(j);
                }
                if (j > 10)
                {
                  System.out.println(k);
                }
                if (j > k + 5)
                {
                  System.out.println(k+5);
                }
              }
              if (j > k)
              {
                System.out.println(j);
              }
              if (j > 10)
              {
                System.out.println(k);
              }
              if (j > k + 5)
              {
                System.out.println(k+5);
              }
            }
            if (j > k)
            {
              System.out.println(j);
            }
            if (j > 10)
            {
              System.out.println(k);
            }
            if (j > k + 5)
            {
              System.out.println(k+5);
            }
          }
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
        for (int l = 0; l < c; l++)
        {
          if (l == 1)
          {
            System.out.println(2);
          }
          if (l == 2)
          {
            System.out.println(2);
          }
          if (l == 3)
          {
            System.out.println(2);
          }
          if (l == 4)
          {
            System.out.println(2);
          }
          if (l == 5)
          {
            System.out.println(5);
          }
          if (l == 6)
          {
            System.out.println(2);
          }
          else if (l == 7)
          {
            System.out.println(77);
          }
          else if (l == 8)
          {
            System.out.println(77);
          }
          else if (l == 9)
          {
            System.out.println(77);
          }
          else if (l == 10)
          {
            System.out.println(77);
          }
          else if (l == 11)
          {
            System.out.println(77);
          }
          while (c < 100)
          {
            for (i = 0; i < c; i++)
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
            c++;
            for (int j = 0; j < c; j++)
            {
              if (j > l)
              {
                System.out.println(j);
              }
              if (j > l)
              {
                System.out.println(j);
              }
              if (j > 10)
              {
                System.out.println(l);
              }
              if (j > l + 5)
              {
                System.out.println(l+5);
              }
            }
            for (int k = 0; k < l+10; k++)
            {
              if (k < l+1)
              {
                System.out.println(k++);
              }
              else if ( k > l+1)
              {
                System.out.println(k--);
              }
              else if (k==l)
              {
                System.out.println("=");
              }
            }
          }
        }
        for (int k = 0; k < c; k++)
        {
          if (k == 1)
          {
            System.out.println(2);
          }
          if (k == 2)
          {
            System.out.println(2);
          }
          if (k == 3)
          {
            System.out.println(2);
          }
          if (k == 4)
          {
            System.out.println(2);
          }
          if (k == 5)
          {
            System.out.println(5);
          }
          if (k == 6)
          {
            System.out.println(2);
          }
          else if (k == 7)
          {
            System.out.println(77);
          }
          else if (k == 8)
          {
            System.out.println(77);
          }
          else if (k == 9)
          {
            System.out.println(77);
          }
          else if (k == 10)
          {
            System.out.println(77);
          }
          else if (k == 11)
          {
            System.out.println(77);
          }
          while (c < 100)
          {
            c++;
            for (int j = 0; j < c; j++)
            {
              if (j > k)
              {
                System.out.println(j);
              }
              if (j > k)
              {
                System.out.println(j);
              }
              if (j > 10)
              {
                System.out.println(k);
              }
              if (j > k + 5)
              {
                System.out.println(k+5);
              }
            }
            for (k = 0; k < k+10; k++)
            {
              for (int j = 0; j < c; j++)
              {
                if (j > k)
                {
                  System.out.println(j);
                }
                if (j > k)
                {
                  System.out.println(j);
                }
                for (j = 0; j < c; j++)
                {
                  if (j > k)
                  {
                    System.out.println(j);
                  }
                  if (j > k)
                  {
                    System.out.println(j);
                  }
                  for (j = 0; j < c; j++)
                  {
                    for (j = 0; j < c; j++)
                    {
                      for (j = 0; j < c; j++)
                      {
                        for (j = 0; j < c; j++)
                        {
                          for (j = 0; j < c; j++)
                          {
                            for (j = 0; j < c; j++)
                            {
                              for (j = 0; j < c; j++)
                              {
                                for (j = 0; j < c; j++)
                                {
                                  for (j = 0; j < c; j++)
                                  {
                                    for (j = 0; j < c; j++)
                                    {
                                      for (j = 0; j < c; j++)
                                      {
                                        for (j = 0; j < c; j++)
                                        {
                                          if (j > k)
                                          {
                                            System.out.println(j);
                                          }
                                          if (j > k)
                                          {
                                            System.out.println(j);
                                          }
                                          if (j > 10)
                                          {
                                            System.out.println(k);
                                          }
                                          if (j > k + 5)
                                          {
                                            System.out.println(k+5);
                                          }
                                        }
                                        if (j > k)
                                        {
                                          System.out.println(j);
                                        }
                                        if (j > k)
                                        {
                                          System.out.println(j);
                                        }
                                        if (j > 10)
                                        {
                                          System.out.println(k);
                                        }
                                        if (j > k + 5)
                                        {
                                          System.out.println(k+5);
                                        }
                                      }
                                      if (j > k)
                                      {
                                        System.out.println(j);
                                      }
                                      if (j > k)
                                      {
                                        System.out.println(j);
                                      }
                                      if (j > 10)
                                      {
                                        System.out.println(k);
                                      }
                                      if (j > k + 5)
                                      {
                                        System.out.println(k+5);
                                      }
                                    }
                                    if (j > k)
                                    {
                                      System.out.println(j);
                                    }
                                    if (j > k)
                                    {
                                      System.out.println(j);
                                    }
                                    if (j > 10)
                                    {
                                      System.out.println(k);
                                    }
                                    if (j > k + 5)
                                    {
                                      System.out.println(k+5);
                                    }
                                  }
                                  if (j > k)
                                  {
                                    System.out.println(j);
                                  }
                                  if (j > k)
                                  {
                                    System.out.println(j);
                                  }
                                  if (j > 10)
                                  {
                                    System.out.println(k);
                                  }
                                  if (j > k + 5)
                                  {
                                    System.out.println(k+5);
                                  }
                                }
                                if (j > k)
                                {
                                  System.out.println(j);
                                }
                                if (j > k)
                                {
                                  System.out.println(j);
                                }
                                if (j > 10)
                                {
                                  System.out.println(k);
                                }
                                if (j > k + 5)
                                {
                                  System.out.println(k+5);
                                }
                              }
                              if (j > k)
                              {
                                System.out.println(j);
                              }
                              if (j > k)
                              {
                                System.out.println(j);
                              }
                              if (j > 10)
                              {
                                System.out.println(k);
                              }
                              if (j > k + 5)
                              {
                                System.out.println(k+5);
                              }
                            }
                            if (j > k)
                            {
                              System.out.println(j);
                            }
                            if (j > k)
                            {
                              System.out.println(j);
                            }
                            if (j > 10)
                            {
                              System.out.println(k);
                            }
                            if (j > k + 5)
                            {
                              System.out.println(k+5);
                            }
                          }
                          if (j > k)
                          {
                            System.out.println(j);
                          }
                          if (j > k)
                          {
                            System.out.println(j);
                          }
                          if (j > 10)
                          {
                            System.out.println(k);
                          }
                          if (j > k + 5)
                          {
                            System.out.println(k+5);
                          }
                        }
                        if (j > k)
                        {
                          System.out.println(j);
                        }
                        if (j > k)
                        {
                          System.out.println(j);
                        }
                        if (j > 10)
                        {
                          System.out.println(k);
                        }
                        if (j > k + 5)
                        {
                          System.out.println(k+5);
                        }
                      }
                      if (j > k)
                      {
                        System.out.println(j);
                      }
                      if (j > k)
                      {
                        System.out.println(j);
                      }
                      if (j > 10)
                      {
                        System.out.println(k);
                      }
                      if (j > k + 5)
                      {
                        System.out.println(k+5);
                      }
                    }
                    if (j > k)
                    {
                      System.out.println(j);
                    }
                    if (j > k)
                    {
                      System.out.println(j);
                    }
                    for (j = 0; j < c; j++)
                    {
                      if (j > k)
                      {
                        System.out.println(j);
                      }
                      if (j > k)
                      {
                        System.out.println(j);
                      }
                      for (j = 0; j < c; j++)
                      {
                        if (j > k)
                        {
                          System.out.println(j);
                        }
                        if (j > k)
                        {
                          System.out.println(j);
                        }
                        if (j > 10)
                        {
                          System.out.println(k);
                        }
                        if (j > k + 5)
                        {
                          System.out.println(k+5);
                        }
                      }
                      if (j > 10)
                      {
                        System.out.println(k);
                      }
                      if (j > k + 5)
                      {
                        System.out.println(k+5);
                      }
                    }
                    if (j > 10)
                    {
                      System.out.println(k);
                    }
                    if (j > k + 5)
                    {
                      System.out.println(k+5);
                    }
                  }
                  if (j > 10)
                  {
                    System.out.println(k);
                  }
                  if (j > k + 5)
                  {
                    System.out.println(k+5);
                  }
                }
                if (j > 10)
                {
                  System.out.println(k);
                }
                if (j > k + 5)
                {
                  System.out.println(k+5);
                }
              }
              if (k < k+1)
              {
                for (int j = 0; j < c; j++)
                {
                  if (j > k)
                  {
                    for (j = 0; j < c; j++)
                    {
                      for (j = 0; j < c; j++)
                      {
                        if (j > k)
                        {
                          System.out.println(j);
                        }
                        if (j > 10)
                        {
                          System.out.println(k);
                        }
                        if (j > k + 5)
                        {
                          System.out.println(k+5);
                        }
                        for (j = 0; j < c; j++)
                        {
                          if (j > k)
                          {
                            System.out.println(j);
                          }
                          if (j > k)
                          {
                            System.out.println(j);
                          }
                          if (j > 10)
                          {
                            System.out.println(k);
                          }
                          if (j > k + 5)
                          {
                            System.out.println(k+5);
                          }
                        }
                        if (j > k)
                        {
                          System.out.println(j);
                        }
                        if (j > k)
                        {
                          System.out.println(j);
                        }
                        if (j > 10)
                        {
                          System.out.println(k);
                        }
                        if (j > k + 5)
                        {
                          System.out.println(k+5);
                        }
                      }
                      if (j > k)
                      {
                        System.out.println(j);
                      }
                      if (j > k)
                      {
                        System.out.println(j);
                      }
                      if (j > 10)
                      {
                        System.out.println(k);
                      }
                      if (j > k + 5)
                      {
                        System.out.println(k+5);
                      }
                    }
                    System.out.println(j);
                  }
                  if (j > k)
                  {
                    System.out.println(j);
                  }
                  if (j > 10)
                  {
                    System.out.println(k);
                  }
                  if (j > k + 5)
                  {
                    System.out.println(k+5);
                  }
                }
                System.out.println(k++);
              }
              else if ( k > k+1)
              {
                for (int j = 0; j < c; j++)
                {
                  if (j > k)
                  {
                    System.out.println(j);
                  }
                  if (j > k)
                  {
                    System.out.println(j);
                  }
                  if (j > 10)
                  {
                    System.out.println(k);
                  }
                  if (j > k + 5)
                  {
                    System.out.println(k+5);
                  }
                }
                System.out.println(k--);
              }
              else if (k==k)
              {
                for (int j = 0; j < c; j++)
                {
                  if (j > k)
                  {
                    System.out.println(j);
                  }
                }
                System.out.println("=");
              }
            }
          }
        }
      }
    }

  }



}