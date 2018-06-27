/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAddition;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.WritableAdditionSetter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Writable Addition Setter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.WritableAdditionSetterImpl#getWritableaddition <em>Writableaddition</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.WritableAdditionSetterImpl#getValueContent <em>Value Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WritableAdditionSetterImpl extends AdditionSetterImpl implements WritableAdditionSetter {
	/**
	 * The cached value of the '{@link #getWritableaddition() <em>Writableaddition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritableaddition()
	 * @generated
	 * @ordered
	 */
	protected WritableAddition writableaddition;

	/**
	 * The default value of the '{@link #getValueContent() <em>Value Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueContent()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueContent() <em>Value Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueContent()
	 * @generated
	 * @ordered
	 */
	protected String valueContent = VALUE_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WritableAdditionSetterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementServicesPackage.Literals.WRITABLE_ADDITION_SETTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritableAddition getWritableaddition() {
		if (writableaddition != null && writableaddition.eIsProxy()) {
			InternalEObject oldWritableaddition = (InternalEObject)writableaddition;
			writableaddition = (WritableAddition)eResolveProxy(oldWritableaddition);
			if (writableaddition != oldWritableaddition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManagementServicesPackage.WRITABLE_ADDITION_SETTER__WRITABLEADDITION, oldWritableaddition, writableaddition));
			}
		}
		return writableaddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritableAddition basicGetWritableaddition() {
		return writableaddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritableaddition(WritableAddition newWritableaddition) {
		WritableAddition oldWritableaddition = writableaddition;
		writableaddition = newWritableaddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagementServicesPackage.WRITABLE_ADDITION_SETTER__WRITABLEADDITION, oldWritableaddition, writableaddition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueContent() {
		return valueContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueContent(String newValueContent) {
		String oldValueContent = valueContent;
		valueContent = newValueContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagementServicesPackage.WRITABLE_ADDITION_SETTER__VALUE_CONTENT, oldValueContent, valueContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManagementServicesPackage.WRITABLE_ADDITION_SETTER__WRITABLEADDITION:
				if (resolve) return getWritableaddition();
				return basicGetWritableaddition();
			case ManagementServicesPackage.WRITABLE_ADDITION_SETTER__VALUE_CONTENT:
				return getValueContent();
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
			case ManagementServicesPackage.WRITABLE_ADDITION_SETTER__WRITABLEADDITION:
				setWritableaddition((WritableAddition)newValue);
				return;
			case ManagementServicesPackage.WRITABLE_ADDITION_SETTER__VALUE_CONTENT:
				setValueContent((String)newValue);
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
			case ManagementServicesPackage.WRITABLE_ADDITION_SETTER__WRITABLEADDITION:
				setWritableaddition((WritableAddition)null);
				return;
			case ManagementServicesPackage.WRITABLE_ADDITION_SETTER__VALUE_CONTENT:
				setValueContent(VALUE_CONTENT_EDEFAULT);
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
			case ManagementServicesPackage.WRITABLE_ADDITION_SETTER__WRITABLEADDITION:
				return writableaddition != null;
			case ManagementServicesPackage.WRITABLE_ADDITION_SETTER__VALUE_CONTENT:
				return VALUE_CONTENT_EDEFAULT == null ? valueContent != null : !VALUE_CONTENT_EDEFAULT.equals(valueContent);
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
		result.append(" (valueContent: ");
		result.append(valueContent);
		result.append(')');
		return result.toString();
	}

} //WritableAdditionSetterImpl
