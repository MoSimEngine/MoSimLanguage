/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage
 * @generated
 */
public interface AssemblyInterfaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyInterfaceFactory eINSTANCE = aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interface Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Repository</em>'.
	 * @generated
	 */
	InterfaceRepository createInterfaceRepository();

	/**
	 * Returns a new object of class '<em>Assembly Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Interface</em>'.
	 * @generated
	 */
	AssemblyInterface createAssemblyInterface();

	/**
	 * Returns a new object of class '<em>Abstract Interface Object Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Interface Object Class</em>'.
	 * @generated
	 */
	AbstractInterfaceObjectClass createAbstractInterfaceObjectClass();

	/**
	 * Returns a new object of class '<em>Abstract Interface Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Interface Data</em>'.
	 * @generated
	 */
	AbstractInterfaceData createAbstractInterfaceData();

	/**
	 * Returns a new object of class '<em>Abstract Interface Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Interface Operation</em>'.
	 * @generated
	 */
	AbstractInterfaceOperation createAbstractInterfaceOperation();

	/**
	 * Returns a new object of class '<em>Abstract Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Parameter</em>'.
	 * @generated
	 */
	AbstractParameter createAbstractParameter();

	/**
	 * Returns a new object of class '<em>Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Mapping</em>'.
	 * @generated
	 */
	InterfaceMapping createInterfaceMapping();

	/**
	 * Returns a new object of class '<em>Required Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Interface Mapping</em>'.
	 * @generated
	 */
	RequiredInterfaceMapping createRequiredInterfaceMapping();

	/**
	 * Returns a new object of class '<em>Privded Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Privded Interface Mapping</em>'.
	 * @generated
	 */
	PrivdedInterfaceMapping createPrivdedInterfaceMapping();

	/**
	 * Returns a new object of class '<em>Providing Interface Object Class Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Providing Interface Object Class Mapping</em>'.
	 * @generated
	 */
	ProvidingInterfaceObjectClassMapping createProvidingInterfaceObjectClassMapping();

	/**
	 * Returns a new object of class '<em>Requiering Interface Object Class Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requiering Interface Object Class Mapping</em>'.
	 * @generated
	 */
	RequieringInterfaceObjectClassMapping createRequieringInterfaceObjectClassMapping();

	/**
	 * Returns a new object of class '<em>Enhanced To Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enhanced To Interface Mapping</em>'.
	 * @generated
	 */
	EnhancedToInterfaceMapping createEnhancedToInterfaceMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssemblyInterfacePackage getAssemblyInterfacePackage();

} //AssemblyInterfaceFactory
