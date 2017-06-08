public class Page extends javax.swing.JFrame {

    DefaultTableModel tbl_model;
    ArrayList ids;

public Page() {
        initComponents();
        ids = new ArrayList();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from  book");
            tbl_model = new DefaultTableModel(new Object[]{"Title", "Author", "publication"}, 0);
            table.setModel(tbl_model);
            while (rs.next()) {
                String id = rs.getString("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publication = rs.getString("publication");
                ids.add(id);
                tbl_model.addRow(new Object[]{
                    title,
                    author,
                    publication
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(Page.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    }
    
    
    public class Home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public Home() {
        initComponents();
        
    }
    
    public Home(String id){
         initComponents();
        lable.setText(id);
    }
    }
