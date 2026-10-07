package defpackage;

import one.me.login.confirm.ConfirmPhoneScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class lb4 extends nq4 {
    public rbg d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ConfirmPhoneScreen f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb4(lq4 lq4Var, ConfirmPhoneScreen confirmPhoneScreen) {
        super(lq4Var);
        this.f = confirmPhoneScreen;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return ConfirmPhoneScreen.o1(this.f, null, this);
    }
}
