/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.*;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType;

import java.util.Map;

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
public class DataRepresentationFactoryImpl extends EFactoryImpl implements DataRepresentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataRepresentationFactory init() {
		try {
			DataRepresentationFactory theDataRepresentationFactory = (DataRepresentationFactory)EPackage.Registry.INSTANCE.getEFactory(DataRepresentationPackage.eNS_URI);
			if (theDataRepresentationFactory != null) {
				return theDataRepresentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataRepresentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentationFactoryImpl() {
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
			case DataRepresentationPackage.OBJECT_CLASS: return createObjectClass();
			case DataRepresentationPackage.OBJECT_CLASS_OPERATION: return createObjectClassOperation();
			case DataRepresentationPackage.OBJECT_INSTANCE: return createObjectInstance();
			case DataRepresentationPackage.CLASS_REFERENCE_PROPERTY: return createClassReferenceProperty();
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_SIMULATION_DATA: return createObjectOrientedViewSimulationData();
			case DataRepresentationPackage.REQUIRED_DATA_INTERFACE: return createrequiredDataInterface();
			case DataRepresentationPackage.INSTANCED_OBJECTS: return createInstancedObjects();
			case DataRepresentationPackage.OBJECT_CLASS_DEFINITIONS: return createObjectClassDefinitions();
			case DataRepresentationPackage.OBJECT_CLASS_INHERITANCE: return createObjectClassInheritance();
			case DataRepresentationPackage.OPERATION_OVERRIDE: return createOperationOverride();
			case DataRepresentationPackage.DATA_TO_VALUE_MAP: return (EObject)createDataToValueMap();
			case DataRepresentationPackage.ENUM_TO_ENUMASSIGNMENT_MAP: return (EObject)createEnumToEnumassignmentMap();
			case DataRepresentationPackage.DATA_TO_OBJECT_MAP: return (EObject)createDataToObjectMap();
			case DataRepresentationPackage.OBJECT_ORIENTED_VIEW_REQUIRED_ENTRY: return createObjectOrientedViewRequiredEntry();
			case DataRepresentationPackage.UNSTRUCTURED_VIEW_REQUIRED_ENTRY: return createUnstructuredViewRequiredEntry();
			case DataRepresentationPackage.REQUIRED_REFERENCE_PROPERTY: return createRequiredReferenceProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass createObjectClass() {
		ObjectClassImpl objectClass = new ObjectClassImpl();
		return objectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassOperation createObjectClassOperation() {
		ObjectClassOperationImpl objectClassOperation = new ObjectClassOperationImpl();
		return objectClassOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectInstance createObjectInstance() {
		ObjectInstanceImpl objectInstance = new ObjectInstanceImpl();
		return objectInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassReferenceProperty createClassReferenceProperty() {
		ClassReferencePropertyImpl classReferenceProperty = new ClassReferencePropertyImpl();
		return classReferenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOrientedViewSimulationData createObjectOrientedViewSimulationData() {
		ObjectOrientedViewSimulationDataImpl objectOrientedViewSimulationData = new ObjectOrientedViewSimulationDataImpl();
		return objectOrientedViewSimulationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public requiredDataInterface createrequiredDataInterface() {
		requiredDataInterfaceImpl requiredDataInterface = new requiredDataInterfaceImpl();
		return requiredDataInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancedObjects createInstancedObjects() {
		InstancedObjectsImpl instancedObjects = new InstancedObjectsImpl();
		return instancedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassDefinitions createObjectClassDefinitions() {
		ObjectClassDefinitionsImpl objectClassDefinitions = new ObjectClassDefinitionsImpl();
		return objectClassDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassInheritance createObjectClassInheritance() {
		ObjectClassInheritanceImpl objectClassInheritance = new ObjectClassInheritanceImpl();
		return objectClassInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOverride createOperationOverride() {
		OperationOverrideImpl operationOverride = new OperationOverrideImpl();
		return operationOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Data, String> createDataToValueMap() {
		DataToValueMapImpl dataToValueMap = new DataToValueMapImpl();
		return dataToValueMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EnumType, EnumLiteral> createEnumToEnumassignmentMap() {
		EnumToEnumassignmentMapImpl enumToEnumassignmentMap = new EnumToEnumassignmentMapImpl();
		return enumToEnumassignmentMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<ClassReferenceProperty, ObjectInstance> createDataToObjectMap() {
		DataToObjectMapImpl dataToObjectMap = new DataToObjectMapImpl();
		return dataToObjectMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOrientedViewRequiredEntry createObjectOrientedViewRequiredEntry() {
		ObjectOrientedViewRequiredEntryImpl objectOrientedViewRequiredEntry = new ObjectOrientedViewRequiredEntryImpl();
		return objectOrientedViewRequiredEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredViewRequiredEntry createUnstructuredViewRequiredEntry() {
		UnstructuredViewRequiredEntryImpl unstructuredViewRequiredEntry = new UnstructuredViewRequiredEntryImpl();
		return unstructuredViewRequiredEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredReferenceProperty createRequiredReferenceProperty() {
		RequiredReferencePropertyImpl requiredReferenceProperty = new RequiredReferencePropertyImpl();
		return requiredReferenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentationPackage getDataRepresentationPackage() {
		return (DataRepresentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataRepresentationPackage getPackage() {
		return DataRepresentationPackage.eINSTANCE;
	}

} //DataRepresentationFactoryImpl
