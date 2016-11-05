package lenghttext;

//Имортируем компонент JOptionPane пакета javax.swing
import javax.swing.JOptionPane;


//Инициализируем главный класс программы
public class Main extends javax.swing.JFrame {

    //Инициализируем переменные форм
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    
    //В главном методе инициализируем сгенерированные компоненты форм
    public Main() {
        initComponents();
    }
    /**
     * @param args the command line arguments
     */
    //Инициализируем статический метод в котором запускаем главный метод Main
    //для отрисовки формы
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    //Указываем компилятору подавить предупреждения компиляции, 
    //определённые в параметрах аннотации
    @SuppressWarnings("unchecked")
    
    //Инициализируем компоненты формы
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        
