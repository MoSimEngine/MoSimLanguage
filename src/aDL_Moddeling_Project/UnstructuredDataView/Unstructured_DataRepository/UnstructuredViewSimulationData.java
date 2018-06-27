/**
 */
package aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

import aDL_Moddeling_Project.DataRepresentation.SimulationData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured View Simulation Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.UnstructuredViewSimulationData#getOperation <em>Operation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.UnstructuredViewSimulationData#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.Unstructured_DataRepositoryPackage#getUnstructuredViewSimulationData()
 * @model
 * @generated
 */
public interface UnstructuredViewSimulationData extends SimulationData {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.Unstructured_DataRepositoryPackage#getUnstructuredViewSimulationData_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.Unstructured_DataRepositoryPackage#getUnstructuredViewSimulationData_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // UnstructuredViewSimulationData
