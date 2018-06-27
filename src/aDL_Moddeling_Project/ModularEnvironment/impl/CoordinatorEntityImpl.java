/**
 */
package aDL_Moddeling_Project.ModularEnvironment.impl;

import aDL_Moddeling_Project.ModularEnvironment.AdditionInterface;
import aDL_Moddeling_Project.ModularEnvironment.CoordinatorEntity;
import aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinator Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorEntityImpl#getDataadditioninterface <em>Dataadditioninterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CoordinatorEntityImpl extends MinimalEObjectImpl.Container implements CoordinatorEntity {
	/**
	 * The cached value of the '{@link #getDataadditioninterface() <em>Dataadditioninterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataadditioninterface()
	 * @generated
	 * @ordered
	 */
	protected AdditionInterface dataadditioninterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatorEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularEnvironmentPackage.Literals.COORDINATOR_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionInterface getDataadditioninterface() {
		return dataadditioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataadditioninterface(AdditionInterface newDataadditioninterface, NotificationChain msgs) {
		AdditionInterface oldDataadditioninterface = dataadditioninterface;
		dataadditioninterface = newDataadditioninterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.COORDINATOR_ENTITY__DATAADDITIONINTERFACE, oldDataadditioninterface, newDataadditioninterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataadditioninterface(AdditionInterface newDataadditioninterface) {
		if (newDataadditioninterface != dataadditioninterface) {
			NotificationChain msgs = null;
			if (dataadditioninterface != null)
				msgs = ((InternalEObject)dataadditioninterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.COORDINATOR_ENTITY__DATAADDITIONINTERFACE, null, msgs);
			if (newDataadditioninterface != null)
				msgs = ((InternalEObject)newDataadditioninterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.COORDINATOR_ENTITY__DATAADDITIONINTERFACE, null, msgs);
			msgs = basicSetDataadditioninterface(newDataadditioninterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.COORDINATOR_ENTITY__DATAADDITIONINTERFACE, newDataadditioninterface, newDataadditioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModularEnvironmentPackage.COORDINATOR_ENTITY__DATAADDITIONINTERFACE:
				return basicSetDataadditioninterface(null, msgs);
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
			case ModularEnvironmentPackage.COORDINATOR_ENTITY__DATAADDITIONINTERFACE:
				return getDataadditioninterface();
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
			case ModularEnvironmentPackage.COORDINATOR_ENTITY__DATAADDITIONINTERFACE:
				setDataadditioninterface((AdditionInterface)newValue);
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
			case ModularEnvironmentPackage.COORDINATOR_ENTITY__DATAADDITIONINTERFACE:
				setDataadditioninterface((AdditionInterface)null);
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
			case ModularEnvironmentPackage.COORDINATOR_ENTITY__DATAADDITIONINTERFACE:
				return dataadditioninterface != null;
		}
		return super.eIsSet(featureID);
	}

} //CoordinatorEntityImpl
