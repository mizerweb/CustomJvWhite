package defpackage;

import android.app.ApplicationExitInfo;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class we6 {
    public final ye6 a;
    public final String b = we6.class.getName();
    public final ny8 c;

    public we6(ny8 ny8Var, ye6 ye6Var) {
        this.a = ye6Var;
        this.c = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    public final void a(ApplicationExitInfo applicationExitInfo) {
        Object poeVar;
        String strU1;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            poeVar = traceInputStream != null ? this.a.a(traceInputStream) : null;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "send: failed to extract trace", thA);
                }
            }
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        String str2 = (String) poeVar;
        String str3 = this.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null) {
            strU1 = null;
        } else {
            je9 je9Var2 = je9.d;
            if (a4cVar2.b(je9Var2)) {
                int reason = applicationExitInfo.getReason();
                int importance = applicationExitInfo.getImportance();
                int status = applicationExitInfo.getStatus();
                long jG = sb8.G(applicationExitInfo.getPss());
                long jG2 = sb8.G(applicationExitInfo.getRss());
                String description = applicationExitInfo.getDescription();
                String strU2 = str2 != null ? r5h.u1(1500, str2) : null;
                StringBuilder sbP = qv1.p("send:\n            |reason=", reason, "\n            |importance=", importance, "\n            |status=");
                c0a.v(sbP, status, "\n            |pssMb=", jG);
                qt4.z(jG2, "\n            |rssMb=", "\n            |description=", sbP);
                sbP.append(description);
                sbP.append("\n            |trace=");
                sbP.append(strU2);
                sbP.append("\n            ");
                strU1 = null;
                a4cVar2.c(je9Var2, str3, s5h.y0(sbP.toString()), null);
            } else {
                strU1 = null;
            }
        }
        yj5 yj5Var = (yj5) this.c.getValue();
        xj5 xj5Var = xj5.EXIT_REASON;
        float reason2 = applicationExitInfo.getReason();
        float importance2 = applicationExitInfo.getImportance();
        float status2 = applicationExitInfo.getStatus();
        float fG = sb8.G(applicationExitInfo.getPss());
        float fG2 = sb8.G(applicationExitInfo.getRss());
        String description2 = applicationExitInfo.getDescription();
        if (description2 != null) {
            strU1 = r5h.u1(200, description2);
        }
        yj5.a(yj5Var, xj5Var, reason2, importance2, status2, fG, fG2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, strU1, str2, null, null, null, null, null, -393280);
    }
}
