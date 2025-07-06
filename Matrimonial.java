class Matrimonial
{
public static void main(String[]args)
{
int age=22;
char gender='M';
if(age>=21 && gender=='M')
{
System.out.println("Register successful");
}
else if(age<=20)
{
System.out.println("invalid age");
}
else
{
System.out.println("invalid gender");
}
}
}