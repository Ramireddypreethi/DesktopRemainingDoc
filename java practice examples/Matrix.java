import java.util.*;
class Matrix
{
              public static void main(String args[])
                  {
                        int m,n,p,q,sum=0;
                       Scanner s=new Scanner(System.in);
                       System.out.println("Enter no of rows and cols:");
                        m=s.nextInt();
                        n=s.nextInt();
                        int first[][]=new int[m][n];
                         System.out.println("Enter elements of first:");
                        for(int i=0;i<m;i++)
                           {
                             for(int j=0;j<n;j++)
                               {
                                  first[i][j]=s.nextInt();
                               }
                          }
                       System.out.println("Enter no of rows and cols:");
                          p=s.nextInt();
                          q=s.nextInt();
                          if(n!=p)
                            {
                               System.out.println("Invalid");
                             }
                         else
                           {
                             int second[][]=new int[p][q];
                              int multiply[][]=new int[m][q];
                              System.out.println("Enter elements of second:");
                               for(int i=0;i<p;i++)
                                    {
                                      for(int j=0;j<q;j++)
                                         {
                                             second[i][j]=s.nextInt();
                                         }
                                     }
                              for(int i=0;i<m;i++)         
                                  {
                                       for(int j=0;j<q;j++)
                                          {
                                            for(int k=0;k<p;k++)
                                                {
                                                     sum=sum+first[i][k]*second[k][j];
                                                }
                                               multiply[i][j]=sum;
                                                 sum=0;
                                          }
                                   }
                              System.out.println("result:");
                              for(int i=0;i<m;i++)
                                   {
                                       for(int j=0;j<q;j++)
                                         {
                                           System.out.print(multiply[i][j]+" ");
                                           }System.out.println();
                                            
                                   } 
                          }
                     }
}

