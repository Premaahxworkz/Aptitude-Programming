class MiddleLine
{
public static void main(String args[])
{
MiddleLine middle=new MiddleLine();
middle.printMiddleLine();
}
public void printMiddleLine(){
for(int r=1;r<=5;r++){
for(int c=1;c<=5;c++){
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

 