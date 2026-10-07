package defpackage;

import java.util.concurrent.CancellationException;
import one.me.sdk.database.OneMeRoomDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class v6c extends mdh implements cf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6c(znc zncVar, ozh ozhVar, qf7 qf7Var, lq4 lq4Var) {
        super(1, lq4Var);
        this.g = zncVar;
        this.h = ozhVar;
        this.i = qf7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                return new v6c((w6c) obj, lq4Var);
            default:
                return new v6c((znc) this.g, (ozh) this.h, (qf7) obj, lq4Var);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                break;
        }
        return ((v6c) create(lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0151  */
    /* JADX WARN: Code duplicated, block: B:85:0x0155  */
    /* JADX WARN: Code duplicated, block: B:93:0x017d  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        OneMeRoomDatabase oneMeRoomDatabase;
        w6c w6cVar;
        w6c w6cVar2;
        OneMeRoomDatabase oneMeRoomDatabase2;
        Object objI;
        w6c w6cVar3;
        OneMeRoomDatabase oneMeRoomDatabase3;
        Object objI2;
        w6c w6cVar4;
        OneMeRoomDatabase oneMeRoomDatabase4;
        Object objI3;
        Object objI4;
        int i = this.e;
        Object obj2 = this.i;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                w6c w6cVar5 = (w6c) obj2;
                int i2 = this.f;
                sbi sbiVar = sbi.a;
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (i2 == 0) {
                                        ch3.d0(obj);
                                        oneMeRoomDatabase = (OneMeRoomDatabase) ((rre) w6cVar5.g.getValue());
                                        try {
                                            fpb fpbVarN = oneMeRoomDatabase.N();
                                            this.g = oneMeRoomDatabase;
                                            this.h = w6cVar5;
                                            this.f = 1;
                                            Object objI5 = ch3.I(this, fpbVarN.a, false, true, new s9a(24));
                                            if (objI5 != hu4Var) {
                                                objI5 = sbiVar;
                                            }
                                            if (objI5 == hu4Var) {
                                                return hu4Var;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            w6cVar = w6cVar5;
                                            gm0.V(w6cVar.k, "fail to clear notificationsTrackerMessagesDao", th);
                                        }
                                        gn6 gn6VarD = oneMeRoomDatabase.D();
                                        this.g = oneMeRoomDatabase;
                                        this.h = w6cVar5;
                                        this.f = 2;
                                        objI = ch3.I(this, gn6VarD.a, false, true, new us5(21));
                                        if (objI != hu4Var) {
                                            objI = sbiVar;
                                        }
                                        if (objI == hu4Var) {
                                            return hu4Var;
                                        }
                                        oneMeRoomDatabase2 = oneMeRoomDatabase;
                                        pnb pnbVarL = oneMeRoomDatabase2.L();
                                        this.g = oneMeRoomDatabase2;
                                        this.h = w6cVar5;
                                        this.f = 3;
                                        objI2 = ch3.I(this, pnbVarL.a, false, true, new s9a(20));
                                        if (objI2 != hu4Var) {
                                            objI2 = sbiVar;
                                        }
                                        if (objI2 == hu4Var) {
                                            return hu4Var;
                                        }
                                        oneMeRoomDatabase3 = oneMeRoomDatabase2;
                                        tnb tnbVarM = oneMeRoomDatabase3.M();
                                        this.g = oneMeRoomDatabase3;
                                        this.h = w6cVar5;
                                        this.f = 4;
                                        objI3 = ch3.I(this, tnbVarM.a, false, true, new s9a(21));
                                        if (objI3 != hu4Var) {
                                            objI3 = sbiVar;
                                        }
                                        if (objI3 == hu4Var) {
                                            return hu4Var;
                                        }
                                        oneMeRoomDatabase4 = oneMeRoomDatabase3;
                                        zn6 zn6VarE = oneMeRoomDatabase4.E();
                                        this.g = null;
                                        this.h = w6cVar5;
                                        this.f = 5;
                                        objI4 = ch3.I(this, zn6VarE.a, false, true, new us5(24));
                                        if (objI4 != hu4Var) {
                                            objI4 = sbiVar;
                                        }
                                        if (objI4 == hu4Var) {
                                            return hu4Var;
                                        }
                                    } else if (i2 == 1) {
                                        w6cVar = (w6c) this.h;
                                        oneMeRoomDatabase = (OneMeRoomDatabase) this.g;
                                        try {
                                            ch3.d0(obj);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            gm0.V(w6cVar.k, "fail to clear notificationsTrackerMessagesDao", th);
                                        }
                                        try {
                                            gn6 gn6VarD2 = oneMeRoomDatabase.D();
                                            this.g = oneMeRoomDatabase;
                                            this.h = w6cVar5;
                                            this.f = 2;
                                            objI = ch3.I(this, gn6VarD2.a, false, true, new us5(21));
                                            if (objI != hu4Var) {
                                                objI = sbiVar;
                                            }
                                            if (objI == hu4Var) {
                                                return hu4Var;
                                            }
                                            oneMeRoomDatabase2 = oneMeRoomDatabase;
                                            pnb pnbVarL2 = oneMeRoomDatabase2.L();
                                            this.g = oneMeRoomDatabase2;
                                            this.h = w6cVar5;
                                            this.f = 3;
                                            objI2 = ch3.I(this, pnbVarL2.a, false, true, new s9a(20));
                                            if (objI2 != hu4Var) {
                                                objI2 = sbiVar;
                                            }
                                            if (objI2 == hu4Var) {
                                                return hu4Var;
                                            }
                                            oneMeRoomDatabase3 = oneMeRoomDatabase2;
                                            tnb tnbVarM2 = oneMeRoomDatabase3.M();
                                            this.g = oneMeRoomDatabase3;
                                            this.h = w6cVar5;
                                            this.f = 4;
                                            objI3 = ch3.I(this, tnbVarM2.a, false, true, new s9a(21));
                                            if (objI3 != hu4Var) {
                                                objI3 = sbiVar;
                                            }
                                            if (objI3 == hu4Var) {
                                                return hu4Var;
                                            }
                                            oneMeRoomDatabase4 = oneMeRoomDatabase3;
                                            zn6 zn6VarE2 = oneMeRoomDatabase4.E();
                                            this.g = null;
                                            this.h = w6cVar5;
                                            this.f = 5;
                                            objI4 = ch3.I(this, zn6VarE2.a, false, true, new us5(24));
                                            if (objI4 != hu4Var) {
                                                objI4 = sbiVar;
                                            }
                                            if (objI4 == hu4Var) {
                                                return hu4Var;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            w6cVar2 = w6cVar5;
                                            oneMeRoomDatabase2 = oneMeRoomDatabase;
                                            gm0.V(w6cVar2.k, "fail to clear fcmAnalyticsDao", th);
                                        }
                                    } else if (i2 == 2) {
                                        w6cVar2 = (w6c) this.h;
                                        oneMeRoomDatabase2 = (OneMeRoomDatabase) this.g;
                                        try {
                                            ch3.d0(obj);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            gm0.V(w6cVar2.k, "fail to clear fcmAnalyticsDao", th);
                                        }
                                        try {
                                            pnb pnbVarL3 = oneMeRoomDatabase2.L();
                                            this.g = oneMeRoomDatabase2;
                                            this.h = w6cVar5;
                                            this.f = 3;
                                            objI2 = ch3.I(this, pnbVarL3.a, false, true, new s9a(20));
                                            if (objI2 != hu4Var) {
                                                objI2 = sbiVar;
                                            }
                                            if (objI2 == hu4Var) {
                                                return hu4Var;
                                            }
                                            oneMeRoomDatabase3 = oneMeRoomDatabase2;
                                            tnb tnbVarM3 = oneMeRoomDatabase3.M();
                                            this.g = oneMeRoomDatabase3;
                                            this.h = w6cVar5;
                                            this.f = 4;
                                            objI3 = ch3.I(this, tnbVarM3.a, false, true, new s9a(21));
                                            if (objI3 != hu4Var) {
                                                objI3 = sbiVar;
                                            }
                                            if (objI3 == hu4Var) {
                                                return hu4Var;
                                            }
                                            oneMeRoomDatabase4 = oneMeRoomDatabase3;
                                            zn6 zn6VarE3 = oneMeRoomDatabase4.E();
                                            this.g = null;
                                            this.h = w6cVar5;
                                            this.f = 5;
                                            objI4 = ch3.I(this, zn6VarE3.a, false, true, new us5(24));
                                            if (objI4 != hu4Var) {
                                                objI4 = sbiVar;
                                            }
                                            if (objI4 == hu4Var) {
                                                return hu4Var;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            w6cVar3 = w6cVar5;
                                            oneMeRoomDatabase3 = oneMeRoomDatabase2;
                                            gm0.V(w6cVar3.k, "fail to clear notificationsDao", th);
                                        }
                                    } else if (i2 == 3) {
                                        w6cVar3 = (w6c) this.h;
                                        oneMeRoomDatabase3 = (OneMeRoomDatabase) this.g;
                                        try {
                                            ch3.d0(obj);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            gm0.V(w6cVar3.k, "fail to clear notificationsDao", th);
                                        }
                                        try {
                                            tnb tnbVarM4 = oneMeRoomDatabase3.M();
                                            this.g = oneMeRoomDatabase3;
                                            this.h = w6cVar5;
                                            this.f = 4;
                                            objI3 = ch3.I(this, tnbVarM4.a, false, true, new s9a(21));
                                            if (objI3 != hu4Var) {
                                                objI3 = sbiVar;
                                            }
                                            if (objI3 == hu4Var) {
                                                return hu4Var;
                                            }
                                            oneMeRoomDatabase4 = oneMeRoomDatabase3;
                                            zn6 zn6VarE4 = oneMeRoomDatabase4.E();
                                            this.g = null;
                                            this.h = w6cVar5;
                                            this.f = 5;
                                            objI4 = ch3.I(this, zn6VarE4.a, false, true, new us5(24));
                                            if (objI4 != hu4Var) {
                                                objI4 = sbiVar;
                                            }
                                            if (objI4 == hu4Var) {
                                                return hu4Var;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            w6cVar4 = w6cVar5;
                                            oneMeRoomDatabase4 = oneMeRoomDatabase3;
                                            gm0.V(w6cVar4.k, "fail to clear notificationsReadMarksDao", th);
                                        }
                                    } else if (i2 == 4) {
                                        w6cVar4 = (w6c) this.h;
                                        oneMeRoomDatabase4 = (OneMeRoomDatabase) this.g;
                                        try {
                                            ch3.d0(obj);
                                        } catch (Throwable th8) {
                                            th = th8;
                                            gm0.V(w6cVar4.k, "fail to clear notificationsReadMarksDao", th);
                                        }
                                        zn6 zn6VarE5 = oneMeRoomDatabase4.E();
                                        this.g = null;
                                        this.h = w6cVar5;
                                        this.f = 5;
                                        objI4 = ch3.I(this, zn6VarE5.a, false, true, new us5(24));
                                        if (objI4 != hu4Var) {
                                            objI4 = sbiVar;
                                        }
                                        if (objI4 == hu4Var) {
                                            return hu4Var;
                                        }
                                    } else {
                                        if (i2 != 5) {
                                            ore.k("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        w6cVar5 = (w6c) this.h;
                                        ch3.d0(obj);
                                    }
                                    break;
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable th9) {
                                    gm0.V(w6cVar5.k, "fail to clear fcmNotificationHistoryDao", th9);
                                }
                                return sbiVar;
                            } catch (CancellationException e2) {
                                throw e2;
                            }
                        } catch (CancellationException e3) {
                            throw e3;
                        }
                    } catch (CancellationException e4) {
                        throw e4;
                    }
                } catch (CancellationException e5) {
                    throw e5;
                }
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Object objE = ((znc) this.g).e((ozh) this.h, (qf7) obj2, this);
                    return objE == hu4Var ? hu4Var : objE;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6c(w6c w6cVar, lq4 lq4Var) {
        super(1, lq4Var);
        this.i = w6cVar;
    }
}
