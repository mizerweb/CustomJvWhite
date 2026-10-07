package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class lkb extends kih {
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final List g;

    public lkb(long j, long j2, long j3, int i, List list) {
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = list;
    }

    /* JADX WARN: Code duplicated, block: B:217:0x026f A[EXC_TOP_SPLITTER, PHI: r2
  0x026f: PHI (r2v19 java.lang.Long) = 
  (r2v3 java.lang.Long)
  (r2v4 java.lang.Long)
  (r2v6 java.lang.Long)
  (r2v9 java.lang.Long)
  (r2v15 java.lang.Long)
  (r2v20 java.lang.Long)
 binds: [B:156:0x026d, B:133:0x0211, B:277:?, B:276:?, B:275:?, B:51:0x00c9] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static final lkb d(fka fkaVar) throws Throwable {
        int iU;
        String strW;
        Long l;
        long j;
        Long lValueOf;
        Long lValueOf2;
        Object obj;
        Long l2 = 0L;
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
        long jLongValue = 0;
        long jT = 0;
        long jLongValue2 = 0;
        Object obj2 = r66Var;
        int i = 0;
        int iIntValue = 0;
        while (i < iU) {
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
                switch (strW.hashCode()) {
                    case -1440013438:
                        l = l2;
                        if (strW.equals("messageId")) {
                            j = 0;
                            try {
                                lValueOf = Long.valueOf(ch3.T(fkaVar, 0L));
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
                                lValueOf = l;
                            }
                            jLongValue2 = lValueOf.longValue();
                        } else {
                            try {
                                fkaVar.x();
                                obj2 = obj2;
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
                                obj2 = obj2;
                                if (iD4 != 0) {
                                    if (iD4 == 1) {
                                        throw th7;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                            j = 0;
                        }
                        break;
                    case -1361631597:
                        l = l2;
                        if (!strW.equals(ApiProtocol.PARAM_CHAT_ID)) {
                            fkaVar.x();
                            obj2 = obj2;
                        } else {
                            try {
                                lValueOf2 = Long.valueOf(ch3.T(fkaVar, 0L));
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
                                lValueOf2 = l;
                            }
                            jLongValue = lValueOf2.longValue();
                            obj2 = obj2;
                        }
                        j = 0;
                        break;
                    case -982451749:
                        if (!strW.equals("postId")) {
                            l = l2;
                            fkaVar.x();
                            obj2 = obj2;
                        } else {
                            l = l2;
                            try {
                                jT = ch3.T(fkaVar, 0L);
                                obj2 = obj2;
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
                                jT = 0;
                                obj2 = obj2;
                            }
                        }
                        j = 0;
                        break;
                    case -731385813:
                        if (strW.equals("totalCount")) {
                            Integer numValueOf = 0;
                            try {
                                numValueOf = Integer.valueOf(ch3.R(fkaVar, 0));
                            } catch (Throwable th13) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                                Iterator it7 = fjf.a.iterator();
                                while (it7.hasNext()) {
                                    AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th13);
                                        accountInitializer7.d().i().g().a(null, th13);
                                    } catch (Throwable th14) {
                                        gm0.V("Payload", "failed to collect exception", th14);
                                    }
                                }
                                int iD7 = qt4.D(pye.a);
                                if (iD7 != 0) {
                                    if (iD7 == 1) {
                                        throw th13;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                            iIntValue = numValueOf.intValue();
                            l = l2;
                            obj2 = obj2;
                            j = 0;
                        } else {
                            l = l2;
                            fkaVar.x();
                            obj2 = obj2;
                            j = 0;
                        }
                        break;
                    case -372020745:
                        if (strW.equals("counters")) {
                            try {
                                if (fkaVar.y().a() == 7) {
                                    ArrayList arrayList = new ArrayList();
                                    int iT0 = fkaVar.t0();
                                    for (int i2 = 0; i2 < iT0; i2++) {
                                        try {
                                            arrayList.add(btk.b(fkaVar));
                                        } catch (Throwable th15) {
                                            th = th15;
                                            Throwable th16 = th;
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th16);
                                            Iterator it8 = fjf.a.iterator();
                                            while (it8.hasNext()) {
                                                AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th16);
                                                    accountInitializer8.d().i().g().a(null, th16);
                                                } catch (Throwable th17) {
                                                    gm0.V("Payload", "failed to collect exception", th17);
                                                }
                                            }
                                            int iD8 = qt4.D(pye.a);
                                            if (iD8 != 0) {
                                                if (iD8 == 1) {
                                                    throw th16;
                                                }
                                                ore.o();
                                                return null;
                                            }
                                            obj2 = r66Var;
                                            l = l2;
                                            obj2 = obj2;
                                            j = 0;
                                            i++;
                                            l2 = l;
                                            obj2 = obj2;
                                        }
                                        break;
                                    }
                                    obj = arrayList;
                                } else {
                                    fkaVar.x();
                                    obj = null;
                                }
                                if (obj == null) {
                                    obj = r66Var;
                                }
                                obj2 = obj;
                            } catch (Throwable th18) {
                                th = th18;
                            }
                            l = l2;
                            obj2 = obj2;
                            j = 0;
                        } else {
                            l = l2;
                            fkaVar.x();
                            obj2 = obj2;
                            j = 0;
                        }
                        break;
                    default:
                        l = l2;
                        fkaVar.x();
                        obj2 = obj2;
                        j = 0;
                        break;
                }
            } else {
                l = l2;
                obj2 = obj2;
                j = 0;
            }
            i++;
            l2 = l;
            obj2 = obj2;
        }
        return new lkb(jLongValue, jT, jLongValue2, iIntValue, (List) obj2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkb)) {
            return false;
        }
        lkb lkbVar = (lkb) obj;
        return this.c == lkbVar.c && this.d == lkbVar.d && this.e == lkbVar.e && this.f == lkbVar.f && cqk.d(this.g, lkbVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + zo5.c(this.f, qt4.g(qt4.g(Long.hashCode(this.c) * 31, 31, this.d), 31, this.e), 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        int size = this.g.size();
        StringBuilder sbS = qt4.s(this.c, "{chatId=", ", postId=");
        sbS.append(this.d);
        qt4.z(this.e, ", messageId=", ", totalCount=", sbS);
        sbS.append(this.f);
        sbS.append(", counters count=");
        sbS.append(size);
        sbS.append(" }");
        return sbS.toString();
    }
}
