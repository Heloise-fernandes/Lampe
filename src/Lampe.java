/**Creer un objet lampe.
 * 
 * @author desmetc/fernandh
 *
 */
public class Lampe
{
    /**Attribut puissance.
     * 
     */
    private final int puissance;
    /**Attribut etat.
     * 
     */
    public boolean estAllumee;
    /**Valeur par defaut de la puissance.
     * 
     */
    private final int PUISSANCE_DEFAUT = 100;
    /**Valeur par defaut etat
     * 
     */        
    public boolean ESTALLUMER_DEFAUT = false;
    
    /**Affecte a la lampe des valeurs par defaut.
     * 
     */
    public Lampe()
    {
	this.puissance = PUISSANCE_DEFAUT;
	this.estAllumee = ESTALLUMER_DEFAUT;
    }
    /**Eteinds la lampe.
     * 
     */
    public void eteindre()
    {
	this.estAllumee = false;
    }
    /**Allume la lampe.
     * 
     */
    public void allumee()
    {
	this.estAllumee = true;
    }
    /**Renvoie la valeur de la puissance.
     * 
     * @return int
     */
    public int getpuissance()
    {
	return this.puissance;
    }
    /**Renvoie l'etat de la lampe.
     * 
     * @return boolean
     */
    public boolean getestallumee()
    {
	return this.estAllumee;
    }
    
}
