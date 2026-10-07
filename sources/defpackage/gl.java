package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gl extends il {
    public final String a;

    public gl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gl) && this.a.equals(((gl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Path(value=", this.a, ")");
    }
}
