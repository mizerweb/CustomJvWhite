package defpackage;

import android.os.Parcelable;
import one.me.login.avatar.RegistrationAvatarScreen;
import one.me.login.inputname.InputNameScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ah8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ InputNameScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah8(InputNameScreen inputNameScreen, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.g = inputNameScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        InputNameScreen inputNameScreen = this.g;
        switch (i) {
            case 0:
                ah8 ah8Var = new ah8(lq4Var, inputNameScreen, 0);
                ah8Var.f = obj;
                return ah8Var;
            case 1:
                ah8 ah8Var2 = new ah8(inputNameScreen, lq4Var);
                ah8Var2.f = obj;
                return ah8Var2;
            default:
                ah8 ah8Var3 = new ah8(lq4Var, inputNameScreen, 2);
                ah8Var3.f = obj;
                return ah8Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((ah8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((ah8) create((xg8) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((ah8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        InputNameScreen inputNameScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (((Boolean) obj2).booleanValue()) {
                    ny8 ny8Var = inputNameScreen.h;
                    ny8 ny8Var2 = inputNameScreen.g;
                    zv8[] zv8VarArr = InputNameScreen.r;
                    if (!((wsc) ny8Var2.getValue()).c(wsc.g)) {
                        ((s7f) ((et3) ny8Var.getValue())).P();
                        wsc.i((wsc) ny8Var2.getValue(), new svj(inputNameScreen, 1));
                    } else if (!((wsc) ny8Var2.getValue()).c(wsc.h)) {
                        s7f s7fVar = (s7f) ((et3) ny8Var.getValue());
                        if (!((Boolean) s7fVar.G.m(s7fVar, s7f.j0[29])).booleanValue()) {
                            ((s7f) ((et3) ny8Var.getValue())).P();
                            wsc.i((wsc) ny8Var2.getValue(), new svj(inputNameScreen, 1));
                        }
                    }
                } else {
                    int i2 = uw8.a;
                    if (!uw8.b(uw8.c)) {
                        zv8[] zv8VarArr2 = InputNameScreen.r;
                        jac.o(inputNameScreen.p1());
                    }
                }
                return sbiVar;
            case 1:
                xg8 xg8Var = (xg8) obj2;
                ch3.d0(obj);
                if (xg8Var != null) {
                    ml9.b(inputNameScreen);
                    zv8[] zv8VarArr3 = InputNameScreen.r;
                    bk8 bk8Var = (bk8) inputNameScreen.i.getValue();
                    xge xgeVar = xg8Var.b;
                    Object objF0 = tre.f0(inputNameScreen.getArgs(), "screen:input_name:avatars", fgd.class);
                    if (objF0 != null) {
                        bk8Var.getClass();
                        bk8Var.c(oc9.e(new RegistrationAvatarScreen(xgeVar, (fgd) ((Parcelable) objF0), bk8Var.b), null, null), "InputNameScreen");
                        return sbiVar;
                    }
                    c.o(c0a.o("No value passed for key screen:input_name:avatars of type ", fgd.class.getSimpleName(), " in bundle"));
                } else {
                    ore.o();
                }
                return null;
            default:
                ch3.d0(obj);
                dc6 dc6Var = (dc6) obj2;
                zv8[] zv8VarArr4 = InputNameScreen.r;
                inputNameScreen.o1().setActiveButtonLoaderState(false);
                boolean z = dc6Var instanceof ug8;
                gac gacVar = gac.a;
                if (z) {
                    ug8 ug8Var = (ug8) dc6Var;
                    String strValueOf = String.valueOf(((ynh) ug8Var.a).b(inputNameScreen.getContext()));
                    int iD = qt4.D(ug8Var.c);
                    if (iD == 0) {
                        inputNameScreen.p1().m(strValueOf, gacVar);
                        return sbiVar;
                    }
                    if (iD == 1) {
                        inputNameScreen.q1().m(strValueOf, gacVar);
                        return sbiVar;
                    }
                    if (iD == 2) {
                        return sbiVar;
                    }
                    ore.o();
                } else if (dc6Var instanceof ev7) {
                    int iD2 = qt4.D(((ev7) dc6Var).a);
                    if (iD2 == 0) {
                        inputNameScreen.p1().j();
                        return sbiVar;
                    }
                    if (iD2 == 1) {
                        inputNameScreen.q1().j();
                        return sbiVar;
                    }
                    if (iD2 == 2) {
                        return sbiVar;
                    }
                    ore.o();
                } else {
                    if (!(dc6Var instanceof yge)) {
                        if (dc6Var instanceof d3g) {
                            inputNameScreen.q1().setHint(np4.q(inputNameScreen.getContext(), R.string.oneme_login_input_name_hint_surname_short));
                            inputNameScreen.q1().m(np4.q(inputNameScreen.getContext(), R.string.oneme_login_input_name_surname_placeholder), gac.b);
                            return sbiVar;
                        }
                        if (dc6Var instanceof lv7) {
                            inputNameScreen.q1().setHint(np4.q(inputNameScreen.getContext(), R.string.oneme_login_input_name_hint_surname));
                            inputNameScreen.q1().j();
                            return sbiVar;
                        }
                        if (!(dc6Var instanceof j2g)) {
                            return sbiVar;
                        }
                        jac.o(inputNameScreen.p1());
                        return sbiVar;
                    }
                    ag9 ag9Var = (ag9) ((yge) dc6Var).a;
                    if (ag9Var instanceof zf9) {
                        zf9 zf9Var = (zf9) ag9Var;
                        ((pd0) inputNameScreen.j.getValue()).a(new nd0(zf9Var.e));
                        kzi kziVar = new kzi(zf9Var.c, zf9Var.d, false);
                        inputNameScreen.a.getClass();
                        ku6.C(inputNameScreen, kziVar);
                        return sbiVar;
                    }
                    if (ag9Var instanceof yf9) {
                        inputNameScreen.p1().m(String.valueOf(((yf9) ag9Var).c.b(inputNameScreen.getContext())), gacVar);
                        return sbiVar;
                    }
                    ore.o();
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah8(lq4 lq4Var, InputNameScreen inputNameScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = inputNameScreen;
    }
}
