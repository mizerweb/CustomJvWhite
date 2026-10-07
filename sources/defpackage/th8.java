package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import one.me.login.inputphone.InputPhoneScreen;

/* JADX INFO: loaded from: classes.dex */
public final class th8 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ kbc f;
    public final /* synthetic */ InputPhoneScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th8(InputPhoneScreen inputPhoneScreen, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = inputPhoneScreen;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        InputPhoneScreen inputPhoneScreen = this.g;
        switch (i) {
            case 0:
                th8 th8Var = new th8(inputPhoneScreen, (lq4) obj3, 0);
                th8Var.f = (kbc) obj2;
                th8Var.invokeSuspend(sbiVar);
                break;
            default:
                th8 th8Var2 = new th8(inputPhoneScreen, (lq4) obj3, 1);
                th8Var2.f = (kbc) obj2;
                th8Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        InputPhoneScreen inputPhoneScreen = this.g;
        kbc kbcVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = InputPhoneScreen.v;
                inputPhoneScreen.r1().onThemeChanged(kbcVar);
                break;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = InputPhoneScreen.v;
                Drawable background = ((View) inputPhoneScreen.i.m(inputPhoneScreen, InputPhoneScreen.v[1])).getBackground();
                sza szaVar = background instanceof sza ? (sza) background : null;
                if (szaVar != null) {
                    szaVar.onThemeChanged(kbcVar);
                }
                break;
        }
        return sbiVar;
    }
}
