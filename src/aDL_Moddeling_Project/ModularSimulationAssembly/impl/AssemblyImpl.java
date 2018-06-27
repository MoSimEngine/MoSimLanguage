/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.impl;

import aDL_Moddeling_Project.ModularEnvironment.ObjectOrientedStructuredAdditionInterface;

import aDL_Moddeling_Project.ModularSimulationAssembly.Assembly;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.AssemblyConnectionsPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyConnections.Connection;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceRepository;

import aDL_Moddeling_Project.ModularSimulationAssembly.BasicModSimEntity;
import aDL_Moddeling_Project.ModularSimulationAssembly.ModularSimulationAssemblyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssemblyImpl#getBasicmodsimEntity <em>Basicmodsim Entity</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssemblyImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssemblyImpl#getInterfacerepository <em>Interfacerepository</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.impl.AssemblyImpl#getObjectorientedstructuredadditioninterface <em>Objectorientedstructuredadditioninterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssemblyImpl extends BasicModSimEntityImpl implements Assembly {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularSimulationAssemblyPackage.Literals.ASSEMBLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicModSimEntity> getBasicmodsimEntity() {
		if (basicmodsimEntity == null) {
			basicmodsimEntity = new EObjectResolvingEList<BasicModSimEntity>(BasicModSimEntity.class, this, ModularSimulationAssemblyPackage.ASSEMBLY__BASICMODSIM_ENTITY);
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
			connection = new EObjectContainmentWithInverseEList<Connection>(Connection.class, this, ModularSimulationAssemblyPackage.ASSEMBLY__CONNECTION, AssemblyConnectionsPackage.CONNECTION__ASSEMBLY);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularSimulationAssemblyPackage.ASSEMBLY__INTERFACEREPOSITORY, oldInterfacerepository, interfacerepository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.ASSEMBLY__INTERFACEREPOSITORY, oldInterfacerepository, interfacerepository));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularSimulationAssemblyPackage.ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE, oldObjectorientedstructuredadditioninterface, objectorientedstructuredadditioninterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModularSimulationAssemblyPackage.ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE, oldObjectorientedstructuredadditioninterface, objectorientedstructuredadditioninterface));
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
			case ModularSimulationAssemblyPackage.ASSEMBLY__CONNECTION:
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
			case ModularSimulationAssemblyPackage.ASSEMBLY__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
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
			case ModularSimulationAssemblyPackage.ASSEMBLY__BASICMODSIM_ENTITY:
				return getBasicmodsimEntity();
			case ModularSimulationAssemblyPackage.ASSEMBLY__CONNECTION:
				return getConnection();
			case ModularSimulationAssemblyPackage.ASSEMBLY__INTERFACEREPOSITORY:
				if (resolve) return getInterfacerepository();
				return basicGetInterfacerepository();
			case ModularSimulationAssemblyPackage.ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE:
				if (resolve) return getObjectorientedstructuredadditioninterface();
				return basicGetObjectorientedstructuredadditioninterface();
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
			case ModularSimulationAssemblyPackage.ASSEMBLY__BASICMODSIM_ENTITY:
				getBasicmodsimEntity().clear();
				getBasicmodsimEntity().addAll((Collection<? extends BasicModSimEntity>)newValue);
				return;
			case ModularSimulationAssemblyPackage.ASSEMBLY__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case ModularSimulationAssemblyPackage.ASSEMBLY__INTERFACEREPOSITORY:
				setInterfacerepository((InterfaceRepository)newValue);
				return;
			case ModularSimulationAssemblyPackage.ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE:
				setObjectorientedstructuredadditioninterface((ObjectOrientedStructuredAdditionInterface)newValue);
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
			case ModularSimulationAssemblyPackage.ASSEMBLY__BASICMODSIM_ENTITY:
				getBasicmodsimEntity().clear();
				return;
			case ModularSimulationAssemblyPackage.ASSEMBLY__CONNECTION:
				getConnection().clear();
				return;
			case ModularSimulationAssemblyPackage.ASSEMBLY__INTERFACEREPOSITORY:
				setInterfacerepository((InterfaceRepository)null);
				return;
			case ModularSimulationAssemblyPackage.ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE:
				setObjectorientedstructuredadditioninterface((ObjectOrientedStructuredAdditionInterface)null);
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
			case ModularSimulationAssemblyPackage.ASSEMBLY__BASICMODSIM_ENTITY:
				return basicmodsimEntity != null && !basicmodsimEntity.isEmpty();
			case ModularSimulationAssemblyPackage.ASSEMBLY__CONNECTION:
				return connection != null && !connection.isEmpty();
			case ModularSimulationAssemblyPackage.ASSEMBLY__INTERFACEREPOSITORY:
				return interfacerepository != null;
			case ModularSimulationAssemblyPackage.ASSEMBLY__OBJECTORIENTEDSTRUCTUREDADDITIONINTERFACE:
				return objectorientedstructuredadditioninterface != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyImpl
