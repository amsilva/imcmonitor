import java.util.Scanner;

class TelaConsoleMenu {

    Scanner teclado = new Scanner(System.in);
    Atleta atletaDaAcademia = new Atleta();


    public void executar() {
      
      boolean sair = false;
      int op;

      while(!sair){

        System.out.println("\nMENU ******");
        System.out.println(" 1 [+] ATLETA");
        System.out.println("11 [>] LISTAGEM");
        System.out.println(" 0 [X] SAIR");
        System.out.println("---------------");
        System.out.println("Opcao:_");
        op = teclado.nextInt();

        if(op == 1) {
          this.incluirNovoAtleta();
        }

        if(op == 11) {
          this.listarAtletas();
        }

        if(op == 0) {
          sair = true;
        }

      }


      System.out.println("fim, telaconsolemenu!");

    }

    private void incluirNovoAtleta(){
      System.out.println("Novo Atleta");

      System.out.print("nome_: ");
      String nome = teclado.next();

      System.out.print("idade_: ");
      int idade =  teclado.nextInt();

      Atleta novo = new Atleta();
      novo.setNome(nome);
      novo.setIdade(idade);

      atletaDaAcademia = novo;

    }

    private void listarAtletas(){

      System.out.println("Listagem de Atletas:");

      System.out.println(atletaDaAcademia.getNome() + " (" + atletaDaAcademia.getIdade() + ")");


    }









}