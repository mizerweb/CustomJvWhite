package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oc7 {
    public final b87 a;
    public final long b;

    public oc7(b87 b87Var, long j) {
        lvb.O("format colorInfo must be set", b87Var.D != null);
        int i = b87Var.u;
        lvb.Q("format width must be positive, but is: %s", i, i > 0);
        int i2 = b87Var.v;
        lvb.Q("format height must be positive, but is: %s", i2, i2 > 0);
        this.a = b87Var;
        this.b = j;
    }
}
