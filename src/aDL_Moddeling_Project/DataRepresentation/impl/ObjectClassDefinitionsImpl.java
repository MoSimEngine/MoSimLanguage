/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;
import aDL_Moddeling_Project.DataRepresentation.ObjectClass;
import aDL_Moddeling_Project.DataRepresentation.ObjectClassDefinitions;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Class Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassDefinitionsImpl#getObjectclass <em>Objectclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectClassDefinitionsImpl extends MinimalEObjectImpl.Container implements ObjectClassDefinitions {
	/**
	 * The cached value of the '{@link #getObjectclass() <em>Objectclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectclass()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectClass> objectclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectClassDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.OBJECT_CLASS_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectClass> getObjectclass() {
		if (objectclass == null) {
			objectclass = new EObjectContainmentEList<ObjectClass>(ObjectClass.class, this, DataRepresentationPackage.OBJECT_CLASS_DEFINITIONS__OBJECTCLASS);
		}
		return objectclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.OBJECT_CLASS_DEFINITIONS__OBJECTCLASS:
				return ((InternalEList<?>)getObjectclass()).basicRemove(otherEnd, msgs);
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
			case DataRepresentationPackage.OBJECT_CLASS_DEFINITIONS__OBJECTCLASS:
				return getObjectclass();
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
			case DataRepresentationPackage.OBJECT_CLASS_DEFINITIONS__OBJECTCLASS:
				getObjectclass().clear();
				getObjectclass().addAll((Collection<? extends ObjectClass>)newValue);
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
			case DataRepresentationPackage.OBJECT_CLASS_DEFINITIONS__OBJECTCLASS:
				getObjectclass().clear();
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
			case DataRepresentationPackage.OBJECT_CLASS_DEFINITIONS__OBJECTCLASS:
				return objectclass != null && !objectclass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectClassDefinitionsImpl
