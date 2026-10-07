package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class al3 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ rl3 c;

    public /* synthetic */ al3(yx6 yx6Var, rl3 rl3Var, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = rl3Var;
    }

    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0136  */
    /* JADX WARN: Code duplicated, block: B:85:0x0180  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        zk3 zk3Var;
        fl3 fl3Var;
        gl3 gl3Var;
        ml3 ml3Var;
        ylc ylcVar;
        pl3 pl3Var;
        vg4 vg4VarW;
        int i = this.a;
        sbi sbiVar = sbi.a;
        rl3 rl3Var = this.c;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (lq4Var instanceof zk3) {
                    zk3Var = (zk3) lq4Var;
                    int i2 = zk3Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        zk3Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        zk3Var = new zk3(this, lq4Var);
                    }
                } else {
                    zk3Var = new zk3(this, lq4Var);
                }
                Object obj3 = zk3Var.d;
                int i3 = zk3Var.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj3);
                zv8[] zv8VarArr = rl3.Z1;
                wh3 wh3Var = wh3.c;
                if (!cqk.d((wh3) obj, wh3Var) ? false : !cqk.d(rl3Var.w1.getValue(), wh3Var)) {
                    return sbiVar;
                }
                zk3Var.e = 1;
                return yx6Var.emit(obj, zk3Var) == hu4Var ? hu4Var : sbiVar;
            case 1:
                if (lq4Var instanceof fl3) {
                    fl3Var = (fl3) lq4Var;
                    int i4 = fl3Var.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        fl3Var.e = i4 - Integer.MIN_VALUE;
                    } else {
                        fl3Var = new fl3(this, lq4Var);
                    }
                } else {
                    fl3Var = new fl3(this, lq4Var);
                }
                Object obj4 = fl3Var.d;
                int i5 = fl3Var.e;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj4);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj4);
                ((Number) obj).longValue();
                if (!rl3.C(rl3Var, (wh3) rl3Var.z1.a.getValue())) {
                    return sbiVar;
                }
                fl3Var.e = 1;
                return yx6Var.emit(obj, fl3Var) == hu4Var ? hu4Var : sbiVar;
            case 2:
                if (lq4Var instanceof gl3) {
                    gl3Var = (gl3) lq4Var;
                    int i6 = gl3Var.e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        gl3Var.e = i6 - Integer.MIN_VALUE;
                    } else {
                        gl3Var = new gl3(this, lq4Var);
                    }
                } else {
                    gl3Var = new gl3(this, lq4Var);
                }
                Object obj5 = gl3Var.d;
                int i7 = gl3Var.e;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ch3.d0(obj5);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj5);
                ((Number) obj).longValue();
                rl3Var.c.a();
                gl3Var.e = 1;
                return yx6Var.emit(sbiVar, gl3Var) == hu4Var ? hu4Var : sbiVar;
            case 3:
                if (lq4Var instanceof ml3) {
                    ml3Var = (ml3) lq4Var;
                    int i8 = ml3Var.e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        ml3Var.e = i8 - Integer.MIN_VALUE;
                    } else {
                        ml3Var = new ml3(this, lq4Var);
                    }
                } else {
                    ml3Var = new ml3(this, lq4Var);
                }
                Object obj6 = ml3Var.d;
                int i9 = ml3Var.e;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ch3.d0(obj6);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj6);
                ylc ylcVar2 = (ylc) obj;
                wh3 wh3Var2 = (wh3) ylcVar2.a;
                for (Object obj7 : (List) ylcVar2.b) {
                    if (cqk.d(((r17) obj7).a, rl3Var.d)) {
                        obj2 = obj7;
                        ylcVar = new ylc(wh3Var2, obj2);
                        ml3Var.e = 1;
                        if (yx6Var.emit(ylcVar, ml3Var) == hu4Var) {
                            return hu4Var;
                        }
                        return sbiVar;
                    }
                }
                ylcVar = new ylc(wh3Var2, obj2);
                ml3Var.e = 1;
                if (yx6Var.emit(ylcVar, ml3Var) == hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            default:
                if (lq4Var instanceof pl3) {
                    pl3Var = (pl3) lq4Var;
                    int i10 = pl3Var.e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        pl3Var.e = i10 - Integer.MIN_VALUE;
                    } else {
                        pl3Var = new pl3(this, lq4Var);
                    }
                } else {
                    pl3Var = new pl3(this, lq4Var);
                }
                Object obj8 = pl3Var.d;
                int i11 = pl3Var.e;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ch3.d0(obj8);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj8);
                m8b m8bVar = new m8b();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    long jLongValue = ((Number) it.next()).longValue();
                    zv8[] zv8VarArr2 = rl3.Z1;
                    rt2 rt2Var = (rt2) rl3Var.I().k(jLongValue).a.getValue();
                    if (rt2Var != null && (vg4VarW = rt2Var.w()) != null) {
                        m8bVar.a(vg4VarW.v());
                    }
                }
                pl3Var.e = 1;
                return yx6Var.emit(m8bVar, pl3Var) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
