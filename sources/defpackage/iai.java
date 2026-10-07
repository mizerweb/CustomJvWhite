package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iai implements Comparable {
    public final short a;

    public /* synthetic */ iai(short s) {
        this.a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return cqk.i(this.a & 65535, ((iai) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iai) {
            return this.a == ((iai) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}
