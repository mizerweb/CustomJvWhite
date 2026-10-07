package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j0d {
    public static final /* synthetic */ zv8[] n;
    public static final long o;
    public final ic1 a;
    public final long b;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public volatile boolean k;
    public final long c = o;
    public final p3c l = qyj.S();
    public final String m = j0d.class.getName();

    static {
        z8b z8bVar = new z8b(j0d.class, "scheduleJob", "getScheduleJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        n = new zv8[]{z8bVar};
        ghb ghbVar = ew5.b;
        o = qe7.O(29, lw5.SECONDS);
    }

    public j0d(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ic1 ic1Var, ny8 ny8Var7, long j) {
        this.a = ic1Var;
        this.b = j;
        this.d = ny8Var;
        this.e = ny8Var7;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var5;
        this.j = ny8Var6;
        ((b95) ny8Var6.getValue()).c(new i0d(this));
    }

    public final void a() {
        gm0.n(this.m, "startInteractivePings");
        sgg sggVarH0 = yab.h0((ite) this.g.getValue(), ((n0c) ((xhh) this.h.getValue())).a(), 2, new ai8(this, null, 18));
        this.l.B(this, n[0], sggVarH0);
    }

    public final void b() {
        if (((Boolean) this.a.invoke()).booleanValue() && ((x02) ((b95) this.j.getValue()).i.a.getValue()).m()) {
            gm0.x(this.m, "stopInteractivePingsIfNeed ignored, has active call", null);
            return;
        }
        int iD = ew5.d(this.b, 0L);
        String str = this.m;
        if (iD <= 0) {
            gm0.n(str, "stopInteractivePingsIfNeed");
            vo8 vo8Var = (vo8) this.l.m(this, n[0]);
            if (vo8Var != null) {
                vo8Var.b(null);
            }
        } else {
            gm0.x(str, "stopInteractivePingsIfNeed: ignore scheduleJob?.cancel()", null);
        }
        this.k = false;
        ((pvb) this.d.getValue()).A(false);
    }
}
