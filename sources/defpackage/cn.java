package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class cn {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;

    public cn(long j, String str, String str2, String str3, long j2, List list) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = list;
    }

    /* JADX WARN: Code duplicated, block: B:259:0x0286 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final cn a(fka fkaVar) {
        int iU;
        String strX;
        List listF0;
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
        r66 r66Var = r66.a;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        List list = r66Var;
        long jT = 0;
        long jT2 = 0;
        for (int i = 0; i < iU; i++) {
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
                    if (iD2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    switch (strX.hashCode()) {
                        case -295931082:
                            if (!strX.equals("updateTime")) {
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
                                    jT2 = ch3.T(fkaVar, 0L);
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
                                    jT2 = 0;
                                }
                            }
                            break;
                        case 3355:
                            if (!strX.equals("id")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
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
                                    jT = 0;
                                }
                            }
                            break;
                        case 3373707:
                            if (!strX.equals(SdkMetricStatEvent.NAME_KEY)) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX3 = ch3.X(fkaVar, null);
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
                                    strX3 = null;
                                }
                            }
                            break;
                        case 660078807:
                            if (!strX.equals("iconLottieUrl")) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX4 = ch3.X(fkaVar, null);
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
                                    strX4 = null;
                                }
                            }
                            break;
                        case 705606459:
                            if (strX.equals("animojiIds")) {
                                try {
                                    listF0 = ch3.f0(fkaVar, new dul(15));
                                    if (listF0 == null) {
                                        listF0 = r66Var;
                                    }
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
                                }
                                list = listF0;
                            } else {
                                fkaVar.x();
                            }
                            break;
                        case 1638765110:
                            if (!strX.equals("iconUrl")) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX2 = ch3.X(fkaVar, null);
                                } catch (Throwable th17) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                                    Iterator it9 = fjf.a.iterator();
                                    while (it9.hasNext()) {
                                        AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th17);
                                            accountInitializer9.d().i().g().a(null, th17);
                                        } catch (Throwable th18) {
                                            gm0.V("Payload", "failed to collect exception", th18);
                                        }
                                    }
                                    int iD9 = qt4.D(pye.a);
                                    if (iD9 != 0) {
                                        if (iD9 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th17;
                                    }
                                    strX2 = null;
                                }
                            }
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                } catch (Throwable th19) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th19);
                        Iterator it10 = fjf.a.iterator();
                        while (it10.hasNext()) {
                            AccountInitializer accountInitializer10 = ((n6) it10.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th19);
                                accountInitializer10.d().i().g().a(null, th19);
                            } catch (Throwable th20) {
                                gm0.V("Payload", "failed to collect exception", th20);
                            }
                        }
                        int iD10 = qt4.D(pye.a);
                        if (iD10 != 0) {
                            if (iD10 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th19;
                        }
                    } catch (Throwable th21) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th21);
                        Iterator it11 = fjf.a.iterator();
                        while (it11.hasNext()) {
                            AccountInitializer accountInitializer11 = ((n6) it11.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th21);
                                accountInitializer11.d().i().g().a(null, th21);
                            } catch (Throwable th22) {
                                gm0.V("Payload", "failed to collect exception", th22);
                            }
                        }
                        int iD11 = qt4.D(pye.a);
                        if (iD11 != 0) {
                            if (iD11 == 1) {
                                throw th21;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        if (strX3 == null || strX3.length() == 0) {
            return null;
        }
        String str = strX2;
        return new cn(jT, strX3, str == null ? "" : str, strX4, jT2, list);
    }
}
