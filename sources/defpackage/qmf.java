package defpackage;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.util.ArrayList;
import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class qmf extends aq implements qih {
    public final String f;

    public qmf(long j) {
        super(j);
        this.f = qmf.class.getName();
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        Object value;
        smf smfVar = (smf) kihVar;
        g5d g5dVarB = t().b.b();
        int i = smfVar.d;
        b5d b5dVar = g5dVarB.a.w;
        zv8[] zv8VarArr = e5d.S6;
        b5dVar.a(zv8VarArr[14]).a(Integer.valueOf(i));
        t().b.x.a(zv8VarArr[15]).j(smfVar.f);
        if (smfVar.d == 1) {
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            cxb cxbVar = (cxb) bqVar.i.getValue();
            et3 et3Var = cxbVar.b;
            cxbVar.d.getClass();
            xb9 xb9Var = (xb9) et3Var;
            xb9Var.B0.B(xb9Var, xb9.g1[18], "26.28.0");
            bq bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = null;
            }
            ((cxb) bqVar2.i.getValue()).b();
            bq bqVar3 = this.e;
            if (bqVar3 == null) {
                bqVar3 = null;
            }
            rg9 rg9Var = bqVar3.a;
            mg9 mg9Var = mg9.SESSION_FORCE_UPDATE;
            rg9 rg9Var2 = rg9.i;
            rg9Var.D(mg9Var, null);
            return;
        }
        if (smfVar.c != null) {
            xb9 xb9Var2 = t().a;
            xb9Var2.n0.B(xb9Var2, xb9.g1[2], smfVar.c);
        }
        if (!(smfVar.e == null ? Collections.EMPTY_LIST : new ArrayList(smfVar.e)).isEmpty()) {
            bq bqVar4 = this.e;
            if (bqVar4 == null) {
                bqVar4 = null;
            }
            tu4 tu4Var = (tu4) bqVar4.o0.getValue();
            Object arrayList = smfVar.e == null ? Collections.EMPTY_LIST : new ArrayList(smfVar.e);
            mjg mjgVar = tu4Var.a;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, arrayList));
        }
        if (smfVar.i) {
            bq bqVar5 = this.e;
            if (bqVar5 == null) {
                bqVar5 = null;
            }
            ((gbj) bqVar5.q0.getValue()).c(smfVar.i);
        }
        bq bqVar6 = this.e;
        if (bqVar6 == null) {
            bqVar6 = null;
        }
        String strC = ((svb) bqVar6.f.getValue()).c();
        bq bqVar7 = this.e;
        if (bqVar7 == null) {
            bqVar7 = null;
        }
        rg9 rg9Var3 = bqVar7.a;
        String str = rg9Var3.g;
        owh owhVar = str != null ? new owh(str) : null;
        String str2 = owhVar != null ? owhVar.a : null;
        if (str2 == null) {
            String str3 = rg9Var3.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str3, "Invoked 'onSessionInitHandled', but traceId is null or empty!", null);
                }
            }
        } else {
            qrc.k(rg9.i, "session_init_handled", 5, str2, false, null, null, 120);
        }
        if (strC == null || strC.length() == 0) {
            return;
        }
        gm0.n(this.f, "SessionInit: Send Login command");
        bq bqVar8 = this.e;
        if (bqVar8 == null) {
            bqVar8 = null;
        }
        byte[] bArrA = ((qj8) bqVar8.k.getValue()).a(smfVar.g);
        bq bqVar9 = this.e;
        jg9 jg9Var = (jg9) (bqVar9 != null ? bqVar9 : null).j.getValue();
        int i2 = smfVar.h;
        Long l = smfVar.g;
        rvb rvbVar = (rvb) jg9Var.D.getValue();
        sih.b(rvbVar.a(), new kf9(((s7f) ((et3) rvbVar.b.getValue())).g(), i2, l, bArrA, null));
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        ((tmf) bqVar.h.getValue()).a(this.a, yhhVar);
    }

    @Override // defpackage.aq
    public final Object m() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        tmi tmiVarA = ((umi) bqVar.s0.getValue()).a();
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        String strA = ((ek5) bqVar2.r0.getValue()).a();
        long jY = t().a.Y();
        bq bqVar3 = this.e;
        if (bqVar3 == null) {
            bqVar3 = null;
        }
        String str = (String) ((ek5) bqVar3.r0.getValue()).f.get();
        rmf rmfVar = new rmf(null);
        mw mwVar = new mw(0);
        mwVar.put("deviceType", tmiVarA.a);
        syd sydVar = tmiVarA.j;
        if (sydVar != null) {
            mwVar.put("pushDeviceType", sydVar.a);
        }
        mwVar.put("appVersion", tmiVarA.b);
        mwVar.put("arch", tmiVarA.e);
        mwVar.put("buildNumber", Integer.valueOf(tmiVarA.c));
        mwVar.put("osVersion", tmiVarA.d);
        mwVar.put("locale", tmiVarA.f);
        mwVar.put("deviceLocale", tmiVarA.g);
        mwVar.put("deviceName", tmiVarA.h);
        mwVar.put("screen", tmiVarA.i);
        mwVar.put(AnalyticsBaseParamsConstantsKt.TIMEZONE, tmiVarA.k.getID());
        rmfVar.g("userAgent", mwVar);
        rmfVar.h(ApiProtocol.PARAM_DEVICE_ID, strA);
        rmfVar.f(jY, "clientSessionId");
        if (ch3.s(str)) {
            rmfVar.h("mt_instanceid", str);
        }
        return rmfVar;
    }
}
