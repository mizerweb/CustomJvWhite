package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k88 extends q1 implements gri, Iterable {
    public static final k88 b = new k88(new gri[0]);
    public final gri[] a;

    public k88(gri[] griVarArr) {
        this.a = griVarArr;
    }

    public final gri B(int i) {
        return this.a[i];
    }

    @Override // defpackage.gri
    public final int a() {
        return 7;
    }

    @Override // defpackage.q1, defpackage.gri
    public final k88 b() {
        return this;
    }

    @Override // defpackage.gri
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gri) {
            gri griVar = (gri) obj;
            boolean z = griVar instanceof k88;
            gri[] griVarArr = this.a;
            if (z) {
                return Arrays.equals(griVarArr, ((k88) griVar).a);
            }
            int iA = ((q1) griVar).a();
            if (iA == 0) {
                throw null;
            }
            if (iA == 7) {
                k88 k88VarB = griVar.b();
                if (griVarArr.length == k88VarB.a.length) {
                    Iterator it = k88VarB.iterator();
                    for (gri griVar2 : griVarArr) {
                        j88 j88Var = (j88) it;
                        if (j88Var.hasNext() && griVar2.equals(j88Var.next())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        int i = 0;
        while (true) {
            gri[] griVarArr = this.a;
            if (i >= griVarArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + griVarArr[i].hashCode();
            i++;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j88(this.a);
    }

    public final int size() {
        return this.a.length;
    }

    @Override // defpackage.gri
    public final String toJson() {
        gri[] griVarArr = this.a;
        if (griVarArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(griVarArr[0].toJson());
        for (int i = 1; i < griVarArr.length; i++) {
            sb.append(",");
            sb.append(griVarArr[i].toJson());
        }
        sb.append("]");
        return sb.toString();
    }

    public final String toString() {
        gri[] griVarArr = this.a;
        if (griVarArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        gri griVar = griVarArr[0];
        if (nbh.f(((q1) griVar).a())) {
            sb.append(griVar.toJson());
        } else {
            sb.append(griVar.toString());
        }
        for (int i = 1; i < griVarArr.length; i++) {
            sb.append(",");
            gri griVar2 = griVarArr[i];
            if (nbh.f(((q1) griVar2).a())) {
                sb.append(griVar2.toJson());
            } else {
                sb.append(griVar2.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.q1
    /* JADX INFO: renamed from: v */
    public final k88 b() {
        return this;
    }
}
