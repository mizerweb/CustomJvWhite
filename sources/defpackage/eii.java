package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eii extends x0m {
    public final String a;

    public eii(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eii) && this.a.equals(((eii) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Photo(token=", this.a, ")");
    }
}
