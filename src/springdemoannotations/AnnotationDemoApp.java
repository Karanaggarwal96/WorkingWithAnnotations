package springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationDemoApp {

	public static void main(String[] args) {
		//load spring configuration file
				ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			
				
				
				//retrieve a bean from spring container
				Coach theCoach=context.getBean("tennisCoach",Coach.class);
				
				
				//call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				System.out.println(theCoach.getDailyFortune());
				
				
				context.close();

	}

}
