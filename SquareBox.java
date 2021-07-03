class SquareBox
{
public static void main(String args[])
{
 SquareBox Square=new SquareBox();
 Square.printSquareBox();
}
void printSquareBox(){
for(int r=1;r<=5;r++){
for(int c=1;c<=5;c++){
if(r==1 ||c==1||r==5||c==5){
System.out.print(r+" "+c+"\t");
}else
{
System.out.print("\t");
}
}
System.out.println();
}
}
}

