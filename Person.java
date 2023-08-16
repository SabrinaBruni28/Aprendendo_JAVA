public class Person{
    private int idade;
    private String nome;

    public Person(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }

    public void ola(){
        System.out.println("Olá, meu nome é "+nome+", eu tenho "+idade+" anos");
    }
}
