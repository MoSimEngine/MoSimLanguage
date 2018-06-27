/**
 */
package aDL_Moddeling_Project.ModularSimulation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage
 * @generated
 */
public interface ModularSimulationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModularSimulationFactory eINSTANCE = aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sim Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sim Module</em>'.
	 * @generated
	 */
	SimModule createSimModule();

	/**
	 * Returns a new object of class '<em>Sim Module Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sim Module Description</em>'.
	 * @generated
	 */
	SimModuleDescription createSimModuleDescription();

	/**
	 * Returns a new object of class '<em>Simulation Time Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation Time Information</em>'.
	 * @generated
	 */
	SimulationTimeInformation createSimulationTimeInformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModularSimulationPackage getModularSimulationPackage();

} //ModularSimulationFactory
