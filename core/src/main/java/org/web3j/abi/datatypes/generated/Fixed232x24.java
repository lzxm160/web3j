package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Fixed;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.web3j.codegen.AbiTypesGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Fixed232x24 extends Fixed {
    public static final Fixed232x24 DEFAULT = new Fixed232x24(BigInteger.ZERO);

    public Fixed232x24(BigInteger value) {
        super(232, 24, value);
    }

    public Fixed232x24(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(232, 24, m, n);
    }
}
