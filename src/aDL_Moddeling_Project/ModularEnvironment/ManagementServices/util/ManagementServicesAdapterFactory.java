/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.util;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.*;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;

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
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage
 * @generated
 */
public class ManagementServicesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ManagementServicesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServicesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ManagementServicesPackage.eINSTANCE;
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
	protected ManagementServicesSwitch<Adapter> modelSwitch =
		new ManagementServicesSwitch<Adapter>() {
			@Override
			public Adapter caseManagementService(ManagementService object) {
				return createManagementServiceAdapter();
			}
			@Override
			public Adapter caseManagementServiceSupportEntity(ManagementServiceSupportEntity object) {
				return createManagementServiceSupportEntityAdapter();
			}
			@Override
			public Adapter caseManagementServiceFunction(ManagementServiceFunction object) {
				return createManagementServiceFunctionAdapter();
			}
			@Override
			public Adapter caseManagementServiceInterface(ManagementServiceInterface object) {
				return createManagementServiceInterfaceAdapter();
			}
			@Override
			public Adapter caseMSEPropertyAdditionContainer(MSEPropertyAdditionContainer object) {
				return createMSEPropertyAdditionContainerAdapter();
			}
			@Override
			public Adapter caseadditionValue(additionValue object) {
				return createadditionValueAdapter();
			}
			@Override
			public Adapter caseMultipleSelectionAdditionSetter(MultipleSelectionAdditionSetter object) {
				return createMultipleSelectionAdditionSetterAdapter();
			}
			@Override
			public Adapter caseExclusiveSelectionAdditionSetter(ExclusiveSelectionAdditionSetter object) {
				return createExclusiveSelectionAdditionSetterAdapter();
			}
			@Override
			public Adapter caseSelectableAddition(SelectableAddition object) {
				return createSelectableAdditionAdapter();
			}
			@Override
			public Adapter caseCombinedAddition(CombinedAddition object) {
				return createCombinedAdditionAdapter();
			}
			@Override
			public Adapter caseCombinedAdditionSetter(CombinedAdditionSetter object) {
				return createCombinedAdditionSetterAdapter();
			}
			@Override
			public Adapter caseAdditionSetter(AdditionSetter object) {
				return createAdditionSetterAdapter();
			}
			@Override
			public Adapter caseExclusiveSettableAddition(ExclusiveSettableAddition object) {
				return createExclusiveSettableAdditionAdapter();
			}
			@Override
			public Adapter caseMultipleSettableAddition(MultipleSettableAddition object) {
				return createMultipleSettableAdditionAdapter();
			}
			@Override
			public Adapter caseAdditionEnhanceableEntity(AdditionEnhanceableEntity object) {
				return createAdditionEnhanceableEntityAdapter();
			}
			@Override
			public Adapter caseWritableAddition(WritableAddition object) {
				return createWritableAdditionAdapter();
			}
			@Override
			public Adapter caseWritableAdditionSetter(WritableAdditionSetter object) {
				return createWritableAdditionSetterAdapter();
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
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService <em>Management Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService
	 * @generated
	 */
	public Adapter createManagementServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceSupportEntity <em>Management Service Support Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceSupportEntity
	 * @generated
	 */
	public Adapter createManagementServiceSupportEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction <em>Management Service Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction
	 * @generated
	 */
	public Adapter createManagementServiceFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface <em>Management Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface
	 * @generated
	 */
	public Adapter createManagementServiceInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer <em>MSE Property Addition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer
	 * @generated
	 */
	public Adapter createMSEPropertyAdditionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.additionValue <em>addition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.additionValue
	 * @generated
	 */
	public Adapter createadditionValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter <em>Multiple Selection Addition Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter
	 * @generated
	 */
	public Adapter createMultipleSelectionAdditionSetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter <em>Exclusive Selection Addition Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter
	 * @generated
	 */
	public Adapter createExclusiveSelectionAdditionSetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.SelectableAddition <em>Selectable Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.SelectableAddition
	 * @generated
	 */
	public Adapter createSelectableAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAddition <em>Combined Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAddition
	 * @generated
	 */
	public Adapter createCombinedAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter <em>Combined Addition Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.CombinedAdditionSetter
	 * @generated
	 */
	public Adapter createCombinedAdditionSetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter <em>Addition Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter
	 * @generated
	 */
	public Adapter createAdditionSetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSettableAddition <em>Exclusive Settable Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSettableAddition
	 * @generated
	 */
	public Adapter createExclusiveSettableAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSettableAddition <em>Multiple Settable Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSettableAddition
	 * @generated
	 */
	public Adapter createMultipleSettableAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionEnhanceableEntity <em>Addition Enhanceable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionEnhanceableEntity
	 * @generated
	 */
	public Adapter createAdditionEnhanceableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAddition <em>Writable Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAddition
	 * @generated
	 */
	public Adapter createWritableAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter <em>Writable Addition Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter
	 * @generated
	 */
	public Adapter createWritableAdditionSetterAdapter() {
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

} //ManagementServicesAdapterFactory
