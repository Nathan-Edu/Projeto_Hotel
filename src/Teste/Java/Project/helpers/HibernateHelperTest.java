package Project.helpers;


import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import project.helpers.HibernateHelper;

public class HibernateHelperTest {

    @Test
    public void conectar() {
        Session sessao = HibernateHelper.getFabricaDeSessoes().openSession();

        sessao.close();


    }

    }


