/**
 */
package aDL_Moddeling_Project.ModularEnvironment.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer;

import aDL_Moddeling_Project.ModularEnvironment.AdditionInterface;
import aDL_Moddeling_Project.ModularEnvironment.Coordinator;
import aDL_Moddeling_Project.ModularEnvironment.CoordinatorEntity;
import aDL_Moddeling_Project.ModularEnvironment.MSEServiceInterface;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;

import aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage;

import aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.Connector;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorImpl#getDataadditioninterface <em>Dataadditioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorImpl#getManagementservice <em>Managementservice</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorImpl#getMseserviceinterface <em>Mseserviceinterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.impl.CoordinatorImpl#getDataspecificationcontainer <em>Dataspecificationcontainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinatorImpl extends EntityImpl implements Coordinator {
	/**
	 * The cached value of the '{@link #getDataadditioninterface() <em>Dataadditioninterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataadditioninterface()
	 * @generated
	 * @ordered
	 */
	protected AdditionInterface dataadditioninterface;

	/**
	 * The cached value of the '{@link #getManagementservice() <em>Managementservice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementservice()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagementService> managementservice;

	/**
	 * The cached value of the '{@link #getMseserviceinterface() <em>Mseserviceinterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMseserviceinterface()
	 * @generated
	 * @ordered
	 */
	protected MSEServiceInterface mseserviceinterface;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connector;

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
	protected CoordinatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularEnvironmentPackage.Literals.COORDINATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionInterface getDataadditioninterface() {
		return dataadditioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataadditioninterface(AdditionInterface newDataadditioninterface, NotificationChain msgs) {
		AdditionInterface oldDataadditioninterface = dataadditioninterface;
		dataadditioninterface = newDataadditioninterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.COORDINATOR__DATAADDITIONINTERFACE, oldDataadditioninterface, newDataadditioninterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataadditioninterface(AdditionInterface newDataadditioninterface) {
		if (newDataadditioninterface != dataadditioninterface) {
			NotificationChain msgs = null;
			if (dataadditioninterface != null)
				msgs = ((InternalEObject)dataadditioninterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.COORDINATOR__DATAADDITIONINTERFACE, null, msgs);
			if (newDataadditioninterface != null)
				msgs = ((InternalEObject)newDataadditioninterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.COORDINATOR__DATAADDITIONINTERFACE, null, msgs);
			msgs = basicSetDataadditioninterface(newDataadditioninterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.COORDINATOR__DATAADDITIONINTERFACE, newDataadditioninterface, newDataadditioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagementService> getManagementservice() {
		if (managementservice == null) {
			managementservice = new EObjectContainmentWithInverseEList<ManagementService>(ManagementService.class, this, ModularEnvironmentPackage.COORDINATOR__MANAGEMENTSERVICE, ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY);
		}
		return managementservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSEServiceInterface getMseserviceinterface() {
		return mseserviceinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMseserviceinterface(MSEServiceInterface newMseserviceinterface, NotificationChain msgs) {
		MSEServiceInterface oldMseserviceinterface = mseserviceinterface;
		mseserviceinterface = newMseserviceinterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.COORDINATOR__MSESERVICEINTERFACE, oldMseserviceinterface, newMseserviceinterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMseserviceinterface(MSEServiceInterface newMseserviceinterface) {
		if (newMseserviceinterface != mseserviceinterface) {
			NotificationChain msgs = null;
			if (mseserviceinterface != null)
				msgs = ((InternalEObject)mseserviceinterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.COORDINATOR__MSESERVICEINTERFACE, null, msgs);
			if (newMseserviceinterface != null)
				msgs = ((InternalEObject)newMseserviceinterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.COORDINATOR__MSESERVICEINTERFACE, null, msgs);
			msgs = basicSetMseserviceinterface(newMseserviceinterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.COORDINATOR__MSESERVICEINTERFACE, newMseserviceinterface, newMseserviceinterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<Connector>(Connector.class, this, ModularEnvironmentPackage.COORDINATOR__CONNECTOR);
		}
		return connector;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.COORDINATOR__DATASPECIFICATIONCONTAINER, oldDataspecificationcontainer, newDataspecificationcontainer);
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
				msgs = ((InternalEObject)dataspecificationcontainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.COORDINATOR__DATASPECIFICATIONCONTAINER, null, msgs);
			if (newDataspecificationcontainer != null)
				msgs = ((InternalEObject)newDataspecificationcontainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.COORDINATOR__DATASPECIFICATIONCONTAINER, null, msgs);
			msgs = basicSetDataspecificationcontainer(newDataspecificationcontainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.COORDINATOR__DATASPECIFICATIONCONTAINER, newDataspecificationcontainer, newDataspecificationcontainer));
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
			case ModularEnvironmentPackage.COORDINATOR__MANAGEMENTSERVICE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getManagementservice()).basicAdd(otherEnd, msgs);
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
			case ModularEnvironmentPackage.COORDINATOR__DATAADDITIONINTERFACE:
				return basicSetDataadditioninterface(null, msgs);
			case ModularEnvironmentPackage.COORDINATOR__MANAGEMENTSERVICE:
				return ((InternalEList<?>)getManagementservice()).basicRemove(otherEnd, msgs);
			case ModularEnvironmentPackage.COORDINATOR__MSESERVICEINTERFACE:
				return basicSetMseserviceinterface(null, msgs);
			case ModularEnvironmentPackage.COORDINATOR__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case ModularEnvironmentPackage.COORDINATOR__DATASPECIFICATIONCONTAINER:
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
			case ModularEnvironmentPackage.COORDINATOR__DATAADDITIONINTERFACE:
				return getDataadditioninterface();
			case ModularEnvironmentPackage.COORDINATOR__MANAGEMENTSERVICE:
				return getManagementservice();
			case ModularEnvironmentPackage.COORDINATOR__MSESERVICEINTERFACE:
				return getMseserviceinterface();
			case ModularEnvironmentPackage.COORDINATOR__CONNECTOR:
				return getConnector();
			case ModularEnvironmentPackage.COORDINATOR__DATASPECIFICATIONCONTAINER:
				return getDataspecificationcontainer();
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
			case ModularEnvironmentPackage.COORDINATOR__DATAADDITIONINTERFACE:
				setDataadditioninterface((AdditionInterface)newValue);
				return;
			case ModularEnvironmentPackage.COORDINATOR__MANAGEMENTSERVICE:
				getManagementservice().clear();
				getManagementservice().addAll((Collection<? extends ManagementService>)newValue);
				return;
			case ModularEnvironmentPackage.COORDINATOR__MSESERVICEINTERFACE:
				setMseserviceinterface((MSEServiceInterface)newValue);
				return;
			case ModularEnvironmentPackage.COORDINATOR__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case ModularEnvironmentPackage.COORDINATOR__DATASPECIFICATIONCONTAINER:
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
			case ModularEnvironmentPackage.COORDINATOR__DATAADDITIONINTERFACE:
				setDataadditioninterface((AdditionInterface)null);
				return;
			case ModularEnvironmentPackage.COORDINATOR__MANAGEMENTSERVICE:
				getManagementservice().clear();
				return;
			case ModularEnvironmentPackage.COORDINATOR__MSESERVICEINTERFACE:
				setMseserviceinterface((MSEServiceInterface)null);
				return;
			case ModularEnvironmentPackage.COORDINATOR__CONNECTOR:
				getConnector().clear();
				return;
			case ModularEnvironmentPackage.COORDINATOR__DATASPECIFICATIONCONTAINER:
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
			case ModularEnvironmentPackage.COORDINATOR__DATAADDITIONINTERFACE:
				return dataadditioninterface != null;
			case ModularEnvironmentPackage.COORDINATOR__MANAGEMENTSERVICE:
				return managementservice != null && !managementservice.isEmpty();
			case ModularEnvironmentPackage.COORDINATOR__MSESERVICEINTERFACE:
				return mseserviceinterface != null;
			case ModularEnvironmentPackage.COORDINATOR__CONNECTOR:
				return connector != null && !connector.isEmpty();
			case ModularEnvironmentPackage.COORDINATOR__DATASPECIFICATIONCONTAINER:
				return dataspecificationcontainer != null;
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
		if (baseClass == CoordinatorEntity.class) {
			switch (derivedFeatureID) {
				case ModularEnvironmentPackage.COORDINATOR__DATAADDITIONINTERFACE: return ModularEnvironmentPackage.COORDINATOR_ENTITY__DATAADDITIONINTERFACE;
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
		if (baseClass == CoordinatorEntity.class) {
			switch (baseFeatureID) {
				case ModularEnvironmentPackage.COORDINATOR_ENTITY__DATAADDITIONINTERFACE: return ModularEnvironmentPackage.COORDINATOR__DATAADDITIONINTERFACE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CoordinatorImpl
