package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class lke implements Serializable {
    public final ArrayList a;

    public lke(ArrayList arrayList) {
        this.a = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x023f  */
    /* JADX WARN: Code duplicated, block: B:183:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:192:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:194:0x0305  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[PHI: r18 r24
  0x0094: PHI (r18v15 int) = 
  (r18v7 int)
  (r18v8 int)
  (r18v9 int)
  (r18v10 int)
  (r18v11 int)
  (r18v12 int)
  (r18v13 int)
  (r18v13 int)
  (r18v16 int)
 binds: [B:52:0x0106, B:48:0x00f5, B:44:0x00e4, B:40:0x00d3, B:36:0x00c2, B:32:0x00af, B:28:0x00a1, B:30:0x00a5, B:25:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r24v28 byte) = 
  (r24v12 byte)
  (r24v12 byte)
  (r24v12 byte)
  (r24v12 byte)
  (r24v12 byte)
  (r24v12 byte)
  (r24v12 byte)
  (r24v19 byte)
  (r24v12 byte)
 binds: [B:52:0x0106, B:48:0x00f5, B:44:0x00e4, B:40:0x00d3, B:36:0x00c2, B:32:0x00af, B:28:0x00a1, B:30:0x00a5, B:25:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:297:0x02fc A[SYNTHETIC] */
    public static final lke a(fka fkaVar) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str2;
        int i11;
        int i12;
        String str3;
        int i13;
        int iU;
        int i14;
        int i15;
        String strX;
        int i16;
        Throwable th;
        Iterator it;
        int iD;
        String str4;
        int i17;
        int iJ = ch3.J(fkaVar);
        ArrayList arrayList = new ArrayList();
        for (int i18 = 0; i18 < iJ; i18++) {
            int iJ2 = ch3.J(fkaVar);
            arrayList.add(new ArrayList());
            int i19 = 0;
            while (i19 < iJ2) {
                int iU2 = ch3.U(fkaVar);
                int i20 = 0;
                String strW = null;
                int i21 = 5;
                int i22 = 1;
                puc pucVar = null;
                zic zicVarB = null;
                while (i20 < iU2) {
                    String strS0 = fkaVar.S0();
                    if (strS0 != null) {
                        int i23 = 4;
                        switch (strS0.hashCode()) {
                            case -1183762788:
                                i = iJ;
                                i2 = iJ2;
                                i3 = i19;
                                i4 = iU2;
                                i5 = i20;
                                str = strW;
                                i6 = i21;
                                i7 = i22;
                                if (strS0.equals("intent")) {
                                    String strW2 = ch3.W(fkaVar);
                                    int[] iArrH = qt4.H(4);
                                    int length = iArrH.length;
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 < length) {
                                            i9 = iArrH[i24];
                                            i8 = 1;
                                            if (i9 == 1) {
                                                i10 = i23;
                                                str2 = "DEFAULT";
                                            } else if (i9 != 2) {
                                                i10 = i23;
                                                if (i9 == 3) {
                                                    str2 = "NEGATIVE";
                                                } else {
                                                    if (i9 != i10) {
                                                        throw null;
                                                    }
                                                    str2 = "UNKNOWN";
                                                }
                                            } else {
                                                i10 = i23;
                                                str2 = "POSITIVE";
                                            }
                                            if (!str2.equals(strW2)) {
                                                i24++;
                                                i23 = i10;
                                            }
                                        } else {
                                            i8 = 1;
                                            i9 = 0;
                                        }
                                    }
                                    i22 = i9 == 0 ? i8 : i9;
                                }
                                strW = str;
                                i20 = i5 + 1;
                                iJ = i;
                                iJ2 = i2;
                                i19 = i3;
                                iU2 = i4;
                                i21 = i6;
                                break;
                            case 3556653:
                                i = iJ;
                                i2 = iJ2;
                                i3 = i19;
                                i4 = iU2;
                                i5 = i20;
                                str = strW;
                                i6 = i21;
                                i7 = i22;
                                if (strS0.equals("text")) {
                                    strW = ch3.W(fkaVar);
                                    i22 = i7;
                                    i20 = i5 + 1;
                                    iJ = i;
                                    iJ2 = i2;
                                    i19 = i3;
                                    iU2 = i4;
                                    i21 = i6;
                                }
                                break;
                            case 3575610:
                                i = iJ;
                                i2 = iJ2;
                                i3 = i19;
                                i4 = iU2;
                                i5 = i20;
                                str = strW;
                                i6 = i21;
                                i7 = i22;
                                if (strS0.equals("type")) {
                                    String strW3 = ch3.W(fkaVar);
                                    int[] iArrH2 = qt4.H(5);
                                    int length2 = iArrH2.length;
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 < length2) {
                                            i11 = iArrH2[i25];
                                            if (!iic.l(i11).equals(strW3)) {
                                                i25++;
                                            }
                                        } else {
                                            i11 = 0;
                                        }
                                    }
                                    i6 = i11 == 0 ? 5 : i11;
                                    i22 = i7;
                                    strW = str;
                                    i20 = i5 + 1;
                                    iJ = i;
                                    iJ2 = i2;
                                    i19 = i3;
                                    iU2 = i4;
                                    i21 = i6;
                                }
                                break;
                            case 100313435:
                                i = iJ;
                                i2 = iJ2;
                                i3 = i19;
                                i4 = iU2;
                                i5 = i20;
                                str = strW;
                                i6 = i21;
                                i7 = i22;
                                if (strS0.equals("image")) {
                                    l40 l40VarB = l40.b(fkaVar);
                                    pucVar = l40VarB instanceof puc ? (puc) l40VarB : null;
                                    i22 = i7;
                                    strW = str;
                                    i20 = i5 + 1;
                                    iJ = i;
                                    iJ2 = i2;
                                    i19 = i3;
                                    iU2 = i4;
                                    i21 = i6;
                                }
                                break;
                            case 954925063:
                                String str5 = "message";
                                if (strS0.equals("message")) {
                                    s60 s60Var = new s60();
                                    i = iJ;
                                    int iU3 = ch3.U(fkaVar);
                                    if (iU3 == 0) {
                                        i2 = iJ2;
                                        i3 = i19;
                                        i4 = iU2;
                                        i5 = i20;
                                        str = strW;
                                        i6 = i21;
                                        i7 = i22;
                                        zicVarB = null;
                                    } else {
                                        i2 = iJ2;
                                        int i26 = 0;
                                        while (i26 < iU3) {
                                            String strS1 = fkaVar.S0();
                                            strS1.getClass();
                                            byte b = -1;
                                            switch (strS1.hashCode()) {
                                                case -1180332746:
                                                    i12 = iU3;
                                                    if (strS1.equals("isLive")) {
                                                        b = 0;
                                                    }
                                                    break;
                                                case -186259716:
                                                    i12 = iU3;
                                                    if (strS1.equals("detectShare")) {
                                                        b = 1;
                                                    }
                                                    break;
                                                case -8339209:
                                                    i12 = iU3;
                                                    if (strS1.equals("elements")) {
                                                        b = 2;
                                                    }
                                                    break;
                                                case 98494:
                                                    i12 = iU3;
                                                    if (strS1.equals("cid")) {
                                                        b = 3;
                                                    }
                                                    break;
                                                case 3321850:
                                                    i12 = iU3;
                                                    if (strS1.equals("link")) {
                                                        b = 4;
                                                    }
                                                    break;
                                                case 3556653:
                                                    i12 = iU3;
                                                    if (strS1.equals("text")) {
                                                        b = 5;
                                                    }
                                                    break;
                                                case 538738099:
                                                    i12 = iU3;
                                                    if (strS1.equals("attaches")) {
                                                        b = 6;
                                                    }
                                                    break;
                                                default:
                                                    i12 = iU3;
                                                    break;
                                            }
                                            switch (b) {
                                                case 0:
                                                    str3 = str5;
                                                    strW = strW;
                                                    i13 = i21;
                                                    s60Var.d = ch3.L(fkaVar);
                                                    i26++;
                                                    iU3 = i12;
                                                    i19 = i19;
                                                    i22 = i22;
                                                    str5 = str3;
                                                    iU2 = iU2;
                                                    i20 = i20;
                                                    strW = strW;
                                                    i21 = i13;
                                                    break;
                                                case 1:
                                                    str3 = str5;
                                                    strW = strW;
                                                    i13 = i21;
                                                    s60Var.c = ch3.L(fkaVar);
                                                    i26++;
                                                    iU3 = i12;
                                                    i19 = i19;
                                                    i22 = i22;
                                                    str5 = str3;
                                                    iU2 = iU2;
                                                    i20 = i20;
                                                    strW = strW;
                                                    i21 = i13;
                                                    break;
                                                case 2:
                                                    str3 = str5;
                                                    strW = strW;
                                                    i13 = i21;
                                                    s60Var.g = ch3.f0(fkaVar, new ahc(2));
                                                    i26++;
                                                    iU3 = i12;
                                                    i19 = i19;
                                                    i22 = i22;
                                                    str5 = str3;
                                                    iU2 = iU2;
                                                    i20 = i20;
                                                    strW = strW;
                                                    i21 = i13;
                                                    break;
                                                case 3:
                                                    str3 = str5;
                                                    strW = strW;
                                                    i13 = i21;
                                                    s60Var.a = ch3.T(fkaVar, 0L);
                                                    i26++;
                                                    iU3 = i12;
                                                    i19 = i19;
                                                    i22 = i22;
                                                    str5 = str3;
                                                    iU2 = iU2;
                                                    i20 = i20;
                                                    strW = strW;
                                                    i21 = i13;
                                                    break;
                                                case 4:
                                                    try {
                                                        i13 = i21;
                                                        iU = ch3.U(fkaVar);
                                                    } catch (Throwable th2) {
                                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                                                        Iterator it2 = fjf.a.iterator();
                                                        while (it2.hasNext()) {
                                                            AccountInitializer accountInitializer = ((n6) it2.next()).a;
                                                            try {
                                                                gm0.V("Payload", "error while parse payload", th2);
                                                                i14 = i21;
                                                                try {
                                                                    accountInitializer.d().i().g().a(null, th2);
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    gm0.V("Payload", "failed to collect exception", th);
                                                                    i21 = i14;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                i14 = i21;
                                                            }
                                                            i21 = i14;
                                                        }
                                                        i13 = i21;
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
                                                    String str6 = null;
                                                    Long lM = null;
                                                    Long lM2 = null;
                                                    int i27 = 0;
                                                    int i28 = 1;
                                                    long jI0 = 0;
                                                    while (i27 < iU) {
                                                        try {
                                                            strX = ch3.X(fkaVar, str6);
                                                            i15 = iU;
                                                        } catch (Throwable th5) {
                                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                                            try {
                                                                Iterator it3 = fjf.a.iterator();
                                                                while (it3.hasNext()) {
                                                                    AccountInitializer accountInitializer2 = ((n6) it3.next()).a;
                                                                    try {
                                                                        gm0.V("Payload", "error while parse payload", th5);
                                                                        i16 = iU;
                                                                        try {
                                                                            accountInitializer2.d().i().g().a(null, th5);
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            gm0.V("Payload", "failed to collect exception", th);
                                                                            iU = i16;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        i16 = iU;
                                                                    }
                                                                    iU = i16;
                                                                }
                                                                i15 = iU;
                                                                int iD3 = qt4.D(pye.a);
                                                                if (iD3 != 0) {
                                                                    if (iD3 != 1) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    throw th5;
                                                                }
                                                                strX = null;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                str3 = str5;
                                                                th = th;
                                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                                it = fjf.a.iterator();
                                                                while (it.hasNext()) {
                                                                    AccountInitializer accountInitializer3 = ((n6) it.next()).a;
                                                                    try {
                                                                        gm0.V("Payload", "error while parse payload", th);
                                                                        accountInitializer3.d().i().g().a(null, th);
                                                                    } catch (Throwable th9) {
                                                                        gm0.V("Payload", "failed to collect exception", th9);
                                                                    }
                                                                }
                                                                iD = qt4.D(pye.a);
                                                                if (iD != 0) {
                                                                    if (iD == 1) {
                                                                        throw th;
                                                                    }
                                                                    ore.o();
                                                                    return null;
                                                                }
                                                                s60Var.f = new bjc(i28, lM, jI0, lM2);
                                                                i26++;
                                                                iU3 = i12;
                                                                i19 = i19;
                                                                i22 = i22;
                                                                str5 = str3;
                                                                iU2 = iU2;
                                                                i20 = i20;
                                                                strW = strW;
                                                                i21 = i13;
                                                            }
                                                        }
                                                        if (strX != null) {
                                                            try {
                                                                switch (strX.hashCode()) {
                                                                    case -1361631597:
                                                                        if (strX.equals(ApiProtocol.PARAM_CHAT_ID)) {
                                                                            lM = ch3.M(fkaVar);
                                                                        } else {
                                                                            fkaVar.x();
                                                                        }
                                                                        break;
                                                                    case -982451749:
                                                                        if (strX.equals("postId")) {
                                                                            lM2 = ch3.M(fkaVar);
                                                                        } else {
                                                                            fkaVar.x();
                                                                        }
                                                                        break;
                                                                    case 3575610:
                                                                        if (strX.equals("type")) {
                                                                            String strS2 = fkaVar.S0();
                                                                            if (strS2 == null) {
                                                                                i17 = 1;
                                                                            } else if (strS2.equals("FORWARD")) {
                                                                                i17 = 3;
                                                                            } else if (strS2.equals("REPLY")) {
                                                                                i17 = 2;
                                                                            } else {
                                                                                i17 = 1;
                                                                            }
                                                                            i28 = i17;
                                                                        } else {
                                                                            fkaVar.x();
                                                                        }
                                                                        break;
                                                                    case 954925063:
                                                                        if (strX.equals(str5)) {
                                                                            jI0 = fkaVar.I0();
                                                                        } else {
                                                                            fkaVar.x();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        fkaVar.x();
                                                                        break;
                                                                }
                                                            } catch (Throwable th10) {
                                                                try {
                                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                                                    Iterator it4 = fjf.a.iterator();
                                                                    while (it4.hasNext()) {
                                                                        AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                                                        try {
                                                                            gm0.V("Payload", "error while parse payload", th10);
                                                                            str3 = str5;
                                                                            try {
                                                                                accountInitializer4.d().i().g().a(null, th10);
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                try {
                                                                                    gm0.V("Payload", "failed to collect exception", th);
                                                                                    str5 = str3;
                                                                                } catch (Throwable th12) {
                                                                                    th = th12;
                                                                                    th = th;
                                                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                                                    it = fjf.a.iterator();
                                                                                    while (it.hasNext()) {
                                                                                        AccountInitializer accountInitializer5 = ((n6) it.next()).a;
                                                                                        gm0.V("Payload", "error while parse payload", th);
                                                                                        accountInitializer5.d().i().g().a(null, th);
                                                                                    }
                                                                                    iD = qt4.D(pye.a);
                                                                                    if (iD != 0) {
                                                                                        if (iD == 1) {
                                                                                            throw th;
                                                                                        }
                                                                                        ore.o();
                                                                                        return null;
                                                                                    }
                                                                                    s60Var.f = new bjc(i28, lM, jI0, lM2);
                                                                                    i26++;
                                                                                    iU3 = i12;
                                                                                    i19 = i19;
                                                                                    i22 = i22;
                                                                                    str5 = str3;
                                                                                    iU2 = iU2;
                                                                                    i20 = i20;
                                                                                    strW = strW;
                                                                                    i21 = i13;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th13) {
                                                                            th = th13;
                                                                            str3 = str5;
                                                                        }
                                                                        str5 = str3;
                                                                        break;
                                                                    }
                                                                    str4 = str5;
                                                                    int iD4 = qt4.D(pye.a);
                                                                    if (iD4 != 0) {
                                                                        if (iD4 != 1) {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                        throw th10;
                                                                    }
                                                                } catch (Throwable th14) {
                                                                    th = th14;
                                                                    str3 = str5;
                                                                    th = th;
                                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                                    it = fjf.a.iterator();
                                                                    while (it.hasNext()) {
                                                                        AccountInitializer accountInitializer6 = ((n6) it.next()).a;
                                                                        gm0.V("Payload", "error while parse payload", th);
                                                                        accountInitializer6.d().i().g().a(null, th);
                                                                    }
                                                                    iD = qt4.D(pye.a);
                                                                    if (iD != 0) {
                                                                        if (iD == 1) {
                                                                            throw th;
                                                                        }
                                                                        ore.o();
                                                                        return null;
                                                                    }
                                                                    s60Var.f = new bjc(i28, lM, jI0, lM2);
                                                                    i26++;
                                                                    iU3 = i12;
                                                                    i19 = i19;
                                                                    i22 = i22;
                                                                    str5 = str3;
                                                                    iU2 = iU2;
                                                                    i20 = i20;
                                                                    strW = strW;
                                                                    i21 = i13;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        str4 = str5;
                                                        i27++;
                                                        str5 = str4;
                                                        iU = i15;
                                                        str6 = null;
                                                        break;
                                                    }
                                                    str3 = str5;
                                                    s60Var.f = new bjc(i28, lM, jI0, lM2);
                                                    i26++;
                                                    iU3 = i12;
                                                    i19 = i19;
                                                    i22 = i22;
                                                    str5 = str3;
                                                    iU2 = iU2;
                                                    i20 = i20;
                                                    strW = strW;
                                                    i21 = i13;
                                                    break;
                                                case 5:
                                                    s60Var.b = ch3.W(fkaVar);
                                                    str3 = str5;
                                                    strW = strW;
                                                    i13 = i21;
                                                    i26++;
                                                    iU3 = i12;
                                                    i19 = i19;
                                                    i22 = i22;
                                                    str5 = str3;
                                                    iU2 = iU2;
                                                    i20 = i20;
                                                    strW = strW;
                                                    i21 = i13;
                                                    break;
                                                case 6:
                                                    s60Var.e = b50.a(fkaVar);
                                                    str3 = str5;
                                                    strW = strW;
                                                    i13 = i21;
                                                    i26++;
                                                    iU3 = i12;
                                                    i19 = i19;
                                                    i22 = i22;
                                                    str5 = str3;
                                                    iU2 = iU2;
                                                    i20 = i20;
                                                    strW = strW;
                                                    i21 = i13;
                                                    break;
                                                default:
                                                    fkaVar.x();
                                                    str3 = str5;
                                                    strW = strW;
                                                    i13 = i21;
                                                    i26++;
                                                    iU3 = i12;
                                                    i19 = i19;
                                                    i22 = i22;
                                                    str5 = str3;
                                                    iU2 = iU2;
                                                    i20 = i20;
                                                    strW = strW;
                                                    i21 = i13;
                                                    break;
                                            }
                                        }
                                        i3 = i19;
                                        i4 = iU2;
                                        i5 = i20;
                                        str = strW;
                                        i6 = i21;
                                        i7 = i22;
                                        zicVarB = s60Var.b();
                                    }
                                    i22 = i7;
                                    strW = str;
                                    i20 = i5 + 1;
                                    iJ = i;
                                    iJ2 = i2;
                                    i19 = i3;
                                    iU2 = i4;
                                    i21 = i6;
                                    break;
                                }
                            default:
                                i = iJ;
                                i2 = iJ2;
                                i3 = i19;
                                i4 = iU2;
                                i5 = i20;
                                str = strW;
                                i6 = i21;
                                i7 = i22;
                                break;
                        }
                    } else {
                        i = iJ;
                        i2 = iJ2;
                        i3 = i19;
                        i4 = iU2;
                        i5 = i20;
                        str = strW;
                        i6 = i21;
                        i7 = i22;
                    }
                    fkaVar.x();
                    i22 = i7;
                    strW = str;
                    i20 = i5 + 1;
                    iJ = i;
                    iJ2 = i2;
                    i19 = i3;
                    iU2 = i4;
                    i21 = i6;
                }
                int i29 = iJ;
                int i30 = iJ2;
                int i31 = i19;
                String str7 = strW;
                ((List) arrayList.get(i18)).add(new ike(i21, i22, str7 == null ? "" : str7, pucVar, zicVarB));
                i19 = i31 + 1;
                iJ = i29;
                iJ2 = i30;
            }
        }
        return new lke(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lke) && this.a.equals(((lke) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReplyKeyboard(buttonAttaches=" + this.a + ")";
    }
}
