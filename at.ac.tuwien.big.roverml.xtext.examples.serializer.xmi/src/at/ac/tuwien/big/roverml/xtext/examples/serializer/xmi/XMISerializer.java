package at.ac.tuwien.big.roverml.xtext.examples.serializer.xmi;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import at.ac.tuwien.big.RovermlStandaloneSetup;
import at.ac.tuwien.big.roverml.RoverMLPackage;

public class XMISerializer {

	public static void main(String[] args) {
		try {
//			serialize("models/Example1-ozobotEvo.rml", "models-gen/Example1-ozobotEvo.roverml");
//			serialize("models/Example2-PolarSysRover.rml", "models-gen/Example2-PolarSysRover.roverml");
			serializeAllExampleModels();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void serializeAllExampleModels() throws IOException {
		File rmlModelsDir = new File("models");
		File[] rmlModelFiles = rmlModelsDir.listFiles();
		for (File rmlModelFile : rmlModelFiles) {
			serialize(rmlModelFile.getPath(), "models-gen/" + rmlModelFile.getName().replace("rml", "roverml"));
		}
	}

	private static void serialize(String xtextUriString, String xmiURIString) throws IOException {
		// Register XMI resource factory for .roverml extension
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("roverml", new XMIResourceFactoryImpl());

		// Get Xtext resource set
		Injector injector = new RovermlStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		// Register RoverML metamodel
		resourceSet.getPackageRegistry().put(RoverMLPackage.eINSTANCE.getNsURI(), RoverMLPackage.eINSTANCE);

		// Load Xtext model
		URI uri = URI.createURI(xtextUriString);
		Resource xtextResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(xtextResource);

		// Create XMI model
		Resource xmiResource = resourceSet.createResource(URI.createURI(xmiURIString));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		xmiResource.save(null);
	}
}
