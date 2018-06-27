/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.UnitTypeContainer;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Specification Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataSpecificationContainerImpl#getUnittypecontainer <em>Unittypecontainer</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataSpecificationContainerImpl#getDataspecification <em>Dataspecification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSpecificationContainerImpl extends EntityImpl implements DataSpecificationContainer {
	/**
	 * The cached value of the '{@link #getUnittypecontainer() <em>Unittypecontainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnittypecontainer()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitTypeContainer> unittypecontainer;

	/**
	 * The cached value of the '{@link #getDataspecification() <em>Dataspecification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataspecification()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTypeSpecification> dataspecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSpecificationContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DATA_SPECIFICATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitTypeContainer> getUnittypecontainer() {
		if (unittypecontainer == null) {
			unittypecontainer = new EObjectContainmentEList<UnitTypeContainer>(UnitTypeContainer.class, this, DataTypesPackage.DATA_SPECIFICATION_CONTAINER__UNITTYPECONTAINER);
		}
		return unittypecontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTypeSpecification> getDataspecification() {
		if (dataspecification == null) {
			dataspecification = new EObjectContainmentEList<DataTypeSpecification>(DataTypeSpecification.class, this, DataTypesPackage.DATA_SPECIFICATION_CONTAINER__DATASPECIFICATION);
		}
		return dataspecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER__UNITTYPECONTAINER:
				return ((InternalEList<?>)getUnittypecontainer()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER__DATASPECIFICATION:
				return ((InternalEList<?>)getDataspecification()).basicRemove(otherEnd, msgs);
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
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER__UNITTYPECONTAINER:
				return getUnittypecontainer();
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER__DATASPECIFICATION:
				return getDataspecification();
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
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER__UNITTYPECONTAINER:
				getUnittypecontainer().clear();
				getUnittypecontainer().addAll((Collection<? extends UnitTypeContainer>)newValue);
				return;
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER__DATASPECIFICATION:
				getDataspecification().clear();
				getDataspecification().addAll((Collection<? extends DataTypeSpecification>)newValue);
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
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER__UNITTYPECONTAINER:
				getUnittypecontainer().clear();
				return;
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER__DATASPECIFICATION:
				getDataspecification().clear();
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
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER__UNITTYPECONTAINER:
				return unittypecontainer != null && !unittypecontainer.isEmpty();
			case DataTypesPackage.DATA_SPECIFICATION_CONTAINER__DATASPECIFICATION:
				return dataspecification != null && !dataspecification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataSpecificationContainerImpl
