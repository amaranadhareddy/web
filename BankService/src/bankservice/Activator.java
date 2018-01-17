package bankservice;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.sapient.service1.ISer;
import com.sapient.service1.SerImpl;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	private ServiceRegistration register;
	
	public Activator() {
		
	}

	
	public void start(BundleContext context) throws Exception {
		System.out.println("Bank Service started");
		ISer ser = new SerImpl();
		register = context.registerService(ISer.class.getName(), ser , null);
		System.out.println("Simple interest API is registered");
	}

	
	public void stop(BundleContext context) throws Exception {
		register.unregister();
		super.stop(context);
		System.out.println("Bank service stopped");
	}

	
}
