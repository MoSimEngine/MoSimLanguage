/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class AssemblyConnectionsFactoryImpl extends EFactoryImpl implements AssemblyConnectionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssemblyConnectionsFactory init() {
		try {
			AssemblyConnectionsFactory theAssemblyConnectionsFactory = (AssemblyConnectionsFactory)EPackage.Registry.INSTANCE.getEFactory(AssemblyConnectionsPackage.eNS_URI);
			if (theAssemblyConnectionsFactory != null) {
				return theAssemblyConnectionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssemblyConnectionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectionsFactoryImpl() {
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
			case AssemblyConnectionsPackage.COMPOSED_ASSEMBLY_COODINATOR_CONNECTION: return createComposedAssembly_CoodinatorConnection();
			case AssemblyConnectionsPackage.SIMULATION_ASSEMBLY_ENTITY_COORDINATOR_CONNECTION: return createSimulationAssemblyEntity_CoordinatorConnection();
			case AssemblyConnectionsPackage.MW_COORDINATOR_COORDINATOR_CONNECTION: return createMWCoordinator_CoordinatorConnection();
			case AssemblyConnectionsPackage.COORDINATOR_FUNCTION_MAPPING: return createCoordinatorFunctionMapping();
			case AssemblyConnectionsPackage.OBJECT_ORIENTED_VIEW_REQUIRED_DATA_MAPPING: return createObjectOrientedViewRequiredDataMapping();
			case AssemblyConnectionsPackage.UNSTRUCTURED_VIEW_REQUIRED_DATA_MAPPING: return createUnstructuredViewRequiredDataMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AssemblyConnectionsPackage.FUNCTION_MAPPING_MODUS:
				return createFunctionMappingModusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AssemblyConnectionsPackage.FUNCTION_MAPPING_MODUS:
				return convertFunctionMappingModusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedAssembly_CoodinatorConnection createComposedAssembly_CoodinatorConnection() {
		ComposedAssembly_CoodinatorConnectionImpl composedAssembly_CoodinatorConnection = new ComposedAssembly_CoodinatorConnectionImpl();
		return composedAssembly_CoodinatorConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationAssemblyEntity_CoordinatorConnection createSimulationAssemblyEntity_CoordinatorConnection() {
		SimulationAssemblyEntity_CoordinatorConnectionImpl simulationAssemblyEntity_CoordinatorConnection = new SimulationAssemblyEntity_CoordinatorConnectionImpl();
		return simulationAssemblyEntity_CoordinatorConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWCoordinator_CoordinatorConnection createMWCoordinator_CoordinatorConnection() {
		MWCoordinator_CoordinatorConnectionImpl mwCoordinator_CoordinatorConnection = new MWCoordinator_CoordinatorConnectionImpl();
		return mwCoordinator_CoordinatorConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatorFunctionMapping createCoordinatorFunctionMapping() {
		CoordinatorFunctionMappingImpl coordinatorFunctionMapping = new CoordinatorFunctionMappingImpl();
		return coordinatorFunctionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOrientedViewRequiredDataMapping createObjectOrientedViewRequiredDataMapping() {
		ObjectOrientedViewRequiredDataMappingImpl objectOrientedViewRequiredDataMapping = new ObjectOrientedViewRequiredDataMappingImpl();
		return objectOrientedViewRequiredDataMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredViewRequiredDataMapping createUnstructuredViewRequiredDataMapping() {
		UnstructuredViewRequiredDataMappingImpl unstructuredViewRequiredDataMapping = new UnstructuredViewRequiredDataMappingImpl();
		return unstructuredViewRequiredDataMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionMappingModus createFunctionMappingModusFromString(EDataType eDataType, String initialValue) {
		FunctionMappingModus result = FunctionMappingModus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionMappingModusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectionsPackage getAssemblyConnectionsPackage() {
		return (AssemblyConnectionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssemblyConnectionsPackage getPackage() {
		return AssemblyConnectionsPackage.eINSTANCE;
	}

} //AssemblyConnectionsFactoryImpl
