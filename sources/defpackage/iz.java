package defpackage;

import java.util.ArrayList;
import java.util.List;
import one.me.android.MainActivity;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class iz implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;

    public /* synthetic */ iz(yx6 yx6Var, int i) {
        this.a = i;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(xx6 xx6Var, lq4 lq4Var) {
        yz6 yz6Var;
        if (lq4Var instanceof yz6) {
            yz6Var = (yz6) lq4Var;
            int i = yz6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                yz6Var.f = i - Integer.MIN_VALUE;
            } else {
                yz6Var = new yz6(this, lq4Var);
            }
        } else {
            yz6Var = new yz6(this, lq4Var);
        }
        Object obj = yz6Var.d;
        int i2 = yz6Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            yz6Var.f = 1;
            Object objL = e9i.L(this.b, xx6Var, yz6Var);
            hu4 hu4Var = hu4.a;
            if (objL == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0145  */
    /* JADX WARN: Code duplicated, block: B:117:0x0180  */
    /* JADX WARN: Code duplicated, block: B:145:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:162:0x021b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0258  */
    /* JADX WARN: Code duplicated, block: B:198:0x0297  */
    /* JADX WARN: Code duplicated, block: B:215:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:234:0x0313  */
    /* JADX WARN: Code duplicated, block: B:251:0x0352  */
    /* JADX WARN: Code duplicated, block: B:268:0x038a  */
    /* JADX WARN: Code duplicated, block: B:285:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:300:0x0402  */
    /* JADX WARN: Code duplicated, block: B:317:0x043a  */
    /* JADX WARN: Code duplicated, block: B:334:0x0472  */
    /* JADX WARN: Code duplicated, block: B:351:0x04af  */
    /* JADX WARN: Code duplicated, block: B:368:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:402:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:424:0x060a  */
    /* JADX WARN: Code duplicated, block: B:446:0x0663  */
    /* JADX WARN: Code duplicated, block: B:463:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:478:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:495:0x071b  */
    /* JADX WARN: Code duplicated, block: B:512:0x075b  */
    /* JADX WARN: Code duplicated, block: B:529:0x0794  */
    /* JADX WARN: Code duplicated, block: B:546:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:563:0x080d  */
    /* JADX WARN: Code duplicated, block: B:580:0x084b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0109  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        hz hzVar;
        sz szVar;
        uz uzVar;
        vz vzVar;
        xz xzVar;
        v10 v10Var;
        gv0 gv0Var;
        gk2 gk2Var;
        zg3 zg3Var;
        bl3 bl3Var;
        dl3 dl3Var;
        ll3 ll3Var;
        nl3 nl3Var;
        ol3 ol3Var;
        zl3 zl3Var;
        am3 am3Var;
        sm3 sm3Var;
        qo3 qo3Var;
        ro3 ro3Var;
        jq3 jq3Var;
        rn4 rn4Var;
        cd6 cd6Var;
        dy6 dy6Var;
        m07 m07Var;
        j67 j67Var;
        t67 t67Var;
        Object obj2;
        v67 v67Var;
        pg9 pg9Var;
        ck9 ck9Var;
        int i = this.a;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        c79 c79VarJ = null;
        switch (i) {
            case 0:
                if (lq4Var instanceof hz) {
                    hzVar = (hz) lq4Var;
                    int i2 = hzVar.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        hzVar.e = i2 - Integer.MIN_VALUE;
                    } else {
                        hzVar = new hz(this, lq4Var);
                    }
                } else {
                    hzVar = new hz(this, lq4Var);
                }
                Object obj3 = hzVar.d;
                int i3 = hzVar.e;
                if (i3 == 0) {
                    ch3.d0(obj3);
                    Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                    hzVar.e = 1;
                    return yx6Var.emit(boolValueOf, hzVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj3);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lq4Var instanceof sz) {
                    szVar = (sz) lq4Var;
                    int i4 = szVar.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        szVar.e = i4 - Integer.MIN_VALUE;
                    } else {
                        szVar = new sz(this, lq4Var);
                    }
                } else {
                    szVar = new sz(this, lq4Var);
                }
                Object obj4 = szVar.d;
                int i5 = szVar.e;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj4);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj4);
                if (((cj4) obj).a.e == 0) {
                    return sbiVar;
                }
                szVar.e = 1;
                return yx6Var.emit(obj, szVar) == hu4Var ? hu4Var : sbiVar;
            case 2:
                if (lq4Var instanceof uz) {
                    uzVar = (uz) lq4Var;
                    int i6 = uzVar.e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        uzVar.e = i6 - Integer.MIN_VALUE;
                    } else {
                        uzVar = new uz(this, lq4Var);
                    }
                } else {
                    uzVar = new uz(this, lq4Var);
                }
                Object obj5 = uzVar.d;
                int i7 = uzVar.e;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ch3.d0(obj5);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj5);
                if (!((dj4) obj).a.j()) {
                    return sbiVar;
                }
                uzVar.e = 1;
                return yx6Var.emit(obj, uzVar) == hu4Var ? hu4Var : sbiVar;
            case 3:
                if (lq4Var instanceof vz) {
                    vzVar = (vz) lq4Var;
                    int i8 = vzVar.e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        vzVar.e = i8 - Integer.MIN_VALUE;
                    } else {
                        vzVar = new vz(this, lq4Var);
                    }
                } else {
                    vzVar = new vz(this, lq4Var);
                }
                Object obj6 = vzVar.d;
                int i9 = vzVar.e;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ch3.d0(obj6);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj6);
                if (!(obj instanceof cj4)) {
                    return sbiVar;
                }
                vzVar.e = 1;
                return yx6Var.emit(obj, vzVar) == hu4Var ? hu4Var : sbiVar;
            case 4:
                if (lq4Var instanceof xz) {
                    xzVar = (xz) lq4Var;
                    int i10 = xzVar.e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        xzVar.e = i10 - Integer.MIN_VALUE;
                    } else {
                        xzVar = new xz(this, lq4Var);
                    }
                } else {
                    xzVar = new xz(this, lq4Var);
                }
                Object obj7 = xzVar.d;
                int i11 = xzVar.e;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ch3.d0(obj7);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj7);
                if (!(obj instanceof dj4)) {
                    return sbiVar;
                }
                xzVar.e = 1;
                return yx6Var.emit(obj, xzVar) == hu4Var ? hu4Var : sbiVar;
            case 5:
                if (lq4Var instanceof v10) {
                    v10Var = (v10) lq4Var;
                    int i12 = v10Var.e;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        v10Var.e = i12 - Integer.MIN_VALUE;
                    } else {
                        v10Var = new v10(this, lq4Var);
                    }
                } else {
                    v10Var = new v10(this, lq4Var);
                }
                Object obj8 = v10Var.d;
                int i13 = v10Var.e;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ch3.d0(obj8);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj8);
                if (((Number) obj).longValue() == -1) {
                    return sbiVar;
                }
                v10Var.e = 1;
                return yx6Var.emit(obj, v10Var) == hu4Var ? hu4Var : sbiVar;
            case 6:
                if (lq4Var instanceof gv0) {
                    gv0Var = (gv0) lq4Var;
                    int i14 = gv0Var.e;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        gv0Var.e = i14 - Integer.MIN_VALUE;
                    } else {
                        gv0Var = new gv0(this, lq4Var);
                    }
                } else {
                    gv0Var = new gv0(this, lq4Var);
                }
                Object obj9 = gv0Var.d;
                int i15 = gv0Var.e;
                if (i15 != 0) {
                    if (i15 == 1) {
                        ch3.d0(obj9);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj9);
                if (!((Boolean) obj).booleanValue()) {
                    return sbiVar;
                }
                gv0Var.e = 1;
                return yx6Var.emit(obj, gv0Var) == hu4Var ? hu4Var : sbiVar;
            case 7:
                if (lq4Var instanceof gk2) {
                    gk2Var = (gk2) lq4Var;
                    int i16 = gk2Var.f;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        gk2Var.f = i16 - Integer.MIN_VALUE;
                    } else {
                        gk2Var = new gk2(this, lq4Var);
                    }
                } else {
                    gk2Var = new gk2(this, lq4Var);
                }
                Object obj10 = gk2Var.d;
                int i17 = gk2Var.f;
                if (i17 == 0) {
                    ch3.d0(obj10);
                    vd7.q(gk2Var.getContext());
                    gk2Var.f = 1;
                    return yx6Var.emit(obj, gk2Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i17 == 1) {
                    ch3.d0(obj10);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lq4Var instanceof zg3) {
                    zg3Var = (zg3) lq4Var;
                    int i18 = zg3Var.e;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        zg3Var.e = i18 - Integer.MIN_VALUE;
                    } else {
                        zg3Var = new zg3(this, lq4Var);
                    }
                } else {
                    zg3Var = new zg3(this, lq4Var);
                }
                Object obj11 = zg3Var.d;
                int i19 = zg3Var.e;
                if (i19 != 0) {
                    if (i19 == 1) {
                        ch3.d0(obj11);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj11);
                if (!((Boolean) obj).booleanValue()) {
                    return sbiVar;
                }
                zg3Var.e = 1;
                return yx6Var.emit(obj, zg3Var) == hu4Var ? hu4Var : sbiVar;
            case 9:
                if (lq4Var instanceof bl3) {
                    bl3Var = (bl3) lq4Var;
                    int i20 = bl3Var.e;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        bl3Var.e = i20 - Integer.MIN_VALUE;
                    } else {
                        bl3Var = new bl3(this, lq4Var);
                    }
                } else {
                    bl3Var = new bl3(this, lq4Var);
                }
                Object obj12 = bl3Var.d;
                int i21 = bl3Var.e;
                if (i21 != 0) {
                    if (i21 == 1) {
                        ch3.d0(obj12);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj12);
                ArrayList arrayList = new ArrayList();
                for (Object obj13 : (List) obj) {
                    if (((lk6) obj13).g) {
                        arrayList.add(obj13);
                    }
                }
                bl3Var.e = 1;
                return yx6Var.emit(arrayList, bl3Var) == hu4Var ? hu4Var : sbiVar;
            case 10:
                if (lq4Var instanceof dl3) {
                    dl3Var = (dl3) lq4Var;
                    int i22 = dl3Var.e;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        dl3Var.e = i22 - Integer.MIN_VALUE;
                    } else {
                        dl3Var = new dl3(this, lq4Var);
                    }
                } else {
                    dl3Var = new dl3(this, lq4Var);
                }
                Object obj14 = dl3Var.d;
                int i23 = dl3Var.e;
                if (i23 != 0) {
                    if (i23 == 1) {
                        ch3.d0(obj14);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj14);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj15 : (List) obj) {
                    if (!((lk6) obj15).g) {
                        arrayList2.add(obj15);
                    }
                }
                dl3Var.e = 1;
                return yx6Var.emit(arrayList2, dl3Var) == hu4Var ? hu4Var : sbiVar;
            case 11:
                if (lq4Var instanceof ll3) {
                    ll3Var = (ll3) lq4Var;
                    int i24 = ll3Var.e;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        ll3Var.e = i24 - Integer.MIN_VALUE;
                    } else {
                        ll3Var = new ll3(this, lq4Var);
                    }
                } else {
                    ll3Var = new ll3(this, lq4Var);
                }
                Object obj16 = ll3Var.d;
                int i25 = ll3Var.e;
                if (i25 != 0) {
                    if (i25 == 1) {
                        ch3.d0(obj16);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj16);
                ylc ylcVar = (ylc) obj;
                wh3 wh3Var = (wh3) ylcVar.a;
                r17 r17Var = (r17) ylcVar.b;
                List list = r17Var != null ? r17Var.h : null;
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    List<f47> list3 = list;
                    ArrayList arrayList3 = new ArrayList(yw3.W0(list3, 10));
                    for (f47 f47Var : list3) {
                        arrayList3.add(new o47(f47Var.e(), f47Var.f(), f47Var.c(), f47Var.d(), dul.x(f47Var.a(), r17Var.m, f47Var.h(), f47Var.g())));
                    }
                    c79 c79VarW = yab.w();
                    c79VarW.add(new x47(arrayList3));
                    if (!wh3Var.b && wh3Var.a.isEmpty()) {
                        c79VarW.add(new w47());
                    }
                    c79VarJ = yab.j(c79VarW);
                }
                ll3Var.e = 1;
                return yx6Var.emit(c79VarJ, ll3Var) == hu4Var ? hu4Var : sbiVar;
            case 12:
                if (lq4Var instanceof nl3) {
                    nl3Var = (nl3) lq4Var;
                    int i26 = nl3Var.e;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        nl3Var.e = i26 - Integer.MIN_VALUE;
                    } else {
                        nl3Var = new nl3(this, lq4Var);
                    }
                } else {
                    nl3Var = new nl3(this, lq4Var);
                }
                Object obj17 = nl3Var.d;
                int i27 = nl3Var.e;
                if (i27 != 0) {
                    if (i27 == 1) {
                        ch3.d0(obj17);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj17);
                if (((Number) obj).longValue() < 0) {
                    return sbiVar;
                }
                nl3Var.e = 1;
                return yx6Var.emit(obj, nl3Var) == hu4Var ? hu4Var : sbiVar;
            case 13:
                if (lq4Var instanceof ol3) {
                    ol3Var = (ol3) lq4Var;
                    int i28 = ol3Var.e;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        ol3Var.e = i28 - Integer.MIN_VALUE;
                    } else {
                        ol3Var = new ol3(this, lq4Var);
                    }
                } else {
                    ol3Var = new ol3(this, lq4Var);
                }
                Object obj18 = ol3Var.d;
                int i29 = ol3Var.e;
                if (i29 != 0) {
                    if (i29 == 1) {
                        ch3.d0(obj18);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj18);
                if (((m8b) obj).i()) {
                    return sbiVar;
                }
                ol3Var.e = 1;
                return yx6Var.emit(obj, ol3Var) == hu4Var ? hu4Var : sbiVar;
            case 14:
                if (lq4Var instanceof zl3) {
                    zl3Var = (zl3) lq4Var;
                    int i30 = zl3Var.e;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        zl3Var.e = i30 - Integer.MIN_VALUE;
                    } else {
                        zl3Var = new zl3(this, lq4Var);
                    }
                } else {
                    zl3Var = new zl3(this, lq4Var);
                }
                Object obj19 = zl3Var.d;
                int i31 = zl3Var.e;
                if (i31 != 0) {
                    if (i31 == 1) {
                        ch3.d0(obj19);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj19);
                if (!(obj instanceof ji3)) {
                    return sbiVar;
                }
                zl3Var.e = 1;
                return yx6Var.emit(obj, zl3Var) == hu4Var ? hu4Var : sbiVar;
            case 15:
                if (lq4Var instanceof am3) {
                    am3Var = (am3) lq4Var;
                    int i32 = am3Var.e;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        am3Var.e = i32 - Integer.MIN_VALUE;
                    } else {
                        am3Var = new am3(this, lq4Var);
                    }
                } else {
                    am3Var = new am3(this, lq4Var);
                }
                Object obj20 = am3Var.d;
                int i33 = am3Var.e;
                if (i33 != 0) {
                    if (i33 == 1) {
                        ch3.d0(obj20);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj20);
                if (!(obj instanceof ck4)) {
                    return sbiVar;
                }
                am3Var.e = 1;
                return yx6Var.emit(obj, am3Var) == hu4Var ? hu4Var : sbiVar;
            case 16:
                if (lq4Var instanceof sm3) {
                    sm3Var = (sm3) lq4Var;
                    int i34 = sm3Var.e;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        sm3Var.e = i34 - Integer.MIN_VALUE;
                    } else {
                        sm3Var = new sm3(this, lq4Var);
                    }
                } else {
                    sm3Var = new sm3(this, lq4Var);
                }
                Object obj21 = sm3Var.d;
                int i35 = sm3Var.e;
                if (i35 == 0) {
                    ch3.d0(obj21);
                    List list4 = ((wh3) obj).a;
                    sm3Var.e = 1;
                    return yx6Var.emit(list4, sm3Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i35 == 1) {
                    ch3.d0(obj21);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lq4Var instanceof qo3) {
                    qo3Var = (qo3) lq4Var;
                    int i36 = qo3Var.e;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        qo3Var.e = i36 - Integer.MIN_VALUE;
                    } else {
                        qo3Var = new qo3(this, lq4Var);
                    }
                } else {
                    qo3Var = new qo3(this, lq4Var);
                }
                Object obj22 = qo3Var.d;
                int i37 = qo3Var.e;
                if (i37 != 0) {
                    if (i37 == 1) {
                        ch3.d0(obj22);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj22);
                if (((Number) obj).longValue() == -1) {
                    return sbiVar;
                }
                qo3Var.e = 1;
                return yx6Var.emit(obj, qo3Var) == hu4Var ? hu4Var : sbiVar;
            case 18:
                if (lq4Var instanceof ro3) {
                    ro3Var = (ro3) lq4Var;
                    int i38 = ro3Var.e;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        ro3Var.e = i38 - Integer.MIN_VALUE;
                    } else {
                        ro3Var = new ro3(this, lq4Var);
                    }
                } else {
                    ro3Var = new ro3(this, lq4Var);
                }
                Object obj23 = ro3Var.d;
                int i39 = ro3Var.e;
                if (i39 != 0) {
                    if (i39 == 1) {
                        ch3.d0(obj23);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj23);
                if (!(obj instanceof im3)) {
                    return sbiVar;
                }
                ro3Var.e = 1;
                return yx6Var.emit(obj, ro3Var) == hu4Var ? hu4Var : sbiVar;
            case 19:
                if (lq4Var instanceof jq3) {
                    jq3Var = (jq3) lq4Var;
                    int i40 = jq3Var.e;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        jq3Var.e = i40 - Integer.MIN_VALUE;
                    } else {
                        jq3Var = new jq3(this, lq4Var);
                    }
                } else {
                    jq3Var = new jq3(this, lq4Var);
                }
                Object obj24 = jq3Var.d;
                int i41 = jq3Var.e;
                if (i41 != 0) {
                    if (i41 == 1) {
                        ch3.d0(obj24);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj24);
                if (!cqk.d((String) obj, "nightmode")) {
                    return sbiVar;
                }
                jq3Var.e = 1;
                return yx6Var.emit(obj, jq3Var) == hu4Var ? hu4Var : sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                if (lq4Var instanceof rn4) {
                    rn4Var = (rn4) lq4Var;
                    int i42 = rn4Var.e;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        rn4Var.e = i42 - Integer.MIN_VALUE;
                    } else {
                        rn4Var = new rn4(this, lq4Var);
                    }
                } else {
                    rn4Var = new rn4(this, lq4Var);
                }
                Object obj25 = rn4Var.d;
                int i43 = rn4Var.e;
                if (i43 != 0) {
                    if (i43 == 1) {
                        ch3.d0(obj25);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj25);
                ej4 ej4Var = (ej4) obj;
                if (!(ej4Var instanceof dj4) && !(ej4Var instanceof aj4)) {
                    return sbiVar;
                }
                rn4Var.e = 1;
                return yx6Var.emit(obj, rn4Var) == hu4Var ? hu4Var : sbiVar;
            case 21:
                if (lq4Var instanceof cd6) {
                    cd6Var = (cd6) lq4Var;
                    int i44 = cd6Var.e;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        cd6Var.e = i44 - Integer.MIN_VALUE;
                    } else {
                        cd6Var = new cd6(this, lq4Var);
                    }
                } else {
                    cd6Var = new cd6(this, lq4Var);
                }
                Object obj26 = cd6Var.d;
                int i45 = cd6Var.e;
                if (i45 != 0) {
                    if (i45 == 1) {
                        ch3.d0(obj26);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj26);
                if (((Number) obj).intValue() < 0) {
                    return sbiVar;
                }
                cd6Var.e = 1;
                return yx6Var.emit(obj, cd6Var) == hu4Var ? hu4Var : sbiVar;
            case 22:
                if (lq4Var instanceof dy6) {
                    dy6Var = (dy6) lq4Var;
                    int i46 = dy6Var.e;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        dy6Var.e = i46 - Integer.MIN_VALUE;
                    } else {
                        dy6Var = new dy6(this, lq4Var);
                    }
                } else {
                    dy6Var = new dy6(this, lq4Var);
                }
                Object obj27 = dy6Var.d;
                int i47 = dy6Var.e;
                if (i47 != 0) {
                    if (i47 == 1) {
                        ch3.d0(obj27);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj27);
                if (((List) obj).isEmpty()) {
                    return sbiVar;
                }
                dy6Var.e = 1;
                return yx6Var.emit(obj, dy6Var) == hu4Var ? hu4Var : sbiVar;
            case 23:
                return b((xx6) obj, lq4Var);
            case 24:
                if (lq4Var instanceof m07) {
                    m07Var = (m07) lq4Var;
                    int i48 = m07Var.e;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        m07Var.e = i48 - Integer.MIN_VALUE;
                    } else {
                        m07Var = new m07(this, lq4Var);
                    }
                } else {
                    m07Var = new m07(this, lq4Var);
                }
                Object obj28 = m07Var.d;
                int i49 = m07Var.e;
                if (i49 != 0) {
                    if (i49 == 1) {
                        ch3.d0(obj28);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj28);
                if (obj == null) {
                    return sbiVar;
                }
                m07Var.e = 1;
                return yx6Var.emit(obj, m07Var) == hu4Var ? hu4Var : sbiVar;
            case 25:
                if (lq4Var instanceof j67) {
                    j67Var = (j67) lq4Var;
                    int i50 = j67Var.e;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        j67Var.e = i50 - Integer.MIN_VALUE;
                    } else {
                        j67Var = new j67(this, lq4Var);
                    }
                } else {
                    j67Var = new j67(this, lq4Var);
                }
                Object obj29 = j67Var.d;
                int i51 = j67Var.e;
                if (i51 != 0) {
                    if (i51 == 1) {
                        ch3.d0(obj29);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj29);
                if (((List) obj).isEmpty()) {
                    return sbiVar;
                }
                j67Var.e = 1;
                return yx6Var.emit(obj, j67Var) == hu4Var ? hu4Var : sbiVar;
            case 26:
                if (lq4Var instanceof t67) {
                    t67Var = (t67) lq4Var;
                    int i52 = t67Var.e;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        t67Var.e = i52 - Integer.MIN_VALUE;
                    } else {
                        t67Var = new t67(this, lq4Var);
                    }
                } else {
                    t67Var = new t67(this, lq4Var);
                }
                Object obj30 = t67Var.d;
                int i53 = t67Var.e;
                if (i53 == 0) {
                    ch3.d0(obj30);
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue == 0) {
                        obj2 = cu7.c;
                    } else if (iIntValue == 1) {
                        obj2 = eu7.c;
                    } else if (iIntValue == 2) {
                        obj2 = fu7.c;
                    } else if (iIntValue == 3) {
                        obj2 = du7.c;
                    } else {
                        ore.p(c0a.k(iIntValue, "Unknown connection state \"", "\""));
                    }
                    t67Var.e = 1;
                    return yx6Var.emit(obj2, t67Var) == hu4Var ? hu4Var : sbiVar;
                }
                if (i53 == 1) {
                    ch3.d0(obj30);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lq4Var instanceof v67) {
                    v67Var = (v67) lq4Var;
                    int i54 = v67Var.e;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        v67Var.e = i54 - Integer.MIN_VALUE;
                    } else {
                        v67Var = new v67(this, lq4Var);
                    }
                } else {
                    v67Var = new v67(this, lq4Var);
                }
                Object obj31 = v67Var.d;
                int i55 = v67Var.e;
                if (i55 != 0) {
                    if (i55 == 1) {
                        ch3.d0(obj31);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj31);
                if (((y47) obj) == y47.b) {
                    return sbiVar;
                }
                v67Var.e = 1;
                return yx6Var.emit(obj, v67Var) == hu4Var ? hu4Var : sbiVar;
            case 28:
                if (lq4Var instanceof pg9) {
                    pg9Var = (pg9) lq4Var;
                    int i56 = pg9Var.e;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        pg9Var.e = i56 - Integer.MIN_VALUE;
                    } else {
                        pg9Var = new pg9(this, lq4Var);
                    }
                } else {
                    pg9Var = new pg9(this, lq4Var);
                }
                Object obj32 = pg9Var.d;
                int i57 = pg9Var.e;
                if (i57 != 0) {
                    if (i57 == 1) {
                        ch3.d0(obj32);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj32);
                if (((we4) obj) == we4.TYPE_UNKNOWN) {
                    return sbiVar;
                }
                pg9Var.e = 1;
                return yx6Var.emit(obj, pg9Var) == hu4Var ? hu4Var : sbiVar;
            default:
                if (lq4Var instanceof ck9) {
                    ck9Var = (ck9) lq4Var;
                    int i58 = ck9Var.e;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        ck9Var.e = i58 - Integer.MIN_VALUE;
                    } else {
                        ck9Var = new ck9(this, lq4Var);
                    }
                } else {
                    ck9Var = new ck9(this, lq4Var);
                }
                Object obj33 = ck9Var.d;
                int i59 = ck9Var.e;
                if (i59 == 0) {
                    ch3.d0(obj33);
                    l49 l49Var = (l49) obj;
                    int i60 = MainActivity.o1;
                    if ((l49Var instanceof k39) || (l49Var instanceof i39) || (l49Var instanceof s39) || (l49Var instanceof x39) || (l49Var instanceof a49) || (l49Var instanceof c49) || (l49Var instanceof d49) || (l49Var instanceof e49) || (l49Var instanceof f49) || (l49Var instanceof h49) || (l49Var instanceof i49)) {
                        ck9Var.e = 1;
                        return yx6Var.emit(obj, ck9Var) == hu4Var ? hu4Var : sbiVar;
                    }
                    if (cqk.d(l49Var, j39.a) || cqk.d(l49Var, l39.a) || cqk.d(l49Var, o39.a) || cqk.d(l49Var, p39.a) || cqk.d(l49Var, q39.a) || cqk.d(l49Var, n39.a) || cqk.d(l49Var, t39.a) || (l49Var instanceof u39) || (l49Var instanceof w39) || (l49Var instanceof y39) || cqk.d(l49Var, z39.a) || cqk.d(l49Var, b49.a) || cqk.d(l49Var, g49.a) || cqk.d(l49Var, k49.a) || cqk.d(l49Var, m39.a) || (l49Var instanceof r39)) {
                        return sbiVar;
                    }
                    ore.o();
                } else {
                    if (i59 == 1) {
                        ch3.d0(obj33);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public /* synthetic */ iz(yx6 yx6Var, Object obj, int i) {
        this.a = i;
        this.b = yx6Var;
    }
}
