package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oyl {
    public static fzh a(om9 om9Var, rg6[] rg6VarArr) {
        ghe gheVarR;
        List[] listArr = new List[rg6VarArr.length];
        for (int i = 0; i < rg6VarArr.length; i++) {
            rg6 rg6Var = rg6VarArr[i];
            if (rg6Var != null) {
                gheVarR = c98.r(rg6Var);
            } else {
                a98 a98Var = c98.b;
                gheVarR = ghe.e;
            }
            listArr[i] = gheVarR;
        }
        return b(om9Var, listArr);
    }

    public static fzh b(om9 om9Var, List[] listArr) {
        int i;
        boolean z;
        int i2 = 4;
        z88 z88Var = new z88(4);
        int i3 = 0;
        while (true) {
            int i4 = om9Var.a;
            int[][][] iArr = om9Var.e;
            iyh[] iyhVarArr = om9Var.c;
            if (i3 >= i4) {
                break;
            }
            iyh iyhVar = iyhVarArr[i3];
            List list = listArr[i3];
            int i5 = 0;
            while (i5 < iyhVar.a) {
                hyh hyhVarA = iyhVar.a(i5);
                int i6 = hyhVarA.a;
                int i7 = iyhVarArr[i3].a(i5).a;
                int[] iArr2 = new int[i7];
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    if ((iArr[i3][i5][i9] & 7) == i2) {
                        iArr2[i8] = i9;
                        i8++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr2, i8);
                int iMin = 16;
                String str = null;
                int i10 = 0;
                boolean z2 = false;
                int i11 = 0;
                while (i10 < iArrCopyOf.length) {
                    String str2 = iyhVarArr[i3].a(i5).d[iArrCopyOf[i10]].n;
                    int i12 = i11 + 1;
                    if (i11 == 0) {
                        str = str2;
                    } else {
                        z2 |= !Objects.equals(str, str2);
                    }
                    iMin = Math.min(iMin, iArr[i3][i5][i10] & 24);
                    i10++;
                    i11 = i12;
                }
                if (z2) {
                    iMin = Math.min(iMin, om9Var.d[i3]);
                }
                boolean z3 = iMin != 0;
                int[] iArr3 = new int[i6];
                boolean[] zArr = new boolean[i6];
                int i13 = 0;
                while (i13 < i6) {
                    iArr3[i13] = iArr[i3][i5][i13] & 7;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            i = i3;
                            z = false;
                            break;
                        }
                        rg6 rg6Var = (rg6) list.get(i14);
                        i = i3;
                        if (rg6Var.m().equals(hyhVarA) && rg6Var.k(i13) != -1) {
                            z = true;
                            break;
                        }
                        i14++;
                        i3 = i;
                    }
                    zArr[i13] = z;
                    i13++;
                    i3 = i;
                }
                z88Var.c(new ezh(hyhVarA, z3, iArr3, zArr));
                i5++;
                i3 = i3;
                i2 = 4;
            }
            i3++;
            i2 = 4;
        }
        iyh iyhVar2 = om9Var.f;
        for (int i15 = 0; i15 < iyhVar2.a; i15++) {
            hyh hyhVarA2 = iyhVar2.a(i15);
            int i16 = hyhVarA2.a;
            int[] iArr4 = new int[i16];
            Arrays.fill(iArr4, 0);
            z88Var.c(new ezh(hyhVarA2, false, iArr4, new boolean[i16]));
        }
        return new fzh(z88Var.h());
    }

    public static xu6 c(rg6 rg6Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = rg6Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (rg6Var.a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new xu6(1, 0, length, i);
    }

    /* JADX WARN: Code duplicated, block: B:322:0x033c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static f47 d(fka fkaVar) {
        int iU;
        String strX;
        long jT;
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
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        Long lValueOf = null;
        String strX5 = null;
        String strX6 = null;
        String strX7 = null;
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
                        case -1724546052:
                            if (!strX.equals("description")) {
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
                                    strX4 = ch3.X(fkaVar, null);
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
                                    strX4 = null;
                                }
                            }
                            break;
                        case -1587556021:
                            if (!strX.equals("startParam")) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX5 = ch3.X(fkaVar, null);
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
                                    strX5 = null;
                                }
                            }
                            break;
                        case -1332194002:
                            if (!strX.equals("background")) {
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
                        case 3355:
                            if (!strX.equals("id")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT2 = ch3.T(fkaVar, 0L);
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
                                    jT2 = 0;
                                }
                            }
                            break;
                        case 116079:
                            if (!strX.equals(MLFeatureConfigProviderBase.URL_KEY)) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX6 = ch3.X(fkaVar, null);
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
                                    strX6 = null;
                                }
                            }
                            break;
                        case 3373707:
                            if (!strX.equals(SdkMetricStatEvent.NAME_KEY)) {
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
                        case 93028124:
                            if (strX.equals("appId")) {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
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
                                    jT = 0;
                                }
                                lValueOf = jT == 0 ? null : Long.valueOf(jT);
                            } else {
                                fkaVar.x();
                            }
                            break;
                        case 1638765110:
                            if (!strX.equals("iconUrl")) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX7 = ch3.X(fkaVar, null);
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
                                    strX7 = null;
                                }
                            }
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                } catch (Throwable th23) {
                    try {
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
                            if (iD13 == 1) {
                                throw th25;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        if (jT2 != 0 && strX2 != null && strX2.length() != 0 && strX3 != null && strX3.length() != 0) {
            if (strX2 != null) {
                if (strX3 != null) {
                    return new f47(jT2, strX2, strX3, strX4, lValueOf, strX5, strX6, strX7);
                }
                ore.p("Required value was null.");
                return null;
            }
            ore.p("Required value was null.");
        }
        return null;
    }
}
