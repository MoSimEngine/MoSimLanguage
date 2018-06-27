/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterface;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AssemblyInterfaceImpl#getAbstractinterfaceobjectclass <em>Abstractinterfaceobjectclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyInterfaceImpl extends EntityImpl implements AssemblyInterface {
	/**
	 * The cached value of the '{@link #getAbstractinterfaceobjectclass() <em>Abstractinterfaceobjectclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractinterfaceobjectclass()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInterfaceObjectClass> abstractinterfaceobjectclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyInterfacePackage.Literals.ASSEMBLY_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInterfaceObjectClass> getAbstractinterfaceobjectclass() {
		if (abstractinterfaceobjectclass == null) {
			abstractinterfaceobjectclass = new EObjectContainmentEList<AbstractInterfaceObjectClass>(AbstractInterfaceObjectClass.class, this, AssemblyInterfacePackage.ASSEMBLY_INTERFACE__ABSTRACTINTERFACEOBJECTCLASS);
		}
		return abstractinterfaceobjectclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyInterfacePackage.ASSEMBLY_INTERFACE__ABSTRACTINTERFACEOBJECTCLASS:
				return ((InternalEList<?>)getAbstractinterfaceobjectclass()).basicRemove(otherEnd, msgs);
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
			case AssemblyInterfacePackage.ASSEMBLY_INTERFACE__ABSTRACTINTERFACEOBJECTCLASS:
				return getAbstractinterfaceobjectclass();
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
			case AssemblyInterfacePackage.ASSEMBLY_INTERFACE__ABSTRACTINTERFACEOBJECTCLASS:
				getAbstractinterfaceobjectclass().clear();
				getAbstractinterfaceobjectclass().addAll((Collection<? extends AbstractInterfaceObjectClass>)newValue);
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
			case AssemblyInterfacePackage.ASSEMBLY_INTERFACE__ABSTRACTINTERFACEOBJECTCLASS:
				getAbstractinterfaceobjectclass().clear();
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
			case AssemblyInterfacePackage.ASSEMBLY_INTERFACE__ABSTRACTINTERFACEOBJECTCLASS:
				return abstractinterfaceobjectclass != null && !abstractinterfaceobjectclass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssemblyInterfaceImpl
