package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ypi extends oqi {
    public final rbb a;

    public ypi(rbb rbbVar) {
        this.a = rbbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ypi) && this.a.equals(((ypi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenLinkNavigation(event=" + this.a + ")";
    }
}
