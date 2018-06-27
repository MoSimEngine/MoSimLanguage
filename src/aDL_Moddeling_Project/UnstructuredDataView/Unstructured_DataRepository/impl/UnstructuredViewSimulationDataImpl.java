/**
 */
package aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

import aDL_Moddeling_Project.DataRepresentation.impl.SimulationDataImpl;

import aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.UnstructuredViewSimulationData;
import aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.Unstructured_DataRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstructured View Simulation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.UnstructuredViewSimulationDataImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl.UnstructuredViewSimulationDataImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnstructuredViewSimulationDataImpl extends SimulationDataImpl implements UnstructuredViewSimulationData {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredViewSimulationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Unstructured_DataRepositoryPackage.Literals.UNSTRUCTURED_VIEW_SIMULATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this, Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__OPERATION:
				return getOperation();
			case Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__DATA:
				return getData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__OPERATION:
				getOperation().clear();
				return;
			case Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__DATA:
				getData().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__OPERATION:
				return operation != null && !operation.isEmpty();
			case Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA__DATA:
				return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnstructuredViewSimulationDataImpl
