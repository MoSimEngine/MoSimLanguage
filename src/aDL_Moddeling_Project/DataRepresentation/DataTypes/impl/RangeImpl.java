/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.Range;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.RangeImpl#getLowerBounds <em>Lower Bounds</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.RangeImpl#getUpperBounds <em>Upper Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeImpl extends MinimalEObjectImpl.Container implements Range {
	/**
	 * The default value of the '{@link #getLowerBounds() <em>Lower Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBounds()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_BOUNDS_EDEFAULT = "inf";

	/**
	 * The cached value of the '{@link #getLowerBounds() <em>Lower Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBounds()
	 * @generated
	 * @ordered
	 */
	protected String lowerBounds = LOWER_BOUNDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBounds() <em>Upper Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBounds()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_BOUNDS_EDEFAULT = "inf";

	/**
	 * The cached value of the '{@link #getUpperBounds() <em>Upper Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBounds()
	 * @generated
	 * @ordered
	 */
	protected String upperBounds = UPPER_BOUNDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerBounds() {
		return lowerBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBounds(String newLowerBounds) {
		String oldLowerBounds = lowerBounds;
		lowerBounds = newLowerBounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.RANGE__LOWER_BOUNDS, oldLowerBounds, lowerBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperBounds() {
		return upperBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBounds(String newUpperBounds) {
		String oldUpperBounds = upperBounds;
		upperBounds = newUpperBounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.RANGE__UPPER_BOUNDS, oldUpperBounds, upperBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.RANGE__LOWER_BOUNDS:
				return getLowerBounds();
			case DataTypesPackage.RANGE__UPPER_BOUNDS:
				return getUpperBounds();
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
			case DataTypesPackage.RANGE__LOWER_BOUNDS:
				setLowerBounds((String)newValue);
				return;
			case DataTypesPackage.RANGE__UPPER_BOUNDS:
				setUpperBounds((String)newValue);
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
			case DataTypesPackage.RANGE__LOWER_BOUNDS:
				setLowerBounds(LOWER_BOUNDS_EDEFAULT);
				return;
			case DataTypesPackage.RANGE__UPPER_BOUNDS:
				setUpperBounds(UPPER_BOUNDS_EDEFAULT);
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
			case DataTypesPackage.RANGE__LOWER_BOUNDS:
				return LOWER_BOUNDS_EDEFAULT == null ? lowerBounds != null : !LOWER_BOUNDS_EDEFAULT.equals(lowerBounds);
			case DataTypesPackage.RANGE__UPPER_BOUNDS:
				return UPPER_BOUNDS_EDEFAULT == null ? upperBounds != null : !UPPER_BOUNDS_EDEFAULT.equals(upperBounds);
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
		result.append(" (lowerBounds: ");
		result.append(lowerBounds);
		result.append(", upperBounds: ");
		result.append(upperBounds);
		result.append(')');
		return result.toString();
	}

} //RangeImpl
