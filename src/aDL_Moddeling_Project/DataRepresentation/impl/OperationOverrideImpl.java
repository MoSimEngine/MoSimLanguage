/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;
import aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation;
import aDL_Moddeling_Project.DataRepresentation.OperationOverride;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Override</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.OperationOverrideImpl#getParentClassOperation <em>Parent Class Operation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.OperationOverrideImpl#getOverridingOperation <em>Overriding Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationOverrideImpl extends MinimalEObjectImpl.Container implements OperationOverride {
	/**
	 * The cached value of the '{@link #getParentClassOperation() <em>Parent Class Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClassOperation()
	 * @generated
	 * @ordered
	 */
	protected ObjectClassOperation parentClassOperation;

	/**
	 * The cached value of the '{@link #getOverridingOperation() <em>Overriding Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverridingOperation()
	 * @generated
	 * @ordered
	 */
	protected ObjectClassOperation overridingOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationOverrideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.OPERATION_OVERRIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassOperation getParentClassOperation() {
		if (parentClassOperation != null && parentClassOperation.eIsProxy()) {
			InternalEObject oldParentClassOperation = (InternalEObject)parentClassOperation;
			parentClassOperation = (ObjectClassOperation)eResolveProxy(oldParentClassOperation);
			if (parentClassOperation != oldParentClassOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataRepresentationPackage.OPERATION_OVERRIDE__PARENT_CLASS_OPERATION, oldParentClassOperation, parentClassOperation));
			}
		}
		return parentClassOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassOperation basicGetParentClassOperation() {
		return parentClassOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentClassOperation(ObjectClassOperation newParentClassOperation) {
		ObjectClassOperation oldParentClassOperation = parentClassOperation;
		parentClassOperation = newParentClassOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OPERATION_OVERRIDE__PARENT_CLASS_OPERATION, oldParentClassOperation, parentClassOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassOperation getOverridingOperation() {
		return overridingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverridingOperation(ObjectClassOperation newOverridingOperation, NotificationChain msgs) {
		ObjectClassOperation oldOverridingOperation = overridingOperation;
		overridingOperation = newOverridingOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OPERATION_OVERRIDE__OVERRIDING_OPERATION, oldOverridingOperation, newOverridingOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverridingOperation(ObjectClassOperation newOverridingOperation) {
		if (newOverridingOperation != overridingOperation) {
			NotificationChain msgs = null;
			if (overridingOperation != null)
				msgs = ((InternalEObject)overridingOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OPERATION_OVERRIDE__OVERRIDING_OPERATION, null, msgs);
			if (newOverridingOperation != null)
				msgs = ((InternalEObject)newOverridingOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OPERATION_OVERRIDE__OVERRIDING_OPERATION, null, msgs);
			msgs = basicSetOverridingOperation(newOverridingOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OPERATION_OVERRIDE__OVERRIDING_OPERATION, newOverridingOperation, newOverridingOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.OPERATION_OVERRIDE__OVERRIDING_OPERATION:
				return basicSetOverridingOperation(null, msgs);
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
			case DataRepresentationPackage.OPERATION_OVERRIDE__PARENT_CLASS_OPERATION:
				if (resolve) return getParentClassOperation();
				return basicGetParentClassOperation();
			case DataRepresentationPackage.OPERATION_OVERRIDE__OVERRIDING_OPERATION:
				return getOverridingOperation();
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
			case DataRepresentationPackage.OPERATION_OVERRIDE__PARENT_CLASS_OPERATION:
				setParentClassOperation((ObjectClassOperation)newValue);
				return;
			case DataRepresentationPackage.OPERATION_OVERRIDE__OVERRIDING_OPERATION:
				setOverridingOperation((ObjectClassOperation)newValue);
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
			case DataRepresentationPackage.OPERATION_OVERRIDE__PARENT_CLASS_OPERATION:
				setParentClassOperation((ObjectClassOperation)null);
				return;
			case DataRepresentationPackage.OPERATION_OVERRIDE__OVERRIDING_OPERATION:
				setOverridingOperation((ObjectClassOperation)null);
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
			case DataRepresentationPackage.OPERATION_OVERRIDE__PARENT_CLASS_OPERATION:
				return parentClassOperation != null;
			case DataRepresentationPackage.OPERATION_OVERRIDE__OVERRIDING_OPERATION:
				return overridingOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationOverrideImpl
