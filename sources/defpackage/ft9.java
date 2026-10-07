package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ft9 extends uq3 {
    public final long j;

    public ft9(u25 u25Var, a35 a35Var, b87 b87Var, int i, Object obj, long j, long j2, long j3) {
        super(u25Var, a35Var, 1, b87Var, i, obj, j, j2);
        b87Var.getClass();
        this.j = j3;
    }

    public long a() {
        long j = this.j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
