
package Testes;

import DAO.DisciplinaDAO;
import Model.Disciplina;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author miromar
 */
public class TestesDisciplina {
    
    
    public static void main(String[] args) {
        
        
        DisciplinaDAO dao = new DisciplinaDAO();
        Disciplina disc = new Disciplina();
        disc.setIdDisciplina(5);
        dao.delete(disc);
        
//        disc.setCargaHoraria(55);
//        disc.setCurso("Matematica");
//        disc.setNomeDisciplina("Algoritimos");
//        disc.setNumeroVagas(33);
//        disc.setPeriodo("Manha");
//        
//        dao.insert(disc);
//        
       
//        ArrayList<Disciplina> lista = dao.select();
//        
//       for(Disciplina  u : lista){
//           System.out.println("\n "+u.getCargaHoraria()+"\n"+u.getCurso()
//           +"\n"+u.getNomeDisciplina());
           
       }
        
//        System.out.println(dao.selectId(2).getNomeDisciplina());
//        System.out.println(dao.selectId(2).getCurso());
               
        
//        disc.setCargaHoraria(50);
//        disc.setCurso("Portugues");
//        disc.setNomeDisciplina("Literatura");
//        disc.setNumeroVagas(60);
//        disc.setPeriodo("Matutino");
//        
//        if(dao.insert(disc)){
//            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
//        }else{
//            JOptionPane.showMessageDialog(null, "Erro no Cadastro");
//        }
    
    
      
    
}
