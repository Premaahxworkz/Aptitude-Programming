class LeftCorner
{
public static void main(String args[])
{
LeftCorner left=new LeftCorner();
left.printLeftCorner();
}
void printLeftCorner(){
for(int r=1;r<=3;r++){
for(int c=1;c<=3;c++){
if(r==3||c==3){
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