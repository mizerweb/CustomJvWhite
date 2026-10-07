package defpackage;

import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class hjf extends dw6 {
    public final boolean g;
    public final occ h;
    public final occ i;
    public final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjf(boolean z, occ occVar, occ occVar2, esh eshVar, fi1 fi1Var, CidLogger cidLogger) {
        super(eshVar, fi1Var, cidLogger);
        eshVar.getClass();
        fi1Var.getClass();
        this.g = z;
        this.h = occVar;
        this.i = occVar2;
        this.j = "ServerTopologyFirstDataStat";
    }

    @Override // defpackage.bw6
    public final void a() {
        if (this.g) {
            return;
        }
        h();
        this.e = 4;
    }

    @Override // defpackage.dw6, defpackage.bw6
    public final void c() {
        if (((Boolean) this.i.invoke()).booleanValue()) {
            if (((Number) this.h.invoke()).intValue() == 0) {
                this.d = true;
            } else {
                super.c();
            }
        }
    }

    @Override // defpackage.bw6
    public final void d() {
        if (this.g) {
            h();
            this.e = 6;
        }
    }

    @Override // defpackage.bw6
    public final void e() {
        if (((Boolean) this.i.invoke()).booleanValue()) {
            h();
            this.e = 5;
        }
    }

    @Override // defpackage.dw6
    public final String g() {
        return this.j;
    }
}
