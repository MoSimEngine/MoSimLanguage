/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl;

import aDL_Moddeling_Project.DataRepresentation.DataSpecification.Data;

import aDL_Moddeling_Project.ModularEnvironment.AdditionInterface;
import aDL_Moddeling_Project.ModularEnvironment.DataAdditionInterface;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedData;
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
 * An implementation of the model object '<em><b>Addition Enhanced Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedDataImpl#getAdditionsetter <em>Additionsetter</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedDataImpl#getReferencedAdditioninterface <em>Referenced Additioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedDataImpl#getAdditioninterface <em>Additioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnhancedDataImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionEnhancedDataImpl extends EntityImpl implements AdditionEnhancedData {
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
	protected DataAdditionInterface additioninterface;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionEnhancedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyAdditionEnhancementPackage.Literals.ADDITION_ENHANCED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionSetter> getAdditionsetter() {
		if (additionsetter == null) {
			additionsetter = new EObjectContainmentEList<AdditionSetter>(AdditionSetter.class, this, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONSETTER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__REFERENCED_ADDITIONINTERFACE, oldReferencedAdditioninterface, referencedAdditioninterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__REFERENCED_ADDITIONINTERFACE, oldReferencedAdditioninterface, referencedAdditioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAdditionInterface getAdditioninterface() {
		if (additioninterface != null && additioninterface.eIsProxy()) {
			InternalEObject oldAdditioninterface = (InternalEObject)additioninterface;
			additioninterface = (DataAdditionInterface)eResolveProxy(oldAdditioninterface);
			if (additioninterface != oldAdditioninterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONINTERFACE, oldAdditioninterface, additioninterface));
			}
		}
		return additioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAdditionInterface basicGetAdditioninterface() {
		return additioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditioninterface(DataAdditionInterface newAdditioninterface) {
		DataAdditionInterface oldAdditioninterface = additioninterface;
		additioninterface = newAdditioninterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONINTERFACE, oldAdditioninterface, additioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Data)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONSETTER:
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONSETTER:
				return getAdditionsetter();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__REFERENCED_ADDITIONINTERFACE:
				if (resolve) return getReferencedAdditioninterface();
				return basicGetReferencedAdditioninterface();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONINTERFACE:
				if (resolve) return getAdditioninterface();
				return basicGetAdditioninterface();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__DATA:
				if (resolve) return getData();
				return basicGetData();
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONSETTER:
				getAdditionsetter().clear();
				getAdditionsetter().addAll((Collection<? extends AdditionSetter>)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__REFERENCED_ADDITIONINTERFACE:
				setReferencedAdditioninterface((AdditionInterface)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONINTERFACE:
				setAdditioninterface((DataAdditionInterface)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__DATA:
				setData((Data)newValue);
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONSETTER:
				getAdditionsetter().clear();
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__REFERENCED_ADDITIONINTERFACE:
				setReferencedAdditioninterface((AdditionInterface)null);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONINTERFACE:
				setAdditioninterface((DataAdditionInterface)null);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__DATA:
				setData((Data)null);
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONSETTER:
				return additionsetter != null && !additionsetter.isEmpty();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__REFERENCED_ADDITIONINTERFACE:
				return referencedAdditioninterface != null;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONINTERFACE:
				return additioninterface != null;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__DATA:
				return data != null;
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
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONSETTER: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER;
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__REFERENCED_ADDITIONINTERFACE: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE;
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
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__ADDITIONSETTER;
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED_DATA__REFERENCED_ADDITIONINTERFACE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AdditionEnhancedDataImpl
