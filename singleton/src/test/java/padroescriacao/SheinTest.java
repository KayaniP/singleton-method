package test.java.padroescriacao;


class SheinTest {

    @Test 
    public void deveRetornarNomeProduto() {
        NomeProduto.getInstance().setNomeProduto("Camisa Branca");
        assertEquals(Camisa.Branca, NomeProduto.getInstance());
    }

    @Test 
    public void deveRetornarUsuarioOnline() {
        UsuarioOnline.getInstance().setUsuarioOnline("Ativo");
        assertEquals("Ativo", UsuarioOnline.getInstance().getUsuarioOnline());
}