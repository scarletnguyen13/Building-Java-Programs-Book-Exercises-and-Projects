import java.awt.*;
import javax.swing.JPanel;
import javax.swing.*;

public class GraphicsTest extends JPanel {
	private static final long serialVersionUID = 1L;
	private int lines;
    private int lineGap;

    public GraphicsTest(int lines, int lineGap)
    {
        this.lines = lines;
        this.lineGap = lineGap;
    }

    @Override
    public Dimension getPreferredSize()
    {
        int size = lines * lineGap;
        return new Dimension(size, size);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        int width = getWidth();
        int height = getHeight();

        //  Draw lines starting from left to bottom

        int x = lineGap;
        int y = 0;

        for (int i = 0; i < lines; i++)
        {
            g.drawLine(0, y, x, height);
            x += lineGap;
            y += lineGap;
        }
        //  Draw lines starting from bottom to right

        x = 0;
        y = height - lineGap;

        for (int i = 0; i < lines; i++)
        {
            g.drawLine(x, height, width, y);
            x += lineGap;
            y -= lineGap;
        }

        //  Draw lines starting from right to top

        //  Draw lines starting from top to left

    }

    private static void createAndShowUI()
    {
        JFrame frame = new JFrame("DrawSSCCE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( new GraphicsTest(15, 15) );
        frame.pack();
        frame.setLocationByPlatform( true );
        frame.setVisible( true );
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowUI();
            }
        });
    }
}
