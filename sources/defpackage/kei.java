package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class kei extends mdh implements qf7 {
    public /* synthetic */ Object e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kei(long j, boolean z, int i, boolean z2, long j2, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = j;
        this.g = z;
        this.h = i;
        this.i = z2;
        this.j = j2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        kei keiVar = new kei(this.f, this.g, this.h, this.i, this.j, lq4Var);
        keiVar.e = obj;
        return keiVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        kei keiVar = (kei) create((tw2) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        keiVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        tw2 tw2Var = (tw2) this.e;
        ch3.d0(obj);
        long j = this.f;
        if (j >= 0) {
            Map map = tw2Var.e;
            mw mwVarV = map instanceof mw ? (mw) map : oc9.V(map);
            mwVarV.put(Long.valueOf(this.j), Long.valueOf(j));
            tw2Var.e = mwVarV;
        }
        boolean z = this.g;
        tw2Var.j0 = z;
        int i = this.h;
        if (i >= 0 && (z || this.i)) {
            tw2Var.m = i;
        }
        return sbi.a;
    }
}
