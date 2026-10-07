package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uh6 implements vh6 {
    public final String a;

    public uh6(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh6) && cqk.d(this.a, ((uh6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Enabled(trackId=", this.a, ")");
    }
}
