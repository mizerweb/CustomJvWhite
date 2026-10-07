package defpackage;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class ghb implements fu3, bmh, ff0, zt3, lpd {
    public static ghb b;
    public static final ghb c = new ghb(1);
    public static final ghb d = new ghb(2);
    public static final ghb e = new ghb(3);
    public static final ghb f = new ghb(4);
    public static final /* synthetic */ ghb g = new ghb(5);
    public static final ghb h = new ghb(6);
    public static final ghb i = new ghb(7);
    public static final ghb j = new ghb(8);
    public static final ghb k = new ghb(10);
    public static final ghb l = new ghb(11);
    public static final ghb m = new ghb(12);
    public static final ghb n = new ghb(13);
    public final /* synthetic */ int a;

    public /* synthetic */ ghb(int i2) {
        this.a = i2;
    }

    public static final void a(Bitmap bitmap, Bitmap bitmap2) {
        ifh ifhVar = mrh.c;
        Rect rect = (Rect) mrh.e.get();
        rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = (Rect) mrh.f.get();
        rect2.set(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        new Canvas(bitmap2).drawBitmap(bitmap, rect, rect2, mrh.d);
    }

    public static String e(int i2, int i3, int i4, String str, String str2) {
        int i5 = 0;
        int i6 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z = (i4 & 8) == 0;
        boolean z2 = (i4 & 16) == 0;
        boolean z3 = (i4 & 32) == 0;
        boolean z4 = (i4 & 64) == 0;
        int iCharCount = i6;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i7 = 32;
            int i8 = 43;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || r5h.M0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !l(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                l31 l31Var = new l31();
                l31Var.z0(i6, iCharCount, str);
                l31 l31Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i8 && z3) {
                            String str3 = z ? "+" : "%2B";
                            l31Var.z0(i5, str3.length(), str3);
                        } else {
                            if (iCodePointAt2 >= i7 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z4) && !r5h.M0(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z && (!z2 || l(iCharCount, length, str))))) {
                                    l31Var.D0(iCodePointAt2);
                                }
                            }
                            if (l31Var2 == null) {
                                l31Var2 = new l31();
                            }
                            l31Var2.D0(iCodePointAt2);
                            while (!l31Var2.l()) {
                                byte b2 = l31Var2.readByte();
                                l31Var.t0(37);
                                char[] cArr = k28.j;
                                l31Var.t0(cArr[((b2 & 255) >> 4) & 15]);
                                l31Var.t0(cArr[b2 & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 0;
                    i7 = 32;
                    i8 = 43;
                }
                return l31Var.P();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i6, length);
    }

    public static w78 h(Uri uri, dwb dwbVar, int i2, int i3) {
        qcd cneVar;
        w78 w78VarD = w78.d(uri);
        w78VarD.g = t78.b;
        bne bneVar = null;
        if (dwbVar instanceof awb) {
            cneVar = new uj0(i2, i3);
        } else if (dwbVar instanceof cwb) {
            cneVar = new vj0(i2, i3);
        } else {
            if (!(dwbVar instanceof bwb)) {
                ore.o();
                return null;
            }
            cneVar = (i2 <= 0 || i3 <= 0) ? null : new cne(i2, i3);
        }
        w78VarD.k = cneVar;
        if (i2 > 0 && i3 > 0) {
            if (i2 > 0 && i3 > 0) {
                bneVar = new bne(i2, i3, 0.0f, 12);
            }
            w78VarD.d = bneVar;
        }
        return w78VarD;
    }

    public static int j(int i2) {
        if (i2 >= gm0.K(200.0f * yl5.d().getDisplayMetrics().density)) {
            return gm0.K(90.0f * yl5.d().getDisplayMetrics().density);
        }
        if (i2 >= gm0.K(72.0f * yl5.d().getDisplayMetrics().density)) {
            return gm0.K(36.0f * yl5.d().getDisplayMetrics().density);
        }
        if (i2 >= gm0.K(64.0f * yl5.d().getDisplayMetrics().density)) {
            return gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        }
        if (i2 >= gm0.K(48.0f * yl5.d().getDisplayMetrics().density)) {
            return gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        }
        if (i2 >= gm0.K(36.0f * yl5.d().getDisplayMetrics().density)) {
            return gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        }
        if (i2 >= gm0.K(32.0f * yl5.d().getDisplayMetrics().density)) {
            return gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        }
        return i2 >= 28 ? gm0.K(16.0f * yl5.d().getDisplayMetrics().density) : gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
    }

    public static v78 k(String str, dwb dwbVar) {
        Uri uriC = f55.c(str);
        if (uriC == null) {
            uriC = Uri.EMPTY;
        }
        w78 w78VarH = h(uriC, dwbVar, -1, -1);
        w78VarH.j = whd.c;
        return w78VarH.a();
    }

    public static boolean l(int i2, int i3, String str) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && uqi.r(str.charAt(i2 + 1)) != -1 && uqi.r(str.charAt(i4)) != -1;
    }

    public static String m(int i2, String str, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z = (i4 & 4) == 0;
        int iCharCount = i2;
        while (iCharCount < i3) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                l31 l31Var = new l31();
                l31Var.z0(i2, iCharCount, str);
                while (iCharCount < i3) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i5 = iCharCount + 2) < i3) {
                        int iR = uqi.r(str.charAt(iCharCount + 1));
                        int iR2 = uqi.r(str.charAt(i5));
                        if (iR == -1 || iR2 == -1) {
                            l31Var.D0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            l31Var.t0((iR << 4) + iR2);
                            iCharCount = Character.charCount(iCodePointAt) + i5;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        l31Var.t0(32);
                        iCharCount++;
                    } else {
                        l31Var.D0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return l31Var.P();
            }
            iCharCount++;
        }
        return str.substring(i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:263:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final kih n(fka fkaVar) {
        int iU;
        String strX;
        long jT;
        long jT2;
        int i2 = 1;
        String str = null;
        int i3 = 0;
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
        String strS0 = "";
        String strX2 = null;
        Long lValueOf = null;
        Long lValueOf2 = null;
        String strX3 = null;
        String strX4 = null;
        while (i3 < iU) {
            try {
                strX = ch3.X(fkaVar, str);
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(str, th3);
                    } catch (Throwable th4) {
                        gm0.V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 != i2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = str;
            }
            if (strX != null) {
                try {
                    switch (strX.hashCode()) {
                        case -1676095234:
                            if (!strX.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
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
                                strS0 = fkaVar.S0();
                            }
                            break;
                        case -1401988028:
                            if (!strX.equals(ApiProtocol.PARAM_JOIN_LINK)) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX3 = ch3.X(fkaVar, null);
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
                                    strX3 = null;
                                }
                            }
                            break;
                        case -1361631597:
                            if (!strX.equals(ApiProtocol.PARAM_CHAT_ID)) {
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
                                lValueOf2 = Long.valueOf(jT);
                            }
                            break;
                        case -172815863:
                            if (!strX.equals("callName")) {
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
                        case -172115450:
                            if (!strX.equals("callerId")) {
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
                                lValueOf = Long.valueOf(jT2);
                            }
                            break;
                        case 3575610:
                            if (!strX.equals("type")) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX4 = ch3.X(fkaVar, null);
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
                                    strX4 = null;
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
            i3++;
            i2 = 1;
            str = null;
        }
        return new a32(strS0, strX2, lValueOf, lValueOf2, strX3, strX4);
    }

    private final kih o(fka fkaVar) {
        int iU;
        String strX;
        if (!fkaVar.l()) {
            return null;
        }
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
        l8b l8bVarD = null;
        long jT = -1;
        for (int i2 = 0; i2 < iU; i2++) {
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
                    if (strX.equals("presence")) {
                        l8bVarD = fjf.d(fkaVar);
                    } else if (strX.equals("time")) {
                        try {
                            jT = ch3.T(fkaVar, -1L);
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
                            jT = -1;
                        }
                    } else {
                        try {
                            fkaVar.x();
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
                        }
                    }
                } catch (Throwable th9) {
                    try {
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
                            if (iD6 == 1) {
                                throw th11;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        if (l8bVarD == null || jT == -1) {
            return null;
        }
        return new pl4(jT, l8bVarD);
    }

    private final kih p(fka fkaVar) {
        int iU;
        String strX;
        int iJ;
        if (!fkaVar.l()) {
            return null;
        }
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
        Object obj = null;
        for (int i2 = 0; i2 < iU; i2++) {
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
                    if (strX.equals("commentsInfoUpdates")) {
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
                        if (iJ > 0) {
                            ArrayList arrayList = new ArrayList(iJ);
                            for (int i3 = 0; i3 < iJ; i3++) {
                                bfa bfaVarA = osk.a(fkaVar);
                                if (bfaVarA != null) {
                                    arrayList.add(bfaVarA);
                                }
                            }
                            obj = arrayList;
                        } else {
                            obj = r66.a;
                        }
                    } else {
                        try {
                            fkaVar.x();
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
                        }
                    }
                } catch (Throwable th9) {
                    try {
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
                            if (iD6 == 1) {
                                throw th11;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        List list = (List) obj;
        if (list != null) {
            return new rk7(list);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final kih q(fka fkaVar) {
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
        String strX2 = null;
        long jT = 0;
        long jT2 = 0;
        long jT3 = 0;
        for (int i2 = 0; i2 < iU; i2++) {
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
                        case -1274507337:
                            if (!strX.equals("fileId")) {
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
                                    jT3 = ch3.T(fkaVar, 0L);
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
                                    jT3 = 0;
                                }
                            }
                            break;
                        case -661256303:
                            if (!strX.equals("audioId")) {
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
                        case 96784904:
                            if (!strX.equals("error")) {
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
                        case 452782838:
                            if (!strX.equals("videoId")) {
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
                        default:
                            fkaVar.x();
                            break;
                    }
                } catch (Throwable th15) {
                    try {
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
                            if (iD9 == 1) {
                                throw th17;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        return new qib(jT, jT2, jT3, strX2);
    }

    /* JADX WARN: Code duplicated, block: B:148:0x022a A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #6 {all -> 0x00a9, blocks: (B:145:0x021b, B:146:0x0224, B:148:0x022a, B:152:0x0246, B:153:0x024a, B:157:0x0255, B:158:0x025a, B:159:0x025b, B:30:0x006a, B:31:0x0073, B:33:0x0079, B:37:0x0095, B:38:0x0099, B:41:0x00a3, B:42:0x00a8, B:45:0x00ad, B:149:0x0232, B:26:0x0063, B:34:0x0081), top: B:190:0x021b, inners: #2, #4, #12 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0255 A[Catch: all -> 0x00a9, TryCatch #6 {all -> 0x00a9, blocks: (B:145:0x021b, B:146:0x0224, B:148:0x022a, B:152:0x0246, B:153:0x024a, B:157:0x0255, B:158:0x025a, B:159:0x025b, B:30:0x006a, B:31:0x0073, B:33:0x0079, B:37:0x0095, B:38:0x0099, B:41:0x00a3, B:42:0x00a8, B:45:0x00ad, B:149:0x0232, B:26:0x0063, B:34:0x0081), top: B:190:0x021b, inners: #2, #4, #12 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x025b A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #6 {all -> 0x00a9, blocks: (B:145:0x021b, B:146:0x0224, B:148:0x022a, B:152:0x0246, B:153:0x024a, B:157:0x0255, B:158:0x025a, B:159:0x025b, B:30:0x006a, B:31:0x0073, B:33:0x0079, B:37:0x0095, B:38:0x0099, B:41:0x00a3, B:42:0x00a8, B:45:0x00ad, B:149:0x0232, B:26:0x0063, B:34:0x0081), top: B:190:0x021b, inners: #2, #4, #12 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x025e A[SYNTHETIC] */
    private final kih r(fka fkaVar) {
        int iU;
        String strX;
        Throwable th;
        Iterator it;
        int iD;
        int iJ;
        if (!fkaVar.l()) {
            return null;
        }
        u8b u8bVar = cqb.b;
        int i2 = 1;
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
        int i3 = 0;
        long jT = 0;
        while (i3 < iU) {
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
                    if (iD3 != i2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th4;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    if (strX.equals("storyDetailedStats")) {
                        try {
                            u8b u8bVar2 = cqb.b;
                            try {
                                if (fkaVar.y().a() == 7) {
                                    try {
                                        iJ = ch3.J(fkaVar);
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
                                            if (iD4 != i2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th6;
                                        }
                                        iJ = 0;
                                    }
                                    u8b u8bVar3 = new u8b(iJ);
                                    for (int i4 = 0; i4 < iJ; i4++) {
                                        u8bVar3.b(hsl.d(fkaVar));
                                    }
                                    u8bVar2 = u8bVar3;
                                } else {
                                    fkaVar.x();
                                }
                            } catch (Throwable th8) {
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
                            }
                            u8bVar = u8bVar2;
                        } catch (Throwable th10) {
                            th = th10;
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
                    } else if (strX.equals("marker")) {
                        try {
                            jT = ch3.T(fkaVar, 0L);
                        } catch (Throwable th14) {
                            try {
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
                            } catch (Throwable th16) {
                                th = th16;
                                th = th;
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                it = fjf.a.iterator();
                                while (it.hasNext()) {
                                    AccountInitializer accountInitializer8 = ((n6) it.next()).a;
                                    gm0.V("Payload", "error while parse payload", th);
                                    accountInitializer8.d().i().g().a(null, th);
                                }
                                iD = qt4.D(pye.a);
                                if (iD != 0) {
                                    if (iD != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th;
                                }
                                i3++;
                                i2 = 1;
                            }
                        }
                    } else {
                        try {
                            fkaVar.x();
                        } catch (Throwable th17) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                            Iterator it8 = fjf.a.iterator();
                            while (it8.hasNext()) {
                                AccountInitializer accountInitializer9 = ((n6) it8.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th17);
                                    accountInitializer9.d().i().g().a(null, th17);
                                } catch (Throwable th18) {
                                    gm0.V("Payload", "failed to collect exception", th18);
                                }
                            }
                            int iD8 = qt4.D(pye.a);
                            if (iD8 != 0) {
                                if (iD8 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th17;
                            }
                        }
                    }
                } catch (Throwable th19) {
                    th = th19;
                }
            }
            i3++;
            i2 = 1;
        }
        return new mrg(u8bVar, jT);
    }

    public static ArrayList s(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int iU0 = r5h.U0(str, '&', i2, 4);
            if (iU0 == -1) {
                iU0 = str.length();
            }
            int iU1 = r5h.U0(str, '=', i2, 4);
            if (iU1 == -1 || iU1 > iU0) {
                arrayList.add(str.substring(i2, iU0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, iU1));
                arrayList.add(str.substring(iU1 + 1, iU0));
            }
            i2 = iU0 + 1;
        }
        return arrayList;
    }

    public static kxg t(int i2) {
        Object next;
        y1 y1Var = new y1(0, kxg.f);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((kxg) next).a() != i2);
        kxg kxgVar = (kxg) next;
        return kxgVar == null ? kxg.PHOTO : kxgVar;
    }

    @Override // defpackage.ff0
    public void b(id7 id7Var) {
        id7Var.I("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        id7Var.r0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }

    @Override // defpackage.lpd
    public void c() {
    }

    @Override // defpackage.lpd
    public void d(int i2, Object obj) {
    }

    @Override // defpackage.bmh
    public int g(int i2, CharSequence charSequence) {
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            cmh cmhVar = emh.a;
            if (directionality == 0) {
                z = true;
            } else if (directionality == 1 || directionality == 2) {
                return 0;
            }
        }
        return z ? 1 : 2;
    }

    @Override // defpackage.fu3
    public kih i(fka fkaVar) {
        int iU;
        String strX;
        int iJ;
        int iU2;
        String strX2;
        Integer numValueOf;
        String strX3;
        int iU3;
        String strX4;
        switch (this.a) {
            case 1:
                if (!fkaVar.l()) {
                    return null;
                }
                int i2 = 0;
                mw mwVar = new mw(0);
                try {
                    iU2 = ch3.U(fkaVar);
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
                    iU2 = 0;
                }
                int i3 = 0;
                ujd ujdVarP = null;
                while (i3 < iU2) {
                    try {
                        strX2 = ch3.X(fkaVar, null);
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
                        strX2 = null;
                    }
                    if (strX2 != null) {
                        try {
                            if (strX2.equals("tokenAttrs")) {
                                try {
                                    numValueOf = Integer.valueOf(ch3.U(fkaVar));
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
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    int iIntValue = numValueOf.intValue();
                                    for (int i4 = i2; i4 < iIntValue; i4++) {
                                        try {
                                            strX3 = ch3.X(fkaVar, null);
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
                                            strX3 = null;
                                        }
                                        if (strX3 != null) {
                                            mwVar.put(strX3, cxk.b(fkaVar).a());
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            } else if (strX2.equals("profile")) {
                                ujdVarP = f55.p(fkaVar);
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
                        } catch (Throwable th11) {
                            try {
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
                                i3++;
                                i2 = 0;
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
                                    if (iD7 == 1) {
                                        throw th13;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    i3++;
                    i2 = 0;
                    break;
                }
                return new qd0(mwVar, ujdVarP);
            case 2:
                return n(fkaVar);
            case 3:
                if (!fkaVar.l()) {
                    return null;
                }
                try {
                    iU3 = ch3.U(fkaVar);
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
                        if (iD8 == 1) {
                            throw th15;
                        }
                        ore.o();
                        return null;
                    }
                    iU3 = 0;
                }
                boolean zL = false;
                for (int i5 = 0; i5 < iU3; i5++) {
                    try {
                        strX4 = ch3.X(fkaVar, null);
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
                        strX4 = null;
                    }
                    if (strX4 != null) {
                        try {
                            if (strX4.equals("success")) {
                                try {
                                    zL = ch3.L(fkaVar);
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
                                    zL = false;
                                }
                            } else {
                                try {
                                    fkaVar.x();
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
                                }
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
                    break;
                }
                return new f54(zL);
            case 4:
                return o(fkaVar);
            case 5:
            case 9:
            case 10:
            default:
                try {
                    iU = ch3.U(fkaVar);
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
                        if (iD14 == 1) {
                            throw th27;
                        }
                        ore.o();
                        return null;
                    }
                    iU = 0;
                }
                Integer numValueOf2 = null;
                ArrayList arrayList = null;
                for (int i6 = 0; i6 < iU; i6++) {
                    try {
                        strX = ch3.X(fkaVar, null);
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
                        strX = null;
                    }
                    if (strX != null) {
                        try {
                            if (strX.equals("info")) {
                                ArrayList arrayList2 = new ArrayList();
                                try {
                                    iJ = ch3.J(fkaVar);
                                } catch (Throwable th31) {
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
                                    iJ = 0;
                                }
                                for (int i7 = 0; i7 < iJ; i7++) {
                                    try {
                                        arrayList2.add(g5j.a(fkaVar));
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
                                            if (iD17 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th33;
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                arrayList = arrayList2;
                                break;
                            } else if (strX.equals("uploaderType")) {
                                numValueOf2 = Integer.valueOf(fkaVar.D0());
                            }
                        } catch (Throwable th35) {
                            try {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th35);
                                Iterator it18 = fjf.a.iterator();
                                while (it18.hasNext()) {
                                    AccountInitializer accountInitializer18 = ((n6) it18.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th35);
                                        accountInitializer18.d().i().g().a(null, th35);
                                    } catch (Throwable th36) {
                                        gm0.V("Payload", "failed to collect exception", th36);
                                    }
                                }
                                int iD18 = qt4.D(pye.a);
                                if (iD18 != 0) {
                                    if (iD18 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th35;
                                }
                            } catch (Throwable th37) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th37);
                                Iterator it19 = fjf.a.iterator();
                                while (it19.hasNext()) {
                                    AccountInitializer accountInitializer19 = ((n6) it19.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th37);
                                        accountInitializer19.d().i().g().a(null, th37);
                                    } catch (Throwable th38) {
                                        gm0.V("Payload", "failed to collect exception", th38);
                                    }
                                }
                                int iD19 = qt4.D(pye.a);
                                if (iD19 != 0) {
                                    if (iD19 == 1) {
                                        throw th37;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    break;
                }
                return new f5j(arrayList, numValueOf2);
            case 6:
                return p(fkaVar);
            case 7:
                return kih.b;
            case 8:
                return q(fkaVar);
            case 11:
                return r(fkaVar);
        }
    }

    @Override // defpackage.zt3
    public void v() {
    }

    @Override // defpackage.zt3
    public void w(f0g f0gVar, Throwable th) {
        Object objC = f0gVar.c();
        pj6.j(au3.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(f0gVar)), objC == null ? null : objC.getClass().getName());
    }
}
