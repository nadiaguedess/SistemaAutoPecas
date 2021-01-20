package forms;
import java.sql.*;
import java.util.ArrayList;



class DAO {
    public static Connection conexao = null;
    
    public DAO(){
        conexao = conectar();
    }
    
    public boolean close() {
        boolean close = true;
        try {
            conexao.close();
        } catch (SQLException e) {
            close = false;
        }
        return close;
    }
    
    public static java.sql.Connection conectar() {
//        jdbc:mysql://127.0.0.1:3306/loja?zeroDateTimeBehavior=convertToNull
        String driverName = "com.mysql.jdbc.Driver";                        
        String serverName = "localhost:3306";
        String mydatabase = "loja";
        String username = "root";
        String password = "";
        Connection con = null;
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;// + "?useSSL=false";

        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver especificado nao foi encontrado.: " + e.getMessage());
        } catch (SQLException e) {            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
        }finally{
            System.out.println("Conectado com o banco Dados.");
        }
        return con;
    }

    public static boolean autenticar(String login, String senha){
        boolean resp = false;               
         String driverName = "com.mysql.cj.jdbc.Driver";                        
            String serverName = "localhost:3306";
            String mydatabase = "loja";
            String username = "root";
            String password = "";
            Connection con = null;
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true&serverTimezone=UTC";// + "?useSSL=false";
               
            try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver especificado nao foi encontrado.: " + e.getMessage());
            } catch (SQLException e) {            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            }  
        try {
            String query = "SELECT * FROM `usuario` WHERE (Nome like '"+ login + "') AND (senha like '"+ senha + "');";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            resp = rs.next();
        } catch (SQLException u){
            //throw new RuntimeException(u);  
        }
        return resp;        
    }
    
    public static boolean inserirUsuario(String login, String senha){
        boolean resp = false;
        try {  
            Statement st = conexao.createStatement();
            String sql = "INSERT INTO `usuario` (`login`, `senha`) ";
            sql += "VALUES ('"+login+"', '"+senha+"')";
            System.out.println(sql);
            st.executeUpdate(sql);
            st.close();
            resp = true;
        } catch (SQLException u) {  
            //throw new RuntimeException(u);  
        }
        return resp;        
    }    
    
    public static ArrayList<clientes> getDepartamento(){
        ArrayList<clientes> arrayDpto = new ArrayList();
        String driverName = "com.mysql.cj.jdbc.Driver";                        
            String serverName = "localhost:3306";
            String mydatabase = "loja";
            String username = "root";
            String password = "";
            Connection con = null;
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true&serverTimezone=UTC";// + "?useSSL=false";
               
            try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver especificado nao foi encontrado.: " + e.getMessage());
            } catch (SQLException e) {            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            }        
        try {
            String query = "SELECT * FROM `clientes`;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                clientes d = new clientes();
                d.setIdCliente(rs.getInt("IdCliente"));
                d.setNome(rs.getString("nome"));
                d.setCnpjcpf(rs.getString("Cnpjcpf"));
                d.setEndereco(rs.getString("Endereco"));
                d.setNumero(rs.getInt("Numero"));
                d.setComplemento(rs.getString("Complemento"));
                d.setBairro(rs.getString("Bairro"));
                d.setCidade(rs.getString("Cidade"));
                d.setUf(rs.getString("uf"));
                d.setEmail(rs.getString("Email"));
                d.setTelefone(rs.getString("Telefone"));
                arrayDpto.add(d);
            }
        } catch (SQLException u){
            throw new RuntimeException(u);  
        }

        return arrayDpto;
    }
    
    
//    public static Departamento getDepartamento(int codigoDepartamento){
//        Departamento d = null;
//                
//        try {
//            String query = "SELECT * FROM `departamento` WHERE codigo="+ codigoDepartamento + ";";
//            Statement st = conexao.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            if(rs.next()){
//                d = new Departamento();
//                d.setCodigo(rs.getInt("codigo"));
//                d.setNome(rs.getString("nome"));
//            }
//        } catch (SQLException u){
//            throw new RuntimeException(u);  
//        }
//        return d;
//    }    
//    
    public static boolean inserirCliente(String bairro,String cep,String cnpjcpf,String cidade,String complemento,String email,String endereco,String nome,int numero,String telefone,String uf){
        boolean resp = false;
        try {  
             String driverName = "com.mysql.cj.jdbc.Driver";                        
            String serverName = "localhost:3306";
            String mydatabase = "loja";
            String username = "root";
            String password = "";
            Connection con = null;
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true&serverTimezone=UTC";// + "?useSSL=false";
               
            try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver especificado nao foi encontrado.: " + e.getMessage());
            } catch (SQLException e) {            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            }
                Statement st = con.createStatement();
                String sql = "INSERT INTO `clientes` (`bairro`, `cep`, `cnpjcpf`, `cidade`, `complemento`, `email`, `endereco`, `nome`, `numero`, `telefone`, `uf`) ";
                sql += "VALUES ('"+bairro+"', '"+cep+"','"+cnpjcpf+"','"+cidade+"','"+complemento+"','"+email+"','"+endereco+"','"+nome+"','"+numero+"','"+telefone+"','"+uf+"');";
                System.out.println(sql);
                st.executeUpdate(sql);
                resp = true;
        } catch (SQLException u) {  
            throw new RuntimeException(u);  

        }
        return resp;        
    }    
    
    public static boolean excluirDepartamento(int codigoDepartamento){
        boolean resp = false;
        try {  
            Statement st = conexao.createStatement();
            String sql = "DELETE FROM `departamento` WHERE codigo="+codigoDepartamento;
            //System.out.println(sql);
            st.executeUpdate(sql);
            st.close();
            resp = true;
        } catch (SQLException u) {  
            //throw new RuntimeException(u);  

        }
        return resp;        
    }
    
    public static boolean atualizarClientes(clientes d){
        boolean resp = false;
        try {  
            
             String driverName = "com.mysql.cj.jdbc.Driver";                        
            String serverName = "localhost:3306";
            String mydatabase = "loja";
            String username = "root";
            String password = "";
            Connection con = null;
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true&serverTimezone=UTC";// + "?useSSL=false";
               
            try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver especificado nao foi encontrado.: " + e.getMessage());
            } catch (SQLException e) {            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            }
            
            Statement st = con.createStatement();
            String sql = "UPDATE `clientes` "
                    + "SET "
                    + "`nome`='"+d.getNome()+"', "
                    + "`email`='"+d.getEmail()+"', "
                    + "`telefone`='"+d.getTelefone()+"', "
                    + "`cnpjcpf`='"+d.getCnpjcpf()+"', "
                    + "`bairro`='"+d.getBairro()+"', "
                    + "`cidade`='"+d.getCidade()+"', "
                    + "`uf`='"+d.getUf()+"', "
                    + "`numero`="+d.getNumero()+", "
                    + "`complemento`='"+d.getComplemento()+"', "
                    + "`endereco`='"+d.getEndereco()+"', "
                    + "`cep`='"+d.getCep()+"'"
                    + "WHERE idCliente="+d.getIdCliente();
            //System.out.println(sql);
            st.executeUpdate(sql);
            st.close();
            resp = true;
        } catch (SQLException u) {  
            //throw new RuntimeException(u);  

        }
        return resp;
    }
}