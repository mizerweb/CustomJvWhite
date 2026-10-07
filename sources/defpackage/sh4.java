package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class sh4 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ xh4 c;

    public /* synthetic */ sh4(yx6 yx6Var, xh4 xh4Var, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = xh4Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        rh4 rh4Var;
        th4 th4Var;
        Object bq2Var;
        int i = this.a;
        sbi sbiVar = sbi.a;
        xh4 xh4Var = this.c;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        Object xp2Var = null;
        switch (i) {
            case 0:
                if (lq4Var instanceof rh4) {
                    rh4Var = (rh4) lq4Var;
                    int i2 = rh4Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        rh4Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        rh4Var = new rh4(this, lq4Var);
                    }
                } else {
                    rh4Var = new rh4(this, lq4Var);
                }
                Object obj2 = rh4Var.d;
                int i3 = rh4Var.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj2);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj2);
                xh4.n(xh4Var, (vg4) obj);
                vp2 vp2Var = new vp2(new jq2(R.string.profile_edit_shortlink_contact_title, false, false, false, null), ((dq2) xh4Var.g.getValue()).a(xh4Var));
                rh4Var.e = 1;
                return yx6Var.emit(vp2Var, rh4Var) == hu4Var ? hu4Var : sbiVar;
            default:
                if (lq4Var instanceof th4) {
                    th4Var = (th4) lq4Var;
                    int i4 = th4Var.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        th4Var.e = i4 - Integer.MIN_VALUE;
                    } else {
                        th4Var = new th4(this, lq4Var);
                    }
                } else {
                    th4Var = new th4(this, lq4Var);
                }
                Object obj3 = th4Var.d;
                int i5 = th4Var.e;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj3);
                xp0 xp0Var = (xp0) obj;
                if (xp0Var != null && xp0Var.a == xh4Var.p.get()) {
                    yhh yhhVar = xp0Var.b;
                    String str = yhhVar.b;
                    String str2 = yhhVar.d;
                    if (str2 == null || str2.length() == 0) {
                        if (cqk.d(str, "service.unavailable") || cqk.d(str, "service.timeout")) {
                            bq2Var = aq2.a;
                        } else {
                            bq2Var = cqk.d(str, "io.exception") ? zp2.a : new bq2(new tnh(R.string.common_error_base_retry));
                        }
                        xp2Var = bq2Var;
                    } else {
                        xp2Var = new xp2(new xnh(str2));
                    }
                }
                if (xp2Var == null) {
                    return sbiVar;
                }
                th4Var.e = 1;
                return yx6Var.emit(xp2Var, th4Var) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
