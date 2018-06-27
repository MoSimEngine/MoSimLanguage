/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping;

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
 * An implementation of the model object '<em><b>Providing Interface Object Class Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.ProvidingInterfaceObjectClassMappingImpl#getInterfaceObjectClass <em>Interface Object Class</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.ProvidingInterfaceObjectClassMappingImpl#getAdditionenchancedobjectclass <em>Additionenchancedobjectclass</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.ProvidingInterfaceObjectClassMappingImpl#getEnhancedtointerfacemapping <em>Enhancedtointerfacemapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidingInterfaceObjectClassMappingImpl extends MinimalEObjectImpl.Container implements ProvidingInterfaceObjectClassMapping {
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
	 * The cached value of the '{@link #getAdditionenchancedobjectclass() <em>Additionenchancedobjectclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionenchancedobjectclass()
	 * @generated
	 * @ordered
	 */
	protected AdditionEnchancedObjectClass additionenchancedobjectclass;

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
	protected ProvidingInterfaceObjectClassMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyInterfacePackage.Literals.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS, oldInterfaceObjectClass, interfaceObjectClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS, oldInterfaceObjectClass, interfaceObjectClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionEnchancedObjectClass getAdditionenchancedobjectclass() {
		if (additionenchancedobjectclass != null && additionenchancedobjectclass.eIsProxy()) {
			InternalEObject oldAdditionenchancedobjectclass = (InternalEObject)additionenchancedobjectclass;
			additionenchancedobjectclass = (AdditionEnchancedObjectClass)eResolveProxy(oldAdditionenchancedobjectclass);
			if (additionenchancedobjectclass != oldAdditionenchancedobjectclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ADDITIONENCHANCEDOBJECTCLASS, oldAdditionenchancedobjectclass, additionenchancedobjectclass));
			}
		}
		return additionenchancedobjectclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionEnchancedObjectClass basicGetAdditionenchancedobjectclass() {
		return additionenchancedobjectclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionenchancedobjectclass(AdditionEnchancedObjectClass newAdditionenchancedobjectclass) {
		AdditionEnchancedObjectClass oldAdditionenchancedobjectclass = additionenchancedobjectclass;
		additionenchancedobjectclass = newAdditionenchancedobjectclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ADDITIONENCHANCEDOBJECTCLASS, oldAdditionenchancedobjectclass, additionenchancedobjectclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnhancedToInterfaceMapping> getEnhancedtointerfacemapping() {
		if (enhancedtointerfacemapping == null) {
			enhancedtointerfacemapping = new EObjectContainmentEList<EnhancedToInterfaceMapping>(EnhancedToInterfaceMapping.class, this, AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING);
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
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING:
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
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS:
				if (resolve) return getInterfaceObjectClass();
				return basicGetInterfaceObjectClass();
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ADDITIONENCHANCEDOBJECTCLASS:
				if (resolve) return getAdditionenchancedobjectclass();
				return basicGetAdditionenchancedobjectclass();
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING:
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
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS:
				setInterfaceObjectClass((AbstractInterfaceObjectClass)newValue);
				return;
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ADDITIONENCHANCEDOBJECTCLASS:
				setAdditionenchancedobjectclass((AdditionEnchancedObjectClass)newValue);
				return;
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING:
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
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS:
				setInterfaceObjectClass((AbstractInterfaceObjectClass)null);
				return;
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ADDITIONENCHANCEDOBJECTCLASS:
				setAdditionenchancedobjectclass((AdditionEnchancedObjectClass)null);
				return;
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING:
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
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__INTERFACE_OBJECT_CLASS:
				return interfaceObjectClass != null;
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ADDITIONENCHANCEDOBJECTCLASS:
				return additionenchancedobjectclass != null;
			case AssemblyInterfacePackage.PROVIDING_INTERFACE_OBJECT_CLASS_MAPPING__ENHANCEDTOINTERFACEMAPPING:
				return enhancedtointerfacemapping != null && !enhancedtointerfacemapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvidingInterfaceObjectClassMappingImpl
