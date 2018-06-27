/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.MathematicalConversion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mathematical Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.MathematicalConversionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.MathematicalConversionImpl#isInvertible <em>Invertible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MathematicalConversionImpl extends AdapatationConversionImpl implements MathematicalConversion {
	/**
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected String term = TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #isInvertible() <em>Invertible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvertible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERTIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInvertible() <em>Invertible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvertible()
	 * @generated
	 * @ordered
	 */
	protected boolean invertible = INVERTIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MathematicalConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.MATHEMATICAL_CONVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(String newTerm) {
		String oldTerm = term;
		term = newTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.MATHEMATICAL_CONVERSION__TERM, oldTerm, term));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvertible() {
		return invertible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvertible(boolean newInvertible) {
		boolean oldInvertible = invertible;
		invertible = newInvertible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.MATHEMATICAL_CONVERSION__INVERTIBLE, oldInvertible, invertible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdapterServicesPackage.MATHEMATICAL_CONVERSION__TERM:
				return getTerm();
			case AdapterServicesPackage.MATHEMATICAL_CONVERSION__INVERTIBLE:
				return isInvertible();
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
			case AdapterServicesPackage.MATHEMATICAL_CONVERSION__TERM:
				setTerm((String)newValue);
				return;
			case AdapterServicesPackage.MATHEMATICAL_CONVERSION__INVERTIBLE:
				setInvertible((Boolean)newValue);
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
			case AdapterServicesPackage.MATHEMATICAL_CONVERSION__TERM:
				setTerm(TERM_EDEFAULT);
				return;
			case AdapterServicesPackage.MATHEMATICAL_CONVERSION__INVERTIBLE:
				setInvertible(INVERTIBLE_EDEFAULT);
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
			case AdapterServicesPackage.MATHEMATICAL_CONVERSION__TERM:
				return TERM_EDEFAULT == null ? term != null : !TERM_EDEFAULT.equals(term);
			case AdapterServicesPackage.MATHEMATICAL_CONVERSION__INVERTIBLE:
				return invertible != INVERTIBLE_EDEFAULT;
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
		result.append(" (term: ");
		result.append(term);
		result.append(", invertible: ");
		result.append(invertible);
		result.append(')');
		return result.toString();
	}

} //MathematicalConversionImpl
