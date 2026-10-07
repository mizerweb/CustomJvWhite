package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class vui implements Serializable {
    public final String a;
    public final long b;
    public final String c;
    public final int d;
    public final List e;
    public final byte f;
    public final String g;

    public vui(String str, long j, String str2, int i, List list, byte b, String str3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = i;
        this.e = list;
        this.f = b;
        this.g = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:232:0x038e A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #6 {all -> 0x00ae, blocks: (B:229:0x037f, B:230:0x0388, B:232:0x038e, B:236:0x03aa, B:237:0x03ae, B:240:0x03b8, B:241:0x03bd, B:242:0x03be, B:27:0x006f, B:28:0x0078, B:30:0x007e, B:34:0x009a, B:35:0x009e, B:38:0x00a8, B:39:0x00ad, B:42:0x00b2, B:233:0x0396, B:23:0x0068, B:31:0x0086), top: B:279:0x037f, inners: #2, #5, #24 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x03b8 A[Catch: all -> 0x00ae, TryCatch #6 {all -> 0x00ae, blocks: (B:229:0x037f, B:230:0x0388, B:232:0x038e, B:236:0x03aa, B:237:0x03ae, B:240:0x03b8, B:241:0x03bd, B:242:0x03be, B:27:0x006f, B:28:0x0078, B:30:0x007e, B:34:0x009a, B:35:0x009e, B:38:0x00a8, B:39:0x00ad, B:42:0x00b2, B:233:0x0396, B:23:0x0068, B:31:0x0086), top: B:279:0x037f, inners: #2, #5, #24 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x03be A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #6 {all -> 0x00ae, blocks: (B:229:0x037f, B:230:0x0388, B:232:0x038e, B:236:0x03aa, B:237:0x03ae, B:240:0x03b8, B:241:0x03bd, B:242:0x03be, B:27:0x006f, B:28:0x0078, B:30:0x007e, B:34:0x009a, B:35:0x009e, B:38:0x00a8, B:39:0x00ad, B:42:0x00b2, B:233:0x0396, B:23:0x0068, B:31:0x0086), top: B:279:0x037f, inners: #2, #5, #24 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x02e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final vui a(fka fkaVar) {
        int iU;
        String strX;
        Throwable th;
        Iterator it;
        int iD;
        byte b = 0;
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
        String strX2 = null;
        List list = null;
        int i = 0;
        int iR = 0;
        byte bN = 0;
        String strX3 = "";
        String strX4 = strX3;
        long jT = 0;
        while (i < iU) {
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
                    switch (strX.hashCode()) {
                        case -2128794476:
                            if (!strX.equals("startedAt")) {
                                try {
                                    fkaVar.x();
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
                                }
                            } else {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
                                } catch (Throwable th8) {
                                    try {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                                        Iterator it5 = fjf.a.iterator();
                                        while (it5.hasNext()) {
                                            AccountInitializer accountInitializer4 = ((n6) it5.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th8);
                                                accountInitializer4.d().i().g().a(null, th8);
                                            } catch (Throwable th9) {
                                                gm0.V("Payload", "failed to collect exception", th9);
                                            }
                                        }
                                        int iD5 = qt4.D(pye.a);
                                        if (iD5 != 0) {
                                            if (iD5 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th8;
                                        }
                                        jT = 0;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        th = th;
                                        try {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                            it = fjf.a.iterator();
                                            while (it.hasNext()) {
                                                AccountInitializer accountInitializer5 = ((n6) it.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th);
                                                    accountInitializer5.d().i().g().a(null, th);
                                                } catch (Throwable th11) {
                                                    gm0.V("Payload", "failed to collect exception", th11);
                                                }
                                            }
                                            iD = qt4.D(pye.a);
                                            if (iD != 0) {
                                                if (iD != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th;
                                            }
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
                                                if (iD6 == 1) {
                                                    throw th12;
                                                }
                                                ore.o();
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case -1676095234:
                            if (!strX.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                                fkaVar.x();
                                break;
                            } else {
                                try {
                                    strX2 = ch3.X(fkaVar, null);
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
                                    strX2 = null;
                                }
                            }
                            break;
                        case -1401988028:
                            if (!strX.equals(ApiProtocol.PARAM_JOIN_LINK)) {
                                fkaVar.x();
                                break;
                            } else {
                                try {
                                    strX3 = ch3.X(fkaVar, null);
                                } catch (Throwable th16) {
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
                                    strX3 = null;
                                }
                            }
                            break;
                        case -172613960:
                            if (!strX.equals("callType")) {
                                fkaVar.x();
                                break;
                            } else {
                                try {
                                    strX4 = ch3.X(fkaVar, null);
                                } catch (Throwable th18) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th18);
                                    Iterator it9 = fjf.a.iterator();
                                    while (it9.hasNext()) {
                                        AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th18);
                                            accountInitializer9.d().i().g().a(null, th18);
                                        } catch (Throwable th19) {
                                            gm0.V("Payload", "failed to collect exception", th19);
                                        }
                                    }
                                    int iD9 = qt4.D(pye.a);
                                    if (iD9 != 0) {
                                        if (iD9 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th18;
                                    }
                                    strX4 = null;
                                }
                            }
                            break;
                        case 3575610:
                            if (!strX.equals("type")) {
                                fkaVar.x();
                                break;
                            } else {
                                try {
                                    bN = ch3.N(fkaVar);
                                } catch (Throwable th20) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th20);
                                    Iterator it10 = fjf.a.iterator();
                                    while (it10.hasNext()) {
                                        AccountInitializer accountInitializer10 = ((n6) it10.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th20);
                                            accountInitializer10.d().i().g().a(null, th20);
                                        } catch (Throwable th21) {
                                            gm0.V("Payload", "failed to collect exception", th21);
                                        }
                                    }
                                    int iD10 = qt4.D(pye.a);
                                    if (iD10 != 0) {
                                        if (iD10 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th20;
                                    }
                                    bN = b;
                                }
                            }
                            break;
                        case 265384045:
                            if (!strX.equals("previewParticipantIds")) {
                                fkaVar.x();
                            } else {
                                List list2 = r66.a;
                                try {
                                    ArrayList arrayListF0 = ch3.f0(fkaVar, new lu8());
                                    if (arrayListF0 != null) {
                                        list2 = arrayListF0;
                                    }
                                } catch (Throwable th22) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th22);
                                    Iterator it11 = fjf.a.iterator();
                                    while (it11.hasNext()) {
                                        AccountInitializer accountInitializer11 = ((n6) it11.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th22);
                                            accountInitializer11.d().i().g().a(null, th22);
                                        } catch (Throwable th23) {
                                            gm0.V("Payload", "failed to collect exception", th23);
                                        }
                                    }
                                    int iD11 = qt4.D(pye.a);
                                    if (iD11 != 0) {
                                        if (iD11 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th22;
                                    }
                                }
                                list = list2;
                            }
                            break;
                        case 1268671573:
                            try {
                                if (!strX.equals("approxParticipantsCount")) {
                                    fkaVar.x();
                                    break;
                                } else {
                                    try {
                                        iR = ch3.R(fkaVar, b);
                                    } catch (Throwable th24) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th24);
                                        Iterator it12 = fjf.a.iterator();
                                        while (it12.hasNext()) {
                                            AccountInitializer accountInitializer12 = ((n6) it12.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th24);
                                                accountInitializer12.d().i().g().a(null, th24);
                                            } catch (Throwable th25) {
                                                gm0.V("Payload", "failed to collect exception", th25);
                                            }
                                        }
                                        int iD12 = qt4.D(pye.a);
                                        if (iD12 != 0) {
                                            if (iD12 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th24;
                                        }
                                        iR = b;
                                    }
                                }
                            } catch (Throwable th26) {
                                th = th26;
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                it = fjf.a.iterator();
                                while (it.hasNext()) {
                                    AccountInitializer accountInitializer13 = ((n6) it.next()).a;
                                    gm0.V("Payload", "error while parse payload", th);
                                    accountInitializer13.d().i().g().a(null, th);
                                }
                                iD = qt4.D(pye.a);
                                if (iD != 0) {
                                    if (iD != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th;
                                }
                                i++;
                                b = 0;
                                break;
                            }
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                } catch (Throwable th27) {
                    th = th27;
                }
            }
            i++;
            b = 0;
        }
        String str = strX2;
        if (str == null) {
            str = "";
        }
        return new vui(str, jT, strX3 != null ? strX3 : "", iR, list, bN, strX4);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "{conversationId='", this.a, "', startedAt=");
        sbB.append(", joinLink=");
        sbB.append(this.c);
        sbB.append(", approxParticipantCount=");
        sbB.append(this.d);
        sbB.append(", previewParticipantIds=");
        sbB.append(this.e);
        sbB.append(", type=");
        sbB.append((int) this.f);
        return qt4.q(sbB, ", callType=", this.g, "}");
    }
}
