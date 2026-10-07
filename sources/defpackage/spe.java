package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class spe extends ohc implements Serializable {
    public final ohc a;

    public spe(ohc ohcVar) {
        this.a = ohcVar;
    }

    @Override // defpackage.ohc
    public final ohc a() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof spe) {
            return this.a.equals(((spe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
