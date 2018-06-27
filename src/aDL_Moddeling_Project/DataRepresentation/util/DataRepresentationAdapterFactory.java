/**
 */
package aDL_Moddeling_Project.DataRepresentation.util;

import aDL_Moddeling_Project.DataRepresentation.*;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionEnhanceableEntity;

import aDL_Moddeling_Project.basic.Entity;
import aDL_Moddeling_Project.basic.Identifier;
import aDL_Moddeling_Project.basic.NamedElement;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage
 * @generated
 */
public class DataRepresentationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataRepresentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataRepresentationPackage.eINSTANCE;
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
	protected DataRepresentationSwitch<Adapter> modelSwitch =
		new DataRepresentationSwitch<Adapter>() {
			@Override
			public Adapter caseObjectClass(ObjectClass object) {
				return createObjectClassAdapter();
			}
			@Override
			public Adapter caseObjectClassOperation(ObjectClassOperation object) {
				return createObjectClassOperationAdapter();
			}
			@Override
			public Adapter caseObjectInstance(ObjectInstance object) {
				return createObjectInstanceAdapter();
			}
			@Override
			public Adapter caseClassReferenceProperty(ClassReferenceProperty object) {
				return createClassReferencePropertyAdapter();
			}
			@Override
			public Adapter caseObjectOrientedViewSimulationData(ObjectOrientedViewSimulationData object) {
				return createObjectOrientedViewSimulationDataAdapter();
			}
			@Override
			public Adapter caserequiredDataInterface(requiredDataInterface object) {
				return createrequiredDataInterfaceAdapter();
			}
			@Override
			public Adapter caseInstancedObjects(InstancedObjects object) {
				return createInstancedObjectsAdapter();
			}
			@Override
			public Adapter caseObjectClassDefinitions(ObjectClassDefinitions object) {
				return createObjectClassDefinitionsAdapter();
			}
			@Override
			public Adapter caseObjectClassInheritance(ObjectClassInheritance object) {
				return createObjectClassInheritanceAdapter();
			}
			@Override
			public Adapter caseOperationOverride(OperationOverride object) {
				return createOperationOverrideAdapter();
			}
			@Override
			public Adapter caseSimulationData(SimulationData object) {
				return createSimulationDataAdapter();
			}
			@Override
			public Adapter caseDataToValueMap(Map.Entry<Data, String> object) {
				return createDataToValueMapAdapter();
			}
			@Override
			public Adapter caseEnumToEnumassignmentMap(Map.Entry<EnumType, EnumLiteral> object) {
				return createEnumToEnumassignmentMapAdapter();
			}
			@Override
			public Adapter caseDataToObjectMap(Map.Entry<ClassReferenceProperty, ObjectInstance> object) {
				return createDataToObjectMapAdapter();
			}
			@Override
			public Adapter caseObjectOrientedViewRequiredEntry(ObjectOrientedViewRequiredEntry object) {
				return createObjectOrientedViewRequiredEntryAdapter();
			}
			@Override
			public Adapter caseUnstructuredViewRequiredEntry(UnstructuredViewRequiredEntry object) {
				return createUnstructuredViewRequiredEntryAdapter();
			}
			@Override
			public Adapter caseRequiredReferenceProperty(RequiredReferenceProperty object) {
				return createRequiredReferencePropertyAdapter();
			}
			@Override
			public Adapter caseRequiredDataEntry(RequiredDataEntry object) {
				return createRequiredDataEntryAdapter();
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
			public Adapter caseAdditionEnhanceableEntity(AdditionEnhanceableEntity object) {
				return createAdditionEnhanceableEntityAdapter();
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
			public Adapter caseData(Data object) {
				return createDataAdapter();
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
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClass
	 * @generated
	 */
	public Adapter createObjectClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation <em>Object Class Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation
	 * @generated
	 */
	public Adapter createObjectClassOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectInstance <em>Object Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectInstance
	 * @generated
	 */
	public Adapter createObjectInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty <em>Class Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty
	 * @generated
	 */
	public Adapter createClassReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData <em>Object Oriented View Simulation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewSimulationData
	 * @generated
	 */
	public Adapter createObjectOrientedViewSimulationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.requiredDataInterface <em>required Data Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.requiredDataInterface
	 * @generated
	 */
	public Adapter createrequiredDataInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.InstancedObjects <em>Instanced Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.InstancedObjects
	 * @generated
	 */
	public Adapter createInstancedObjectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassDefinitions <em>Object Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClassDefinitions
	 * @generated
	 */
	public Adapter createObjectClassDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance <em>Object Class Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance
	 * @generated
	 */
	public Adapter createObjectClassInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.OperationOverride <em>Operation Override</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.OperationOverride
	 * @generated
	 */
	public Adapter createOperationOverrideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.SimulationData <em>Simulation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.SimulationData
	 * @generated
	 */
	public Adapter createSimulationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Data To Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createDataToValueMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Enum To Enumassignment Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEnumToEnumassignmentMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Data To Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createDataToObjectMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry <em>Object Oriented View Required Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry
	 * @generated
	 */
	public Adapter createObjectOrientedViewRequiredEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.UnstructuredViewRequiredEntry <em>Unstructured View Required Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.UnstructuredViewRequiredEntry
	 * @generated
	 */
	public Adapter createUnstructuredViewRequiredEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.RequiredReferenceProperty <em>Required Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.RequiredReferenceProperty
	 * @generated
	 */
	public Adapter createRequiredReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.RequiredDataEntry <em>Required Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.RequiredDataEntry
	 * @generated
	 */
	public Adapter createRequiredDataEntryAdapter() {
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
	 * Creates a new adapter for an object of class '{@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
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

} //DataRepresentationAdapterFactory
