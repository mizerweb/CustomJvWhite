package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xz4 extends yz4 {
    @Override // defpackage.yz4
    public final void b(StringBuilder sb) {
        sb.append('(');
        sb.append(this.a);
    }

    @Override // defpackage.yz4
    public final void d(StringBuilder sb) {
        sb.append(this.a);
        sb.append(']');
    }

    @Override // defpackage.yz4
    public final int hashCode() {
        return ~this.a.hashCode();
    }

    @Override // defpackage.yz4
    public final boolean i(Comparable comparable) {
        int i = k4e.c;
        return this.a.compareTo(comparable) < 0;
    }

    public final String toString() {
        return "/" + this.a + "\\";
    }
}
