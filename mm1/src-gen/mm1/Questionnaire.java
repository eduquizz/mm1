/**
 */
package mm1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm1.Questionnaire#getResultat <em>Resultat</em>}</li>
 *   <li>{@link mm1.Questionnaire#isRetourAutorise <em>Retour Autorise</em>}</li>
 *   <li>{@link mm1.Questionnaire#isMelange <em>Melange</em>}</li>
 *   <li>{@link mm1.Questionnaire#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see mm1.Mm1Package#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends ElementNomme {
	/**
	 * Returns the value of the '<em><b>Resultat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultat</em>' attribute.
	 * @see #setResultat(double)
	 * @see mm1.Mm1Package#getQuestionnaire_Resultat()
	 * @model
	 * @generated
	 */
	double getResultat();

	/**
	 * Sets the value of the '{@link mm1.Questionnaire#getResultat <em>Resultat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultat</em>' attribute.
	 * @see #getResultat()
	 * @generated
	 */
	void setResultat(double value);

	/**
	 * Returns the value of the '<em><b>Retour Autorise</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retour Autorise</em>' attribute.
	 * @see #setRetourAutorise(boolean)
	 * @see mm1.Mm1Package#getQuestionnaire_RetourAutorise()
	 * @model default="true"
	 * @generated
	 */
	boolean isRetourAutorise();

	/**
	 * Sets the value of the '{@link mm1.Questionnaire#isRetourAutorise <em>Retour Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retour Autorise</em>' attribute.
	 * @see #isRetourAutorise()
	 * @generated
	 */
	void setRetourAutorise(boolean value);

	/**
	 * Returns the value of the '<em><b>Melange</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Melange</em>' attribute.
	 * @see #setMelange(boolean)
	 * @see mm1.Mm1Package#getQuestionnaire_Melange()
	 * @model default="true"
	 * @generated
	 */
	boolean isMelange();

	/**
	 * Sets the value of the '{@link mm1.Questionnaire#isMelange <em>Melange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Melange</em>' attribute.
	 * @see #isMelange()
	 * @generated
	 */
	void setMelange(boolean value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference list.
	 * The list contents are of type {@link mm1.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference list.
	 * @see mm1.Mm1Package#getQuestionnaire_Question()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Question> getQuestion();

} // Questionnaire
