import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SquareShape squareShape = context.getBean("squareShape",SquareShape.class);
        squareShape.drawShape();

        CircleShape circleShape = context.getBean("circleShape",CircleShape.class);
        circleShape.drawShape();

    }
}