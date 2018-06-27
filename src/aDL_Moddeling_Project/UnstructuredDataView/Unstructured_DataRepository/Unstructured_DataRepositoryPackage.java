/**
 */
package aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.Unstructured_DataRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface Unstructured_DataRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Unstructured_DataRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.UnstructuredDataView.Unstructured_DataRepositrory";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Unstructured_DataRepositrory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Unstructured_DataRepositoryPackage eINSTANCE = aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.Unstructured_DataRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.UnstructuredViewSimulationDataImpl <em>Unstructured View Simulation Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.UnstructuredViewSimulationDataImpl
	 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.Unstructured_DataRepositoryPackageImpl#getUnstructuredViewSimulationData()
	 * @generated
	 */
	int UNSTRUCTURED_VIEW_SIMULATION_DATA = 0;

	/**
	 * The feature id for the '<em><b>Requireddata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_SIMULATION_DATA__REQUIREDDATA = DataRepresentationPackage.SIMULATION_DATA__REQUIREDDATA;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_SIMULATION_DATA__OPERATION = DataRepresentationPackage.SIMULATION_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_SIMULATION_DATA__DATA = DataRepresentationPackage.SIMULATION_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unstructured View Simulation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_SIMULATION_DATA_FEATURE_COUNT = DataRepresentationPackage.SIMULATION_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unstructured View Simulation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_VIEW_SIMULATION_DATA_OPERATION_COUNT = DataRepresentationPackage.SIMULATION_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.UnstructuredViewSimulationData <em>Unstructured View Simulation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured View Simulation Data</em>'.
	 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.UnstructuredViewSimulationData
	 * @generated
	 */
	EClass getUnstructuredViewSimulationData();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.UnstructuredViewSimulationData#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.UnstructuredViewSimulationData#getOperation()
	 * @see #getUnstructuredViewSimulationData()
	 * @generated
	 */
	EReference getUnstructuredViewSimulationData_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.UnstructuredViewSimulationData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.UnstructuredViewSimulationData#getData()
	 * @see #getUnstructuredViewSimulationData()
	 * @generated
	 */
	EReference getUnstructuredViewSimulationData_Data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Unstructured_DataRepositoryFactory getUnstructured_DataRepositoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.UnstructuredViewSimulationDataImpl <em>Unstructured View Simulation Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.UnstructuredViewSimulationDataImpl
		 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.Unstructured_DataRepositoryPackageImpl#getUnstructuredViewSimulationData()
		 * @generated
		 */
		EClass UNSTRUCTURED_VIEW_SIMULATION_DATA = eINSTANCE.getUnstructuredViewSimulationData();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRUCTURED_VIEW_SIMULATION_DATA__OPERATION = eINSTANCE.getUnstructuredViewSimulationData_Operation();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRUCTURED_VIEW_SIMULATION_DATA__DATA = eINSTANCE.getUnstructuredViewSimulationData_Data();

	}

} //Unstructured_DataRepositoryPackage
