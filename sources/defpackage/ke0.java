package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class ke0 extends mdh implements vf7 {
    public /* synthetic */ Throwable e;
    public /* synthetic */ long f;

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        ke0 ke0Var = new ke0(4, (lq4) obj4);
        ke0Var.e = (Throwable) obj2;
        ke0Var.f = jLongValue;
        return ke0Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.e;
        long j = this.f;
        ch3.d0(obj);
        return Boolean.valueOf((th instanceof TamErrorException) && cqk.d(((TamErrorException) th).a.b, "session.sequence") && j < 3);
    }
}
