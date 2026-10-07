package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gma implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ nma c;

    public /* synthetic */ gma(yx6 yx6Var, nma nmaVar, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = nmaVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0150  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        fma fmaVar;
        yx6 yx6Var;
        ima imaVar;
        yx6 yx6Var2;
        jma jmaVar;
        int i;
        lma lmaVar;
        vg4 vg4VarW;
        gi4 gi4Var;
        vg4 vg4VarW2;
        mma mmaVar;
        int i2 = this.a;
        sbi sbiVar = sbi.a;
        nma nmaVar = this.c;
        yx6 yx6Var3 = this.b;
        hu4 hu4Var = hu4.a;
        int i3 = 0;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        int i4 = 0;
        String str = null;
        switch (i2) {
            case 0:
                if (lq4Var instanceof fma) {
                    fmaVar = (fma) lq4Var;
                    int i5 = fmaVar.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        fmaVar.e = i5 - Integer.MIN_VALUE;
                    } else {
                        fmaVar = new fma(this, lq4Var);
                    }
                } else {
                    fmaVar = new fma(this, lq4Var);
                }
                Object objK = fmaVar.d;
                int i6 = fmaVar.e;
                if (i6 == 0) {
                    ch3.d0(objK);
                    fmaVar.g = yx6Var3;
                    fmaVar.h = 0;
                    fmaVar.e = 1;
                    zv8[] zv8VarArr = nma.y1;
                    objK = nmaVar.K((Long) obj, false, fmaVar);
                    if (objK != hu4Var) {
                    }
                    yx6Var = yx6Var3;
                    return hu4Var;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        ch3.d0(objK);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = fmaVar.h;
                yx6 yx6Var4 = fmaVar.g;
                ch3.d0(objK);
                yx6Var = yx6Var4;
                yx6Var = yx6Var3;
                fmaVar.g = null;
                fmaVar.h = i3;
                fmaVar.e = 2;
                if (yx6Var.emit(objK, fmaVar) != hu4Var) {
                    return sbiVar;
                }
                yx6Var = yx6Var3;
                return hu4Var;
            case 1:
                if (lq4Var instanceof ima) {
                    imaVar = (ima) lq4Var;
                    int i7 = imaVar.e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        imaVar.e = i7 - Integer.MIN_VALUE;
                    } else {
                        imaVar = new ima(this, lq4Var);
                    }
                } else {
                    imaVar = new ima(this, lq4Var);
                }
                Object objC = imaVar.d;
                int i8 = imaVar.e;
                if (i8 == 0) {
                    ch3.d0(objC);
                    imaVar.g = yx6Var3;
                    imaVar.h = 0;
                    imaVar.e = 1;
                    objC = nma.C(nmaVar, (ila) obj, imaVar);
                    if (objC != hu4Var) {
                    }
                    yx6Var2 = yx6Var3;
                    return hu4Var;
                }
                if (i8 != 1) {
                    if (i8 == 2) {
                        ch3.d0(objC);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = imaVar.h;
                yx6 yx6Var5 = imaVar.g;
                ch3.d0(objC);
                yx6Var2 = yx6Var5;
                yx6Var2 = yx6Var3;
                imaVar.g = null;
                imaVar.h = i4;
                imaVar.e = 2;
                if (yx6Var2.emit(objC, imaVar) != hu4Var) {
                    return sbiVar;
                }
                yx6Var2 = yx6Var3;
                return hu4Var;
            case 2:
                t73 t73Var = nmaVar.d;
                if (lq4Var instanceof jma) {
                    jmaVar = (jma) lq4Var;
                    int i9 = jmaVar.e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        jmaVar.e = i9 - Integer.MIN_VALUE;
                    } else {
                        jmaVar = new jma(this, lq4Var);
                    }
                } else {
                    jmaVar = new jma(this, lq4Var);
                }
                Object obj2 = jmaVar.d;
                int i10 = jmaVar.e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ch3.d0(obj2);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj2);
                rt2 rt2Var = (rt2) obj;
                t73Var.getClass();
                if (t73Var == t73.e) {
                    i = R.string.reply;
                } else if (t73Var.a()) {
                    i = R.string.comments_input_hint;
                } else if (rt2Var != null && rt2Var.d0()) {
                    i = R.string.channel_input_hint;
                } else if (t73Var.i()) {
                    rt2 rt2Var2 = (rt2) nmaVar.c.getValue();
                    if (rt2Var2 != null ? rt2Var2.y0() : false) {
                        i = R.string.reminder_input_hint;
                    } else {
                        i = R.string.chat_input_hint;
                    }
                } else {
                    i = R.string.chat_input_hint;
                }
                tnh tnhVar = new tnh(i);
                jmaVar.e = 1;
                return yx6Var3.emit(tnhVar, jmaVar) == hu4Var ? hu4Var : sbiVar;
            case 3:
                if (lq4Var instanceof lma) {
                    lmaVar = (lma) lq4Var;
                    int i11 = lmaVar.e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        lmaVar.e = i11 - Integer.MIN_VALUE;
                    } else {
                        lmaVar = new lma(this, lq4Var);
                    }
                } else {
                    lmaVar = new lma(this, lq4Var);
                }
                Object obj3 = lmaVar.d;
                int i12 = lmaVar.e;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj3);
                rt2 rt2Var3 = (rt2) obj;
                if (rt2Var3 != null && (vg4VarW2 = rt2Var3.w()) != null && (vg4VarW2.a.b.z.b & 16) != 0 && nmaVar.d.h()) {
                    z = true;
                }
                if (rt2Var3 != null && (vg4VarW = rt2Var3.w()) != null && (gi4Var = vg4VarW.a.b.t) != null) {
                    str = gi4Var.a;
                }
                kla klaVar = new kla(z, str);
                lmaVar.e = 1;
                return yx6Var3.emit(klaVar, lmaVar) == hu4Var ? hu4Var : sbiVar;
            default:
                if (lq4Var instanceof mma) {
                    mmaVar = (mma) lq4Var;
                    int i13 = mmaVar.e;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        mmaVar.e = i13 - Integer.MIN_VALUE;
                    } else {
                        mmaVar = new mma(this, lq4Var);
                    }
                } else {
                    mmaVar = new mma(this, lq4Var);
                }
                Object obj4 = mmaVar.d;
                int i14 = mmaVar.e;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ch3.d0(obj4);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj4);
                rt2 rt2Var4 = (rt2) obj;
                zv8[] zv8VarArr2 = nma.y1;
                boolean zA = sol.a(rt2Var4, (wo6) nmaVar.g.getValue());
                gha ghaVar = gha.a;
                if (zA) {
                    nx2 nx2Var = rt2Var4.b;
                    boolean z2 = nx2Var.n0 > 0;
                    boolean z3 = nx2Var.p0 > 0;
                    if (z2 && z3) {
                        ghaVar = gha.c;
                    } else if (z2) {
                        ghaVar = gha.b;
                    }
                }
                mmaVar.e = 1;
                return yx6Var3.emit(ghaVar, mmaVar) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
