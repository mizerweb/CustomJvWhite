package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p4e {
    public final int a;
    public final Integer b;
    public final boolean c;

    public p4e(int i, Integer num, boolean z) {
        this.a = i;
        this.b = num;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4e)) {
            return false;
        }
        p4e p4eVar = (p4e) obj;
        return this.a == p4eVar.a && this.b.equals(p4eVar.b) && this.c == p4eVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ((m4e.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RateCallButtonData(id=" + this.a + ", size=" + m4e.b + ", icon=" + this.b + ", isEnabled=" + this.c + ")";
    }
}
