/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.impl;

import aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage;
import aDL_Moddeling_Project.ModularSimulation.SimModule;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedInformation;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceMapping;

import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity;
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
 * An implementation of the model object '<em><b>Simulation Assembly Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyEntityImpl#getUsedgeneralsimulationfunction <em>Usedgeneralsimulationfunction</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyEntityImpl#getInterfacemapping <em>Interfacemapping</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyEntityImpl#getSimmodule <em>Simmodule</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyEntityImpl#getAdditionenhancedinformation <em>Additionenhancedinformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationAssemblyEntityImpl extends EntityImpl implements SimulationAssemblyEntity {
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
	 * The cached value of the '{@link #getSimmodule() <em>Simmodule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimmodule()
	 * @generated
	 * @ordered
	 */
	protected SimModule simmodule;

	/**
	 * The cached value of the '{@link #getAdditionenhancedinformation() <em>Additionenhancedinformation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionenhancedinformation()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionEnhancedInformation> additionenhancedinformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationAssemblyEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularSimulationAssemblyPackage.Literals.SIMULATION_ASSEMBLY_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<generalSimulationFunction> getUsedgeneralsimulationfunction() {
		if (usedgeneralsimulationfunction == null) {
			usedgeneralsimulationfunction = new EObjectResolvingEList<generalSimulationFunction>(generalSimulationFunction.class, this, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION);
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
			interfacemapping = new EObjectContainmentWithInverseEList<InterfaceMapping>(InterfaceMapping.class, this, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__INTERFACEMAPPING, AssemblyInterfacePackage.INTERFACE_MAPPING__ASSEMBABLEENTITY);
		}
		return interfacemapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimModule getSimmodule() {
		if (simmodule != null && simmodule.eIsProxy()) {
			InternalEObject oldSimmodule = (InternalEObject)simmodule;
			simmodule = (SimModule)eResolveProxy(oldSimmodule);
			if (simmodule != oldSimmodule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE, oldSimmodule, simmodule));
			}
		}
		return simmodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimModule basicGetSimmodule() {
		return simmodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimmodule(SimModule newSimmodule, NotificationChain msgs) {
		SimModule oldSimmodule = simmodule;
		simmodule = newSimmodule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE, oldSimmodule, newSimmodule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimmodule(SimModule newSimmodule) {
		if (newSimmodule != simmodule) {
			NotificationChain msgs = null;
			if (simmodule != null)
				msgs = ((InternalEObject)simmodule).eInverseRemove(this, ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY, SimModule.class, msgs);
			if (newSimmodule != null)
				msgs = ((InternalEObject)newSimmodule).eInverseAdd(this, ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY, SimModule.class, msgs);
			msgs = basicSetSimmodule(newSimmodule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE, newSimmodule, newSimmodule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionEnhancedInformation> getAdditionenhancedinformation() {
		if (additionenhancedinformation == null) {
			additionenhancedinformation = new EObjectContainmentEList<AdditionEnhancedInformation>(AdditionEnhancedInformation.class, this, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__ADDITIONENHANCEDINFORMATION);
		}
		return additionenhancedinformation;
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfacemapping()).basicAdd(otherEnd, msgs);
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE:
				if (simmodule != null)
					msgs = ((InternalEObject)simmodule).eInverseRemove(this, ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY, SimModule.class, msgs);
				return basicSetSimmodule((SimModule)otherEnd, msgs);
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				return ((InternalEList<?>)getInterfacemapping()).basicRemove(otherEnd, msgs);
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE:
				return basicSetSimmodule(null, msgs);
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__ADDITIONENHANCEDINFORMATION:
				return ((InternalEList<?>)getAdditionenhancedinformation()).basicRemove(otherEnd, msgs);
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				return getUsedgeneralsimulationfunction();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				return getInterfacemapping();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE:
				if (resolve) return getSimmodule();
				return basicGetSimmodule();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__ADDITIONENHANCEDINFORMATION:
				return getAdditionenhancedinformation();
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				getUsedgeneralsimulationfunction().clear();
				getUsedgeneralsimulationfunction().addAll((Collection<? extends generalSimulationFunction>)newValue);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				getInterfacemapping().clear();
				getInterfacemapping().addAll((Collection<? extends InterfaceMapping>)newValue);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE:
				setSimmodule((SimModule)newValue);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__ADDITIONENHANCEDINFORMATION:
				getAdditionenhancedinformation().clear();
				getAdditionenhancedinformation().addAll((Collection<? extends AdditionEnhancedInformation>)newValue);
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				getUsedgeneralsimulationfunction().clear();
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				getInterfacemapping().clear();
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE:
				setSimmodule((SimModule)null);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__ADDITIONENHANCEDINFORMATION:
				getAdditionenhancedinformation().clear();
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION:
				return usedgeneralsimulationfunction != null && !usedgeneralsimulationfunction.isEmpty();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__INTERFACEMAPPING:
				return interfacemapping != null && !interfacemapping.isEmpty();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE:
				return simmodule != null;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__ADDITIONENHANCEDINFORMATION:
				return additionenhancedinformation != null && !additionenhancedinformation.isEmpty();
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
				case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION: return ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION;
				case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__INTERFACEMAPPING: return ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING;
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
				case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__USEDGENERALSIMULATIONFUNCTION: return ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__USEDGENERALSIMULATIONFUNCTION;
				case ModularSimulationAssemblyPackage.ASSEMBABLE_ENTITY__INTERFACEMAPPING: return ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__INTERFACEMAPPING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SimulationAssemblyEntityImpl
