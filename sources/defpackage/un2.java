package defpackage;

import android.app.Activity;
import android.content.Context;
import one.me.sdk.vendor.rustore.appupdate.aidlproxy.RuStoreAppUpdateException;

/* JADX INFO: loaded from: classes.dex */
public final class un2 extends gu {
    public final gu4 b;
    public final xt4 c;
    public final ku d;
    public final ny8 e;
    public final pfh f;
    public final String g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ifh k;

    public un2(ite iteVar, lk9 lk9Var, ku kuVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        pfh pfhVar = new pfh(2);
        super(ny8Var);
        this.b = iteVar;
        this.c = lk9Var;
        this.d = kuVar;
        this.e = ny8Var;
        this.f = pfhVar;
        this.g = un2.class.getName();
        this.h = ny8Var3;
        this.i = ny8Var2;
        this.j = ny8Var4;
        this.k = new ifh(new x5(ny8Var3, 7, this));
    }

    @Override // defpackage.gu
    public final void a(Activity activity) {
        yab.i0(this.b, this.c, 0, new qt1(this, activity, null, 21), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gu
    public final Object b(Context context, nq4 nq4Var) {
        sn2 sn2Var;
        if (nq4Var instanceof sn2) {
            sn2Var = (sn2) nq4Var;
            int i = sn2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sn2Var.f = i - Integer.MIN_VALUE;
            } else {
                sn2Var = new sn2(this, nq4Var);
            }
        } else {
            sn2Var = new sn2(this, nq4Var);
        }
        Object objE = sn2Var.d;
        int i2 = sn2Var.f;
        if (i2 == 0) {
            ch3.d0(objE);
            sn2Var.f = 1;
            objE = e(context, mn2.b, sn2Var);
            Object obj = hu4.a;
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objE);
        }
        return Boolean.valueOf(objE != null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Enum c(Context context, nq4 nq4Var) {
        on2 on2Var;
        ln2 ln2Var;
        un2 un2Var;
        je9 je9Var = je9.d;
        if (nq4Var instanceof on2) {
            on2Var = (on2) nq4Var;
            int i = on2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                on2Var.h = i - Integer.MIN_VALUE;
            } else {
                on2Var = new on2(this, nq4Var);
            }
        } else {
            on2Var = new on2(this, nq4Var);
        }
        Object obj = on2Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = on2Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            ln2 ln2Var2 = ln2.b;
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "checking " + ln2Var2, null);
            }
            ku kuVar = this.d;
            on2Var.d = ln2Var2;
            on2Var.e = this;
            on2Var.h = 1;
            Object objB = kuVar.b(context, on2Var);
            if (objB == hu4Var) {
                return hu4Var;
            }
            ln2Var = ln2Var2;
            obj = objB;
            un2Var = this;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            un2Var = on2Var.e;
            ln2Var = on2Var.d;
            ch3.d0(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        un2Var.getClass();
        jn2 jn2Var = zBooleanValue ? jn2.d : jn2.c;
        String str2 = this.g;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, ln2Var + " available=" + jn2Var, null);
        }
        return jn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(Context context, nq4 nq4Var) {
        pn2 pn2Var;
        long j;
        ln2 ln2Var;
        un2 un2Var;
        String str;
        a4c a4cVar;
        je9 je9Var;
        je9 je9Var2 = je9.d;
        if (nq4Var instanceof pn2) {
            pn2Var = (pn2) nq4Var;
            int i = pn2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                pn2Var.i = i - Integer.MIN_VALUE;
            } else {
                pn2Var = new pn2(this, nq4Var);
            }
        } else {
            pn2Var = new pn2(this, nq4Var);
        }
        Object obj = pn2Var.g;
        hu4 hu4Var = hu4.a;
        int i2 = pn2Var.i;
        if (i2 == 0) {
            ch3.d0(obj);
            ln2 ln2Var2 = ln2.c;
            long jG = ew5.g(this.f.m());
            String str2 = this.g;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, "checking " + ln2Var2, null);
            }
            try {
                kwe kweVar = (kwe) this.i.getValue();
                pn2Var.d = ln2Var2;
                pn2Var.e = this;
                pn2Var.f = jG;
                pn2Var.i = 1;
                Object objB = kweVar.b(context, pn2Var);
                if (objB == hu4Var) {
                    return hu4Var;
                }
                ln2Var = ln2Var2;
                j = jG;
                obj = objB;
                un2Var = this;
            } catch (RuStoreAppUpdateException e) {
                e = e;
                j = jG;
                str = this.g;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, qv1.k("checkRuStore: failed, treating as unavailable: ", e.getMessage()), null);
                    }
                }
                return new kn2(jn2.e, ew5.g(this.f.m()) - j, e);
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = pn2Var.f;
            un2Var = pn2Var.e;
            ln2Var = pn2Var.d;
            try {
                ch3.d0(obj);
            } catch (RuStoreAppUpdateException e2) {
                e = e2;
                str = this.g;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, qv1.k("checkRuStore: failed, treating as unavailable: ", e.getMessage()), null);
                    }
                }
                return new kn2(jn2.e, ew5.g(this.f.m()) - j, e);
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        un2Var.getClass();
        jn2 jn2Var = zBooleanValue ? jn2.d : jn2.c;
        String str3 = this.g;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
            a4cVar3.c(je9Var2, str3, ln2Var + " available=" + jn2Var, null);
        }
        return new kn2(jn2Var, ew5.g(this.f.m()) - j);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:26:0x010c  */
    /* JADX WARN: Code duplicated, block: B:28:0x013b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0141  */
    /* JADX WARN: Code duplicated, block: B:33:0x0161  */
    /* JADX WARN: Code duplicated, block: B:37:0x018a  */
    /* JADX WARN: Code duplicated, block: B:38:0x018d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x010c -> B:27:0x0113). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Enum e(android.content.Context r47, defpackage.mn2 r48, defpackage.nq4 r49) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un2.e(android.content.Context, mn2, nq4):java.lang.Enum");
    }
}
