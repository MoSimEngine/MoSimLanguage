/**
 */
package aDL_Moddeling_Project.ModularSimulation.impl;

import aDL_Moddeling_Project.DataRepresentation.SimulationData;

import aDL_Moddeling_Project.ModularSimulation.ModularSimulationPackage;
import aDL_Moddeling_Project.ModularSimulation.SimModuleDescription;
import aDL_Moddeling_Project.ModularSimulation.SimulationTimeInformation;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sim Module Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.impl.SimModuleDescriptionImpl#getSimulationDescription <em>Simulation Description</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.impl.SimModuleDescriptionImpl#getSimulationtimeinformation <em>Simulationtimeinformation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulation.impl.SimModuleDescriptionImpl#getSimulationdata <em>Simulationdata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimModuleDescriptionImpl extends EntityImpl implements SimModuleDescription {
	/**
	 * The default value of the '{@link #getSimulationDescription() <em>Simulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMULATION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimulationDescription() <em>Simulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationDescription()
	 * @generated
	 * @ordered
	 */
	protected String simulationDescription = SIMULATION_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Simulation Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean simulationDescriptionESet;

	/**
	 * The cached value of the '{@link #getSimulationtimeinformation() <em>Simulationtimeinformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationtimeinformation()
	 * @generated
	 * @ordered
	 */
	protected SimulationTimeInformation simulationtimeinformation;

	/**
	 * The cached value of the '{@link #getSimulationdata() <em>Simulationdata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationdata()
	 * @generated
	 * @ordered
	 */
	protected SimulationData simulationdata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimModuleDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularSimulationPackage.Literals.SIM_MODULE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimulationDescription() {
		return simulationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationDescription(String newSimulationDescription) {
		String oldSimulationDescription = simulationDescription;
		simulationDescription = newSimulationDescription;
		boolean oldSimulationDescriptionESet = simulationDescriptionESet;
		simulationDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATION_DESCRIPTION, oldSimulationDescription, simulationDescription, !oldSimulationDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSimulationDescription() {
		String oldSimulationDescription = simulationDescription;
		boolean oldSimulationDescriptionESet = simulationDescriptionESet;
		simulationDescription = SIMULATION_DESCRIPTION_EDEFAULT;
		simulationDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATION_DESCRIPTION, oldSimulationDescription, SIMULATION_DESCRIPTION_EDEFAULT, oldSimulationDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSimulationDescription() {
		return simulationDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationTimeInformation getSimulationtimeinformation() {
		return simulationtimeinformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulationtimeinformation(SimulationTimeInformation newSimulationtimeinformation, NotificationChain msgs) {
		SimulationTimeInformation oldSimulationtimeinformation = simulationtimeinformation;
		simulationtimeinformation = newSimulationtimeinformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONTIMEINFORMATION, oldSimulationtimeinformation, newSimulationtimeinformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationtimeinformation(SimulationTimeInformation newSimulationtimeinformation) {
		if (newSimulationtimeinformation != simulationtimeinformation) {
			NotificationChain msgs = null;
			if (simulationtimeinformation != null)
				msgs = ((InternalEObject)simulationtimeinformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONTIMEINFORMATION, null, msgs);
			if (newSimulationtimeinformation != null)
				msgs = ((InternalEObject)newSimulationtimeinformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONTIMEINFORMATION, null, msgs);
			msgs = basicSetSimulationtimeinformation(newSimulationtimeinformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONTIMEINFORMATION, newSimulationtimeinformation, newSimulationtimeinformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationData getSimulationdata() {
		return simulationdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulationdata(SimulationData newSimulationdata, NotificationChain msgs) {
		SimulationData oldSimulationdata = simulationdata;
		simulationdata = newSimulationdata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONDATA, oldSimulationdata, newSimulationdata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationdata(SimulationData newSimulationdata) {
		if (newSimulationdata != simulationdata) {
			NotificationChain msgs = null;
			if (simulationdata != null)
				msgs = ((InternalEObject)simulationdata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONDATA, null, msgs);
			if (newSimulationdata != null)
				msgs = ((InternalEObject)newSimulationdata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONDATA, null, msgs);
			msgs = basicSetSimulationdata(newSimulationdata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONDATA, newSimulationdata, newSimulationdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONTIMEINFORMATION:
				return basicSetSimulationtimeinformation(null, msgs);
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONDATA:
				return basicSetSimulationdata(null, msgs);
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
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATION_DESCRIPTION:
				return getSimulationDescription();
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONTIMEINFORMATION:
				return getSimulationtimeinformation();
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONDATA:
				return getSimulationdata();
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
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATION_DESCRIPTION:
				setSimulationDescription((String)newValue);
				return;
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONTIMEINFORMATION:
				setSimulationtimeinformation((SimulationTimeInformation)newValue);
				return;
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONDATA:
				setSimulationdata((SimulationData)newValue);
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
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATION_DESCRIPTION:
				unsetSimulationDescription();
				return;
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONTIMEINFORMATION:
				setSimulationtimeinformation((SimulationTimeInformation)null);
				return;
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONDATA:
				setSimulationdata((SimulationData)null);
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
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATION_DESCRIPTION:
				return isSetSimulationDescription();
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONTIMEINFORMATION:
				return simulationtimeinformation != null;
			case ModularSimulationPackage.SIM_MODULE_DESCRIPTION__SIMULATIONDATA:
				return simulationdata != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (simulationDescription: ");
		if (simulationDescriptionESet) result.append(simulationDescription); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SimModuleDescriptionImpl
