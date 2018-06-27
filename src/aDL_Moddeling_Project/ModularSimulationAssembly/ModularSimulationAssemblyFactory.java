/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage
 * @generated
 */
public interface ModularSimulationAssemblyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModularSimulationAssemblyFactory eINSTANCE = aDL_Moddeling_Project.ModularSimulationAssembly.impl.ModularSimulationAssemblyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simulation Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation Assembly</em>'.
	 * @generated
	 */
	SimulationAssembly createSimulationAssembly();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>general Simulation Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>general Simulation Function</em>'.
	 * @generated
	 */
	generalSimulationFunction creategeneralSimulationFunction();

	/**
	 * Returns a new object of class '<em>Simulation Assembly Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation Assembly Entity</em>'.
	 * @generated
	 */
	SimulationAssemblyEntity createSimulationAssemblyEntity();

	/**
	 * Returns a new object of class '<em>Combined Assembly Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Assembly Entity</em>'.
	 * @generated
	 */
	CombinedAssemblyEntity createCombinedAssemblyEntity();

	/**
	 * Returns a new object of class '<em>Adapter Description Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adapter Description Attachment</em>'.
	 * @generated
	 */
	AdapterDescriptionAttachment createAdapterDescriptionAttachment();

	/**
	 * Returns a new object of class '<em>Coordinator Assembly Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinator Assembly Entity</em>'.
	 * @generated
	 */
	CoordinatorAssemblyEntity createCoordinatorAssemblyEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModularSimulationAssemblyPackage getModularSimulationAssemblyPackage();

} //ModularSimulationAssemblyFactory
