package defpackage;

import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class mc8 extends dw6 {
    public final /* synthetic */ int g = 0;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final int k;
    public final fg7 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc8(occ occVar, boolean z, boolean z2, esh eshVar, fi1 fi1Var, CidLogger cidLogger) {
        super(eshVar, fi1Var, cidLogger);
        eshVar.getClass();
        fi1Var.getClass();
        this.l = occVar;
        this.h = z;
        this.i = z2;
        this.j = "incomingP2PFirstDataStat";
        this.k = 3;
    }

    @Override // defpackage.bw6
    public void a() {
        switch (this.g) {
            case 0:
                h();
                break;
            case 1:
                h();
                break;
        }
    }

    @Override // defpackage.dw6, defpackage.bw6
    public final void c() {
        int i = this.g;
        boolean z = this.i;
        boolean z2 = this.h;
        fg7 fg7Var = this.l;
        switch (i) {
            case 0:
                if (!((Boolean) ((occ) fg7Var).invoke()).booleanValue() && !z2 && !z) {
                    super.c();
                    break;
                }
                break;
            case 1:
                if (!((Boolean) ((occ) fg7Var).invoke()).booleanValue() && !z2 && z) {
                    super.c();
                    break;
                }
                break;
            default:
                if (!((Boolean) ((occ) fg7Var).invoke()).booleanValue() && z2 && !z) {
                    super.c();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bw6
    public void d() {
        switch (this.g) {
            case 1:
                h();
                break;
            case 2:
                h();
                break;
        }
    }

    @Override // defpackage.dw6
    public final int f() {
        switch (this.g) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.k;
    }

    @Override // defpackage.dw6
    public final String g() {
        switch (this.g) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc8(occ occVar, boolean z, boolean z2, esh eshVar, fi1 fi1Var, CidLogger cidLogger, byte b) {
        super(eshVar, fi1Var, cidLogger);
        eshVar.getClass();
        fi1Var.getClass();
        this.l = occVar;
        this.h = z;
        this.i = z2;
        this.j = "JoinP2PFirstDataStat";
        this.k = 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc8(occ occVar, boolean z, boolean z2, esh eshVar, fi1 fi1Var, CidLogger cidLogger, char c) {
        super(eshVar, fi1Var, cidLogger);
        eshVar.getClass();
        fi1Var.getClass();
        this.l = occVar;
        this.h = z;
        this.i = z2;
        this.j = "OutgoingP2PFirstDataStat";
        this.k = 2;
    }
}
