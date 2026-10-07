package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qpi extends oqi {
    public final String a;

    public qpi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qpi) && this.a.equals(((qpi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("CopyLink(link=", this.a, ")");
    }
}
