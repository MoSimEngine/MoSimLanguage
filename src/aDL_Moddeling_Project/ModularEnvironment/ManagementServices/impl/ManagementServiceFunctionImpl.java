/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.impl.OperationImpl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceFunction;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Management Service Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceFunctionImpl#getPrintableDescription <em>Printable Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagementServiceFunctionImpl extends OperationImpl implements ManagementServiceFunction {
	/**
	 * The default value of the '{@link #getPrintableDescription() <em>Printable Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintableDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PRINTABLE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrintableDescription() <em>Printable Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintableDescription()
	 * @generated
	 * @ordered
	 */
	protected String printableDescription = PRINTABLE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagementServiceFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementServicesPackage.Literals.MANAGEMENT_SERVICE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrintableDescription() {
		return printableDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintableDescription(String newPrintableDescription) {
		String oldPrintableDescription = printableDescription;
		printableDescription = newPrintableDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagementServicesPackage.MANAGEMENT_SERVICE_FUNCTION__PRINTABLE_DESCRIPTION, oldPrintableDescription, printableDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManagementServicesPackage.MANAGEMENT_SERVICE_FUNCTION__PRINTABLE_DESCRIPTION:
				return getPrintableDescription();
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE_FUNCTION__PRINTABLE_DESCRIPTION:
				setPrintableDescription((String)newValue);
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE_FUNCTION__PRINTABLE_DESCRIPTION:
				setPrintableDescription(PRINTABLE_DESCRIPTION_EDEFAULT);
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE_FUNCTION__PRINTABLE_DESCRIPTION:
				return PRINTABLE_DESCRIPTION_EDEFAULT == null ? printableDescription != null : !PRINTABLE_DESCRIPTION_EDEFAULT.equals(printableDescription);
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
		result.append(" (printableDescription: ");
		result.append(printableDescription);
		result.append(')');
		return result.toString();
	}

} //ManagementServiceFunctionImpl
