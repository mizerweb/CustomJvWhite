package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xb3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ xd3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb3(xd3 xd3Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = xd3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        xd3 xd3Var = this.f;
        switch (i) {
            case 0:
                return new xb3(xd3Var, lq4Var, 0);
            case 1:
                return new xb3(xd3Var, lq4Var, 1);
            default:
                return new xb3(xd3Var, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((xb3) create((ss6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((xb3) create((bj4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((xb3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        xd3 xd3Var = this.f;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ch3.d0(obj);
                a8j.x(xd3Var.L1, new mc3(R.string.chat_screen_file_too_big_title, new Integer(R.string.chat_screen_file_too_big_caption), null, 4));
                break;
            case 1:
                ch3.d0(obj);
                a8j.x(xd3Var.L1, new mc3(R.string.snackbar_contact_removed, new Integer(R.string.contact_not_support_unblock), new Integer(R.drawable.icon_block)));
                break;
            default:
                ch3.d0(obj);
                rt2 rt2Var = (rt2) xd3Var.G1.a.getValue();
                if (rt2Var != null) {
                    long jA = rt2Var.A();
                    hjc hjcVar = (hjc) xd3Var.D.getValue();
                    hjcVar.getClass();
                    if (jA != 0) {
                        hjcVar.g(jA, w50.STICKER, 0L);
                    }
                }
                break;
        }
        return sbiVar;
    }
}
