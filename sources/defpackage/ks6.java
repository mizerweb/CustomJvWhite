package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ks6 implements qg6, d4f {
    public Object a;
    public Object b;
    public Object c;

    public ks6(fb0... fb0VarArr) {
        d6g d6gVar = new d6g();
        fdg fdgVar = new fdg(false);
        fb0[] fb0VarArr2 = new fb0[fb0VarArr.length + 2];
        this.a = fb0VarArr2;
        System.arraycopy(fb0VarArr, 0, fb0VarArr2, 0, fb0VarArr.length);
        this.b = d6gVar;
        this.c = fdgVar;
        fb0VarArr2[fb0VarArr.length] = d6gVar;
        fb0VarArr2[fb0VarArr.length + 1] = fdgVar;
    }

    public String a(int i) {
        gm0.m("ks6", "getVcfByPhoneContactId: phoneContactId %d", Integer.valueOf(i));
        try {
            String str = (String) iyg.c((Context) this.a, Collections.singletonList(Integer.valueOf(i)), (ed6) this.c).get(i);
            if (!ch3.r(str)) {
                return str;
            }
            gm0.W("ks6", "getVcfByPhoneContactId: vCard is empty for phoneContactId %d", Integer.valueOf(i));
            return null;
        } catch (Exception e) {
            Locale locale = Locale.ENGLISH;
            gm0.V("ks6", "getVcfByPhoneContactId: exception for phoneContactId " + i, e);
            return null;
        }
    }

    @Override // defpackage.d4f
    public void b() {
        y3f y3fVar = (y3f) ((af7) this.a).invoke();
        if (y3fVar == null) {
            return;
        }
        ((tbb) ((ny8) this.b).getValue()).f(y3fVar, (lmc) ((af7) this.c).invoke());
    }

    public String c(long j, sse sseVar) {
        try {
            if (!((wsc) ((wwb) this.b).a.getValue()).c(wsc.g)) {
                gm0.W("ks6", "getVcfByServerPhone: no permissions for contacts", new Object[0]);
                return null;
            }
            sseVar.getClass();
            rtc rtcVar = (rtc) ww3.t1(sseVar.d(Collections.singletonList(Long.valueOf(j))));
            if (rtcVar != null) {
                return a(rtcVar.i());
            }
            Locale locale = Locale.ENGLISH;
            gm0.W("ks6", "getVcfByServerPhone: no phoneDb found with server phone " + j, new Object[0]);
            return null;
        } catch (Exception e) {
            Locale locale2 = Locale.ENGLISH;
            gm0.V("ks6", "getVcfByServerPhone: exception for server phone " + j, e);
            return null;
        }
    }

    public boolean d(int i, vf4 vf4Var, hg4 hg4Var) {
        mt0 mt0Var = (mt0) this.b;
        int[] iArr = hg4Var.o0;
        int[] iArr2 = hg4Var.t;
        mt0Var.a = iArr[0];
        mt0Var.b = iArr[1];
        mt0Var.c = hg4Var.o();
        mt0Var.d = hg4Var.i();
        mt0Var.i = false;
        mt0Var.j = i;
        boolean z = mt0Var.a == 3;
        boolean z2 = mt0Var.b == 3;
        boolean z3 = z && hg4Var.V > 0.0f;
        boolean z4 = z2 && hg4Var.V > 0.0f;
        if (z3 && iArr2[0] == 4) {
            mt0Var.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            mt0Var.b = 1;
        }
        vf4Var.b(hg4Var, mt0Var);
        hg4Var.K(mt0Var.e);
        hg4Var.H(mt0Var.f);
        hg4Var.E = mt0Var.h;
        int i2 = mt0Var.g;
        hg4Var.Z = i2;
        hg4Var.E = i2 > 0;
        mt0Var.j = 0;
        return mt0Var.i;
    }

    public void e(ConcurrentHashMap concurrentHashMap) {
        if (rx8.b0(((ju6) ((rs6) ((ny8) this.b).getValue())).r(), concurrentHashMap)) {
            return;
        }
        gm0.Y((String) this.a, "Failed to store initial showcase");
        ((s7f) ((et3) ((ny8) this.c).getValue())).K(0L);
    }

    public void f(ig4 ig4Var, int i, int i2, int i3) {
        int i4 = ig4Var.a0;
        int i5 = ig4Var.b0;
        ig4Var.a0 = 0;
        ig4Var.b0 = 0;
        ig4Var.K(i2);
        ig4Var.H(i3);
        if (i4 < 0) {
            ig4Var.a0 = 0;
        } else {
            ig4Var.a0 = i4;
        }
        if (i5 < 0) {
            ig4Var.b0 = 0;
        } else {
            ig4Var.b0 = i5;
        }
        ig4 ig4Var2 = (ig4) this.c;
        ig4Var2.s0 = i;
        ig4Var2.Q();
    }

    public void g(ig4 ig4Var) {
        ArrayList arrayList = (ArrayList) this.a;
        arrayList.clear();
        int size = ig4Var.p0.size();
        for (int i = 0; i < size; i++) {
            hg4 hg4Var = (hg4) ig4Var.p0.get(i);
            int[] iArr = hg4Var.o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(hg4Var);
            }
        }
        ig4Var.r0.a = true;
    }

    @Override // defpackage.qg6
    public rg6[] u(pg6[] pg6VarArr, ko0 ko0Var) {
        rg6 pecVar;
        ghe gheVarV = pec.v(pg6VarArr);
        rg6[] rg6VarArr = new rg6[pg6VarArr.length];
        for (int i = 0; i < pg6VarArr.length; i++) {
            pg6 pg6Var = pg6VarArr[i];
            if (pg6Var != null) {
                int[] iArr = pg6Var.b;
                if (iArr.length != 0) {
                    int length = iArr.length;
                    hyh hyhVar = pg6Var.a;
                    if (length == 1) {
                        pecVar = new ds5(hyhVar, iArr[0]);
                    } else {
                        c98 c98Var = (c98) gheVarV.get(i);
                        if (hyhVar.c == 2) {
                            boolean z = nec.a;
                        }
                        pecVar = new pec(hyhVar, iArr, ko0Var, c98Var, (myh) this.a, (af7) this.b, (af7) this.c, iArr);
                    }
                    rg6VarArr[i] = pecVar;
                }
            }
        }
        return rg6VarArr;
    }

    public /* synthetic */ ks6(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
