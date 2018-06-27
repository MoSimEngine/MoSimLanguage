/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.UnitTypeContainer;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Type Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitTypeContainerImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitTypeContainerImpl extends EntityImpl implements UnitTypeContainer {
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> unit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitTypeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.UNIT_TYPE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnit() {
		if (unit == null) {
			unit = new EObjectContainmentWithInverseEList<Unit>(Unit.class, this, DataTypesPackage.UNIT_TYPE_CONTAINER__UNIT, DataTypesPackage.UNIT__UNITTYPECONTAINER);
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.UNIT_TYPE_CONTAINER__UNIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnit()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.UNIT_TYPE_CONTAINER__UNIT:
				return ((InternalEList<?>)getUnit()).basicRemove(otherEnd, msgs);
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
			case DataTypesPackage.UNIT_TYPE_CONTAINER__UNIT:
				return getUnit();
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
			case DataTypesPackage.UNIT_TYPE_CONTAINER__UNIT:
				getUnit().clear();
				getUnit().addAll((Collection<? extends Unit>)newValue);
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
			case DataTypesPackage.UNIT_TYPE_CONTAINER__UNIT:
				getUnit().clear();
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
			case DataTypesPackage.UNIT_TYPE_CONTAINER__UNIT:
				return unit != null && !unit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnitTypeContainerImpl
