package defpackage;

import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class dae {
    public final long a;
    public final cae b;
    public final String c;

    public dae(long j, cae caeVar, String str) {
        this.a = j;
        this.b = caeVar;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final dae a(fka fkaVar) {
        int iU;
        String strX;
        int i;
        Object next;
        int i2 = 1;
        int i3 = 0;
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
        cae caeVar = cae.UNKNOWN;
        String strX2 = null;
        cae caeVar2 = caeVar;
        long jT = 0;
        while (i3 < iU) {
            try {
                strX = ch3.X(fkaVar, null);
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
                    if (iD2 == i2) {
                        throw th3;
                    }
                    ore.o();
                    return null;
                }
                strX = null;
            }
            if (strX == null) {
                i = i2;
            } else {
                int iHashCode = strX.hashCode();
                if (iHashCode != 3355) {
                    if (iHashCode != 3575610) {
                        if (iHashCode == 111972721 && strX.equals(SdkMetricStatEvent.VALUE_KEY)) {
                            try {
                                strX2 = ch3.X(fkaVar, null);
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
                                    if (iD3 == i2) {
                                        throw th5;
                                    }
                                    ore.o();
                                    return null;
                                }
                                strX2 = null;
                            }
                        } else {
                            try {
                                fkaVar.x();
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
                            }
                        }
                    } else if (strX.equals("type")) {
                        try {
                            String strW = ch3.W(fkaVar);
                            Iterator it5 = cae.f.iterator();
                            do {
                                if (!it5.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it5.next();
                            } while (!((cae) next).a.equals(strW));
                            cae caeVar3 = (cae) next;
                            if (caeVar3 == null) {
                                caeVar3 = caeVar;
                            }
                            caeVar2 = caeVar3;
                        } catch (Throwable th9) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                            Iterator it6 = fjf.a.iterator();
                            while (it6.hasNext()) {
                                AccountInitializer accountInitializer5 = ((n6) it6.next()).a;
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
                            caeVar2 = caeVar;
                        }
                    } else {
                        fkaVar.x();
                    }
                } else if (strX.equals("id")) {
                    try {
                        jT = ch3.T(fkaVar, 0L);
                    } catch (Throwable th11) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                        Iterator it7 = fjf.a.iterator();
                        while (it7.hasNext()) {
                            AccountInitializer accountInitializer6 = ((n6) it7.next()).a;
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
                    }
                } else {
                    fkaVar.x();
                }
                i = 1;
            }
            i3++;
            i2 = i;
        }
        cae caeVar4 = caeVar2;
        String str = strX2;
        if (jT == 0 && caeVar4 == caeVar && str == null) {
            return null;
        }
        return new dae(jT, caeVar4, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dae)) {
            return false;
        }
        dae daeVar = (dae) obj;
        return this.a == daeVar.a && this.b == daeVar.b && cqk.d(this.c, daeVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentEmojiItem(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        return qt4.q(sb, ", value=", this.c, ")");
    }
}
