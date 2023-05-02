package org.Designs.Proxy.HeadFirst.VirtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon{
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving;

    public ImageProxy(URL url){
        imageURL = url;
    }

    synchronized void setImageIcon(ImageIcon icon){
        this.imageIcon = icon;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon!=null){
            return imageIcon.getIconWidth();
        }

        return 800;
    }

    @Override
    public void paintIcon(Component c,Graphics g,int x,int y) {

        if (imageIcon!=null){
            imageIcon.paintIcon(c,g,x,y);
        }else {
            g.drawString("Loading ",x+200,y+100);
            if (!retrieving){
                retrieving = true;

                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            setImageIcon(new ImageIcon(imageURL,"Cd cover"));
                            c.repaint();
                        }catch (Exception e ){
                            System.out.println(e.getMessage());
                        }
                    }
                });
                retrievalThread.start();


            }
        }



    }

    @Override
    public int getIconHeight() {
        if (imageIcon!=null){
            return imageIcon.getIconHeight();
        }

        return 600;
    }
}
