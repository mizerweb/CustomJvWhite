package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public final class r3b extends kih {
    public ArrayList c;
    public hja d;
    public fja e;
    public Long f;

    public r3b(fka fkaVar) {
        super(fkaVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        int iJ;
        if (str != null) {
            Long lValueOf = null;
            fja fjaVarB = null;
            switch (str.hashCode()) {
                case -1716357513:
                    if (str.equals("reactionInfo")) {
                        this.d = ftk.b(fkaVar);
                        return;
                    }
                    break;
                case -1370485892:
                    if (str.equals("yourReaction")) {
                        try {
                            fjaVarB = etk.b(fkaVar);
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
                        this.e = fjaVarB;
                        return;
                    }
                    break;
                case -1122997398:
                    if (str.equals("reactions")) {
                        try {
                            iJ = ch3.J(fkaVar);
                            break;
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
                                return;
                            }
                            iJ = 0;
                        }
                        if (iJ == 0) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < iJ; i++) {
                            arrayList.add(etk.b(fkaVar));
                        }
                        this.c = arrayList;
                        return;
                    }
                    break;
                case -1081306054:
                    if (str.equals("marker")) {
                        try {
                            lValueOf = Long.valueOf(ch3.T(fkaVar, 0L));
                            break;
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
                                return;
                            }
                        }
                        this.f = lValueOf;
                        return;
                    }
                    break;
            }
        }
        fkaVar.x();
    }

    @Override // defpackage.sq0
    public final String toString() {
        ArrayList arrayList = this.c;
        return "MsgGetDetailedReactionsCmd, reactions = " + (arrayList != null ? ww3.z1(arrayList, null, null, null, new s9a(14), 31) : null) + " + " + this.d + " + " + this.e + " + " + this.f;
    }
}
