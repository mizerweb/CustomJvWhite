package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eri implements jwa {
    public final String a;

    public eri(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eri) && this.a.equals(((eri) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("VKServerQuality(value=", this.a, ")");
    }
}
