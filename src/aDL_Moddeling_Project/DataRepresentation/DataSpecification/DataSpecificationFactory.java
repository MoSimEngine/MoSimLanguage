/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataSpecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.DataRepresentation.DataSpecification.DataSpecificationPackage
 * @generated
 */
public interface DataSpecificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataSpecificationFactory eINSTANCE = aDL_Moddeling_Project.DataRepresentation.DataSpecification.impl.DataSpecificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Semantic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Type</em>'.
	 * @generated
	 */
	SemanticType createSemanticType();

	/**
	 * Returns a new object of class '<em>Collection Typed Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Typed Data</em>'.
	 * @generated
	 */
	CollectionTypedData createCollectionTypedData();

	/**
	 * Returns a new object of class '<em>Enum Typed Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Typed Data</em>'.
	 * @generated
	 */
	EnumTypedData createEnumTypedData();

	/**
	 * Returns a new object of class '<em>Basic Typed Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Typed Data</em>'.
	 * @generated
	 */
	BasicTypedData createBasicTypedData();

	/**
	 * Returns a new object of class '<em>Unit Typed Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Typed Data</em>'.
	 * @generated
	 */
	UnitTypedData createUnitTypedData();

	/**
	 * Returns a new object of class '<em>Combined Typed Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Typed Data</em>'.
	 * @generated
	 */
	CombinedTypedData createCombinedTypedData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataSpecificationPackage getDataSpecificationPackage();

} //DataSpecificationFactory
