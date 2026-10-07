package defpackage;

import java.util.Arrays;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vwc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ wwc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vwc(wwc wwcVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = wwcVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        wwc wwcVar = this.f;
        switch (i) {
            case 0:
                return new vwc(wwcVar, lq4Var, 0);
            case 1:
                return new vwc(wwcVar, lq4Var, 1);
            default:
                return new vwc(wwcVar, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((vwc) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((vwc) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((vwc) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        wwc wwcVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                mjg mjgVar = wwcVar.l;
                rwc rwcVarA = rwc.a((rwc) mjgVar.getValue(), null, null, null, null, null, null, true, 63);
                mjgVar.getClass();
                mjgVar.j(null, rwcVarA);
                return sbiVar;
            case 1:
                ch3.d0(obj);
                rt2 rt2Var = (rt2) ((xn3) wwcVar.k.getValue()).k(wwcVar.c).a.getValue();
                if (cqk.d(rt2Var != null ? Boolean.valueOf(pll.d(rt2Var, (e5d) wwcVar.j.getValue(), wwcVar.d.h(), null)) : null, Boolean.TRUE)) {
                    String strF = rt2Var.F();
                    if (strF == null) {
                        strF = "";
                    }
                    int i2 = 32;
                    a8j.x(wwcVar.o, new lwc(new tnh(R.string.oneme_confirm_send_message_title), new vnh(R.string.oneme_confirm_send_message_description, a.n1(Arrays.copyOf(new Object[]{strF}, 1))), xw3.P0(new kc4(R.id.oneme_location_confirm_send_message_positive, new tnh(R.string.oneme_confirm_send_message_positive), 3, i2), new kc4(R.id.oneme_location_confirm_send_message_negative, new tnh(R.string.oneme_confirm_send_message_negative), 2, i2))));
                } else {
                    wwcVar.C();
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                h8c h8cVar = (h8c) wwcVar.i.getValue();
                h8cVar.m(new tnh(R.string.oneme_location_map_location_error));
                return h8cVar.p();
        }
    }
}
