/**
 */
package aDL_Moddeling_Project.DataRepresentation.impl;

import aDL_Moddeling_Project.DataRepresentation.ClassReferenceProperty;
import aDL_Moddeling_Project.DataRepresentation.DataRepresentationPackage;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumLiteral;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.EnumType;

import aDL_Moddeling_Project.DataRepresentation.ObjectClass;
import aDL_Moddeling_Project.DataRepresentation.ObjectInstance;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectInstanceImpl#getInstantiatedObjectClass <em>Instantiated Object Class</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectInstanceImpl#getObjectAssignment <em>Object Assignment</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectInstanceImpl#getDataValueSetting <em>Data Value Setting</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.impl.ObjectInstanceImpl#getEnumValueSetting <em>Enum Value Setting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectInstanceImpl extends EntityImpl implements ObjectInstance {
	/**
	 * The cached value of the '{@link #getInstantiatedObjectClass() <em>Instantiated Object Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedObjectClass()
	 * @generated
	 * @ordered
	 */
	protected ObjectClass instantiatedObjectClass;

	/**
	 * The cached value of the '{@link #getObjectAssignment() <em>Object Assignment</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectAssignment()
	 * @generated
	 * @ordered
	 */
	protected EMap<ClassReferenceProperty, ObjectInstance> objectAssignment;

	/**
	 * The cached value of the '{@link #getDataValueSetting() <em>Data Value Setting</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValueSetting()
	 * @generated
	 * @ordered
	 */
	protected EMap<Data, String> dataValueSetting;

	/**
	 * The cached value of the '{@link #getEnumValueSetting() <em>Enum Value Setting</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumValueSetting()
	 * @generated
	 * @ordered
	 */
	protected EMap<EnumType, EnumLiteral> enumValueSetting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.OBJECT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass getInstantiatedObjectClass() {
		if (instantiatedObjectClass != null && instantiatedObjectClass.eIsProxy()) {
			InternalEObject oldInstantiatedObjectClass = (InternalEObject)instantiatedObjectClass;
			instantiatedObjectClass = (ObjectClass)eResolveProxy(oldInstantiatedObjectClass);
			if (instantiatedObjectClass != oldInstantiatedObjectClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataRepresentationPackage.OBJECT_INSTANCE__INSTANTIATED_OBJECT_CLASS, oldInstantiatedObjectClass, instantiatedObjectClass));
			}
		}
		return instantiatedObjectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass basicGetInstantiatedObjectClass() {
		return instantiatedObjectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatedObjectClass(ObjectClass newInstantiatedObjectClass) {
		ObjectClass oldInstantiatedObjectClass = instantiatedObjectClass;
		instantiatedObjectClass = newInstantiatedObjectClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.OBJECT_INSTANCE__INSTANTIATED_OBJECT_CLASS, oldInstantiatedObjectClass, instantiatedObjectClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<ClassReferenceProperty, ObjectInstance> getObjectAssignment() {
		if (objectAssignment == null) {
			objectAssignment = new EcoreEMap<ClassReferenceProperty,ObjectInstance>(DataRepresentationPackage.Literals.DATA_TO_OBJECT_MAP, DataToObjectMapImpl.class, this, DataRepresentationPackage.OBJECT_INSTANCE__OBJECT_ASSIGNMENT);
		}
		return objectAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Data, String> getDataValueSetting() {
		if (dataValueSetting == null) {
			dataValueSetting = new EcoreEMap<Data,String>(DataRepresentationPackage.Literals.DATA_TO_VALUE_MAP, DataToValueMapImpl.class, this, DataRepresentationPackage.OBJECT_INSTANCE__DATA_VALUE_SETTING);
		}
		return dataValueSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<EnumType, EnumLiteral> getEnumValueSetting() {
		if (enumValueSetting == null) {
			enumValueSetting = new EcoreEMap<EnumType,EnumLiteral>(DataRepresentationPackage.Literals.ENUM_TO_ENUMASSIGNMENT_MAP, EnumToEnumassignmentMapImpl.class, this, DataRepresentationPackage.OBJECT_INSTANCE__ENUM_VALUE_SETTING);
		}
		return enumValueSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.OBJECT_INSTANCE__OBJECT_ASSIGNMENT:
				return ((InternalEList<?>)getObjectAssignment()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.OBJECT_INSTANCE__DATA_VALUE_SETTING:
				return ((InternalEList<?>)getDataValueSetting()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.OBJECT_INSTANCE__ENUM_VALUE_SETTING:
				return ((InternalEList<?>)getEnumValueSetting()).basicRemove(otherEnd, msgs);
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
			case DataRepresentationPackage.OBJECT_INSTANCE__INSTANTIATED_OBJECT_CLASS:
				if (resolve) return getInstantiatedObjectClass();
				return basicGetInstantiatedObjectClass();
			case DataRepresentationPackage.OBJECT_INSTANCE__OBJECT_ASSIGNMENT:
				if (coreType) return getObjectAssignment();
				else return getObjectAssignment().map();
			case DataRepresentationPackage.OBJECT_INSTANCE__DATA_VALUE_SETTING:
				if (coreType) return getDataValueSetting();
				else return getDataValueSetting().map();
			case DataRepresentationPackage.OBJECT_INSTANCE__ENUM_VALUE_SETTING:
				if (coreType) return getEnumValueSetting();
				else return getEnumValueSetting().map();
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
			case DataRepresentationPackage.OBJECT_INSTANCE__INSTANTIATED_OBJECT_CLASS:
				setInstantiatedObjectClass((ObjectClass)newValue);
				return;
			case DataRepresentationPackage.OBJECT_INSTANCE__OBJECT_ASSIGNMENT:
				((EStructuralFeature.Setting)getObjectAssignment()).set(newValue);
				return;
			case DataRepresentationPackage.OBJECT_INSTANCE__DATA_VALUE_SETTING:
				((EStructuralFeature.Setting)getDataValueSetting()).set(newValue);
				return;
			case DataRepresentationPackage.OBJECT_INSTANCE__ENUM_VALUE_SETTING:
				((EStructuralFeature.Setting)getEnumValueSetting()).set(newValue);
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
			case DataRepresentationPackage.OBJECT_INSTANCE__INSTANTIATED_OBJECT_CLASS:
				setInstantiatedObjectClass((ObjectClass)null);
				return;
			case DataRepresentationPackage.OBJECT_INSTANCE__OBJECT_ASSIGNMENT:
				getObjectAssignment().clear();
				return;
			case DataRepresentationPackage.OBJECT_INSTANCE__DATA_VALUE_SETTING:
				getDataValueSetting().clear();
				return;
			case DataRepresentationPackage.OBJECT_INSTANCE__ENUM_VALUE_SETTING:
				getEnumValueSetting().clear();
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
			case DataRepresentationPackage.OBJECT_INSTANCE__INSTANTIATED_OBJECT_CLASS:
				return instantiatedObjectClass != null;
			case DataRepresentationPackage.OBJECT_INSTANCE__OBJECT_ASSIGNMENT:
				return objectAssignment != null && !objectAssignment.isEmpty();
			case DataRepresentationPackage.OBJECT_INSTANCE__DATA_VALUE_SETTING:
				return dataValueSetting != null && !dataValueSetting.isEmpty();
			case DataRepresentationPackage.OBJECT_INSTANCE__ENUM_VALUE_SETTING:
				return enumValueSetting != null && !enumValueSetting.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectInstanceImpl
