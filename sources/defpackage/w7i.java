package defpackage;

import android.view.ViewGroup;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class w7i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ TwoFAOnboardingScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7i(lq4 lq4Var, TwoFAOnboardingScreen twoFAOnboardingScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = twoFAOnboardingScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        TwoFAOnboardingScreen twoFAOnboardingScreen = this.g;
        switch (i) {
            case 0:
                w7i w7iVar = new w7i(lq4Var, twoFAOnboardingScreen, 0);
                w7iVar.f = obj;
                return w7iVar;
            default:
                w7i w7iVar2 = new w7i(lq4Var, twoFAOnboardingScreen, 1);
                w7iVar2.f = obj;
                return w7iVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((w7i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((w7i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof i65) {
                    n7i.b.e((i65) rbbVar);
                }
                break;
            default:
                Object obj3 = this.f;
                ch3.d0(obj);
                m7i m7iVar = (m7i) obj3;
                zv8[] zv8VarArr = TwoFAOnboardingScreen.g;
                boolean z = m7iVar instanceof k7i;
                TwoFAOnboardingScreen twoFAOnboardingScreen = this.g;
                if (z) {
                    h8c h8cVar = new h8c(twoFAOnboardingScreen);
                    k7i k7iVar = (k7i) m7iVar;
                    h8cVar.h(new w8c(k7iVar.b));
                    h8cVar.m(k7iVar.a);
                    ViewGroup.LayoutParams layoutParams = twoFAOnboardingScreen.o1().getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    h8cVar.c(new o8c(0, 0, twoFAOnboardingScreen.o1().getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0), 11));
                    h8cVar.p();
                    twoFAOnboardingScreen.o1().setLoading(false);
                } else if (m7iVar instanceof l7i) {
                    twoFAOnboardingScreen.o1().setLoading(((l7i) m7iVar).a);
                }
                break;
        }
        return sbiVar;
    }
}
