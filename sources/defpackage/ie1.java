package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class ie1 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Throwable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie1(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        Throwable th = (Throwable) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                ie1 ie1Var = new ie1(i2, lq4Var, 0);
                ie1Var.f = th;
                ie1Var.invokeSuspend(sbiVar);
                break;
            case 1:
                ie1 ie1Var2 = new ie1(i2, lq4Var, 1);
                ie1Var2.f = th;
                ie1Var2.invokeSuspend(sbiVar);
                break;
            default:
                ie1 ie1Var3 = new ie1(i2, lq4Var, 2);
                ie1Var3.f = th;
                ie1Var3.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Throwable th = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (!(th instanceof CancellationException)) {
                    gm0.V("CallChatRepositoryTag", "fail no get chat", th);
                }
                break;
            case 1:
                ch3.d0(obj);
                gm0.V("se3", "catch error in chatUpdateFlow", th);
                break;
            default:
                ch3.d0(obj);
                gm0.V("ViewThemeUtils", "fail to change theme for spans", th);
                break;
        }
        return sbiVar;
    }
}
