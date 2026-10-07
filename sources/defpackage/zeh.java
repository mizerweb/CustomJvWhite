package defpackage;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class zeh extends mdh implements qf7 {
    public long e;
    public int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ afh h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zeh(int i, afh afhVar, long j, long j2, long j3, long j4, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = i;
        this.h = afhVar;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = j4;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new zeh(this.g, this.h, this.i, this.j, this.k, this.l, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((zeh) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long j;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            long jH = this.g > 99 ? i4e.b.h(200L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) : 0L;
            this.e = jH;
            this.f = 1;
            Object objT = rx8.t(jH, this);
            hu4 hu4Var = hu4.a;
            if (objT == hu4Var) {
                return hu4Var;
            }
            j = jH;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.e;
            ch3.d0(obj);
        }
        afh afhVar = this.h;
        iz2.c((iz2) afhVar.c.getValue(), this.i, this.j, this.k, this.l, 0L, mg5.REGULAR);
        ((lz2) afhVar.e.getValue()).a(10, j);
        return sbi.a;
    }
}
