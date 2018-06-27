/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl;

import aDL_Moddeling_Project.DataRepresentation.OperationModel.Operation;

import aDL_Moddeling_Project.ModularEnvironment.AdditionInterface;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter;

import aDL_Moddeling_Project.ModularEnvironment.OperationAdditionInterface;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.MappableData;

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
 * An implementation of the model object '<em><b>Addition Enhanced Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedOperationImpl#getAdditionsetter <em>Additionsetter</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedOperationImpl#getReferencedAdditioninterface <em>Referenced Additioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedOperationImpl#getAdditioninterface <em>Additioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedOperationImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionEnhancedOperationImpl extends EntityImpl implements AdditionEnhancedOperation {
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
	 * The cached value of the '{@link #getAdditioninterface() <em>Additioninterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditioninterface()
	 * @generated
	 * @ordered
	 */
	protected OperationAdditionInterface additioninterface;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionEnhancedOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyAdditionEnhancementPackage.Literals.ADDITION_ENHANCED_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionSetter> getAdditionsetter() {
		if (additionsetter == null) {
			additionsetter = new EObjectContainmentEList<AdditionSetter>(AdditionSetter.class, this, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONSETTER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__REFERENCED_ADDITIONINTERFACE, oldReferencedAdditioninterface, referencedAdditioninterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__REFERENCED_ADDITIONINTERFACE, oldReferencedAdditioninterface, referencedAdditioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationAdditionInterface getAdditioninterface() {
		if (additioninterface != null && additioninterface.eIsProxy()) {
			InternalEObject oldAdditioninterface = (InternalEObject)additioninterface;
			additioninterface = (OperationAdditionInterface)eResolveProxy(oldAdditioninterface);
			if (additioninterface != oldAdditioninterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONINTERFACE, oldAdditioninterface, additioninterface));
			}
		}
		return additioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationAdditionInterface basicGetAdditioninterface() {
		return additioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditioninterface(OperationAdditionInterface newAdditioninterface) {
		OperationAdditionInterface oldAdditioninterface = additioninterface;
		additioninterface = newAdditioninterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONINTERFACE, oldAdditioninterface, additioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONSETTER:
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONSETTER:
				return getAdditionsetter();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__REFERENCED_ADDITIONINTERFACE:
				if (resolve) return getReferencedAdditioninterface();
				return basicGetReferencedAdditioninterface();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONINTERFACE:
				if (resolve) return getAdditioninterface();
				return basicGetAdditioninterface();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONSETTER:
				getAdditionsetter().clear();
				getAdditionsetter().addAll((Collection<? extends AdditionSetter>)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__REFERENCED_ADDITIONINTERFACE:
				setReferencedAdditioninterface((AdditionInterface)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONINTERFACE:
				setAdditioninterface((OperationAdditionInterface)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__OPERATION:
				setOperation((Operation)newValue);
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONSETTER:
				getAdditionsetter().clear();
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__REFERENCED_ADDITIONINTERFACE:
				setReferencedAdditioninterface((AdditionInterface)null);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONINTERFACE:
				setAdditioninterface((OperationAdditionInterface)null);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__OPERATION:
				setOperation((Operation)null);
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONSETTER:
				return additionsetter != null && !additionsetter.isEmpty();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__REFERENCED_ADDITIONINTERFACE:
				return referencedAdditioninterface != null;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONINTERFACE:
				return additioninterface != null;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__OPERATION:
				return operation != null;
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
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONSETTER: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER;
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__REFERENCED_ADDITIONINTERFACE: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE;
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
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__ADDITIONSETTER;
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_OPERATION__REFERENCED_ADDITIONINTERFACE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AdditionEnhancedOperationImpl
