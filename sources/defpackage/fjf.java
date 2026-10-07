package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class fjf {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public static final List a(fka fkaVar, List list, cf7 cf7Var) {
        int iJ;
        CopyOnWriteArraySet copyOnWriteArraySet = a;
        try {
            if (fkaVar.y().a() == 7) {
                ArrayList arrayList = new ArrayList();
                try {
                    iJ = ch3.J(fkaVar);
                } catch (Throwable th) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                    Iterator it = copyOnWriteArraySet.iterator();
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
                for (int i = 0; i < iJ; i++) {
                    Object objInvoke = cf7Var.invoke(fkaVar);
                    if (objInvoke != null) {
                        arrayList.add(objInvoke);
                    }
                }
                list = arrayList;
            } else {
                fkaVar.x();
            }
        } catch (Throwable th3) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
            Iterator it2 = copyOnWriteArraySet.iterator();
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
        }
        return list;
    }

    public static /* synthetic */ List b(fka fkaVar, cf7 cf7Var) {
        return a(fkaVar, r66.a, cf7Var);
    }

    public static final long[] c(fka fkaVar) {
        int iJ;
        CopyOnWriteArraySet copyOnWriteArraySet = a;
        try {
            try {
                iJ = ch3.J(fkaVar);
            } catch (Throwable th) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = copyOnWriteArraySet.iterator();
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
            if (iJ == 0) {
                return null;
            }
            long[] jArr = new long[iJ];
            for (int i = 0; i < iJ; i++) {
                jArr[i] = ch3.T(fkaVar, 0L);
            }
            return jArr;
        } catch (Throwable th3) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
            Iterator it2 = copyOnWriteArraySet.iterator();
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
                return null;
            }
            if (iD2 == 1) {
                throw th3;
            }
            ore.o();
            return null;
        }
    }

    public static final l8b d(fka fkaVar) {
        int iU;
        CopyOnWriteArraySet copyOnWriteArraySet = a;
        if (fkaVar.y().a() != 8) {
            return null;
        }
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = copyOnWriteArraySet.iterator();
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
            return ki9.a;
        }
        l8b l8bVar = new l8b(iU);
        for (int i = 0; i < iU; i++) {
            long jT = -1;
            try {
                jT = ch3.T(fkaVar, -1L);
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = copyOnWriteArraySet.iterator();
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
            }
            if (jT == -1) {
                try {
                    fkaVar.x();
                } catch (Throwable th5) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                    Iterator it3 = copyOnWriteArraySet.iterator();
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
            } else {
                rfd rfdVarI = p90.I(fkaVar);
                if (rfdVarI != null) {
                    l8bVar.l(jT, rfdVarI);
                }
            }
        }
        return l8bVar;
    }
}
