package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class l84 extends ohc implements Serializable {
    public final Comparator[] a;

    public l84(p61 p61Var, p61 p61Var2) {
        this.a = new Comparator[]{p61Var, p61Var2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l84) {
            return Arrays.equals(this.a, ((l84) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return zo5.w(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
