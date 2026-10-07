package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public final class fz2 extends kih {
    public final List c;
    public final st2 d;
    public final LinkedHashSet e;

    public fz2(List list, st2 st2Var, LinkedHashSet linkedHashSet) {
        this.c = list;
        this.d = st2Var;
        this.e = linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final fz2 k(fka fkaVar) {
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
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listA = r66.a;
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
                int iHashCode = strW.hashCode();
                if (iHashCode != -1690743503) {
                    if (iHashCode != -462094004) {
                        if (iHashCode == 3052376 && strW.equals("chat")) {
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
                    } else if (strW.equals("messages")) {
                        listA = hm4.a(fkaVar);
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
        return new fz2(listA, st2VarB, linkedHashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz2)) {
            return false;
        }
        fz2 fz2Var = (fz2) obj;
        return cqk.d(this.c, fz2Var.c) && cqk.d(this.d, fz2Var.d) && this.e.equals(fz2Var.e);
    }

    public final st2 h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        st2 st2Var = this.d;
        return this.e.hashCode() + ((iHashCode + (st2Var == null ? 0 : st2Var.hashCode())) * 31);
    }

    public final List i() {
        return this.c;
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatHistory.Response(messages=");
        List list = this.c;
        sb.append(ww3.z1(list, ",", "[", "]", new xk1(19), 24));
        sb.append(", chat=");
        sb.append(this.d);
        if (list.isEmpty()) {
            sb.append(", messageIds=");
            sb.append(this.e);
        }
        sb.append(")");
        return sb.toString();
    }
}
