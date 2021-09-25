import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class TesteAluno {

        @Mock
        private Aluno a;

        @Before
        public void init(){
            a = new Aluno();
        }

        @Test
        public void testeNomeAluno(){
            Assert.assertNotEquals(null, Aluno.nome);
        }

        @Test
        public void testeIdadeAluno(){
            Assert.assertNotEquals(Aluno.idade<0, Aluno.idade);
        }

        @Test
        public void testeNCpfAluno(){
        Assert.assertNotEquals(null, Aluno.cpf);
        }

}
