package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class yob implements cs3 {
    public static final /* synthetic */ int e = 0;
    public final xhh a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public yob(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, xhh xhhVar) {
        this.a = xhhVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(yob yobVar, List list, nq4 nq4Var) {
        tob tobVar;
        if (nq4Var instanceof tob) {
            tobVar = (tob) nq4Var;
            int i = tobVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tobVar.f = i - Integer.MIN_VALUE;
            } else {
                tobVar = new tob(yobVar, nq4Var);
            }
        } else {
            tobVar = new tob(yobVar, nq4Var);
        }
        Object obj = tobVar.d;
        int i2 = tobVar.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            gn6 gn6Var = (gn6) yobVar.b.getValue();
            tobVar.f = 1;
            Object objA = gn6Var.a(list, tobVar);
            hu4 hu4Var = hu4.a;
            return objA == hu4Var ? hu4Var : objA;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            gm0.l("yob", "getAnalyticsEntries: failed", th);
            return r66.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00de A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:45:0x013d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x0231  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e9 -> B:36:0x00eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0231 -> B:94:0x0238). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.yob r25, java.util.List r26, java.util.List r27, boolean r28, defpackage.nq4 r29) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yob.c(yob, java.util.List, java.util.List, boolean, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(yob yobVar, ArrayList arrayList, nq4 nq4Var) {
        xob xobVar;
        if (nq4Var instanceof xob) {
            xobVar = (xob) nq4Var;
            int i = xobVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                xobVar.f = i - Integer.MIN_VALUE;
            } else {
                xobVar = new xob(yobVar, nq4Var);
            }
        } else {
            xobVar = new xob(yobVar, nq4Var);
        }
        Object obj = xobVar.d;
        int i2 = xobVar.f;
        sbi sbiVar = sbi.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            fpb fpbVarG = yobVar.g();
            xobVar.f = 1;
            Object objI = ch3.I(xobVar, fpbVarG.a, false, true, new ol(fpbVarG, 8, arrayList));
            hu4 hu4Var = hu4.a;
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            return objI == hu4Var ? hu4Var : sbiVar;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            gm0.l("yob", "storeMessagesProcessed: failed ", th);
            return sbiVar;
        }
    }

    @Override // defpackage.cs3
    public final Object a(long j, ds3 ds3Var) {
        Object objK0 = yab.K0(((n0c) this.a).b(), new x53(j, this, (lq4) null), ds3Var);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x010c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e2 -> B:21:0x0087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x010c -> B:21:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.util.List r19, java.util.List r20, defpackage.nq4 r21) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yob.e(java.util.List, java.util.List, nq4):java.lang.Object");
    }

    public final zob f() {
        return (zob) this.c.getValue();
    }

    public final fpb g() {
        return (fpb) this.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ilb ilbVar, long j, nq4 nq4Var) {
        uob uobVar;
        if (nq4Var instanceof uob) {
            uobVar = (uob) nq4Var;
            int i = uobVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                uobVar.h = i - Integer.MIN_VALUE;
            } else {
                uobVar = new uob(this, nq4Var);
            }
        } else {
            uobVar = new uob(this, nq4Var);
        }
        Object obj = uobVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = uobVar.h;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = uobVar.e;
                ilb ilbVar2 = uobVar.d;
                ch3.d0(obj);
                return obj;
            }
            ch3.d0(obj);
            fpb fpbVarG = g();
            uobVar.d = ilbVar;
            uobVar.e = j;
            uobVar.h = 1;
            Object objA = fpbVarG.a(ilbVar, j, uobVar);
            return objA == hu4Var ? hu4Var : objA;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "yob", "getProcessedMessage: failed for chatRef=" + ilbVar + ", messageId=" + j, th);
                }
            }
            return null;
        }
    }

    public final Object i(xn6 xn6Var, hn6 hn6Var, xyd xydVar) {
        Object objK0 = yab.K0(((n0c) this.a).b(), new xra(hn6Var, this, xn6Var, (lq4) null), xydVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public final Object j(long j, long j2, mdh mdhVar) {
        Object objK0 = yab.K0(((n0c) this.a).b(), new h01(this, j, j2, (lq4) null, 8), mdhVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(List list, nq4 nq4Var) {
        wob wobVar;
        if (nq4Var instanceof wob) {
            wobVar = (wob) nq4Var;
            int i = wobVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wobVar.f = i - Integer.MIN_VALUE;
            } else {
                wobVar = new wob(this, nq4Var);
            }
        } else {
            wobVar = new wob(this, nq4Var);
        }
        Object obj = wobVar.d;
        int i2 = wobVar.f;
        sbi sbiVar = sbi.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            gn6 gn6Var = (gn6) this.b.getValue();
            wobVar.f = 1;
            Object objI = ch3.I(wobVar, gn6Var.a, false, true, new w14(gn6Var, 19, list));
            hu4 hu4Var = hu4.a;
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            return objI == hu4Var ? hu4Var : sbiVar;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            gm0.l("yob", "putAnalyticsEntries: failed", th);
            return sbiVar;
        }
    }
}
