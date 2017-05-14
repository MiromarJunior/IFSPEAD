package DAO;

import Model.Disciplina;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author miromar
 */
public class DisciplinaDAO {

    private String sql = "";
    private Connection con = ConexaoJava.conectar();
    private PreparedStatement prep = null;
    private ResultSet res = null;

    /**
     * O método insert insere dados na tabela Disciplina com exceção do
     * IdDisciplina pois ele é auto_increment
     *
     * @param disc
     * @return
     */
    public boolean insert(Disciplina disc) {
        sql = "insert into disciplina"
                + "(NomeDisciplina,CargaHoraria,Curso,NumeroVagas,Periodo) "
                + "values(?,?,?,?,?)";

        try {
            prep = con.prepareStatement(sql);

            prep.setString(1, disc.getNomeDisciplina());
            prep.setInt(2, disc.getCargaHoraria());
            prep.setString(3, disc.getCurso());
            prep.setInt(4, disc.getNumeroVagas());
            prep.setString(5, disc.getPeriodo());

            prep.execute();
            prep.close();

            return true;

        } catch (SQLException ex) {
            System.out.println("Erro no Insert " + ex);
            return false;
        }

    }

    /**
     * Seleciona todos os dados
     *
     * @return
     */

    public ArrayList<Disciplina> select() {
        ArrayList<Disciplina> lista = new ArrayList<>();

        sql = "select * from Disciplina";
        try {
            prep = con.prepareStatement(sql);
            res = prep.executeQuery();
            while (res.next()) {
                Disciplina disc = new Disciplina();
                disc.setCargaHoraria(res.getInt("CargaHoraria"));
                disc.setCurso(res.getString("Curso"));
                disc.setIdDisciplina(res.getInt("IdDisciplina"));
                disc.setNomeDisciplina(res.getString("NomeDisciplina"));
                disc.setNumeroVagas(res.getInt("NumeroVagas"));
                disc.setPeriodo(res.getString("Periodo"));
                lista.add(disc);

            }
            prep.close();

        } catch (SQLException ex) {
            System.out.println("Erro no Select " + ex);
        }

        return lista;
    }

    /**
     * O método delete exclui as disciplinas pelo ID
     *
     * @param disc
     * @return
     */
    public boolean delete(Disciplina disc) {
        sql = "delete from disciplina where IdDisciplina = ?";

        try {
            prep = con.prepareStatement(sql);
            prep.setInt(1, disc.getIdDisciplina());
            prep.execute();
            System.out.println("Deletado Com sucesso");

            prep.close();
            return true;

        } catch (SQLException ex) {
            System.out.println("Erro no Delete" + ex);
            return false;
        }

    }

}
