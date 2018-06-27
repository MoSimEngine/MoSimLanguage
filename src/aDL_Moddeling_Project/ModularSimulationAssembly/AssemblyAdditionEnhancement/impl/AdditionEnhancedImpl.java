/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl;

import aDL_Moddeling_Project.ModularEnvironment.AdditionInterface;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addition Enhanced</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedImpl#getAdditionsetter <em>Additionsetter</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedImpl#getReferencedAdditioninterface <em>Referenced Additioninterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AdditionEnhancedImpl extends MappableDataImpl implements AdditionEnhanced {
	/**
	 * The cached value of the '{@link #getAdditionsetter() <em>Additionsetter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionsetter()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionSetter> additionsetter;

	/**
	 * The cached value of the '{@link #getReferencedAdditioninterface() <em>Referenced Additioninterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedAdditioninterface()
	 * @generated
	 * @ordered
	 */
	protected AdditionInterface referencedAdditioninterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionEnhancedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyAdditionEnhancementPackage.Literals.ADDITION_ENHANCED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionSetter> getAdditionsetter() {
		if (additionsetter == null) {
			additionsetter = new EObjectContainmentEList<AdditionSetter>(AdditionSetter.class, this, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER);
		}
		return additionsetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionInterface getReferencedAdditioninterface() {
		if (referencedAdditioninterface != null && referencedAdditioninterface.eIsProxy()) {
			InternalEObject oldReferencedAdditioninterface = (InternalEObject)referencedAdditioninterface;
			referencedAdditioninterface = (AdditionInterface)eResolveProxy(oldReferencedAdditioninterface);
			if (referencedAdditioninterface != oldReferencedAdditioninterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE, oldReferencedAdditioninterface, referencedAdditioninterface));
			}
		}
		return referencedAdditioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionInterface basicGetReferencedAdditioninterface() {
		return referencedAdditioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedAdditioninterface(AdditionInterface newReferencedAdditioninterface) {
		AdditionInterface oldReferencedAdditioninterface = referencedAdditioninterface;
		referencedAdditioninterface = newReferencedAdditioninterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE, oldReferencedAdditioninterface, referencedAdditioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER:
				return ((InternalEList<?>)getAdditionsetter()).basicRemove(otherEnd, msgs);
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER:
				return getAdditionsetter();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE:
				if (resolve) return getReferencedAdditioninterface();
				return basicGetReferencedAdditioninterface();
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER:
				getAdditionsetter().clear();
				getAdditionsetter().addAll((Collection<? extends AdditionSetter>)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE:
				setReferencedAdditioninterface((AdditionInterface)newValue);
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER:
				getAdditionsetter().clear();
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE:
				setReferencedAdditioninterface((AdditionInterface)null);
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER:
				return additionsetter != null && !additionsetter.isEmpty();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE:
				return referencedAdditioninterface != null;
		}
		return super.eIsSet(featureID);
	}

} //AdditionEnhancedImpl
