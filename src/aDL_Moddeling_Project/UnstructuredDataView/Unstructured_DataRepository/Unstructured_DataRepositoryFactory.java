/**
 */
package aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.Unstructured_DataRepositoryPackage
 * @generated
 */
public interface Unstructured_DataRepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Unstructured_DataRepositoryFactory eINSTANCE = aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.Unstructured_DataRepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Unstructured View Simulation Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured View Simulation Data</em>'.
	 * @generated
	 */
	UnstructuredViewSimulationData createUnstructuredViewSimulationData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Unstructured_DataRepositoryPackage getUnstructured_DataRepositoryPackage();

} //Unstructured_DataRepositoryFactory
