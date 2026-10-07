package defpackage;

import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public final class m3b extends kih {
    public final st2 c;

    public m3b(st2 st2Var) {
        this.c = st2Var;
    }

    public static final m3b d(fka fkaVar) {
        int iU;
        String strW;
        if (!fkaVar.l()) {
            return null;
        }
        try {
            iU = ch3.U(fkaVar);
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
            iU = 0;
        }
        if (iU == 0) {
            return null;
        }
        st2 st2VarB = null;
        for (int i = 0; i < iU; i++) {
            try {
                strW = ch3.W(fkaVar);
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
                if (iD2 != 0) {
                    if (iD2 == 1) {
                        throw th3;
                    }
                    ore.o();
                    return null;
                }
                strW = null;
            }
            if (strW != null) {
                if (strW.equals("chat")) {
                    st2VarB = st2.b(fkaVar);
                } else {
                    try {
                        fkaVar.x();
                    } catch (Throwable th5) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it3 = fjf.a.iterator();
                        while (it3.hasNext()) {
                            AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th5);
                                accountInitializer3.d().i().g().a(null, th5);
                            } catch (Throwable th6) {
                                gm0.V("Payload", "failed to collect exception", th6);
                            }
                        }
                        int iD3 = qt4.D(pye.a);
                        if (iD3 != 0) {
                            if (iD3 == 1) {
                                throw th5;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        return new m3b(st2VarB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3b) && cqk.d(this.c, ((m3b) obj).c);
    }

    public final int hashCode() {
        st2 st2Var = this.c;
        if (st2Var == null) {
            return 0;
        }
        return st2Var.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(chat=" + this.c + ")";
    }
}
