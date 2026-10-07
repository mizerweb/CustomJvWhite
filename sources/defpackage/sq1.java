package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sq1 implements uq1 {
    public final String a;

    public sq1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sq1) && this.a.equals(((sq1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Create(link=", this.a, ")");
    }
}
