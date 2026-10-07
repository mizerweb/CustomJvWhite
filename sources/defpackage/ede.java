package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ede {
    public final long a;
    public final tnh b;
    public final zxb c;

    public ede(long j, tnh tnhVar, zxb zxbVar) {
        this.a = j;
        this.b = tnhVar;
        this.c = zxbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ede)) {
            return false;
        }
        ede edeVar = (ede) obj;
        return this.a == edeVar.a && this.b.equals(edeVar.b) && this.c == edeVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(this.b.c, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "ButtonState(id=" + this.a + ", textSource=" + this.b + ", appearance=" + this.c + ")";
    }
}
