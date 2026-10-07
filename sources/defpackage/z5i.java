package defpackage;

import android.view.View;
import one.me.settings.twofa.password.TwoFACheckPassScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class z5i implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoFACheckPassScreen b;

    public /* synthetic */ z5i(TwoFACheckPassScreen twoFACheckPassScreen, int i) {
        this.a = i;
        this.b = twoFACheckPassScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lq4 lq4Var = null;
        switch (this.a) {
            case 0:
                TwoFACheckPassScreen twoFACheckPassScreen = this.b;
                zv8[] zv8VarArr = TwoFACheckPassScreen.n;
                j6i j6iVarP1 = twoFACheckPassScreen.p1();
                TwoFACheckPassScreen twoFACheckPassScreen2 = this.b;
                ylc inputTexts = ((b9i) twoFACheckPassScreen2.i.m(twoFACheckPassScreen2, TwoFACheckPassScreen.n[0])).getInputTexts();
                j6iVarP1.getClass();
                CharSequence charSequence = (CharSequence) inputTexts.a;
                CharSequence charSequenceY1 = charSequence != null ? r5h.y1(charSequence) : null;
                sgg sggVar = j6iVarP1.u;
                if (sggVar == null || !sggVar.isActive()) {
                    if (charSequenceY1 == null || charSequenceY1.length() == 0) {
                        j6iVarP1.u = null;
                        gm0.n(j6iVarP1.f, "Can't auth with password because password is empty");
                    } else {
                        j6iVarP1.u = a8j.t(j6iVarP1, ((n0c) ((xhh) j6iVarP1.j.getValue())).b(), new ryf(j6iVarP1, charSequenceY1, lq4Var, 22), 2);
                        if (this.b.o1() == mk8.a) {
                            this.b.q1(false);
                        }
                    }
                }
                break;
            default:
                TwoFACheckPassScreen twoFACheckPassScreen3 = this.b;
                zv8[] zv8VarArr2 = TwoFACheckPassScreen.n;
                j6i j6iVarP2 = twoFACheckPassScreen3.p1();
                j6iVarP2.v.B(j6iVarP2, j6i.y[0], yab.h0(j6iVarP2.b, ((n0c) ((xhh) j6iVarP2.j.getValue())).b(), 2, new xra(j6iVarP2, lq4Var, 25)));
                break;
        }
    }
}
