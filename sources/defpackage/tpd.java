package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpd extends mk0 {
    public final vnh b;

    public tpd(vnh vnhVar) {
        super(13);
        this.b = vnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tpd) && this.b.equals(((tpd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShareLink(link=" + this.b + ")";
    }
}
