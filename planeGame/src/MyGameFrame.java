import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Description: 飛機大戰
 * @Author: QHB
 * @Date: 2022/10/12 9:50
 */
public class MyGameFrame extends Frame {
    public void launchFrame() {
        // 初始化窗口
        this.setTitle("飞机大战");
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLocation(300, 300);

        this.addWindowListener(new WindowAdapter() {
            // 退出窗口
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);

        g.drawLine(100, 50, 400, 400);
        g.drawRect(100, 50, 400, 400);
        g.drawOval(100, 50,400, 400);
        g.drawString("SXHKFDA", 50, 100);
    }

    public static void main(String[] args) {
        MyGameFrame frame = new MyGameFrame();
        frame.launchFrame();
    }

}
