/**
 */
package mm1.impl;

import java.util.Collection;

import mm1.Mm1Package;
import mm1.Question;
import mm1.Questionnaire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm1.impl.QuestionnaireImpl#getResultat <em>Resultat</em>}</li>
 *   <li>{@link mm1.impl.QuestionnaireImpl#isRetourAutorise <em>Retour Autorise</em>}</li>
 *   <li>{@link mm1.impl.QuestionnaireImpl#isMelange <em>Melange</em>}</li>
 *   <li>{@link mm1.impl.QuestionnaireImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireImpl extends ElementNommeImpl implements Questionnaire {
	/**
	 * The default value of the '{@link #getResultat() <em>Resultat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultat()
	 * @generated
	 * @ordered
	 */
	protected static final double RESULTAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getResultat() <em>Resultat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultat()
	 * @generated
	 * @ordered
	 */
	protected double resultat = RESULTAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRetourAutorise() <em>Retour Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetourAutorise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETOUR_AUTORISE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRetourAutorise() <em>Retour Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetourAutorise()
	 * @generated
	 * @ordered
	 */
	protected boolean retourAutorise = RETOUR_AUTORISE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMelange() <em>Melange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMelange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MELANGE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMelange() <em>Melange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMelange()
	 * @generated
	 * @ordered
	 */
	protected boolean melange = MELANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> question;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm1Package.Literals.QUESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getResultat() {
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultat(double newResultat) {
		double oldResultat = resultat;
		resultat = newResultat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.QUESTIONNAIRE__RESULTAT, oldResultat,
					resultat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRetourAutorise() {
		return retourAutorise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetourAutorise(boolean newRetourAutorise) {
		boolean oldRetourAutorise = retourAutorise;
		retourAutorise = newRetourAutorise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.QUESTIONNAIRE__RETOUR_AUTORISE,
					oldRetourAutorise, retourAutorise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMelange() {
		return melange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMelange(boolean newMelange) {
		boolean oldMelange = melange;
		melange = newMelange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.QUESTIONNAIRE__MELANGE, oldMelange,
					melange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Question> getQuestion() {
		if (question == null) {
			question = new EObjectContainmentEList<Question>(Question.class, this, Mm1Package.QUESTIONNAIRE__QUESTION);
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm1Package.QUESTIONNAIRE__QUESTION:
			return ((InternalEList<?>) getQuestion()).basicRemove(otherEnd, msgs);
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
		case Mm1Package.QUESTIONNAIRE__RESULTAT:
			return getResultat();
		case Mm1Package.QUESTIONNAIRE__RETOUR_AUTORISE:
			return isRetourAutorise();
		case Mm1Package.QUESTIONNAIRE__MELANGE:
			return isMelange();
		case Mm1Package.QUESTIONNAIRE__QUESTION:
			return getQuestion();
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
		case Mm1Package.QUESTIONNAIRE__RESULTAT:
			setResultat((Double) newValue);
			return;
		case Mm1Package.QUESTIONNAIRE__RETOUR_AUTORISE:
			setRetourAutorise((Boolean) newValue);
			return;
		case Mm1Package.QUESTIONNAIRE__MELANGE:
			setMelange((Boolean) newValue);
			return;
		case Mm1Package.QUESTIONNAIRE__QUESTION:
			getQuestion().clear();
			getQuestion().addAll((Collection<? extends Question>) newValue);
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
		case Mm1Package.QUESTIONNAIRE__RESULTAT:
			setResultat(RESULTAT_EDEFAULT);
			return;
		case Mm1Package.QUESTIONNAIRE__RETOUR_AUTORISE:
			setRetourAutorise(RETOUR_AUTORISE_EDEFAULT);
			return;
		case Mm1Package.QUESTIONNAIRE__MELANGE:
			setMelange(MELANGE_EDEFAULT);
			return;
		case Mm1Package.QUESTIONNAIRE__QUESTION:
			getQuestion().clear();
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
		case Mm1Package.QUESTIONNAIRE__RESULTAT:
			return resultat != RESULTAT_EDEFAULT;
		case Mm1Package.QUESTIONNAIRE__RETOUR_AUTORISE:
			return retourAutorise != RETOUR_AUTORISE_EDEFAULT;
		case Mm1Package.QUESTIONNAIRE__MELANGE:
			return melange != MELANGE_EDEFAULT;
		case Mm1Package.QUESTIONNAIRE__QUESTION:
			return question != null && !question.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (resultat: ");
		result.append(resultat);
		result.append(", retourAutorise: ");
		result.append(retourAutorise);
		result.append(", melange: ");
		result.append(melange);
		result.append(')');
		return result.toString();
	}

} //QuestionnaireImpl
