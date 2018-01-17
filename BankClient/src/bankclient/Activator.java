package bankclient;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.sapient.service1.ISer;


public class Activator extends AbstractUIPlugin {

	private ServiceReference sref = null;
	public Activator() {
	}

	
	public void start(BundleContext context) throws Exception {
		System.out.println("Bank client started");
		sref = context.getServiceReference(ISer.class.getName());
		ISer ser = (ISer) context.getService(sref);
		System.out.println(ser.calcSimple(2000, 2, 3));
	}

	
	public void stop(BundleContext context) throws Exception {
		
		super.stop(context);
		System.out.println("Bank client stopped");
	}

	
}
