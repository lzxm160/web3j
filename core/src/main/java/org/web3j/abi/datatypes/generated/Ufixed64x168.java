package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Ufixed;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.web3j.codegen.AbiTypesGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Ufixed64x168 extends Ufixed {
    public static final Ufixed64x168 DEFAULT = new Ufixed64x168(BigInteger.ZERO);

    public Ufixed64x168(BigInteger value) {
        super(64, 168, value);
    }

    public Ufixed64x168(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(64, 168, m, n);
    }
}
