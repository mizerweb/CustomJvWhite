package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yz7 implements a08 {
    public final String a;

    public yz7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz7) && cqk.d(this.a, ((yz7) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return c0a.o("CustomMode(host=", this.a, ")");
    }
}
