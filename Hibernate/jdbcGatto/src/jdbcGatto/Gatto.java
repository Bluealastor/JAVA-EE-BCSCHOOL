package jdbcGatto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Gatto {

	public static void main(String[] args) {

//		aggiungiGatto(1, "moschetto", 2, "fucsia");
//		aggiungiGatto(2, "neretto", 2, "nero");
//		aggiungiGatto(3, "neretto", 2, "nero");
//		aggiungiGatto(4, "neretto", 2, "nero");
		aggiungiGatto(5, "neretto", 2, "nero");
		getGatto();
//		deleteGatto(5);
		getGatto();
		aggiornaByNam(2,"Pulcioso");
//		deleteALLGatto();
		getGatto();

	}
	
	

	// APERTURA POST
	public static void aggiungiGatto(int chip, String nome, int eta, String colorePelo) {
		Connection conn = null;
		Statement stmt = null;
// 		Standard per il connector della libreria "jdbc:mysql://URL del database/NOME DATABASE"
		String url = "jdbc:mysql://localhost:3306/gatti";
		String username = "root";
		String password = "";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);

			stmt = conn.createStatement();

			String gatto = "INSERT INTO gatto VALUES(" + chip + ", '" + nome + "', " + eta + ", '" + colorePelo + "');";
			int result = stmt.executeUpdate(gatto);

			if (result > 0) {
				System.out.println(result);
			} else {
				System.out.println("Problemi durante l'inserimento");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Classe non trovata");
			e.printStackTrace();
		} catch (SQLException sql) {
			System.out.println("Eccezzione specifica di sql");
			sql.printStackTrace();
		} catch (Exception e) {
			System.out.println("Eccezione generica");
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					System.out.println("Errore di chiusura Statement");
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
					conn = null;
				} catch (SQLException e) {
					System.out.println("Problemi di chiusura Connection");
					e.printStackTrace();
				}
			}
		}
	}

	// CHIUSURA POST

	// APERTURA GET

	public static void getGatto() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// percorso mysql:porta/nomeDatabase
		String url = "jdbc:mysql://localhost:3306/gatti";
		String username = "root";
		String password = "";

		try {
			// caricamento del driver relativo a mysql
			// Può sollevare un' eccezione di tipo ClassNotFoundException
			Class.forName("com.mysql.cj.jdbc.Driver");

			// con cetConnectio creo la connessione
			// i seguenti metodi getConnection, createStatement, ed exacuteUpdate() possono
			// lanciare un' ecezione di tipo SQLException
			conn = DriverManager.getConnection(url, username, password);

			// Creazione dello Statment
			stmt = conn.createStatement();

			// result SET è simile ad un cursore
			rs = stmt.executeQuery("SELECT * FROM gatto");

			// con rs.next() mi sposto da riga a rigasulla tabella DB
//				con rs.getTipo(indice) leggo il valora associato a quello della colonna
			// le colonne della tabella partono da indice == 1
			while (rs.next()) {
				System.out.println("NchipGatto: " + rs.getInt(1) + " Nome Gatto: " + rs.getString(2) + " età gatto: "
						+ rs.getInt(3) + " Colore Pelo: " + rs.getString(4));
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Classe non trovata");
			e.printStackTrace();
		} catch (SQLException sql) {
			System.out.println("Eccezzione specifica di sql");
			sql.printStackTrace();
		} catch (Exception e) {
			System.out.println("Eccezione generica");
		} finally {
			if (rs != null) {
				try {
					rs.close();
					rs = null;
					System.out.println("chiusura del ResultSet");
				} catch (SQLException e) {
					System.out.println("Problemi di chiusura del ResultSet");
					e.printStackTrace();
				}
			}

			// Chiusura dello Statement
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
					System.out.println("chiusura Statement");
				} catch (SQLException e) {
					System.out.println("Errore di chiusura Statement");
					e.printStackTrace();
				}
			}
			// Chiusura dell connection
			if (conn != null) {
				try {
					conn.close();
					conn = null;
					System.out.println("chiusura Connection");
				} catch (SQLException e) {
					System.out.println("Problemi di chiusura Connection");
					e.printStackTrace();
				}
			}

		}

	}

	// CHIUSURA GET

	// APERTURA DELETEALL
	public static void deleteALLGatto() {

		Connection conn = null;
		Statement stmt = null;

		String url = "jdbc:mysql://localhost:3306/gatti";
		String username = "root";
		String password = "";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);

			stmt = conn.createStatement();

			String deleteALL = "DELETE FROM gatto";

			int result = stmt.executeUpdate(deleteALL);

			if (result > 0) {
				System.out.println(result);
			} else {
				System.out.println("Problemi durante l'inserimento");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Classe non trovata");
			e.printStackTrace();
		} catch (SQLException sql) {
			System.out.println("Eccezzione specifica di sql");
			sql.printStackTrace();
		} catch (Exception e) {
			System.out.println("Eccezione generica");
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					System.out.println("Errore di chiusura Statement");
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
					conn = null;
				} catch (SQLException e) {
					System.out.println("Problemi di chiusura Connection");
					e.printStackTrace();
				}
			}

		}

	}
	// CHIUSURA DELETEALL

	// APERTURA DELETE GATTOCHIP
	public static void deleteGatto(int chip) {

		Connection conn = null;
		Statement stmt = null;

		String url = "jdbc:mysql://localhost:3306/gatti";
		String username = "root";
		String password = "";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);

			stmt = conn.createStatement();

			String deleteALL = "DELETE FROM gatto WHERE gatto.microchip =" + chip + ";";

			int result = stmt.executeUpdate(deleteALL);

			if (result > 0) {
				System.out.println(result);
			} else {
				System.out.println("Problemi durante l'inserimento");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Classe non trovata");
			e.printStackTrace();
		} catch (SQLException sql) {
			System.out.println("Eccezzione specifica di sql");
			sql.printStackTrace();
		} catch (Exception e) {
			System.out.println("Eccezione generica");
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					System.out.println("Errore di chiusura Statement");
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
					conn = null;
				} catch (SQLException e) {
					System.out.println("Problemi di chiusura Connection");
					e.printStackTrace();
				}
			}

		}

	}
	// CHIUSURA DELETE GATTOCHIP
	
	
	
	
	// APERTURA MODIFICA GATTO
	public static void aggiornaByNam(int chip, String nome) {

		Connection conn = null;
		Statement stmt = null;

		String url = "jdbc:mysql://localhost:3306/gatti";
		String username = "root";
		String password = "";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);

			stmt = conn.createStatement();

			String changeName = "UPDATE gatto SET nome = '" + nome + "' WHERE microchip = " + chip ;

			int result = stmt.executeUpdate(changeName);

			if (result > 0) {
				System.out.println(result);
			} else {
				System.out.println("Problemi durante l'inserimento");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Classe non trovata");
			e.printStackTrace();
		} catch (SQLException sql) {
			System.out.println("Eccezzione specifica di sql");
			sql.printStackTrace();
		} catch (Exception e) {
			System.out.println("Eccezione generica");
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					System.out.println("Errore di chiusura Statement");
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
					conn = null;
				} catch (SQLException e) {
					System.out.println("Problemi di chiusura Connection");
					e.printStackTrace();
				}
			}

		}

	}
	
	// CHIUSURA MODIFICA GATTO

}
