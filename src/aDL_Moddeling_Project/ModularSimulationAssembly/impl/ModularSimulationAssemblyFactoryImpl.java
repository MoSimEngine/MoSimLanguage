/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModularSimulationAssemblyFactoryImpl extends EFactoryImpl implements ModularSimulationAssemblyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModularSimulationAssemblyFactory init() {
		try {
			ModularSimulationAssemblyFactory theModularSimulationAssemblyFactory = (ModularSimulationAssemblyFactory)EPackage.Registry.INSTANCE.getEFactory(ModularSimulationAssemblyPackage.eNS_URI);
			if (theModularSimulationAssemblyFactory != null) {
				return theModularSimulationAssemblyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModularSimulationAssemblyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularSimulationAssemblyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY: return createSimulationAssembly();
			case ModularSimulationAssemblyPackage.CONNECTOR: return createConnector();
			case ModularSimulationAssemblyPackage.GENERAL_SIMULATION_FUNCTION: return creategeneralSimulationFunction();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY: return createSimulationAssemblyEntity();
			case ModularSimulationAssemblyPackage.COMBINED_ASSEMBLY_ENTITY: return createCombinedAssemblyEntity();
			case ModularSimulationAssemblyPackage.ADAPTER_DESCRIPTION_ATTACHMENT: return createAdapterDescriptionAttachment();
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY: return createCoordinatorAssemblyEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationAssembly createSimulationAssembly() {
		SimulationAssemblyImpl simulationAssembly = new SimulationAssemblyImpl();
		return simulationAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public generalSimulationFunction creategeneralSimulationFunction() {
		generalSimulationFunctionImpl generalSimulationFunction = new generalSimulationFunctionImpl();
		return generalSimulationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationAssemblyEntity createSimulationAssemblyEntity() {
		SimulationAssemblyEntityImpl simulationAssemblyEntity = new SimulationAssemblyEntityImpl();
		return simulationAssemblyEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedAssemblyEntity createCombinedAssemblyEntity() {
		CombinedAssemblyEntityImpl combinedAssemblyEntity = new CombinedAssemblyEntityImpl();
		return combinedAssemblyEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterDescriptionAttachment createAdapterDescriptionAttachment() {
		AdapterDescriptionAttachmentImpl adapterDescriptionAttachment = new AdapterDescriptionAttachmentImpl();
		return adapterDescriptionAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatorAssemblyEntity createCoordinatorAssemblyEntity() {
		CoordinatorAssemblyEntityImpl coordinatorAssemblyEntity = new CoordinatorAssemblyEntityImpl();
		return coordinatorAssemblyEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularSimulationAssemblyPackage getModularSimulationAssemblyPackage() {
		return (ModularSimulationAssemblyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModularSimulationAssemblyPackage getPackage() {
		return ModularSimulationAssemblyPackage.eINSTANCE;
	}

} //ModularSimulationAssemblyFactoryImpl
