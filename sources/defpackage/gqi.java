package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gqi extends oqi {
    public final String a;

    public gqi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gqi) && cqk.d(this.a, ((gqi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("ShowJoinCall(link=", this.a, ")");
    }
}
