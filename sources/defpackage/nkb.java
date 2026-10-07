package defpackage;

import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class nkb extends kih {
    public long c;
    public long d;
    public long e;
    public hja f;

    public nkb(fka fkaVar) {
        super(fkaVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        long jT = 0;
        switch (str.hashCode()) {
            case -1716357513:
                if (str.equals("reactionInfo")) {
                    this.f = ftk.b(fkaVar);
                    return;
                }
                break;
            case -1440013438:
                if (str.equals("messageId")) {
                    this.e = ch3.T(fkaVar, 0L);
                    return;
                }
                break;
            case -1361631597:
                if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    this.c = ch3.T(fkaVar, 0L);
                    return;
                }
                break;
            case -982451749:
                if (str.equals("postId")) {
                    try {
                        jT = ch3.T(fkaVar, 0L);
                        break;
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
                            return;
                        }
                    }
                    this.d = jT;
                    return;
                }
                break;
        }
        fkaVar.x();
    }

    @Override // defpackage.sq0
    public final String toString() {
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        hja hjaVar = this.f;
        Integer numValueOf = hjaVar != null ? Integer.valueOf(hjaVar.a.size()) : null;
        StringBuilder sbS = qt4.s(j, "{chatId=", ", postId=");
        sbS.append(j2);
        qt4.z(j3, ", messageId=", ", reactionInfo = ", sbS);
        sbS.append(numValueOf);
        sbS.append(" }");
        return sbS.toString();
    }
}
