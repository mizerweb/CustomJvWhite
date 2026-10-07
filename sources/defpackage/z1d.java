package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z1d implements a2d {
    public final String a;

    public z1d(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1d) && this.a.equals(((z1d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("UserPhoto(url=", this.a, ")");
    }
}
