package defpackage;

import android.text.SpannableString;
import android.widget.TextView;
import kotlin.collections.a;
import one.me.login.inputphone.InputPhoneScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class wh8 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ TextView f;
    public /* synthetic */ kbc g;
    public final /* synthetic */ InputPhoneScreen h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh8(InputPhoneScreen inputPhoneScreen, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.h = inputPhoneScreen;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        InputPhoneScreen inputPhoneScreen = this.h;
        TextView textView = (TextView) obj;
        kbc kbcVar = (kbc) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                wh8 wh8Var = new wh8(inputPhoneScreen, lq4Var, 0);
                wh8Var.f = textView;
                wh8Var.g = kbcVar;
                wh8Var.invokeSuspend(sbiVar);
                break;
            default:
                wh8 wh8Var2 = new wh8(inputPhoneScreen, lq4Var, 1);
                wh8Var2.f = textView;
                wh8Var2.g = kbcVar;
                wh8Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                TextView textView = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                InputPhoneScreen inputPhoneScreen = this.h;
                zv8[] zv8VarArr = InputPhoneScreen.v;
                textView.setTextColor(inputPhoneScreen.s1().q ? kbcVar.getText().j : kbcVar.getText().e);
                break;
            default:
                TextView textView2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                textView2.setTextColor(kbcVar2.getText().d);
                InputPhoneScreen inputPhoneScreen2 = this.h;
                zv8[] zv8VarArr2 = InputPhoneScreen.v;
                TextView textView3 = (TextView) inputPhoneScreen2.m.m(inputPhoneScreen2, InputPhoneScreen.v[5]);
                String strQ = np4.q(inputPhoneScreen2.getContext(), R.string.oneme_login_welcome_privacy_policy_clickable_part);
                String strQ2 = np4.q(inputPhoneScreen2.getContext(), R.string.oneme_login_welcome_user_agreement_clickable_part);
                String strQ3 = np4.q(inputPhoneScreen2.getContext(), R.string.oneme_login_welcome_recom_clickable_part);
                String strW = qe7.w(R.string.oneme_login_welcome_terms_args, inputPhoneScreen2.getContext(), a.n1(new Object[]{strQ, strQ2, strQ3}));
                SpannableString spannableString = new SpannableString(strW);
                inputPhoneScreen2.t1(strW, strQ, spannableString, new uh8(inputPhoneScreen2, np4.q(inputPhoneScreen2.getContext(), R.string.oneme_privacy_policy_link)), kbcVar2);
                inputPhoneScreen2.t1(strW, strQ2, spannableString, new uh8(inputPhoneScreen2, np4.q(inputPhoneScreen2.getContext(), R.string.oneme_user_agreement_link)), kbcVar2);
                inputPhoneScreen2.t1(strW, strQ3, spannableString, new uh8(inputPhoneScreen2, np4.q(inputPhoneScreen2.getContext(), R.string.oneme_user_agreement_recom_link)), kbcVar2);
                textView3.setText(spannableString);
                break;
        }
        return sbi.a;
    }
}
