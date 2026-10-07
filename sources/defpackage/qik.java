package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qik {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i = sid.INSTANCE.a(0);
    public int j;
    public long k;
    public boolean l;
    public boolean m;

    public final void a(pv0 pv0Var) {
        this.i = sid.INSTANCE.a(this.i | pv0Var.getProcesses());
        this.k = Math.max(this.k, pv0Var.getTemperature());
        boolean z = true;
        this.l = this.l || pv0Var.getIsBatteryOptimizationsEnabled();
        if (!this.m && !pv0Var.getIsBackgroundActivityDisabled()) {
            z = false;
        }
        this.m = z;
    }
}
