/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.DataTypeSpecificationImpl#getDataSemantics <em>Data Semantics</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataTypeSpecificationImpl extends EntityImpl implements DataTypeSpecification {
	/**
	 * The default value of the '{@link #getDataSemantics() <em>Data Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SEMANTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSemantics() <em>Data Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSemantics()
	 * @generated
	 * @ordered
	 */
	protected String dataSemantics = DATA_SEMANTICS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DATA_TYPE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSemantics() {
		return dataSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSemantics(String newDataSemantics) {
		String oldDataSemantics = dataSemantics;
		dataSemantics = newDataSemantics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_TYPE_SPECIFICATION__DATA_SEMANTICS, oldDataSemantics, dataSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.DATA_TYPE_SPECIFICATION__DATA_SEMANTICS:
				return getDataSemantics();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataTypesPackage.DATA_TYPE_SPECIFICATION__DATA_SEMANTICS:
				setDataSemantics((String)newValue);
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
			case DataTypesPackage.DATA_TYPE_SPECIFICATION__DATA_SEMANTICS:
				setDataSemantics(DATA_SEMANTICS_EDEFAULT);
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
			case DataTypesPackage.DATA_TYPE_SPECIFICATION__DATA_SEMANTICS:
				return DATA_SEMANTICS_EDEFAULT == null ? dataSemantics != null : !DATA_SEMANTICS_EDEFAULT.equals(dataSemantics);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (DataSemantics: ");
		result.append(dataSemantics);
		result.append(')');
		return result.toString();
	}

} //DataTypeSpecificationImpl
