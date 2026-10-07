package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class okg {
    public final mjg a;
    public final r8e b;
    public final ny8 c;

    public okg(ny8 ny8Var) {
        mjg mjgVarA = p90.a(nkg.a);
        this.a = mjgVarA;
        this.b = new r8e(mjgVarA);
        this.c = ny8Var;
    }

    public final void a(String str, boolean z) {
        sa2 sa2Var = (sa2) this.c.getValue();
        long j = z ? 1L : 0L;
        sa2Var.getClass();
        sa2.c(sa2Var, "PIP_ENABLED", str, null, Long.valueOf(j), null, null, false, null, 500);
    }
}
