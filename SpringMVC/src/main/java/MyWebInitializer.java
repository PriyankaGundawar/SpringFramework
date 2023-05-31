import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.priya.PriyaConfig;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {PriyaConfig.class}; //we need to provide configuration class
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"}; //need to provide package
	}

}

//this class has created to remove web.xml file. 