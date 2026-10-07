package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class ukb implements fu3 {
    public static final ukb a;
    public static final String b;

    static {
        ukb ukbVar = new ukb();
        a = ukbVar;
        b = ukbVar.getClass().getName();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:272:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.fu3
    public final kih i(fka fkaVar) {
        int iU;
        String strX;
        int i;
        Byte bO;
        long jT;
        long jT2;
        long jT3;
        if (fkaVar.l()) {
            int i2 = 0;
            int i3 = 1;
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
            Long lValueOf = null;
            Long lValueOf2 = null;
            Long lValueOf3 = null;
            String strX2 = null;
            k1i k1iVarA = null;
            while (i2 < iU) {
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
                        if (iD2 != i3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th3;
                    }
                    strX = null;
                }
                if (strX != null) {
                    try {
                        i = iU;
                        switch (strX.hashCode()) {
                            case -1440013438:
                                if (!strX.equals("messageId")) {
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
                                            if (iD3 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th5;
                                        }
                                    }
                                } else {
                                    try {
                                        jT = ch3.T(fkaVar, 0L);
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
                                            if (iD4 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th7;
                                        }
                                        jT = 0;
                                    }
                                    lValueOf2 = Long.valueOf(jT);
                                }
                                break;
                            case -1361631597:
                                if (!strX.equals(ApiProtocol.PARAM_CHAT_ID)) {
                                    fkaVar.x();
                                } else {
                                    try {
                                        jT2 = ch3.T(fkaVar, 0L);
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
                                            if (iD5 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th9;
                                        }
                                        jT2 = 0;
                                    }
                                    lValueOf = Long.valueOf(jT2);
                                }
                                break;
                            case -241763182:
                                if (!strX.equals("transcription")) {
                                    fkaVar.x();
                                } else {
                                    try {
                                        strX2 = ch3.X(fkaVar, null);
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
                                            if (iD6 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th11;
                                        }
                                        strX2 = null;
                                    }
                                }
                                break;
                            case 940773407:
                                if (!strX.equals("mediaId")) {
                                    fkaVar.x();
                                } else {
                                    try {
                                        jT3 = ch3.T(fkaVar, 0L);
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
                                            if (iD7 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th13;
                                        }
                                        jT3 = 0;
                                    }
                                    lValueOf3 = Long.valueOf(jT3);
                                }
                                break;
                            case 1256882980:
                                try {
                                    if (!strX.equals("transcriptionStatus")) {
                                        fkaVar.x();
                                    } else {
                                        try {
                                            bO = ch3.O(fkaVar);
                                        } catch (Throwable th15) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                                            Iterator it8 = fjf.a.iterator();
                                            while (it8.hasNext()) {
                                                AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th15);
                                                    accountInitializer8.d().i().g().a(null, th15);
                                                } catch (Throwable th16) {
                                                    gm0.V("Payload", "failed to collect exception", th16);
                                                }
                                            }
                                            int iD8 = qt4.D(pye.a);
                                            if (iD8 != 0) {
                                                if (iD8 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th15;
                                            }
                                            bO = null;
                                        }
                                        k1iVarA = ezl.a(bO);
                                    }
                                } catch (Throwable th17) {
                                    th = th17;
                                    Throwable th18 = th;
                                    try {
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
                                            if (iD10 == 1) {
                                                throw th20;
                                            }
                                            ore.o();
                                            return null;
                                        }
                                    }
                                }
                                break;
                            default:
                                fkaVar.x();
                                break;
                        }
                    } catch (Throwable th22) {
                        th = th22;
                        i = iU;
                    }
                } else {
                    i = iU;
                }
                i2++;
                iU = i;
                i3 = 1;
            }
            if (lValueOf != null && lValueOf2 != null && lValueOf3 != null && k1iVarA != null) {
                return new tkb(lValueOf.longValue(), lValueOf2.longValue(), lValueOf3.longValue(), strX2, k1iVarA);
            }
            k1i k1iVar = k1iVarA;
            String str = b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Required params are null: chatId=" + lValueOf + ", messageId=" + lValueOf2 + ", attachId=" + lValueOf3 + ", transcriptionStatus=" + k1iVar, null);
                }
            }
        }
        return null;
    }
}
