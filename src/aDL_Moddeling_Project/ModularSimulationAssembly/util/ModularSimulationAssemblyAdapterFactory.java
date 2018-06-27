/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.util;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;

import aDL_Moddeling_Project.ModularSimulationAssembly.*;

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
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage
 * @generated
 */
public class ModularSimulationAssemblyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModularSimulationAssemblyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularSimulationAssemblyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModularSimulationAssemblyPackage.eINSTANCE;
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
	protected ModularSimulationAssemblySwitch<Adapter> modelSwitch =
		new ModularSimulationAssemblySwitch<Adapter>() {
			@Override
			public Adapter caseSimulationAssembly(SimulationAssembly object) {
				return createSimulationAssemblyAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter casegeneralSimulationFunction(generalSimulationFunction object) {
				return creategeneralSimulationFunctionAdapter();
			}
			@Override
			public Adapter caseBasicModSimEntity(BasicModSimEntity object) {
				return createBasicModSimEntityAdapter();
			}
			@Override
			public Adapter caseAssembly(Assembly object) {
				return createAssemblyAdapter();
			}
			@Override
			public Adapter caseSimulationAssemblyEntity(SimulationAssemblyEntity object) {
				return createSimulationAssemblyEntityAdapter();
			}
			@Override
			public Adapter caseAssembableEntity(AssembableEntity object) {
				return createAssembableEntityAdapter();
			}
			@Override
			public Adapter caseCombinedAssemblyEntity(CombinedAssemblyEntity object) {
				return createCombinedAssemblyEntityAdapter();
			}
			@Override
			public Adapter caseAdapterDescriptionAttachment(AdapterDescriptionAttachment object) {
				return createAdapterDescriptionAttachmentAdapter();
			}
			@Override
			public Adapter caseCoordinatorAssemblyEntity(CoordinatorAssemblyEntity object) {
				return createCoordinatorAssemblyEntityAdapter();
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
			public Adapter caseAdaptable(Adaptable object) {
				return createAdaptableAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
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
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly <em>Simulation Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly
	 * @generated
	 */
	public Adapter createSimulationAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.generalSimulationFunction <em>general Simulation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.generalSimulationFunction
	 * @generated
	 */
	public Adapter creategeneralSimulationFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity <em>Basic Mod Sim Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity
	 * @generated
	 */
	public Adapter createBasicModSimEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.Assembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.Assembly
	 * @generated
	 */
	public Adapter createAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity <em>Simulation Assembly Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity
	 * @generated
	 */
	public Adapter createSimulationAssemblyEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity <em>Assembable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity
	 * @generated
	 */
	public Adapter createAssembableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.CombinedAssemblyEntity <em>Combined Assembly Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.CombinedAssemblyEntity
	 * @generated
	 */
	public Adapter createCombinedAssemblyEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment <em>Adapter Description Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment
	 * @generated
	 */
	public Adapter createAdapterDescriptionAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity <em>Coordinator Assembly Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity
	 * @generated
	 */
	public Adapter createCoordinatorAssemblyEntityAdapter() {
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
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable
	 * @generated
	 */
	public Adapter createAdaptableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
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

} //ModularSimulationAssemblyAdapterFactory
