package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class so5 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public so5(to5 to5Var, wfe wfeVar, yx6 yx6Var) {
        this.a = 0;
        this.c = to5Var;
        this.d = wfeVar;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:128:0x027d  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x0133 A[PHI: r0 r2 r5 r10 r11
  0x0133: PHI (r0v36 int) = (r0v31 int), (r0v39 int) binds: [B:46:0x00fb, B:51:0x012d] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r2v24 ynh) = (r2v21 ynh), (r2v25 ynh) binds: [B:46:0x00fb, B:51:0x012d] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r5v11 x0c) = (r5v8 x0c), (r5v13 x0c) binds: [B:46:0x00fb, B:51:0x012d] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r10v5 yx6) = (r10v3 yx6), (r10v6 yx6) binds: [B:46:0x00fb, B:51:0x012d] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r11v4 java.lang.Integer) = (r11v1 java.lang.Integer), (r11v6 java.lang.Integer) binds: [B:46:0x00fb, B:51:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0162  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) throws Throwable {
        ro5 ro5Var;
        oz6 oz6Var;
        rz6 rz6Var;
        v07 v07Var;
        kh8 kh8Var;
        x0c x0cVar;
        ynh ynhVar;
        int i;
        int i2;
        int i3;
        Integer num;
        Object objP;
        int i4;
        x0c x0cVar2;
        yx6 yx6Var;
        uu4 uu4Var;
        r6b r6bVar;
        so5 so5Var = this;
        Object obj2 = obj;
        int i5 = so5Var.a;
        sbi sbiVar = sbi.a;
        Object obj3 = so5Var.d;
        Object obj4 = so5Var.c;
        yx6 yx6Var2 = so5Var.b;
        hu4 hu4Var = hu4.a;
        switch (i5) {
            case 0:
                wfe wfeVar = (wfe) obj3;
                to5 to5Var = (to5) obj4;
                if (lq4Var instanceof ro5) {
                    ro5Var = (ro5) lq4Var;
                    int i6 = ro5Var.f;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ro5Var.f = i6 - Integer.MIN_VALUE;
                    } else {
                        ro5Var = new ro5(so5Var, lq4Var);
                    }
                } else {
                    ro5Var = new ro5(so5Var, lq4Var);
                }
                Object obj5 = ro5Var.d;
                int i7 = ro5Var.f;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ch3.d0(obj5);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj5);
                Object objInvoke = to5Var.b.invoke(obj2);
                Object obj6 = wfeVar.a;
                if (obj6 != vd7.e && ((Boolean) to5Var.c.invoke(obj6, objInvoke)).booleanValue()) {
                    return sbiVar;
                }
                wfeVar.a = objInvoke;
                ro5Var.f = 1;
                return yx6Var2.emit(obj2, ro5Var) == hu4Var ? hu4Var : sbiVar;
            case 1:
                if (lq4Var instanceof oz6) {
                    oz6Var = (oz6) lq4Var;
                    int i8 = oz6Var.h;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        oz6Var.h = i8 - Integer.MIN_VALUE;
                    } else {
                        oz6Var = new oz6(so5Var, lq4Var);
                    }
                } else {
                    oz6Var = new oz6(so5Var, lq4Var);
                }
                Object objInvoke2 = oz6Var.f;
                int i9 = oz6Var.h;
                if (i9 == 0) {
                    ch3.d0(objInvoke2);
                    if (((sfe) obj4).a) {
                        oz6Var.h = 1;
                        if (yx6Var2.emit(obj2, oz6Var) != hu4Var) {
                            return sbiVar;
                        }
                    } else {
                        oz6Var.d = so5Var;
                        oz6Var.e = obj2;
                        oz6Var.h = 2;
                        objInvoke2 = ((qf7) obj3).invoke(obj2, oz6Var);
                        if (objInvoke2 != hu4Var) {
                        }
                    }
                    return hu4Var;
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        Object obj7 = oz6Var.e;
                        so5 so5Var2 = oz6Var.d;
                        ch3.d0(objInvoke2);
                        obj2 = obj7;
                        so5Var = so5Var2;
                    } else if (i9 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                ch3.d0(objInvoke2);
                return sbiVar;
                if (((Boolean) objInvoke2).booleanValue()) {
                    return sbiVar;
                }
                ((sfe) so5Var.c).a = true;
                yx6 yx6Var3 = so5Var.b;
                oz6Var.d = null;
                oz6Var.e = null;
                oz6Var.h = 3;
                if (yx6Var3.emit(obj2, oz6Var) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
            case 2:
                if (lq4Var instanceof rz6) {
                    rz6Var = (rz6) lq4Var;
                    int i10 = rz6Var.f;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        rz6Var.f = i10 - Integer.MIN_VALUE;
                    } else {
                        rz6Var = new rz6(so5Var, lq4Var);
                    }
                } else {
                    rz6Var = new rz6(so5Var, lq4Var);
                }
                Object obj8 = rz6Var.d;
                int i11 = rz6Var.f;
                if (i11 != 0) {
                    if (i11 == 1 || i11 == 2) {
                        ch3.d0(obj8);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj8);
                ufe ufeVar = (ufe) obj4;
                int i12 = ufeVar.a + 1;
                ufeVar.a = i12;
                if (i12 < 1) {
                    rz6Var.f = 1;
                    if (yx6Var2.emit(obj2, rz6Var) != hu4Var) {
                        return sbiVar;
                    }
                } else {
                    rz6Var.f = 2;
                    p90.c(yx6Var2, obj2, obj3, rz6Var);
                }
                return hu4Var;
            case 3:
                if (lq4Var instanceof v07) {
                    v07Var = (v07) lq4Var;
                    int i13 = v07Var.e;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        v07Var.e = i13 - Integer.MIN_VALUE;
                    } else {
                        v07Var = new v07(so5Var, lq4Var);
                    }
                } else {
                    v07Var = new v07(so5Var, lq4Var);
                }
                Object objI = v07Var.d;
                int i14 = v07Var.e;
                if (i14 == 0) {
                    ch3.d0(objI);
                    v07Var.f = yx6Var2;
                    v07Var.e = 1;
                    objI = ch3.I(v07Var, (rre) obj4, true, false, (cf7) obj3);
                    if (objI != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        ch3.d0(objI);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yx6Var2 = v07Var.f;
                ch3.d0(objI);
                v07Var.f = null;
                v07Var.e = 2;
                if (yx6Var2.emit(objI, v07Var) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
            case 4:
                gu4 gu4Var = (gu4) obj4;
                nh8 nh8Var = (nh8) obj3;
                ny8 ny8Var = nh8Var.c;
                if (lq4Var instanceof kh8) {
                    kh8Var = (kh8) lq4Var;
                    int i15 = kh8Var.e;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        kh8Var.e = i15 - Integer.MIN_VALUE;
                    } else {
                        kh8Var = new kh8(so5Var, lq4Var);
                    }
                } else {
                    kh8Var = new kh8(so5Var, lq4Var);
                }
                Object objP2 = kh8Var.d;
                int i16 = kh8Var.e;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i2 = kh8Var.k;
                        i3 = kh8Var.j;
                        x0cVar = kh8Var.h;
                        yx6Var2 = kh8Var.g;
                        ch3.d0(objP2);
                    } else {
                        if (i16 != 2) {
                            if (i16 == 3) {
                                ch3.d0(objP2);
                                return sbiVar;
                            }
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = kh8Var.j;
                        ynhVar = kh8Var.i;
                        x0cVar2 = kh8Var.h;
                        yx6Var = kh8Var.g;
                        ch3.d0(objP2);
                    }
                    num = (Integer) objP2;
                    i = i4;
                    yx6Var2 = yx6Var;
                    x0cVar = x0cVar2;
                    uu4Var = new uu4(x0cVar, num.intValue(), ynhVar);
                    kh8Var.g = null;
                    kh8Var.h = null;
                    kh8Var.i = null;
                    kh8Var.j = i;
                    kh8Var.e = 3;
                    if (yx6Var2.emit(uu4Var, kh8Var) != hu4Var) {
                        return sbiVar;
                    }
                    return hu4Var;
                }
                ch3.d0(objP2);
                x0cVar = (x0c) obj2;
                ynh ynhVar2 = x0cVar.f;
                if (ynhVar2 == null) {
                    zv8[] zv8VarArr = nh8.m;
                    yf5 yf5VarH = yab.h(gu4Var, ((n0c) ((xhh) ny8Var.getValue())).a(), 0, new lh8(nh8Var, x0cVar, null, 0), 2);
                    kh8Var.g = yx6Var2;
                    kh8Var.h = x0cVar;
                    kh8Var.i = null;
                    kh8Var.j = 0;
                    kh8Var.k = 0;
                    kh8Var.e = 1;
                    objP2 = yf5VarH.p(kh8Var);
                    if (objP2 != hu4Var) {
                        i2 = 0;
                        i3 = 0;
                    }
                } else {
                    ynhVar = ynhVar2;
                    i = 0;
                    i2 = 0;
                    num = x0cVar.e;
                    if (num == null) {
                        zv8[] zv8VarArr2 = nh8.m;
                        yf5 yf5VarH2 = yab.h(gu4Var, ((n0c) ((xhh) ny8Var.getValue())).a(), 0, new lh8(nh8Var, x0cVar, null, 1), 2);
                        kh8Var.g = yx6Var2;
                        kh8Var.h = x0cVar;
                        kh8Var.i = ynhVar;
                        kh8Var.j = i;
                        kh8Var.k = i2;
                        kh8Var.e = 2;
                        objP = yf5VarH2.p(kh8Var);
                        if (objP != hu4Var) {
                            i4 = i;
                            objP2 = objP;
                            x0cVar2 = x0cVar;
                            yx6Var = yx6Var2;
                            num = (Integer) objP2;
                            i = i4;
                            yx6Var2 = yx6Var;
                            x0cVar = x0cVar2;
                            uu4Var = new uu4(x0cVar, num.intValue(), ynhVar);
                            kh8Var.g = null;
                            kh8Var.h = null;
                            kh8Var.i = null;
                            kh8Var.j = i;
                            kh8Var.e = 3;
                            if (yx6Var2.emit(uu4Var, kh8Var) != hu4Var) {
                                return sbiVar;
                            }
                        }
                    } else {
                        uu4Var = new uu4(x0cVar, num.intValue(), ynhVar);
                        kh8Var.g = null;
                        kh8Var.h = null;
                        kh8Var.i = null;
                        kh8Var.j = i;
                        kh8Var.e = 3;
                        if (yx6Var2.emit(uu4Var, kh8Var) != hu4Var) {
                            return sbiVar;
                        }
                    }
                }
                return hu4Var;
                int i17 = i3;
                ynhVar = (ynh) objP2;
                i = i17;
                num = x0cVar.e;
                if (num == null) {
                    zv8[] zv8VarArr3 = nh8.m;
                    yf5 yf5VarH3 = yab.h(gu4Var, ((n0c) ((xhh) ny8Var.getValue())).a(), 0, new lh8(nh8Var, x0cVar, null, 1), 2);
                    kh8Var.g = yx6Var2;
                    kh8Var.h = x0cVar;
                    kh8Var.i = ynhVar;
                    kh8Var.j = i;
                    kh8Var.k = i2;
                    kh8Var.e = 2;
                    objP = yf5VarH3.p(kh8Var);
                    if (objP != hu4Var) {
                        i4 = i;
                        objP2 = objP;
                        x0cVar2 = x0cVar;
                        yx6Var = yx6Var2;
                        num = (Integer) objP2;
                        i = i4;
                        yx6Var2 = yx6Var;
                        x0cVar = x0cVar2;
                        uu4Var = new uu4(x0cVar, num.intValue(), ynhVar);
                        kh8Var.g = null;
                        kh8Var.h = null;
                        kh8Var.i = null;
                        kh8Var.j = i;
                        kh8Var.e = 3;
                        if (yx6Var2.emit(uu4Var, kh8Var) != hu4Var) {
                            return sbiVar;
                        }
                    }
                } else {
                    uu4Var = new uu4(x0cVar, num.intValue(), ynhVar);
                    kh8Var.g = null;
                    kh8Var.h = null;
                    kh8Var.i = null;
                    kh8Var.j = i;
                    kh8Var.e = 3;
                    if (yx6Var2.emit(uu4Var, kh8Var) != hu4Var) {
                        return sbiVar;
                    }
                }
                return hu4Var;
            default:
                if (lq4Var instanceof r6b) {
                    r6bVar = (r6b) lq4Var;
                    int i18 = r6bVar.e;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        r6bVar.e = i18 - Integer.MIN_VALUE;
                    } else {
                        r6bVar = new r6b(so5Var, lq4Var);
                    }
                } else {
                    r6bVar = new r6b(so5Var, lq4Var);
                }
                Object obj9 = r6bVar.d;
                int i19 = r6bVar.e;
                if (i19 == 0) {
                    ch3.d0(obj9);
                    ylc ylcVar = ((Number) obj2).longValue() != -1 ? new ylc((ha9) obj4, (j6b) obj3) : null;
                    r6bVar.e = 1;
                    return yx6Var2.emit(ylcVar, r6bVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i19 == 1) {
                    ch3.d0(obj9);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ so5(yx6 yx6Var, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ so5(Serializable serializable, yx6 yx6Var, Object obj, int i) {
        this.a = i;
        this.c = serializable;
        this.b = yx6Var;
        this.d = obj;
    }
}
