package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fx2 implements Serializable {
    public final ArrayList a;
    public final ArrayList b;

    public fx2(List list, List list2) {
        this.a = new ArrayList(list);
        this.b = new ArrayList(list2);
    }

    public static void f(mg5 mg5Var) {
        int iOrdinal = mg5Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return;
        }
        c.q(mg5Var, "Unexpected value: ");
    }

    public final void a(ex2 ex2Var, mg5 mg5Var) {
        e(mg5Var).add(ex2Var);
        f(mg5Var);
    }

    public final void b(mg5 mg5Var) {
        e(mg5Var).clear();
        f(mg5Var);
    }

    public final fx2 c(boolean z) {
        ArrayList arrayList = this.a;
        List listUnmodifiableList = z ? Collections.unmodifiableList(arrayList) : new ArrayList(arrayList);
        ArrayList arrayList2 = this.b;
        return new fx2(listUnmodifiableList, z ? Collections.unmodifiableList(arrayList2) : new ArrayList(arrayList2));
    }

    public final int d(mg5 mg5Var) {
        return e(mg5Var).size();
    }

    public final ArrayList e(mg5 mg5Var) {
        int iOrdinal = mg5Var.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        c.q(mg5Var, "Unexpected value: ");
        return null;
    }

    public fx2() {
        this(new ArrayList(), new ArrayList());
    }
}
