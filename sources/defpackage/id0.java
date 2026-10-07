package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public final class id0 extends kih {
    public static final /* synthetic */ int g = 0;
    public final LinkedHashMap c;
    public final ArrayList d;
    public final ljf e;
    public final ujd f;

    public id0(LinkedHashMap linkedHashMap, ArrayList arrayList, ljf ljfVar, ujd ujdVar) {
        this.c = linkedHashMap;
        this.d = arrayList;
        this.e = ljfVar;
        this.f = ujdVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:351:0x04b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x02b2 A[EXC_TOP_SPLITTER, PHI: r16
  0x02b2: PHI (r16v25 ??) = (r16v35 ??), (r16v36 ??), (r16v37 ??), (r16v26 ??) binds: [B:186:0x02b0, B:162:0x0254, B:138:0x01f7, B:102:0x017f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v122, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v204 */
    /* JADX WARN: Type inference failed for: r0v25, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v95, types: [iv4] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [ljf] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r16v10, types: [ljf] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v30 */
    /* JADX WARN: Type inference failed for: r16v31 */
    /* JADX WARN: Type inference failed for: r16v32 */
    /* JADX WARN: Type inference failed for: r16v33 */
    /* JADX WARN: Type inference failed for: r16v34 */
    /* JADX WARN: Type inference failed for: r16v35 */
    /* JADX WARN: Type inference failed for: r16v36 */
    /* JADX WARN: Type inference failed for: r16v37 */
    /* JADX WARN: Type inference failed for: r16v38 */
    /* JADX WARN: Type inference failed for: r16v39 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v40 */
    /* JADX WARN: Type inference failed for: r16v41 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [id0, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    public static final id0 d(fka fkaVar) {
        int iU;
        Iterator it;
        ?? W;
        ?? ljfVar;
        int i;
        String str;
        String str2;
        Integer numValueOf;
        Iterator it2;
        String strX;
        ?? r16;
        ArrayList arrayList;
        int iU2;
        String strX2;
        boolean z;
        fka fkaVar2 = fkaVar;
        ?? r7 = 0;
        if (!fkaVar2.l()) {
            return null;
        }
        int i2 = 1;
        try {
            iU = ch3.U(fkaVar2);
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it3 = fjf.a.iterator();
            while (it3.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it3.next()).a;
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
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        ?? r14 = 0;
        ujd ujdVarP = null;
        int i3 = 0;
        while (i3 < iU) {
            try {
                W = ch3.W(fkaVar2);
                ljfVar = ljfVar;
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                it = fjf.a.iterator();
                while (it.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(r7, th3);
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
                    return r7;
                }
                W = r7;
            }
            if (W != 0) {
                ljfVar = it;
                switch (W.hashCode()) {
                    case -309425751:
                        if (W.equals("profile")) {
                            i = 1;
                            str = null;
                            ujdVarP = f55.p(fkaVar);
                        } else {
                            try {
                                fkaVar.x();
                            } catch (Throwable th5) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                Iterator it4 = fjf.a.iterator();
                                while (it4.hasNext()) {
                                    AccountInitializer accountInitializer3 = ((n6) it4.next()).a;
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
                            ljfVar = it;
                            i = 1;
                            str = null;
                        }
                        break;
                    case 73797161:
                        if (W.equals("tokenAttrs")) {
                            try {
                                numValueOf = Integer.valueOf(ch3.U(fkaVar2));
                                str2 = null;
                            } catch (Throwable th7) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                Iterator it5 = fjf.a.iterator();
                                while (it5.hasNext()) {
                                    AccountInitializer accountInitializer4 = ((n6) it5.next()).a;
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
                                str2 = null;
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                int iIntValue = numValueOf.intValue();
                                int i4 = 0;
                                while (i4 < iIntValue) {
                                    try {
                                        ljfVar = ljfVar;
                                        strX = ch3.X(fkaVar2, str2);
                                        r16 = ljfVar;
                                    } catch (Throwable th9) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                        it2 = fjf.a.iterator();
                                        while (it2.hasNext()) {
                                            AccountInitializer accountInitializer5 = ((n6) it2.next()).a;
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
                                        strX = null;
                                    }
                                    if (strX == null) {
                                        r16 = it2;
                                    } else {
                                        r16 = it2;
                                        linkedHashMap.put(strX, cxk.b(fkaVar).a);
                                    }
                                    i4++;
                                    str2 = null;
                                    fkaVar2 = fkaVar;
                                    ljfVar = r16;
                                    break;
                                }
                                ljfVar = ljfVar;
                                str = str2;
                                i = 1;
                            }
                        } else {
                            fkaVar.x();
                        }
                        ljfVar = it;
                        i = 1;
                        str = null;
                        break;
                    case 269284955:
                        if (!W.equals("presetAvatars")) {
                            fkaVar.x();
                        } else {
                            if (fkaVar2.y().a() == 7) {
                                arrayList = new ArrayList();
                                int iT0 = fkaVar2.t0();
                                for (int i5 = 0; i5 < iT0; i5++) {
                                    arrayList.add(wwk.b(fkaVar2));
                                }
                            } else {
                                fkaVar2.x();
                                arrayList = null;
                            }
                            List listO1 = arrayList != null ? ww3.o1(arrayList) : null;
                            if (listO1 == null) {
                                listO1 = r66.a;
                            }
                            arrayList2.addAll(listO1);
                        }
                        ljfVar = it;
                        i = 1;
                        str = null;
                        break;
                    case 1363910664:
                        if (!W.equals("passwordChallenge")) {
                            fkaVar.x();
                            break;
                        } else if (fkaVar2.l()) {
                            try {
                                iU2 = ch3.U(fkaVar2);
                            } catch (Throwable th11) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                                Iterator it6 = fjf.a.iterator();
                                while (it6.hasNext()) {
                                    AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th11);
                                        accountInitializer6.d().i().g().a(r7, th11);
                                    } catch (Throwable th12) {
                                        gm0.V("Payload", "failed to collect exception", th12);
                                    }
                                }
                                int iD6 = qt4.D(pye.a);
                                if (iD6 != 0) {
                                    if (iD6 == i2) {
                                        throw th11;
                                    }
                                    ore.o();
                                    return r7;
                                }
                                iU2 = 0;
                            }
                            td0 td0VarB = td0.e;
                            ?? r17 = r7;
                            ?? r18 = r17;
                            ?? X = r18;
                            int i6 = 0;
                            ?? r8 = r7;
                            ?? r9 = iU2;
                            ljfVar = ljfVar;
                            ?? X2 = r17;
                            ?? X3 = r18;
                            while (i6 < r9) {
                                try {
                                    strX2 = ch3.X(fkaVar2, r8);
                                    ljfVar = ljfVar;
                                } catch (Throwable th13) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                                    ljfVar = fjf.a.iterator();
                                    while (ljfVar.hasNext()) {
                                        AccountInitializer accountInitializer7 = ((n6) ljfVar.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th13);
                                            accountInitializer7.d().i().g().a(r8, th13);
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
                                    strX2 = null;
                                }
                                if (strX2 != null) {
                                    try {
                                        ljfVar = ljfVar;
                                        switch (strX2.hashCode()) {
                                            case -1354792126:
                                                ljfVar = r9 == true ? 1 : 0;
                                                ljfVar = ljfVar;
                                                if (strX2.equals("config")) {
                                                    td0VarB = wcl.b(fkaVar2);
                                                } else {
                                                    try {
                                                        fkaVar2.x();
                                                    } catch (Throwable th15) {
                                                        try {
                                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                                                            Iterator it7 = fjf.a.iterator();
                                                            while (it7.hasNext()) {
                                                                AccountInitializer accountInitializer8 = ((n6) it7.next()).a;
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
                                                        } catch (Throwable th17) {
                                                            th = th17;
                                                            Throwable th18 = th;
                                                            try {
                                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th18);
                                                                Iterator it8 = fjf.a.iterator();
                                                                while (it8.hasNext()) {
                                                                    AccountInitializer accountInitializer9 = ((n6) it8.next()).a;
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
                                                                Iterator it9 = fjf.a.iterator();
                                                                while (it9.hasNext()) {
                                                                    AccountInitializer accountInitializer10 = ((n6) it9.next()).a;
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
                                                    }
                                                }
                                                break;
                                            case -1067396154:
                                                ljfVar = r9 == true ? 1 : 0;
                                                ljfVar = ljfVar;
                                                if (!strX2.equals("trackId")) {
                                                    fkaVar2.x();
                                                } else {
                                                    try {
                                                        X2 = ch3.X(fkaVar2, null);
                                                    } catch (Throwable th22) {
                                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th22);
                                                        Iterator it10 = fjf.a.iterator();
                                                        while (it10.hasNext()) {
                                                            AccountInitializer accountInitializer11 = ((n6) it10.next()).a;
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
                                                        X2 = 0;
                                                    }
                                                }
                                                break;
                                            case 3202695:
                                                ljfVar = r9 == true ? 1 : 0;
                                                ljfVar = ljfVar;
                                                if (!strX2.equals("hint")) {
                                                    fkaVar2.x();
                                                } else {
                                                    try {
                                                        X3 = ch3.X(fkaVar2, null);
                                                    } catch (Throwable th24) {
                                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th24);
                                                        Iterator it11 = fjf.a.iterator();
                                                        while (it11.hasNext()) {
                                                            AccountInitializer accountInitializer12 = ((n6) it11.next()).a;
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
                                                        X3 = 0;
                                                    }
                                                }
                                                break;
                                            case 96619420:
                                                if (strX2.equals("email")) {
                                                    try {
                                                        X = ch3.X(fkaVar2, null);
                                                        ljfVar = ljfVar;
                                                        ljfVar = r9 == true ? 1 : 0;
                                                    } catch (Throwable th26) {
                                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th26);
                                                        Iterator it12 = fjf.a.iterator();
                                                        r9 = r9;
                                                        while (it12.hasNext()) {
                                                            AccountInitializer accountInitializer13 = ((n6) it12.next()).a;
                                                            try {
                                                                gm0.V("Payload", "error while parse payload", th26);
                                                                iv4 iv4VarG = accountInitializer13.d().i().g();
                                                                z = r9 == true ? 1 : 0;
                                                                try {
                                                                    iv4VarG.a(null, th26);
                                                                } catch (Throwable th27) {
                                                                    th = th27;
                                                                    gm0.V("Payload", "failed to collect exception", th);
                                                                    r9 = z;
                                                                }
                                                            } catch (Throwable th28) {
                                                                th = th28;
                                                                z = r9 == true ? 1 : 0;
                                                            }
                                                            r9 = z;
                                                        }
                                                        ljfVar = r9 == true ? 1 : 0;
                                                        int iD13 = qt4.D(pye.a);
                                                        if (iD13 != 0) {
                                                            if (iD13 != 1) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            throw th26;
                                                        }
                                                        X = 0;
                                                    }
                                                    break;
                                                }
                                            default:
                                                ljfVar = r9 == true ? 1 : 0;
                                                fkaVar2.x();
                                                break;
                                        }
                                    } catch (Throwable th29) {
                                        th = th29;
                                        ljfVar = r9;
                                    }
                                } else {
                                    ljfVar = ljfVar;
                                    ljfVar = r9 == true ? 1 : 0;
                                }
                                i6++;
                                r9 = ljfVar;
                                r8 = 0;
                                ljfVar = ljfVar;
                                X2 = X2;
                                X3 = X3;
                                X = X;
                                break;
                            }
                            if (X2 == 0) {
                                r14 = 0;
                            } else {
                                ljfVar = new ljf((Object) X2, (Object) X3, (Object) X, td0VarB, 4);
                                r14 = ljfVar;
                            }
                        } else {
                            r14 = r7;
                        }
                        ljfVar = it;
                        i = 1;
                        str = null;
                        break;
                    default:
                        fkaVar.x();
                        ljfVar = it;
                        i = 1;
                        str = null;
                        break;
                }
            } else {
                ljfVar = it;
                i = 1;
                str = null;
            }
            i3++;
            fkaVar2 = fkaVar;
            i2 = i;
            r7 = str;
            r14 = r14;
        }
        return new id0(linkedHashMap, arrayList2, r14, ujdVarP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id0)) {
            return false;
        }
        id0 id0Var = (id0) obj;
        return this.c.equals(id0Var.c) && this.d.equals(id0Var.d) && cqk.d(this.e, id0Var.e) && cqk.d(this.f, id0Var.f);
    }

    public final int hashCode() {
        int iB = x05.b(this.d, this.c.hashCode() * 31, 31);
        ljf ljfVar = this.e;
        int iHashCode = (iB + (ljfVar == null ? 0 : ljfVar.hashCode())) * 31;
        ujd ujdVar = this.f;
        return iHashCode + (ujdVar != null ? ujdVar.hashCode() : 0);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "{profile=" + this.f + ",tokenTypes=" + ch3.z(this.c) + ",passwordChallenge=" + this.e + ",}";
    }
}
