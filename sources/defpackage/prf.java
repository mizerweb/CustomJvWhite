package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class prf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ qrf g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ prf(qrf qrfVar, String str, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = qrfVar;
        this.h = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        String str = this.h;
        qrf qrfVar = this.g;
        switch (i) {
            case 0:
                return new prf(qrfVar, str, lq4Var, 0);
            default:
                return new prf(qrfVar, str, lq4Var, 1);
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
        return ((prf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.e;
        String str = this.h;
        hu4 hu4Var = hu4.a;
        qrf qrfVar = this.g;
        lq4 lq4Var = null;
        switch (i2) {
            case 0:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ge0 ge0Var = (ge0) qrfVar.h.getValue();
                this.f = 1;
                Object objA = ge0Var.a(str, this);
                return objA == hu4Var ? hu4Var : objA;
            default:
                int i4 = this.f;
                int i5 = 0;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                    } else {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                ch3.d0(obj);
                xt4 xt4VarB = ((n0c) ((xhh) qrfVar.e.getValue())).b();
                prf prfVar = new prf(qrfVar, str, lq4Var, i5);
                this.f = 1;
                obj = yab.K0(xt4VarB, prfVar, this);
                if (obj == hu4Var) {
                    return hu4Var;
                }
                ee0 ee0Var = (ee0) obj;
                boolean z = ee0Var instanceof ce0;
                xnh xnhVar = ynh.b;
                if (!z) {
                    if (!cqk.d(ee0Var, de0.a)) {
                        ore.o();
                        return null;
                    }
                    a8j.x(qrfVar.q, new bcg(new tnh(R.string.settings_devices_login_success), R.drawable.icon_check_round_fill, xnhVar, gm0.K(68.0f * yl5.d().getDisplayMetrics().density)));
                    a8j.x(qrfVar.p, rt3.b);
                    return sbi.a;
                }
                ce0 ce0Var = (ce0) ee0Var;
                if (ce0Var.equals(zd0.a)) {
                    zv8[] zv8VarArr = qrf.u;
                    yd0 yd0VarC = qrfVar.C();
                    yd0VarC.getClass();
                    yd0.a(yd0VarC, 6, 0, null, 6);
                    i = R.string.settings_devices_not_login_qr_error;
                } else if (ce0Var.equals(ae0.a)) {
                    i = R.string.settings_devices_expired_login_qr_error;
                } else {
                    if (!ce0Var.equals(be0.a)) {
                        ore.o();
                        return null;
                    }
                    i = R.string.settings_devices_base_login_qr_error;
                }
                a8j.x(qrfVar.q, new bcg(new tnh(i), R.drawable.icon_warning_fill, xnhVar, gm0.K(68.0f * yl5.d().getDisplayMetrics().density)));
                return sbi.a;
        }
    }
}
