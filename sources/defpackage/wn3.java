package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wn3 extends mdh implements qf7 {
    public /* synthetic */ Object e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn3(long j, int i, long j2, int i2, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = j;
        this.g = i;
        this.h = j2;
        this.i = i2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        wn3 wn3Var = new wn3(this.f, this.g, this.h, this.i, lq4Var);
        wn3Var.e = obj;
        return wn3Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        wn3 wn3Var = (wn3) create((tw2) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        wn3Var.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        tw2 tw2Var = (tw2) this.e;
        ch3.d0(obj);
        tw2Var.W = this.f;
        tw2Var.X = this.g;
        tw2Var.Y = this.h;
        tw2Var.Z = this.i;
        return sbi.a;
    }
}
