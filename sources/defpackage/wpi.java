package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wpi extends oqi {
    public final String a;

    public wpi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wpi) && this.a.equals(((wpi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("OpenExternalLink(url=", this.a, ")");
    }
}
