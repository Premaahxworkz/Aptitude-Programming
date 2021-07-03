class LastThreeBox
{
public static void main(String args[])
{
LastThreeBox last=new LastThreeBox();
last.printLastThreeBox();
}
void printLastThreeBox(){
for(int r=1;r<=5;r++){
for(int c=1;c<=5;c++){
if(r>=3 && c>=3){
System.out.print(r+" "+c+"\t");
}
else
{
System.out.print("\t\t");
}
}
System.out.println();
}
}
}