/**
 */
package aDL_Moddeling_Project.DataRepresentation.OperationModel.impl;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.OperationModelPackage;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.executionEffectOnData;
import aDL_Moddeling_Project.DataRepresentation.OperationModel.operationExecutionEffect;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>operation Execution Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.operationExecutionEffectImpl#getExecutioneffectondata <em>Executioneffectondata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class operationExecutionEffectImpl extends MinimalEObjectImpl.Container implements operationExecutionEffect {
	/**
	 * The cached value of the '{@link #getExecutioneffectondata() <em>Executioneffectondata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutioneffectondata()
	 * @generated
	 * @ordered
	 */
	protected EList<executionEffectOnData> executioneffectondata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected operationExecutionEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationModelPackage.Literals.OPERATION_EXECUTION_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<executionEffectOnData> getExecutioneffectondata() {
		if (executioneffectondata == null) {
			executioneffectondata = new EObjectContainmentEList<executionEffectOnData>(executionEffectOnData.class, this, OperationModelPackage.OPERATION_EXECUTION_EFFECT__EXECUTIONEFFECTONDATA);
		}
		return executioneffectondata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationModelPackage.OPERATION_EXECUTION_EFFECT__EXECUTIONEFFECTONDATA:
				return ((InternalEList<?>)getExecutioneffectondata()).basicRemove(otherEnd, msgs);
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
			case OperationModelPackage.OPERATION_EXECUTION_EFFECT__EXECUTIONEFFECTONDATA:
				return getExecutioneffectondata();
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
			case OperationModelPackage.OPERATION_EXECUTION_EFFECT__EXECUTIONEFFECTONDATA:
				getExecutioneffectondata().clear();
				getExecutioneffectondata().addAll((Collection<? extends executionEffectOnData>)newValue);
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
			case OperationModelPackage.OPERATION_EXECUTION_EFFECT__EXECUTIONEFFECTONDATA:
				getExecutioneffectondata().clear();
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
			case OperationModelPackage.OPERATION_EXECUTION_EFFECT__EXECUTIONEFFECTONDATA:
				return executioneffectondata != null && !executioneffectondata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //operationExecutionEffectImpl
