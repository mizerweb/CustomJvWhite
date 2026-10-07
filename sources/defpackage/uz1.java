package defpackage;

import java.util.Collections;
import java.util.List;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class uz1 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;

    public /* synthetic */ uz1(yx6 yx6Var, int i) {
        this.a = i;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:146:0x022d  */
    /* JADX WARN: Code duplicated, block: B:162:0x026b  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:196:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:212:0x032a  */
    /* JADX WARN: Code duplicated, block: B:235:0x037d  */
    /* JADX WARN: Code duplicated, block: B:253:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:269:0x0401  */
    /* JADX WARN: Code duplicated, block: B:289:0x046a  */
    /* JADX WARN: Code duplicated, block: B:307:0x04af  */
    /* JADX WARN: Code duplicated, block: B:323:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:339:0x052f  */
    /* JADX WARN: Code duplicated, block: B:355:0x0583  */
    /* JADX WARN: Code duplicated, block: B:375:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:398:0x0617  */
    /* JADX WARN: Code duplicated, block: B:419:0x0660  */
    /* JADX WARN: Code duplicated, block: B:435:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:456:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:472:0x072a  */
    /* JADX WARN: Code duplicated, block: B:488:0x0768  */
    /* JADX WARN: Code duplicated, block: B:507:0x07af  */
    /* JADX WARN: Code duplicated, block: B:523:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:539:0x082b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0131  */
    /* JADX WARN: Code duplicated, block: B:92:0x0173  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        tz1 tz1Var;
        wz1 wz1Var;
        xz1 xz1Var;
        yz1 yz1Var;
        zz1 zz1Var;
        a02 a02Var;
        b02 b02Var;
        nx2 nx2Var;
        c02 c02Var;
        d02 d02Var;
        e02 e02Var;
        f02 f02Var;
        c42 c42Var;
        d42 d42Var;
        u82 u82Var;
        is2 is2Var;
        bu2 bu2Var;
        fv2 fv2Var;
        qz2 qz2Var;
        e43 e43Var;
        bb3 bb3Var;
        cb3 cb3Var;
        kb3 kb3Var;
        mb3 mb3Var;
        sc3 sc3Var;
        tc3 tc3Var;
        wc3 wc3Var;
        yc3 yc3Var;
        bd3 bd3Var;
        nx2 nx2Var2;
        pd3 pd3Var;
        sd3 sd3Var;
        z = false;
        z = false;
        boolean z = false;
        z = false;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        i = 0;
        int i = 0;
        Object tnhVar = null;
        switch (this.a) {
            case 0:
                if (lq4Var instanceof tz1) {
                    tz1Var = (tz1) lq4Var;
                    int i2 = tz1Var.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        tz1Var.e = i2 - Integer.MIN_VALUE;
                    } else {
                        tz1Var = new tz1(this, lq4Var);
                    }
                } else {
                    tz1Var = new tz1(this, lq4Var);
                }
                Object obj2 = tz1Var.d;
                hu4 hu4Var = hu4.a;
                int i3 = tz1Var.e;
                if (i3 == 0) {
                    ch3.d0(obj2);
                    yx6 yx6Var = this.b;
                    Boolean boolValueOf = Boolean.valueOf(((l9) obj).b.i);
                    tz1Var.e = 1;
                    if (yx6Var.emit(boolValueOf, tz1Var) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj2);
                }
                return sbi.a;
            case 1:
                if (lq4Var instanceof wz1) {
                    wz1Var = (wz1) lq4Var;
                    int i4 = wz1Var.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        wz1Var.e = i4 - Integer.MIN_VALUE;
                    } else {
                        wz1Var = new wz1(this, lq4Var);
                    }
                } else {
                    wz1Var = new wz1(this, lq4Var);
                }
                Object obj3 = wz1Var.d;
                hu4 hu4Var2 = hu4.a;
                int i5 = wz1Var.e;
                if (i5 == 0) {
                    ch3.d0(obj3);
                    yx6 yx6Var2 = this.b;
                    u4f u4fVar = ((t4f) obj).a;
                    wz1Var.e = 1;
                    if (yx6Var2.emit(u4fVar, wz1Var) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i5 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj3);
                }
                return sbi.a;
            case 2:
                if (lq4Var instanceof xz1) {
                    xz1Var = (xz1) lq4Var;
                    int i6 = xz1Var.e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        xz1Var.e = i6 - Integer.MIN_VALUE;
                    } else {
                        xz1Var = new xz1(this, lq4Var);
                    }
                } else {
                    xz1Var = new xz1(this, lq4Var);
                }
                Object obj4 = xz1Var.d;
                hu4 hu4Var3 = hu4.a;
                int i7 = xz1Var.e;
                if (i7 == 0) {
                    ch3.d0(obj4);
                    yx6 yx6Var3 = this.b;
                    enc encVar = ((l9) obj).c;
                    xz1Var.e = 1;
                    if (yx6Var3.emit(encVar, xz1Var) == hu4Var3) {
                        return hu4Var3;
                    }
                } else {
                    if (i7 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj4);
                }
                return sbi.a;
            case 3:
                if (lq4Var instanceof yz1) {
                    yz1Var = (yz1) lq4Var;
                    int i8 = yz1Var.e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        yz1Var.e = i8 - Integer.MIN_VALUE;
                    } else {
                        yz1Var = new yz1(this, lq4Var);
                    }
                } else {
                    yz1Var = new yz1(this, lq4Var);
                }
                Object obj5 = yz1Var.d;
                hu4 hu4Var4 = hu4.a;
                int i9 = yz1Var.e;
                if (i9 == 0) {
                    ch3.d0(obj5);
                    yx6 yx6Var4 = this.b;
                    Boolean boolValueOf2 = Boolean.valueOf(((of1) obj).a.d != null);
                    yz1Var.e = 1;
                    if (yx6Var4.emit(boolValueOf2, yz1Var) == hu4Var4) {
                        return hu4Var4;
                    }
                } else {
                    if (i9 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj5);
                }
                return sbi.a;
            case 4:
                if (lq4Var instanceof zz1) {
                    zz1Var = (zz1) lq4Var;
                    int i10 = zz1Var.e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        zz1Var.e = i10 - Integer.MIN_VALUE;
                    } else {
                        zz1Var = new zz1(this, lq4Var);
                    }
                } else {
                    zz1Var = new zz1(this, lq4Var);
                }
                Object obj6 = zz1Var.d;
                hu4 hu4Var5 = hu4.a;
                int i11 = zz1Var.e;
                if (i11 == 0) {
                    ch3.d0(obj6);
                    yx6 yx6Var5 = this.b;
                    x7j x7jVar = ((k52) obj).f;
                    zz1Var.e = 1;
                    if (yx6Var5.emit(x7jVar, zz1Var) == hu4Var5) {
                        return hu4Var5;
                    }
                } else {
                    if (i11 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj6);
                }
                return sbi.a;
            case 5:
                if (lq4Var instanceof a02) {
                    a02Var = (a02) lq4Var;
                    int i12 = a02Var.e;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        a02Var.e = i12 - Integer.MIN_VALUE;
                    } else {
                        a02Var = new a02(this, lq4Var);
                    }
                } else {
                    a02Var = new a02(this, lq4Var);
                }
                Object obj7 = a02Var.d;
                hu4 hu4Var6 = hu4.a;
                int i13 = a02Var.e;
                if (i13 == 0) {
                    ch3.d0(obj7);
                    yx6 yx6Var6 = this.b;
                    be1 be1Var = ((l9) obj).d;
                    a02Var.e = 1;
                    if (yx6Var6.emit(be1Var, a02Var) == hu4Var6) {
                        return hu4Var6;
                    }
                } else {
                    if (i13 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj7);
                }
                return sbi.a;
            case 6:
                if (lq4Var instanceof b02) {
                    b02Var = (b02) lq4Var;
                    int i14 = b02Var.e;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        b02Var.e = i14 - Integer.MIN_VALUE;
                    } else {
                        b02Var = new b02(this, lq4Var);
                    }
                } else {
                    b02Var = new b02(this, lq4Var);
                }
                Object obj8 = b02Var.d;
                hu4 hu4Var7 = hu4.a;
                int i15 = b02Var.e;
                if (i15 == 0) {
                    ch3.d0(obj8);
                    yx6 yx6Var7 = this.b;
                    rt2 rt2Var = (rt2) obj;
                    if (rt2Var != null && (nx2Var = rt2Var.b) != null) {
                        i = nx2Var.m;
                    }
                    Integer num = new Integer(i);
                    b02Var.e = 1;
                    if (yx6Var7.emit(num, b02Var) == hu4Var7) {
                        return hu4Var7;
                    }
                } else {
                    if (i15 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj8);
                }
                return sbi.a;
            case 7:
                if (lq4Var instanceof c02) {
                    c02Var = (c02) lq4Var;
                    int i16 = c02Var.e;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c02Var.e = i16 - Integer.MIN_VALUE;
                    } else {
                        c02Var = new c02(this, lq4Var);
                    }
                } else {
                    c02Var = new c02(this, lq4Var);
                }
                Object obj9 = c02Var.d;
                hu4 hu4Var8 = hu4.a;
                int i17 = c02Var.e;
                if (i17 == 0) {
                    ch3.d0(obj9);
                    yx6 yx6Var8 = this.b;
                    Long l = new Long(((k52) obj).i);
                    c02Var.e = 1;
                    if (yx6Var8.emit(l, c02Var) == hu4Var8) {
                        return hu4Var8;
                    }
                } else {
                    if (i17 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj9);
                }
                return sbi.a;
            case 8:
                if (lq4Var instanceof d02) {
                    d02Var = (d02) lq4Var;
                    int i18 = d02Var.e;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        d02Var.e = i18 - Integer.MIN_VALUE;
                    } else {
                        d02Var = new d02(this, lq4Var);
                    }
                } else {
                    d02Var = new d02(this, lq4Var);
                }
                Object obj10 = d02Var.d;
                hu4 hu4Var9 = hu4.a;
                int i19 = d02Var.e;
                if (i19 == 0) {
                    ch3.d0(obj10);
                    yx6 yx6Var9 = this.b;
                    gc gcVar = (gc) obj;
                    if (gcVar.g && gcVar.a) {
                        z3 = true;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z3);
                    d02Var.e = 1;
                    if (yx6Var9.emit(boolValueOf3, d02Var) == hu4Var9) {
                        return hu4Var9;
                    }
                } else {
                    if (i19 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj10);
                }
                return sbi.a;
            case 9:
                if (lq4Var instanceof e02) {
                    e02Var = (e02) lq4Var;
                    int i20 = e02Var.e;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        e02Var.e = i20 - Integer.MIN_VALUE;
                    } else {
                        e02Var = new e02(this, lq4Var);
                    }
                } else {
                    e02Var = new e02(this, lq4Var);
                }
                Object obj11 = e02Var.d;
                hu4 hu4Var10 = hu4.a;
                int i21 = e02Var.e;
                if (i21 == 0) {
                    ch3.d0(obj11);
                    yx6 yx6Var10 = this.b;
                    pi6 pi6Var = ((f62) obj).k;
                    Boolean boolValueOf4 = Boolean.valueOf((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6));
                    e02Var.e = 1;
                    if (yx6Var10.emit(boolValueOf4, e02Var) == hu4Var10) {
                        return hu4Var10;
                    }
                } else {
                    if (i21 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj11);
                }
                return sbi.a;
            case 10:
                if (lq4Var instanceof f02) {
                    f02Var = (f02) lq4Var;
                    int i22 = f02Var.e;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        f02Var.e = i22 - Integer.MIN_VALUE;
                    } else {
                        f02Var = new f02(this, lq4Var);
                    }
                } else {
                    f02Var = new f02(this, lq4Var);
                }
                Object obj12 = f02Var.d;
                hu4 hu4Var11 = hu4.a;
                int i23 = f02Var.e;
                if (i23 == 0) {
                    ch3.d0(obj12);
                    yx6 yx6Var11 = this.b;
                    qf1 qf1Var = (qf1) obj;
                    tnhVar = qf1Var instanceof of1 ? (of1) qf1Var : null;
                    if (tnhVar != null) {
                        f02Var.e = 1;
                        if (yx6Var11.emit(tnhVar, f02Var) == hu4Var11) {
                            return hu4Var11;
                        }
                    }
                } else {
                    if (i23 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj12);
                }
                return sbi.a;
            case 11:
                if (lq4Var instanceof c42) {
                    c42Var = (c42) lq4Var;
                    int i24 = c42Var.e;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        c42Var.e = i24 - Integer.MIN_VALUE;
                    } else {
                        c42Var = new c42(this, lq4Var);
                    }
                } else {
                    c42Var = new c42(this, lq4Var);
                }
                Object obj13 = c42Var.d;
                hu4 hu4Var12 = hu4.a;
                int i25 = c42Var.e;
                if (i25 == 0) {
                    ch3.d0(obj13);
                    yx6 yx6Var12 = this.b;
                    l9 l9Var = (l9) obj;
                    Integer num2 = new Integer(l9Var.c.g.size() + (l9Var.c.a.a.f() ? 1 : 0));
                    c42Var.e = 1;
                    if (yx6Var12.emit(num2, c42Var) == hu4Var12) {
                        return hu4Var12;
                    }
                } else {
                    if (i25 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj13);
                }
                return sbi.a;
            case 12:
                if (lq4Var instanceof d42) {
                    d42Var = (d42) lq4Var;
                    int i26 = d42Var.e;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        d42Var.e = i26 - Integer.MIN_VALUE;
                    } else {
                        d42Var = new d42(this, lq4Var);
                    }
                } else {
                    d42Var = new d42(this, lq4Var);
                }
                Object obj14 = d42Var.d;
                hu4 hu4Var13 = hu4.a;
                int i27 = d42Var.e;
                if (i27 == 0) {
                    ch3.d0(obj14);
                    yx6 yx6Var13 = this.b;
                    enc encVar2 = ((l9) obj).c;
                    d42Var.e = 1;
                    if (yx6Var13.emit(encVar2, d42Var) == hu4Var13) {
                        return hu4Var13;
                    }
                } else {
                    if (i27 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj14);
                }
                return sbi.a;
            case 13:
                if (lq4Var instanceof u82) {
                    u82Var = (u82) lq4Var;
                    int i28 = u82Var.e;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        u82Var.e = i28 - Integer.MIN_VALUE;
                    } else {
                        u82Var = new u82(this, lq4Var);
                    }
                } else {
                    u82Var = new u82(this, lq4Var);
                }
                Object obj15 = u82Var.d;
                hu4 hu4Var14 = hu4.a;
                int i29 = u82Var.e;
                if (i29 == 0) {
                    ch3.d0(obj15);
                    yx6 yx6Var14 = this.b;
                    fu1 fu1VarA = ((l9) obj).c.a();
                    u82Var.e = 1;
                    if (yx6Var14.emit(fu1VarA, u82Var) == hu4Var14) {
                        return hu4Var14;
                    }
                } else {
                    if (i29 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj15);
                }
                return sbi.a;
            case 14:
                if (lq4Var instanceof is2) {
                    is2Var = (is2) lq4Var;
                    int i30 = is2Var.e;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        is2Var.e = i30 - Integer.MIN_VALUE;
                    } else {
                        is2Var = new is2(this, lq4Var);
                    }
                } else {
                    is2Var = new is2(this, lq4Var);
                }
                Object obj16 = is2Var.d;
                hu4 hu4Var15 = hu4.a;
                int i31 = is2Var.e;
                if (i31 == 0) {
                    ch3.d0(obj16);
                    yx6 yx6Var15 = this.b;
                    if (!((List) obj).isEmpty()) {
                        is2Var.e = 1;
                        if (yx6Var15.emit(obj, is2Var) == hu4Var15) {
                            return hu4Var15;
                        }
                    }
                } else {
                    if (i31 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj16);
                }
                return sbi.a;
            case 15:
                r66 r66Var = r66.a;
                if (lq4Var instanceof bu2) {
                    bu2Var = (bu2) lq4Var;
                    int i32 = bu2Var.e;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        bu2Var.e = i32 - Integer.MIN_VALUE;
                    } else {
                        bu2Var = new bu2(this, lq4Var);
                    }
                } else {
                    bu2Var = new bu2(this, lq4Var);
                }
                Object obj17 = bu2Var.d;
                hu4 hu4Var16 = hu4.a;
                int i33 = bu2Var.e;
                if (i33 == 0) {
                    ch3.d0(obj17);
                    yx6 yx6Var16 = this.b;
                    i8a i8aVar = !((rt2) obj).H() ? new i8a(r66Var, r66Var) : new i8a(Collections.singletonList(new e8a(R.id.profile_members_list_add_admin_to_chat_action, new tnh(R.string.profile_members_list_add_to_admin_action), new Integer(R.drawable.icon_user_add))), r66Var);
                    bu2Var.e = 1;
                    if (yx6Var16.emit(i8aVar, bu2Var) == hu4Var16) {
                        return hu4Var16;
                    }
                } else {
                    if (i33 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj17);
                }
                return sbi.a;
            case 16:
                if (lq4Var instanceof fv2) {
                    fv2Var = (fv2) lq4Var;
                    int i34 = fv2Var.e;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        fv2Var.e = i34 - Integer.MIN_VALUE;
                    } else {
                        fv2Var = new fv2(this, lq4Var);
                    }
                } else {
                    fv2Var = new fv2(this, lq4Var);
                }
                Object obj18 = fv2Var.d;
                hu4 hu4Var17 = hu4.a;
                int i35 = fv2Var.e;
                if (i35 == 0) {
                    ch3.d0(obj18);
                    yx6 yx6Var17 = this.b;
                    lq2 lq2VarE = lv2.E((rt2) obj);
                    fv2Var.e = 1;
                    if (yx6Var17.emit(lq2VarE, fv2Var) == hu4Var17) {
                        return hu4Var17;
                    }
                } else {
                    if (i35 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj18);
                }
                return sbi.a;
            case 17:
                if (lq4Var instanceof qz2) {
                    qz2Var = (qz2) lq4Var;
                    int i36 = qz2Var.e;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        qz2Var.e = i36 - Integer.MIN_VALUE;
                    } else {
                        qz2Var = new qz2(this, lq4Var);
                    }
                } else {
                    qz2Var = new qz2(this, lq4Var);
                }
                Object obj19 = qz2Var.d;
                hu4 hu4Var18 = hu4.a;
                int i37 = qz2Var.e;
                if (i37 == 0) {
                    ch3.d0(obj19);
                    yx6 yx6Var18 = this.b;
                    Long lC0 = y5h.C0((String) obj);
                    if (lC0 != null) {
                        qz2Var.e = 1;
                        if (yx6Var18.emit(lC0, qz2Var) == hu4Var18) {
                            return hu4Var18;
                        }
                    }
                } else {
                    if (i37 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj19);
                }
                return sbi.a;
            case 18:
                if (lq4Var instanceof e43) {
                    e43Var = (e43) lq4Var;
                    int i38 = e43Var.e;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        e43Var.e = i38 - Integer.MIN_VALUE;
                    } else {
                        e43Var = new e43(this, lq4Var);
                    }
                } else {
                    e43Var = new e43(this, lq4Var);
                }
                Object obj20 = e43Var.d;
                hu4 hu4Var19 = hu4.a;
                int i39 = e43Var.e;
                if (i39 == 0) {
                    ch3.d0(obj20);
                    yx6 yx6Var19 = this.b;
                    rt2 rt2Var2 = (rt2) obj;
                    if (rt2Var2.e0() && !rt2Var2.C0() && !rt2Var2.p0()) {
                        z2 = true;
                    }
                    Boolean boolValueOf5 = Boolean.valueOf(z2);
                    e43Var.e = 1;
                    if (yx6Var19.emit(boolValueOf5, e43Var) == hu4Var19) {
                        return hu4Var19;
                    }
                } else {
                    if (i39 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj20);
                }
                return sbi.a;
            case 19:
                if (lq4Var instanceof bb3) {
                    bb3Var = (bb3) lq4Var;
                    int i40 = bb3Var.e;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        bb3Var.e = i40 - Integer.MIN_VALUE;
                    } else {
                        bb3Var = new bb3(this, lq4Var);
                    }
                } else {
                    bb3Var = new bb3(this, lq4Var);
                }
                Object obj21 = bb3Var.d;
                hu4 hu4Var20 = hu4.a;
                int i41 = bb3Var.e;
                if (i41 == 0) {
                    ch3.d0(obj21);
                    yx6 yx6Var20 = this.b;
                    Object obj22 = ((ec6) obj).a;
                    bb3Var.e = 1;
                    if (yx6Var20.emit(obj22, bb3Var) == hu4Var20) {
                        return hu4Var20;
                    }
                } else {
                    if (i41 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj21);
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                if (lq4Var instanceof cb3) {
                    cb3Var = (cb3) lq4Var;
                    int i42 = cb3Var.e;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        cb3Var.e = i42 - Integer.MIN_VALUE;
                    } else {
                        cb3Var = new cb3(this, lq4Var);
                    }
                } else {
                    cb3Var = new cb3(this, lq4Var);
                }
                Object obj23 = cb3Var.d;
                hu4 hu4Var21 = hu4.a;
                int i43 = cb3Var.e;
                if (i43 == 0) {
                    ch3.d0(obj23);
                    yx6 yx6Var21 = this.b;
                    Object obj24 = ((ec6) obj).a;
                    cb3Var.e = 1;
                    if (yx6Var21.emit(obj24, cb3Var) == hu4Var21) {
                        return hu4Var21;
                    }
                } else {
                    if (i43 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj23);
                }
                return sbi.a;
            case 21:
                if (lq4Var instanceof kb3) {
                    kb3Var = (kb3) lq4Var;
                    int i44 = kb3Var.e;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        kb3Var.e = i44 - Integer.MIN_VALUE;
                    } else {
                        kb3Var = new kb3(this, lq4Var);
                    }
                } else {
                    kb3Var = new kb3(this, lq4Var);
                }
                Object obj25 = kb3Var.d;
                hu4 hu4Var22 = hu4.a;
                int i45 = kb3Var.e;
                if (i45 == 0) {
                    ch3.d0(obj25);
                    yx6 yx6Var22 = this.b;
                    if (((Boolean) obj).booleanValue()) {
                        kb3Var.e = 1;
                        if (yx6Var22.emit(obj, kb3Var) == hu4Var22) {
                            return hu4Var22;
                        }
                    }
                } else {
                    if (i45 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj25);
                }
                return sbi.a;
            case 22:
                if (lq4Var instanceof mb3) {
                    mb3Var = (mb3) lq4Var;
                    int i46 = mb3Var.e;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        mb3Var.e = i46 - Integer.MIN_VALUE;
                    } else {
                        mb3Var = new mb3(this, lq4Var);
                    }
                } else {
                    mb3Var = new mb3(this, lq4Var);
                }
                Object obj26 = mb3Var.d;
                hu4 hu4Var23 = hu4.a;
                int i47 = mb3Var.e;
                if (i47 == 0) {
                    ch3.d0(obj26);
                    yx6 yx6Var23 = this.b;
                    Object obj27 = ((ec6) obj).a;
                    mb3Var.e = 1;
                    if (yx6Var23.emit(obj27, mb3Var) == hu4Var23) {
                        return hu4Var23;
                    }
                } else {
                    if (i47 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj26);
                }
                return sbi.a;
            case 23:
                if (lq4Var instanceof sc3) {
                    sc3Var = (sc3) lq4Var;
                    int i48 = sc3Var.e;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        sc3Var.e = i48 - Integer.MIN_VALUE;
                    } else {
                        sc3Var = new sc3(this, lq4Var);
                    }
                } else {
                    sc3Var = new sc3(this, lq4Var);
                }
                Object obj28 = sc3Var.d;
                hu4 hu4Var24 = hu4.a;
                int i49 = sc3Var.e;
                if (i49 == 0) {
                    ch3.d0(obj28);
                    yx6 yx6Var24 = this.b;
                    if (obj instanceof ky2) {
                        sc3Var.e = 1;
                        if (yx6Var24.emit(obj, sc3Var) == hu4Var24) {
                            return hu4Var24;
                        }
                    }
                } else {
                    if (i49 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj28);
                }
                return sbi.a;
            case 24:
                if (lq4Var instanceof tc3) {
                    tc3Var = (tc3) lq4Var;
                    int i50 = tc3Var.e;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        tc3Var.e = i50 - Integer.MIN_VALUE;
                    } else {
                        tc3Var = new tc3(this, lq4Var);
                    }
                } else {
                    tc3Var = new tc3(this, lq4Var);
                }
                Object obj29 = tc3Var.d;
                hu4 hu4Var25 = hu4.a;
                int i51 = tc3Var.e;
                if (i51 == 0) {
                    ch3.d0(obj29);
                    yx6 yx6Var25 = this.b;
                    if (obj instanceof bj4) {
                        tc3Var.e = 1;
                        if (yx6Var25.emit(obj, tc3Var) == hu4Var25) {
                            return hu4Var25;
                        }
                    }
                } else {
                    if (i51 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj29);
                }
                return sbi.a;
            case 25:
                if (lq4Var instanceof wc3) {
                    wc3Var = (wc3) lq4Var;
                    int i52 = wc3Var.e;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        wc3Var.e = i52 - Integer.MIN_VALUE;
                    } else {
                        wc3Var = new wc3(this, lq4Var);
                    }
                } else {
                    wc3Var = new wc3(this, lq4Var);
                }
                Object obj30 = wc3Var.d;
                hu4 hu4Var26 = hu4.a;
                int i53 = wc3Var.e;
                if (i53 == 0) {
                    ch3.d0(obj30);
                    yx6 yx6Var26 = this.b;
                    if (obj instanceof lga) {
                        wc3Var.e = 1;
                        if (yx6Var26.emit(obj, wc3Var) == hu4Var26) {
                            return hu4Var26;
                        }
                    }
                } else {
                    if (i53 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj30);
                }
                return sbi.a;
            case 26:
                if (lq4Var instanceof yc3) {
                    yc3Var = (yc3) lq4Var;
                    int i54 = yc3Var.e;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        yc3Var.e = i54 - Integer.MIN_VALUE;
                    } else {
                        yc3Var = new yc3(this, lq4Var);
                    }
                } else {
                    yc3Var = new yc3(this, lq4Var);
                }
                Object obj31 = yc3Var.d;
                hu4 hu4Var27 = hu4.a;
                int i55 = yc3Var.e;
                if (i55 == 0) {
                    ch3.d0(obj31);
                    yx6 yx6Var27 = this.b;
                    m8b m8bVarJ0 = rx8.j0(((lga) obj).a);
                    yc3Var.e = 1;
                    if (yx6Var27.emit(m8bVarJ0, yc3Var) == hu4Var27) {
                        return hu4Var27;
                    }
                } else {
                    if (i55 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj31);
                }
                return sbi.a;
            case 27:
                if (lq4Var instanceof bd3) {
                    bd3Var = (bd3) lq4Var;
                    int i56 = bd3Var.e;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        bd3Var.e = i56 - Integer.MIN_VALUE;
                    } else {
                        bd3Var = new bd3(this, lq4Var);
                    }
                } else {
                    bd3Var = new bd3(this, lq4Var);
                }
                Object obj32 = bd3Var.d;
                hu4 hu4Var28 = hu4.a;
                int i57 = bd3Var.e;
                if (i57 == 0) {
                    ch3.d0(obj32);
                    yx6 yx6Var28 = this.b;
                    rt2 rt2Var3 = (rt2) obj;
                    if (rt2Var3 != null && (nx2Var2 = rt2Var3.b) != null && (nx2Var2.q0 & 2) != 0) {
                        z = true;
                    }
                    Boolean boolValueOf6 = Boolean.valueOf(z);
                    bd3Var.e = 1;
                    if (yx6Var28.emit(boolValueOf6, bd3Var) == hu4Var28) {
                        return hu4Var28;
                    }
                } else {
                    if (i57 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj32);
                }
                return sbi.a;
            case 28:
                if (lq4Var instanceof pd3) {
                    pd3Var = (pd3) lq4Var;
                    int i58 = pd3Var.e;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        pd3Var.e = i58 - Integer.MIN_VALUE;
                    } else {
                        pd3Var = new pd3(this, lq4Var);
                    }
                } else {
                    pd3Var = new pd3(this, lq4Var);
                }
                Object obj33 = pd3Var.d;
                hu4 hu4Var29 = hu4.a;
                int i59 = pd3Var.e;
                if (i59 == 0) {
                    ch3.d0(obj33);
                    yx6 yx6Var29 = this.b;
                    lx2 lx2Var = ((rt2) obj).b.b;
                    pd3Var.e = 1;
                    if (yx6Var29.emit(lx2Var, pd3Var) == hu4Var29) {
                        return hu4Var29;
                    }
                } else {
                    if (i59 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj33);
                }
                return sbi.a;
            default:
                if (lq4Var instanceof sd3) {
                    sd3Var = (sd3) lq4Var;
                    int i60 = sd3Var.e;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        sd3Var.e = i60 - Integer.MIN_VALUE;
                    } else {
                        sd3Var = new sd3(this, lq4Var);
                    }
                } else {
                    sd3Var = new sd3(this, lq4Var);
                }
                Object obj34 = sd3Var.d;
                hu4 hu4Var30 = hu4.a;
                int i61 = sd3Var.e;
                if (i61 == 0) {
                    ch3.d0(obj34);
                    yx6 yx6Var30 = this.b;
                    int iIntValue = ((Number) obj).intValue();
                    zv8[] zv8VarArr = xd3.X1;
                    if (iIntValue == 0) {
                        tnhVar = new tnh(R.string.connection_state_awaiting);
                    } else if (iIntValue == 1) {
                        tnhVar = new tnh(R.string.connection_state_disconnected);
                    } else if (iIntValue == 2) {
                        tnhVar = new tnh(R.string.connection_state_connected);
                    } else if (iIntValue != 3) {
                        String name = xd3.class.getName();
                        String strK = c0a.k(iIntValue, "Unknown connection state \"", "\"");
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4c.f(a4cVar, je9.g, name, strK, null, null, 8);
                        }
                    }
                    sd3Var.e = 1;
                    if (yx6Var30.emit(tnhVar, sd3Var) == hu4Var30) {
                        return hu4Var30;
                    }
                } else {
                    if (i61 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj34);
                }
                return sbi.a;
        }
    }

    public /* synthetic */ uz1(yx6 yx6Var, Object obj, int i) {
        this.a = i;
        this.b = yx6Var;
    }
}
