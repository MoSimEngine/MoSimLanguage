/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;
import aDL_Moddeling_Project.DataRepresentation.ObjectClass;
import aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance;
import aDL_Moddeling_Project.DataRepresentation.OperationOverride;

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
 * An implementation of the model object '<em><b>Object Class Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassInheritanceImpl#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassInheritanceImpl#getOperationoverride <em>Operationoverride</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectClassInheritanceImpl extends MinimalEObjectImpl.Container implements ObjectClassInheritance {
	/**
	 * The cached value of the '{@link #getObjectClass() <em>Object Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected ObjectClass objectClass;

	/**
	 * The cached value of the '{@link #getOperationoverride() <em>Operationoverride</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationoverride()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationOverride> operationoverride;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectClassInheritanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.OBJECT_CLASS_INHERITANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass getObjectClass() {
		if (objectClass != null && objectClass.eIsProxy()) {
			InternalEObject oldObjectClass = (InternalEObject)objectClass;
			objectClass = (ObjectClass)eResolveProxy(oldObjectClass);
			if (objectClass != oldObjectClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OBJECT_CLASS, oldObjectClass, objectClass));
			}
		}
		return objectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass basicGetObjectClass() {
		return objectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectClass(ObjectClass newObjectClass) {
		ObjectClass oldObjectClass = objectClass;
		objectClass = newObjectClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OBJECT_CLASS, oldObjectClass, objectClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationOverride> getOperationoverride() {
		if (operationoverride == null) {
			operationoverride = new EObjectContainmentEList<OperationOverride>(OperationOverride.class, this, DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OPERATIONOVERRIDE);
		}
		return operationoverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OPERATIONOVERRIDE:
				return ((InternalEList<?>)getOperationoverride()).basicRemove(otherEnd, msgs);
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
			case DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OBJECT_CLASS:
				if (resolve) return getObjectClass();
				return basicGetObjectClass();
			case DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OPERATIONOVERRIDE:
				return getOperationoverride();
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
			case DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OBJECT_CLASS:
				setObjectClass((ObjectClass)newValue);
				return;
			case DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OPERATIONOVERRIDE:
				getOperationoverride().clear();
				getOperationoverride().addAll((Collection<? extends OperationOverride>)newValue);
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
			case DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OBJECT_CLASS:
				setObjectClass((ObjectClass)null);
				return;
			case DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OPERATIONOVERRIDE:
				getOperationoverride().clear();
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
			case DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OBJECT_CLASS:
				return objectClass != null;
			case DataRepresentationPackage.OBJECT_CLASS_INHERITANCE__OPERATIONOVERRIDE:
				return operationoverride != null && !operationoverride.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectClassInheritanceImpl
