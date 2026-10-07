package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class jnc extends mdh implements vf7 {
    public /* synthetic */ Throwable e;

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        jnc jncVar = new jnc(4, (lq4) obj4);
        jncVar.e = (Throwable) obj2;
        return jncVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.e;
        ch3.d0(obj);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ParticipantsRepository", qv1.k("ParticipantsUpdates retry due to ", th.getMessage()), th);
            }
        }
        return Boolean.valueOf(!(th instanceof CancellationException));
    }
}
