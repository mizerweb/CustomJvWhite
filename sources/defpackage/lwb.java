package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lwb extends sb8 {
    public final int l;

    public lwb(int i) {
        this.l = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwb) && this.l == ((lwb) obj).l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l);
    }

    public final String toString() {
        return c0a.k(this.l, "Counter(value=", ")");
    }
}
