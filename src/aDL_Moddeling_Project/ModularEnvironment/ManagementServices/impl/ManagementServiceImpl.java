/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.Coordinator;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MSEPropertyAdditionContainer;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementService;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceInterface;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServiceSupportEntity;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;

import aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Management Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceImpl#getManagementservice <em>Managementservice</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceImpl#getMsefacility <em>Msefacility</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceImpl#getManagementservicesupportentity <em>Managementservicesupportentity</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceImpl#getManagementserviceinterface <em>Managementserviceinterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ManagementServiceImpl#getMsepropertyadditioncontainer <em>Msepropertyadditioncontainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagementServiceImpl extends EntityImpl implements ManagementService {
	/**
	 * The cached value of the '{@link #getManagementservice() <em>Managementservice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementservice()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagementService> managementservice;

	/**
	 * The cached value of the '{@link #getManagementservicesupportentity() <em>Managementservicesupportentity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementservicesupportentity()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagementServiceSupportEntity> managementservicesupportentity;

	/**
	 * The cached value of the '{@link #getManagementserviceinterface() <em>Managementserviceinterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementserviceinterface()
	 * @generated
	 * @ordered
	 */
	protected ManagementServiceInterface managementserviceinterface;

	/**
	 * The cached value of the '{@link #getMsepropertyadditioncontainer() <em>Msepropertyadditioncontainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsepropertyadditioncontainer()
	 * @generated
	 * @ordered
	 */
	protected EList<MSEPropertyAdditionContainer> msepropertyadditioncontainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementServicesPackage.Literals.MANAGEMENT_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagementService> getManagementservice() {
		if (managementservice == null) {
			managementservice = new EObjectResolvingEList<ManagementService>(ManagementService.class, this, ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICE);
		}
		return managementservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinator getMsefacility() {
		if (eContainerFeatureID() != ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY) return null;
		return (Coordinator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsefacility(Coordinator newMsefacility, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMsefacility, ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsefacility(Coordinator newMsefacility) {
		if (newMsefacility != eInternalContainer() || (eContainerFeatureID() != ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY && newMsefacility != null)) {
			if (EcoreUtil.isAncestor(this, newMsefacility))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMsefacility != null)
				msgs = ((InternalEObject)newMsefacility).eInverseAdd(this, ModularEnvironmentPackage.COORDINATOR__MANAGEMENTSERVICE, Coordinator.class, msgs);
			msgs = basicSetMsefacility(newMsefacility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY, newMsefacility, newMsefacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagementServiceSupportEntity> getManagementservicesupportentity() {
		if (managementservicesupportentity == null) {
			managementservicesupportentity = new EObjectContainmentEList<ManagementServiceSupportEntity>(ManagementServiceSupportEntity.class, this, ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICESUPPORTENTITY);
		}
		return managementservicesupportentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementServiceInterface getManagementserviceinterface() {
		return managementserviceinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagementserviceinterface(ManagementServiceInterface newManagementserviceinterface, NotificationChain msgs) {
		ManagementServiceInterface oldManagementserviceinterface = managementserviceinterface;
		managementserviceinterface = newManagementserviceinterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE, oldManagementserviceinterface, newManagementserviceinterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagementserviceinterface(ManagementServiceInterface newManagementserviceinterface) {
		if (newManagementserviceinterface != managementserviceinterface) {
			NotificationChain msgs = null;
			if (managementserviceinterface != null)
				msgs = ((InternalEObject)managementserviceinterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE, null, msgs);
			if (newManagementserviceinterface != null)
				msgs = ((InternalEObject)newManagementserviceinterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE, null, msgs);
			msgs = basicSetManagementserviceinterface(newManagementserviceinterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE, newManagementserviceinterface, newManagementserviceinterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MSEPropertyAdditionContainer> getMsepropertyadditioncontainer() {
		if (msepropertyadditioncontainer == null) {
			msepropertyadditioncontainer = new EObjectContainmentEList<MSEPropertyAdditionContainer>(MSEPropertyAdditionContainer.class, this, ManagementServicesPackage.MANAGEMENT_SERVICE__MSEPROPERTYADDITIONCONTAINER);
		}
		return msepropertyadditioncontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMsefacility((Coordinator)otherEnd, msgs);
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY:
				return basicSetMsefacility(null, msgs);
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICESUPPORTENTITY:
				return ((InternalEList<?>)getManagementservicesupportentity()).basicRemove(otherEnd, msgs);
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE:
				return basicSetManagementserviceinterface(null, msgs);
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEPROPERTYADDITIONCONTAINER:
				return ((InternalEList<?>)getMsepropertyadditioncontainer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY:
				return eInternalContainer().eInverseRemove(this, ModularEnvironmentPackage.COORDINATOR__MANAGEMENTSERVICE, Coordinator.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICE:
				return getManagementservice();
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY:
				return getMsefacility();
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICESUPPORTENTITY:
				return getManagementservicesupportentity();
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE:
				return getManagementserviceinterface();
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEPROPERTYADDITIONCONTAINER:
				return getMsepropertyadditioncontainer();
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICE:
				getManagementservice().clear();
				getManagementservice().addAll((Collection<? extends ManagementService>)newValue);
				return;
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY:
				setMsefacility((Coordinator)newValue);
				return;
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICESUPPORTENTITY:
				getManagementservicesupportentity().clear();
				getManagementservicesupportentity().addAll((Collection<? extends ManagementServiceSupportEntity>)newValue);
				return;
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE:
				setManagementserviceinterface((ManagementServiceInterface)newValue);
				return;
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEPROPERTYADDITIONCONTAINER:
				getMsepropertyadditioncontainer().clear();
				getMsepropertyadditioncontainer().addAll((Collection<? extends MSEPropertyAdditionContainer>)newValue);
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICE:
				getManagementservice().clear();
				return;
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY:
				setMsefacility((Coordinator)null);
				return;
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICESUPPORTENTITY:
				getManagementservicesupportentity().clear();
				return;
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE:
				setManagementserviceinterface((ManagementServiceInterface)null);
				return;
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEPROPERTYADDITIONCONTAINER:
				getMsepropertyadditioncontainer().clear();
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
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICE:
				return managementservice != null && !managementservice.isEmpty();
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEFACILITY:
				return getMsefacility() != null;
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICESUPPORTENTITY:
				return managementservicesupportentity != null && !managementservicesupportentity.isEmpty();
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MANAGEMENTSERVICEINTERFACE:
				return managementserviceinterface != null;
			case ManagementServicesPackage.MANAGEMENT_SERVICE__MSEPROPERTYADDITIONCONTAINER:
				return msepropertyadditioncontainer != null && !msepropertyadditioncontainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManagementServiceImpl
