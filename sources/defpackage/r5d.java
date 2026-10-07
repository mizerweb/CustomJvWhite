package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes2.dex */
public final class r5d {
    public final String a;
    public final int b;

    public r5d(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static final u8b a(fka fkaVar) {
        int iJ;
        u8b u8bVar = cqb.b;
        try {
            if (fkaVar.y().a() != 7) {
                fkaVar.x();
                return u8bVar;
            }
            try {
                iJ = ch3.J(fkaVar);
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
                    if (iD != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th;
                }
                iJ = 0;
            }
            u8b u8bVar2 = new u8b(iJ);
            for (int i = 0; i < iJ; i++) {
                r5d r5dVarA = bjl.a(fkaVar);
                if (r5dVarA != null) {
                    u8bVar2.b(r5dVarA);
                }
            }
            return u8bVar2;
        } catch (Throwable th3) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
            Iterator it2 = fjf.a.iterator();
            while (it2.hasNext()) {
                AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th3);
                    accountInitializer2.d().i().g().a(null, th3);
                } catch (Throwable th4) {
                    gm0.V("Payload", "failed to collect exception", th4);
                }
            }
            int iD2 = qt4.D(pye.a);
            if (iD2 == 0) {
                return u8bVar;
            }
            if (iD2 == 1) {
                throw th3;
            }
            ore.o();
            return null;
        }
    }
}
