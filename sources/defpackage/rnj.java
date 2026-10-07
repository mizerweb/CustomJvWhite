package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rnj implements ynj {
    public final String a;

    public rnj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rnj) && cqk.d(this.a, ((rnj) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return c0a.o("ShowNativeShareDialog(text=", this.a, ")");
    }
}
