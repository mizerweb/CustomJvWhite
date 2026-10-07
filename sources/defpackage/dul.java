package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.logger.LoggerProvider;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

/* JADX INFO: loaded from: classes2.dex */
public final class dul implements hu8, ua4, nsi, k74, iih, xb8, ze9, sf7, LoggerProvider, j8h, c4b, ut3, qmc, zx7, io6, cs7 {
    public static dul b;
    public static volatile gik o;
    public final /* synthetic */ int a;
    public static final dul c = new dul(1);
    public static final dul d = new dul(2);
    public static final dul e = new dul(3);
    public static final dul f = new dul(4);
    public static final n11 g = new n11(false, (Object) us0.e, 5);
    public static final dul h = new dul(6);
    public static final dul i = new dul(8);
    public static final dul j = new dul(9);
    public static final dul k = new dul(10);
    public static final dul l = new dul(11);
    public static final dul m = new dul(12);
    public static final dul n = new dul(13);
    public static final /* synthetic */ dul p = new dul(14);

    public /* synthetic */ dul(int i2) {
        this.a = i2;
    }

    public static synchronized void A() {
        if (b == null) {
            b = new dul(0);
        }
    }

    public static gik w() {
        gik gikVar = o;
        if (gikVar != null) {
            return gikVar;
        }
        ore.k("ConfigModule.init() must be called before accessing its members");
        return null;
    }

    public static n47 x(Long l2, Long l3, String str, String str2) {
        if (str != null && str.length() != 0) {
            return new m47(str);
        }
        if (l2 != null) {
            return new l47(l2.longValue(), str2, l3);
        }
        return null;
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        return ch3.m((Executor) ((g85) h74Var).i(new x0e(yl0.class, Executor.class)));
    }

    @Override // defpackage.ut3
    public void a(String str) {
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        switch (this.a) {
            case 12:
                return new xgc((ConversationParams) obj);
            default:
                Object[] objArr = (Object[]) obj;
                if (objArr.length != 3) {
                    qr7.p(objArr.length, "Array of size 3 expected but got ");
                    return null;
                }
                xgc xgcVar = (xgc) objArr[0];
                Set set = (Set) objArr[1];
                return new ffd(xgcVar.b() ? (ConversationParams) xgcVar.a() : null, ww3.X1(ww3.o1(set)));
        }
    }

