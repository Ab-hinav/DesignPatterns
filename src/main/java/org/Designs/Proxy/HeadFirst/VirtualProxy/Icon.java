package org.Designs.Proxy.HeadFirst.VirtualProxy;

import javax.swing.*;
import java.awt.*;

public interface Icon {

    public int getIconWidth();
    public void paintIcon(Component c, Graphics g, int x, int y);
    public int getIconHeight();

}
