/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl;

import aDL_Moddeling_Project.DataRepresentation.ObjectClass;

import aDL_Moddeling_Project.ModularEnvironment.AdditionInterface;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter;

import aDL_Moddeling_Project.ModularEnvironment.ObjectClassAdditionInterface;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedData;
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
 * An implementation of the model object '<em><b>Addition Enchanced Object Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnchancedObjectClassImpl#getAdditionsetter <em>Additionsetter</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnchancedObjectClassImpl#getReferencedAdditioninterface <em>Referenced Additioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnchancedObjectClassImpl#getObjectclass <em>Objectclass</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnchancedObjectClassImpl#getAdditioninterface <em>Additioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnchancedObjectClassImpl#getAdditionenhancedoperation <em>Additionenhancedoperation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.AdditionEnchancedObjectClassImpl#getAdditionenhanceddata <em>Additionenhanceddata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionEnchancedObjectClassImpl extends EntityImpl implements AdditionEnchancedObjectClass {
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
	 * The cached value of the '{@link #getObjectclass() <em>Objectclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectclass()
	 * @generated
	 * @ordered
	 */
	protected ObjectClass objectclass;

	/**
	 * The cached value of the '{@link #getAdditioninterface() <em>Additioninterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditioninterface()
	 * @generated
	 * @ordered
	 */
	protected ObjectClassAdditionInterface additioninterface;

	/**
	 * The cached value of the '{@link #getAdditionenhancedoperation() <em>Additionenhancedoperation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionenhancedoperation()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionEnhancedOperation> additionenhancedoperation;

	/**
	 * The cached value of the '{@link #getAdditionenhanceddata() <em>Additionenhanceddata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionenhanceddata()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionEnhancedData> additionenhanceddata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionEnchancedObjectClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyAdditionEnhancementPackage.Literals.ADDITION_ENCHANCED_OBJECT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionSetter> getAdditionsetter() {
		if (additionsetter == null) {
			additionsetter = new EObjectContainmentEList<AdditionSetter>(AdditionSetter.class, this, AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONSETTER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__REFERENCED_ADDITIONINTERFACE, oldReferencedAdditioninterface, referencedAdditioninterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__REFERENCED_ADDITIONINTERFACE, oldReferencedAdditioninterface, referencedAdditioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass getObjectclass() {
		if (objectclass != null && objectclass.eIsProxy()) {
			InternalEObject oldObjectclass = (InternalEObject)objectclass;
			objectclass = (ObjectClass)eResolveProxy(oldObjectclass);
			if (objectclass != oldObjectclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__OBJECTCLASS, oldObjectclass, objectclass));
			}
		}
		return objectclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass basicGetObjectclass() {
		return objectclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectclass(ObjectClass newObjectclass) {
		ObjectClass oldObjectclass = objectclass;
		objectclass = newObjectclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__OBJECTCLASS, oldObjectclass, objectclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassAdditionInterface getAdditioninterface() {
		if (additioninterface != null && additioninterface.eIsProxy()) {
			InternalEObject oldAdditioninterface = (InternalEObject)additioninterface;
			additioninterface = (ObjectClassAdditionInterface)eResolveProxy(oldAdditioninterface);
			if (additioninterface != oldAdditioninterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONINTERFACE, oldAdditioninterface, additioninterface));
			}
		}
		return additioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassAdditionInterface basicGetAdditioninterface() {
		return additioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditioninterface(ObjectClassAdditionInterface newAdditioninterface) {
		ObjectClassAdditionInterface oldAdditioninterface = additioninterface;
		additioninterface = newAdditioninterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONINTERFACE, oldAdditioninterface, additioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionEnhancedOperation> getAdditionenhancedoperation() {
		if (additionenhancedoperation == null) {
			additionenhancedoperation = new EObjectContainmentEList<AdditionEnhancedOperation>(AdditionEnhancedOperation.class, this, AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDOPERATION);
		}
		return additionenhancedoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionEnhancedData> getAdditionenhanceddata() {
		if (additionenhanceddata == null) {
			additionenhanceddata = new EObjectContainmentEList<AdditionEnhancedData>(AdditionEnhancedData.class, this, AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDDATA);
		}
		return additionenhanceddata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONSETTER:
				return ((InternalEList<?>)getAdditionsetter()).basicRemove(otherEnd, msgs);
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDOPERATION:
				return ((InternalEList<?>)getAdditionenhancedoperation()).basicRemove(otherEnd, msgs);
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDDATA:
				return ((InternalEList<?>)getAdditionenhanceddata()).basicRemove(otherEnd, msgs);
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONSETTER:
				return getAdditionsetter();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__REFERENCED_ADDITIONINTERFACE:
				if (resolve) return getReferencedAdditioninterface();
				return basicGetReferencedAdditioninterface();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__OBJECTCLASS:
				if (resolve) return getObjectclass();
				return basicGetObjectclass();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONINTERFACE:
				if (resolve) return getAdditioninterface();
				return basicGetAdditioninterface();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDOPERATION:
				return getAdditionenhancedoperation();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDDATA:
				return getAdditionenhanceddata();
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONSETTER:
				getAdditionsetter().clear();
				getAdditionsetter().addAll((Collection<? extends AdditionSetter>)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__REFERENCED_ADDITIONINTERFACE:
				setReferencedAdditioninterface((AdditionInterface)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__OBJECTCLASS:
				setObjectclass((ObjectClass)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONINTERFACE:
				setAdditioninterface((ObjectClassAdditionInterface)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDOPERATION:
				getAdditionenhancedoperation().clear();
				getAdditionenhancedoperation().addAll((Collection<? extends AdditionEnhancedOperation>)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDDATA:
				getAdditionenhanceddata().clear();
				getAdditionenhanceddata().addAll((Collection<? extends AdditionEnhancedData>)newValue);
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONSETTER:
				getAdditionsetter().clear();
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__REFERENCED_ADDITIONINTERFACE:
				setReferencedAdditioninterface((AdditionInterface)null);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__OBJECTCLASS:
				setObjectclass((ObjectClass)null);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONINTERFACE:
				setAdditioninterface((ObjectClassAdditionInterface)null);
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDOPERATION:
				getAdditionenhancedoperation().clear();
				return;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDDATA:
				getAdditionenhanceddata().clear();
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
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONSETTER:
				return additionsetter != null && !additionsetter.isEmpty();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__REFERENCED_ADDITIONINTERFACE:
				return referencedAdditioninterface != null;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__OBJECTCLASS:
				return objectclass != null;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONINTERFACE:
				return additioninterface != null;
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDOPERATION:
				return additionenhancedoperation != null && !additionenhancedoperation.isEmpty();
			case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONENHANCEDDATA:
				return additionenhanceddata != null && !additionenhanceddata.isEmpty();
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
				case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONSETTER: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER;
				case AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__REFERENCED_ADDITIONINTERFACE: return AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE;
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
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__ADDITIONSETTER: return AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__ADDITIONSETTER;
				case AssemblyAdditionEnhancementPackage.ADDITION_ENHANCED__REFERENCED_ADDITIONINTERFACE: return AssemblyAdditionEnhancementPackage.ADDITION_ENCHANCED_OBJECT_CLASS__REFERENCED_ADDITIONINTERFACE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AdditionEnchancedObjectClassImpl
