/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl;

import aDL_Moddeling_Project.ModularEnvironment.AdditionInterface;
import aDL_Moddeling_Project.ModularEnvironment.AdditionInterfaceDefinition;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.MappableData;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.OverriddenAdditionEnhanced;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

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
 * An implementation of the model object '<em><b>Overridden Addition Enhanced</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.OverriddenAdditionEnhancedImpl#getAdditionsetter <em>Additionsetter</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.OverriddenAdditionEnhancedImpl#getReferencedAdditioninterface <em>Referenced Additioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.OverriddenAdditionEnhancedImpl#getAdditionenhanced <em>Additionenhanced</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.OverriddenAdditionEnhancedImpl#getAdditioninterface <em>Additioninterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverriddenAdditionEnhancedImpl extends EntityImpl implements OverriddenAdditionEnhanced {
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
	 * The cached value of the '{@link #getAdditionenhanced() <em>Additionenhanced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionenhanced()
	 * @generated
	 * @ordered
	 */
	protected AdditionEnhanced additionenhanced;

	/**
	 * The cached value of the '{@link #getAdditioninterface() <em>Additioninterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditioninterface()
	 * @generated
	 * @ordered
	 */
	protected AdditionInterfaceDefinition additioninterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverriddenAdditionEnhancedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyAdditionEnhancementPackage.Literals.OVERRIDDEN_ADDITION_ENHANCED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionSetter> getAdditionsetter() {
		if (additionsetter == null) {
			additionsetter = new EObjectContainmentEList<AdditionSetter>(AdditionSetter.class, this, AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONSETTER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE, oldReferencedAdditioninterface, referencedAdditioninterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE, oldReferencedAdditioninterface, referencedAdditioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionEnhanced getAdditionenhanced() {
		if (additionenhanced != null && additionenhanced.eIsProxy()) {
			InternalEObject oldAdditionenhanced = (InternalEObject)additionenhanced;
			additionenhanced = (AdditionEnhanced)eResolveProxy(oldAdditionenhanced);
			if (additionenhanced != oldAdditionenhanced) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONENHANCED, oldAdditionenhanced, additionenhanced));
			}
		}
		return additionenhanced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionEnhanced basicGetAdditionenhanced() {
		return additionenhanced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionenhanced(AdditionEnhanced newAdditionenhanced) {
		AdditionEnhanced oldAdditionenhanced = additionenhanced;
		additionenhanced = newAdditionenhanced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONENHANCED, oldAdditionenhanced, additionenhanced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionInterfaceDefinition getAdditioninterface() {
		if (additioninterface != null && additioninterface.eIsProxy()) {
			InternalEObject oldAdditioninterface = (InternalEObject)additioninterface;
			additioninterface = (AdditionInterfaceDefinition)eResolveProxy(oldAdditioninterface);
			if (additioninterface != oldAdditioninterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONINTERFACE, oldAdditioninterface, additioninterface));
			}
		}
		return additioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionInterfaceDefinition basicGetAdditioninterface() {
		return additioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditioninterface(AdditionInterfaceDefinition newAdditioninterface) {
		AdditionInterfaceDefinition oldAdditioninterface = additioninterface;
		additioninterface = newAdditioninterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONINTERFACE, oldAdditioninterface, additioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONSETTER:
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
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONSETTER:
				return getAdditionsetter();
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE:
				if (resolve) return getReferencedAdditioninterface();
				return basicGetReferencedAdditioninterface();
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONENHANCED:
				if (resolve) return getAdditionenhanced();
				return basicGetAdditionenhanced();
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONINTERFACE:
				if (resolve) return getAdditioninterface();
				return basicGetAdditioninterface();
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
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONSETTER:
				getAdditionsetter().clear();
				getAdditionsetter().addAll((Collection<? extends AdditionSetter>)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE:
				setReferencedAdditioninterface((AdditionInterface)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONENHANCED:
				setAdditionenhanced((AdditionEnhanced)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONINTERFACE:
				setAdditioninterface((AdditionInterfaceDefinition)newValue);
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
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONSETTER:
				getAdditionsetter().clear();
				return;
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE:
				setReferencedAdditioninterface((AdditionInterface)null);
				return;
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONENHANCED:
				setAdditionenhanced((AdditionEnhanced)null);
				return;
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONINTERFACE:
				setAdditioninterface((AdditionInterfaceDefinition)null);
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
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONSETTER:
				return additionsetter != null && !additionsetter.isEmpty();
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE:
				return referencedAdditioninterface != null;
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONENHANCED:
				return additionenhanced != null;
			case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONINTERFACE:
				return additioninterface != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MappableData.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AdditionEnhanced.class) {
			switch (derivedFeatureID) {
				case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONSETTER: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER;
				case AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MappableData.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AdditionEnhanced.class) {
			switch (baseFeatureID) {
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER: return AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__ADDITIONSETTER;
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE: return AssemblyAdditionEnhancementPackage.OVERRIDDEN_ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OverriddenAdditionEnhancedImpl
