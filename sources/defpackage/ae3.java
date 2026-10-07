package defpackage;

import java.util.Iterator;
import java.util.List;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public final class ae3 extends kih {
    public final List c;
    public final boolean d;
    public final Long e;

    public ae3(List list, boolean z, Long l) {
        this.c = list;
        this.d = z;
        this.e = l;
    }

    public static final ae3 d(fka fkaVar) {
        int iU;
        String strW;
        fka fkaVar2;
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
        r66 r66Var = r66.a;
        Long l = null;
        boolean zBooleanValue = false;
        List listB = r66Var;
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
                int iHashCode = strW.hashCode();
                if (iHashCode != -1950992144) {
                    if (iHashCode != -1081306054) {
                        if (iHashCode == 696739087 && strW.equals("hasMore")) {
                            Boolean boolValueOf = Boolean.FALSE;
                            try {
                                boolValueOf = Boolean.valueOf(ch3.L(fkaVar));
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
                            zBooleanValue = boolValueOf.booleanValue();
                        }
                    } else if (strW.equals("marker")) {
                        try {
                            long jT = ch3.T(fkaVar, -1L);
                            Long lValueOf = Long.valueOf(jT);
                            if (jT < 0) {
                                lValueOf = null;
                            }
                            l = lValueOf;
                        } catch (Throwable th7) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                            Iterator it4 = fjf.a.iterator();
                            while (it4.hasNext()) {
                                AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th7);
                                    accountInitializer4.d().i().g().a(null, th7);
                                } catch (Throwable th8) {
                                    gm0.V("Payload", "failed to collect exception", th8);
                                }
                            }
                            int iD4 = qt4.D(pye.a);
                            if (iD4 != 0) {
                                if (iD4 == 1) {
                                    throw th7;
                                }
                                ore.o();
                                return null;
                            }
                            l = null;
                        }
                    }
                    fkaVar2 = fkaVar;
                    try {
                        fkaVar2.x();
                    } catch (Throwable th9) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                        Iterator it5 = fjf.a.iterator();
                        while (it5.hasNext()) {
                            AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th9);
                                accountInitializer5.d().i().g().a(null, th9);
                            } catch (Throwable th10) {
                                gm0.V("Payload", "failed to collect exception", th10);
                            }
                        }
                        int iD5 = qt4.D(pye.a);
                        if (iD5 != 0) {
                            if (iD5 == 1) {
                                throw th9;
                            }
                            ore.o();
                            return null;
                        }
                    }
                } else {
                    fkaVar2 = fkaVar;
                    if (strW.equals("commonChats")) {
                        try {
                            listB = b50.b(fkaVar2);
                        } catch (Throwable th11) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                            Iterator it6 = fjf.a.iterator();
                            while (it6.hasNext()) {
                                AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th11);
                                    accountInitializer6.d().i().g().a(null, th11);
                                } catch (Throwable th12) {
                                    gm0.V("Payload", "failed to collect exception", th12);
                                }
                            }
                            int iD6 = qt4.D(pye.a);
                            if (iD6 != 0) {
                                if (iD6 == 1) {
                                    throw th11;
                                }
                                ore.o();
                                return null;
                            }
                            listB = r66Var;
                        }
                    } else {
                        fkaVar2.x();
                    }
                }
            }
        }
        return new ae3(listB, zBooleanValue, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae3)) {
            return false;
        }
        ae3 ae3Var = (ae3) obj;
        return cqk.d(this.c, ae3Var.c) && this.d == ae3Var.d && cqk.d(this.e, ae3Var.e);
    }

    public final int hashCode() {
        int iN = nbh.n(this.c.hashCode() * 31, 31, this.d);
        Long l = this.e;
        return iN + (l == null ? 0 : l.hashCode());
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(commonChats=" + this.c + ", hasMore=" + this.d + ", marker=" + this.e + ")";
    }
}
