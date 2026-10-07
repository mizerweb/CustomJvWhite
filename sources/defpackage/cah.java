package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class cah extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Throwable f;
    public final /* synthetic */ jah g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cah(jah jahVar, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = jahVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        jah jahVar = this.g;
        Throwable th = (Throwable) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                cah cahVar = new cah(jahVar, lq4Var, 0);
                cahVar.f = th;
                cahVar.invokeSuspend(sbiVar);
                break;
            default:
                cah cahVar2 = new cah(jahVar, lq4Var, 1);
                cahVar2.f = th;
                cahVar2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        jah jahVar = this.g;
        Throwable th = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (!(th instanceof CancellationException)) {
                    gm0.V(jahVar.m, "fail in chat observing", th);
                }
                break;
            default:
                ch3.d0(obj);
                if (!(th instanceof CancellationException)) {
                    gm0.V(jahVar.m, "fail in bot events observing", th);
                }
                break;
        }
        return sbiVar;
    }
}
