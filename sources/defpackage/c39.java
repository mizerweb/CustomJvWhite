package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c39 extends e39 {
    public final String a;

    public c39(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c39) && cqk.d(this.a, ((c39) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("ShowJoinCall(link=", this.a, ")");
    }
}
