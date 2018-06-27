/**
 */
package aDL_Moddeling_Project.ModularSimulation;

import aDL_Moddeling_Project.basic.BasicPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aDL_Moddeling_Project.ModularSimulation.ModularSimulationFactory
 * @model kind="package"
 * @generated
 */
public interface ModularSimulationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModularSimulation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.Modularization.ModularSimulation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModularSimulation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModularSimulationPackage eINSTANCE = aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl.init();

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulation.impl.SimModuleImpl <em>Sim Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulation.impl.SimModuleImpl
	 * @see aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl#getSimModule()
	 * @generated
	 */
	int SIM_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Simmoduledescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE__SIMMODULEDESCRIPTION = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Basesimulationassemblyentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE__BASESIMULATIONASSEMBLYENTITY = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE__CONNECTOR = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dataspecificationcontainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE__DATASPECIFICATIONCONTAINER = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sim Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sim Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulation.impl.SimModuleDescriptionImpl <em>Sim Module Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulation.impl.SimModuleDescriptionImpl
	 * @see aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl#getSimModuleDescription()
	 * @generated
	 */
	int SIM_MODULE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE_DESCRIPTION__ID = BasicPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE_DESCRIPTION__NAME = BasicPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Simulation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE_DESCRIPTION__SIMULATION_DESCRIPTION = BasicPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simulationtimeinformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE_DESCRIPTION__SIMULATIONTIMEINFORMATION = BasicPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Simulationdata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE_DESCRIPTION__SIMULATIONDATA = BasicPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sim Module Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE_DESCRIPTION_FEATURE_COUNT = BasicPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sim Module Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODULE_DESCRIPTION_OPERATION_COUNT = BasicPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulation.impl.SimulationTimeInformationImpl <em>Simulation Time Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulation.impl.SimulationTimeInformationImpl
	 * @see aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl#getSimulationTimeInformation()
	 * @generated
	 */
	int SIMULATION_TIME_INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Simulation Time Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIME_INFORMATION__SIMULATION_TIME_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Simulation Time Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIME_INFORMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Simulation Time Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TIME_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aDL_Moddeling_Project.ModularSimulation.TimeType <em>Time Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aDL_Moddeling_Project.ModularSimulation.TimeType
	 * @see aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulation.SimModule <em>Sim Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Module</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.SimModule
	 * @generated
	 */
	EClass getSimModule();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getSimmoduledescription <em>Simmoduledescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simmoduledescription</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.SimModule#getSimmoduledescription()
	 * @see #getSimModule()
	 * @generated
	 */
	EReference getSimModule_Simmoduledescription();

	/**
	 * Returns the meta object for the reference '{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getBasesimulationassemblyentity <em>Basesimulationassemblyentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basesimulationassemblyentity</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.SimModule#getBasesimulationassemblyentity()
	 * @see #getSimModule()
	 * @generated
	 */
	EReference getSimModule_Basesimulationassemblyentity();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.SimModule#getConnector()
	 * @see #getSimModule()
	 * @generated
	 */
	EReference getSimModule_Connector();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularSimulation.SimModule#getDataspecificationcontainer <em>Dataspecificationcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataspecificationcontainer</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.SimModule#getDataspecificationcontainer()
	 * @see #getSimModule()
	 * @generated
	 */
	EReference getSimModule_Dataspecificationcontainer();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription <em>Sim Module Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Module Description</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.SimModuleDescription
	 * @generated
	 */
	EClass getSimModuleDescription();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationDescription <em>Simulation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Description</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationDescription()
	 * @see #getSimModuleDescription()
	 * @generated
	 */
	EAttribute getSimModuleDescription_SimulationDescription();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationtimeinformation <em>Simulationtimeinformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simulationtimeinformation</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationtimeinformation()
	 * @see #getSimModuleDescription()
	 * @generated
	 */
	EReference getSimModuleDescription_Simulationtimeinformation();

	/**
	 * Returns the meta object for the containment reference '{@link aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationdata <em>Simulationdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simulationdata</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.SimModuleDescription#getSimulationdata()
	 * @see #getSimModuleDescription()
	 * @generated
	 */
	EReference getSimModuleDescription_Simulationdata();

	/**
	 * Returns the meta object for class '{@link aDL_Moddeling_Project.ModularSimulation.SimulationTimeInformation <em>Simulation Time Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Time Information</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.SimulationTimeInformation
	 * @generated
	 */
	EClass getSimulationTimeInformation();

	/**
	 * Returns the meta object for the attribute '{@link aDL_Moddeling_Project.ModularSimulation.SimulationTimeInformation#getSimulationTimeType <em>Simulation Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Time Type</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.SimulationTimeInformation#getSimulationTimeType()
	 * @see #getSimulationTimeInformation()
	 * @generated
	 */
	EAttribute getSimulationTimeInformation_SimulationTimeType();

	/**
	 * Returns the meta object for enum '{@link aDL_Moddeling_Project.ModularSimulation.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Type</em>'.
	 * @see aDL_Moddeling_Project.ModularSimulation.TimeType
	 * @generated
	 */
	EEnum getTimeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModularSimulationFactory getModularSimulationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulation.impl.SimModuleImpl <em>Sim Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulation.impl.SimModuleImpl
		 * @see aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl#getSimModule()
		 * @generated
		 */
		EClass SIM_MODULE = eINSTANCE.getSimModule();

		/**
		 * The meta object literal for the '<em><b>Simmoduledescription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_MODULE__SIMMODULEDESCRIPTION = eINSTANCE.getSimModule_Simmoduledescription();

		/**
		 * The meta object literal for the '<em><b>Basesimulationassemblyentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_MODULE__BASESIMULATIONASSEMBLYENTITY = eINSTANCE.getSimModule_Basesimulationassemblyentity();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_MODULE__CONNECTOR = eINSTANCE.getSimModule_Connector();

		/**
		 * The meta object literal for the '<em><b>Dataspecificationcontainer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_MODULE__DATASPECIFICATIONCONTAINER = eINSTANCE.getSimModule_Dataspecificationcontainer();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulation.impl.SimModuleDescriptionImpl <em>Sim Module Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulation.impl.SimModuleDescriptionImpl
		 * @see aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl#getSimModuleDescription()
		 * @generated
		 */
		EClass SIM_MODULE_DESCRIPTION = eINSTANCE.getSimModuleDescription();

		/**
		 * The meta object literal for the '<em><b>Simulation Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_MODULE_DESCRIPTION__SIMULATION_DESCRIPTION = eINSTANCE.getSimModuleDescription_SimulationDescription();

		/**
		 * The meta object literal for the '<em><b>Simulationtimeinformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_MODULE_DESCRIPTION__SIMULATIONTIMEINFORMATION = eINSTANCE.getSimModuleDescription_Simulationtimeinformation();

		/**
		 * The meta object literal for the '<em><b>Simulationdata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_MODULE_DESCRIPTION__SIMULATIONDATA = eINSTANCE.getSimModuleDescription_Simulationdata();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulation.impl.SimulationTimeInformationImpl <em>Simulation Time Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulation.impl.SimulationTimeInformationImpl
		 * @see aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl#getSimulationTimeInformation()
		 * @generated
		 */
		EClass SIMULATION_TIME_INFORMATION = eINSTANCE.getSimulationTimeInformation();

		/**
		 * The meta object literal for the '<em><b>Simulation Time Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_TIME_INFORMATION__SIMULATION_TIME_TYPE = eINSTANCE.getSimulationTimeInformation_SimulationTimeType();

		/**
		 * The meta object literal for the '{@link aDL_Moddeling_Project.ModularSimulation.TimeType <em>Time Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aDL_Moddeling_Project.ModularSimulation.TimeType
		 * @see aDL_Moddeling_Project.ModularSimulation.impl.ModularSimulationPackageImpl#getTimeType()
		 * @generated
		 */
		EEnum TIME_TYPE = eINSTANCE.getTimeType();

	}

} //ModularSimulationPackage
