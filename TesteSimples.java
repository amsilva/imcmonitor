class TesteSimples {

  public void executar() throws Exception {
       
       Atleta atleta = new Atleta();
       atleta.setNome("Piedade Silva");
       atleta.setIdade(30);

       System.out.println("Nome = " + atleta.getNome());
       System.out.println("Idade = " + atleta.getIdade());

  }

}