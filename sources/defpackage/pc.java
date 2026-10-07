package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public final class pc {
    public final long a;
    public final int b;
    public final long c;
    public final String d;

    public pc(int i, long j, long j2, String str) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0283 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #5 {all -> 0x00a6, blocks: (B:167:0x0274, B:168:0x027d, B:170:0x0283, B:174:0x029f, B:175:0x02a3, B:178:0x02ad, B:179:0x02b2, B:180:0x02b3, B:27:0x0067, B:28:0x0070, B:30:0x0076, B:34:0x0092, B:35:0x0096, B:38:0x00a0, B:39:0x00a5, B:42:0x00aa, B:23:0x0060, B:31:0x007e, B:171:0x028b), top: B:209:0x0274, inners: #4, #11, #18 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ad A[Catch: all -> 0x00a6, TryCatch #5 {all -> 0x00a6, blocks: (B:167:0x0274, B:168:0x027d, B:170:0x0283, B:174:0x029f, B:175:0x02a3, B:178:0x02ad, B:179:0x02b2, B:180:0x02b3, B:27:0x0067, B:28:0x0070, B:30:0x0076, B:34:0x0092, B:35:0x0096, B:38:0x00a0, B:39:0x00a5, B:42:0x00aa, B:23:0x0060, B:31:0x007e, B:171:0x028b), top: B:209:0x0274, inners: #4, #11, #18 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x02b3 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #5 {all -> 0x00a6, blocks: (B:167:0x0274, B:168:0x027d, B:170:0x0283, B:174:0x029f, B:175:0x02a3, B:178:0x02ad, B:179:0x02b2, B:180:0x02b3, B:27:0x0067, B:28:0x0070, B:30:0x0076, B:34:0x0092, B:35:0x0096, B:38:0x00a0, B:39:0x00a5, B:42:0x00aa, B:23:0x0060, B:31:0x007e, B:171:0x028b), top: B:209:0x0274, inners: #4, #11, #18 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x02b6 A[SYNTHETIC] */
    public static final pc a(fka fkaVar) {
        int iU;
        String strX;
        Throwable th;
        Iterator it;
        int iD;
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th2) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it2 = fjf.a.iterator();
            while (it2.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it2.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th2);
                    accountInitializer.d().i().g().a(null, th2);
                } catch (Throwable th3) {
                    gm0.V("Payload", "failed to collect exception", th3);
                }
            }
            int iD2 = qt4.D(pye.a);
            if (iD2 != 0) {
                if (iD2 == 1) {
                    throw th2;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        int iR = 0;
        String strX2 = null;
        long jT = 0;
        long jT2 = 0;
        for (int i = 0; i < iU; i++) {
            try {
                strX = ch3.X(fkaVar, null);
            } catch (Throwable th4) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it3 = fjf.a.iterator();
                while (it3.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it3.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th4);
                        accountInitializer2.d().i().g().a(null, th4);
                    } catch (Throwable th5) {
                        gm0.V("Payload", "failed to collect exception", th5);
                    }
                }
                int iD3 = qt4.D(pye.a);
                if (iD3 != 0) {
                    if (iD3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th4;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    int iHashCode = strX.hashCode();
                    try {
                        if (iHashCode != -1900987004) {
                            if (iHashCode != 3355) {
                                if (iHashCode != 92902992) {
                                    if (iHashCode == 1133704324) {
                                        try {
                                            if (strX.equals("permissions")) {
                                                try {
                                                    iR = ch3.R(fkaVar, 0);
                                                } catch (Throwable th6) {
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                                    Iterator it4 = fjf.a.iterator();
                                                    while (it4.hasNext()) {
                                                        AccountInitializer accountInitializer3 = ((n6) it4.next()).a;
                                                        try {
                                                            gm0.V("Payload", "error while parse payload", th6);
                                                            accountInitializer3.d().i().g().a(null, th6);
                                                        } catch (Throwable th7) {
                                                            gm0.V("Payload", "failed to collect exception", th7);
                                                        }
                                                    }
                                                    int iD4 = qt4.D(pye.a);
                                                    if (iD4 != 0) {
                                                        if (iD4 != 1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th6;
                                                    }
                                                    iR = 0;
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            try {
                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                it = fjf.a.iterator();
                                                while (it.hasNext()) {
                                                    AccountInitializer accountInitializer4 = ((n6) it.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th);
                                                        accountInitializer4.d().i().g().a(null, th);
                                                    } catch (Throwable th9) {
                                                        gm0.V("Payload", "failed to collect exception", th9);
                                                    }
                                                }
                                                iD = qt4.D(pye.a);
                                                if (iD != 0) {
                                                    if (iD != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th10) {
                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                                Iterator it5 = fjf.a.iterator();
                                                while (it5.hasNext()) {
                                                    AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th10);
                                                        accountInitializer5.d().i().g().a(null, th10);
                                                    } catch (Throwable th11) {
                                                        gm0.V("Payload", "failed to collect exception", th11);
                                                    }
                                                }
                                                int iD5 = qt4.D(pye.a);
                                                if (iD5 != 0) {
                                                    if (iD5 == 1) {
                                                        throw th10;
                                                    }
                                                    ore.o();
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                } else if (strX.equals("alias")) {
                                    try {
                                        strX2 = ch3.X(fkaVar, null);
                                    } catch (Throwable th12) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                                        Iterator it6 = fjf.a.iterator();
                                        while (it6.hasNext()) {
                                            AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th12);
                                                accountInitializer6.d().i().g().a(null, th12);
                                            } catch (Throwable th13) {
                                                gm0.V("Payload", "failed to collect exception", th13);
                                            }
                                        }
                                        int iD6 = qt4.D(pye.a);
                                        if (iD6 != 0) {
                                            if (iD6 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th12;
                                        }
                                        strX2 = null;
                                    }
                                }
                            } else if (strX.equals("id")) {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
                                } catch (Throwable th14) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th14);
                                    Iterator it7 = fjf.a.iterator();
                                    while (it7.hasNext()) {
                                        AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th14);
                                            accountInitializer7.d().i().g().a(null, th14);
                                        } catch (Throwable th15) {
                                            gm0.V("Payload", "failed to collect exception", th15);
                                        }
                                    }
                                    int iD7 = qt4.D(pye.a);
                                    if (iD7 != 0) {
                                        if (iD7 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th14;
                                    }
                                    jT = 0;
                                }
                            }
                        } else if (strX.equals("inviterId")) {
                            try {
                                jT2 = ch3.T(fkaVar, 0L);
                            } catch (Throwable th16) {
                                try {
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
                                        if (iD8 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th16;
                                    }
                                    jT2 = 0;
                                } catch (Throwable th18) {
                                    th = th18;
                                    th = th;
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                    it = fjf.a.iterator();
                                    while (it.hasNext()) {
                                        AccountInitializer accountInitializer9 = ((n6) it.next()).a;
                                        gm0.V("Payload", "error while parse payload", th);
                                        accountInitializer9.d().i().g().a(null, th);
                                    }
                                    iD = qt4.D(pye.a);
                                    if (iD != 0) {
                                        if (iD != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }
                        fkaVar.x();
                    } catch (Throwable th19) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th19);
                        Iterator it9 = fjf.a.iterator();
                        while (it9.hasNext()) {
                            AccountInitializer accountInitializer10 = ((n6) it9.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th19);
                                accountInitializer10.d().i().g().a(null, th19);
                            } catch (Throwable th20) {
                                gm0.V("Payload", "failed to collect exception", th20);
                            }
                        }
                        int iD9 = qt4.D(pye.a);
                        if (iD9 != 0) {
                            if (iD9 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th19;
                        }
                    }
                } catch (Throwable th21) {
                    th = th21;
                }
            }
        }
        return new pc(iR, jT, jT2, strX2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc)) {
            return false;
        }
        pc pcVar = (pc) obj;
        return this.a == pcVar.a && this.b == pcVar.b && this.c == pcVar.c && cqk.d(this.d, pcVar.d);
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.c(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "AdminParticipant(id=", ", permissions=");
        qt4.z(this.c, ", inviterId=", ", alias=", sbQ);
        return zo5.w(sbQ, this.d, ")");
    }
}
