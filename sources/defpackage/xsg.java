package defpackage;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xsg {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        lvb.b0(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static String c(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                z88 z88VarL = c98.l();
                int i2 = 0;
                while (i2 < bArr.length) {
                    int iB = b(bArr, i2, bArr.length, zArr);
                    if (iB != bArr.length) {
                        z88VarL.c(Integer.valueOf(iB));
                    }
                    i2 = iB + 3;
                }
                ghe gheVarH = z88VarL.h();
                for (int i3 = 0; i3 < gheVarH.d; i3++) {
                    if (((Integer) gheVarH.get(i3)).intValue() + 3 < length) {
                        mo2 mo2Var = new mo2(bArr, ((Integer) gheVarH.get(i3)).intValue() + 3, length);
                        td0 td0VarI = i(mo2Var);
                        if (td0VarI.b == 33 && td0VarI.c == 0) {
                            mo2Var.t(4);
                            int i4 = mo2Var.i(3);
                            mo2Var.s();
                            jab jabVarJ = j(mo2Var, true, i4, null);
                            return qu3.a(jabVarJ.a, jabVarJ.b, jabVarJ.c, jabVarJ.d, jabVarJ.e, jabVarJ.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String d(b87 b87Var) {
        String str = b87Var.n;
        String str2 = b87Var.k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return b87Var.n;
    }

    public static boolean e(byte[] bArr, int i, b87 b87Var) {
        int i2;
        if (Objects.equals(b87Var.n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(b87Var.n, "video/hevc")) {
            td0 td0VarI = i(new mo2(bArr, 4, i + 4));
            int i3 = td0VarI.b;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && td0VarI.d == b87Var.E - 1) {
                return false;
            }
        }
        return true;
    }

    public static f99 f(fka fkaVar) {
        int iU;
        String strX;
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
        l40 l40VarB = null;
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
                    int iHashCode = strX.hashCode();
                    if (iHashCode != -1361631597) {
                        if (iHashCode != -295931082) {
                            if (iHashCode == 103772132 && strX.equals("media")) {
                                l40VarB = l40.b(fkaVar);
                            } else {
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
                            }
                        } else if (strX.equals("updateTime")) {
                            lValueOf2 = Long.valueOf(fkaVar.I0());
                        } else {
                            fkaVar.x();
                        }
                    } else if (strX.equals(ApiProtocol.PARAM_CHAT_ID)) {
                        lValueOf = Long.valueOf(fkaVar.I0());
                    } else {
                        fkaVar.x();
                    }
                } catch (Throwable th7) {
                    try {
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
                    }
                }
            }
        }
        if (lValueOf == null || lValueOf2 == null || l40VarB == null) {
            return null;
        }
        return new f99(lValueOf.longValue(), lValueOf2.longValue(), l40VarB);
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ysg g(fka fkaVar) {
        int iU;
        String strX;
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
        wyg wygVarB = null;
        short sV = 0;
        short sV2 = 0;
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
                        case -1139436263:
                            if (!strX.equals("readCount")) {
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
                                    sV2 = ch3.V(fkaVar);
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
                                    sV2 = 0;
                                }
                            }
                            break;
                        case -731385813:
                            if (!strX.equals("totalCount")) {
                                fkaVar.x();
                            } else {
                                try {
                                    sV = ch3.V(fkaVar);
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
                                    sV = 0;
                                }
                            }
                            break;
                        case -295931082:
                            if (!strX.equals("updateTime")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
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
                                    jT = 0;
                                }
                            }
                            break;
                        case 106164915:
                            if (!strX.equals("owner")) {
                                fkaVar.x();
                            } else {
                                try {
                                    wygVarB = tsl.b(fkaVar);
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
                                    wygVarB = null;
                                }
                            }
                            break;
                        case 633219067:
                            if (!strX.equals("lastStoryExpirationTime")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT2 = ch3.T(fkaVar, 0L);
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
                                    jT2 = 0;
                                }
                            }
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                } catch (Throwable th17) {
                    try {
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
                            if (iD10 == 1) {
                                throw th19;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        if (wygVarB != null) {
            return new ysg(wygVarB, jT, sV, sV2, jT2);
        }
        String name = xsg.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "Owner cannot be null", null);
            }
        }
        return null;
    }

    public static int h(b87 b87Var) {
        String strD = d(b87Var);
        if (Objects.equals(strD, "video/avc")) {
            return 1;
        }
        return Objects.equals(strD, "video/hevc") ? 2 : 0;
    }

    public static td0 i(mo2 mo2Var) {
        mo2Var.s();
        return new td0(mo2Var.i(6), mo2Var.i(6), mo2Var.i(3) - 1, 5);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static jab j(mo2 mo2Var, boolean z, int i, jab jabVar) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean zH;
        int i5;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (!z) {
            if (jabVar != null) {
                int i8 = jabVar.a;
                zH = jabVar.b;
                i5 = jabVar.c;
                i6 = jabVar.d;
                iArr2 = jabVar.e;
                i2 = i8;
            } else {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
            }
            int i9 = mo2Var.i(8);
            i7 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                if (mo2Var.h()) {
                    i7 += 88;
                }
                if (mo2Var.h()) {
                    i7 += 8;
                }
            }
            mo2Var.t(i7);
            if (i > 0) {
                mo2Var.t((8 - i) * 2);
            }
            return new jab(i2, z2, i3, i4, iArr, i9);
        }
        int i11 = mo2Var.i(2);
        zH = mo2Var.h();
        i5 = mo2Var.i(5);
        i6 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            if (mo2Var.h()) {
                i6 |= 1 << i12;
            }
        }
        for (int i13 = 0; i13 < 6; i13++) {
            iArr2[i13] = mo2Var.i(8);
        }
        i2 = i11;
        iArr = iArr2;
        z2 = zH;
        i3 = i5;
        i4 = i6;
        int i14 = mo2Var.i(8);
        i7 = 0;
        while (i10 < i) {
            if (mo2Var.h()) {
                i7 += 88;
            }
            if (mo2Var.h()) {
                i7 += 8;
            }
        }
        mo2Var.t(i7);
        if (i > 0) {
            mo2Var.t((8 - i) * 2);
        }
        return new jab(i2, z2, i3, i4, iArr, i14);
    }

    public static ww6 k(int i, byte[] bArr, int i2) {
        byte b2;
        int i3 = i + 2;
        do {
            i2--;
            b2 = bArr[i2];
            if (b2 != 0) {
                break;
            }
        } while (i2 > i3);
        if (b2 == 0 || i2 <= i3) {
            return null;
        }
        mo2 mo2Var = new mo2(bArr, i3, i2 + 1);
        while (mo2Var.d(16)) {
            int i4 = mo2Var.i(8);
            int i5 = 0;
            while (i4 == 255) {
                i5 += 255;
                i4 = mo2Var.i(8);
            }
            int i6 = i5 + i4;
            int i7 = mo2Var.i(8);
            int i8 = 0;
            while (i7 == 255) {
                i8 += 255;
                i7 = mo2Var.i(8);
            }
            int i9 = i8 + i7;
            if (i9 == 0 || !mo2Var.d(i9)) {
                return null;
            }
            if (i6 == 176) {
                int iM = mo2Var.m();
                boolean zH = mo2Var.h();
                int iM2 = zH ? mo2Var.m() : 0;
                int iM3 = mo2Var.m();
                int iM4 = -1;
                for (int i10 = 0; i10 <= iM3; i10++) {
                    iM4 = mo2Var.m();
                    mo2Var.m();
                    int i11 = mo2Var.i(6);
                    if (i11 == 63) {
                        return null;
                    }
                    mo2Var.i(i11 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i11 + iM) - 31));
                    if (zH) {
                        int i12 = mo2Var.i(6);
                        if (i12 == 63) {
                            return null;
                        }
                        mo2Var.i(i12 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i12 + iM2) - 31));
                    }
                    if (mo2Var.h()) {
                        mo2Var.t(10);
                    }
                }
                return new ww6(iM4, 12, (byte) 0);
            }
            mo2Var.t(i9 * 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    public static lab l(byte[] bArr, int i, int i2, ljf ljfVar) {
        int i3;
        int iM;
        int i4;
        int i5;
        int i6;
        int iM2;
        int i7;
        int i8;
        int iM3;
        int i9;
        int iMax;
        int i10;
        int i11;
        int i12;
        int i13;
        int iJ;
        int i14;
        fik fikVar;
        int iM4;
        kzi kziVar;
        td0 td0VarI = i(new mo2(bArr, i, i2));
        mo2 mo2Var = new mo2(bArr, i + 2, i2);
        int i15 = 4;
        mo2Var.t(4);
        int i16 = mo2Var.i(3);
        int i17 = td0VarI.c;
        boolean z = i17 != 0 && i16 == 7;
        if (ljfVar != null) {
            c98 c98Var = (c98) ljfVar.b;
            if (c98Var.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((iab) c98Var.get(Math.min(i17, c98Var.size() - 1))).a;
            }
        } else {
            i3 = 0;
        }
        jab jabVarJ = null;
        if (!z) {
            mo2Var.s();
            jabVarJ = j(mo2Var, true, i16, null);
        } else if (ljfVar != null) {
            uvc uvcVar = (uvc) ljfVar.c;
            int[] iArr = (int[]) uvcVar.c;
            c98 c98Var2 = (c98) uvcVar.b;
            int i18 = iArr[i3];
            if (c98Var2.size() > i18) {
                jabVarJ = (jab) c98Var2.get(i18);
            }
        }
        mo2Var.m();
        if (z) {
            int i19 = mo2Var.h() ? mo2Var.i(8) : -1;
            if (ljfVar == null || (kziVar = (kzi) ljfVar.d) == null) {
                iM2 = 0;
                i8 = 0;
                iM3 = 0;
                iM = 0;
                i6 = 0;
                i7 = 0;
                i9 = 0;
            } else {
                c98 c98Var3 = (c98) kziVar.a;
                if (i19 == -1) {
                    i19 = ((int[]) kziVar.b)[i3];
                }
                if (i19 == -1 || c98Var3.size() <= i19) {
                    iM2 = 0;
                    i8 = 0;
                    iM3 = 0;
                    iM = 0;
                    i6 = 0;
                    i7 = 0;
                    i9 = 0;
                } else {
                    kab kabVar = (kab) c98Var3.get(i19);
                    iM = kabVar.a;
                    i6 = kabVar.d;
                    i8 = kabVar.e;
                    iM2 = kabVar.b;
                    iM3 = kabVar.c;
                    i7 = i8;
                    i9 = i6;
                }
            }
        } else {
            iM = mo2Var.m();
            if (iM == 3) {
                mo2Var.s();
            }
            int iM5 = mo2Var.m();
            int iM6 = mo2Var.m();
            if (mo2Var.h()) {
                int iM7 = mo2Var.m();
                int iM8 = mo2Var.m();
                int iM9 = mo2Var.m();
                int iM10 = mo2Var.m();
                i5 = iM5 - ((iM7 + iM8) * ((iM == 1 || iM == 2) ? 2 : 1));
                i4 = iM6 - ((iM9 + iM10) * (iM == 1 ? 2 : 1));
            } else {
                i4 = iM6;
                i5 = iM5;
            }
            i6 = i5;
            iM2 = mo2Var.m();
            i7 = iM6;
            i8 = i4;
            iM3 = mo2Var.m();
            i9 = iM5;
        }
        int iM11 = mo2Var.m();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i20 = mo2Var.h() ? 0 : i16; i20 <= i16; i20++) {
                mo2Var.m();
                iMax = Math.max(mo2Var.m(), iMax);
                mo2Var.m();
            }
        }
        mo2Var.m();
        mo2Var.m();
        mo2Var.m();
        mo2Var.m();
        mo2Var.m();
        mo2Var.m();
        if (mo2Var.h()) {
            boolean zH = z ? mo2Var.h() : false;
            int i21 = 6;
            if (zH) {
                mo2Var.t(6);
            } else if (mo2Var.h()) {
                int i22 = 0;
                while (i22 < i15) {
                    int i23 = 0;
                    while (i23 < i21) {
                        if (mo2Var.h()) {
                            int iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                            if (i22 > 1) {
                                mo2Var.n();
                            }
                            for (int i24 = 0; i24 < iMin; i24++) {
                                mo2Var.n();
                            }
                        } else {
                            mo2Var.m();
                        }
                        i23 += i22 == 3 ? 3 : 1;
                        i21 = 6;
                    }
                    i22++;
                    i15 = 4;
                    i21 = 6;
                }
            }
        }
        mo2Var.t(2);
        if (mo2Var.h()) {
            mo2Var.t(8);
            mo2Var.m();
            mo2Var.m();
            mo2Var.s();
        }
        int iM12 = mo2Var.m();
        int i25 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i26 = i3;
        int i27 = -1;
        int i28 = -1;
        while (i25 < iM12) {
            if (i25 == 0 || !mo2Var.h()) {
                iM4 = mo2Var.m();
                int iM13 = mo2Var.m();
                int[] iArr3 = new int[iM4];
                int i29 = 0;
                while (i29 < iM4) {
                    iArr3[i29] = (i29 > 0 ? iArr3[i29 - 1] : 0) - (mo2Var.m() + 1);
                    mo2Var.s();
                    i29++;
                }
                int[] iArr4 = new int[iM13];
                int i30 = 0;
                while (i30 < iM13) {
                    iArr4[i30] = mo2Var.m() + 1 + (i30 > 0 ? iArr4[i30 - 1] : 0);
                    mo2Var.s();
                    i30++;
                }
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
                i27 = iM13;
            } else {
                int i31 = i28 + i27;
                int iM14 = (1 - ((mo2Var.h() ? 1 : 0) * 2)) * (mo2Var.m() + 1);
                int i32 = i31 + 1;
                boolean[] zArr = new boolean[i32];
                for (int i33 = 0; i33 <= i31; i33++) {
                    if (mo2Var.h()) {
                        zArr[i33] = true;
                    } else {
                        zArr[i33] = mo2Var.h();
                    }
                }
                int[] iArr5 = new int[i32];
                int[] iArr6 = new int[i32];
                int i34 = 0;
                for (int i35 = i27 - 1; i35 >= 0; i35--) {
                    int i36 = iArrCopyOf[i35] + iM14;
                    if (i36 < 0 && zArr[i28 + i35]) {
                        iArr5[i34] = i36;
                        i34++;
                    }
                }
                if (iM14 < 0 && zArr[i31]) {
                    iArr5[i34] = iM14;
                    i34++;
                }
                iM4 = i34;
                for (int i37 = 0; i37 < i28; i37++) {
                    int i38 = iArr2[i37] + iM14;
                    if (i38 < 0 && zArr[i37]) {
                        iArr5[iM4] = i38;
                        iM4++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, iM4);
                int i39 = 0;
                for (int i40 = i28 - 1; i40 >= 0; i40--) {
                    int i41 = iArr2[i40] + iM14;
                    if (i41 > 0 && zArr[i40]) {
                        iArr6[i39] = i41;
                        i39++;
                    }
                }
                if (iM14 > 0 && zArr[i31]) {
                    iArr6[i39] = iM14;
                    i39++;
                }
                int i42 = i39;
                for (int i43 = 0; i43 < i27; i43++) {
                    int i44 = iArrCopyOf[i43] + iM14;
                    if (i44 > 0 && zArr[i28 + i43]) {
                        iArr6[i42] = i44;
                        i42++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i42);
                iArr2 = iArrCopyOf2;
                i27 = i42;
            }
            i28 = iM4;
            i25++;
            iM12 = iM12;
            iMax = iMax;
            iM2 = iM2;
        }
        int i45 = iMax;
        int i46 = iM2;
        if (mo2Var.h()) {
            int iM15 = mo2Var.m();
            for (int i47 = 0; i47 < iM15; i47++) {
                mo2Var.t(iM11 + 5);
            }
        }
        mo2Var.t(2);
        float f = 1.0f;
        if (mo2Var.h()) {
            if (mo2Var.h()) {
                int i48 = mo2Var.i(8);
                if (i48 == 255) {
                    int i49 = mo2Var.i(16);
                    int i50 = mo2Var.i(16);
                    if (i49 != 0 && i50 != 0) {
                        f = i49 / i50;
                    }
                } else if (i48 < 17) {
                    f = b[i48];
                } else {
                    qt4.y(i48, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (mo2Var.h()) {
                mo2Var.s();
            }
            if (mo2Var.h()) {
                mo2Var.t(3);
                i14 = mo2Var.h() ? 1 : 2;
                if (mo2Var.h()) {
                    int i51 = mo2Var.i(8);
                    int i52 = mo2Var.i(8);
                    mo2Var.t(8);
                    i13 = ex3.i(i51);
                    iJ = ex3.j(i52);
                } else {
                    i13 = -1;
                    iJ = -1;
                }
            } else if (ljfVar == null || (fikVar = (fik) ljfVar.e) == null) {
                i13 = -1;
                iJ = -1;
                i14 = -1;
            } else {
                c98 c98Var4 = (c98) fikVar.b;
                int i53 = ((int[]) fikVar.c)[i26];
                if (c98Var4.size() > i53) {
                    mab mabVar = (mab) c98Var4.get(i53);
                    int i54 = mabVar.a;
                    int i55 = mabVar.b;
                    iJ = mabVar.c;
                    i13 = i54;
                    i14 = i55;
                } else {
                    i13 = -1;
                    iJ = -1;
                    i14 = -1;
                }
            }
            if (mo2Var.h()) {
                mo2Var.m();
                mo2Var.m();
            }
            mo2Var.s();
            if (mo2Var.h()) {
                i8 *= 2;
            }
            i10 = i13;
            i12 = iJ;
            i11 = i14;
        } else {
            i10 = -1;
            i11 = -1;
            i12 = -1;
        }
        return new lab(i16, jabVarJ, iM, i46, iM3, i6, i8, i9, i7, f, i45, i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:482:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ljf m(int i, byte[] bArr, int i2) {
        int[] iArr;
        fik fikVar;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        ghe gheVar;
        boolean[][] zArr;
        int i7;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        int i8;
        boolean zH;
        int i9;
        int i10;
        int i11;
        boolean zH2;
        boolean zH3;
        int iM;
        int i12;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        mo2 mo2Var = new mo2(bArr, i, i2);
        i(mo2Var);
        mo2Var.t(4);
        boolean zH4 = mo2Var.h();
        boolean zH5 = mo2Var.h();
        int i15 = mo2Var.i(6);
        int i16 = i15 + 1;
        int i17 = mo2Var.i(3);
        mo2Var.t(17);
        jab jabVarJ = j(mo2Var, true, i17, null);
        for (int i18 = mo2Var.h() ? 0 : i17; i18 <= i17; i18++) {
            mo2Var.m();
            mo2Var.m();
            mo2Var.m();
        }
        int i19 = mo2Var.i(6);
        int iM2 = mo2Var.m() + 1;
        int i20 = 6;
        uvc uvcVar = new uvc(c98.r(jabVarJ), new int[1]);
        boolean z4 = i16 >= 2 && iM2 >= 2;
        boolean z5 = zH4 && zH5;
        int i21 = i19 + 1;
        boolean z6 = i21 >= i16;
        if (!z4 || !z5 || !z6) {
            return new ljf((ghe) null, uvcVar, (kzi) null, (fik) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iM2, i21);
        int i22 = 1;
        int[] iArr5 = new int[iM2];
        int[] iArr6 = new int[iM2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i23 = 1; i23 < iM2; i23++) {
            int i24 = 0;
            for (int i25 = 0; i25 <= i19; i25++) {
                if (mo2Var.h()) {
                    iArr4[i23][i24] = i25;
                    iArr6[i23] = i25;
                    i24++;
                }
                iArr5[i23] = i24;
            }
        }
        if (mo2Var.h()) {
            mo2Var.t(64);
            if (mo2Var.h()) {
                mo2Var.m();
            }
            int iM3 = mo2Var.m();
            int i26 = 0;
            while (i26 < iM3) {
                mo2Var.m();
                if (i26 == 0 || mo2Var.h()) {
                    boolean zH6 = mo2Var.h();
                    boolean zH7 = mo2Var.h();
                    z3 = zH6;
                    z2 = zH7;
                    if (zH6 || zH7) {
                        zH = mo2Var.h();
                        if (zH) {
                            mo2Var.t(19);
                        }
                        mo2Var.t(8);
                        if (zH) {
                            mo2Var.t(4);
                        }
                        mo2Var.t(15);
                        i10 = zH6;
                        i9 = zH7;
                    }
                    i11 = 0;
                    while (i11 <= i17) {
                        zH2 = mo2Var.h();
                        if (!zH2) {
                            zH2 = mo2Var.h();
                        }
                        if (zH2) {
                            mo2Var.m();
                            zH3 = false;
                        } else {
                            zH3 = mo2Var.h();
                        }
                        if (zH3) {
                            iM = 0;
                        } else {
                            iM = mo2Var.m();
                        }
                        int[][] iArr7 = iArr4;
                        i12 = i10 + i9;
                        int[] iArr8 = iArr6;
                        i13 = 0;
                        while (i13 < i12) {
                            int i27 = i12;
                            for (i14 = 0; i14 <= iM; i14++) {
                                mo2Var.m();
                                mo2Var.m();
                                if (zH) {
                                    mo2Var.m();
                                    mo2Var.m();
                                }
                                mo2Var.s();
                            }
                            i13++;
                            i12 = i27;
                        }
                        i11++;
                        i26 = i26;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i26++;
                } else {
                    z3 = false;
                    z2 = false;
                }
                zH = false;
                i10 = z3;
                i9 = z2;
                i11 = 0;
                while (i11 <= i17) {
                    zH2 = mo2Var.h();
                    if (!zH2) {
                        zH2 = mo2Var.h();
                    }
                    if (zH2) {
                        mo2Var.m();
                        zH3 = false;
                    } else {
                        zH3 = mo2Var.h();
                    }
                    if (zH3) {
                        iM = mo2Var.m();
                    } else {
                        iM = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i12 = i10 + i9;
                    int[] iArr10 = iArr6;
                    i13 = 0;
                    while (i13 < i12) {
                        int i28 = i12;
                        while (i14 <= iM) {
                            mo2Var.m();
                            mo2Var.m();
                            if (zH) {
                                mo2Var.m();
                                mo2Var.m();
                            }
                            mo2Var.s();
                        }
                        i13++;
                        i12 = i28;
                    }
                    i11++;
                    i26 = i26;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i26++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!mo2Var.h()) {
            return new ljf((ghe) null, uvcVar, (kzi) null, (fik) null);
        }
        int i29 = mo2Var.e;
        if (i29 > 0) {
            mo2Var.t(8 - i29);
        }
        jab jabVarJ2 = j(mo2Var, false, i17, jabVarJ);
        boolean zH8 = mo2Var.h();
        boolean[] zArr3 = new boolean[16];
        int i30 = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            boolean zH9 = mo2Var.h();
            zArr3[i31] = zH9;
            if (zH9) {
                i30++;
            }
        }
        if (i30 == 0 || !zArr3[1]) {
            return new ljf((ghe) null, uvcVar, (kzi) null, (fik) null);
        }
        int[] iArr13 = new int[i30];
        for (int i32 = 0; i32 < i30 - (zH8 ? 1 : 0); i32++) {
            iArr13[i32] = mo2Var.i(3);
        }
        int[] iArr14 = new int[i30 + 1];
        if (zH8) {
            int i33 = 1;
            while (i33 < i30) {
                int[] iArr15 = iArr14;
                for (int i34 = 0; i34 < i33; i34++) {
                    iArr15[i33] = iArr13[i34] + 1 + iArr15[i33];
                }
                i33++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i30] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i16, i30);
        int[] iArr17 = new int[i16];
        iArr17[0] = 0;
        boolean zH10 = mo2Var.h();
        int i35 = 1;
        while (i35 < i16) {
            if (zH10) {
                i8 = i35;
                iArr17[i8] = mo2Var.i(i20);
            } else {
                i8 = i35;
                iArr17[i8] = i8;
            }
            if (zH8) {
                int i36 = 0;
                while (i36 < i30) {
                    int i37 = i36 + 1;
                    iArr16[i8][i36] = (iArr17[i8] & ((1 << iArr[i37]) - 1)) >> iArr[i36];
                    i36 = i37;
                }
            } else {
                int i38 = 0;
                while (i38 < i30) {
                    int i39 = i38;
                    iArr16[i8][i39] = mo2Var.i(iArr13[i38] + 1);
                    i38 = i39 + 1;
                }
            }
            i35 = i8 + 1;
            i20 = 6;
        }
        int[] iArr18 = new int[i21];
        int i40 = 1;
        int i41 = 0;
        while (i41 < i16) {
            iArr18[iArr17[i41]] = -1;
            int[] iArr19 = iArr18;
            int i42 = 0;
            int i43 = 0;
            while (i42 < 16) {
                if (zArr3[i42]) {
                    if (i42 == i22) {
                        iArr19[iArr17[i41]] = iArr16[i41][i43];
                    }
                    i43++;
                }
                i42++;
                i22 = 1;
            }
            if (i41 > 0) {
                int i44 = 0;
                while (true) {
                    if (i44 >= i41) {
                        i40++;
                        break;
                    }
                    int i45 = i44;
                    if (iArr19[iArr17[i41]] == iArr19[iArr17[i44]]) {
                        break;
                    }
                    i44 = i45 + 1;
                }
            }
            i41++;
            iArr18 = iArr19;
            i22 = 1;
        }
        int[] iArr20 = iArr18;
        int i46 = mo2Var.i(4);
        if (i40 < 2 || i46 == 0) {
            return new ljf((ghe) null, uvcVar, (kzi) null, (fik) null);
        }
        int[] iArr21 = new int[i40];
        for (int i47 = 0; i47 < i40; i47++) {
            iArr21[i47] = mo2Var.i(i46);
        }
        int[] iArr22 = new int[i21];
        for (int i48 = 0; i48 < i16; i48++) {
            iArr22[Math.min(iArr17[i48], i19)] = i48;
        }
        z88 z88VarL = c98.l();
        int i49 = 0;
        while (i49 <= i19) {
            int[] iArr23 = iArr22;
            int i50 = i40;
            int iMin = Math.min(iArr20[i49], i50 - 1);
            z88VarL.c(new iab(iArr23[i49], iMin >= 0 ? iArr21[iMin] : -1));
            i49++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i40 = i50;
        }
        int[] iArr24 = iArr17;
        ghe gheVarH = z88VarL.h();
        if (((iab) gheVarH.get(0)).b == -1) {
            return new ljf((ghe) null, uvcVar, (kzi) null, (fik) null);
        }
        int i51 = 1;
        while (true) {
            if (i51 > i19) {
                i51 = -1;
                break;
            }
            if (((iab) gheVarH.get(i51)).b != -1) {
                break;
            }
            i51++;
        }
        if (i51 == -1) {
            return new ljf((ghe) null, uvcVar, (kzi) null, (fik) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i16, i16);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i16, i16);
        for (int i52 = 1; i52 < i16; i52++) {
            for (int i53 = 0; i53 < i52; i53++) {
                boolean[] zArr6 = zArr4[i52];
                boolean[] zArr7 = zArr5[i52];
                boolean zH11 = mo2Var.h();
                zArr7[i53] = zH11;
                zArr6[i53] = zH11;
            }
        }
        for (int i54 = 1; i54 < i16; i54++) {
            int i55 = 0;
            while (i55 < i15) {
                boolean[][] zArr8 = zArr4;
                for (int i56 = 0; i56 < i54; i56++) {
                    boolean[] zArr9 = zArr5[i54];
                    if (zArr9[i56] && zArr5[i56][i55]) {
                        zArr9[i55] = true;
                        break;
                    }
                }
                i55++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i21];
        for (int i57 = 0; i57 < i16; i57++) {
            int i58 = 0;
            for (int i59 = 0; i59 < i57; i59++) {
                i58 += zArr10[i57][i59] ? 1 : 0;
            }
            iArr25[iArr24[i57]] = i58;
        }
        int i60 = 0;
        for (int i61 = 0; i61 < i16; i61++) {
            if (iArr25[iArr24[i61]] == 0) {
                i60++;
            }
        }
        if (i60 > 1) {
            return new ljf((ghe) null, uvcVar, (kzi) null, (fik) null);
        }
        int[] iArr26 = new int[i16];
        int[] iArr27 = new int[iM2];
        if (mo2Var.h()) {
            int i62 = 0;
            while (i62 < i16) {
                int i63 = i62;
                iArr26[i63] = mo2Var.i(3);
                i62 = i63 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i16, i17);
        }
        int i64 = 0;
        while (i64 < iM2) {
            int i65 = i64;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i66 = 0; i66 < iArr5[i65]; i66++) {
                iMax = Math.max(iMax, iArr28[((iab) gheVarH.get(iArr11[i65][i66])).a]);
            }
            iArr27[i65] = iMax + 1;
            i64 = i65 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (mo2Var.h()) {
            int i67 = 0;
            while (i67 < i15) {
                int i68 = i67 + 1;
                int i69 = i68;
                while (i69 < i16) {
                    if (zArr10[i69][i67]) {
                        mo2Var.t(3);
                    }
                    i69++;
                    i15 = i15;
                }
                i67 = i68;
            }
        }
        mo2Var.s();
        int iM4 = mo2Var.m() + 1;
        z88 z88VarL2 = c98.l();
        z88VarL2.c(jabVarJ);
        if (iM4 > 1) {
            z88VarL2.c(jabVarJ2);
            for (int i70 = 2; i70 < iM4; i70++) {
                jabVarJ2 = j(mo2Var, mo2Var.h(), i17, jabVarJ2);
                z88VarL2.c(jabVarJ2);
            }
        }
        ghe gheVarH2 = z88VarL2.h();
        int iM5 = mo2Var.m() + iM2;
        if (iM5 > iM2) {
            return new ljf((ghe) null, uvcVar, (kzi) null, (fik) null);
        }
        int i71 = mo2Var.i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM5, i21);
        int[] iArr29 = new int[iM5];
        int i72 = 0;
        int[] iArr30 = new int[iM5];
        int i73 = 0;
        while (i73 < iM2) {
            iArr29[i73] = i72;
            iArr30[i73] = iArr12[i73];
            if (i71 == 0) {
                i7 = i73;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i7], i72, iArr5[i7], true);
                iArr2[i7] = iArr5[i7];
            } else {
                i7 = i73;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (i71 == 1) {
                    int i74 = iArr12[i7];
                    for (int i75 = 0; i75 < iArr5[i7]; i75++) {
                        zArr2[i7][i75] = iArr11[i7][i75] == i74;
                    }
                    iArr2[i7] = 1;
                } else {
                    i72 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i73 = i7 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i72 = 0;
            i73 = i7 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i21];
        int i76 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i21;
        iArr34[i72] = iM5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i77 = 1;
        int i78 = 0;
        while (i77 < iM5) {
            if (i71 == i76) {
                for (int i79 = 0; i79 < iArr5[i77]; i79++) {
                    zArr14[i77][i79] = mo2Var.h();
                    int i80 = iArr31[i77];
                    boolean z7 = zArr14[i77][i79];
                    iArr31[i77] = i80 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr30[i77] = iArr11[i77][i79];
                    }
                }
            }
            if (i78 == 0) {
                i6 = 0;
                if (iArr11[i77][0] == 0 && zArr14[i77][0]) {
                    for (int i81 = 1; i81 < iArr5[i77]; i81++) {
                        if (iArr11[i77][i81] == i51 && zArr14[i77][i51]) {
                            i78 = i77;
                        }
                    }
                }
            } else {
                i6 = 0;
            }
            int i82 = i6;
            while (i82 < iArr5[i77]) {
                if (iM4 > 1) {
                    zArr15[i77][i82] = zArr14[i77][i82];
                    gheVar = gheVarH2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iC = gp5.c(iM4);
                    if (!zArr[i77][i82]) {
                        int i83 = ((iab) gheVarH.get(iArr11[i77][i82])).a;
                        int i84 = i6;
                        while (i84 < i82) {
                            int i85 = i84;
                            if (zArr12[i83][((iab) gheVarH.get(iArr11[i77][i85])).a]) {
                                zArr[i77][i82] = true;
                                break;
                            }
                            i84 = i85 + 1;
                        }
                    }
                    if (zArr[i77][i82]) {
                        if (i78 <= 0 || i77 != i78) {
                            mo2Var.t(iC);
                        } else {
                            iArr33[i82] = mo2Var.i(iC);
                        }
                    }
                } else {
                    gheVar = gheVarH2;
                    zArr = zArr15;
                }
                i82++;
                gheVarH2 = gheVar;
                zArr15 = zArr;
            }
            ghe gheVar2 = gheVarH2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i77] == 1 && iArr25[iArr30[i77]] > 0) {
                mo2Var.s();
            }
            i77++;
            gheVarH2 = gheVar2;
            zArr15 = zArr16;
            i76 = 2;
        }
        ghe gheVar3 = gheVarH2;
        boolean[][] zArr17 = zArr15;
        if (i78 == 0) {
            return new ljf((ghe) null, uvcVar, (kzi) null, (fik) null);
        }
        int iM6 = mo2Var.m();
        int i86 = iM6 + 1;
        oc9.p(i86, "expectedSize");
        oc9.p(i86, "initialCapacity");
        int[] iArr35 = new int[i16];
        Object[] objArrCopyOf = new Object[i86];
        int i87 = 0;
        int i88 = 0;
        boolean z8 = false;
        while (i87 < i86) {
            int i89 = i87;
            int i90 = mo2Var.i(16);
            int i91 = mo2Var.i(16);
            boolean z9 = z8;
            if (mo2Var.h()) {
                i3 = mo2Var.i(2);
                if (i3 == 3) {
                    mo2Var.s();
                }
                i4 = mo2Var.i(4);
                i5 = mo2Var.i(4);
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            if (mo2Var.h()) {
                int iM7 = mo2Var.m();
                int iM8 = mo2Var.m();
                int iM9 = mo2Var.m();
                int iM10 = mo2Var.m();
                i90 -= (iM7 + iM8) * ((i3 == 1 || i3 == 2) ? 2 : 1);
                i91 -= (iM9 + iM10) * (i3 == 1 ? 2 : 1);
            }
            kab kabVar = new kab(i3, i4, i5, i90, i91);
            int iB = r88.b(objArrCopyOf.length, i88 + 1);
            if (iB > objArrCopyOf.length || z9) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                z = false;
            } else {
                z = z9;
            }
            objArrCopyOf[i88] = kabVar;
            i88++;
            i87 = i89 + 1;
            z8 = z;
        }
        if (i86 <= 1 || !mo2Var.h()) {
            for (int i92 = 1; i92 < i16; i92++) {
                iArr35[i92] = Math.min(i92, iM6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iC2 = gp5.c(i86);
            for (int i93 = 1; i93 < i16; i93++) {
                iArr35[i93] = mo2Var.i(iC2);
            }
        }
        ghe gheVarJ = c98.j(objArrCopyOf, i88);
        kzi kziVar = new kzi();
        kziVar.a = c98.n(gheVarJ);
        kziVar.b = iArr35;
        mo2Var.t(2);
        for (int i94 = 1; i94 < i16; i94++) {
            if (iArr25[iArr24[i94]] == 0) {
                mo2Var.s();
            }
        }
        for (int i95 = 1; i95 < iM5; i95++) {
            boolean zH12 = mo2Var.h();
            int i96 = 0;
            while (i96 < iArr32[i95]) {
                if ((i96 <= 0 || !zH12) ? i96 == 0 : mo2Var.h()) {
                    for (int i97 = 0; i97 < iArr5[i95]; i97++) {
                        if (zArr17[i95][i97]) {
                            mo2Var.m();
                        }
                    }
                    mo2Var.m();
                    mo2Var.m();
                }
                i96++;
            }
        }
        int iM11 = mo2Var.m() + 2;
        if (mo2Var.h()) {
            mo2Var.t(iM11);
        } else {
            for (int i98 = 1; i98 < i16; i98++) {
                for (int i99 = 0; i99 < i98; i99++) {
                    if (zArr10[i98][i99]) {
                        mo2Var.t(iM11);
                    }
                }
            }
        }
        int iM12 = mo2Var.m();
        for (int i100 = 1; i100 <= iM12; i100++) {
            mo2Var.t(8);
        }
        if (mo2Var.h()) {
            int i101 = mo2Var.e;
            if (i101 > 0) {
                mo2Var.t(8 - i101);
            }
            if (!mo2Var.h() ? mo2Var.h() : true) {
                mo2Var.s();
            }
            boolean zH13 = mo2Var.h();
            boolean zH14 = mo2Var.h();
            if (zH13 || zH14) {
                for (int i102 = 0; i102 < iM2; i102++) {
                    for (int i103 = 0; i103 < iArr32[i102]; i103++) {
                        boolean zH15 = zH13 ? mo2Var.h() : false;
                        boolean zH16 = zH14 ? mo2Var.h() : false;
                        if (zH15) {
                            mo2Var.t(32);
                        }
                        if (zH16) {
                            mo2Var.t(18);
                        }
                    }
                }
            }
            boolean zH17 = mo2Var.h();
            int i104 = zH17 ? mo2Var.i(4) + 1 : i16;
            oc9.p(i104, "expectedSize");
            oc9.p(i104, "initialCapacity");
            int[] iArr36 = new int[i16];
            Object[] objArrCopyOf2 = new Object[i104];
            int i105 = 0;
            int i106 = 0;
            boolean z10 = false;
            while (i105 < i104) {
                mo2Var.t(3);
                int i107 = mo2Var.h() ? 1 : 2;
                int i108 = ex3.i(mo2Var.i(8));
                boolean z11 = zH17;
                int iJ = ex3.j(mo2Var.i(8));
                mo2Var.t(8);
                mab mabVar = new mab(i108, i107, iJ);
                int iB2 = r88.b(objArrCopyOf2.length, i106 + 1);
                if (iB2 > objArrCopyOf2.length || z10) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iB2);
                    z10 = false;
                }
                objArrCopyOf2[i106] = mabVar;
                i105++;
                i106++;
                zH17 = z11;
                z10 = z10;
            }
            if (zH17 && i104 > 1) {
                for (int i109 = 0; i109 < i16; i109++) {
                    iArr36[i109] = mo2Var.i(4);
                }
            }
            fikVar = new fik(c98.j(objArrCopyOf2, i106), iArr36);
        } else {
            fikVar = null;
        }
        return new ljf(gheVarH, new uvc(gheVar3, iArr33), kziVar, fikVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[PHI: r19
  0x01ae: PHI (r19v6 float) = (r19v3 float), (r19v9 float), (r19v3 float), (r19v3 float), (r19v10 float) binds: [B:94:0x0190, B:104:0x01b5, B:98:0x01a6, B:99:0x01a8, B:100:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public static oab n(int i, byte[] bArr, int i2) {
        int iM;
        int iM2;
        int i3;
        boolean z;
        int i4;
        int iM3;
        boolean z2;
        boolean zH;
        int i5;
        int i6;
        int i7;
        int iM4;
        int i8;
        float f;
        int i9;
        int i10;
        int i11;
        float f2;
        int i12;
        int i13;
        int iJ;
        boolean zH2;
        boolean zH3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        mo2 mo2Var = new mo2(bArr, i + 1, i2);
        int i19 = mo2Var.i(8);
        int i20 = mo2Var.i(8);
        int i21 = mo2Var.i(8);
        int iM5 = mo2Var.m();
        if (i19 == 100 || i19 == 110 || i19 == 122 || i19 == 244 || i19 == 44 || i19 == 83 || i19 == 86 || i19 == 118 || i19 == 128 || i19 == 138) {
            iM = mo2Var.m();
            boolean zH4 = iM == 3 ? mo2Var.h() : false;
            int iM6 = mo2Var.m();
            iM2 = mo2Var.m();
            mo2Var.s();
            if (mo2Var.h()) {
                int i22 = iM != 3 ? 8 : 12;
                i3 = 16;
                int i23 = 0;
                while (i23 < i22) {
                    if (mo2Var.h()) {
                        int i24 = i23 < 6 ? 16 : 64;
                        int iN = 8;
                        int i25 = 8;
                        for (int i26 = 0; i26 < i24; i26++) {
                            if (iN != 0) {
                                iN = ((mo2Var.n() + i25) + np0.n) % np0.n;
                            }
                            if (iN != 0) {
                                i25 = iN;
                            }
                        }
                    }
                    i23++;
                }
            } else {
                i3 = 16;
            }
            z = zH4;
            i4 = iM6;
        } else {
            iM = 1;
            i3 = 16;
            i4 = 0;
            z = false;
            iM2 = 0;
        }
        int iM7 = mo2Var.m() + 4;
        int iM8 = mo2Var.m();
        if (iM8 != 0) {
            if (iM8 == 1) {
                boolean zH5 = mo2Var.h();
                mo2Var.n();
                mo2Var.n();
                i19 = i19;
                long jM = mo2Var.m();
                iM8 = iM8;
                for (int i27 = 0; i27 < jM; i27++) {
                    mo2Var.m();
                }
                iM2 = iM2;
                z2 = zH5;
                iM3 = 0;
            } else {
                iM3 = 0;
            }
            mo2Var.m();
            mo2Var.s();
            int iM9 = mo2Var.m() + 1;
            int iM10 = mo2Var.m() + 1;
            zH = mo2Var.h();
            i5 = 2 - (zH ? 1 : 0);
            int i28 = iM10 * i5;
            if (!zH) {
                mo2Var.s();
            }
            mo2Var.s();
            i6 = iM9 * 16;
            i7 = i28 * 16;
            if (mo2Var.h()) {
                int iM11 = mo2Var.m();
                int iM12 = mo2Var.m();
                int iM13 = mo2Var.m();
                int iM14 = mo2Var.m();
                if (iM == 0) {
                    i17 = 1;
                } else {
                    if (iM == 3) {
                        i17 = 1;
                    } else {
                        i17 = 2;
                    }
                    if (iM == 1) {
                        i18 = 2;
                    } else {
                        i18 = 1;
                    }
                    i5 *= i18;
                }
                i6 -= (iM11 + iM12) * i17;
                i7 -= (iM13 + iM14) * i5;
            }
            int i29 = i7;
            int i30 = i6;
            int i31 = i19;
            iM4 = ((i31 != 44 || i31 == 86 || i31 == 100 || i31 == 110 || i31 == 122 || i31 == 244) && (i20 & 16) != 0) ? 0 : i3;
            i8 = -1;
            f = 1.0f;
            if (mo2Var.h()) {
                if (!mo2Var.h()) {
                    i14 = mo2Var.i(8);
                    if (i14 == 255) {
                        int i32 = i3;
                        i15 = mo2Var.i(i32);
                        i16 = mo2Var.i(i32);
                        if (i15 != 0 && i16 != 0) {
                            f = i15 / i16;
                        }
                    } else if (i14 < 17) {
                        f = b[i14];
                    } else {
                        qt4.y(i14, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (mo2Var.h()) {
                    mo2Var.s();
                }
                if (mo2Var.h()) {
                    mo2Var.t(3);
                    if (mo2Var.h()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (mo2Var.h()) {
                        int i33 = mo2Var.i(8);
                        int i34 = mo2Var.i(8);
                        mo2Var.t(8);
                        i8 = ex3.i(i33);
                        iJ = ex3.j(i34);
                    } else {
                        iJ = -1;
                    }
                } else {
                    i13 = -1;
                    iJ = -1;
                }
                if (mo2Var.h()) {
                    mo2Var.m();
                    mo2Var.m();
                }
                if (mo2Var.h()) {
                    mo2Var.t(65);
                }
                zH2 = mo2Var.h();
                if (zH2) {
                    o(mo2Var);
                }
                zH3 = mo2Var.h();
                if (zH3) {
                    o(mo2Var);
                }
                if (zH2 || zH3) {
                    mo2Var.s();
                }
                mo2Var.s();
                if (mo2Var.h()) {
                    mo2Var.s();
                    mo2Var.m();
                    mo2Var.m();
                    mo2Var.m();
                    mo2Var.m();
                    iM4 = mo2Var.m();
                    mo2Var.m();
                }
                f2 = f;
                i12 = i8;
                i10 = i13;
                i11 = iJ;
                i9 = iM4;
            } else {
                iM7 = iM7;
                i9 = iM4;
                i10 = -1;
                i11 = -1;
                f2 = 1.0f;
                i12 = -1;
            }
            return new oab(i31, i20, i21, iM5, i30, i29, f2, i4, iM2, z, zH, iM7, iM8, iM3, z2, i12, i10, i11, i9);
        }
        iM3 = mo2Var.m() + 4;
        z2 = false;
        mo2Var.m();
        mo2Var.s();
        int iM15 = mo2Var.m() + 1;
        int iM16 = mo2Var.m() + 1;
        zH = mo2Var.h();
        i5 = 2 - (zH ? 1 : 0);
        int i210 = iM16 * i5;
        if (!zH) {
            mo2Var.s();
        }
        mo2Var.s();
        i6 = iM15 * 16;
        i7 = i210 * 16;
        if (mo2Var.h()) {
            int iM17 = mo2Var.m();
            int iM18 = mo2Var.m();
            int iM19 = mo2Var.m();
            int iM110 = mo2Var.m();
            if (iM == 0) {
                i17 = 1;
            } else {
                if (iM == 3) {
                    i17 = 1;
                } else {
                    i17 = 2;
                }
                if (iM == 1) {
                    i18 = 2;
                } else {
                    i18 = 1;
                }
                i5 *= i18;
            }
            i6 -= (iM17 + iM18) * i17;
            i7 -= (iM19 + iM110) * i5;
        }
        int i211 = i7;
        int i35 = i6;
        int i36 = i19;
        if (i36 != 44) {
        }
        i8 = -1;
        f = 1.0f;
        if (mo2Var.h()) {
            if (!mo2Var.h()) {
                i14 = mo2Var.i(8);
                if (i14 == 255) {
                    int i37 = i3;
                    i15 = mo2Var.i(i37);
                    i16 = mo2Var.i(i37);
                    if (i15 != 0) {
                        f = i15 / i16;
                    }
                } else if (i14 < 17) {
                    f = b[i14];
                } else {
                    qt4.y(i14, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (mo2Var.h()) {
                mo2Var.s();
            }
            if (mo2Var.h()) {
                mo2Var.t(3);
                if (mo2Var.h()) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (mo2Var.h()) {
                    int i38 = mo2Var.i(8);
                    int i39 = mo2Var.i(8);
                    mo2Var.t(8);
                    i8 = ex3.i(i38);
                    iJ = ex3.j(i39);
                } else {
                    iJ = -1;
                }
            } else {
                i13 = -1;
                iJ = -1;
            }
            if (mo2Var.h()) {
                mo2Var.m();
                mo2Var.m();
            }
            if (mo2Var.h()) {
                mo2Var.t(65);
            }
            zH2 = mo2Var.h();
            if (zH2) {
                o(mo2Var);
            }
            zH3 = mo2Var.h();
            if (zH3) {
                o(mo2Var);
            }
            if (zH2) {
                mo2Var.s();
            } else {
                mo2Var.s();
            }
            mo2Var.s();
            if (mo2Var.h()) {
                mo2Var.s();
                mo2Var.m();
                mo2Var.m();
                mo2Var.m();
                mo2Var.m();
                iM4 = mo2Var.m();
                mo2Var.m();
            }
            f2 = f;
            i12 = i8;
            i10 = i13;
            i11 = iJ;
            i9 = iM4;
        } else {
            iM7 = iM7;
            i9 = iM4;
            i10 = -1;
            i11 = -1;
            f2 = 1.0f;
            i12 = -1;
        }
        return new oab(i36, i20, i21, iM5, i35, i211, f2, i4, iM2, z, zH, iM7, iM8, iM3, z2, i12, i10, i11, i9);
    }

    public static void o(mo2 mo2Var) {
        int iM = mo2Var.m() + 1;
        mo2Var.t(8);
        for (int i = 0; i < iM; i++) {
            mo2Var.m();
            mo2Var.m();
            mo2Var.s();
        }
        mo2Var.t(20);
    }

    public static int p(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static void q(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                ore.n(zo5.v(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
                return;
            }
        }
    }
}
