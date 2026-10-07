package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ql3 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Throwable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql3(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        Throwable th = (Throwable) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                ql3 ql3Var = new ql3(i2, lq4Var, 0);
                ql3Var.f = th;
                ql3Var.invokeSuspend(sbiVar);
                break;
            default:
                ql3 ql3Var2 = new ql3(i2, lq4Var, 1);
                ql3Var2.f = th;
                ql3Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Throwable th = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                gm0.V("ChatVM/MissedContactsController", "fail", th);
                return sbiVar;
            default:
                ch3.d0(obj);
                if (th instanceof CancellationException) {
                    throw th;
                }
                gm0.V("MiniChatsUpdated", "fail", th);
                return sbiVar;
        }
    }
}
