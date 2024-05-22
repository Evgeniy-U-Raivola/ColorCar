import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class Design extends JPanel {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
      }

    public void paint(Graphics g) {
        Graphics2D g5=(Graphics2D) g;
        g5.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//сглаживание вкл
        BasicStroke pen1=new BasicStroke(2);
        BasicStroke pen2=new BasicStroke(1);
        BasicStroke pen3=new BasicStroke(3);
        //
        Color bl=new Color(80, 80, 80, 255);
        Color bl1=new Color(64,64,64,255);
        Color ferr1=new Color(122,118,118,255);
        Color ferr2=new Color(191,4,4,255);
        Color ferr3=new Color(235,228,228,255);
        Color ferr4=new Color(176, 171, 171, 255);
        //
        GradientPaint ferrari=new GradientPaint(300,170,Color.RED,300,60,Color.WHITE);
        GradientPaint ferrari1=new GradientPaint(400,350,ferr2,400,280,Color.RED);
        GradientPaint fwindow=new GradientPaint(370,180,ferr1,400,80,ferr3);
        GradientPaint swindow=new GradientPaint(300,190,ferr1,320,60,ferr3);
        GradientPaint lamp=new GradientPaint(660,180,ferr4,650,145,Color.WHITE);
        //
        //подкрылки перед + зад
        g5.setStroke(pen1);
        GeneralPath pp=new GeneralPath();
        pp.moveTo(290,312);//1
        pp.lineTo(280,200);//2
        pp.lineTo(350,200);//3
        pp.lineTo(330,312);//4
        pp.closePath();
        g5.setColor(bl1);
        g5.fill(pp);
        g5.setColor(Color.BLACK);
        g5.draw(pp);
        //
        GeneralPath zp=new GeneralPath();
        zp.moveTo(65,229);//1
        zp.lineTo(45,150);//2
        zp.lineTo(100,150);//3
        zp.lineTo(100,229);
        zp.closePath();
        g5.setColor(bl1);
        g5.fill(zp);
        g5.setColor(Color.BLACK);
        g5.draw(zp);
        //колесо заднее
        g5.setStroke(pen3);
        GeneralPath rrw=new GeneralPath();
        rrw.moveTo(115,175);//1
        rrw.quadTo(51,150,65,230);//2
        rrw.quadTo(76,270,100,270);//3;
        rrw.quadTo(118,272,140,265);//4
        rrw.closePath();
        g5.setColor(bl);
        g5.fill(rrw);
        g5.setColor(Color.BLACK);
        g5.draw(rrw);
        //колесо заднее внутр
        GeneralPath rrwinside=new GeneralPath();
        rrwinside.moveTo(115,190);//1
        rrwinside.quadTo(65,156,72,226);//2
        rrwinside.quadTo(80,267,105,257);//3
        rrwinside.quadTo(119,255,130,217);//4
        rrwinside.closePath();
        g5.setColor(bl1);
        g5.fill(rrwinside);
        g5.setColor(Color.BLACK);
        g5.draw(rrwinside);
        //диск задний
        g5.setStroke(pen1);
        GeneralPath rrdisk=new GeneralPath();
        rrdisk.moveTo(100,190);//1
        rrdisk.curveTo(80,185,75,220,87,240);//2
        rrdisk.quadTo(100,255,112,240);//3
        rrdisk.quadTo(128,205,101,191);//4
        rrdisk.closePath();
        g5.setColor(Color.WHITE);
        g5.fill(rrdisk);
        g5.setColor(Color.BLACK);
        g5.draw(rrdisk);
        //колпачёк диска
        g5.drawOval(97,211,7,12);
        g5.setColor(Color.YELLOW);
        g5.fillOval(97,211,7,12);
        //колесо переднее
        g5.setStroke(pen3);
        g5.setColor(Color.BLACK);
        GeneralPath frw=new GeneralPath();
        frw.moveTo(350,240);//1
        frw.quadTo(293,217,294,289);//2
        frw.quadTo(300,340,325,344);//3
        frw.quadTo(350,350,388,340);//4
        frw.lineTo(400,240);//5
        frw.closePath();
        g5.setColor(bl);
        g5.fill(frw);
        g5.setColor(Color.BLACK);
        g5.draw(frw);
        //колесо переднее внутр
        GeneralPath frwinside=new GeneralPath();
        frwinside.moveTo(347,254);//1
        frwinside.quadTo(312,232,308,280);//2
        frwinside.quadTo(306,335,340,335);//3
        frwinside.curveTo(370,330,370,280,349,256);//4
        frwinside.closePath();
        g5.setColor(bl1);
        g5.fill(frwinside);
        g5.setColor(Color.BLACK);
        g5.draw(frwinside);
        // диск передний
        g5.setStroke(pen1);
        GeneralPath frdisk=new GeneralPath();
        frdisk.moveTo(343,260);//1
        frdisk.curveTo(315,251,315,300,324,312);//2
        frdisk.quadTo(340,335,356,314);//3
        frdisk.quadTo(367,287,350,265);//4
        frdisk.closePath();
        g5.setColor(Color.WHITE);
        g5.fill(frdisk);
        g5.setColor(Color.BLACK);
        g5.draw(frdisk);
        //колпачёк диска переднего
        g5.drawOval(338,285,8,14);
        g5.setColor(Color.YELLOW);
        g5.fillOval(338,285,8,14);
        //корпус
        GeneralPath gp1=new GeneralPath();
        gp1.moveTo(45,150);//1
        gp1.quadTo(45,120,65,115);//2
        gp1.lineTo(310,80);//3
        gp1.quadTo(385,70,435,93);//4
        gp1.quadTo(448,99,450,100);//5
        gp1.lineTo(530,155);//6
        gp1.curveTo(570,154,660,185,674,225);//7
        gp1.curveTo(620,290,466,291,363,256);//8
        gp1.curveTo(310,195,275,240,295,313);//9
        gp1.lineTo(118,259);//10
        gp1.quadTo(117,221,110,200);//11
        gp1.curveTo(90,130,40,170,65,230);//12
        gp1.quadTo(45,195,45,150);
        gp1.closePath();
        g5.setPaint(ferrari);
        g5.fill(gp1);
        g5.setColor(Color.BLACK);
        g5.draw(gp1);
        //бампер
        GeneralPath gp2=new GeneralPath();
        gp2.moveTo(674,225);//1
        gp2.curveTo(610,311,393,277,365,257);//2
        gp2.quadTo(381,276,380,337);//3
        gp2.quadTo(420,350,480,348);//4
        gp2.quadTo(600,332,680,300);//5
        gp2.quadTo(691,294,694,286);//6
        gp2.lineTo(682,280);//7
        gp2.quadTo(685,245,680,233);//8
        gp2.closePath();
        g5.setPaint(ferrari1);
        g5.fill(gp2);
        g5.setColor(Color.BLACK);
        g5.draw(gp2);
        //линии бампера
        g5.setStroke(pen2);
        g5.drawArc(530,267,150,35,-3,-45);//справа
        g5.drawArc(355,270,220,65,-38,-100);//слева
        GeneralPath numb=new GeneralPath(); // номер
        numb.moveTo(573,309);//1
        numb.lineTo(639,293);//2
        numb.lineTo(639,307);//3
        numb.lineTo(574,324);//4
        numb.closePath();
        g5.setColor(Color.WHITE);
        g5.fill(numb);
        g5.setColor(Color.BLACK);
        g5.draw(numb);
        //лобовое стекло
        g5.setStroke(pen1);
        GeneralPath frontW = new GeneralPath();
        frontW.moveTo(443,100);//1
        frontW.lineTo(529,157);//2
        frontW.quadTo(490,185,325,190);//3
        frontW.quadTo(310,191,304,186);//4
        frontW.lineTo(281,123);//5
        frontW.quadTo(380,115,442,100);//6
        frontW.closePath();
        g5.setPaint(fwindow);
        g5.fill(frontW);
        g5.setColor(Color.BLACK);
        g5.draw(frontW);
        // Окно боковое
        GeneralPath sideW=new GeneralPath();
        sideW.moveTo(273,123);//1
        sideW.lineTo(230,114);//2
        sideW.quadTo(197,110,170,118);//3
        sideW.quadTo(140,132,163,152);//4
        sideW.quadTo(220,180,293,186);//5
        sideW.closePath();
        g5.setPaint(swindow);
        g5.fill(sideW);
        g5.setColor(Color.BLACK);
        g5.draw(sideW);
        // линии капота
        g5.setStroke(pen2);
        GeneralPath line1=new GeneralPath();
        line1.moveTo(530,162);//1
        line1.quadTo(610,195,638,236);//2
        g5.draw(line1);
        GeneralPath line2=new GeneralPath();
        line2.moveTo(370,200);//1
        line2.quadTo(460,210,525,258);//2
        g5.draw(line2);
        //боковая линия
        GeneralPath lineSide=new GeneralPath();
        lineSide.moveTo(292,240);
        lineSide.quadTo(130,180,55,125);
        g5.draw(lineSide);
        //люк бензобака
        g5.setStroke(pen1);
        GeneralPath luk=new GeneralPath();
        luk.moveTo(120,128);//1
        luk.curveTo(106,129,102,148,113,146);//2
        luk.curveTo(116,146,130,140,124,129);//3
        g5.draw(luk);

        // фара левая
        GeneralPath lightLH=new GeneralPath();
        lightLH.moveTo(610,190);//1
        lightLH.quadTo(633,186,657,214);//2
        lightLH.quadTo(667,230,649,222);//3
        lightLH.quadTo(621,205,601,192);//4
        lightLH.closePath();
        g5.setPaint(lamp);
        g5.fill(lightLH);
        g5.setColor(Color.BLACK);
        g5.draw(lightLH);
        // фара правая
        GeneralPath lightRH=new GeneralPath();
        lightRH.moveTo(424,221); //1
        lightRH.quadTo(459,230,486,254);//2
        lightRH.quadTo(497,264,472,261);//3
        lightRH.quadTo(367,235,424,221);//4
        lightRH.closePath();
        g5.setPaint(lamp);
        g5.fill(lightRH);
        g5.setColor(Color.BLACK);
        g5.draw(lightRH);
        //дверь
        GeneralPath door=new GeneralPath();
        door.moveTo(170,158);//1
        door.quadTo(168,157,157,168);//2
        door.quadTo(154,173,155,178);//3
        door.quadTo(155,220,185,271);//4
        door.lineTo(278,300);//5
        door.quadTo(268,230,289,196);//6
        g5.draw(door);

        g5.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);//сглаживание
    }
}
