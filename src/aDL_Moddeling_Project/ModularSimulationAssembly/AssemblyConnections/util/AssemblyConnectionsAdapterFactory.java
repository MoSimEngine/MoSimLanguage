/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.util;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.*;

import aDL_Moddeling_Project.basic.Entity;
import aDL_Moddeling_Project.basic.Identifier;
import aDL_Moddeling_Project.basic.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage
 * @generated
 */
public class AssemblyConnectionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssemblyConnectionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssemblyConnectionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectionsSwitch<Adapter> modelSwitch =
		new AssemblyConnectionsSwitch<Adapter>() {
			@Override
			public Adapter caseComposedAssembly_CoodinatorConnection(ComposedAssembly_CoodinatorConnection object) {
				return createComposedAssembly_CoodinatorConnectionAdapter();
			}
			@Override
			public Adapter caseMWAssembly_CoordinatorConnection(MWAssembly_CoordinatorConnection object) {
				return createMWAssembly_CoordinatorConnectionAdapter();
			}
			@Override
			public Adapter caseSimulation_CoordinatorConnection(Simulation_CoordinatorConnection object) {
				return createSimulation_CoordinatorConnectionAdapter();
			}
			@Override
			public Adapter caseSimulationAssemblyEntity_CoordinatorConnection(SimulationAssemblyEntity_CoordinatorConnection object) {
				return createSimulationAssemblyEntity_CoordinatorConnectionAdapter();
			}
			@Override
			public Adapter caseProvidedRequiredConnection(ProvidedRequiredConnection object) {
				return createProvidedRequiredConnectionAdapter();
			}
			@Override
			public Adapter caseMWCoordinator_CoordinatorConnection(MWCoordinator_CoordinatorConnection object) {
				return createMWCoordinator_CoordinatorConnectionAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseMasterWorkerConnection(MasterWorkerConnection object) {
				return createMasterWorkerConnectionAdapter();
			}
			@Override
			public Adapter caseSimulationInvolvedConnection(SimulationInvolvedConnection object) {
				return createSimulationInvolvedConnectionAdapter();
			}
			@Override
			public Adapter caseCoordinatorFunctionMapping(CoordinatorFunctionMapping object) {
				return createCoordinatorFunctionMappingAdapter();
			}
			@Override
			public Adapter caseRequiredDataMappingConnection(RequiredDataMappingConnection object) {
				return createRequiredDataMappingConnectionAdapter();
			}
			@Override
			public Adapter caseObjectOrientedViewRequiredDataMapping(ObjectOrientedViewRequiredDataMapping object) {
				return createObjectOrientedViewRequiredDataMappingAdapter();
			}
			@Override
			public Adapter caseUnstructuredViewRequiredDataMapping(UnstructuredViewRequiredDataMapping object) {
				return createUnstructuredViewRequiredDataMappingAdapter();
			}
			@Override
			public Adapter caseInterfaceProvidedRequiredConnection(InterfaceProvidedRequiredConnection object) {
				return createInterfaceProvidedRequiredConnectionAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection <em>Composed Assembly Coodinator Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ComposedAssembly_CoodinatorConnection
	 * @generated
	 */
	public Adapter createComposedAssembly_CoodinatorConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWAssembly_CoordinatorConnection <em>MW Assembly Coordinator Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWAssembly_CoordinatorConnection
	 * @generated
	 */
	public Adapter createMWAssembly_CoordinatorConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Simulation_CoordinatorConnection <em>Simulation Coordinator Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Simulation_CoordinatorConnection
	 * @generated
	 */
	public Adapter createSimulation_CoordinatorConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationAssemblyEntity_CoordinatorConnection <em>Simulation Assembly Entity Coordinator Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationAssemblyEntity_CoordinatorConnection
	 * @generated
	 */
	public Adapter createSimulationAssemblyEntity_CoordinatorConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection <em>Provided Required Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ProvidedRequiredConnection
	 * @generated
	 */
	public Adapter createProvidedRequiredConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWCoordinator_CoordinatorConnection <em>MW Coordinator Coordinator Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MWCoordinator_CoordinatorConnection
	 * @generated
	 */
	public Adapter createMWCoordinator_CoordinatorConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MasterWorkerConnection <em>Master Worker Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.MasterWorkerConnection
	 * @generated
	 */
	public Adapter createMasterWorkerConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationInvolvedConnection <em>Simulation Involved Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.SimulationInvolvedConnection
	 * @generated
	 */
	public Adapter createSimulationInvolvedConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping <em>Coordinator Function Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.CoordinatorFunctionMapping
	 * @generated
	 */
	public Adapter createCoordinatorFunctionMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection <em>Required Data Mapping Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.RequiredDataMappingConnection
	 * @generated
	 */
	public Adapter createRequiredDataMappingConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ObjectOrientedViewRequiredDataMapping <em>Object Oriented View Required Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.ObjectOrientedViewRequiredDataMapping
	 * @generated
	 */
	public Adapter createObjectOrientedViewRequiredDataMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.UnstructuredViewRequiredDataMapping <em>Unstructured View Required Data Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.UnstructuredViewRequiredDataMapping
	 * @generated
	 */
	public Adapter createUnstructuredViewRequiredDataMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.InterfaceProvidedRequiredConnection <em>Interface Provided Required Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.InterfaceProvidedRequiredConnection
	 * @generated
	 */
	public Adapter createInterfaceProvidedRequiredConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.basic.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.basic.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.basic.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.basic.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.basic.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.basic.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AssemblyConnectionsAdapterFactory
