package defpackage;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class zy6 extends mdh implements cf7 {
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy6(long j, lq4 lq4Var) {
        super(1, lq4Var);
        this.e = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new zy6(this.e, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        ((zy6) create((lq4) obj)).invokeSuspend(sbi.a);
        throw null;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) ew5.t(this.e)), null);
    }
}
