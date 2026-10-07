package defpackage;

import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class uq2 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public long f;
    public int g;
    public final /* synthetic */ boolean h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq2(wq2 wq2Var, long j, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = wq2Var;
        this.f = j;
        this.h = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                uq2 uq2Var = new uq2((wq2) obj2, this.f, this.h, lq4Var);
                uq2Var.i = obj;
                return uq2Var;
            default:
                return new uq2((ae8) obj2, this.h, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((uq2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0161  */
    /* JADX WARN: Code duplicated, block: B:73:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0172  */
    /* JADX WARN: Code duplicated, block: B:77:0x0175  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Code duplicated, block: B:81:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:0x019c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object obj2;
        dg3 dg3Var;
        Throwable thA;
        TamErrorException tamErrorException;
        yhh yhhVar;
        dih dihVarA;
        ynh xnhVar;
        String str;
        Object objD;
        ge8 ge8Var;
        fe8 fe8Var;
        long jCurrentTimeMillis;
        long j;
        wd8 wd8Var;
        ge8 ge8VarA;
        ge8 ge8Var2;
        long j2;
        pzf pzfVar;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        Object obj3 = this.j;
        sbi sbiVar = sbi.a;
        boolean z = this.h;
        switch (i) {
            case 0:
                wq2 wq2Var = (wq2) obj3;
                gu4 gu4Var = (gu4) this.i;
                int i2 = this.g;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ch3.d0(obj);
                            return sbiVar;
                        }
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objA = ((roe) obj).a;
                    if (objA instanceof poe) {
                        obj2 = null;
                    } else {
                        obj2 = objA;
                    }
                    dg3Var = (dg3) obj2;
                    thA = roe.a(objA);
                    if (dg3Var != null) {
                        this.i = null;
                        this.g = 2;
                        if (wq2.B(wq2Var, dg3Var, z, this) == hu4Var) {
                            return hu4Var;
                        }
                    } else if (thA != null) {
                        gm0.V(wq2Var.d, "Fail change owner", thA);
                        if (thA instanceof TamErrorException) {
                            tamErrorException = (TamErrorException) thA;
                        } else {
                            tamErrorException = null;
                        }
                        if (tamErrorException != null) {
                            yhhVar = tamErrorException.a;
                        } else {
                            yhhVar = null;
                        }
                        dihVarA = svl.a(yhhVar);
                        if (dihVarA.equals(zhh.a)) {
                            xnhVar = new tnh(R.string.common_error_base_retry);
                        } else if (dihVarA.equals(aih.a)) {
                            xnhVar = new tnh(R.string.common_network_error);
                        } else if (dihVarA.equals(bih.a)) {
                            xnhVar = new tnh(R.string.common_service_error);
                        } else {
                            if (dihVarA instanceof cih) {
                                ore.o();
                                return null;
                            }
                            xnhVar = new xnh(((cih) dihVarA).a);
                        }
                        a8j.x(wq2Var.j, new sq2(xnhVar, Integer.valueOf(R.drawable.icon_warning)));
                    }
                    return sbiVar;
                }
                ch3.d0(obj);
                rt2 rt2Var = (rt2) ((xn3) wq2Var.e.getValue()).k(wq2Var.c).a.getValue();
                if (rt2Var == null) {
                    gm0.Y(gu4Var.getClass().getName(), "Can't change owner because chat is null");
                } else {
                    ov2 ov2Var = (ov2) wq2Var.h.getValue();
                    long jA = rt2Var.A();
                    long j3 = this.f;
                    this.i = null;
                    this.g = 1;
                    objA = ov2Var.a(jA, j3, this);
                    if (objA == hu4Var) {
                        return hu4Var;
                    }
                    if (objA instanceof poe) {
                        obj2 = null;
                    } else {
                        obj2 = objA;
                    }
                    dg3Var = (dg3) obj2;
                    thA = roe.a(objA);
                    if (dg3Var != null) {
                        this.i = null;
                        this.g = 2;
                        if (wq2.B(wq2Var, dg3Var, z, this) == hu4Var) {
                            return hu4Var;
                        }
                    } else if (thA != null) {
                        gm0.V(wq2Var.d, "Fail change owner", thA);
                        if (thA instanceof TamErrorException) {
                            tamErrorException = (TamErrorException) thA;
                        } else {
                            tamErrorException = null;
                        }
                        if (tamErrorException != null) {
                            yhhVar = tamErrorException.a;
                        } else {
                            yhhVar = null;
                        }
                        dihVarA = svl.a(yhhVar);
                        if (dihVarA.equals(zhh.a)) {
                            xnhVar = new tnh(R.string.common_error_base_retry);
                        } else if (dihVarA.equals(aih.a)) {
                            xnhVar = new tnh(R.string.common_network_error);
                        } else if (dihVarA.equals(bih.a)) {
                            xnhVar = new tnh(R.string.common_service_error);
                        } else {
                            if (dihVarA instanceof cih) {
                                ore.o();
                                return null;
                            }
                            xnhVar = new xnh(((cih) dihVarA).a);
                        }
                        a8j.x(wq2Var.j, new sq2(xnhVar, Integer.valueOf(R.drawable.icon_warning)));
                    }
                }
                return sbiVar;
            default:
                ae8 ae8Var = (ae8) obj3;
                int i3 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    Object value = ae8Var.i.a.getValue();
                    gf8 gf8Var = value instanceof gf8 ? (gf8) value : null;
                    if (gf8Var != null && (str = gf8Var.a) != null) {
                        if (z) {
                            zv8[] zv8VarArr = ae8.u;
                            mjg mjgVar = ae8Var.h;
                            mjgVar.getClass();
                            mjgVar.j(null, hf8.a);
                        }
                        zv8[] zv8VarArr2 = ae8.u;
                        wd8 wd8Var2 = ae8Var.b;
                        this.g = 1;
                        objD = wd8Var2.d(str, this);
                        if (objD == hu4Var) {
                            return hu4Var;
                        }
                        ge8Var = (ge8) objD;
                        if (ge8Var != null) {
                            fe8Var = ge8Var.j;
                            if (!(fe8Var instanceof de8)) {
                                zv8[] zv8VarArr3 = ae8.u;
                                ae8Var.e().a("informer_use", ge8Var.a, fe8Var.a);
                            }
                            if (z) {
                                zv8[] zv8VarArr4 = ae8.u;
                                ae8Var.getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis = ge8Var.m;
                            }
                            j = jCurrentTimeMillis;
                            zv8[] zv8VarArr5 = ae8.u;
                            wd8Var = ae8Var.b;
                            ge8VarA = ge8.a(ge8Var, System.currentTimeMillis(), 0L, j, 0, 27647);
                            ge8Var2 = ge8Var;
                            this.i = ge8Var2;
                            this.f = j;
                            this.g = 2;
                            if (wd8Var.c(ge8VarA, this) == hu4Var) {
                                return hu4Var;
                            }
                            j2 = j;
                            if (ge8Var2.j instanceof ce8) {
                                zv8[] zv8VarArr6 = ae8.u;
                                pzfVar = ae8Var.j;
                                this.i = null;
                                this.f = j2;
                                this.g = 3;
                                if (pzfVar.emit(oe8.a, this) == hu4Var) {
                                    return hu4Var;
                                }
                            }
                        }
                    }
                } else if (i3 == 1) {
                    ch3.d0(obj);
                    objD = obj;
                    ge8Var = (ge8) objD;
                    if (ge8Var != null) {
                        fe8Var = ge8Var.j;
                        if (!(fe8Var instanceof de8)) {
                            zv8[] zv8VarArr7 = ae8.u;
                            ae8Var.e().a("informer_use", ge8Var.a, fe8Var.a);
                        }
                        if (z) {
                            zv8[] zv8VarArr8 = ae8.u;
                            ae8Var.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                        } else {
                            jCurrentTimeMillis = ge8Var.m;
                        }
                        j = jCurrentTimeMillis;
                        zv8[] zv8VarArr9 = ae8.u;
                        wd8Var = ae8Var.b;
                        ge8VarA = ge8.a(ge8Var, System.currentTimeMillis(), 0L, j, 0, 27647);
                        ge8Var2 = ge8Var;
                        this.i = ge8Var2;
                        this.f = j;
                        this.g = 2;
                        if (wd8Var.c(ge8VarA, this) == hu4Var) {
                            return hu4Var;
                        }
                        j2 = j;
                        if (ge8Var2.j instanceof ce8) {
                            zv8[] zv8VarArr10 = ae8.u;
                            pzfVar = ae8Var.j;
                            this.i = null;
                            this.f = j2;
                            this.g = 3;
                            if (pzfVar.emit(oe8.a, this) == hu4Var) {
                                return hu4Var;
                            }
                        }
                    }
                } else if (i3 == 2) {
                    j2 = this.f;
                    ge8Var2 = (ge8) this.i;
                    ch3.d0(obj);
                    if (ge8Var2.j instanceof ce8) {
                        zv8[] zv8VarArr11 = ae8.u;
                        pzfVar = ae8Var.j;
                        this.i = null;
                        this.f = j2;
                        this.g = 3;
                        if (pzfVar.emit(oe8.a, this) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i3 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq2(ae8 ae8Var, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = ae8Var;
        this.h = z;
    }
}
