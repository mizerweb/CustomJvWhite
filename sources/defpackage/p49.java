package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p49 extends mdh implements qf7 {
    public final /* synthetic */ long e;
    public final /* synthetic */ c59 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p49(long j, c59 c59Var, long j2, long j3, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = j;
        this.f = c59Var;
        this.g = j2;
        this.h = j3;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new p49(this.e, this.f, this.g, this.h, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((p49) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ny8 ny8Var = this.f.c;
        ch3.d0(obj);
        long j = this.e;
        long j2 = this.g;
        if (j > 0) {
            return ((qfa) ny8Var.getValue()).l(j2);
        }
        if (j2 > 0) {
            return ((qfa) ny8Var.getValue()).f(this.h, j2);
        }
        return null;
    }
}
