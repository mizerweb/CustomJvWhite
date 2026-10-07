package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class jde implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;

    public jde(yx6 yx6Var, p0h p0hVar) {
        this.a = 22;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:129:0x0229  */
    /* JADX WARN: Code duplicated, block: B:151:0x0276  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:202:0x032f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0372  */
    /* JADX WARN: Code duplicated, block: B:241:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:262:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:292:0x045a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0498  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:324:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:341:0x0514  */
    /* JADX WARN: Code duplicated, block: B:358:0x054d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:373:0x0589  */
    /* JADX WARN: Code duplicated, block: B:388:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:405:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:420:0x063f  */
    /* JADX WARN: Code duplicated, block: B:435:0x0685  */
    /* JADX WARN: Code duplicated, block: B:452:0x06be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:469:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:484:0x0738  */
    /* JADX WARN: Code duplicated, block: B:499:0x0774  */
    /* JADX WARN: Code duplicated, block: B:516:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:532:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x012e  */
    /* JADX WARN: Code duplicated, block: B:78:0x016b  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) throws Throwable {
        ide ideVar;
        sme smeVar;
        jze jzeVar;
        h0f h0fVar;
        o4f o4fVar;
        q4f q4fVar;
        ndf ndfVar;
        aff affVar;
        fff fffVar;
        kff kffVar;
        mff mffVar;
        off offVar;
        vof vofVar;
        kyf kyfVar;
        lyf lyfVar;
        b9g b9gVar;
        xlg xlgVar;
        List list;
        npg npgVar;
        Object obj2;
        rpg rpgVar;
        svg svgVar;
        bwg bwgVar;
        cwg cwgVar;
        o0h o0hVar;
        iah iahVar;
        akh akhVar;
        coh cohVar;
        uph uphVar;
        a7i a7iVar;
        Object obj3;
        long j;
        o8i o8iVar;
        Object obj4;
        int i;
        lgi lgiVar;
        int i2 = this.a;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        switch (i2) {
            case 0:
                if (lq4Var instanceof ide) {
                    ideVar = (ide) lq4Var;
                    int i3 = ideVar.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ideVar.e = i3 - Integer.MIN_VALUE;
                    } else {
                        ideVar = new ide(this, lq4Var);
                    }
                } else {
                    ideVar = new ide(this, lq4Var);
                }
                Object obj5 = ideVar.d;
                int i4 = ideVar.e;
                if (i4 == 0) {
                    ch3.d0(obj5);
                    enc encVar = ((l9) obj).c;
                    ideVar.e = 1;
                    return yx6Var.emit(encVar, ideVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj5);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lq4Var instanceof sme) {
                    smeVar = (sme) lq4Var;
                    int i5 = smeVar.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        smeVar.e = i5 - Integer.MIN_VALUE;
                    } else {
                        smeVar = new sme(this, lq4Var);
                    }
                } else {
                    smeVar = new sme(this, lq4Var);
                }
                Object obj6 = smeVar.d;
                int i6 = smeVar.e;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ch3.d0(obj6);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj6);
                if (!onf.a(((Number) obj).intValue())) {
                    return sbiVar;
                }
                smeVar.e = 1;
                return yx6Var.emit(obj, smeVar) == hu4Var ? hu4Var : sbiVar;
            case 2:
                if (lq4Var instanceof jze) {
                    jzeVar = (jze) lq4Var;
                    int i7 = jzeVar.e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        jzeVar.e = i7 - Integer.MIN_VALUE;
                    } else {
                        jzeVar = new jze(this, lq4Var);
                    }
                } else {
                    jzeVar = new jze(this, lq4Var);
                }
                Object obj7 = jzeVar.d;
                int i8 = jzeVar.e;
                if (i8 == 0) {
                    ch3.d0(obj7);
                    Object objT1 = ww3.t1((List) obj);
                    jzeVar.e = 1;
                    return yx6Var.emit(objT1, jzeVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i8 == 1) {
                    ch3.d0(obj7);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lq4Var instanceof h0f) {
                    h0fVar = (h0f) lq4Var;
                    int i9 = h0fVar.e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        h0fVar.e = i9 - Integer.MIN_VALUE;
                    } else {
                        h0fVar = new h0f(this, lq4Var);
                    }
                } else {
                    h0fVar = new h0f(this, lq4Var);
                }
                Object obj8 = h0fVar.d;
                int i10 = h0fVar.e;
                if (i10 == 0) {
                    ch3.d0(obj8);
                    kyj kyjVar = ((lyj) obj).b;
                    h0fVar.e = 1;
                    return yx6Var.emit(kyjVar, h0fVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i10 == 1) {
                    ch3.d0(obj8);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lq4Var instanceof o4f) {
                    o4fVar = (o4f) lq4Var;
                    int i11 = o4fVar.e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        o4fVar.e = i11 - Integer.MIN_VALUE;
                    } else {
                        o4fVar = new o4f(this, lq4Var);
                    }
                } else {
                    o4fVar = new o4f(this, lq4Var);
                }
                Object obj9 = o4fVar.d;
                int i12 = o4fVar.e;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ch3.d0(obj9);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj9);
                if (!((dj4) obj).a.j()) {
                    return sbiVar;
                }
                o4fVar.e = 1;
                return yx6Var.emit(obj, o4fVar) == hu4Var ? hu4Var : sbiVar;
            case 5:
                if (lq4Var instanceof q4f) {
                    q4fVar = (q4f) lq4Var;
                    int i13 = q4fVar.e;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        q4fVar.e = i13 - Integer.MIN_VALUE;
                    } else {
                        q4fVar = new q4f(this, lq4Var);
                    }
                } else {
                    q4fVar = new q4f(this, lq4Var);
                }
                Object obj10 = q4fVar.d;
                int i14 = q4fVar.e;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ch3.d0(obj10);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj10);
                if (!(obj instanceof dj4)) {
                    return sbiVar;
                }
                q4fVar.e = 1;
                return yx6Var.emit(obj, q4fVar) == hu4Var ? hu4Var : sbiVar;
            case 6:
                if (lq4Var instanceof ndf) {
                    ndfVar = (ndf) lq4Var;
                    int i15 = ndfVar.e;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ndfVar.e = i15 - Integer.MIN_VALUE;
                    } else {
                        ndfVar = new ndf(this, lq4Var);
                    }
                } else {
                    ndfVar = new ndf(this, lq4Var);
                }
                Object obj11 = ndfVar.d;
                int i16 = ndfVar.e;
                if (i16 == 0) {
                    ch3.d0(obj11);
                    String lowerCase = r5h.y1((String) obj).toString().toLowerCase(Locale.ROOT);
                    ndfVar.e = 1;
                    return yx6Var.emit(lowerCase, ndfVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i16 == 1) {
                    ch3.d0(obj11);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lq4Var instanceof aff) {
                    affVar = (aff) lq4Var;
                    int i17 = affVar.e;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        affVar.e = i17 - Integer.MIN_VALUE;
                    } else {
                        affVar = new aff(this, lq4Var);
                    }
                } else {
                    affVar = new aff(this, lq4Var);
                }
                Object obj12 = affVar.d;
                int i18 = affVar.e;
                if (i18 == 0) {
                    ch3.d0(obj12);
                    Boolean boolValueOf = Boolean.valueOf(!((List) obj).isEmpty());
                    affVar.e = 1;
                    return yx6Var.emit(boolValueOf, affVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i18 == 1) {
                    ch3.d0(obj12);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lq4Var instanceof fff) {
                    fffVar = (fff) lq4Var;
                    int i19 = fffVar.e;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        fffVar.e = i19 - Integer.MIN_VALUE;
                    } else {
                        fffVar = new fff(this, lq4Var);
                    }
                } else {
                    fffVar = new fff(this, lq4Var);
                }
                Object obj13 = fffVar.d;
                int i20 = fffVar.e;
                if (i20 != 0) {
                    if (i20 == 1) {
                        ch3.d0(obj13);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj13);
                if (!(obj instanceof yh7)) {
                    return sbiVar;
                }
                fffVar.e = 1;
                return yx6Var.emit(obj, fffVar) == hu4Var ? hu4Var : sbiVar;
            case 9:
                if (lq4Var instanceof kff) {
                    kffVar = (kff) lq4Var;
                    int i21 = kffVar.e;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        kffVar.e = i21 - Integer.MIN_VALUE;
                    } else {
                        kffVar = new kff(this, lq4Var);
                    }
                } else {
                    kffVar = new kff(this, lq4Var);
                }
                Object obj14 = kffVar.d;
                int i22 = kffVar.e;
                if (i22 == 0) {
                    ch3.d0(obj14);
                    Object obj15 = ((ec6) obj).a;
                    kffVar.e = 1;
                    return yx6Var.emit(obj15, kffVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i22 == 1) {
                    ch3.d0(obj14);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lq4Var instanceof mff) {
                    mffVar = (mff) lq4Var;
                    int i23 = mffVar.e;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        mffVar.e = i23 - Integer.MIN_VALUE;
                    } else {
                        mffVar = new mff(this, lq4Var);
                    }
                } else {
                    mffVar = new mff(this, lq4Var);
                }
                Object obj16 = mffVar.d;
                int i24 = mffVar.e;
                if (i24 == 0) {
                    ch3.d0(obj16);
                    lx2 lx2Var = ((rt2) obj).b.b;
                    mffVar.e = 1;
                    return yx6Var.emit(lx2Var, mffVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i24 == 1) {
                    ch3.d0(obj16);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lq4Var instanceof off) {
                    offVar = (off) lq4Var;
                    int i25 = offVar.e;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        offVar.e = i25 - Integer.MIN_VALUE;
                    } else {
                        offVar = new off(this, lq4Var);
                    }
                } else {
                    offVar = new off(this, lq4Var);
                }
                Object obj17 = offVar.d;
                int i26 = offVar.e;
                if (i26 != 0) {
                    if (i26 == 1) {
                        ch3.d0(obj17);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj17);
                if (!(obj instanceof tff)) {
                    return sbiVar;
                }
                offVar.e = 1;
                return yx6Var.emit(obj, offVar) == hu4Var ? hu4Var : sbiVar;
            case 12:
                if (lq4Var instanceof vof) {
                    vofVar = (vof) lq4Var;
                    int i27 = vofVar.e;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        vofVar.e = i27 - Integer.MIN_VALUE;
                    } else {
                        vofVar = new vof(this, lq4Var);
                    }
                } else {
                    vofVar = new vof(this, lq4Var);
                }
                Object obj18 = vofVar.d;
                int i28 = vofVar.e;
                if (i28 != 0) {
                    if (i28 == 1) {
                        ch3.d0(obj18);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj18);
                if (((Number) obj).longValue() == -1) {
                    return sbiVar;
                }
                vofVar.e = 1;
                return yx6Var.emit(obj, vofVar) == hu4Var ? hu4Var : sbiVar;
            case 13:
                if (lq4Var instanceof kyf) {
                    kyfVar = (kyf) lq4Var;
                    int i29 = kyfVar.e;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        kyfVar.e = i29 - Integer.MIN_VALUE;
                    } else {
                        kyfVar = new kyf(this, lq4Var);
                    }
                } else {
                    kyfVar = new kyf(this, lq4Var);
                }
                Object obj19 = kyfVar.d;
                int i30 = kyfVar.e;
                if (i30 == 0) {
                    ch3.d0(obj19);
                    Object obj20 = ((ec6) obj).a;
                    kyfVar.e = 1;
                    return yx6Var.emit(obj20, kyfVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i30 == 1) {
                    ch3.d0(obj19);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lq4Var instanceof lyf) {
                    lyfVar = (lyf) lq4Var;
                    int i31 = lyfVar.e;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        lyfVar.e = i31 - Integer.MIN_VALUE;
                    } else {
                        lyfVar = new lyf(this, lq4Var);
                    }
                } else {
                    lyfVar = new lyf(this, lq4Var);
                }
                Object obj21 = lyfVar.d;
                int i32 = lyfVar.e;
                if (i32 != 0) {
                    if (i32 == 1) {
                        ch3.d0(obj21);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj21);
                if (!((Boolean) obj).booleanValue()) {
                    return sbiVar;
                }
                lyfVar.e = 1;
                return yx6Var.emit(obj, lyfVar) == hu4Var ? hu4Var : sbiVar;
            case 15:
                if (lq4Var instanceof b9g) {
                    b9gVar = (b9g) lq4Var;
                    int i33 = b9gVar.e;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        b9gVar.e = i33 - Integer.MIN_VALUE;
                    } else {
                        b9gVar = new b9g(this, lq4Var);
                    }
                } else {
                    b9gVar = new b9g(this, lq4Var);
                }
                Object obj22 = b9gVar.d;
                int i34 = b9gVar.e;
                if (i34 == 0) {
                    ch3.d0(obj22);
                    fjg fjgVar = (fjg) obj;
                    if (fjgVar instanceof g8e) {
                        throw ((g8e) fjgVar).a;
                    }
                    if (fjgVar instanceof ru6) {
                        throw ((ru6) fjgVar).a;
                    }
                    if (fjgVar instanceof e25) {
                        Object obj23 = ((e25) fjgVar).a;
                        b9gVar.e = 1;
                        return yx6Var.emit(obj23, b9gVar) == hu4Var ? hu4Var : sbiVar;
                    }
                    if (fjgVar instanceof uai) {
                        ore.k("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else {
                        ore.o();
                    }
                } else {
                    if (i34 == 1) {
                        ch3.d0(obj22);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 16:
                if (lq4Var instanceof xlg) {
                    xlgVar = (xlg) lq4Var;
                    int i35 = xlgVar.e;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        xlgVar.e = i35 - Integer.MIN_VALUE;
                    } else {
                        xlgVar = new xlg(this, lq4Var);
                    }
                } else {
                    xlgVar = new xlg(this, lq4Var);
                }
                Object obj24 = xlgVar.d;
                int i36 = xlgVar.e;
                if (i36 != 0) {
                    if (i36 == 1) {
                        ch3.d0(obj24);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj24);
                omg omgVar = (omg) obj;
                if (omgVar == null || (list = omgVar.e) == null || !(!list.isEmpty())) {
                    return sbiVar;
                }
                xlgVar.e = 1;
                return yx6Var.emit(obj, xlgVar) == hu4Var ? hu4Var : sbiVar;
            case 17:
                if (lq4Var instanceof npg) {
                    npgVar = (npg) lq4Var;
                    int i37 = npgVar.e;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        npgVar.e = i37 - Integer.MIN_VALUE;
                    } else {
                        npgVar = new npg(this, lq4Var);
                    }
                } else {
                    npgVar = new npg(this, lq4Var);
                }
                Object obj25 = npgVar.d;
                int i38 = npgVar.e;
                if (i38 != 0) {
                    if (i38 == 1) {
                        ch3.d0(obj25);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj25);
                emg emgVar = (emg) obj;
                if (emgVar == null || (obj2 = emgVar.h) == null) {
                    obj2 = r66.a;
                }
                npgVar.e = 1;
                return yx6Var.emit(obj2, npgVar) == hu4Var ? hu4Var : sbiVar;
            case 18:
                if (lq4Var instanceof rpg) {
                    rpgVar = (rpg) lq4Var;
                    int i39 = rpgVar.e;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        rpgVar.e = i39 - Integer.MIN_VALUE;
                    } else {
                        rpgVar = new rpg(this, lq4Var);
                    }
                } else {
                    rpgVar = new rpg(this, lq4Var);
                }
                Object obj26 = rpgVar.d;
                int i40 = rpgVar.e;
                if (i40 == 0) {
                    ch3.d0(obj26);
                    Object obj27 = ((Boolean) obj).booleanValue() ? fpg.a : dpg.a;
                    rpgVar.e = 1;
                    return yx6Var.emit(obj27, rpgVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i40 == 1) {
                    ch3.d0(obj26);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lq4Var instanceof svg) {
                    svgVar = (svg) lq4Var;
                    int i41 = svgVar.e;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        svgVar.e = i41 - Integer.MIN_VALUE;
                    } else {
                        svgVar = new svg(this, lq4Var);
                    }
                } else {
                    svgVar = new svg(this, lq4Var);
                }
                Object obj28 = svgVar.d;
                int i42 = svgVar.e;
                if (i42 == 0) {
                    ch3.d0(obj28);
                    Boolean boolValueOf2 = Boolean.valueOf(((k1h) obj) != null);
                    svgVar.e = 1;
                    return yx6Var.emit(boolValueOf2, svgVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i42 == 1) {
                    ch3.d0(obj28);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                if (lq4Var instanceof bwg) {
                    bwgVar = (bwg) lq4Var;
                    int i43 = bwgVar.e;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        bwgVar.e = i43 - Integer.MIN_VALUE;
                    } else {
                        bwgVar = new bwg(this, lq4Var);
                    }
                } else {
                    bwgVar = new bwg(this, lq4Var);
                }
                Object obj29 = bwgVar.d;
                int i44 = bwgVar.e;
                if (i44 == 0) {
                    ch3.d0(obj29);
                    Object obj30 = ((ec6) obj).a;
                    bwgVar.e = 1;
                    return yx6Var.emit(obj30, bwgVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i44 == 1) {
                    ch3.d0(obj29);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lq4Var instanceof cwg) {
                    cwgVar = (cwg) lq4Var;
                    int i45 = cwgVar.e;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        cwgVar.e = i45 - Integer.MIN_VALUE;
                    } else {
                        cwgVar = new cwg(this, lq4Var);
                    }
                } else {
                    cwgVar = new cwg(this, lq4Var);
                }
                Object obj31 = cwgVar.d;
                int i46 = cwgVar.e;
                if (i46 != 0) {
                    if (i46 == 1) {
                        ch3.d0(obj31);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj31);
                if (!((Boolean) obj).booleanValue()) {
                    return sbiVar;
                }
                cwgVar.e = 1;
                return yx6Var.emit(obj, cwgVar) == hu4Var ? hu4Var : sbiVar;
            case 22:
                if (lq4Var instanceof o0h) {
                    o0hVar = (o0h) lq4Var;
                    int i47 = o0hVar.e;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        o0hVar.e = i47 - Integer.MIN_VALUE;
                    } else {
                        o0hVar = new o0h(this, lq4Var);
                    }
                } else {
                    o0hVar = new o0h(this, lq4Var);
                }
                Object obj32 = o0hVar.d;
                int i48 = o0hVar.e;
                if (i48 != 0) {
                    if (i48 == 1) {
                        ch3.d0(obj32);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj32);
                g0h g0hVar = (g0h) obj;
                e0h e0hVar = g0hVar instanceof e0h ? (e0h) g0hVar : null;
                Float f = new Float(e0hVar != 0 ? e0hVar.a : 0.0f);
                o0hVar.e = 1;
                return yx6Var.emit(f, o0hVar) == hu4Var ? hu4Var : sbiVar;
            case 23:
                if (lq4Var instanceof iah) {
                    iahVar = (iah) lq4Var;
                    int i49 = iahVar.e;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        iahVar.e = i49 - Integer.MIN_VALUE;
                    } else {
                        iahVar = new iah(this, lq4Var);
                    }
                } else {
                    iahVar = new iah(this, lq4Var);
                }
                Object obj33 = iahVar.d;
                int i50 = iahVar.e;
                if (i50 != 0) {
                    if (i50 == 1) {
                        ch3.d0(obj33);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj33);
                if (!(obj instanceof c11)) {
                    return sbiVar;
                }
                iahVar.e = 1;
                return yx6Var.emit(obj, iahVar) == hu4Var ? hu4Var : sbiVar;
            case 24:
                if (lq4Var instanceof akh) {
                    akhVar = (akh) lq4Var;
                    int i51 = akhVar.e;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        akhVar.e = i51 - Integer.MIN_VALUE;
                    } else {
                        akhVar = new akh(this, lq4Var);
                    }
                } else {
                    akhVar = new akh(this, lq4Var);
                }
                Object obj34 = akhVar.d;
                int i52 = akhVar.e;
                if (i52 == 0) {
                    ch3.d0(obj34);
                    Object k89Var = ((Boolean) obj).booleanValue() ? new k89() : new j89();
                    akhVar.e = 1;
                    return yx6Var.emit(k89Var, akhVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i52 == 1) {
                    ch3.d0(obj34);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lq4Var instanceof coh) {
                    cohVar = (coh) lq4Var;
                    int i53 = cohVar.e;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        cohVar.e = i53 - Integer.MIN_VALUE;
                    } else {
                        cohVar = new coh(this, lq4Var);
                    }
                } else {
                    cohVar = new coh(this, lq4Var);
                }
                Object obj35 = cohVar.d;
                int i54 = cohVar.e;
                if (i54 == 0) {
                    ch3.d0(obj35);
                    s8b s8bVarE = ((u8b) obj).e();
                    cohVar.e = 1;
                    return yx6Var.emit(s8bVarE, cohVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i54 == 1) {
                    ch3.d0(obj35);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lq4Var instanceof uph) {
                    uphVar = (uph) lq4Var;
                    int i55 = uphVar.e;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        uphVar.e = i55 - Integer.MIN_VALUE;
                    } else {
                        uphVar = new uph(this, lq4Var);
                    }
                } else {
                    uphVar = new uph(this, lq4Var);
                }
                Object obj36 = uphVar.d;
                int i56 = uphVar.e;
                if (i56 == 0) {
                    ch3.d0(obj36);
                    rph rphVar = new rph((Drawable) obj);
                    uphVar.e = 1;
                    return yx6Var.emit(rphVar, uphVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i56 == 1) {
                    ch3.d0(obj36);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lq4Var instanceof a7i) {
                    a7iVar = (a7i) lq4Var;
                    int i57 = a7iVar.e;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        a7iVar.e = i57 - Integer.MIN_VALUE;
                    } else {
                        a7iVar = new a7i(this, lq4Var);
                    }
                } else {
                    a7iVar = new a7i(this, lq4Var);
                }
                Object obj37 = a7iVar.d;
                int i58 = a7iVar.e;
                if (i58 != 0) {
                    if (i58 == 1) {
                        ch3.d0(obj37);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj37);
                long jLongValue = ((Number) obj).longValue();
                obj3 = jLongValue > 0 ? String.format("%01d:%02d", Arrays.copyOf(new Object[]{new Long(jLongValue / 60), new Long(jLongValue % 60)}, 2)) : null;
                a7iVar.e = 1;
                return yx6Var.emit(obj3, a7iVar) == hu4Var ? hu4Var : sbiVar;
            case 28:
                if (lq4Var instanceof o8i) {
                    o8iVar = (o8i) lq4Var;
                    j = 60;
                    int i59 = o8iVar.e;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        o8iVar.e = i59 - Integer.MIN_VALUE;
                    }
                    obj4 = o8iVar.d;
                    i = o8iVar.e;
                    if (i != 0) {
                        if (i == 1) {
                            ch3.d0(obj4);
                            return sbiVar;
                        }
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj4);
                    long jLongValue2 = ((Number) obj).longValue();
                    obj3 = jLongValue2 > 0 ? String.format("%01d:%02d", Arrays.copyOf(new Object[]{new Long(jLongValue2 / j), new Long(jLongValue2 % j)}, 2)) : null;
                    o8iVar.e = 1;
                    if (yx6Var.emit(obj3, o8iVar) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                j = 60;
                o8iVar = new o8i(this, lq4Var);
                obj4 = o8iVar.d;
                i = o8iVar.e;
                if (i != 0) {
                    if (i == 1) {
                        ch3.d0(obj4);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj4);
                long jLongValue3 = ((Number) obj).longValue();
                if (jLongValue3 > 0) {
                }
                o8iVar.e = 1;
                if (yx6Var.emit(obj3, o8iVar) == hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            default:
                if (lq4Var instanceof lgi) {
                    lgiVar = (lgi) lq4Var;
                    int i60 = lgiVar.e;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        lgiVar.e = i60 - Integer.MIN_VALUE;
                    } else {
                        lgiVar = new lgi(this, lq4Var);
                    }
                } else {
                    lgiVar = new lgi(this, lq4Var);
                }
                Object obj38 = lgiVar.d;
                int i61 = lgiVar.e;
                if (i61 != 0) {
                    if (i61 == 1) {
                        ch3.d0(obj38);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj38);
                if (!onf.a(((Number) obj).intValue())) {
                    return sbiVar;
                }
                lgiVar.e = 1;
                return yx6Var.emit(obj, lgiVar) == hu4Var ? hu4Var : sbiVar;
        }
    }

    public /* synthetic */ jde(yx6 yx6Var, int i) {
        this.a = i;
        this.b = yx6Var;
    }
}
