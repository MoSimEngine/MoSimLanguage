/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository;

import aDL_Moddeling_Project.ModularEnvironment.ObjectOrientedStructuredAdditionInterface;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssembableEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.Assembly;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceRepository;

import aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssembly;
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
 * An implementation of the model object '<em><b>Simulation Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl#getBasicmodsimEntity <em>Basicmodsim Entity</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl#getInterfacerepository <em>Interfacerepository</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl#getObjectorientedstructuredadditioninterface <em>Objectorientedstructuredadditioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl#getGeneralsimulationfunctions <em>Generalsimulationfunctions</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl#getOnLevelAssembableEntities <em>On Level Assembable Entities</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl#getAssembledSimulationVisibleData <em>Assembled Simulation Visible Data</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.SimulationAssemblyImpl#getAdaptationdefinitionrepository <em>Adaptationdefinitionrepository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationAssemblyImpl extends EntityImpl implements SimulationAssembly {
	/**
	 * The cached value of the '{@link #getBasicmodsimEntity() <em>Basicmodsim Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicmodsimEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicModSimEntity> basicmodsimEntity;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The cached value of the '{@link #getInterfacerepository() <em>Interfacerepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacerepository()
	 * @generated
	 * @ordered
	 */
	protected InterfaceRepository interfacerepository;

	/**
	 * The cached value of the '{@link #getObjectorientedstructuredadditioninterface() <em>Objectorientedstructuredadditioninterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectorientedstructuredadditioninterface()
	 * @generated
	 * @ordered
	 */
	protected ObjectOrientedStructuredAdditionInterface objectorientedstructuredadditioninterface;

	/**
	 * The cached value of the '{@link #getGeneralsimulationfunctions() <em>Generalsimulationfunctions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralsimulationfunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<generalSimulationFunction> generalsimulationfunctions;

	/**
	 * The cached value of the '{@link #getOnLevelAssembableEntities() <em>On Level Assembable Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnLevelAssembableEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<AssembableEntity> onLevelAssembableEntities;

	/**
	 * The cached value of the '{@link #getAssembledSimulationVisibleData() <em>Assembled Simulation Visible Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssembledSimulationVisibleData()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionEnhanced> assembledSimulationVisibleData;

	/**
	 * The cached value of the '{@link #getAdaptationdefinitionrepository() <em>Adaptationdefinitionrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationdefinitionrepository()
	 * @generated
	 * @ordered
	 */
	protected AdaptationDefinitionRepository adaptationdefinitionrepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationAssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularSimulationAssemblyPackage.Literals.SIMULATION_ASSEMBLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicModSimEntity> getBasicmodsimEntity() {
		if (basicmodsimEntity == null) {
			basicmodsimEntity = new EObjectResolvingEList<BasicModSimEntity>(BasicModSimEntity.class, this, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__BASICMODSIM_ENTITY);
		}
		return basicmodsimEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentWithInverseEList<Connection>(Connection.class, this, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__CONNECTION, AssemblyConnectionsPackage.CONNECTION__ASSEMBLY);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepository getInterfacerepository() {
		if (interfacerepository != null && interfacerepository.eIsProxy()) {
			InternalEObject oldInterfacerepository = (InternalEObject)interfacerepository;
			interfacerepository = (InterfaceRepository)eResolveProxy(oldInterfacerepository);
			if (interfacerepository != oldInterfacerepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__INTERFACEREPOSITORY, oldInterfacerepository, interfacerepository));
			}
		}
		return interfacerepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepository basicGetInterfacerepository() {
		return interfacerepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfacerepository(InterfaceRepository newInterfacerepository) {
		InterfaceRepository oldInterfacerepository = interfacerepository;
		interfacerepository = newInterfacerepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__INTERFACEREPOSITORY, oldInterfacerepository, interfacerepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOrientedStructuredAdditionInterface getObjectorientedstructuredadditioninterface() {
		if (objectorientedstructuredadditioninterface != null && objectorientedstructuredadditioninterface.eIsProxy()) {
			InternalEObject oldObjectorientedstructuredadditioninterface = (InternalEObject)objectorientedstructuredadditioninterface;
			objectorientedstructuredadditioninterface = (ObjectOrientedStructuredAdditionInterface)eResolveProxy(oldObjectorientedstructuredadditioninterface);
			if (objectorientedstructuredadditioninterface != oldObjectorientedstructuredadditioninterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE, oldObjectorientedstructuredadditioninterface, objectorientedstructuredadditioninterface));
			}
		}
		return objectorientedstructuredadditioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOrientedStructuredAdditionInterface basicGetObjectorientedstructuredadditioninterface() {
		return objectorientedstructuredadditioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectorientedstructuredadditioninterface(ObjectOrientedStructuredAdditionInterface newObjectorientedstructuredadditioninterface) {
		ObjectOrientedStructuredAdditionInterface oldObjectorientedstructuredadditioninterface = objectorientedstructuredadditioninterface;
		objectorientedstructuredadditioninterface = newObjectorientedstructuredadditioninterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE, oldObjectorientedstructuredadditioninterface, objectorientedstructuredadditioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<generalSimulationFunction> getGeneralsimulationfunctions() {
		if (generalsimulationfunctions == null) {
			generalsimulationfunctions = new EObjectContainmentEList<generalSimulationFunction>(generalSimulationFunction.class, this, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__GENERALSIMULATIONFUNCTIONS);
		}
		return generalsimulationfunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssembableEntity> getOnLevelAssembableEntities() {
		if (onLevelAssembableEntities == null) {
			onLevelAssembableEntities = new EObjectContainmentEList<AssembableEntity>(AssembableEntity.class, this, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ON_LEVEL_ASSEMBABLE_ENTITIES);
		}
		return onLevelAssembableEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionEnhanced> getAssembledSimulationVisibleData() {
		if (assembledSimulationVisibleData == null) {
			assembledSimulationVisibleData = new EObjectResolvingEList<AdditionEnhanced>(AdditionEnhanced.class, this, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ASSEMBLED_SIMULATION_VISIBLE_DATA);
		}
		return assembledSimulationVisibleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationDefinitionRepository getAdaptationdefinitionrepository() {
		if (adaptationdefinitionrepository != null && adaptationdefinitionrepository.eIsProxy()) {
			InternalEObject oldAdaptationdefinitionrepository = (InternalEObject)adaptationdefinitionrepository;
			adaptationdefinitionrepository = (AdaptationDefinitionRepository)eResolveProxy(oldAdaptationdefinitionrepository);
			if (adaptationdefinitionrepository != oldAdaptationdefinitionrepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ADAPTATIONDEFINITIONREPOSITORY, oldAdaptationdefinitionrepository, adaptationdefinitionrepository));
			}
		}
		return adaptationdefinitionrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationDefinitionRepository basicGetAdaptationdefinitionrepository() {
		return adaptationdefinitionrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationdefinitionrepository(AdaptationDefinitionRepository newAdaptationdefinitionrepository) {
		AdaptationDefinitionRepository oldAdaptationdefinitionrepository = adaptationdefinitionrepository;
		adaptationdefinitionrepository = newAdaptationdefinitionrepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ADAPTATIONDEFINITIONREPOSITORY, oldAdaptationdefinitionrepository, adaptationdefinitionrepository));
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__CONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnection()).basicAdd(otherEnd, msgs);
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__GENERALSIMULATIONFUNCTIONS:
				return ((InternalEList<?>)getGeneralsimulationfunctions()).basicRemove(otherEnd, msgs);
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ON_LEVEL_ASSEMBABLE_ENTITIES:
				return ((InternalEList<?>)getOnLevelAssembableEntities()).basicRemove(otherEnd, msgs);
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__BASICMODSIM_ENTITY:
				return getBasicmodsimEntity();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__CONNECTION:
				return getConnection();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__INTERFACEREPOSITORY:
				if (resolve) return getInterfacerepository();
				return basicGetInterfacerepository();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE:
				if (resolve) return getObjectorientedstructuredadditioninterface();
				return basicGetObjectorientedstructuredadditioninterface();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__GENERALSIMULATIONFUNCTIONS:
				return getGeneralsimulationfunctions();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ON_LEVEL_ASSEMBABLE_ENTITIES:
				return getOnLevelAssembableEntities();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ASSEMBLED_SIMULATION_VISIBLE_DATA:
				return getAssembledSimulationVisibleData();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ADAPTATIONDEFINITIONREPOSITORY:
				if (resolve) return getAdaptationdefinitionrepository();
				return basicGetAdaptationdefinitionrepository();
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__BASICMODSIM_ENTITY:
				getBasicmodsimEntity().clear();
				getBasicmodsimEntity().addAll((Collection<? extends BasicModSimEntity>)newValue);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__INTERFACEREPOSITORY:
				setInterfacerepository((InterfaceRepository)newValue);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE:
				setObjectorientedstructuredadditioninterface((ObjectOrientedStructuredAdditionInterface)newValue);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__GENERALSIMULATIONFUNCTIONS:
				getGeneralsimulationfunctions().clear();
				getGeneralsimulationfunctions().addAll((Collection<? extends generalSimulationFunction>)newValue);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ON_LEVEL_ASSEMBABLE_ENTITIES:
				getOnLevelAssembableEntities().clear();
				getOnLevelAssembableEntities().addAll((Collection<? extends AssembableEntity>)newValue);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ASSEMBLED_SIMULATION_VISIBLE_DATA:
				getAssembledSimulationVisibleData().clear();
				getAssembledSimulationVisibleData().addAll((Collection<? extends AdditionEnhanced>)newValue);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ADAPTATIONDEFINITIONREPOSITORY:
				setAdaptationdefinitionrepository((AdaptationDefinitionRepository)newValue);
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__BASICMODSIM_ENTITY:
				getBasicmodsimEntity().clear();
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__CONNECTION:
				getConnection().clear();
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__INTERFACEREPOSITORY:
				setInterfacerepository((InterfaceRepository)null);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE:
				setObjectorientedstructuredadditioninterface((ObjectOrientedStructuredAdditionInterface)null);
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__GENERALSIMULATIONFUNCTIONS:
				getGeneralsimulationfunctions().clear();
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ON_LEVEL_ASSEMBABLE_ENTITIES:
				getOnLevelAssembableEntities().clear();
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ASSEMBLED_SIMULATION_VISIBLE_DATA:
				getAssembledSimulationVisibleData().clear();
				return;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ADAPTATIONDEFINITIONREPOSITORY:
				setAdaptationdefinitionrepository((AdaptationDefinitionRepository)null);
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
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__BASICMODSIM_ENTITY:
				return basicmodsimEntity != null && !basicmodsimEntity.isEmpty();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__CONNECTION:
				return connection != null && !connection.isEmpty();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__INTERFACEREPOSITORY:
				return interfacerepository != null;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE:
				return objectorientedstructuredadditioninterface != null;
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__GENERALSIMULATIONFUNCTIONS:
				return generalsimulationfunctions != null && !generalsimulationfunctions.isEmpty();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ON_LEVEL_ASSEMBABLE_ENTITIES:
				return onLevelAssembableEntities != null && !onLevelAssembableEntities.isEmpty();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ASSEMBLED_SIMULATION_VISIBLE_DATA:
				return assembledSimulationVisibleData != null && !assembledSimulationVisibleData.isEmpty();
			case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__ADAPTATIONDEFINITIONREPOSITORY:
				return adaptationdefinitionrepository != null;
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
		if (baseClass == BasicModSimEntity.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Assembly.class) {
			switch (derivedFeatureID) {
				case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__BASICMODSIM_ENTITY: return ModularSimulationAssemblyPackage.ASSEMBLY__BASICMODSIM_ENTITY;
				case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__CONNECTION: return ModularSimulationAssemblyPackage.ASSEMBLY__CONNECTION;
				case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__INTERFACEREPOSITORY: return ModularSimulationAssemblyPackage.ASSEMBLY__INTERFACEREPOSITORY;
				case ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE: return ModularSimulationAssemblyPackage.ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE;
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
		if (baseClass == BasicModSimEntity.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Assembly.class) {
			switch (baseFeatureID) {
				case ModularSimulationAssemblyPackage.ASSEMBLY__BASICMODSIM_ENTITY: return ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__BASICMODSIM_ENTITY;
				case ModularSimulationAssemblyPackage.ASSEMBLY__CONNECTION: return ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__CONNECTION;
				case ModularSimulationAssemblyPackage.ASSEMBLY__INTERFACEREPOSITORY: return ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__INTERFACEREPOSITORY;
				case ModularSimulationAssemblyPackage.ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE: return ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SimulationAssemblyImpl
