package defpackage;

import android.net.Uri;
import java.util.List;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class ngi implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;

    public ngi(yx6 yx6Var, i6j i6jVar) {
        this.a = 18;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:153:0x023d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0291  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:215:0x0314  */
    /* JADX WARN: Code duplicated, block: B:238:0x0364  */
    /* JADX WARN: Code duplicated, block: B:256:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:272:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:288:0x042e  */
    /* JADX WARN: Code duplicated, block: B:307:0x0475  */
    /* JADX WARN: Code duplicated, block: B:323:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:339:0x0516  */
    /* JADX WARN: Code duplicated, block: B:358:0x055b  */
    /* JADX WARN: Code duplicated, block: B:376:0x0599  */
    /* JADX WARN: Code duplicated, block: B:394:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:410:0x0625  */
    /* JADX WARN: Code duplicated, block: B:426:0x066a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        mgi mgiVar;
        xhi xhiVar;
        aii aiiVar;
        vni vniVar;
        voi voiVar;
        woi woiVar;
        xoi xoiVar;
        yoi yoiVar;
        zoi zoiVar;
        Object l;
        cpi cpiVar;
        epi epiVar;
        mti mtiVar;
        nti ntiVar;
        String str;
        oti otiVar;
        jxi jxiVar;
        kxi kxiVar;
        c2j c2jVar;
        d2j d2jVar;
        h6j h6jVar;
        Object poeVar;
        goj gojVar;
        hoj hojVar;
        i3k i3kVar;
        boolean z = false;
        switch (this.a) {
            case 0:
                if (lq4Var instanceof mgi) {
                    mgiVar = (mgi) lq4Var;
                    int i = mgiVar.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mgiVar.e = i - Integer.MIN_VALUE;
                    } else {
                        mgiVar = new mgi(this, lq4Var);
                    }
                } else {
                    mgiVar = new mgi(this, lq4Var);
                }
                Object obj2 = mgiVar.d;
                hu4 hu4Var = hu4.a;
                int i2 = mgiVar.e;
                if (i2 == 0) {
                    ch3.d0(obj2);
                    yx6 yx6Var = this.b;
                    if (onf.a(((Number) obj).intValue())) {
                        mgiVar.e = 1;
                        if (yx6Var.emit(obj, mgiVar) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj2);
                }
                return sbi.a;
            case 1:
                if (lq4Var instanceof xhi) {
                    xhiVar = (xhi) lq4Var;
                    int i3 = xhiVar.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xhiVar.e = i3 - Integer.MIN_VALUE;
                    } else {
                        xhiVar = new xhi(this, lq4Var);
                    }
                } else {
                    xhiVar = new xhi(this, lq4Var);
                }
                Object obj3 = xhiVar.d;
                hu4 hu4Var2 = hu4.a;
                int i4 = xhiVar.e;
                if (i4 == 0) {
                    ch3.d0(obj3);
                    yx6 yx6Var2 = this.b;
                    vii viiVar = new vii(v0m.a((gka) obj), null);
                    xhiVar.e = 1;
                    if (yx6Var2.emit(viiVar, xhiVar) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj3);
                }
                return sbi.a;
            case 2:
                if (lq4Var instanceof aii) {
                    aiiVar = (aii) lq4Var;
                    int i5 = aiiVar.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        aiiVar.e = i5 - Integer.MIN_VALUE;
                    } else {
                        aiiVar = new aii(this, lq4Var);
                    }
                } else {
                    aiiVar = new aii(this, lq4Var);
                }
                Object obj4 = aiiVar.d;
                hu4 hu4Var3 = hu4.a;
                int i6 = aiiVar.e;
                if (i6 == 0) {
                    ch3.d0(obj4);
                    yx6 yx6Var3 = this.b;
                    vii viiVar2 = new vii(v0m.a((gka) obj), null);
                    aiiVar.e = 1;
                    if (yx6Var3.emit(viiVar2, aiiVar) == hu4Var3) {
                        return hu4Var3;
                    }
                } else {
                    if (i6 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj4);
                }
                return sbi.a;
            case 3:
                if (lq4Var instanceof vni) {
                    vniVar = (vni) lq4Var;
                    int i7 = vniVar.e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        vniVar.e = i7 - Integer.MIN_VALUE;
                    } else {
                        vniVar = new vni(this, lq4Var);
                    }
                } else {
                    vniVar = new vni(this, lq4Var);
                }
                Object obj5 = vniVar.d;
                hu4 hu4Var4 = hu4.a;
                int i8 = vniVar.e;
                if (i8 == 0) {
                    ch3.d0(obj5);
                    yx6 yx6Var4 = this.b;
                    if (((Number) obj).longValue() != -1) {
                        vniVar.e = 1;
                        if (yx6Var4.emit(obj, vniVar) == hu4Var4) {
                            return hu4Var4;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj5);
                }
                return sbi.a;
            case 4:
                if (lq4Var instanceof voi) {
                    voiVar = (voi) lq4Var;
                    int i9 = voiVar.e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        voiVar.e = i9 - Integer.MIN_VALUE;
                    } else {
                        voiVar = new voi(this, lq4Var);
                    }
                } else {
                    voiVar = new voi(this, lq4Var);
                }
                Object obj6 = voiVar.d;
                hu4 hu4Var5 = hu4.a;
                int i10 = voiVar.e;
                if (i10 == 0) {
                    ch3.d0(obj6);
                    yx6 yx6Var5 = this.b;
                    if (obj instanceof zi4) {
                        voiVar.e = 1;
                        if (yx6Var5.emit(obj, voiVar) == hu4Var5) {
                            return hu4Var5;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj6);
                }
                return sbi.a;
            case 5:
                if (lq4Var instanceof woi) {
                    woiVar = (woi) lq4Var;
                    int i11 = woiVar.e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        woiVar.e = i11 - Integer.MIN_VALUE;
                    } else {
                        woiVar = new woi(this, lq4Var);
                    }
                } else {
                    woiVar = new woi(this, lq4Var);
                }
                Object obj7 = woiVar.d;
                hu4 hu4Var6 = hu4.a;
                int i12 = woiVar.e;
                if (i12 == 0) {
                    ch3.d0(obj7);
                    yx6 yx6Var6 = this.b;
                    Boolean boolValueOf = Boolean.valueOf(((toc) obj).a == 0);
                    woiVar.e = 1;
                    if (yx6Var6.emit(boolValueOf, woiVar) == hu4Var6) {
                        return hu4Var6;
                    }
                } else {
                    if (i12 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj7);
                }
                return sbi.a;
            case 6:
                if (lq4Var instanceof xoi) {
                    xoiVar = (xoi) lq4Var;
                    int i13 = xoiVar.e;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        xoiVar.e = i13 - Integer.MIN_VALUE;
                    } else {
                        xoiVar = new xoi(this, lq4Var);
                    }
                } else {
                    xoiVar = new xoi(this, lq4Var);
                }
                Object obj8 = xoiVar.d;
                hu4 hu4Var7 = hu4.a;
                int i14 = xoiVar.e;
                if (i14 == 0) {
                    ch3.d0(obj8);
                    yx6 yx6Var7 = this.b;
                    b8b b8bVar = (b8b) obj;
                    zi8 zi8Var = new zi8((((long) Float.floatToIntBits(Float.intBitsToFloat((int) b8bVar.a))) & 4294967295L) | (((long) b8bVar.b()) << 32));
                    xoiVar.e = 1;
                    if (yx6Var7.emit(zi8Var, xoiVar) == hu4Var7) {
                        return hu4Var7;
                    }
                } else {
                    if (i14 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj8);
                }
                return sbi.a;
            case 7:
                if (lq4Var instanceof yoi) {
                    yoiVar = (yoi) lq4Var;
                    int i15 = yoiVar.e;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        yoiVar.e = i15 - Integer.MIN_VALUE;
                    } else {
                        yoiVar = new yoi(this, lq4Var);
                    }
                } else {
                    yoiVar = new yoi(this, lq4Var);
                }
                Object obj9 = yoiVar.d;
                hu4 hu4Var8 = hu4.a;
                int i16 = yoiVar.e;
                if (i16 == 0) {
                    ch3.d0(obj9);
                    yx6 yx6Var8 = this.b;
                    Integer num = new Integer(((b8b) obj).b());
                    yoiVar.e = 1;
                    if (yx6Var8.emit(num, yoiVar) == hu4Var8) {
                        return hu4Var8;
                    }
                } else {
                    if (i16 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj9);
                }
                return sbi.a;
            case 8:
                if (lq4Var instanceof zoi) {
                    zoiVar = (zoi) lq4Var;
                    int i17 = zoiVar.e;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        zoiVar.e = i17 - Integer.MIN_VALUE;
                    } else {
                        zoiVar = new zoi(this, lq4Var);
                    }
                } else {
                    zoiVar = new zoi(this, lq4Var);
                }
                Object obj10 = zoiVar.d;
                hu4 hu4Var9 = hu4.a;
                int i18 = zoiVar.e;
                if (i18 == 0) {
                    ch3.d0(obj10);
                    yx6 yx6Var9 = this.b;
                    lsg lsgVar = (lsg) obj;
                    l = lsgVar != null ? new Long(lsgVar.c()) : null;
                    zoiVar.e = 1;
                    if (yx6Var9.emit(l, zoiVar) == hu4Var9) {
                        return hu4Var9;
                    }
                } else {
                    if (i18 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj10);
                }
                return sbi.a;
            case 9:
                if (lq4Var instanceof cpi) {
                    cpiVar = (cpi) lq4Var;
                    int i19 = cpiVar.e;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        cpiVar.e = i19 - Integer.MIN_VALUE;
                    } else {
                        cpiVar = new cpi(this, lq4Var);
                    }
                } else {
                    cpiVar = new cpi(this, lq4Var);
                }
                Object obj11 = cpiVar.d;
                hu4 hu4Var10 = hu4.a;
                int i20 = cpiVar.e;
                if (i20 == 0) {
                    ch3.d0(obj11);
                    yx6 yx6Var10 = this.b;
                    Integer num2 = new Integer(((List) obj).size());
                    cpiVar.e = 1;
                    if (yx6Var10.emit(num2, cpiVar) == hu4Var10) {
                        return hu4Var10;
                    }
                } else {
                    if (i20 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj11);
                }
                return sbi.a;
            case 10:
                if (lq4Var instanceof epi) {
                    epiVar = (epi) lq4Var;
                    int i21 = epiVar.e;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        epiVar.e = i21 - Integer.MIN_VALUE;
                    } else {
                        epiVar = new epi(this, lq4Var);
                    }
                } else {
                    epiVar = new epi(this, lq4Var);
                }
                Object obj12 = epiVar.d;
                hu4 hu4Var11 = hu4.a;
                int i22 = epiVar.e;
                if (i22 == 0) {
                    ch3.d0(obj12);
                    yx6 yx6Var11 = this.b;
                    Boolean boolValueOf2 = Boolean.valueOf(((lsg) obj).e());
                    epiVar.e = 1;
                    if (yx6Var11.emit(boolValueOf2, epiVar) == hu4Var11) {
                        return hu4Var11;
                    }
                } else {
                    if (i22 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj12);
                }
                return sbi.a;
            case 11:
                if (lq4Var instanceof mti) {
                    mtiVar = (mti) lq4Var;
                    int i23 = mtiVar.e;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        mtiVar.e = i23 - Integer.MIN_VALUE;
                    } else {
                        mtiVar = new mti(this, lq4Var);
                    }
                } else {
                    mtiVar = new mti(this, lq4Var);
                }
                Object obj13 = mtiVar.d;
                hu4 hu4Var12 = hu4.a;
                int i24 = mtiVar.e;
                if (i24 == 0) {
                    ch3.d0(obj13);
                    yx6 yx6Var12 = this.b;
                    if (((qyi) obj).c) {
                        mtiVar.e = 1;
                        if (yx6Var12.emit(obj, mtiVar) == hu4Var12) {
                            return hu4Var12;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj13);
                }
                return sbi.a;
            case 12:
                if (lq4Var instanceof nti) {
                    ntiVar = (nti) lq4Var;
                    int i25 = ntiVar.e;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        ntiVar.e = i25 - Integer.MIN_VALUE;
                    } else {
                        ntiVar = new nti(this, lq4Var);
                    }
                } else {
                    ntiVar = new nti(this, lq4Var);
                }
                Object obj14 = ntiVar.d;
                hu4 hu4Var13 = hu4.a;
                int i26 = ntiVar.e;
                if (i26 == 0) {
                    ch3.d0(obj14);
                    yx6 yx6Var13 = this.b;
                    l4d l4dVar = (l4d) obj;
                    if (!cqk.d(l4dVar, l4d.c) && (str = l4dVar.b) != null && str.length() != 0) {
                        ntiVar.e = 1;
                        if (yx6Var13.emit(obj, ntiVar) == hu4Var13) {
                            return hu4Var13;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj14);
                }
                return sbi.a;
            case 13:
                if (lq4Var instanceof oti) {
                    otiVar = (oti) lq4Var;
                    int i27 = otiVar.e;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        otiVar.e = i27 - Integer.MIN_VALUE;
                    } else {
                        otiVar = new oti(this, lq4Var);
                    }
                } else {
                    otiVar = new oti(this, lq4Var);
                }
                Object obj15 = otiVar.d;
                hu4 hu4Var14 = hu4.a;
                int i28 = otiVar.e;
                if (i28 == 0) {
                    ch3.d0(obj15);
                    yx6 yx6Var14 = this.b;
                    if (obj instanceof qyi) {
                        otiVar.e = 1;
                        if (yx6Var14.emit(obj, otiVar) == hu4Var14) {
                            return hu4Var14;
                        }
                    }
                } else {
                    if (i28 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj15);
                }
                return sbi.a;
            case 14:
                if (lq4Var instanceof jxi) {
                    jxiVar = (jxi) lq4Var;
                    int i29 = jxiVar.e;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        jxiVar.e = i29 - Integer.MIN_VALUE;
                    } else {
                        jxiVar = new jxi(this, lq4Var);
                    }
                } else {
                    jxiVar = new jxi(this, lq4Var);
                }
                Object obj16 = jxiVar.d;
                hu4 hu4Var15 = hu4.a;
                int i30 = jxiVar.e;
                if (i30 == 0) {
                    ch3.d0(obj16);
                    yx6 yx6Var15 = this.b;
                    if (!((List) obj).isEmpty()) {
                        jxiVar.e = 1;
                        if (yx6Var15.emit(obj, jxiVar) == hu4Var15) {
                            return hu4Var15;
                        }
                    }
                } else {
                    if (i30 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj16);
                }
                return sbi.a;
            case 15:
                if (lq4Var instanceof kxi) {
                    kxiVar = (kxi) lq4Var;
                    int i31 = kxiVar.e;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        kxiVar.e = i31 - Integer.MIN_VALUE;
                    } else {
                        kxiVar = new kxi(this, lq4Var);
                    }
                } else {
                    kxiVar = new kxi(this, lq4Var);
                }
                Object obj17 = kxiVar.d;
                hu4 hu4Var16 = hu4.a;
                int i32 = kxiVar.e;
                if (i32 == 0) {
                    ch3.d0(obj17);
                    yx6 yx6Var16 = this.b;
                    pi6 pi6Var = ((dz4) obj).q;
                    if (!(pi6Var instanceof ii6) && !(pi6Var instanceof hi6) && !(pi6Var instanceof ki6) && !(pi6Var instanceof ni6)) {
                        z = true;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    kxiVar.e = 1;
                    if (yx6Var16.emit(boolValueOf3, kxiVar) == hu4Var16) {
                        return hu4Var16;
                    }
                } else {
                    if (i32 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj17);
                }
                return sbi.a;
            case 16:
                if (lq4Var instanceof c2j) {
                    c2jVar = (c2j) lq4Var;
                    int i33 = c2jVar.e;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        c2jVar.e = i33 - Integer.MIN_VALUE;
                    } else {
                        c2jVar = new c2j(this, lq4Var);
                    }
                } else {
                    c2jVar = new c2j(this, lq4Var);
                }
                Object obj18 = c2jVar.d;
                hu4 hu4Var17 = hu4.a;
                int i34 = c2jVar.e;
                if (i34 == 0) {
                    ch3.d0(obj18);
                    yx6 yx6Var17 = this.b;
                    if (obj instanceof uxi) {
                        c2jVar.e = 1;
                        if (yx6Var17.emit(obj, c2jVar) == hu4Var17) {
                            return hu4Var17;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj18);
                }
                return sbi.a;
            case 17:
                if (lq4Var instanceof d2j) {
                    d2jVar = (d2j) lq4Var;
                    int i35 = d2jVar.e;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        d2jVar.e = i35 - Integer.MIN_VALUE;
                    } else {
                        d2jVar = new d2j(this, lq4Var);
                    }
                } else {
                    d2jVar = new d2j(this, lq4Var);
                }
                Object obj19 = d2jVar.d;
                hu4 hu4Var18 = hu4.a;
                int i36 = d2jVar.e;
                if (i36 == 0) {
                    ch3.d0(obj19);
                    yx6 yx6Var18 = this.b;
                    Long l2 = (Long) obj;
                    l = l2 != null ? mxl.b(l2.longValue()) : null;
                    d2jVar.e = 1;
                    if (yx6Var18.emit(l, d2jVar) == hu4Var18) {
                        return hu4Var18;
                    }
                } else {
                    if (i36 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj19);
                }
                return sbi.a;
            case 18:
                if (lq4Var instanceof h6j) {
                    h6jVar = (h6j) lq4Var;
                    int i37 = h6jVar.e;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        h6jVar.e = i37 - Integer.MIN_VALUE;
                    } else {
                        h6jVar = new h6j(this, lq4Var);
                    }
                } else {
                    h6jVar = new h6j(this, lq4Var);
                }
                Object obj20 = h6jVar.d;
                hu4 hu4Var19 = hu4.a;
                int i38 = h6jVar.e;
                if (i38 == 0) {
                    ch3.d0(obj20);
                    yx6 yx6Var19 = this.b;
                    String str2 = (String) obj;
                    try {
                        Uri uri = Uri.parse(str2);
                        String queryParameter = uri.getQueryParameter("autoplay");
                        String queryParameter2 = uri.getQueryParameter("mute");
                        String queryParameter3 = uri.getQueryParameter("suppress_controls");
                        String queryParameter4 = uri.getQueryParameter("partner_name");
                        Uri.Builder builderBuildUpon = uri.buildUpon();
                        if (queryParameter == null || r5h.X0(queryParameter)) {
                            builderBuildUpon.appendQueryParameter("autoplay", "1");
                        }
                        if (queryParameter2 == null || r5h.X0(queryParameter2)) {
                            builderBuildUpon.appendQueryParameter("mute", "0");
                        }
                        if (queryParameter3 == null || r5h.X0(queryParameter3)) {
                            builderBuildUpon.appendQueryParameter("suppress_controls", "1");
                        }
                        if (queryParameter4 == null || r5h.X0(queryParameter4)) {
                            builderBuildUpon.appendQueryParameter("partner_name", "maxmsg");
                        }
                        poeVar = builderBuildUpon.build().toString();
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    Throwable thA = roe.a(poeVar);
                    if (thA != null) {
                        String name = i6j.class.getName();
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, name, qv1.k("failed to parse ", str2), thA);
                            }
                        }
                    }
                    Object obj21 = str2;
                    if (!(poeVar instanceof poe)) {
                        obj21 = poeVar;
                    }
                    h6jVar.e = 1;
                    if (yx6Var19.emit(obj21, h6jVar) == hu4Var19) {
                        return hu4Var19;
                    }
                    break;
                } else {
                    if (i38 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj20);
                }
                return sbi.a;
            case 19:
                if (lq4Var instanceof goj) {
                    gojVar = (goj) lq4Var;
                    int i39 = gojVar.e;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        gojVar.e = i39 - Integer.MIN_VALUE;
                    } else {
                        gojVar = new goj(this, lq4Var);
                    }
                } else {
                    gojVar = new goj(this, lq4Var);
                }
                Object obj22 = gojVar.d;
                hu4 hu4Var20 = hu4.a;
                int i40 = gojVar.e;
                if (i40 == 0) {
                    ch3.d0(obj22);
                    yx6 yx6Var20 = this.b;
                    Boolean boolValueOf4 = Boolean.valueOf(((vg4) obj).G());
                    gojVar.e = 1;
                    if (yx6Var20.emit(boolValueOf4, gojVar) == hu4Var20) {
                        return hu4Var20;
                    }
                } else {
                    if (i40 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj22);
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                if (lq4Var instanceof hoj) {
                    hojVar = (hoj) lq4Var;
                    int i41 = hojVar.e;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        hojVar.e = i41 - Integer.MIN_VALUE;
                    } else {
                        hojVar = new hoj(this, lq4Var);
                    }
                } else {
                    hojVar = new hoj(this, lq4Var);
                }
                Object obj23 = hojVar.d;
                hu4 hu4Var21 = hu4.a;
                int i42 = hojVar.e;
                if (i42 == 0) {
                    ch3.d0(obj23);
                    yx6 yx6Var21 = this.b;
                    ooj oojVar = (ooj) obj;
                    l = oojVar != null ? new ztj(oojVar.a, oojVar.b, oojVar.c) : null;
                    if (l != null) {
                        hojVar.e = 1;
                        if (yx6Var21.emit(l, hojVar) == hu4Var21) {
                            return hu4Var21;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj23);
                }
                return sbi.a;
            default:
                if (lq4Var instanceof i3k) {
                    i3kVar = (i3k) lq4Var;
                    int i43 = i3kVar.e;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        i3kVar.e = i43 - Integer.MIN_VALUE;
                    } else {
                        i3kVar = new i3k(this, lq4Var);
                    }
                } else {
                    i3kVar = new i3k(this, lq4Var);
                }
                Object obj24 = i3kVar.d;
                hu4 hu4Var22 = hu4.a;
                int i44 = i3kVar.e;
                if (i44 == 0) {
                    ch3.d0(obj24);
                    yx6 yx6Var22 = this.b;
                    if (((Boolean) obj).booleanValue()) {
                        i3kVar.e = 1;
                        if (yx6Var22.emit(obj, i3kVar) == hu4Var22) {
                            return hu4Var22;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj24);
                }
                return sbi.a;
        }
    }

    public /* synthetic */ ngi(yx6 yx6Var, int i) {
        this.a = i;
        this.b = yx6Var;
    }
}
