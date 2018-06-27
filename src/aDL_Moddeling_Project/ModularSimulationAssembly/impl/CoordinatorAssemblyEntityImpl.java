/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.impl;

import aDL_Moddeling_Project.ModularEnvironment.CoordinatorEntity;

import aDL_Moddeling_Project.ModularSimulationAssembly.AdapterDescriptionAttachment;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping;

import aDL_Moddeling_Project.ModularSimulationAssembly.CoordinatorAssemblyEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.generalSimulationFunction;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinator Assembly Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.CoordinatorAssemblyEntityImpl#getUsedgeneralsimulationfunction <em>Usedgeneralsimulationfunction</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.CoordinatorAssemblyEntityImpl#getInterfacemapping <em>Interfacemapping</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.CoordinatorAssemblyEntityImpl#getAdapterdescriptionattachment <em>Adapterdescriptionattachment</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.CoordinatorAssemblyEntityImpl#getCoordinatorentity <em>Coordinatorentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinatorAssemblyEntityImpl extends EntityImpl implements CoordinatorAssemblyEntity {
	/**
	 * The cached value of the '{@link #getUsedgeneralsimulationfunction() <em>Usedgeneralsimulationfunction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedgeneralsimulationfunction()
	 * @generated
	 * @ordered
	 */
	protected EList<generalSimulationFunction> usedgeneralsimulationfunction;

	/**
	 * The cached value of the '{@link #getInterfacemapping() <em>Interfacemapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacemapping()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceMapping> interfacemapping;

	/**
	 * The cached value of the '{@link #getAdapterdescriptionattachment() <em>Adapterdescriptionattachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterdescriptionattachment()
	 * @generated
	 * @ordered
	 */
	protected EList<AdapterDescriptionAttachment> adapterdescriptionattachment;

	/**
	 * The cached value of the '{@link #getCoordinatorentity() <em>Coordinatorentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinatorentity()
	 * @generated
	 * @ordered
	 */
	protected CoordinatorEntity coordinatorentity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatorAssemblyEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularSimulationAssemblyPackage.Literals.COORDINATOR_ASSEMBLY_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<generalSimulationFunction> getUsedgeneralsimulationfunction() {
		if (usedgeneralsimulationfunction == null) {
			usedgeneralsimulationfunction = new EObjectResolvingEList<generalSimulationFunction>(generalSimulationFunction.class, this, ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION);
		}
		return usedgeneralsimulationfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceMapping> getInterfacemapping() {
		if (interfacemapping == null) {
			interfacemapping = new EObjectContainmentWithInverseEList<InterfaceMapping>(InterfaceMapping.class, this, ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__INTERFACEMAPPING, AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY);
		}
		return interfacemapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdapterDescriptionAttachment> getAdapterdescriptionattachment() {
		if (adapterdescriptionattachment == null) {
			adapterdescriptionattachment = new EObjectContainmentEList<AdapterDescriptionAttachment>(AdapterDescriptionAttachment.class, this, ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__ADAPTERDESCRIPTIONATTACHMENT);
		}
		return adapterdescriptionattachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatorEntity getCoordinatorentity() {
		if (coordinatorentity != null && coordinatorentity.eIsProxy()) {
			InternalEObject oldCoordinatorentity = (InternalEObject)coordinatorentity;
			coordinatorentity = (CoordinatorEntity)eResolveProxy(oldCoordinatorentity);
			if (coordinatorentity != oldCoordinatorentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__COORDINATORENTITY, oldCoordinatorentity, coordinatorentity));
			}
		}
		return coordinatorentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatorEntity basicGetCoordinatorentity() {
		return coordinatorentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinatorentity(CoordinatorEntity newCoordinatorentity) {
		CoordinatorEntity oldCoordinatorentity = coordinatorentity;
		coordinatorentity = newCoordinatorentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__COORDINATORENTITY, oldCoordinatorentity, coordinatorentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfacemapping()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				return ((InternalEList<?>)getInterfacemapping()).basicRemove(otherEnd, msgs);
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__ADAPTERDESCRIPTIONATTACHMENT:
				return ((InternalEList<?>)getAdapterdescriptionattachment()).basicRemove(otherEnd, msgs);
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
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				return getUsedgeneralsimulationfunction();
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				return getInterfacemapping();
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__ADAPTERDESCRIPTIONATTACHMENT:
				return getAdapterdescriptionattachment();
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__COORDINATORENTITY:
				if (resolve) return getCoordinatorentity();
				return basicGetCoordinatorentity();
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
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				getUsedgeneralsimulationfunction().clear();
				getUsedgeneralsimulationfunction().addAll((Collection<? extends generalSimulationFunction>)newValue);
				return;
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				getInterfacemapping().clear();
				getInterfacemapping().addAll((Collection<? extends InterfaceMapping>)newValue);
				return;
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__ADAPTERDESCRIPTIONATTACHMENT:
				getAdapterdescriptionattachment().clear();
				getAdapterdescriptionattachment().addAll((Collection<? extends AdapterDescriptionAttachment>)newValue);
				return;
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__COORDINATORENTITY:
				setCoordinatorentity((CoordinatorEntity)newValue);
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
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				getUsedgeneralsimulationfunction().clear();
				return;
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				getInterfacemapping().clear();
				return;
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__ADAPTERDESCRIPTIONATTACHMENT:
				getAdapterdescriptionattachment().clear();
				return;
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__COORDINATORENTITY:
				setCoordinatorentity((CoordinatorEntity)null);
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
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				return usedgeneralsimulationfunction != null && !usedgeneralsimulationfunction.isEmpty();
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				return interfacemapping != null && !interfacemapping.isEmpty();
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__ADAPTERDESCRIPTIONATTACHMENT:
				return adapterdescriptionattachment != null && !adapterdescriptionattachment.isEmpty();
			case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__COORDINATORENTITY:
				return coordinatorentity != null;
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
		if (baseClass == AssembableEntity.class) {
			switch (derivedFeatureID) {
				case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION: return ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION;
				case ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__INTERFACEMAPPING: return ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING;
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
		if (baseClass == AssembableEntity.class) {
			switch (baseFeatureID) {
				case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION: return ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION;
				case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING: return ModularSimulationAssemblyPackage.COORDINATOR_ASSEMBLY_ENTITY__INTERFACEMAPPING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CoordinatorAssemblyEntityImpl
