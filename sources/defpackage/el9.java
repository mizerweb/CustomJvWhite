package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class el9 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;

    public /* synthetic */ el9(yx6 yx6Var, int i) {
        this.a = i;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:132:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:148:0x023b  */
    /* JADX WARN: Code duplicated, block: B:185:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:207:0x0338  */
    /* JADX WARN: Code duplicated, block: B:215:0x034e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0392  */
    /* JADX WARN: Code duplicated, block: B:251:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:267:0x041a  */
    /* JADX WARN: Code duplicated, block: B:285:0x0458  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:301:0x049c  */
    /* JADX WARN: Code duplicated, block: B:321:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:342:0x0548  */
    /* JADX WARN: Code duplicated, block: B:360:0x058d  */
    /* JADX WARN: Code duplicated, block: B:376:0x05da  */
    /* JADX WARN: Code duplicated, block: B:396:0x0652  */
    /* JADX WARN: Code duplicated, block: B:415:0x0699  */
    /* JADX WARN: Code duplicated, block: B:433:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:449:0x0720  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:467:0x0767  */
    /* JADX WARN: Code duplicated, block: B:485:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x013e  */
    /* JADX WARN: Code duplicated, block: B:96:0x017c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        dl9 dl9Var;
        fua fuaVar;
        cza czaVar;
        dza dzaVar;
        u6b u6bVar;
        v6b v6bVar;
        w6b w6bVar;
        x6b x6bVar;
        bab babVar;
        pob pobVar;
        o2c o2cVar;
        c7c c7cVar;
        lzc lzcVar;
        mzc mzcVar;
        red redVar;
        yne yneVar;
        dog dogVar;
        dtg dtgVar;
        bug bugVar;
        eug eugVar;
        fug fugVar;
        gug gugVar;
        hug hugVar;
        uzg uzgVar;
        b0j b0jVar;
        kbj kbjVar;
        Object obj2 = null;
        switch (this.a) {
            case 0:
                if (lq4Var instanceof dl9) {
                    dl9Var = (dl9) lq4Var;
                    int i = dl9Var.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dl9Var.e = i - Integer.MIN_VALUE;
                    } else {
                        dl9Var = new dl9(this, lq4Var);
                    }
                } else {
                    dl9Var = new dl9(this, lq4Var);
                }
                Object obj3 = dl9Var.d;
                hu4 hu4Var = hu4.a;
                int i2 = dl9Var.e;
                if (i2 == 0) {
                    ch3.d0(obj3);
                    yx6 yx6Var = this.b;
                    if (obj instanceof jm3) {
                        dl9Var.e = 1;
                        if (yx6Var.emit(obj, dl9Var) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj3);
                }
                return sbi.a;
            case 1:
                if (lq4Var instanceof fua) {
                    fuaVar = (fua) lq4Var;
                    int i3 = fuaVar.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        fuaVar.e = i3 - Integer.MIN_VALUE;
                    } else {
                        fuaVar = new fua(this, lq4Var);
                    }
                } else {
                    fuaVar = new fua(this, lq4Var);
                }
                Object obj4 = fuaVar.d;
                hu4 hu4Var2 = hu4.a;
                int i4 = fuaVar.e;
                if (i4 == 0) {
                    ch3.d0(obj4);
                    yx6 yx6Var2 = this.b;
                    if (((Number) obj).longValue() != -1) {
                        fuaVar.e = 1;
                        if (yx6Var2.emit(obj, fuaVar) == hu4Var2) {
                            return hu4Var2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj4);
                }
                return sbi.a;
            case 2:
                if (lq4Var instanceof cza) {
                    czaVar = (cza) lq4Var;
                    int i5 = czaVar.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        czaVar.e = i5 - Integer.MIN_VALUE;
                    } else {
                        czaVar = new cza(this, lq4Var);
                    }
                } else {
                    czaVar = new cza(this, lq4Var);
                }
                Object obj5 = czaVar.d;
                hu4 hu4Var3 = hu4.a;
                int i6 = czaVar.e;
                if (i6 == 0) {
                    ch3.d0(obj5);
                    yx6 yx6Var3 = this.b;
                    if (!((wh3) obj).a.isEmpty()) {
                        czaVar.e = 1;
                        if (yx6Var3.emit(obj, czaVar) == hu4Var3) {
                            return hu4Var3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj5);
                }
                return sbi.a;
            case 3:
                if (lq4Var instanceof dza) {
                    dzaVar = (dza) lq4Var;
                    int i7 = dzaVar.e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        dzaVar.e = i7 - Integer.MIN_VALUE;
                    } else {
                        dzaVar = new dza(this, lq4Var);
                    }
                } else {
                    dzaVar = new dza(this, lq4Var);
                }
                Object obj6 = dzaVar.d;
                hu4 hu4Var4 = hu4.a;
                int i8 = dzaVar.e;
                if (i8 == 0) {
                    ch3.d0(obj6);
                    yx6 yx6Var4 = this.b;
                    List listN1 = ww3.N1(((wh3) obj).a, 10);
                    dzaVar.e = 1;
                    if (yx6Var4.emit(listN1, dzaVar) == hu4Var4) {
                        return hu4Var4;
                    }
                } else {
                    if (i8 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj6);
                }
                return sbi.a;
            case 4:
                if (lq4Var instanceof u6b) {
                    u6bVar = (u6b) lq4Var;
                    int i9 = u6bVar.e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        u6bVar.e = i9 - Integer.MIN_VALUE;
                    } else {
                        u6bVar = new u6b(this, lq4Var);
                    }
                } else {
                    u6bVar = new u6b(this, lq4Var);
                }
                Object obj7 = u6bVar.d;
                hu4 hu4Var5 = hu4.a;
                int i10 = u6bVar.e;
                if (i10 == 0) {
                    ch3.d0(obj7);
                    yx6 yx6Var5 = this.b;
                    if (!((Map) obj).isEmpty()) {
                        u6bVar.e = 1;
                        if (yx6Var5.emit(obj, u6bVar) == hu4Var5) {
                            return hu4Var5;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj7);
                }
                return sbi.a;
            case 5:
                if (lq4Var instanceof v6b) {
                    v6bVar = (v6b) lq4Var;
                    int i11 = v6bVar.e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        v6bVar.e = i11 - Integer.MIN_VALUE;
                    } else {
                        v6bVar = new v6b(this, lq4Var);
                    }
                } else {
                    v6bVar = new v6b(this, lq4Var);
                }
                Object obj8 = v6bVar.d;
                hu4 hu4Var6 = hu4.a;
                int i12 = v6bVar.e;
                if (i12 == 0) {
                    ch3.d0(obj8);
                    yx6 yx6Var6 = this.b;
                    Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                    v6bVar.e = 1;
                    if (yx6Var6.emit(boolValueOf, v6bVar) == hu4Var6) {
                        return hu4Var6;
                    }
                } else {
                    if (i12 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj8);
                }
                return sbi.a;
            case 6:
                if (lq4Var instanceof w6b) {
                    w6bVar = (w6b) lq4Var;
                    int i13 = w6bVar.e;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        w6bVar.e = i13 - Integer.MIN_VALUE;
                    } else {
                        w6bVar = new w6b(this, lq4Var);
                    }
                } else {
                    w6bVar = new w6b(this, lq4Var);
                }
                Object obj9 = w6bVar.d;
                hu4 hu4Var7 = hu4.a;
                int i14 = w6bVar.e;
                if (i14 == 0) {
                    ch3.d0(obj9);
                    yx6 yx6Var7 = this.b;
                    Map map = (Map) obj;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(wm9.P0(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        linkedHashMap.put(key, new j6b(((y6) entry.getValue()).a));
                    }
                    w6bVar.e = 1;
                    if (yx6Var7.emit(linkedHashMap, w6bVar) == hu4Var7) {
                        return hu4Var7;
                    }
                } else {
                    if (i14 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj9);
                }
                return sbi.a;
            case 7:
                if (lq4Var instanceof x6b) {
                    x6bVar = (x6b) lq4Var;
                    int i15 = x6bVar.e;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        x6bVar.e = i15 - Integer.MIN_VALUE;
                    } else {
                        x6bVar = new x6b(this, lq4Var);
                    }
                } else {
                    x6bVar = new x6b(this, lq4Var);
                }
                Object obj10 = x6bVar.d;
                hu4 hu4Var8 = hu4.a;
                int i16 = x6bVar.e;
                if (i16 == 0) {
                    ch3.d0(obj10);
                    yx6 yx6Var8 = this.b;
                    Map mapW0 = wm9.W0(ww3.M1((List) obj, new o6(10)));
                    x6bVar.e = 1;
                    if (yx6Var8.emit(mapW0, x6bVar) == hu4Var8) {
                        return hu4Var8;
                    }
                } else {
                    if (i16 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj10);
                }
                return sbi.a;
            case 8:
                if (lq4Var instanceof bab) {
                    babVar = (bab) lq4Var;
                    int i17 = babVar.e;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        babVar.e = i17 - Integer.MIN_VALUE;
                    } else {
                        babVar = new bab(this, lq4Var);
                    }
                } else {
                    babVar = new bab(this, lq4Var);
                }
                Object obj11 = babVar.d;
                hu4 hu4Var9 = hu4.a;
                int i18 = babVar.e;
                if (i18 == 0) {
                    ch3.d0(obj11);
                    yx6 yx6Var9 = this.b;
                    if (((Number) obj).longValue() != -1) {
                        babVar.e = 1;
                        if (yx6Var9.emit(obj, babVar) == hu4Var9) {
                            return hu4Var9;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj11);
                }
                return sbi.a;
            case 9:
                if (lq4Var instanceof pob) {
                    pobVar = (pob) lq4Var;
                    int i19 = pobVar.e;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        pobVar.e = i19 - Integer.MIN_VALUE;
                    } else {
                        pobVar = new pob(this, lq4Var);
                    }
                } else {
                    pobVar = new pob(this, lq4Var);
                }
                Object obj12 = pobVar.d;
                hu4 hu4Var10 = hu4.a;
                int i20 = pobVar.e;
                if (i20 == 0) {
                    ch3.d0(obj12);
                    yx6 yx6Var10 = this.b;
                    nob nobVar = (nob) obj;
                    if (!nobVar.a.isEmpty() || !nobVar.b.isEmpty()) {
                        pobVar.e = 1;
                        if (yx6Var10.emit(obj, pobVar) == hu4Var10) {
                            return hu4Var10;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj12);
                }
                return sbi.a;
            case 10:
                if (lq4Var instanceof o2c) {
                    o2cVar = (o2c) lq4Var;
                    int i21 = o2cVar.e;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        o2cVar.e = i21 - Integer.MIN_VALUE;
                    } else {
                        o2cVar = new o2c(this, lq4Var);
                    }
                } else {
                    o2cVar = new o2c(this, lq4Var);
                }
                Object obj13 = o2cVar.d;
                hu4 hu4Var11 = hu4.a;
                int i22 = o2cVar.e;
                if (i22 == 0) {
                    ch3.d0(obj13);
                    yx6 yx6Var11 = this.b;
                    List list = (List) obj;
                    pw pwVar = new pw(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        pwVar.add(((r17) it.next()).a);
                    }
                    o2cVar.e = 1;
                    if (yx6Var11.emit(pwVar, o2cVar) == hu4Var11) {
                        return hu4Var11;
                    }
                } else {
                    if (i22 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj13);
                }
                return sbi.a;
            case 11:
                if (lq4Var instanceof c7c) {
                    c7cVar = (c7c) lq4Var;
                    int i23 = c7cVar.e;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        c7cVar.e = i23 - Integer.MIN_VALUE;
                    } else {
                        c7cVar = new c7c(this, lq4Var);
                    }
                } else {
                    c7cVar = new c7c(this, lq4Var);
                }
                Object obj14 = c7cVar.d;
                hu4 hu4Var12 = hu4.a;
                int i24 = c7cVar.e;
                if (i24 == 0) {
                    ch3.d0(obj14);
                    yx6 yx6Var12 = this.b;
                    bx5 bx5VarC = rx8.c(((Number) obj).intValue());
                    c7cVar.e = 1;
                    if (yx6Var12.emit(bx5VarC, c7cVar) == hu4Var12) {
                        return hu4Var12;
                    }
                } else {
                    if (i24 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj14);
                }
                return sbi.a;
            case 12:
                if (lq4Var instanceof lzc) {
                    lzcVar = (lzc) lq4Var;
                    int i25 = lzcVar.e;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        lzcVar.e = i25 - Integer.MIN_VALUE;
                    } else {
                        lzcVar = new lzc(this, lq4Var);
                    }
                } else {
                    lzcVar = new lzc(this, lq4Var);
                }
                Object obj15 = lzcVar.d;
                hu4 hu4Var13 = hu4.a;
                int i26 = lzcVar.e;
                if (i26 == 0) {
                    ch3.d0(obj15);
                    yx6 yx6Var13 = this.b;
                    if (obj instanceof nga) {
                        lzcVar.e = 1;
                        if (yx6Var13.emit(obj, lzcVar) == hu4Var13) {
                            return hu4Var13;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj15);
                }
                return sbi.a;
            case 13:
                if (lq4Var instanceof mzc) {
                    mzcVar = (mzc) lq4Var;
                    int i27 = mzcVar.e;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        mzcVar.e = i27 - Integer.MIN_VALUE;
                    } else {
                        mzcVar = new mzc(this, lq4Var);
                    }
                } else {
                    mzcVar = new mzc(this, lq4Var);
                }
                Object obj16 = mzcVar.d;
                hu4 hu4Var14 = hu4.a;
                int i28 = mzcVar.e;
                if (i28 == 0) {
                    ch3.d0(obj16);
                    yx6 yx6Var14 = this.b;
                    Boolean boolValueOf2 = Boolean.valueOf(!(((lza) obj) instanceof jza));
                    mzcVar.e = 1;
                    if (yx6Var14.emit(boolValueOf2, mzcVar) == hu4Var14) {
                        return hu4Var14;
                    }
                } else {
                    if (i28 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj16);
                }
                return sbi.a;
            case 14:
                if (lq4Var instanceof red) {
                    redVar = (red) lq4Var;
                    int i29 = redVar.e;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        redVar.e = i29 - Integer.MIN_VALUE;
                    } else {
                        redVar = new red(this, lq4Var);
                    }
                } else {
                    redVar = new red(this, lq4Var);
                }
                Object obj17 = redVar.d;
                hu4 hu4Var15 = hu4.a;
                int i30 = redVar.e;
                if (i30 == 0) {
                    ch3.d0(obj17);
                    yx6 yx6Var15 = this.b;
                    if (!((ned) obj).b.isEmpty()) {
                        redVar.e = 1;
                        if (yx6Var15.emit(obj, redVar) == hu4Var15) {
                            return hu4Var15;
                        }
                    }
                } else {
                    if (i30 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj17);
                }
                return sbi.a;
            case 15:
                if (lq4Var instanceof yne) {
                    yneVar = (yne) lq4Var;
                    int i31 = yneVar.e;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        yneVar.e = i31 - Integer.MIN_VALUE;
                    } else {
                        yneVar = new yne(this, lq4Var);
                    }
                } else {
                    yneVar = new yne(this, lq4Var);
                }
                Object obj18 = yneVar.d;
                hu4 hu4Var16 = hu4.a;
                int i32 = yneVar.e;
                if (i32 == 0) {
                    ch3.d0(obj18);
                    yx6 yx6Var16 = this.b;
                    if (((Number) obj).intValue() == 2) {
                        yneVar.e = 1;
                        if (yx6Var16.emit(obj, yneVar) == hu4Var16) {
                            return hu4Var16;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj18);
                }
                return sbi.a;
            case 16:
                if (lq4Var instanceof dog) {
                    dogVar = (dog) lq4Var;
                    int i33 = dogVar.e;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        dogVar.e = i33 - Integer.MIN_VALUE;
                    } else {
                        dogVar = new dog(this, lq4Var);
                    }
                } else {
                    dogVar = new dog(this, lq4Var);
                }
                Object obj19 = dogVar.d;
                hu4 hu4Var17 = hu4.a;
                int i34 = dogVar.e;
                if (i34 == 0) {
                    ch3.d0(obj19);
                    yx6 yx6Var17 = this.b;
                    Collection collection = (Collection) obj;
                    String name = eog.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, zo5.h(collection.size(), "Sets loader. Sections, size:"), null);
                        }
                    }
                    for (Object obj20 : collection) {
                        jaf jafVar = (jaf) obj20;
                        if (jafVar.a == 3 && z5h.G0(jafVar.b, "NEW_STICKER_SETS", true)) {
                            obj2 = obj20;
                            dogVar.e = 1;
                            if (yx6Var17.emit(obj2, dogVar) == hu4Var17) {
                                return hu4Var17;
                            }
                        }
                    }
                    dogVar.e = 1;
                    if (yx6Var17.emit(obj2, dogVar) == hu4Var17) {
                        return hu4Var17;
                    }
                } else {
                    if (i34 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj19);
                }
                return sbi.a;
            case 17:
                if (lq4Var instanceof dtg) {
                    dtgVar = (dtg) lq4Var;
                    int i35 = dtgVar.e;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        dtgVar.e = i35 - Integer.MIN_VALUE;
                    } else {
                        dtgVar = new dtg(this, lq4Var);
                    }
                } else {
                    dtgVar = new dtg(this, lq4Var);
                }
                Object obj21 = dtgVar.d;
                hu4 hu4Var18 = hu4.a;
                int i36 = dtgVar.e;
                if (i36 == 0) {
                    ch3.d0(obj21);
                    yx6 yx6Var18 = this.b;
                    List list2 = (List) obj;
                    int i37 = ftg.k;
                    osg osgVar = (osg) ww3.t1(list2);
                    int i38 = (osgVar == null || !osgVar.a || (list2.size() == 1 && osgVar.e > 0)) ? 0 : 1;
                    List<osg> listB = vw3.b(i38, 3, list2);
                    ArrayList arrayList = new ArrayList(yw3.W0(listB, 10));
                    for (osg osgVar2 : listB) {
                        arrayList.add(osg.i(osgVar2, osgVar2.f == osgVar2.e ? 1 : 0, msg.c, null, 143));
                    }
                    zsg zsgVar = new zsg(arrayList, i38 > 0);
                    dtgVar.e = 1;
                    if (yx6Var18.emit(zsgVar, dtgVar) == hu4Var18) {
                        return hu4Var18;
                    }
                } else {
                    if (i36 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj21);
                }
                return sbi.a;
            case 18:
                if (lq4Var instanceof bug) {
                    bugVar = (bug) lq4Var;
                    int i39 = bugVar.e;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        bugVar.e = i39 - Integer.MIN_VALUE;
                    } else {
                        bugVar = new bug(this, lq4Var);
                    }
                } else {
                    bugVar = new bug(this, lq4Var);
                }
                Object obj22 = bugVar.d;
                hu4 hu4Var19 = hu4.a;
                int i40 = bugVar.e;
                if (i40 == 0) {
                    ch3.d0(obj22);
                    yx6 yx6Var19 = this.b;
                    Integer num = ((vqg) obj).d;
                    bugVar.e = 1;
                    if (yx6Var19.emit(num, bugVar) == hu4Var19) {
                        return hu4Var19;
                    }
                } else {
                    if (i40 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj22);
                }
                return sbi.a;
            case 19:
                if (lq4Var instanceof eug) {
                    eugVar = (eug) lq4Var;
                    int i41 = eugVar.e;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        eugVar.e = i41 - Integer.MIN_VALUE;
                    } else {
                        eugVar = new eug(this, lq4Var);
                    }
                } else {
                    eugVar = new eug(this, lq4Var);
                }
                Object obj23 = eugVar.d;
                hu4 hu4Var20 = hu4.a;
                int i42 = eugVar.e;
                if (i42 == 0) {
                    ch3.d0(obj23);
                    yx6 yx6Var20 = this.b;
                    if (((List) obj).size() > 1) {
                        eugVar.e = 1;
                        if (yx6Var20.emit(obj, eugVar) == hu4Var20) {
                            return hu4Var20;
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
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                if (lq4Var instanceof fug) {
                    fugVar = (fug) lq4Var;
                    int i43 = fugVar.e;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        fugVar.e = i43 - Integer.MIN_VALUE;
                    } else {
                        fugVar = new fug(this, lq4Var);
                    }
                } else {
                    fugVar = new fug(this, lq4Var);
                }
                Object obj24 = fugVar.d;
                hu4 hu4Var21 = hu4.a;
                int i44 = fugVar.e;
                if (i44 == 0) {
                    ch3.d0(obj24);
                    yx6 yx6Var21 = this.b;
                    if (obj instanceof zi4) {
                        fugVar.e = 1;
                        if (yx6Var21.emit(obj, fugVar) == hu4Var21) {
                            return hu4Var21;
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
            case 21:
                if (lq4Var instanceof gug) {
                    gugVar = (gug) lq4Var;
                    int i45 = gugVar.e;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        gugVar.e = i45 - Integer.MIN_VALUE;
                    } else {
                        gugVar = new gug(this, lq4Var);
                    }
                } else {
                    gugVar = new gug(this, lq4Var);
                }
                Object obj25 = gugVar.d;
                hu4 hu4Var22 = hu4.a;
                int i46 = gugVar.e;
                if (i46 == 0) {
                    ch3.d0(obj25);
                    yx6 yx6Var22 = this.b;
                    Integer num2 = ((vqg) obj).d;
                    gugVar.e = 1;
                    if (yx6Var22.emit(num2, gugVar) == hu4Var22) {
                        return hu4Var22;
                    }
                } else {
                    if (i46 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj25);
                }
                return sbi.a;
            case 22:
                if (lq4Var instanceof hug) {
                    hugVar = (hug) lq4Var;
                    int i47 = hugVar.e;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        hugVar.e = i47 - Integer.MIN_VALUE;
                    } else {
                        hugVar = new hug(this, lq4Var);
                    }
                } else {
                    hugVar = new hug(this, lq4Var);
                }
                Object obj26 = hugVar.d;
                hu4 hu4Var23 = hu4.a;
                int i48 = hugVar.e;
                if (i48 == 0) {
                    ch3.d0(obj26);
                    yx6 yx6Var23 = this.b;
                    ohf ohfVarU0 = yhf.u0(yhf.s0(new sw(1, (List) obj), dz7.q), 10);
                    hugVar.e = 1;
                    if (yx6Var23.emit(ohfVarU0, hugVar) == hu4Var23) {
                        return hu4Var23;
                    }
                } else {
                    if (i48 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj26);
                }
                return sbi.a;
            case 23:
                if (lq4Var instanceof uzg) {
                    uzgVar = (uzg) lq4Var;
                    int i49 = uzgVar.e;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        uzgVar.e = i49 - Integer.MIN_VALUE;
                    } else {
                        uzgVar = new uzg(this, lq4Var);
                    }
                } else {
                    uzgVar = new uzg(this, lq4Var);
                }
                Object obj27 = uzgVar.d;
                hu4 hu4Var24 = hu4.a;
                int i50 = uzgVar.e;
                if (i50 == 0) {
                    ch3.d0(obj27);
                    yx6 yx6Var24 = this.b;
                    ej4 ej4Var = (ej4) obj;
                    if ((ej4Var instanceof yi4) || (ej4Var instanceof zi4)) {
                        uzgVar.e = 1;
                        if (yx6Var24.emit(obj, uzgVar) == hu4Var24) {
                            return hu4Var24;
                        }
                    }
                } else {
                    if (i50 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj27);
                }
                return sbi.a;
            case 24:
                if (lq4Var instanceof b0j) {
                    b0jVar = (b0j) lq4Var;
                    int i51 = b0jVar.e;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        b0jVar.e = i51 - Integer.MIN_VALUE;
                    } else {
                        b0jVar = new b0j(this, lq4Var);
                    }
                } else {
                    b0jVar = new b0j(this, lq4Var);
                }
                Object obj28 = b0jVar.d;
                hu4 hu4Var25 = hu4.a;
                int i52 = b0jVar.e;
                if (i52 == 0) {
                    ch3.d0(obj28);
                    yx6 yx6Var25 = this.b;
                    Float f = new Float(((l1j) obj).d() / 100.0f);
                    b0jVar.e = 1;
                    if (yx6Var25.emit(f, b0jVar) == hu4Var25) {
                        return hu4Var25;
                    }
                } else {
                    if (i52 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj28);
                }
                return sbi.a;
            default:
                if (lq4Var instanceof kbj) {
                    kbjVar = (kbj) lq4Var;
                    int i53 = kbjVar.e;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        kbjVar.e = i53 - Integer.MIN_VALUE;
                    } else {
                        kbjVar = new kbj(this, lq4Var);
                    }
                } else {
                    kbjVar = new kbj(this, lq4Var);
                }
                Object obj29 = kbjVar.d;
                hu4 hu4Var26 = hu4.a;
                int i54 = kbjVar.e;
                if (i54 == 0) {
                    ch3.d0(obj29);
                    yx6 yx6Var26 = this.b;
                    if (((we4) obj) != we4.TYPE_UNKNOWN) {
                        kbjVar.e = 1;
                        if (yx6Var26.emit(obj, kbjVar) == hu4Var26) {
                            return hu4Var26;
                        }
                    }
                } else {
                    if (i54 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj29);
                }
                return sbi.a;
        }
    }

    public /* synthetic */ el9(yx6 yx6Var, Object obj, int i) {
        this.a = i;
        this.b = yx6Var;
    }
}
