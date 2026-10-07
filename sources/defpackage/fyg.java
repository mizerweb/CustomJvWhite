package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fyg {
    public static final int[] a = {13, 15, 14};

    public static final void a(ArrayList arrayList, long j, long j2, long j3, qv5 qv5Var) {
        arrayList.add(new apb(new ilb(j), j2, j3, qv5Var));
    }

    public static final int[] b(NetworkRequest networkRequest) {
        if (Build.VERSION.SDK_INT >= 31) {
            return networkRequest.getCapabilities();
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            if (networkRequest.hasCapability(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return ww3.S1(arrayList);
    }

    public static final int[] c(NetworkRequest networkRequest) {
        if (Build.VERSION.SDK_INT >= 31) {
            return networkRequest.getTransportTypes();
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            if (networkRequest.hasTransport(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return ww3.S1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:414:0x043c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static gyg d(fka fkaVar) {
        int iU;
        String strX;
        int iJ;
        u8b u8bVar = cqb.b;
        int i = 0;
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
        long j = 0;
        u8b u8bVar2 = u8bVar;
        wyg wygVarB = null;
        l40 l40VarB = null;
        cmf cmfVarA = null;
        int i2 = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        long jT = 0;
        long jT2 = 0;
        long jT3 = 0;
        long jT4 = 0;
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
                        case -1109732030:
                            if (strX.equals("layers")) {
                                u8b u8bVar3 = cqb.b;
                                try {
                                    if (fkaVar.y().a() == 7) {
                                        try {
                                            iJ = ch3.J(fkaVar);
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
                                            iJ = 0;
                                        }
                                        u8b u8bVar4 = new u8b(iJ);
                                        for (int i3 = 0; i3 < iJ; i3++) {
                                            jyg jygVarD = iyg.d(fkaVar);
                                            if (jygVarD != null) {
                                                u8bVar4.b(jygVarD);
                                            }
                                        }
                                        u8bVar3 = u8bVar4;
                                    } else {
                                        fkaVar.x();
                                    }
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
                                    u8bVar2 = u8bVar3;
                                    i2++;
                                    i = 0;
                                    j = 0;
                                }
                                u8bVar2 = u8bVar3;
                                break;
                            } else {
                                try {
                                    fkaVar.x();
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
                                }
                            }
                            break;
                        case -867509719:
                            if (!strX.equals("reaction")) {
                                fkaVar.x();
                            } else {
                                try {
                                    cmfVarA = h1h.a(fkaVar);
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
                                    cmfVarA = null;
                                }
                            }
                            break;
                        case -837465425:
                            if (!strX.equals("expiration")) {
                                fkaVar.x();
                            } else {
                                try {
                                    iR2 = ch3.R(fkaVar, i);
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
                                    iR2 = i;
                                }
                            }
                            break;
                        case -295931082:
                            if (!strX.equals("updateTime")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT2 = ch3.T(fkaVar, j);
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
                                    jT2 = j;
                                }
                            }
                            break;
                        case 3355:
                            if (!strX.equals("id")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT = ch3.T(fkaVar, j);
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
                                    jT = j;
                                }
                            }
                            break;
                        case 98494:
                            if (!strX.equals("cid")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT4 = ch3.T(fkaVar, j);
                                } catch (Throwable th19) {
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
                                    jT4 = j;
                                }
                            }
                            break;
                        case 3560141:
                            if (!strX.equals("time")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT3 = ch3.T(fkaVar, j);
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
                                        if (iD11 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th21;
                                    }
                                    jT3 = j;
                                }
                            }
                            break;
                        case 103772132:
                            if (!strX.equals("media")) {
                                fkaVar.x();
                            } else {
                                try {
                                    l40VarB = l40.b(fkaVar);
                                } catch (Throwable th23) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th23);
                                    Iterator it12 = fjf.a.iterator();
                                    while (it12.hasNext()) {
                                        AccountInitializer accountInitializer12 = ((n6) it12.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th23);
                                            accountInitializer12.d().i().g().a(null, th23);
                                        } catch (Throwable th24) {
                                            gm0.V("Payload", "failed to collect exception", th24);
                                        }
                                    }
                                    int iD12 = qt4.D(pye.a);
                                    if (iD12 != 0) {
                                        if (iD12 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th23;
                                    }
                                    l40VarB = null;
                                }
                            }
                            break;
                        case 106164915:
                            if (!strX.equals("owner")) {
                                fkaVar.x();
                            } else {
                                try {
                                    wygVarB = tsl.b(fkaVar);
                                } catch (Throwable th25) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th25);
                                    Iterator it13 = fjf.a.iterator();
                                    while (it13.hasNext()) {
                                        AccountInitializer accountInitializer13 = ((n6) it13.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th25);
                                            accountInitializer13.d().i().g().a(null, th25);
                                        } catch (Throwable th26) {
                                            gm0.V("Payload", "failed to collect exception", th26);
                                        }
                                    }
                                    int iD13 = qt4.D(pye.a);
                                    if (iD13 != 0) {
                                        if (iD13 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th25;
                                    }
                                    wygVarB = null;
                                }
                            }
                            break;
                        case 351608024:
                            if (!strX.equals("version")) {
                                fkaVar.x();
                            } else {
                                try {
                                    iR3 = ch3.R(fkaVar, i);
                                } catch (Throwable th27) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th27);
                                    Iterator it14 = fjf.a.iterator();
                                    while (it14.hasNext()) {
                                        AccountInitializer accountInitializer14 = ((n6) it14.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th27);
                                            accountInitializer14.d().i().g().a(null, th27);
                                        } catch (Throwable th28) {
                                            gm0.V("Payload", "failed to collect exception", th28);
                                        }
                                    }
                                    int iD14 = qt4.D(pye.a);
                                    if (iD14 != 0) {
                                        if (iD14 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th27;
                                    }
                                    iR3 = i;
                                }
                            }
                            break;
                        case 1434631203:
                            if (!strX.equals("settings")) {
                                fkaVar.x();
                            } else {
                                try {
                                    iR = ch3.R(fkaVar, i);
                                } catch (Throwable th29) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th29);
                                    Iterator it15 = fjf.a.iterator();
                                    while (it15.hasNext()) {
                                        AccountInitializer accountInitializer15 = ((n6) it15.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th29);
                                            accountInitializer15.d().i().g().a(null, th29);
                                        } catch (Throwable th30) {
                                            gm0.V("Payload", "failed to collect exception", th30);
                                        }
                                    }
                                    int iD15 = qt4.D(pye.a);
                                    if (iD15 != 0) {
                                        if (iD15 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th29;
                                    }
                                    iR = i;
                                }
                            }
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                } catch (Throwable th31) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th31);
                        Iterator it16 = fjf.a.iterator();
                        while (it16.hasNext()) {
                            AccountInitializer accountInitializer16 = ((n6) it16.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th31);
                                accountInitializer16.d().i().g().a(null, th31);
                            } catch (Throwable th32) {
                                gm0.V("Payload", "failed to collect exception", th32);
                            }
                        }
                        int iD16 = qt4.D(pye.a);
                        if (iD16 != 0) {
                            if (iD16 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th31;
                        }
                        i2++;
                        i = 0;
                        j = 0;
                    } catch (Throwable th33) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th33);
                        Iterator it17 = fjf.a.iterator();
                        while (it17.hasNext()) {
                            AccountInitializer accountInitializer17 = ((n6) it17.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th33);
                                accountInitializer17.d().i().g().a(null, th33);
                            } catch (Throwable th34) {
                                gm0.V("Payload", "failed to collect exception", th34);
                            }
                        }
                        int iD17 = qt4.D(pye.a);
                        if (iD17 != 0) {
                            if (iD17 == 1) {
                                throw th33;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
            i2++;
            i = 0;
            j = 0;
        }
        if (wygVarB != null) {
            return new gyg(jT, jT2, wygVarB, iR, jT3, iR2, l40VarB, jT4, cmfVarA, iR3, u8bVar2);
        }
        String name = fyg.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "Owner cannot be null", null);
            }
        }
        return null;
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
