/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;
import aDL_Moddeling_Project.DataRepresentation.InstancedObjects;
import aDL_Moddeling_Project.DataRepresentation.ObjectInstance;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionEnhanceableEntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instanced Objects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.InstancedObjectsImpl#getObjectinstance <em>Objectinstance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstancedObjectsImpl extends AdditionEnhanceableEntityImpl implements InstancedObjects {
	/**
	 * The cached value of the '{@link #getObjectinstance() <em>Objectinstance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectinstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectInstance> objectinstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstancedObjectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.INSTANCED_OBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectInstance> getObjectinstance() {
		if (objectinstance == null) {
			objectinstance = new EObjectContainmentEList<ObjectInstance>(ObjectInstance.class, this, DataRepresentationPackage.INSTANCED_OBJECTS__OBJECTINSTANCE);
		}
		return objectinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.INSTANCED_OBJECTS__OBJECTINSTANCE:
				return ((InternalEList<?>)getObjectinstance()).basicRemove(otherEnd, msgs);
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
			case DataRepresentationPackage.INSTANCED_OBJECTS__OBJECTINSTANCE:
				return getObjectinstance();
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
			case DataRepresentationPackage.INSTANCED_OBJECTS__OBJECTINSTANCE:
				getObjectinstance().clear();
				getObjectinstance().addAll((Collection<? extends ObjectInstance>)newValue);
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
			case DataRepresentationPackage.INSTANCED_OBJECTS__OBJECTINSTANCE:
				getObjectinstance().clear();
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
			case DataRepresentationPackage.INSTANCED_OBJECTS__OBJECTINSTANCE:
				return objectinstance != null && !objectinstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstancedObjectsImpl
