/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import aDL_Moddeling_Project.DataRepresentation.ObjectClass;
import aDL_Moddeling_Project.DataRepresentation.ObjectClassInheritance;
import aDL_Moddeling_Project.DataRepresentation.ObjectClassOperation;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.AdditionEnhanceableEntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassImpl#getObjectclassoperation <em>Objectclassoperation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassImpl#getObjectclassinheritance <em>Objectclassinheritance</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectClassImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectClassImpl extends AdditionEnhanceableEntityImpl implements ObjectClass {
	/**
	 * The cached value of the '{@link #getObjectclassoperation() <em>Objectclassoperation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectclassoperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectClassOperation> objectclassoperation;

	/**
	 * The cached value of the '{@link #getObjectclassinheritance() <em>Objectclassinheritance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectclassinheritance()
	 * @generated
	 * @ordered
	 */
	protected ObjectClassInheritance objectclassinheritance;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.OBJECT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectClassOperation> getObjectclassoperation() {
		if (objectclassoperation == null) {
			objectclassoperation = new EObjectContainmentWithInverseEList<ObjectClassOperation>(ObjectClassOperation.class, this, DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSOPERATION, DataRepresentationPackage.OBJECT_CLASS_OPERATION__OBJECTCLASS);
		}
		return objectclassoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassInheritance getObjectclassinheritance() {
		return objectclassinheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectclassinheritance(ObjectClassInheritance newObjectclassinheritance, NotificationChain msgs) {
		ObjectClassInheritance oldObjectclassinheritance = objectclassinheritance;
		objectclassinheritance = newObjectclassinheritance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSINHERITANCE, oldObjectclassinheritance, newObjectclassinheritance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectclassinheritance(ObjectClassInheritance newObjectclassinheritance) {
		if (newObjectclassinheritance != objectclassinheritance) {
			NotificationChain msgs = null;
			if (objectclassinheritance != null)
				msgs = ((InternalEObject)objectclassinheritance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSINHERITANCE, null, msgs);
			if (newObjectclassinheritance != null)
				msgs = ((InternalEObject)newObjectclassinheritance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSINHERITANCE, null, msgs);
			msgs = basicSetObjectclassinheritance(newObjectclassinheritance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSINHERITANCE, newObjectclassinheritance, newObjectclassinheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, DataRepresentationPackage.OBJECT_CLASS__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSOPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectclassoperation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSOPERATION:
				return ((InternalEList<?>)getObjectclassoperation()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSINHERITANCE:
				return basicSetObjectclassinheritance(null, msgs);
			case DataRepresentationPackage.OBJECT_CLASS__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSOPERATION:
				return getObjectclassoperation();
			case DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSINHERITANCE:
				return getObjectclassinheritance();
			case DataRepresentationPackage.OBJECT_CLASS__DATA:
				return getData();
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
			case DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSOPERATION:
				getObjectclassoperation().clear();
				getObjectclassoperation().addAll((Collection<? extends ObjectClassOperation>)newValue);
				return;
			case DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSINHERITANCE:
				setObjectclassinheritance((ObjectClassInheritance)newValue);
				return;
			case DataRepresentationPackage.OBJECT_CLASS__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
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
			case DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSOPERATION:
				getObjectclassoperation().clear();
				return;
			case DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSINHERITANCE:
				setObjectclassinheritance((ObjectClassInheritance)null);
				return;
			case DataRepresentationPackage.OBJECT_CLASS__DATA:
				getData().clear();
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
			case DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSOPERATION:
				return objectclassoperation != null && !objectclassoperation.isEmpty();
			case DataRepresentationPackage.OBJECT_CLASS__OBJECTCLASSINHERITANCE:
				return objectclassinheritance != null;
			case DataRepresentationPackage.OBJECT_CLASS__DATA:
				return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectClassImpl
