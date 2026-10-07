package defpackage;

import android.content.Intent;
import one.me.android.calls.CallNotifierFixActivity;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final class o85 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ y85 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o85(int i, lq4 lq4Var, y85 y85Var) {
        super(2, lq4Var);
        this.e = i;
        this.f = y85Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        y85 y85Var = this.f;
        switch (i) {
            case 0:
                return new o85(0, lq4Var, y85Var);
            default:
                return new o85(1, lq4Var, y85Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((o85) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((o85) create((tmc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        y85 y85Var = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                er3 er3Var = y85.N1;
                so1 so1Var = (so1) ((n92) y85Var.s.getValue()).b.getValue();
                so1Var.getClass();
                Intent intent = new Intent(so1Var.c(), (Class<?>) CallNotifierFixActivity.class);
                intent.setAction("action-open-call");
                intent.setFlags(268435456);
                intent.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, so1Var.a.a);
                so1Var.c().startActivity(intent);
                break;
            default:
                ch3.d0(obj);
                er3 er3Var2 = y85.N1;
                sa2 sa2VarO = y85Var.O();
                String strA = ns4.a(y85Var.K().c);
                boolean z = y85Var.K().i;
                sa2VarO.getClass();
                sa2.c(sa2VarO, "BAD_CONNECTION_ALERT", strA, "BAD_NETWORK", null, null, null, z, null, 376);
                break;
        }
        return sbiVar;
    }
}
