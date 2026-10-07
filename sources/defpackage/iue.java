package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class iue {
    public static final iue c = new iue(-1, false);
    public static final iue d = new iue(-1, true);
    public final int a;
    public final boolean b;

    public iue(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iue)) {
            return false;
        }
        iue iueVar = (iue) obj;
        return this.a == iueVar.a && this.b == iueVar.b;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        Boolean boolValueOf = Boolean.valueOf(this.b);
        return ((numValueOf.hashCode() + 31) * 31) + boolValueOf.hashCode();
    }

    public final String toString() {
        return String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)}, 2));
    }
}
