package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class unj implements ynj {
    public final pnh a;
    public final rnh b;

    public unj(pnh pnhVar, rnh rnhVar) {
        this.a = pnhVar;
        this.b = rnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unj)) {
            return false;
        }
        unj unjVar = (unj) obj;
        return this.a.equals(unjVar.a) && this.b.equals(unjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnackbarShared(sharedPlural=" + this.a + ", toChatsPlural=" + this.b + ")";
    }
}
