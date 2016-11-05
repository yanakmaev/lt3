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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        
        //Указываем интерпретатору, что при зиакрытии окна
        //нужно выйти из приложения
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //Устанавливаем Title фрейма
        setTitle("Текстовычислятор");
        
        //Устанавливаем необходимые формы на панеле
        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Вставьте или введите текст");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Рассчитать");
        //Прописываем, какой нужно использовать метод при нажатии на кнопку
        //Расчитать
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
