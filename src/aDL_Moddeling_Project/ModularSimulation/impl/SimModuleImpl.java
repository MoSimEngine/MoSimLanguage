/**
 */
package aDL_Moddeling_Project.ModularSimulation.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer;

import aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage;
import aDL_Moddeling_Project.ModularSimulation.SimModule;
import aDL_Moddeling_Project.ModularSimulation.SimModuleDescription;

import aDL_Moddeling_Project.ModularSimulationAssembly.Connector;
import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.SimulationAssemblyEntity;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sim Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.impl.SimModuleImpl#getSimmoduledescription <em>Simmoduledescription</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.impl.SimModuleImpl#getBasesimulationassemblyentity <em>Basesimulationassemblyentity</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.impl.SimModuleImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.impl.SimModuleImpl#getDataspecificationcontainer <em>Dataspecificationcontainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimModuleImpl extends EntityImpl implements SimModule {
	/**
	 * The cached value of the '{@link #getSimmoduledescription() <em>Simmoduledescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimmoduledescription()
	 * @generated
	 * @ordered
	 */
	protected SimModuleDescription simmoduledescription;

	/**
	 * The cached value of the '{@link #getBasesimulationassemblyentity() <em>Basesimulationassemblyentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasesimulationassemblyentity()
	 * @generated
	 * @ordered
	 */
	protected SimulationAssemblyEntity basesimulationassemblyentity;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector connector;

	/**
	 * The cached value of the '{@link #getDataspecificationcontainer() <em>Dataspecificationcontainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataspecificationcontainer()
	 * @generated
	 * @ordered
	 */
	protected DataSpecificationContainer dataspecificationcontainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularSimulationPackage.Literals.SIM_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimModuleDescription getSimmoduledescription() {
		return simmoduledescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimmoduledescription(SimModuleDescription newSimmoduledescription, NotificationChain msgs) {
		SimModuleDescription oldSimmoduledescription = simmoduledescription;
		simmoduledescription = newSimmoduledescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE__SIMMODULEDESCRIPTION, oldSimmoduledescription, newSimmoduledescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimmoduledescription(SimModuleDescription newSimmoduledescription) {
		if (newSimmoduledescription != simmoduledescription) {
			NotificationChain msgs = null;
			if (simmoduledescription != null)
				msgs = ((InternalEObject)simmoduledescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularSimulationPackage.SIM_MODULE__SIMMODULEDESCRIPTION, null, msgs);
			if (newSimmoduledescription != null)
				msgs = ((InternalEObject)newSimmoduledescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularSimulationPackage.SIM_MODULE__SIMMODULEDESCRIPTION, null, msgs);
			msgs = basicSetSimmoduledescription(newSimmoduledescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE__SIMMODULEDESCRIPTION, newSimmoduledescription, newSimmoduledescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationAssemblyEntity getBasesimulationassemblyentity() {
		if (basesimulationassemblyentity != null && basesimulationassemblyentity.eIsProxy()) {
			InternalEObject oldBasesimulationassemblyentity = (InternalEObject)basesimulationassemblyentity;
			basesimulationassemblyentity = (SimulationAssemblyEntity)eResolveProxy(oldBasesimulationassemblyentity);
			if (basesimulationassemblyentity != oldBasesimulationassemblyentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY, oldBasesimulationassemblyentity, basesimulationassemblyentity));
			}
		}
		return basesimulationassemblyentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationAssemblyEntity basicGetBasesimulationassemblyentity() {
		return basesimulationassemblyentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasesimulationassemblyentity(SimulationAssemblyEntity newBasesimulationassemblyentity, NotificationChain msgs) {
		SimulationAssemblyEntity oldBasesimulationassemblyentity = basesimulationassemblyentity;
		basesimulationassemblyentity = newBasesimulationassemblyentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY, oldBasesimulationassemblyentity, newBasesimulationassemblyentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasesimulationassemblyentity(SimulationAssemblyEntity newBasesimulationassemblyentity) {
		if (newBasesimulationassemblyentity != basesimulationassemblyentity) {
			NotificationChain msgs = null;
			if (basesimulationassemblyentity != null)
				msgs = ((InternalEObject)basesimulationassemblyentity).eInverseRemove(this, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE, SimulationAssemblyEntity.class, msgs);
			if (newBasesimulationassemblyentity != null)
				msgs = ((InternalEObject)newBasesimulationassemblyentity).eInverseAdd(this, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE, SimulationAssemblyEntity.class, msgs);
			msgs = basicSetBasesimulationassemblyentity(newBasesimulationassemblyentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY, newBasesimulationassemblyentity, newBasesimulationassemblyentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs) {
		Connector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE__CONNECTOR, oldConnector, newConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		if (newConnector != connector) {
			NotificationChain msgs = null;
			if (connector != null)
				msgs = ((InternalEObject)connector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularSimulationPackage.SIM_MODULE__CONNECTOR, null, msgs);
			if (newConnector != null)
				msgs = ((InternalEObject)newConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularSimulationPackage.SIM_MODULE__CONNECTOR, null, msgs);
			msgs = basicSetConnector(newConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE__CONNECTOR, newConnector, newConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpecificationContainer getDataspecificationcontainer() {
		return dataspecificationcontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataspecificationcontainer(DataSpecificationContainer newDataspecificationcontainer, NotificationChain msgs) {
		DataSpecificationContainer oldDataspecificationcontainer = dataspecificationcontainer;
		dataspecificationcontainer = newDataspecificationcontainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE__DATASPECIFICATIONCONTAINER, oldDataspecificationcontainer, newDataspecificationcontainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataspecificationcontainer(DataSpecificationContainer newDataspecificationcontainer) {
		if (newDataspecificationcontainer != dataspecificationcontainer) {
			NotificationChain msgs = null;
			if (dataspecificationcontainer != null)
				msgs = ((InternalEObject)dataspecificationcontainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularSimulationPackage.SIM_MODULE__DATASPECIFICATIONCONTAINER, null, msgs);
			if (newDataspecificationcontainer != null)
				msgs = ((InternalEObject)newDataspecificationcontainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularSimulationPackage.SIM_MODULE__DATASPECIFICATIONCONTAINER, null, msgs);
			msgs = basicSetDataspecificationcontainer(newDataspecificationcontainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE__DATASPECIFICATIONCONTAINER, newDataspecificationcontainer, newDataspecificationcontainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY:
				if (basesimulationassemblyentity != null)
					msgs = ((InternalEObject)basesimulationassemblyentity).eInverseRemove(this, ModularSimulationAssemblyPackage.SIMULATION_ASSEMBLY_ENTITY__SIMMODULE, SimulationAssemblyEntity.class, msgs);
				return basicSetBasesimulationassemblyentity((SimulationAssemblyEntity)otherEnd, msgs);
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
			case ModularSimulationPackage.SIM_MODULE__SIMMODULEDESCRIPTION:
				return basicSetSimmoduledescription(null, msgs);
			case ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY:
				return basicSetBasesimulationassemblyentity(null, msgs);
			case ModularSimulationPackage.SIM_MODULE__CONNECTOR:
				return basicSetConnector(null, msgs);
			case ModularSimulationPackage.SIM_MODULE__DATASPECIFICATIONCONTAINER:
				return basicSetDataspecificationcontainer(null, msgs);
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
			case ModularSimulationPackage.SIM_MODULE__SIMMODULEDESCRIPTION:
				return getSimmoduledescription();
			case ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY:
				if (resolve) return getBasesimulationassemblyentity();
				return basicGetBasesimulationassemblyentity();
			case ModularSimulationPackage.SIM_MODULE__CONNECTOR:
				return getConnector();
			case ModularSimulationPackage.SIM_MODULE__DATASPECIFICATIONCONTAINER:
				return getDataspecificationcontainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModularSimulationPackage.SIM_MODULE__SIMMODULEDESCRIPTION:
				setSimmoduledescription((SimModuleDescription)newValue);
				return;
			case ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY:
				setBasesimulationassemblyentity((SimulationAssemblyEntity)newValue);
				return;
			case ModularSimulationPackage.SIM_MODULE__CONNECTOR:
				setConnector((Connector)newValue);
				return;
			case ModularSimulationPackage.SIM_MODULE__DATASPECIFICATIONCONTAINER:
				setDataspecificationcontainer((DataSpecificationContainer)newValue);
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
			case ModularSimulationPackage.SIM_MODULE__SIMMODULEDESCRIPTION:
				setSimmoduledescription((SimModuleDescription)null);
				return;
			case ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY:
				setBasesimulationassemblyentity((SimulationAssemblyEntity)null);
				return;
			case ModularSimulationPackage.SIM_MODULE__CONNECTOR:
				setConnector((Connector)null);
				return;
			case ModularSimulationPackage.SIM_MODULE__DATASPECIFICATIONCONTAINER:
				setDataspecificationcontainer((DataSpecificationContainer)null);
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
			case ModularSimulationPackage.SIM_MODULE__SIMMODULEDESCRIPTION:
				return simmoduledescription != null;
			case ModularSimulationPackage.SIM_MODULE__BASESIMULATIONASSEMBLYENTITY:
				return basesimulationassemblyentity != null;
			case ModularSimulationPackage.SIM_MODULE__CONNECTOR:
				return connector != null;
			case ModularSimulationPackage.SIM_MODULE__DATASPECIFICATIONCONTAINER:
				return dataspecificationcontainer != null;
		}
		return super.eIsSet(featureID);
	}

} //SimModuleImpl
