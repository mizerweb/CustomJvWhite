package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yxf implements eyf {
    public final String a;

    public yxf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxf) && cqk.d(this.a, ((yxf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("CopyLink(text=", this.a, ")");
    }
}
