/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.util;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.*;

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
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage
 * @generated
 */
public class AssemblyInterfaceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssemblyInterfacePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyInterfaceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssemblyInterfacePackage.eINSTANCE;
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
	protected AssemblyInterfaceSwitch<Adapter> modelSwitch =
		new AssemblyInterfaceSwitch<Adapter>() {
			@Override
			public Adapter caseInterfaceRepository(InterfaceRepository object) {
				return createInterfaceRepositoryAdapter();
			}
			@Override
			public Adapter caseAssemblyInterface(AssemblyInterface object) {
				return createAssemblyInterfaceAdapter();
			}
			@Override
			public Adapter caseAbstractAssemblyEntity(AbstractAssemblyEntity object) {
				return createAbstractAssemblyEntityAdapter();
			}
			@Override
			public Adapter caseAbstractInterfaceObjectClass(AbstractInterfaceObjectClass object) {
				return createAbstractInterfaceObjectClassAdapter();
			}
			@Override
			public Adapter caseAbstractInterfaceData(AbstractInterfaceData object) {
				return createAbstractInterfaceDataAdapter();
			}
			@Override
			public Adapter caseAbstractInterfaceOperation(AbstractInterfaceOperation object) {
				return createAbstractInterfaceOperationAdapter();
			}
			@Override
			public Adapter caseAbstractParameter(AbstractParameter object) {
				return createAbstractParameterAdapter();
			}
			@Override
			public Adapter caseInterfaceMapping(InterfaceMapping object) {
				return createInterfaceMappingAdapter();
			}
			@Override
			public Adapter caseRequiredInterfaceMapping(RequiredInterfaceMapping object) {
				return createRequiredInterfaceMappingAdapter();
			}
			@Override
			public Adapter casePrivdedInterfaceMapping(PrivdedInterfaceMapping object) {
				return createPrivdedInterfaceMappingAdapter();
			}
			@Override
			public Adapter caseProvidingInterfaceObjectClassMapping(ProvidingInterfaceObjectClassMapping object) {
				return createProvidingInterfaceObjectClassMappingAdapter();
			}
			@Override
			public Adapter caseRequieringInterfaceObjectClassMapping(RequieringInterfaceObjectClassMapping object) {
				return createRequieringInterfaceObjectClassMappingAdapter();
			}
			@Override
			public Adapter caseEnhancedToInterfaceMapping(EnhancedToInterfaceMapping object) {
				return createEnhancedToInterfaceMappingAdapter();
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
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceRepository <em>Interface Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceRepository
	 * @generated
	 */
	public Adapter createInterfaceRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterface <em>Assembly Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterface
	 * @generated
	 */
	public Adapter createAssemblyInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractAssemblyEntity <em>Abstract Assembly Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractAssemblyEntity
	 * @generated
	 */
	public Adapter createAbstractAssemblyEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass <em>Abstract Interface Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass
	 * @generated
	 */
	public Adapter createAbstractInterfaceObjectClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData <em>Abstract Interface Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData
	 * @generated
	 */
	public Adapter createAbstractInterfaceDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation <em>Abstract Interface Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation
	 * @generated
	 */
	public Adapter createAbstractInterfaceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter <em>Abstract Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter
	 * @generated
	 */
	public Adapter createAbstractParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping <em>Interface Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping
	 * @generated
	 */
	public Adapter createInterfaceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequiredInterfaceMapping <em>Required Interface Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequiredInterfaceMapping
	 * @generated
	 */
	public Adapter createRequiredInterfaceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.PrivdedInterfaceMapping <em>Privded Interface Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.PrivdedInterfaceMapping
	 * @generated
	 */
	public Adapter createPrivdedInterfaceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping <em>Providing Interface Object Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping
	 * @generated
	 */
	public Adapter createProvidingInterfaceObjectClassMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping <em>Requiering Interface Object Class Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping
	 * @generated
	 */
	public Adapter createRequieringInterfaceObjectClassMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping <em>Enhanced To Interface Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping
	 * @generated
	 */
	public Adapter createEnhancedToInterfaceMappingAdapter() {
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

} //AssemblyInterfaceAdapterFactory
