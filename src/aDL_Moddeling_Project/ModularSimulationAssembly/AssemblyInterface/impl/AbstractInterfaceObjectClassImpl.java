/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Interface Object Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceObjectClassImpl#getAbstractinterfacedata <em>Abstractinterfacedata</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceObjectClassImpl#getAbstractinterfaceoperation <em>Abstractinterfaceoperation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractInterfaceObjectClassImpl extends AbstractAssemblyEntityImpl implements AbstractInterfaceObjectClass {
	/**
	 * The cached value of the '{@link #getAbstractinterfacedata() <em>Abstractinterfacedata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractinterfacedata()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInterfaceData> abstractinterfacedata;

	/**
	 * The cached value of the '{@link #getAbstractinterfaceoperation() <em>Abstractinterfaceoperation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractinterfaceoperation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInterfaceOperation> abstractinterfaceoperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractInterfaceObjectClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyInterfacePackage.Literals.ABSTRACT_INTERFACE_OBJECT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInterfaceData> getAbstractinterfacedata() {
		if (abstractinterfacedata == null) {
			abstractinterfacedata = new EObjectContainmentEList<AbstractInterfaceData>(AbstractInterfaceData.class, this, AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEDATA);
		}
		return abstractinterfacedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInterfaceOperation> getAbstractinterfaceoperation() {
		if (abstractinterfaceoperation == null) {
			abstractinterfaceoperation = new EObjectContainmentEList<AbstractInterfaceOperation>(AbstractInterfaceOperation.class, this, AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEOPERATION);
		}
		return abstractinterfaceoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEDATA:
				return ((InternalEList<?>)getAbstractinterfacedata()).basicRemove(otherEnd, msgs);
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEOPERATION:
				return ((InternalEList<?>)getAbstractinterfaceoperation()).basicRemove(otherEnd, msgs);
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
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEDATA:
				return getAbstractinterfacedata();
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEOPERATION:
				return getAbstractinterfaceoperation();
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
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEDATA:
				getAbstractinterfacedata().clear();
				getAbstractinterfacedata().addAll((Collection<? extends AbstractInterfaceData>)newValue);
				return;
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEOPERATION:
				getAbstractinterfaceoperation().clear();
				getAbstractinterfaceoperation().addAll((Collection<? extends AbstractInterfaceOperation>)newValue);
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
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEDATA:
				getAbstractinterfacedata().clear();
				return;
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEOPERATION:
				getAbstractinterfaceoperation().clear();
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
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEDATA:
				return abstractinterfacedata != null && !abstractinterfacedata.isEmpty();
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OBJECT_CLASS__ABSTRACTINTERFACEOPERATION:
				return abstractinterfaceoperation != null && !abstractinterfaceoperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractInterfaceObjectClassImpl
