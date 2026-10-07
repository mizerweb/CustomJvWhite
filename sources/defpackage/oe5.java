package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class oe5 extends qyh {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public oe5(pe5 pe5Var) {
        d(pe5Var);
        this.J = pe5Var.w0;
        this.K = pe5Var.x0;
        this.L = pe5Var.y0;
        this.M = pe5Var.z0;
        this.N = pe5Var.A0;
        this.O = pe5Var.B0;
        this.P = pe5Var.C0;
        SparseArray sparseArray = pe5Var.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.Q = sparseArray2;
        this.R = pe5Var.E0.clone();
    }

    @Override // defpackage.qyh
    public final void a(nyh nyhVar) {
        this.H.put(nyhVar.a, nyhVar);
    }

    @Override // defpackage.qyh
    public final ryh b() {
        return new pe5(this);
    }

    @Override // defpackage.qyh
    public final qyh c() {
        super.c();
        return this;
    }

    @Override // defpackage.qyh
    public final qyh f(nyh nyhVar) {
        super.f(nyhVar);
        return this;
    }

    @Override // defpackage.qyh
    public final qyh g(String[] strArr) {
        super.g(strArr);
        return this;
    }

    public final void i(Set set) {
        this.I.clear();
        this.I.addAll(set);
    }

    public final void j(nyh nyhVar) {
        super.f(nyhVar);
    }

    public final qyh k(String[] strArr) {
        this.q = qyh.e(strArr);
        return this;
    }

    public oe5() {
        this.Q = new SparseArray();
        this.R = new SparseBooleanArray();
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
    }
}
