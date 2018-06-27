/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping;

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
 * An implementation of the model object '<em><b>Requiering Interface Object Class Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequieringInterfaceObjectClassMappingImpl#getObjectorientedviewrequiredentry <em>Objectorientedviewrequiredentry</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequieringInterfaceObjectClassMappingImpl#getInterfaceObjectClass <em>Interface Object Class</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.RequieringInterfaceObjectClassMappingImpl#getEnhancedtointerfacemapping <em>Enhancedtointerfacemapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequieringInterfaceObjectClassMappingImpl extends MinimalEObjectImpl.Container implements RequieringInterfaceObjectClassMapping {
	/**
	 * The cached value of the '{@link #getObjectorientedviewrequiredentry() <em>Objectorientedviewrequiredentry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectorientedviewrequiredentry()
	 * @generated
	 * @ordered
	 */
	protected ObjectOrientedViewRequiredEntry objectorientedviewrequiredentry;

	/**
	 * The cached value of the '{@link #getInterfaceObjectClass() <em>Interface Object Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceObjectClass()
	 * @generated
	 * @ordered
	 */
	protected AbstractInterfaceObjectClass interfaceObjectClass;

	/**
	 * The cached value of the '{@link #getEnhancedtointerfacemapping() <em>Enhancedtointerfacemapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhancedtointerfacemapping()
	 * @generated
	 * @ordered
	 */
	protected EList<EnhancedToInterfaceMapping> enhancedtointerfacemapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequieringInterfaceObjectClassMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyInterfacePackage.Literals.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOrientedViewRequiredEntry getObjectorientedviewrequiredentry() {
		if (objectorientedviewrequiredentry != null && objectorientedviewrequiredentry.eIsProxy()) {
			InternalEObject oldObjectorientedviewrequiredentry = (InternalEObject)objectorientedviewrequiredentry;
			objectorientedviewrequiredentry = (ObjectOrientedViewRequiredEntry)eResolveProxy(oldObjectorientedviewrequiredentry);
			if (objectorientedviewrequiredentry != oldObjectorientedviewrequiredentry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__OBJECTORIENTEDVIEWREQUIREDENTRY, oldObjectorientedviewrequiredentry, objectorientedviewrequiredentry));
			}
		}
		return objectorientedviewrequiredentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOrientedViewRequiredEntry basicGetObjectorientedviewrequiredentry() {
		return objectorientedviewrequiredentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectorientedviewrequiredentry(ObjectOrientedViewRequiredEntry newObjectorientedviewrequiredentry) {
		ObjectOrientedViewRequiredEntry oldObjectorientedviewrequiredentry = objectorientedviewrequiredentry;
		objectorientedviewrequiredentry = newObjectorientedviewrequiredentry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__OBJECTORIENTEDVIEWREQUIREDENTRY, oldObjectorientedviewrequiredentry, objectorientedviewrequiredentry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInterfaceObjectClass getInterfaceObjectClass() {
		if (interfaceObjectClass != null && interfaceObjectClass.eIsProxy()) {
			InternalEObject oldInterfaceObjectClass = (InternalEObject)interfaceObjectClass;
			interfaceObjectClass = (AbstractInterfaceObjectClass)eResolveProxy(oldInterfaceObjectClass);
			if (interfaceObjectClass != oldInterfaceObjectClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS, oldInterfaceObjectClass, interfaceObjectClass));
			}
		}
		return interfaceObjectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInterfaceObjectClass basicGetInterfaceObjectClass() {
		return interfaceObjectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceObjectClass(AbstractInterfaceObjectClass newInterfaceObjectClass) {
		AbstractInterfaceObjectClass oldInterfaceObjectClass = interfaceObjectClass;
		interfaceObjectClass = newInterfaceObjectClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS, oldInterfaceObjectClass, interfaceObjectClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnhancedToInterfaceMapping> getEnhancedtointerfacemapping() {
		if (enhancedtointerfacemapping == null) {
			enhancedtointerfacemapping = new EObjectContainmentEList<EnhancedToInterfaceMapping>(EnhancedToInterfaceMapping.class, this, AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING);
		}
		return enhancedtointerfacemapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING:
				return ((InternalEList<?>)getEnhancedtointerfacemapping()).basicRemove(otherEnd, msgs);
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
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__OBJECTORIENTEDVIEWREQUIREDENTRY:
				if (resolve) return getObjectorientedviewrequiredentry();
				return basicGetObjectorientedviewrequiredentry();
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS:
				if (resolve) return getInterfaceObjectClass();
				return basicGetInterfaceObjectClass();
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING:
				return getEnhancedtointerfacemapping();
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
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__OBJECTORIENTEDVIEWREQUIREDENTRY:
				setObjectorientedviewrequiredentry((ObjectOrientedViewRequiredEntry)newValue);
				return;
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS:
				setInterfaceObjectClass((AbstractInterfaceObjectClass)newValue);
				return;
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING:
				getEnhancedtointerfacemapping().clear();
				getEnhancedtointerfacemapping().addAll((Collection<? extends EnhancedToInterfaceMapping>)newValue);
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
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__OBJECTORIENTEDVIEWREQUIREDENTRY:
				setObjectorientedviewrequiredentry((ObjectOrientedViewRequiredEntry)null);
				return;
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS:
				setInterfaceObjectClass((AbstractInterfaceObjectClass)null);
				return;
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING:
				getEnhancedtointerfacemapping().clear();
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
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__OBJECTORIENTEDVIEWREQUIREDENTRY:
				return objectorientedviewrequiredentry != null;
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS:
				return interfaceObjectClass != null;
			case AssemblyInterfacePackage.REQUIERING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING:
				return enhancedtointerfacemapping != null && !enhancedtointerfacemapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequieringInterfaceObjectClassMappingImpl
