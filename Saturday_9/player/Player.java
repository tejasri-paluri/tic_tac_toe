//tic tac toe is a game
//cross and 0 are symbols 
//two players can play this game
//to win the game:column wise,row-wise,diagonal-wise same symbols
package player;
public class Player
{

    private String name;
    private int age;
    private String address;
    private String phone_number;
    private String mail;
    private char symbol;
    public Player()
    {

    }
    public void setPlayerDetails(String name,int age,String address,String mail,String phone,char symbol)
    {
        this.name=name;
        this.age=age;
        this.address=address;
        this.phone_number=phone;
        this.symbol=symbol;
        this.mail=mail;
    }
    public void  setPlayerNameAndAge(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void changeSymbol(char symbol)
    {
        this.symbol=symbol;
    }
    public void nameSysmbolEmailAge(String name,char symbol,int age,String mail)
    {
        this.name=name;
        this.age=age;
        this.symbol=symbol;
        this.mail=mail;
    
    }
    public void setNameAndSymbol(String name,char symbol)
    {
        this.name=name;
        this.symbol=symbol;
    }
    public String getPlayerName()
    {
        return name;
    }
    public char getSymbol()
    {
        return symbol;
    }
    public void getPlayerNameAndSymbol()
    {
        System.out.println("name is:"+name);
        System.out.println("symbol is:"+symbol);
    }
    public void getPlayerDetails()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(symbol);
        System.out.println(mail);
        System.out.println(phone_number);
        System.out.println(address);
    }

    
}