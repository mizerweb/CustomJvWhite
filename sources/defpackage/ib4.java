package defpackage;

import android.widget.TextView;
import one.me.login.confirm.ConfirmPhoneScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class ib4 extends nq4 {
    public TextView d;
    public int e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ConfirmPhoneScreen h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib4(ConfirmPhoneScreen confirmPhoneScreen, nq4 nq4Var) {
        super(nq4Var);
        this.h = confirmPhoneScreen;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        zv8[] zv8VarArr = ConfirmPhoneScreen.z;
        return this.h.p1(null, 0, false, this);
    }
}
