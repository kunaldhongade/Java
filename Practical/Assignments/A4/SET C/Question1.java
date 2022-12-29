import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

class Operations {
	Scanner sc = new Scanner(System.in);
	String s;

	public void insert(String a) {
		try {

			System.out.print("Enter Data to save in File : ");
			s = sc.nextLine();
			File file = new File(a);
			FileWriter fw = new FileWriter(a, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			if (file.length() == 0) {
				pw.println(s);
			} else {
				appendToFile(Paths.get(file.getAbsolutePath()), s + "\n");
			}
			pw.close();
			bw.close();
			fw.close();

			System.out.println("Data Inserted Sucessfuly.");
		} catch (Exception e) {
			System.out.println("Error.");
		}
	}

	public void delete(String a) {
		File file1 = new File(a);
		File file2 = new File("Shreeganesh.txt");
		int x1 = 0;
		try {
			System.out.println("Enter data which you want to remove from File. :" + a);
			s = sc.nextLine();

			FileReader fr = new FileReader(a);
			BufferedReader br = new BufferedReader(fr);

			file2.createNewFile();
			FileWriter fw = new FileWriter("Shreeganesh.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			String x;

			while ((x = br.readLine()) != null) {

				if (x.equals(s)) {
					x1++;
					continue;
				}
				pw.println(x);
			}
			pw.flush();
			pw.close();
			fr.close();
			br.close();
			bw.close();
			fw.close();

		} catch (Exception e) {

		}
		if (file1.delete()) {
		} else {
		}
		if (x1 == 0) {
			System.out.println("No such data found.");
		} else {
			System.out.println("DataLine Deleted Sucessfuly.");
		}
		File dump = new File(a);
		file2.renameTo(dump);

	}

	public void appendFile(String a) {
		try {
			File file = new File(a);
			String p = file.getAbsolutePath();
			System.out.print("Enter data to Append : ");
			s = sc.nextLine();
			Path path = Paths.get(p);
			appendToFile(path, s + "\n");
		} catch (Exception e) {
			System.out.println("Error..");
		}
	}

	public static void appendToFile(Path path, String content) throws IOException {
		try {

			Files.write(path, content.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
			System.out.println("Data Append Sucessfuly.");

		} catch (Exception e) {
			System.out.println("Error..");
		}
	}

	public void modify(String a) {
		File file1 = new File(a);
		File file2 = new File("Shreeganesh.txt");
		int x1 = 0;

		try {
			FileWriter fw = new FileWriter("Shreeganesh.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			FileReader fr = new FileReader(a);
			BufferedReader br = new BufferedReader(fr);
			// Scanner br=new Scanner(file1);
			System.out.print("Enter LineData which you want to Modify :");
			String old = sc.nextLine();
			String x;
			while ((x = br.readLine()) != null) {
				if (x.equals(old)) {
					x1++;
					System.out.print("Enter Data to Modify : ");
					s = sc.nextLine();
					pw.println(s);
				} else {
					pw.println(x);
				}
			}
			pw.flush();
			pw.close();
			bw.close();
			fw.close();
			fr.close();
			br.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		if (x1 == 0) {
			if (file2.delete()) {
				System.out.println("No such Data found.");
			}
		} else {

			if (file1.delete()) {
				File d = new File(a);
				file2.renameTo(d);
				System.out.println("DataLine Modify Sucessfuly.");
			} else {
				System.out.println("Error Ocured to perform this Operation.");
			}
		}
	}
}

public class Question1 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		try {
			Operations o = new Operations();
			File file = new File(arg[0]);
			if (file.createNewFile()) {
				System.out.println("File Created Sucessfuly.");
			} else {
				System.out.println("File Opened Sucessfuly.");
			}
			while (true) {
				System.out.print(
						"1.Insert Line In File.\n2.Delete Line From File.\n3.Append Line In File.\n4.Modify Line In File.\n5.Exit.\nEnter Your Choise :");
				int n = sc.nextInt();
				switch (n) {
					case 1:
						o.insert(arg[0]);
						break;
					case 2:
						o.delete(arg[0]);
						break;
					case 3:
						o.appendFile(arg[0]);
						break;
					case 4:
						o.modify(arg[0]);
						break;
					case 5:
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Input.");
				}
			}

		} catch (Exception e) {
			System.out.println("Error.");
		}

	}
}