    @Override // defpackage.ze9
    public void b(String str, af7 af7Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, (String) af7Var.invoke(), null);
        }
    }

    @Override // defpackage.cs7
    public String c(int i2) {
        return "RSASSA-PSS";
    }

    @Override // defpackage.ut3
    public void close() {
    }

    @Override // defpackage.iih
    public long d(int i2, long j2, float f2) {
        long j3;
        if (j2 <= 0) {
            return System.currentTimeMillis();
        }
        if (i2 > 10) {
            j3 = 300000;
        } else {
            gm0.m("dul", "errorCount = %d^2 * 3 * 1000", Integer.valueOf(i2));
            j3 = i2 * i2 * 3000;
        }
        return j2 + j3;
    }

    @Override // defpackage.ua4
    public void e(x76 x76Var) {
        xe0 xe0Var = xe0.a;
        x76Var.h(eu0.class, xe0Var);
        x76Var.h(vg0.class, xe0Var);
        af0 af0Var = af0.a;
        x76Var.h(le9.class, af0Var);
        x76Var.h(zh0.class, af0Var);
        ye0 ye0Var = ye0.a;
        x76Var.h(ct3.class, ye0Var);
        x76Var.h(ah0.class, ye0Var);
        we0 we0Var = we0.a;
        x76Var.h(pg.class, we0Var);
        x76Var.h(ng0.class, we0Var);
        ze0 ze0Var = ze0.a;
        x76Var.h(ge9.class, ze0Var);
        x76Var.h(yh0.class, ze0Var);
        bf0 bf0Var = bf0.a;
        x76Var.h(tcb.class, bf0Var);
        x76Var.h(di0.class, bf0Var);
    }

    @Override // defpackage.ze9
    public void f(String str, af7 af7Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, (String) af7Var.invoke(), null);
        }
    }

    @Override // defpackage.zx7
    public qmc g(wx7 wx7Var, sx7 sx7Var) {
        return new yx7(wx7Var, sx7Var);
    }

    @Override // defpackage.c4b
    public Object h(fka fkaVar) {
        long jT = 0;
        try {
            jT = ch3.T(fkaVar, 0L);
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = fjf.a.iterator();
            while (it.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th);
                    accountInitializer.d().i().g().a(null, th);
                } catch (Throwable th2) {
                    gm0.V("Payload", "failed to collect exception", th2);
                }
            }
            int iD = qt4.D(pye.a);
            if (iD != 0) {
                if (iD == 1) {
                    throw th;
                }
                ore.o();
                return null;
            }
        }
        return Long.valueOf(jT);
    }

    @Override // defpackage.j8h
    public Task i(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = ove.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? gwl.e(bundle) : gwl.e(null);
    }

    @Override // defpackage.ze9
    public void j(String str, af7 af7Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.c;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, (String) af7Var.invoke(), null);
        }
    }

    @Override // defpackage.ze9
    public void k(String str, af7 af7Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, (String) af7Var.invoke(), null);
        }
    }

    @Override // defpackage.xb8
    public void l(wf5 wf5Var) {
    }

    @Override // defpackage.ze9
    public void m(String str, af7 af7Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.e;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, (String) af7Var.invoke(), null);
        }
    }

    @Override // defpackage.qmc
    public Object n(Uri uri, x25 x25Var) {
        return Long.valueOf(vqi.a0(new BufferedReader(new InputStreamReader(x25Var)).readLine()));
    }

    @Override // defpackage.zx7
    public qmc o() {
        return new yx7();
    }

    @Override // defpackage.io6
    public boolean p(lmf lmfVar) {
        return false;
    }

    @Override // defpackage.hu8
    public Object parse(vu8 vu8Var) throws JsonParseException {
        vu8Var.p();
        String strF = null;
        String strF2 = null;
        while (vu8Var.hasNext()) {
            String strName = vu8Var.name();
            int iHashCode = strName.hashCode();
            if (iHashCode != -22145738) {
                if (iHashCode == 438353305 && strName.equals("session_secret_key")) {
                    strF2 = vu8Var.F();
                } else {
                    vu8Var.x();
                }
            } else if (strName.equals("session_key")) {
                strF = vu8Var.F();
            } else {
                vu8Var.x();
            }
        }
        vu8Var.t();
        if (strF == null) {
            throw new JsonParseException("No sessionKey");
        }
        if (strF2 != null) {
            return new un(strF, strF2);
        }
        throw new JsonParseException("No sessionSecretKey");
    }

    @Override // com.vk.push.common.logger.LoggerProvider
    public Logger provideLogger() {
        gik gikVar = o;
        return gikVar != null ? gikVar.c : new DefaultLogger("VkpnsClientSdk");
    }

    @Override // defpackage.ut3
    public void q() {
    }

    @Override // defpackage.ze9
    public void r(String str, af7 af7Var, af7 af7Var2) {
        Throwable th = (Throwable) af7Var2.invoke();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, (String) af7Var.invoke(), th);
        }
    }

    @Override // defpackage.ze9
    public void s(String str, af7 af7Var, af7 af7Var2) {
        Throwable th = (Throwable) af7Var2.invoke();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, (String) af7Var.invoke(), th);
        }
    }

    @Override // defpackage.xb8
    public void t() {
    }

    @Override // defpackage.xb8
    public void u(int i2, wf5 wf5Var, ze2 ze2Var) {
    }

    @Override // defpackage.nsi
    public long v(kbc kbcVar) {
        switch (this.a) {
            case 3:
                break;
        }
        return rx8.q(-1, kbcVar.getIcon().h);
    }

    @Override // defpackage.ze9
    public void y(af7 af7Var, af7 af7Var2) {
        gm0.x("UploadTask", (String) af7Var.invoke(), (Throwable) af7Var2.invoke());
    }

    public fo5 z(Context context) {
        fo5 fo5Var;
        fo5 fo5Var2 = fo5.k;
        if (fo5Var2 != null) {
            return fo5Var2;
        }
        synchronized (this) {
            fo5Var = fo5.k;
            if (fo5Var == null) {
                fo5Var = new fo5(jq4.a(context));
                fo5.k = fo5Var;
            }
        }
        return fo5Var;
    }
}
