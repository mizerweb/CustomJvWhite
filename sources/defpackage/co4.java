package defpackage;

import java.util.Arrays;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class co4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ do4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co4(do4 do4Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = do4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new co4(this.g, lq4Var, 0);
            default:
                return new co4(this.g, lq4Var, 1);
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
                break;
        }
        return ((co4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        do4 do4Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1 || i2 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                rt2 rt2Var = (rt2) ((xn3) do4Var.f.getValue()).k(do4Var.b).a.getValue();
                if (rt2Var == null || !pll.d(rt2Var, (e5d) do4Var.g.getValue(), do4Var.c.h(), null)) {
                    this.f = 2;
                    if (do4.f(do4Var, this) != hu4Var) {
                        return sbiVar;
                    }
                } else {
                    String strF = rt2Var.F();
                    if (strF == null) {
                        strF = "";
                    }
                    pzf pzfVar = do4Var.j;
                    yn4 yn4Var = new yn4(new tnh(R.string.oneme_confirm_send_message_title), new vnh(R.string.oneme_confirm_send_message_description, a.n1(Arrays.copyOf(new Object[]{strF}, 1))), xw3.P0(new kc4(R.id.oneme_contact_picker_confirm_send_message_positive, new tnh(R.string.oneme_confirm_send_message_positive), 3, 32), new kc4(R.id.oneme_contact_picker_confirm_send_message_negative, new tnh(R.string.oneme_confirm_send_message_negative), 2, 32)));
                    this.f = 1;
                    if (pzfVar.emit(yn4Var, this) != hu4Var) {
                        return sbiVar;
                    }
                }
                return hu4Var;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return do4.f(do4Var, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
