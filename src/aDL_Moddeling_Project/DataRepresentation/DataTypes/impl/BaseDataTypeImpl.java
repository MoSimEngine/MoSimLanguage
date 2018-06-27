/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.PrimitiveDataType;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.Range;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.BaseDataTypeImpl#getStepSize <em>Step Size</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.BaseDataTypeImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.BaseDataTypeImpl#getPrimitiveDataType <em>Primitive Data Type</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.BaseDataTypeImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseDataTypeImpl extends DataTypeImpl implements BaseDataType {
	/**
	 * The default value of the '{@link #getStepSize() <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepSize() <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected String stepSize = STEP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected String initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimitiveDataType() <em>Primitive Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveDataType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveDataType PRIMITIVE_DATA_TYPE_EDEFAULT = PrimitiveDataType.BOOL;

	/**
	 * The cached value of the '{@link #getPrimitiveDataType() <em>Primitive Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveDataType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveDataType primitiveDataType = PRIMITIVE_DATA_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.BASE_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStepSize() {
		return stepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepSize(String newStepSize) {
		String oldStepSize = stepSize;
		stepSize = newStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.BASE_DATA_TYPE__STEP_SIZE, oldStepSize, stepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(String newInitialValue) {
		String oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.BASE_DATA_TYPE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType getPrimitiveDataType() {
		return primitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveDataType(PrimitiveDataType newPrimitiveDataType) {
		PrimitiveDataType oldPrimitiveDataType = primitiveDataType;
		primitiveDataType = newPrimitiveDataType == null ? PRIMITIVE_DATA_TYPE_EDEFAULT : newPrimitiveDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.BASE_DATA_TYPE__PRIMITIVE_DATA_TYPE, oldPrimitiveDataType, primitiveDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.BASE_DATA_TYPE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.BASE_DATA_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.BASE_DATA_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.BASE_DATA_TYPE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.BASE_DATA_TYPE__RANGE:
				return basicSetRange(null, msgs);
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
			case DataTypesPackage.BASE_DATA_TYPE__STEP_SIZE:
				return getStepSize();
			case DataTypesPackage.BASE_DATA_TYPE__INITIAL_VALUE:
				return getInitialValue();
			case DataTypesPackage.BASE_DATA_TYPE__PRIMITIVE_DATA_TYPE:
				return getPrimitiveDataType();
			case DataTypesPackage.BASE_DATA_TYPE__RANGE:
				return getRange();
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
			case DataTypesPackage.BASE_DATA_TYPE__STEP_SIZE:
				setStepSize((String)newValue);
				return;
			case DataTypesPackage.BASE_DATA_TYPE__INITIAL_VALUE:
				setInitialValue((String)newValue);
				return;
			case DataTypesPackage.BASE_DATA_TYPE__PRIMITIVE_DATA_TYPE:
				setPrimitiveDataType((PrimitiveDataType)newValue);
				return;
			case DataTypesPackage.BASE_DATA_TYPE__RANGE:
				setRange((Range)newValue);
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
			case DataTypesPackage.BASE_DATA_TYPE__STEP_SIZE:
				setStepSize(STEP_SIZE_EDEFAULT);
				return;
			case DataTypesPackage.BASE_DATA_TYPE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case DataTypesPackage.BASE_DATA_TYPE__PRIMITIVE_DATA_TYPE:
				setPrimitiveDataType(PRIMITIVE_DATA_TYPE_EDEFAULT);
				return;
			case DataTypesPackage.BASE_DATA_TYPE__RANGE:
				setRange((Range)null);
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
			case DataTypesPackage.BASE_DATA_TYPE__STEP_SIZE:
				return STEP_SIZE_EDEFAULT == null ? stepSize != null : !STEP_SIZE_EDEFAULT.equals(stepSize);
			case DataTypesPackage.BASE_DATA_TYPE__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
			case DataTypesPackage.BASE_DATA_TYPE__PRIMITIVE_DATA_TYPE:
				return primitiveDataType != PRIMITIVE_DATA_TYPE_EDEFAULT;
			case DataTypesPackage.BASE_DATA_TYPE__RANGE:
				return range != null;
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
		result.append(" (stepSize: ");
		result.append(stepSize);
		result.append(", initialValue: ");
		result.append(initialValue);
		result.append(", primitiveDataType: ");
		result.append(primitiveDataType);
		result.append(')');
		return result.toString();
	}

} //BaseDataTypeImpl
