package defpackage;

import android.os.Build;
import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class qm1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ym1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm1(ym1 ym1Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = ym1Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ym1 ym1Var = this.f;
        switch (i) {
            case 0:
                return new qm1(ym1Var, lq4Var, 0);
            default:
                return new qm1(ym1Var, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((qm1) create((f62) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((qm1) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                ym1 ym1Var = this.f;
                MainActivity mainActivity = ym1Var.n;
                if (mainActivity != null && ym1Var.q() && Build.VERSION.SDK_INT >= 31) {
                    MainActivity mainActivity2 = ym1Var.n;
                    if ((mainActivity2 == null ? false : mainActivity2.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) && ym1Var.l()) {
                        if (ym1Var.g() && ((f62) ((n42) ym1Var.a).f.a.getValue()).d) {
                            z = true;
                        }
                        try {
                            mainActivity.setPictureInPictureParams(ym1Var.i(z));
                        } catch (IllegalStateException e) {
                            om1 om1Var = new om1("Failed to update auto-enter pip params", e);
                            String name = ym1.class.getName();
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, name, zo5.s("shouldAutoEnter=", z), om1Var);
                                }
                            }
                        }
                    }
                }
                break;
            default:
                ch3.d0(obj);
                ym1 ym1Var2 = this.f;
                MainActivity mainActivity3 = ym1Var2.n;
                if (mainActivity3 != null) {
                    if (mainActivity3 != null ? mainActivity3.isInPictureInPictureMode() : false) {
                        MainActivity mainActivity4 = ym1Var2.n;
                        if (mainActivity4 == null ? false : mainActivity4.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                            try {
                                mainActivity3.setPictureInPictureParams(ym1Var2.i(false));
                            } catch (IllegalStateException e2) {
                                gm0.V(ym1.class.getName(), "Pip feature available but setPictureInPictureParams failed", e2);
                            }
                        }
                    }
                }
                break;
        }
        return sbi.a;
    }
}
