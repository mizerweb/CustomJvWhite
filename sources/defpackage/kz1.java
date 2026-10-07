package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kz1 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ h02 c;

    public /* synthetic */ kz1(yx6 yx6Var, h02 h02Var, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = h02Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        jz1 jz1Var;
        vz1 vz1Var;
        int i = this.a;
        sbi sbiVar = sbi.a;
        h02 h02Var = this.c;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                if (lq4Var instanceof jz1) {
                    jz1Var = (jz1) lq4Var;
                    int i2 = jz1Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        jz1Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        jz1Var = new jz1(this, lq4Var);
                    }
                } else {
                    jz1Var = new jz1(this, lq4Var);
                }
                Object obj2 = jz1Var.d;
                int i3 = jz1Var.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj2);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj2);
                p32 p32Var = h02Var.f;
                int size = ((enc) obj).c.size() + 1;
                String quantityString = p32Var.a.getResources().getQuantityString(R.plurals.call_users_info_count, size, Integer.valueOf(size));
                jz1Var.e = 1;
                return yx6Var.emit(quantityString, jz1Var) == hu4Var ? hu4Var : sbiVar;
            default:
                if (lq4Var instanceof vz1) {
                    vz1Var = (vz1) lq4Var;
                    int i4 = vz1Var.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        vz1Var.e = i4 - Integer.MIN_VALUE;
                    } else {
                        vz1Var = new vz1(this, lq4Var);
                    }
                } else {
                    vz1Var = new vz1(this, lq4Var);
                }
                Object obj3 = vz1Var.d;
                int i5 = vz1Var.e;
                if (i5 == 0) {
                    ch3.d0(obj3);
                    Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue() && ((l9) h02Var.e.r.a.getValue()).e.f == x7j.c);
                    vz1Var.e = 1;
                    return yx6Var.emit(boolValueOf, vz1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i5 == 1) {
                    ch3.d0(obj3);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
