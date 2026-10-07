package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rjc {
    public final Object a;

    public static final boolean a(Object obj) {
        return ((obj instanceof tjc) || obj == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rjc) {
            return cqk.d(this.a, ((rjc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "OutputResult(result=" + this.a + ')';
    }
}
