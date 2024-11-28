/**
 */
package mm1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see mm1.Mm1Factory
 * @model kind="package"
 * @generated
 */
public interface Mm1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mm1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mm1Package eINSTANCE = mm1.impl.Mm1PackageImpl.init();

	/**
	 * The meta object id for the '{@link mm1.impl.ElementNommeImpl <em>Element Nomme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm1.impl.ElementNommeImpl
	 * @see mm1.impl.Mm1PackageImpl#getElementNomme()
	 * @generated
	 */
	int ELEMENT_NOMME = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME__NOM = 0;

	/**
	 * The number of structural features of the '<em>Element Nomme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element Nomme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NOMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm1.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm1.impl.QuestionnaireImpl
	 * @see mm1.impl.Mm1PackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The feature id for the '<em><b>Resultat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__RESULTAT = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Retour Autorise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__RETOUR_AUTORISE = ELEMENT_NOMME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Melange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__MELANGE = ELEMENT_NOMME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__QUESTION = ELEMENT_NOMME_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm1.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm1.impl.QuestionImpl
	 * @see mm1.impl.Mm1PackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Ennonce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ENNONCE = 0;

	/**
	 * The feature id for the '<em><b>Difficulte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DIFFICULTE = 1;

	/**
	 * The feature id for the '<em><b>Reponses Multiples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REPONSES_MULTIPLES = 2;

	/**
	 * The feature id for the '<em><b>Etiquette</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ETIQUETTE = 3;

	/**
	 * The feature id for the '<em><b>Reponse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REPONSE = 4;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm1.impl.ReponseImpl <em>Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm1.impl.ReponseImpl
	 * @see mm1.impl.Mm1PackageImpl#getReponse()
	 * @generated
	 */
	int REPONSE = 2;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__TEXTE = 0;

	/**
	 * The feature id for the '<em><b>Est Vraie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__EST_VRAIE = 1;

	/**
	 * The number of structural features of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm1.impl.EtiquetteImpl <em>Etiquette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm1.impl.EtiquetteImpl
	 * @see mm1.impl.Mm1PackageImpl#getEtiquette()
	 * @generated
	 */
	int ETIQUETTE = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIQUETTE__NOM = ELEMENT_NOMME__NOM;

	/**
	 * The number of structural features of the '<em>Etiquette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIQUETTE_FEATURE_COUNT = ELEMENT_NOMME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Etiquette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIQUETTE_OPERATION_COUNT = ELEMENT_NOMME_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link mm1.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see mm1.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Questionnaire#getResultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resultat</em>'.
	 * @see mm1.Questionnaire#getResultat()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Resultat();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Questionnaire#isRetourAutorise <em>Retour Autorise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retour Autorise</em>'.
	 * @see mm1.Questionnaire#isRetourAutorise()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_RetourAutorise();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Questionnaire#isMelange <em>Melange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Melange</em>'.
	 * @see mm1.Questionnaire#isMelange()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Melange();

	/**
	 * Returns the meta object for the containment reference list '{@link mm1.Questionnaire#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see mm1.Questionnaire#getQuestion()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Question();

	/**
	 * Returns the meta object for class '{@link mm1.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see mm1.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Question#getEnnonce <em>Ennonce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ennonce</em>'.
	 * @see mm1.Question#getEnnonce()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Ennonce();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Question#getDifficulte <em>Difficulte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulte</em>'.
	 * @see mm1.Question#getDifficulte()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Difficulte();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Question#isReponsesMultiples <em>Reponses Multiples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reponses Multiples</em>'.
	 * @see mm1.Question#isReponsesMultiples()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_ReponsesMultiples();

	/**
	 * Returns the meta object for the reference list '{@link mm1.Question#getEtiquette <em>Etiquette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Etiquette</em>'.
	 * @see mm1.Question#getEtiquette()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Etiquette();

	/**
	 * Returns the meta object for the containment reference list '{@link mm1.Question#getReponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reponse</em>'.
	 * @see mm1.Question#getReponse()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Reponse();

	/**
	 * Returns the meta object for class '{@link mm1.Reponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse</em>'.
	 * @see mm1.Reponse
	 * @generated
	 */
	EClass getReponse();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Reponse#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see mm1.Reponse#getTexte()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Texte();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Reponse#isEstVraie <em>Est Vraie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Vraie</em>'.
	 * @see mm1.Reponse#isEstVraie()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_EstVraie();

	/**
	 * Returns the meta object for class '{@link mm1.ElementNomme <em>Element Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Nomme</em>'.
	 * @see mm1.ElementNomme
	 * @generated
	 */
	EClass getElementNomme();

	/**
	 * Returns the meta object for the attribute '{@link mm1.ElementNomme#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mm1.ElementNomme#getNom()
	 * @see #getElementNomme()
	 * @generated
	 */
	EAttribute getElementNomme_Nom();

	/**
	 * Returns the meta object for class '{@link mm1.Etiquette <em>Etiquette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etiquette</em>'.
	 * @see mm1.Etiquette
	 * @generated
	 */
	EClass getEtiquette();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mm1Factory getMm1Factory();

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
		 * The meta object literal for the '{@link mm1.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm1.impl.QuestionnaireImpl
		 * @see mm1.impl.Mm1PackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Resultat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__RESULTAT = eINSTANCE.getQuestionnaire_Resultat();

		/**
		 * The meta object literal for the '<em><b>Retour Autorise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__RETOUR_AUTORISE = eINSTANCE.getQuestionnaire_RetourAutorise();

		/**
		 * The meta object literal for the '<em><b>Melange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__MELANGE = eINSTANCE.getQuestionnaire_Melange();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__QUESTION = eINSTANCE.getQuestionnaire_Question();

		/**
		 * The meta object literal for the '{@link mm1.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm1.impl.QuestionImpl
		 * @see mm1.impl.Mm1PackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Ennonce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ENNONCE = eINSTANCE.getQuestion_Ennonce();

		/**
		 * The meta object literal for the '<em><b>Difficulte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__DIFFICULTE = eINSTANCE.getQuestion_Difficulte();

		/**
		 * The meta object literal for the '<em><b>Reponses Multiples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__REPONSES_MULTIPLES = eINSTANCE.getQuestion_ReponsesMultiples();

		/**
		 * The meta object literal for the '<em><b>Etiquette</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ETIQUETTE = eINSTANCE.getQuestion_Etiquette();

		/**
		 * The meta object literal for the '<em><b>Reponse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__REPONSE = eINSTANCE.getQuestion_Reponse();

		/**
		 * The meta object literal for the '{@link mm1.impl.ReponseImpl <em>Reponse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm1.impl.ReponseImpl
		 * @see mm1.impl.Mm1PackageImpl#getReponse()
		 * @generated
		 */
		EClass REPONSE = eINSTANCE.getReponse();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__TEXTE = eINSTANCE.getReponse_Texte();

		/**
		 * The meta object literal for the '<em><b>Est Vraie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__EST_VRAIE = eINSTANCE.getReponse_EstVraie();

		/**
		 * The meta object literal for the '{@link mm1.impl.ElementNommeImpl <em>Element Nomme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm1.impl.ElementNommeImpl
		 * @see mm1.impl.Mm1PackageImpl#getElementNomme()
		 * @generated
		 */
		EClass ELEMENT_NOMME = eINSTANCE.getElementNomme();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_NOMME__NOM = eINSTANCE.getElementNomme_Nom();

		/**
		 * The meta object literal for the '{@link mm1.impl.EtiquetteImpl <em>Etiquette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm1.impl.EtiquetteImpl
		 * @see mm1.impl.Mm1PackageImpl#getEtiquette()
		 * @generated
		 */
		EClass ETIQUETTE = eINSTANCE.getEtiquette();

	}

} //Mm1Package
