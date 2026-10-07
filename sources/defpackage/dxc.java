package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class dxc implements dzc {
    public static final /* synthetic */ zv8[] l;
    public final long a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final pzf g;
    public final q8e h;
    public final AtomicLong i;
    public final p3c j;
    public gu4 k;

    static {
        z8b z8bVar = new z8b(dxc.class, "addSubscribersJob", "getAddSubscribersJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        l = new zv8[]{z8bVar};
    }

    public dxc(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = j;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 5);
        this.g = pzfVarB;
        this.h = new q8e(pzfVarB);
        this.i = new AtomicLong();
        this.j = qyj.S();
    }

    @Override // defpackage.dzc
    public final void a(dq4 dq4Var) {
        this.k = dq4Var;
        e9i.j0(new fz6(new q8e(((hxc) this.e.getValue()).a), new awa(this, (lq4) null, 21), 3), dq4Var);
    }

    @Override // defpackage.dzc
    public final void b() {
        this.k = null;
    }

    @Override // defpackage.dzc
    public final void c(xyc xycVar) {
    }

    @Override // defpackage.dzc
    public final void e(long j) {
    }
}
