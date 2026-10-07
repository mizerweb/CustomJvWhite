package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ffh {
    public final i64 a;

    public ffh(i64 i64Var) {
        this.a = i64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffh) && this.a == ((ffh) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncFlushSignal(completableDeferred=" + this.a + ")";
    }
}
