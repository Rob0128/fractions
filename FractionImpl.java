package fraction;

import java.util.ArrayList;

public class FractionImpl implements Fraction {
    /**
     * Parameters are the <em>numerator</em> and the <em>denominator</em>.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are <pre>(8, -12)</pre>, create a <pre>Fraction</pre> with numerator
     * <pre>-2</pre> and denominator <pre>3</pre>.
     *
     * The constructor should throw an <pre>ArithmeticException</pre> if the denominator is zero.
     *
     * @param numerator
     * @param denominator
     */

    int numerator;
    int denominator;



    public FractionImpl(int numerator, int denominator) {
        // TODO

        if (denominator == 0){
            throw new ArithmeticException("Divide by zero");
        }

        else if (numerator == 0){
            this.numerator = 0;
            this.denominator = 1;
        }

        else if (denominator > 0 & numerator > 0){
            if(denominator <= numerator){
                for( int i = 1; i <= denominator; i++){
                    if (denominator % i == 0 & numerator % i == 0){
                        this.numerator = numerator / i;
                        this.denominator = denominator / i;

                    }
                }
            }
            else {
                for( int i = 1; i <= numerator; i++){
                    if (denominator % i == 0 & numerator % i == 0){
                        this.numerator = numerator / i;
                        this.denominator = denominator / i;

                    }
                }
            }

        }

        else if (denominator < 0 & numerator > 0){
            //deal with negative denominator
            int absDenom = Math.abs(denominator);
            //int absNumer = Math.abs(numerator);

            this.denominator = Math.abs(denominator);
            //this.numerator = -numerator;

            if(absDenom <= numerator){
                for( int i = 1; i <= absDenom; i++){
                    if (absDenom % i == 0 & numerator % i == 0){
                        this.numerator = numerator / i;
                        this.denominator = absDenom / i;

                    }
                }
                this.numerator = -this.numerator;
            }
            else{
                for( int i = 1; i <= numerator; i++){
                    if (absDenom % i == 0 & numerator % i == 0){
                        this.numerator = numerator / i;
                        this.denominator = absDenom / i;

                    }
                }
                this.numerator = -this.numerator;
            }



        }

        else if (numerator < 0 & denominator > 0){
            //deal with negative numerator

        }
    }

    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1;
    }

    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) {
        // TODO
        //Strips acceptable empty spaces from either end of the input string and then checks if there are any spaces left
        String frac = fraction.strip();
        if (frac.contains(" ") == true){
            System.out.println("Invalid input, please remove spaces");
        }
        else{
            String[] fracArray = frac.split("");

            ArrayList<String> arrLisNum = new ArrayList<String>();
            ArrayList<String> arrLisDen = new ArrayList<String>();

            if (frac.contains("/")){
                boolean isDenom = false;
                for (String i : fracArray){
                    if (i.equals("/")) {
                        isDenom = true;
                        continue;
                    }
                    else {
                        if (isDenom == false){
                            arrLisNum.add(i);
                        }
                        else{
                            arrLisDen.add(i);
                        }
                    }
                    //System.out.println(i);
                }
                //cleaning up the string to be converted to an int
                String newNumStr = arrLisNum.toString();
                newNumStr = newNumStr.replace('[', ' ');
                newNumStr = newNumStr.replace(']', ' ');
                newNumStr = newNumStr.replaceAll(",", "");
                newNumStr = newNumStr.replaceAll(" ", "");

                String newDenStr = arrLisDen.toString();
                newDenStr = newDenStr.replace('[', ' ');
                newDenStr = newDenStr.replace(']', ' ');
                newDenStr = newDenStr.replaceAll(",", "");
                newDenStr = newDenStr.replaceAll(" ", "");

                this.numerator = Integer.parseInt(newNumStr);
                this.denominator = Integer.parseInt(newDenStr);

            }
            else{
                this.numerator = Integer.parseInt(frac);
                this.denominator = 1;

            }

        }
        //TODO normalise here

    }



    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() {
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        return 0;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        return null;
    }

    public static void main(String[] args) {
        //FractionImpl c = new FractionImpl(100, -180);
        FractionImpl c = new FractionImpl("-324/-45");
        System.out.println(c.numerator);
        System.out.println(c.denominator);



    }
}