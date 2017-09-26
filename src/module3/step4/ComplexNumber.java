package module3.step4;

import static java.lang.Double.doubleToLongBits;

/**
 *
 */

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return this.re;
    }

    public double getIm() {
        return this.im;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return  true;
        }
        if (obj == null || (this.getClass() != obj.getClass())) {
            return false;
        }
        ComplexNumber complexNumber = (ComplexNumber) obj;
        if (Double.compare(complexNumber.re, re) != 0) return false;
        return Double.compare(complexNumber.im, im) == 0;

    }

/*    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        long temp = Double.doubleToLongBits(re);
        result = prime * result + (int)temp;
        temp = Double.doubleToLongBits(im);
        result = prime * result + (int)temp;
        return  result;
    }*/
}
