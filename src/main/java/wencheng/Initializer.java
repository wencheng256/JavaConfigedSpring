package wencheng;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import wencheng.config.ApplicationConfigAop;
import wencheng.config.ApplicationContextConfigMvc;

/**
 * Created by Administrator on 2017/1/10 0010.
 */
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ApplicationConfigAop.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ApplicationContextConfigMvc.class};
    }

    protected String[] getServletMappings() {
        return new String[0];
    }
}
