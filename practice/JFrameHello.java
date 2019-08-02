/**editor wangdaocheng
   time 2019/7/31
*/

import javax.swing.*;

public class JFrameHello{
	public static void main(String[] args){
		JFrame frame = new JFrame("jojo");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("jojo5");
		panel.add(label);
		frame.setContentPane(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}