/**
 */
package aDL_Moddeling_Project.ModularEnvironment.impl;

import aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage;
import aDL_Moddeling_Project.ModularEnvironment.ObjectClassAdditionInterface;
import aDL_Moddeling_Project.ModularEnvironment.ObjectOrientedStructuredAdditionInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Oriented Structured Addition Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.impl.ObjectOrientedStructuredAdditionInterfaceImpl#getObjectclassadditioninterface <em>Objectclassadditioninterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectOrientedStructuredAdditionInterfaceImpl extends AdditionInterfaceImpl implements ObjectOrientedStructuredAdditionInterface {
	/**
	 * The cached value of the '{@link #getObjectclassadditioninterface() <em>Objectclassadditioninterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectclassadditioninterface()
	 * @generated
	 * @ordered
	 */
	protected ObjectClassAdditionInterface objectclassadditioninterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectOrientedStructuredAdditionInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularEnvironmentPackage.Literals.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassAdditionInterface getObjectclassadditioninterface() {
		return objectclassadditioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectclassadditioninterface(ObjectClassAdditionInterface newObjectclassadditioninterface, NotificationChain msgs) {
		ObjectClassAdditionInterface oldObjectclassadditioninterface = objectclassadditioninterface;
		objectclassadditioninterface = newObjectclassadditioninterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OBJECTCLASSADDITIONINTERFACE, oldObjectclassadditioninterface, newObjectclassadditioninterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectclassadditioninterface(ObjectClassAdditionInterface newObjectclassadditioninterface) {
		if (newObjectclassadditioninterface != objectclassadditioninterface) {
			NotificationChain msgs = null;
			if (objectclassadditioninterface != null)
				msgs = ((InternalEObject)objectclassadditioninterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OBJECTCLASSADDITIONINTERFACE, null, msgs);
			if (newObjectclassadditioninterface != null)
				msgs = ((InternalEObject)newObjectclassadditioninterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OBJECTCLASSADDITIONINTERFACE, null, msgs);
			msgs = basicSetObjectclassadditioninterface(newObjectclassadditioninterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OBJECTCLASSADDITIONINTERFACE, newObjectclassadditioninterface, newObjectclassadditioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModularEnvironmentPackage.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OBJECTCLASSADDITIONINTERFACE:
				return basicSetObjectclassadditioninterface(null, msgs);
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
			case ModularEnvironmentPackage.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OBJECTCLASSADDITIONINTERFACE:
				return getObjectclassadditioninterface();
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
			case ModularEnvironmentPackage.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OBJECTCLASSADDITIONINTERFACE:
				setObjectclassadditioninterface((ObjectClassAdditionInterface)newValue);
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
			case ModularEnvironmentPackage.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OBJECTCLASSADDITIONINTERFACE:
				setObjectclassadditioninterface((ObjectClassAdditionInterface)null);
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
			case ModularEnvironmentPackage.OBJECT_ORIENTED_STRUCTURED_ADDITION_INTERFACE__OBJECTCLASSADDITIONINTERFACE:
				return objectclassadditioninterface != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectOrientedStructuredAdditionInterfaceImpl
