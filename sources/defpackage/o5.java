package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o5 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;

    public /* synthetic */ o5(yx6 yx6Var, int i) {
        this.a = i;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:142:0x020d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0245  */
    /* JADX WARN: Code duplicated, block: B:174:0x0282  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:223:0x0326  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:272:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:291:0x0430  */
    /* JADX WARN: Code duplicated, block: B:306:0x0468  */
    /* JADX WARN: Code duplicated, block: B:321:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:343:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:358:0x0531  */
    /* JADX WARN: Code duplicated, block: B:373:0x056f  */
    /* JADX WARN: Code duplicated, block: B:388:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:405:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:422:0x062a  */
    /* JADX WARN: Code duplicated, block: B:441:0x0674  */
    /* JADX WARN: Code duplicated, block: B:459:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:477:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:494:0x0728  */
    /* JADX WARN: Code duplicated, block: B:509:0x0762  */
    /* JADX WARN: Code duplicated, block: B:524:0x079f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        n5 n5Var;
        m7 m7Var;
        d30 d30Var;
        gl0 gl0Var;
        so0 so0Var;
        to0 to0Var;
        xo0 xo0Var;
        qa1 qa1Var;
        ta1 ta1Var;
        dd1 dd1Var;
        ed1 ed1Var;
        fd1 fd1Var;
        gd1 gd1Var;
        id1 id1Var;
        th1 th1Var;
        uh1 uh1Var;
        vh1 vh1Var;
        wh1 wh1Var;
        xh1 xh1Var;
        im1 im1Var;
        yr1 yr1Var;
        it1 it1Var;
        cw1 cw1Var;
        kx1 kx1Var;
        lx1 lx1Var;
        gz1 gz1Var;
        iz1 iz1Var;
        lz1 lz1Var;
        pz1 pz1Var;
        sz1 sz1Var;
        int i = this.a;
        ssc sscVar = ssc.a;
        boolean z = false;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (lq4Var instanceof n5) {
                    n5Var = (n5) lq4Var;
                    int i2 = n5Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        n5Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        n5Var = new n5(this, lq4Var);
                    }
                } else {
                    n5Var = new n5(this, lq4Var);
                }
                Object obj3 = n5Var.d;
                int i3 = n5Var.e;
                if (i3 == 0) {
                    ch3.d0(obj3);
                    Integer num = new Integer(((ou4) obj).a);
                    n5Var.e = 1;
                    return yx6Var.emit(num, n5Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj3);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lq4Var instanceof m7) {
                    m7Var = (m7) lq4Var;
                    int i4 = m7Var.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        m7Var.e = i4 - Integer.MIN_VALUE;
                    } else {
                        m7Var = new m7(this, lq4Var);
                    }
                } else {
                    m7Var = new m7(this, lq4Var);
                }
                Object obj4 = m7Var.d;
                int i5 = m7Var.e;
                if (i5 == 0) {
                    ch3.d0(obj4);
                    Integer num2 = new Integer(((ou4) obj).a);
                    m7Var.e = 1;
                    return yx6Var.emit(num2, m7Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i5 == 1) {
                    ch3.d0(obj4);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lq4Var instanceof d30) {
                    d30Var = (d30) lq4Var;
                    int i6 = d30Var.e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        d30Var.e = i6 - Integer.MIN_VALUE;
                    } else {
                        d30Var = new d30(this, lq4Var);
                    }
                } else {
                    d30Var = new d30(this, lq4Var);
                }
                Object obj5 = d30Var.d;
                int i7 = d30Var.e;
                if (i7 == 0) {
                    ch3.d0(obj5);
                    rtc rtcVarA = ((qtc) obj).a();
                    d30Var.e = 1;
                    return yx6Var.emit(rtcVarA, d30Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i7 == 1) {
                    ch3.d0(obj5);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lq4Var instanceof gl0) {
                    gl0Var = (gl0) lq4Var;
                    int i8 = gl0Var.e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        gl0Var.e = i8 - Integer.MIN_VALUE;
                    } else {
                        gl0Var = new gl0(this, lq4Var);
                    }
                } else {
                    gl0Var = new gl0(this, lq4Var);
                }
                Object obj6 = gl0Var.d;
                int i9 = gl0Var.e;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ch3.d0(obj6);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj6);
                if (!(obj instanceof qyi)) {
                    return sbiVar;
                }
                gl0Var.e = 1;
                return yx6Var.emit(obj, gl0Var) == hu4Var ? hu4Var : sbiVar;
            case 4:
                if (lq4Var instanceof so0) {
                    so0Var = (so0) lq4Var;
                    int i10 = so0Var.e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        so0Var.e = i10 - Integer.MIN_VALUE;
                    } else {
                        so0Var = new so0(this, lq4Var);
                    }
                } else {
                    so0Var = new so0(this, lq4Var);
                }
                Object obj7 = so0Var.d;
                int i11 = so0Var.e;
                if (i11 == 0) {
                    ch3.d0(obj7);
                    no0 no0Var = new no0(((ssc) obj) == sscVar);
                    so0Var.e = 1;
                    return yx6Var.emit(no0Var, so0Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i11 == 1) {
                    ch3.d0(obj7);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lq4Var instanceof to0) {
                    to0Var = (to0) lq4Var;
                    int i12 = to0Var.e;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        to0Var.e = i12 - Integer.MIN_VALUE;
                    } else {
                        to0Var = new to0(this, lq4Var);
                    }
                } else {
                    to0Var = new to0(this, lq4Var);
                }
                Object obj8 = to0Var.d;
                int i13 = to0Var.e;
                if (i13 == 0) {
                    ch3.d0(obj8);
                    oo0 oo0Var = new oo0(((ssc) obj) == sscVar);
                    to0Var.e = 1;
                    return yx6Var.emit(oo0Var, to0Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i13 == 1) {
                    ch3.d0(obj8);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lq4Var instanceof xo0) {
                    xo0Var = (xo0) lq4Var;
                    int i14 = xo0Var.e;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        xo0Var.e = i14 - Integer.MIN_VALUE;
                    } else {
                        xo0Var = new xo0(this, lq4Var);
                    }
                } else {
                    xo0Var = new xo0(this, lq4Var);
                }
                Object obj9 = xo0Var.d;
                int i15 = xo0Var.e;
                if (i15 != 0) {
                    if (i15 == 1) {
                        ch3.d0(obj9);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj9);
                List list = (List) obj;
                Object objSingletonList = list.isEmpty() ? r66.a : Collections.singletonList(new bp0(zo0.l, list));
                xo0Var.e = 1;
                return yx6Var.emit(objSingletonList, xo0Var) == hu4Var ? hu4Var : sbiVar;
            case 7:
                if (lq4Var instanceof qa1) {
                    qa1Var = (qa1) lq4Var;
                    int i16 = qa1Var.e;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        qa1Var.e = i16 - Integer.MIN_VALUE;
                    } else {
                        qa1Var = new qa1(this, lq4Var);
                    }
                } else {
                    qa1Var = new qa1(this, lq4Var);
                }
                Object obj10 = qa1Var.d;
                int i17 = qa1Var.e;
                if (i17 != 0) {
                    if (i17 == 1) {
                        ch3.d0(obj10);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj10);
                if (!((dj4) obj).a.j()) {
                    return sbiVar;
                }
                qa1Var.e = 1;
                return yx6Var.emit(obj, qa1Var) == hu4Var ? hu4Var : sbiVar;
            case 8:
                if (lq4Var instanceof ta1) {
                    ta1Var = (ta1) lq4Var;
                    int i18 = ta1Var.e;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        ta1Var.e = i18 - Integer.MIN_VALUE;
                    } else {
                        ta1Var = new ta1(this, lq4Var);
                    }
                } else {
                    ta1Var = new ta1(this, lq4Var);
                }
                Object obj11 = ta1Var.d;
                int i19 = ta1Var.e;
                if (i19 != 0) {
                    if (i19 == 1) {
                        ch3.d0(obj11);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj11);
                if (!(obj instanceof dj4)) {
                    return sbiVar;
                }
                ta1Var.e = 1;
                return yx6Var.emit(obj, ta1Var) == hu4Var ? hu4Var : sbiVar;
            case 9:
                if (lq4Var instanceof dd1) {
                    dd1Var = (dd1) lq4Var;
                    int i20 = dd1Var.e;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        dd1Var.e = i20 - Integer.MIN_VALUE;
                    } else {
                        dd1Var = new dd1(this, lq4Var);
                    }
                } else {
                    dd1Var = new dd1(this, lq4Var);
                }
                Object obj12 = dd1Var.d;
                int i21 = dd1Var.e;
                if (i21 == 0) {
                    ch3.d0(obj12);
                    Boolean boolValueOf = Boolean.valueOf(((l9) obj).c.a.a.f());
                    dd1Var.e = 1;
                    return yx6Var.emit(boolValueOf, dd1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i21 == 1) {
                    ch3.d0(obj12);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lq4Var instanceof ed1) {
                    ed1Var = (ed1) lq4Var;
                    int i22 = ed1Var.e;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        ed1Var.e = i22 - Integer.MIN_VALUE;
                    } else {
                        ed1Var = new ed1(this, lq4Var);
                    }
                } else {
                    ed1Var = new ed1(this, lq4Var);
                }
                Object obj13 = ed1Var.d;
                int i23 = ed1Var.e;
                if (i23 == 0) {
                    ch3.d0(obj13);
                    Boolean boolValueOf2 = Boolean.valueOf(((l9) obj).e.g);
                    ed1Var.e = 1;
                    return yx6Var.emit(boolValueOf2, ed1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i23 == 1) {
                    ch3.d0(obj13);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lq4Var instanceof fd1) {
                    fd1Var = (fd1) lq4Var;
                    int i24 = fd1Var.e;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        fd1Var.e = i24 - Integer.MIN_VALUE;
                    } else {
                        fd1Var = new fd1(this, lq4Var);
                    }
                } else {
                    fd1Var = new fd1(this, lq4Var);
                }
                Object obj14 = fd1Var.d;
                int i25 = fd1Var.e;
                if (i25 == 0) {
                    ch3.d0(obj14);
                    Boolean boolValueOf3 = Boolean.valueOf(((f62) obj).j);
                    fd1Var.e = 1;
                    return yx6Var.emit(boolValueOf3, fd1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i25 == 1) {
                    ch3.d0(obj14);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lq4Var instanceof gd1) {
                    gd1Var = (gd1) lq4Var;
                    int i26 = gd1Var.e;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        gd1Var.e = i26 - Integer.MIN_VALUE;
                    } else {
                        gd1Var = new gd1(this, lq4Var);
                    }
                } else {
                    gd1Var = new gd1(this, lq4Var);
                }
                Object obj15 = gd1Var.d;
                int i27 = gd1Var.e;
                if (i27 != 0) {
                    if (i27 == 1) {
                        ch3.d0(obj15);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj15);
                pi6 pi6Var = ((ao1) obj).f;
                Boolean boolValueOf4 = Boolean.valueOf((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6));
                gd1Var.e = 1;
                return yx6Var.emit(boolValueOf4, gd1Var) == hu4Var ? hu4Var : sbiVar;
            case 13:
                if (lq4Var instanceof id1) {
                    id1Var = (id1) lq4Var;
                    int i28 = id1Var.e;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        id1Var.e = i28 - Integer.MIN_VALUE;
                    } else {
                        id1Var = new id1(this, lq4Var);
                    }
                } else {
                    id1Var = new id1(this, lq4Var);
                }
                Object obj16 = id1Var.d;
                int i29 = id1Var.e;
                if (i29 == 0) {
                    ch3.d0(obj16);
                    Boolean boolValueOf5 = Boolean.valueOf(((l9) obj).c.a.a.f());
                    id1Var.e = 1;
                    return yx6Var.emit(boolValueOf5, id1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i29 == 1) {
                    ch3.d0(obj16);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lq4Var instanceof th1) {
                    th1Var = (th1) lq4Var;
                    int i30 = th1Var.e;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        th1Var.e = i30 - Integer.MIN_VALUE;
                    } else {
                        th1Var = new th1(this, lq4Var);
                    }
                } else {
                    th1Var = new th1(this, lq4Var);
                }
                Object obj17 = th1Var.d;
                int i31 = th1Var.e;
                if (i31 == 0) {
                    ch3.d0(obj17);
                    enc encVar = ((l9) obj).c;
                    th1Var.e = 1;
                    return yx6Var.emit(encVar, th1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i31 == 1) {
                    ch3.d0(obj17);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lq4Var instanceof uh1) {
                    uh1Var = (uh1) lq4Var;
                    int i32 = uh1Var.e;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        uh1Var.e = i32 - Integer.MIN_VALUE;
                    } else {
                        uh1Var = new uh1(this, lq4Var);
                    }
                } else {
                    uh1Var = new uh1(this, lq4Var);
                }
                Object obj18 = uh1Var.d;
                int i33 = uh1Var.e;
                if (i33 == 0) {
                    ch3.d0(obj18);
                    Object obj19 = ((enc) obj).a.a.u() == 3 ? ah1.c : bh1.a;
                    uh1Var.e = 1;
                    return yx6Var.emit(obj19, uh1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i33 == 1) {
                    ch3.d0(obj18);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lq4Var instanceof vh1) {
                    vh1Var = (vh1) lq4Var;
                    int i34 = vh1Var.e;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        vh1Var.e = i34 - Integer.MIN_VALUE;
                    } else {
                        vh1Var = new vh1(this, lq4Var);
                    }
                } else {
                    vh1Var = new vh1(this, lq4Var);
                }
                Object obj20 = vh1Var.d;
                int i35 = vh1Var.e;
                if (i35 == 0) {
                    ch3.d0(obj20);
                    enc encVar2 = ((l9) obj).c;
                    vh1Var.e = 1;
                    return yx6Var.emit(encVar2, vh1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i35 == 1) {
                    ch3.d0(obj20);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lq4Var instanceof wh1) {
                    wh1Var = (wh1) lq4Var;
                    int i36 = wh1Var.e;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        wh1Var.e = i36 - Integer.MIN_VALUE;
                    } else {
                        wh1Var = new wh1(this, lq4Var);
                    }
                } else {
                    wh1Var = new wh1(this, lq4Var);
                }
                Object obj21 = wh1Var.d;
                int i37 = wh1Var.e;
                if (i37 != 0) {
                    if (i37 == 1) {
                        ch3.d0(obj21);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj21);
                Collection collectionValues = ((enc) obj).c.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj22 : collectionValues) {
                    if (((tmc) obj22).a.isConnected()) {
                        arrayList.add(obj22);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                Object obj23 = hh1.a;
                if (!zIsEmpty) {
                    if (arrayList.isEmpty()) {
                        obj23 = gh1.c;
                    } else {
                        Iterator it = arrayList.iterator();
                        do {
                            if (!it.hasNext()) {
                                obj23 = gh1.c;
                            }
                        } while (!((tmc) it.next()).a.d());
                    }
                }
                wh1Var.e = 1;
                return yx6Var.emit(obj23, wh1Var) == hu4Var ? hu4Var : sbiVar;
            case 18:
                if (lq4Var instanceof xh1) {
                    xh1Var = (xh1) lq4Var;
                    int i38 = xh1Var.e;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        xh1Var.e = i38 - Integer.MIN_VALUE;
                    } else {
                        xh1Var = new xh1(this, lq4Var);
                    }
                } else {
                    xh1Var = new xh1(this, lq4Var);
                }
                Object obj24 = xh1Var.d;
                int i39 = xh1Var.e;
                if (i39 != 0) {
                    if (i39 == 1) {
                        ch3.d0(obj24);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj24);
                pi6 pi6Var2 = ((dz4) obj).q;
                if (cqk.d(pi6Var2, ji6.a) || cqk.d(pi6Var2, li6.a)) {
                    obj2 = vg1.a;
                } else if (cqk.d(pi6Var2, ii6.a)) {
                    obj2 = ug1.a;
                } else if (pi6Var2 instanceof hi6) {
                    obj2 = tg1.a;
                }
                if (obj2 == null) {
                    return sbiVar;
                }
                xh1Var.e = 1;
                return yx6Var.emit(obj2, xh1Var) == hu4Var ? hu4Var : sbiVar;
            case 19:
                if (lq4Var instanceof im1) {
                    im1Var = (im1) lq4Var;
                    int i40 = im1Var.e;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        im1Var.e = i40 - Integer.MIN_VALUE;
                    } else {
                        im1Var = new im1(this, lq4Var);
                    }
                } else {
                    im1Var = new im1(this, lq4Var);
                }
                Object obj25 = im1Var.d;
                int i41 = im1Var.e;
                if (i41 != 0) {
                    if (i41 == 1) {
                        ch3.d0(obj25);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj25);
                pi6 pi6Var3 = ((dz4) obj).q;
                if (!(pi6Var3 instanceof ii6) && !(pi6Var3 instanceof hi6) && !(pi6Var3 instanceof ki6)) {
                    return sbiVar;
                }
                im1Var.e = 1;
                return yx6Var.emit(obj, im1Var) == hu4Var ? hu4Var : sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                if (lq4Var instanceof yr1) {
                    yr1Var = (yr1) lq4Var;
                    int i42 = yr1Var.e;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        yr1Var.e = i42 - Integer.MIN_VALUE;
                    } else {
                        yr1Var = new yr1(this, lq4Var);
                    }
                } else {
                    yr1Var = new yr1(this, lq4Var);
                }
                Object obj26 = yr1Var.d;
                int i43 = yr1Var.e;
                if (i43 != 0) {
                    if (i43 == 1) {
                        ch3.d0(obj26);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj26);
                if (((t4f) obj).a == u4f.a) {
                    return sbiVar;
                }
                yr1Var.e = 1;
                return yx6Var.emit(obj, yr1Var) == hu4Var ? hu4Var : sbiVar;
            case 21:
                if (lq4Var instanceof it1) {
                    it1Var = (it1) lq4Var;
                    int i44 = it1Var.e;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        it1Var.e = i44 - Integer.MIN_VALUE;
                    } else {
                        it1Var = new it1(this, lq4Var);
                    }
                } else {
                    it1Var = new it1(this, lq4Var);
                }
                Object obj27 = it1Var.d;
                int i45 = it1Var.e;
                if (i45 == 0) {
                    ch3.d0(obj27);
                    be1 be1Var = ((l9) obj).d;
                    it1Var.e = 1;
                    return yx6Var.emit(be1Var, it1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i45 == 1) {
                    ch3.d0(obj27);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lq4Var instanceof cw1) {
                    cw1Var = (cw1) lq4Var;
                    int i46 = cw1Var.e;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        cw1Var.e = i46 - Integer.MIN_VALUE;
                    } else {
                        cw1Var = new cw1(this, lq4Var);
                    }
                } else {
                    cw1Var = new cw1(this, lq4Var);
                }
                Object obj28 = cw1Var.d;
                int i47 = cw1Var.e;
                if (i47 != 0) {
                    if (i47 == 1) {
                        ch3.d0(obj28);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj28);
                Integer num3 = ((bw1) obj).a;
                if (num3 != null && num3.intValue() == R.id.call_rate_negative_button) {
                    z = true;
                }
                Boolean boolValueOf6 = Boolean.valueOf(z);
                cw1Var.e = 1;
                return yx6Var.emit(boolValueOf6, cw1Var) == hu4Var ? hu4Var : sbiVar;
            case 23:
                if (lq4Var instanceof kx1) {
                    kx1Var = (kx1) lq4Var;
                    int i48 = kx1Var.e;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        kx1Var.e = i48 - Integer.MIN_VALUE;
                    } else {
                        kx1Var = new kx1(this, lq4Var);
                    }
                } else {
                    kx1Var = new kx1(this, lq4Var);
                }
                Object obj29 = kx1Var.d;
                int i49 = kx1Var.e;
                if (i49 != 0) {
                    if (i49 == 1) {
                        ch3.d0(obj29);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj29);
                if (!(((qf1) obj) instanceof of1)) {
                    return sbiVar;
                }
                kx1Var.e = 1;
                return yx6Var.emit(obj, kx1Var) == hu4Var ? hu4Var : sbiVar;
            case 24:
                if (lq4Var instanceof lx1) {
                    lx1Var = (lx1) lq4Var;
                    int i50 = lx1Var.e;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        lx1Var.e = i50 - Integer.MIN_VALUE;
                    } else {
                        lx1Var = new lx1(this, lq4Var);
                    }
                } else {
                    lx1Var = new lx1(this, lq4Var);
                }
                Object obj30 = lx1Var.d;
                int i51 = lx1Var.e;
                if (i51 == 0) {
                    ch3.d0(obj30);
                    List list2 = ((of1) ((qf1) obj)).a.c;
                    lx1Var.e = 1;
                    return yx6Var.emit(list2, lx1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i51 == 1) {
                    ch3.d0(obj30);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lq4Var instanceof gz1) {
                    gz1Var = (gz1) lq4Var;
                    int i52 = gz1Var.e;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        gz1Var.e = i52 - Integer.MIN_VALUE;
                    } else {
                        gz1Var = new gz1(this, lq4Var);
                    }
                } else {
                    gz1Var = new gz1(this, lq4Var);
                }
                Object obj31 = gz1Var.d;
                int i53 = gz1Var.e;
                if (i53 == 0) {
                    ch3.d0(obj31);
                    Boolean boolValueOf7 = Boolean.valueOf(!((ao1) obj).u);
                    gz1Var.e = 1;
                    return yx6Var.emit(boolValueOf7, gz1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i53 == 1) {
                    ch3.d0(obj31);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lq4Var instanceof iz1) {
                    iz1Var = (iz1) lq4Var;
                    int i54 = iz1Var.e;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        iz1Var.e = i54 - Integer.MIN_VALUE;
                    } else {
                        iz1Var = new iz1(this, lq4Var);
                    }
                } else {
                    iz1Var = new iz1(this, lq4Var);
                }
                Object obj32 = iz1Var.d;
                int i55 = iz1Var.e;
                if (i55 == 0) {
                    ch3.d0(obj32);
                    Boolean boolValueOf8 = Boolean.valueOf(((enc) obj).h);
                    iz1Var.e = 1;
                    return yx6Var.emit(boolValueOf8, iz1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i55 == 1) {
                    ch3.d0(obj32);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lq4Var instanceof lz1) {
                    lz1Var = (lz1) lq4Var;
                    int i56 = lz1Var.e;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        lz1Var.e = i56 - Integer.MIN_VALUE;
                    } else {
                        lz1Var = new lz1(this, lq4Var);
                    }
                } else {
                    lz1Var = new lz1(this, lq4Var);
                }
                Object obj33 = lz1Var.d;
                int i57 = lz1Var.e;
                if (i57 != 0) {
                    if (i57 == 1) {
                        ch3.d0(obj33);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj33);
                qe1 qe1Var = ((ao1) obj).g;
                obj2 = qe1Var != null ? qe1Var.c : null;
                lz1Var.e = 1;
                return yx6Var.emit(obj2, lz1Var) == hu4Var ? hu4Var : sbiVar;
            case 28:
                if (lq4Var instanceof pz1) {
                    pz1Var = (pz1) lq4Var;
                    int i58 = pz1Var.e;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        pz1Var.e = i58 - Integer.MIN_VALUE;
                    } else {
                        pz1Var = new pz1(this, lq4Var);
                    }
                } else {
                    pz1Var = new pz1(this, lq4Var);
                }
                Object obj34 = pz1Var.d;
                int i59 = pz1Var.e;
                if (i59 != 0) {
                    if (i59 == 1) {
                        ch3.d0(obj34);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj34);
                if (((be1) obj).a == null) {
                    return sbiVar;
                }
                pz1Var.e = 1;
                return yx6Var.emit(obj, pz1Var) == hu4Var ? hu4Var : sbiVar;
            default:
                if (lq4Var instanceof sz1) {
                    sz1Var = (sz1) lq4Var;
                    int i60 = sz1Var.e;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        sz1Var.e = i60 - Integer.MIN_VALUE;
                    } else {
                        sz1Var = new sz1(this, lq4Var);
                    }
                } else {
                    sz1Var = new sz1(this, lq4Var);
                }
                Object obj35 = sz1Var.d;
                int i61 = sz1Var.e;
                if (i61 == 0) {
                    ch3.d0(obj35);
                    k52 k52Var = ((l9) obj).e;
                    sz1Var.e = 1;
                    return yx6Var.emit(k52Var, sz1Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i61 == 1) {
                    ch3.d0(obj35);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
