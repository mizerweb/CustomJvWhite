package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x9i implements Comparable {
    public final int a;

    public /* synthetic */ x9i(int i) {
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return cqk.i(this.a ^ Integer.MIN_VALUE, ((x9i) obj).a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x9i) {
            return this.a == ((x9i) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(((long) this.a) & 4294967295L);
    }
}
