/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;
import aDL_Moddeling_Project.DataRepresentation.RequiredDataEntry;
import aDL_Moddeling_Project.DataRepresentation.requiredDataInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>required Data Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.requiredDataInterfaceImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.requiredDataInterfaceImpl#getRequireddataentry <em>Requireddataentry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class requiredDataInterfaceImpl extends MinimalEObjectImpl.Container implements requiredDataInterface {
	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequireddataentry() <em>Requireddataentry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireddataentry()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredDataEntry> requireddataentry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected requiredDataInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.REQUIRED_DATA_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.REQUIRED_DATA_INTERFACE__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredDataEntry> getRequireddataentry() {
		if (requireddataentry == null) {
			requireddataentry = new EObjectContainmentEList<RequiredDataEntry>(RequiredDataEntry.class, this, DataRepresentationPackage.REQUIRED_DATA_INTERFACE__REQUIREDDATAENTRY);
		}
		return requireddataentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.REQUIRED_DATA_INTERFACE__REQUIREDDATAENTRY:
				return ((InternalEList<?>)getRequireddataentry()).basicRemove(otherEnd, msgs);
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
			case DataRepresentationPackage.REQUIRED_DATA_INTERFACE__PURPOSE:
				return getPurpose();
			case DataRepresentationPackage.REQUIRED_DATA_INTERFACE__REQUIREDDATAENTRY:
				return getRequireddataentry();
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
			case DataRepresentationPackage.REQUIRED_DATA_INTERFACE__PURPOSE:
				setPurpose((String)newValue);
				return;
			case DataRepresentationPackage.REQUIRED_DATA_INTERFACE__REQUIREDDATAENTRY:
				getRequireddataentry().clear();
				getRequireddataentry().addAll((Collection<? extends RequiredDataEntry>)newValue);
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
			case DataRepresentationPackage.REQUIRED_DATA_INTERFACE__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case DataRepresentationPackage.REQUIRED_DATA_INTERFACE__REQUIREDDATAENTRY:
				getRequireddataentry().clear();
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
			case DataRepresentationPackage.REQUIRED_DATA_INTERFACE__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case DataRepresentationPackage.REQUIRED_DATA_INTERFACE__REQUIREDDATAENTRY:
				return requireddataentry != null && !requireddataentry.isEmpty();
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
		result.append(" (purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //requiredDataInterfaceImpl
