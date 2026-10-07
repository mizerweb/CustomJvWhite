package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jm0 extends mdh implements qf7 {
    public final /* synthetic */ Object e;
    public final /* synthetic */ gu4 f;
    public final /* synthetic */ nm0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm0(Object obj, lq4 lq4Var, gu4 gu4Var, nm0 nm0Var, boolean z, boolean z2) {
        super(2, lq4Var);
        this.e = obj;
        this.f = gu4Var;
        this.g = nm0Var;
        this.h = z;
        this.i = z2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new jm0(this.e, lq4Var, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((jm0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        nbc nbcVar = (nbc) this.e;
        if (nbcVar == null) {
            return null;
        }
        zv8[] zv8VarArr = nm0.i;
        return yab.h(this.f, ((n0c) ((xhh) this.g.c.getValue())).a(), 0, new im0(nbcVar, this.h, this.g, this.i, null), 2);
    }
}
