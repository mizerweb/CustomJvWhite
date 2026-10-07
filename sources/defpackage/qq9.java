package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class qq9 {
    public static final oq9 Companion = new oq9();
    public static final ny8[] b = {rx8.P(2, new j68(10))};
    public final List a;

    public /* synthetic */ qq9(int i, List list) {
        if ((i & 1) == 0) {
            this.a = r66.a;
        } else {
            this.a = list;
        }
    }

    public final ArrayList a(nq9 nq9Var, pq9 pq9Var) {
        List listSingletonList = pq9Var == null ? pq9.e : Collections.singletonList(pq9Var);
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            mq9 mq9Var = (mq9) obj;
            if (mq9Var.a() == nq9Var && listSingletonList.contains(mq9Var.b())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qq9) && cqk.d(this.a, ((qq9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("MediaAutoSaveSettings(records=", ")", this.a);
    }

    public qq9(List list) {
        this.a = list;
    }
}
