/**
 */
package aDL_Moddeling_Project.DataRepresentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage
 * @generated
 */
public interface DataRepresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataRepresentationFactory eINSTANCE = aDL_Moddeling_Project.DataRepresentation.impl.DataRepresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Object Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Class</em>'.
	 * @generated
	 */
	ObjectClass createObjectClass();

	/**
	 * Returns a new object of class '<em>Object Class Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Class Operation</em>'.
	 * @generated
	 */
	ObjectClassOperation createObjectClassOperation();

	/**
	 * Returns a new object of class '<em>Object Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Instance</em>'.
	 * @generated
	 */
	ObjectInstance createObjectInstance();

	/**
	 * Returns a new object of class '<em>Class Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Reference Property</em>'.
	 * @generated
	 */
	ClassReferenceProperty createClassReferenceProperty();

	/**
	 * Returns a new object of class '<em>Object Oriented View Simulation Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Oriented View Simulation Data</em>'.
	 * @generated
	 */
	ObjectOrientedViewSimulationData createObjectOrientedViewSimulationData();

	/**
	 * Returns a new object of class '<em>required Data Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>required Data Interface</em>'.
	 * @generated
	 */
	requiredDataInterface createrequiredDataInterface();

	/**
	 * Returns a new object of class '<em>Instanced Objects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instanced Objects</em>'.
	 * @generated
	 */
	InstancedObjects createInstancedObjects();

	/**
	 * Returns a new object of class '<em>Object Class Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Class Definitions</em>'.
	 * @generated
	 */
	ObjectClassDefinitions createObjectClassDefinitions();

	/**
	 * Returns a new object of class '<em>Object Class Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Class Inheritance</em>'.
	 * @generated
	 */
	ObjectClassInheritance createObjectClassInheritance();

	/**
	 * Returns a new object of class '<em>Operation Override</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Override</em>'.
	 * @generated
	 */
	OperationOverride createOperationOverride();

	/**
	 * Returns a new object of class '<em>Object Oriented View Required Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Oriented View Required Entry</em>'.
	 * @generated
	 */
	ObjectOrientedViewRequiredEntry createObjectOrientedViewRequiredEntry();

	/**
	 * Returns a new object of class '<em>Unstructured View Required Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured View Required Entry</em>'.
	 * @generated
	 */
	UnstructuredViewRequiredEntry createUnstructuredViewRequiredEntry();

	/**
	 * Returns a new object of class '<em>Required Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Reference Property</em>'.
	 * @generated
	 */
	RequiredReferenceProperty createRequiredReferenceProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataRepresentationPackage getDataRepresentationPackage();

} //DataRepresentationFactory
