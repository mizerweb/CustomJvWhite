package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class lhe extends g98 {
    public static final lhe g = new lhe(null, new Object[0], 0);
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public lhe(Object obj, Object[] objArr, int i) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    public static lhe i(int i, Object[] objArr, hle hleVar) {
        if (i == 0) {
            return g;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new lhe(null, objArr, 1);
        }
        lvb.X(i, objArr.length >> 1);
        Object objJ = j(objArr, i, u98.j(i), 0);
        if (objJ instanceof Object[]) {
            Object[] objArr2 = (Object[]) objJ;
            f98 f98Var = (f98) objArr2[2];
            if (hleVar == null) {
                throw f98Var.a();
            }
            hleVar.d = f98Var;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objJ = obj;
            i = iIntValue;
        }
        return new lhe(objJ, objArr, i);
    }

    public static Object j(Object[] objArr, int i, int i2, int i3) {
        f98 f98Var = null;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                Object obj = objArr[i7];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i7 ^ 1];
                Objects.requireNonNull(obj2);
                int iT = n1g.T(obj.hashCode());
                while (true) {
                    int i9 = iT & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj;
                            objArr[i8 ^ 1] = obj2;
                        }
                        i6++;
                        break;
                    }
                    if (obj.equals(objArr[i10])) {
                        int i11 = i10 ^ 1;
                        Object obj3 = objArr[i11];
                        Objects.requireNonNull(obj3);
                        f98Var = new f98(obj, obj2, obj3);
                        objArr[i11] = obj2;
                        break;
                    }
                    iT = i9 + 1;
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), f98Var};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object obj4 = objArr[i13];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj5);
                int iT2 = n1g.T(obj4.hashCode());
                while (true) {
                    int i15 = iT2 & i4;
                    int i16 = sArr[i15] & 65535;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj4;
                            objArr[i14 ^ 1] = obj5;
                        }
                        i12++;
                        break;
                    }
                    if (obj4.equals(objArr[i16])) {
                        int i17 = i16 ^ 1;
                        Object obj6 = objArr[i17];
                        Objects.requireNonNull(obj6);
                        f98Var = new f98(obj4, obj5, obj6);
                        objArr[i17] = obj5;
                        break;
                    }
                    iT2 = i15 + 1;
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), f98Var};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            Object obj7 = objArr[i19];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i19 ^ 1];
            Objects.requireNonNull(obj8);
            int iT3 = n1g.T(obj7.hashCode());
            while (true) {
                int i21 = iT3 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = obj7;
                        objArr[i20 ^ 1] = obj8;
                    }
                    i18++;
                    break;
                }
                if (obj7.equals(objArr[i22])) {
                    int i23 = i22 ^ 1;
                    Object obj9 = objArr[i23];
                    Objects.requireNonNull(obj9);
                    f98Var = new f98(obj7, obj8, obj9);
                    objArr[i23] = obj8;
                    break;
                }
                iT3 = i21 + 1;
            }
            i5++;
        }
        return i18 == i ? iArr : new Object[]{iArr, Integer.valueOf(i18), f98Var};
    }

    public static Object k(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iT = n1g.T(obj2.hashCode());
            while (true) {
                int i3 = iT & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iT = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iT2 = n1g.T(obj2.hashCode());
            while (true) {
                int i5 = iT2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iT2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iT3 = n1g.T(obj2.hashCode());
            while (true) {
                int i7 = iT3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iT3 = i7 + 1;
            }
        }
    }

    @Override // defpackage.g98
    public final u98 b() {
        return new ihe(this, this.e, 0, this.f);
    }

    @Override // defpackage.g98
    public final u98 c() {
        return new jhe(this, new khe(this.e, 0, this.f));
    }

    @Override // defpackage.g98
    public final s88 d() {
        return new khe(this.e, 1, this.f);
    }

    @Override // defpackage.g98
    public final boolean f() {
        return false;
    }

    @Override // defpackage.g98, java.util.Map
    public final Object get(Object obj) {
        Object objK = k(this.d, this.e, this.f, 0, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }
}
