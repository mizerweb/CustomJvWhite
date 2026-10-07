package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class i3b extends kih {
    public final long c;
    public final LinkedHashSet d;
    public final long e;

    public i3b(long j, LinkedHashSet linkedHashSet, long j2) {
        this.c = j;
        this.d = linkedHashSet;
        this.e = j2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    public static final i3b d(fka fkaVar) {
        int iU;
        if (!fkaVar.l() || (iU = ch3.U(fkaVar)) == 0) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        long jT = 0;
        long jT2 = 0;
        for (int i = 0; i < iU; i++) {
            String strW = ch3.W(fkaVar);
            if (strW != null) {
                int iHashCode = strW.hashCode();
                if (iHashCode != -1690743503) {
                    if (iHashCode != -1361631597) {
                        if (iHashCode == -982451749 && strW.equals("postId")) {
                            try {
                                jT2 = ch3.T(fkaVar, 0L);
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
                                jT2 = 0;
                            }
                        } else {
                            fkaVar.x();
                        }
                    } else if (strW.equals(ApiProtocol.PARAM_CHAT_ID)) {
                        jT = ch3.T(fkaVar, 0L);
                    } else {
                        fkaVar.x();
                    }
                } else if (strW.equals("messageIds")) {
                    int iJ = ch3.J(fkaVar);
                    for (int i2 = 0; i2 < iJ; i2++) {
                        linkedHashSet.add(Long.valueOf(fkaVar.I0()));
                    }
                } else {
                    fkaVar.x();
                }
            }
        }
        return new i3b(jT, linkedHashSet, jT2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3b)) {
            return false;
        }
        i3b i3bVar = (i3b) obj;
        return this.c == i3bVar.c && this.d.equals(i3bVar.d) && this.e == i3bVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chatId=");
        sb.append(this.c);
        sb.append(", messageIds=");
        sb.append(this.d);
        return zo5.k(this.e, ", postId=", ")", sb);
    }
}
