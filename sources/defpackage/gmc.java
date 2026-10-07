package defpackage;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class gmc extends mdh implements qf7 {
    public y02 e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ t84 k;
    public final /* synthetic */ x02 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ sfe n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(t84 t84Var, x02 x02Var, int i, sfe sfeVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = t84Var;
        this.l = x02Var;
        this.m = i;
        this.n = sfeVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        gmc gmcVar = new gmc(this.k, this.l, this.m, this.n, lq4Var);
        gmcVar.j = obj;
        return gmcVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((gmc) create((dmc) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /* JADX WARN: Code duplicated, block: B:72:0x016e  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1 A[RETURN] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        y02 y02Var;
        boolean z2;
        Notification notification;
        Object objI;
        boolean z3;
        boolean z4;
        y02 y02Var2;
        Object objK;
        Object objJ;
        boolean z5;
        boolean z6;
        y02 y02Var3;
        Notification notification2;
        lk9 lk9VarC;
        fmc fmcVar;
        boolean z7;
        gmc gmcVar = this;
        t84 t84Var = gmcVar.k;
        ny8 ny8Var = (ny8) t84Var.c;
        ny8 ny8Var2 = (ny8) t84Var.d;
        dmc dmcVar = (dmc) gmcVar.j;
        int i2 = gmcVar.i;
        sbi sbiVar = sbi.a;
        x02 x02Var = gmcVar.l;
        hu4 hu4Var = hu4.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i2 == 2) {
                int i3 = gmcVar.h;
                z5 = gmcVar.g;
                z6 = gmcVar.f;
                y02Var3 = gmcVar.e;
                ch3.d0(obj);
                i = i3;
                objJ = obj;
                notification2 = (Notification) objJ;
                z = z6;
                y02Var = y02Var3;
                gmcVar = gmcVar;
                z2 = z5;
                notification = notification2;
                lk9VarC = ((n0c) ((xhh) ny8Var.getValue())).c();
                if (i != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z8 = z;
                fmcVar = new fmc(notification, t84Var, gmcVar.m, z7, z2, gmcVar.n, y02Var, x02Var, z8, null);
                gmcVar.j = null;
                gmcVar.e = null;
                gmcVar.f = z8;
                gmcVar.g = z2;
                gmcVar.h = i;
                gmcVar.i = 5;
                if (yab.K0(lk9VarC, fmcVar, gmcVar) == hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            }
            if (i2 == 3) {
                int i4 = gmcVar.h;
                z3 = gmcVar.g;
                z4 = gmcVar.f;
                y02Var2 = gmcVar.e;
                ch3.d0(obj);
                i = i4;
                objK = obj;
                notification2 = (Notification) objK;
                z2 = z3;
                z = z4;
                y02Var = y02Var2;
                notification = notification2;
                lk9VarC = ((n0c) ((xhh) ny8Var.getValue())).c();
                if (i != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z9 = z;
                fmcVar = new fmc(notification, t84Var, gmcVar.m, z7, z2, gmcVar.n, y02Var, x02Var, z9, null);
                gmcVar.j = null;
                gmcVar.e = null;
                gmcVar.f = z9;
                gmcVar.g = z2;
                gmcVar.h = i;
                gmcVar.i = 5;
                if (yab.K0(lk9VarC, fmcVar, gmcVar) == hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = gmcVar.h;
            z3 = gmcVar.g;
            z4 = gmcVar.f;
            y02Var2 = gmcVar.e;
            ch3.d0(obj);
            i = i5;
            gmcVar = gmcVar;
            objI = obj;
            notification2 = (Notification) objI;
            z2 = z3;
            z = z4;
            y02Var = y02Var2;
            notification = notification2;
            lk9VarC = ((n0c) ((xhh) ny8Var.getValue())).c();
            if (i != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z10 = z;
            fmcVar = new fmc(notification, t84Var, gmcVar.m, z7, z2, gmcVar.n, y02Var, x02Var, z10, null);
            gmcVar.j = null;
            gmcVar.e = null;
            gmcVar.f = z10;
            gmcVar.g = z2;
            gmcVar.h = i;
            gmcVar.i = 5;
            if (yab.K0(lk9VarC, fmcVar, gmcVar) == hu4Var) {
                return hu4Var;
            }
            return sbiVar;
        }
        ch3.d0(obj);
        be1 be1Var = dmcVar.a;
        z = dmcVar.b;
        dz4 dz4Var = dmcVar.c;
        boolean z11 = dmcVar.d;
        if (!cqk.d(be1Var, be1.n)) {
            pi6 pi6Var = dz4Var.q;
            phl phlVar = dz4Var.a;
            if ((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6)) {
                String strS = x02Var.s();
                gmcVar.j = null;
                gmcVar.f = z;
                gmcVar.g = z11;
                gmcVar.i = 1;
                Object objK0 = yab.K0(((n0c) ((xhh) ny8Var.getValue())).c(), new awa(t84Var, gmcVar.m, strS, (lq4) null), gmcVar);
                if (objK0 != hu4Var) {
                    objK0 = sbiVar;
                }
                if (objK0 == hu4Var) {
                }
            } else {
                i = (!dz4Var.h || dz4Var.g) ? 0 : 1;
                y02Var = (y02) ((oo3) t84Var.f).invoke(x02Var.l());
                if (i != 0 && z11) {
                    u92 u92VarJ = y02Var.j();
                    Context context = (Context) ny8Var2.getValue();
                    boolean zB = phlVar != null ? phlVar.b() : false;
                    String strS2 = x02Var.s();
                    gmcVar.j = null;
                    gmcVar.e = y02Var;
                    gmcVar.f = z;
                    gmcVar.g = z11;
                    gmcVar.h = i;
                    gmcVar.i = 2;
                    objJ = u92VarJ.j(context, be1Var, zB, strS2, gmcVar);
                    if (objJ != hu4Var) {
                        z5 = z11;
                        z6 = z;
                        y02Var3 = y02Var;
                        notification2 = (Notification) objJ;
                        z = z6;
                        y02Var = y02Var3;
                        gmcVar = gmcVar;
                        z2 = z5;
                        notification = notification2;
                        lk9VarC = ((n0c) ((xhh) ny8Var.getValue())).c();
                        if (i != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean z12 = z;
                        fmcVar = new fmc(notification, t84Var, gmcVar.m, z7, z2, gmcVar.n, y02Var, x02Var, z12, null);
                        gmcVar.j = null;
                        gmcVar.e = null;
                        gmcVar.f = z12;
                        gmcVar.g = z2;
                        gmcVar.h = i;
                        gmcVar.i = 5;
                        if (yab.K0(lk9VarC, fmcVar, gmcVar) == hu4Var) {
                        }
                    }
                } else if (i != 0) {
                    u92 u92VarJ2 = y02Var.j();
                    Context context2 = (Context) ny8Var2.getValue();
                    boolean zB2 = phlVar != null ? phlVar.b() : false;
                    String strS3 = x02Var.s();
                    gmcVar.j = null;
                    gmcVar.e = y02Var;
                    gmcVar.f = z;
                    gmcVar.g = z11;
                    gmcVar.h = i;
                    gmcVar.i = 3;
                    objK = u92VarJ2.k(context2, be1Var, zB2, strS3, gmcVar);
                    if (objK != hu4Var) {
                        z3 = z11;
                        z4 = z;
                        y02Var2 = y02Var;
                        notification2 = (Notification) objK;
                        z2 = z3;
                        z = z4;
                        y02Var = y02Var2;
                        notification = notification2;
                        lk9VarC = ((n0c) ((xhh) ny8Var.getValue())).c();
                        if (i != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean z13 = z;
                        fmcVar = new fmc(notification, t84Var, gmcVar.m, z7, z2, gmcVar.n, y02Var, x02Var, z13, null);
                        gmcVar.j = null;
                        gmcVar.e = null;
                        gmcVar.f = z13;
                        gmcVar.g = z2;
                        gmcVar.h = i;
                        gmcVar.i = 5;
                        if (yab.K0(lk9VarC, fmcVar, gmcVar) == hu4Var) {
                        }
                    }
                } else {
                    gmcVar = gmcVar;
                    if (z) {
                        u92 u92VarJ3 = y02Var.j();
                        Context context3 = (Context) ny8Var2.getValue();
                        String strS4 = x02Var.s();
                        gmcVar.j = null;
                        gmcVar.e = y02Var;
                        gmcVar.f = z;
                        gmcVar.g = z11;
                        gmcVar.h = i;
                        gmcVar.i = 4;
                        objI = u92VarJ3.i(context3, be1Var, strS4, gmcVar);
                        if (objI != hu4Var) {
                            z3 = z11;
                            z4 = z;
                            y02Var2 = y02Var;
                            notification2 = (Notification) objI;
                            z2 = z3;
                            z = z4;
                            y02Var = y02Var2;
                            notification = notification2;
                            lk9VarC = ((n0c) ((xhh) ny8Var.getValue())).c();
                            if (i != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            boolean z14 = z;
                            fmcVar = new fmc(notification, t84Var, gmcVar.m, z7, z2, gmcVar.n, y02Var, x02Var, z14, null);
                            gmcVar.j = null;
                            gmcVar.e = null;
                            gmcVar.f = z14;
                            gmcVar.g = z2;
                            gmcVar.h = i;
                            gmcVar.i = 5;
                            if (yab.K0(lk9VarC, fmcVar, gmcVar) == hu4Var) {
                            }
                        }
                    } else {
                        z2 = z11;
                        notification = null;
                        lk9VarC = ((n0c) ((xhh) ny8Var.getValue())).c();
                        if (i != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean z15 = z;
                        fmcVar = new fmc(notification, t84Var, gmcVar.m, z7, z2, gmcVar.n, y02Var, x02Var, z15, null);
                        gmcVar.j = null;
                        gmcVar.e = null;
                        gmcVar.f = z15;
                        gmcVar.g = z2;
                        gmcVar.h = i;
                        gmcVar.i = 5;
                        if (yab.K0(lk9VarC, fmcVar, gmcVar) == hu4Var) {
                        }
                    }
                }
            }
            return hu4Var;
        }
        return sbiVar;
    }
}
