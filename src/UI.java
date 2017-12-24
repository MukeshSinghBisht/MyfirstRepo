import javax.swing.JOptionPane;
class  UI{
	public  static void main(String[]args) {
		String fn1=JOptionPane.showInputDialog("Enter First Nmber");
		String fn2=JOptionPane.showInputDialog("Enter Second Nmber");
	int num1=Integer.parseInt(fn1);
	int num2=Integer.parseInt(fn2);
	int sum=num1+num2;
	JOptionPane.showMessageDialog(null, "sum  is "+ sum, "the title", JOptionPane.PLAIN_MESSAGE);
	}
}