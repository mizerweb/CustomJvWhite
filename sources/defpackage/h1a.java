package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h1a extends i1a {
    public final String b;

    public h1a(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1a) && this.b.equals(((h1a) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return c0a.o("PopWithPickedImage(uriString=", this.b, ")");
    }
}
