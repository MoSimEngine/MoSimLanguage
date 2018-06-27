/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage
 * @generated
 */
public interface AssemblyConnectionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyConnectionsFactory eINSTANCE = aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.impl.AssemblyConnectionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composed Assembly Coodinator Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed Assembly Coodinator Connection</em>'.
	 * @generated
	 */
	ComposedAssembly_CoodinatorConnection createComposedAssembly_CoodinatorConnection();

	/**
	 * Returns a new object of class '<em>Simulation Assembly Entity Coordinator Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation Assembly Entity Coordinator Connection</em>'.
	 * @generated
	 */
	SimulationAssemblyEntity_CoordinatorConnection createSimulationAssemblyEntity_CoordinatorConnection();

	/**
	 * Returns a new object of class '<em>MW Coordinator Coordinator Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MW Coordinator Coordinator Connection</em>'.
	 * @generated
	 */
	MWCoordinator_CoordinatorConnection createMWCoordinator_CoordinatorConnection();

	/**
	 * Returns a new object of class '<em>Coordinator Function Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinator Function Mapping</em>'.
	 * @generated
	 */
	CoordinatorFunctionMapping createCoordinatorFunctionMapping();

	/**
	 * Returns a new object of class '<em>Object Oriented View Required Data Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Oriented View Required Data Mapping</em>'.
	 * @generated
	 */
	ObjectOrientedViewRequiredDataMapping createObjectOrientedViewRequiredDataMapping();

	/**
	 * Returns a new object of class '<em>Unstructured View Required Data Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured View Required Data Mapping</em>'.
	 * @generated
	 */
	UnstructuredViewRequiredDataMapping createUnstructuredViewRequiredDataMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssemblyConnectionsPackage getAssemblyConnectionsPackage();

} //AssemblyConnectionsFactory
