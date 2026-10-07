package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vwg implements wwg {
    public final tmh a;

    public vwg(tmh tmhVar) {
        this.a = tmhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwg) && this.a.equals(((vwg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Text(layer=" + this.a + ")";
    }
}
