package defpackage;

import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public final class p3b extends kih {
    public final gda c;

    public p3b(gda gdaVar) {
        this.c = gdaVar;
    }

    public static final p3b d(fka fkaVar) {
        String strX;
        if (!fkaVar.l()) {
            return null;
        }
        int iP0 = fkaVar.P0();
        gda gdaVarQ0 = null;
        for (int i = 0; i < iP0; i++) {
            try {
                strX = ch3.X(fkaVar, null);
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
                strX = null;
            }
            if (strX != null) {
                if (strX.equals("message")) {
                    gdaVarQ0 = yab.q0(fkaVar);
                } else {
                    fkaVar.x();
                }
            }
        }
        return new p3b(gdaVarQ0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3b) && cqk.d(this.c, ((p3b) obj).c);
    }

    public final int hashCode() {
        gda gdaVar = this.c;
        if (gdaVar == null) {
            return 0;
        }
        return gdaVar.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(message=" + this.c + ")";
    }
}
