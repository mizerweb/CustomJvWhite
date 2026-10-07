package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pe5 extends ryh {
    public static final pe5 F0 = new pe5(new oe5());
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final String R0;
    public static final String S0;
    public static final String T0;
    public static final String U0;
    public static final String V0;
    public static final String W0;
    public static final String X0;
    public static final String Y0;
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final SparseArray D0;
    public final SparseBooleanArray E0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    static {
        String str = vqi.a;
        G0 = Integer.toString(1000, 36);
        H0 = Integer.toString(1001, 36);
        I0 = Integer.toString(1002, 36);
        J0 = Integer.toString(1003, 36);
        K0 = Integer.toString(1004, 36);
        L0 = Integer.toString(1005, 36);
        M0 = Integer.toString(1006, 36);
        N0 = Integer.toString(1007, 36);
        O0 = Integer.toString(1008, 36);
        P0 = Integer.toString(1009, 36);
        Q0 = Integer.toString(1010, 36);
        R0 = Integer.toString(1011, 36);
        S0 = Integer.toString(1012, 36);
        T0 = Integer.toString(1013, 36);
        U0 = Integer.toString(1014, 36);
        V0 = Integer.toString(1015, 36);
        W0 = Integer.toString(1016, 36);
        X0 = Integer.toString(1017, 36);
        Y0 = Integer.toString(1018, 36);
    }

    public pe5(oe5 oe5Var) {
        super(oe5Var);
        this.w0 = oe5Var.J;
        this.x0 = oe5Var.K;
        this.y0 = oe5Var.L;
        this.z0 = oe5Var.M;
        this.A0 = oe5Var.N;
        this.B0 = oe5Var.O;
        this.C0 = oe5Var.P;
        this.D0 = oe5Var.Q;
        this.E0 = oe5Var.R;
    }

    @Override // defpackage.ryh
    public final qyh a() {
        return new oe5(this);
    }

    @Override // defpackage.ryh
    public final Bundle c() {
        Bundle bundleC = super.c();
        bundleC.putBoolean(G0, this.w0);
        bundleC.putBoolean(H0, false);
        bundleC.putBoolean(I0, this.x0);
        bundleC.putBoolean(U0, false);
        bundleC.putBoolean(J0, this.y0);
        bundleC.putBoolean(K0, false);
        bundleC.putBoolean(L0, false);
        bundleC.putBoolean(M0, false);
        bundleC.putBoolean(V0, false);
        bundleC.putBoolean(Y0, this.z0);
        bundleC.putBoolean(W0, this.A0);
        bundleC.putBoolean(N0, this.B0);
        bundleC.putBoolean(O0, false);
        bundleC.putBoolean(P0, this.C0);
        bundleC.putBoolean(X0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.D0;
            if (i >= sparseArray2.size()) {
                break;
            }
            int iKeyAt = sparseArray2.keyAt(i);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                qt4.A(entry.getValue());
                arrayList2.add((iyh) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundleC.putIntArray(Q0, k4m.h(arrayList));
            bundleC.putParcelableArrayList(R0, l51.e(arrayList2, new o75(8)));
            bundleC.putSparseParcelableArray(S0, l51.f(sparseArray, new o75(9)));
            i++;
        }
        SparseBooleanArray sparseBooleanArray = this.E0;
        int[] iArr = new int[sparseBooleanArray.size()];
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            iArr[i2] = sparseBooleanArray.keyAt(i2);
        }
        bundleC.putIntArray(T0, iArr);
        return bundleC;
    }

    @Override // defpackage.ryh
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pe5.class == obj.getClass()) {
            pe5 pe5Var = (pe5) obj;
            if (super.equals(pe5Var) && this.w0 == pe5Var.w0 && this.x0 == pe5Var.x0 && this.y0 == pe5Var.y0 && this.z0 == pe5Var.z0 && this.A0 == pe5Var.A0 && this.B0 == pe5Var.B0 && this.C0 == pe5Var.C0) {
                SparseBooleanArray sparseBooleanArray = pe5Var.E0;
                SparseBooleanArray sparseBooleanArray2 = this.E0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = pe5Var.D0;
                    SparseArray sparseArray2 = this.D0;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        iyh iyhVar = (iyh) entry.getKey();
                                        if (!map2.containsKey(iyhVar) || !Objects.equals(entry.getValue(), map2.get(iyhVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ryh
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.w0 ? 1 : 0)) * 961) + (this.x0 ? 1 : 0)) * 961) + (this.y0 ? 1 : 0)) * 28629151) + (this.z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 961) + (this.C0 ? 1 : 0)) * 31;
    }
}
