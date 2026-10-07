package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u49 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ u49(yx6 yx6Var, String str, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        t49 t49Var;
        nhh nhhVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        String str = this.c;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (lq4Var instanceof t49) {
                    t49Var = (t49) lq4Var;
                    int i2 = t49Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        t49Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        t49Var = new t49(this, lq4Var);
                    }
                } else {
                    t49Var = new t49(this, lq4Var);
                }
                Object obj3 = t49Var.d;
                int i3 = t49Var.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj3);
                for (Object obj4 : (List) obj) {
                    if (cqk.d(((r17) obj4).a, str)) {
                        obj2 = obj4;
                        if (obj2 != null) {
                            return sbiVar;
                        }
                        t49Var.e = 1;
                        if (yx6Var.emit(obj2, t49Var) == hu4Var) {
                            return hu4Var;
                        }
                        return sbiVar;
                    }
                }
                if (obj2 != null) {
                    return sbiVar;
                }
                t49Var.e = 1;
                if (yx6Var.emit(obj2, t49Var) == hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            default:
                if (lq4Var instanceof nhh) {
                    nhhVar = (nhh) lq4Var;
                    int i4 = nhhVar.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        nhhVar.e = i4 - Integer.MIN_VALUE;
                    } else {
                        nhhVar = new nhh(this, lq4Var);
                    }
                } else {
                    nhhVar = new nhh(this, lq4Var);
                }
                Object obj5 = nhhVar.d;
                int i5 = nhhVar.e;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj5);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj5);
                if (!r5h.L0((String) obj, str, false)) {
                    return sbiVar;
                }
                nhhVar.e = 1;
                return yx6Var.emit(obj, nhhVar) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
