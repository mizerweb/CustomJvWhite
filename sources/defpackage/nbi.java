package defpackage;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes.dex */
public final class nbi extends mdh implements vf7 {
    public int e;
    public /* synthetic */ Throwable f;
    public /* synthetic */ long g;

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        nbi nbiVar = new nbi(4, (lq4) obj4);
        nbiVar.f = (Throwable) obj2;
        nbiVar.g = jLongValue;
        return nbiVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            Throwable th = this.f;
            long j = this.g;
            n1g.x().t(obi.a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, obi.b);
            this.e = 1;
            Object objT = rx8.t(jMin, this);
            hu4 hu4Var = hu4.a;
            if (objT == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return Boolean.TRUE;
    }
}
