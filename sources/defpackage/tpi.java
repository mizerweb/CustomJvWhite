package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpi extends oqi {
    public final String a;

    public tpi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tpi) && this.a.equals(((tpi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("ExternalCallback(params=", this.a, ")");
    }
}
