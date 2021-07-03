class Matrix //class example
{
public static void main(String args[])
{
 Matrix matrix=new Matrix();
 matrix.printMatrix();
}
void printMatrix()
{
 for(int r=1;r<=5;r++)
 {
  for(int c=1;c<=5;c++)
  {
   if(r==1 ||c==1||c==5)
   {
    System.out.print(r+" "+c+"\t");
   }
   else
   {
    System.out.print("\t");
   }
  }
 System.out.println();
}
}
}

    
