package defpackage;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ot2 {
    public final ot2 a;
    public final AtomicReference b;
    public final sa6 c;
    public final int d;
    public final int e;
    public boolean f;
    public String[] g;
    public mt2[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public BitSet n;

    public ot2(ot2 ot2Var, sa6 sa6Var, int i, int i2, nt2 nt2Var) {
        this.a = ot2Var;
        this.c = sa6Var;
        this.d = i2;
        this.b = null;
        this.e = i;
        this.f = mw7.a(2, i);
        String[] strArr = nt2Var.c;
        this.g = strArr;
        this.h = nt2Var.d;
        this.i = nt2Var.a;
        this.l = nt2Var.b;
        int length = strArr.length;
        this.j = length - (length >> 2);
        this.k = length - 1;
        this.m = true;
    }

    public final int a(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return this.k & (i3 + (i3 >>> 3));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:112:0x0209  */
    /* JADX WARN: Code duplicated, block: B:114:0x020f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0216  */
    /* JADX WARN: Code duplicated, block: B:117:0x021a  */
    /* JADX WARN: Code duplicated, block: B:119:0x022f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0247  */
    public final String b(char[] cArr, int i, int i2, int i3) throws StreamConstraintsException {
        int i4;
        String str;
        int i5;
        int i6;
        String[] strArr;
        int i7;
        mt2 mt2Var;
        mt2[] mt2VarArr;
        int i8;
        BitSet bitSet;
        String str2;
        int i9 = 1;
        if (i2 < 1) {
            return "";
        }
        boolean z = this.f;
        sa6 sa6Var = this.c;
        if (!z) {
            sa6Var.getClass();
            sa6.d(i2);
            return new String(cArr, i, i2);
        }
        int iA = a(i3);
        String str3 = this.g[iA];
        int i10 = 0;
        if (str3 != null) {
            if (str3.length() == i2) {
                int i11 = 0;
                while (str3.charAt(i11) == cArr[i + i11]) {
                    i11++;
                    if (i11 == i2) {
                        return str3;
                    }
                }
            }
            mt2 mt2Var2 = this.h[iA >> 1];
            if (mt2Var2 != null) {
                String str4 = mt2Var2.a;
                if (str4.length() != i2) {
                    str4 = null;
                    break;
                }
                int i12 = 0;
                do {
                    if (str4.charAt(i12) != cArr[i + i12]) {
                        str4 = null;
                        break;
                    }
                    i12++;
                } while (i12 < i2);
                if (str4 != null) {
                    return str4;
                }
                mt2 mt2Var3 = mt2Var2.b;
                while (true) {
                    if (mt2Var3 == null) {
                        str2 = null;
                        break;
                    }
                    str2 = mt2Var3.a;
                    if (str2.length() != i2) {
                        str2 = null;
                        break;
                    }
                    int i13 = 0;
                    do {
                        if (str2.charAt(i13) != cArr[i + i13]) {
                            str2 = null;
                            break;
                        }
                        i13++;
                    } while (i13 < i2);
                    if (str2 != null) {
                        break;
                    }
                    mt2Var3 = mt2Var3.b;
                }
                if (str2 != null) {
                    return str2;
                }
            }
        }
        sa6Var.getClass();
        sa6.d(i2);
        if (!this.m) {
            if (this.i >= this.j) {
                String[] strArr2 = this.g;
                int length = strArr2.length;
                int i14 = length + length;
                int i15 = this.d;
                if (i14 > 65536) {
                    this.i = 0;
                    this.f = false;
                    this.g = new String[64];
                    this.h = new mt2[32];
                    this.k = 63;
                    this.m = false;
                    i4 = 1;
                } else {
                    mt2[] mt2VarArr2 = this.h;
                    this.g = new String[i14];
                    this.h = new mt2[i14 >> 1];
                    this.k = i14 - 1;
                    this.j = i14 - (i14 >> 2);
                    int i16 = 0;
                    int i17 = 0;
                    int iMax = 0;
                    while (i16 < length) {
                        String str5 = strArr2[i16];
                        if (str5 != null) {
                            i17++;
                            int length2 = str5.length();
                            int iCharAt = i15;
                            while (i10 < length2) {
                                iCharAt = str5.charAt(i10) + (iCharAt * 33);
                                i10++;
                            }
                            int iA2 = a(iCharAt == 0 ? i9 : iCharAt);
                            String[] strArr3 = this.g;
                            if (strArr3[iA2] == null) {
                                strArr3[iA2] = str5;
                            } else {
                                int i18 = iA2 >> 1;
                                mt2[] mt2VarArr3 = this.h;
                                mt2 mt2Var4 = new mt2(str5, mt2VarArr3[i18]);
                                mt2VarArr3[i18] = mt2Var4;
                                iMax = Math.max(iMax, mt2Var4.c);
                            }
                        }
                        i16++;
                        i9 = i9;
                        i10 = 0;
                    }
                    i4 = i9;
                    int i19 = length >> 1;
                    for (int i20 = 0; i20 < i19; i20++) {
                        for (mt2 mt2Var5 = mt2VarArr2[i20]; mt2Var5 != null; mt2Var5 = mt2Var5.b) {
                            i17++;
                            String str6 = mt2Var5.a;
                            int length3 = str6.length();
                            int iCharAt2 = i15;
                            for (int i21 = 0; i21 < length3; i21++) {
                                iCharAt2 = (iCharAt2 * 33) + str6.charAt(i21);
                            }
                            if (iCharAt2 == 0) {
                                iCharAt2 = i4;
                            }
                            int iA3 = a(iCharAt2);
                            String[] strArr4 = this.g;
                            if (strArr4[iA3] == null) {
                                strArr4[iA3] = str6;
                            } else {
                                int i22 = iA3 >> 1;
                                mt2[] mt2VarArr4 = this.h;
                                mt2 mt2Var6 = new mt2(str6, mt2VarArr4[i22]);
                                mt2VarArr4[i22] = mt2Var6;
                                iMax = Math.max(iMax, mt2Var6.c);
                            }
                        }
                    }
                    this.l = iMax;
                    this.n = null;
                    int i23 = this.i;
                    if (i17 != i23) {
                        throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(i23), Integer.valueOf(i17)));
                    }
                }
                int i24 = i + i2;
                for (int i25 = i; i25 < i24; i25++) {
                    i15 = (i15 * 33) + cArr[i25];
                }
                if (i15 == 0) {
                    i15 = i4;
                }
                iA = a(i15);
            }
            str = new String(cArr, i, i2);
            i5 = this.e;
            i6 = i4;
            if (mw7.a(i6, i5)) {
                str = uj8.b.a(str);
            }
            this.i += i6;
            strArr = this.g;
            if (strArr[iA] == null) {
                strArr[iA] = str;
                return str;
            }
            i7 = iA >> 1;
            mt2VarArr = this.h;
            mt2Var = new mt2(str, mt2VarArr[i7]);
            i8 = mt2Var.c;
            if (i8 > 150) {
                mt2VarArr[i7] = mt2Var;
                this.l = Math.max(i8, this.l);
                return str;
            }
            bitSet = this.n;
            if (bitSet == null) {
                BitSet bitSet2 = new BitSet();
                this.n = bitSet2;
                bitSet2.set(i7);
            } else if (bitSet.get(i7)) {
                this.n.set(i7);
            } else {
                if (!mw7.a(3, i5)) {
                    throw new StreamConstraintsException(zo5.t(new StringBuilder("Longest collision chain in symbol table (of size "), this.i, ") now exceeds maximum, 150 -- suspect a DoS attack based on hash collisions"));
                }
                this.f = false;
            }
            this.g[iA] = str;
            this.h[i7] = null;
            this.i -= i8;
            this.l = -1;
            return str;
        }
        String[] strArr5 = this.g;
        this.g = (String[]) Arrays.copyOf(strArr5, strArr5.length);
        mt2[] mt2VarArr5 = this.h;
        this.h = (mt2[]) Arrays.copyOf(mt2VarArr5, mt2VarArr5.length);
        this.m = false;
        i4 = 1;
        str = new String(cArr, i, i2);
        i5 = this.e;
        i6 = i4;
        if (mw7.a(i6, i5)) {
            str = uj8.b.a(str);
        }
        this.i += i6;
        strArr = this.g;
        if (strArr[iA] == null) {
            strArr[iA] = str;
            return str;
        }
        i7 = iA >> 1;
        mt2VarArr = this.h;
        mt2Var = new mt2(str, mt2VarArr[i7]);
        i8 = mt2Var.c;
        if (i8 > 150) {
            mt2VarArr[i7] = mt2Var;
            this.l = Math.max(i8, this.l);
            return str;
        }
        bitSet = this.n;
        if (bitSet == null) {
            BitSet bitSet3 = new BitSet();
            this.n = bitSet3;
            bitSet3.set(i7);
        } else if (bitSet.get(i7)) {
            this.n.set(i7);
        } else {
            if (!mw7.a(3, i5)) {
                throw new StreamConstraintsException(zo5.t(new StringBuilder("Longest collision chain in symbol table (of size "), this.i, ") now exceeds maximum, 150 -- suspect a DoS attack based on hash collisions"));
            }
            this.f = false;
        }
        this.g[iA] = str;
        this.h[i7] = null;
        this.i -= i8;
        this.l = -1;
        return str;
    }

    public final ot2 c() {
        return new ot2(this, this.c, this.e, this.d, (nt2) this.b.get());
    }

    public ot2(sa6 sa6Var, int i, int i2) {
        this.a = null;
        this.d = i2;
        this.c = sa6Var;
        this.f = true;
        this.e = i;
        this.m = false;
        this.l = 0;
        this.b = new AtomicReference(new nt2(new String[64], new mt2[32]));
    }
}
