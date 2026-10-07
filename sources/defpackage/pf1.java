package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pf1 implements qf1 {
    public final String a;

    public pf1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf1) && cqk.d(this.a, ((pf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Finished(sessionId=", this.a, ")");
    }
}
