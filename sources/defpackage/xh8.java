package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import one.me.login.inputphone.InputPhoneScreen;

/* JADX INFO: loaded from: classes.dex */
public final class xh8 implements TextWatcher {
    public String a;
    public final /* synthetic */ InputPhoneScreen b;

    public xh8(InputPhoneScreen inputPhoneScreen) {
        this.b = inputPhoneScreen;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String strValueOf = String.valueOf(charSequence);
        if (cqk.d(this.a, strValueOf)) {
            return;
        }
        zv8[] zv8VarArr = InputPhoneScreen.v;
        InputPhoneScreen inputPhoneScreen = this.b;
        bi8 bi8VarS1 = inputPhoneScreen.s1();
        bi8VarS1.getClass();
        bi8VarS1.p.B(bi8VarS1, bi8.u[1], a8j.t(bi8VarS1, null, new qn6(bi8VarS1, (lq4) null, 20), 1));
        this.a = strValueOf;
        vv vvVar = inputPhoneScreen.f;
        zv8 zv8Var = InputPhoneScreen.v[0];
        vvVar.b(inputPhoneScreen, strValueOf);
        bi8 bi8VarS2 = inputPhoneScreen.s1();
        bi8VarS2.d.c(inputPhoneScreen.r1().getCode(), strValueOf);
    }
}
