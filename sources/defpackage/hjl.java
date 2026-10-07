package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hjl {
    /* JADX WARN: Code duplicated, block: B:260:0x029b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static q6d a(fka fkaVar) {
        int iU;
        String strX;
        int iJ;
        u8b u8bVar = cqb.b;
        int i = 1;
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
        u8b u8bVar2 = u8bVar;
        String strX2 = null;
        Integer numS = null;
        ed7 ed7VarA = null;
        int i2 = 0;
        int iR = 0;
        long jT = 0;
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
                    if (iD2 != i) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    switch (strX.hashCode()) {
                        case -982667974:
                            if (!strX.equals("pollId")) {
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
                            }
                            break;
                        case -847398795:
                            if (strX.equals("answers")) {
                                u8b u8bVar3 = cqb.b;
                                try {
                                    if (fkaVar.y().a() == 7) {
                                        try {
                                            iJ = ch3.J(fkaVar);
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
                                                if (iD5 != i) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th9;
                                            }
                                            iJ = 0;
                                        }
                                        u8b u8bVar4 = new u8b(iJ);
                                        for (int i3 = 0; i3 < iJ; i3++) {
                                            r5d r5dVarA = bjl.a(fkaVar);
                                            if (r5dVarA != null) {
                                                u8bVar4.b(r5dVarA);
                                            }
                                        }
                                        u8bVar3 = u8bVar4;
                                    } else {
                                        fkaVar.x();
                                    }
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
                                }
                                u8bVar2 = u8bVar3;
                            } else {
                                fkaVar.x();
                            }
                            break;
                        case 109757585:
                            if (strX.equals("state")) {
                                ed7VarA = njl.a(fkaVar);
                            } else {
                                fkaVar.x();
                            }
                            break;
                        case 110371416:
                            if (!strX.equals("title")) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX2 = ch3.X(fkaVar, null);
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
                                        if (iD7 != i) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th13;
                                    }
                                    strX2 = null;
                                }
                            }
                            break;
                        case 351608024:
                            if (!strX.equals("version")) {
                                fkaVar.x();
                            } else {
                                try {
                                    iR = ch3.R(fkaVar, iR);
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
                                        if (iD8 != i) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th15;
                                    }
                                }
                            }
                            break;
                        case 1434631203:
                            if (!strX.equals("settings")) {
                                fkaVar.x();
                            } else {
                                try {
                                    numS = ch3.S(fkaVar);
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
                                        if (iD9 != i) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th17;
                                    }
                                    numS = null;
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
            i2++;
            i = 1;
        }
        if (jT != 0 && strX2 != null && strX2.length() != 0 && !u8bVar2.i() && numS != null) {
            int i4 = iR;
            if (strX2 != null) {
                return new q6d(jT, strX2, u8bVar2, numS.intValue(), ed7VarA, i4, false, false);
            }
            ore.p("Required value was null.");
        }
        return null;
    }

    public static Object b(nf2 nf2Var, sr3 sr3Var) {
        if (nf2Var instanceof ndi) {
            return ((ndi) nf2Var).W(sr3Var);
        }
        if (!(nf2Var instanceof nf2)) {
            return null;
        }
        nf2 nf2Var2 = nf2Var;
        if (nf2Var2.v() != nf2Var) {
            return b(nf2Var2.v(), sr3Var);
        }
        return null;
    }
}
