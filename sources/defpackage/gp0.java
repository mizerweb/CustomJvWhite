package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public class gp0 implements fu3, sf7, sxh, iri, c4b, ut4, aw4 {
    public static final gp0 b = new gp0(0);
    public static final long[] c = new long[0];
    public static final gp0 d = new gp0(2);
    public static final gp0 e = new gp0(3);
    public static final gp0 f = new gp0(4);
    public static final f65 g = new f65(1);
    public static final f65 h = new f65(0);
    public static final gp0 i = new gp0(6);
    public static final gp0 j = new gp0(7);
    public static final gp0 k = new gp0(8);
    public static final gp0 l = new gp0(9);
    public static final gp0 m = new gp0(10);
    public static final int[] n = {1, 3, 4};
    public static final gp0 o = new gp0(12);
    public static final gp0 p = new gp0(13);
    public static final gp0 q = new gp0(14);
    public final /* synthetic */ int a;

    public gp0() {
        this.a = 17;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static final pne a(pne pneVar) {
        if ((pneVar != null ? pneVar.g : null) == null) {
            return pneVar;
        }
        one oneVarI = pneVar.I();
        oneVarI.g = null;
        return oneVarI.a();
    }

    public static RectF b(xgh xghVar, View view) {
        if (view == null) {
            return new RectF();
        }
        if (xghVar.D || !(view instanceof wgh)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        wgh wghVar = (wgh) view;
        int contentWidth = wghVar.getContentWidth();
        int contentHeight = wghVar.getContentHeight();
        int iJ = (int) e9i.J(wghVar.getContext(), 24);
        if (contentWidth < iJ) {
            contentWidth = iJ;
        }
        int right = (wghVar.getRight() + wghVar.getLeft()) / 2;
        int bottom = (wghVar.getBottom() + wghVar.getTop()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(right - i2, bottom - (contentHeight / 2), i2 + right, (right / 2) + bottom);
    }

    public static boolean c(String str) {
        return (HTTP.CONN_DIRECTIVE.equalsIgnoreCase(str) || HTTP.CONN_KEEP_ALIVE.equalsIgnoreCase(str) || AUTH.PROXY_AUTH.equalsIgnoreCase(str) || AUTH.PROXY_AUTH_RESP.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HTTP.TRANSFER_ENCODING.equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private final kih e(fka fkaVar) {
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
                    if (strX.equals("folderSync")) {
                        lValueOf = Long.valueOf(fkaVar.I0());
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
        if (lValueOf != null) {
            return new b57(lValueOf.longValue());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:294:0x032d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final kih f(fka fkaVar) throws IOException {
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
        st2 st2VarB = null;
        gm4 gm4VarA = null;
        gda gdaVarQ0 = null;
        String strX2 = null;
        ir7 ir7VarA = null;
        oui ouiVarA = null;
        fmg fmgVarA = null;
        gda gdaVarQ1 = null;
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
                        case -1195420187:
                            if (!strX.equals("stickerSet")) {
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
                                    fmgVarA = fmg.a(fkaVar);
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
                                    fmgVarA = null;
                                }
                            }
                            break;
                        case -921148724:
                            if (!strX.equals("startPayload")) {
                                fkaVar.x();
                            } else {
                                try {
                                    strX2 = ch3.X(fkaVar, null);
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
                                    strX2 = null;
                                }
                            }
                            break;
                        case 3052376:
                            if (!strX.equals("chat")) {
                                fkaVar.x();
                            } else {
                                try {
                                    st2VarB = st2.b(fkaVar);
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
                                    st2VarB = null;
                                }
                            }
                            break;
                        case 3446944:
                            if (!strX.equals("post")) {
                                fkaVar.x();
                            } else {
                                try {
                                    gdaVarQ1 = yab.q0(fkaVar);
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
                                    gdaVarQ1 = null;
                                }
                            }
                            break;
                        case 3599307:
                            if (!strX.equals("user")) {
                                fkaVar.x();
                            } else {
                                try {
                                    gm4VarA = gm4.a(fkaVar);
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
                                    gm4VarA = null;
                                }
                            }
                            break;
                        case 98629247:
                            if (!strX.equals("group")) {
                                fkaVar.x();
                            } else {
                                try {
                                    ir7VarA = ir7.a(fkaVar);
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
                                    ir7VarA = null;
                                }
                            }
                            break;
                        case 954925063:
                            if (!strX.equals("message")) {
                                fkaVar.x();
                            } else {
                                try {
                                    gdaVarQ0 = yab.q0(fkaVar);
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
                                    gdaVarQ0 = null;
                                }
                            }
                            break;
                        case 1958352887:
                            if (!strX.equals("videoConference")) {
                                fkaVar.x();
                            } else {
                                try {
                                    ouiVarA = oui.a(fkaVar);
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
                                    ouiVarA = null;
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
        return new n29(st2VarB, gm4VarA, gdaVarQ0, strX2, ir7VarA, ouiVarA, fmgVarA, gdaVarQ1);
    }

    private final kih g(fka fkaVar) {
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
        hja hjaVarB = null;
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
                    if (strX.equals("reactionInfo")) {
                        hjaVarB = ftk.b(fkaVar);
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
        if (hjaVarB != null) {
            return new e4b(hjaVarB);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:210:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final kih j(fka fkaVar) {
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
        long jT = -1;
        long jT2 = -1;
        long jT3 = -1;
        int iR = -1;
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
                        case -1361631597:
                            if (!strX.equals(ApiProtocol.PARAM_CHAT_ID)) {
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
                                    jT = ch3.T(fkaVar, -1L);
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
                                    jT = -1;
                                }
                            }
                            break;
                        case -840272977:
                            if (!strX.equals("unread")) {
                                fkaVar.x();
                            } else {
                                try {
                                    iR = ch3.R(fkaVar, -1);
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
                                    iR = -1;
                                }
                            }
                            break;
                        case -836030906:
                            if (!strX.equals("userId")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT2 = ch3.T(fkaVar, -1L);
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
                                    jT2 = -1;
                                }
                            }
                            break;
                        case 3344077:
                            if (!strX.equals("mark")) {
                                fkaVar.x();
                            } else {
                                try {
                                    jT3 = ch3.T(fkaVar, -1L);
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
                                    jT3 = -1;
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
        if (jT == -1 && jT2 == -1 && jT3 == -1 && iR == -1) {
            return null;
        }
        return new xjb(iR, jT, jT2, jT3);
    }

    private final kih k(fka fkaVar) {
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
        ed7 ed7VarA = null;
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
                    if (strX.equals("state")) {
                        ed7VarA = njl.a(fkaVar);
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
        if (ed7VarA != null) {
            return new w9d(ed7VarA);
        }
        return null;
    }

    private final kih l(fka fkaVar) {
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
        boolean zL = false;
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
                    if (strX.equals("success")) {
                        try {
                            zL = ch3.L(fkaVar);
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
                            zL = false;
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
        return new gsg(zL);
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        return (vd6) m94.n.getValue();
    }

    @Override // defpackage.iri
    public int d(Object obj) {
        return ((xt3) obj).getSizeInBytes();
    }

    @Override // defpackage.c4b
    public Object h(fka fkaVar) {
        return Long.valueOf(ch3.T(fkaVar, 0L));
    }

    /* JADX WARN: Code duplicated, block: B:408:0x0612 A[Catch: all -> 0x0644, TRY_LEAVE, TryCatch #22 {all -> 0x0644, blocks: (B:405:0x0603, B:406:0x060c, B:408:0x0612, B:412:0x062f, B:413:0x0633, B:417:0x063e, B:418:0x0643, B:421:0x0647, B:409:0x061a), top: B:508:0x0603, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:417:0x063e A[Catch: all -> 0x0644, TryCatch #22 {all -> 0x0644, blocks: (B:405:0x0603, B:406:0x060c, B:408:0x0612, B:412:0x062f, B:413:0x0633, B:417:0x063e, B:418:0x0643, B:421:0x0647, B:409:0x061a), top: B:508:0x0603, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:421:0x0647 A[Catch: all -> 0x0644, TRY_LEAVE, TryCatch #22 {all -> 0x0644, blocks: (B:405:0x0603, B:406:0x060c, B:408:0x0612, B:412:0x062f, B:413:0x0633, B:417:0x063e, B:418:0x0643, B:421:0x0647, B:409:0x061a), top: B:508:0x0603, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:431:0x0665  */
    /* JADX WARN: Code duplicated, block: B:443:0x0692  */
    /* JADX WARN: Code duplicated, block: B:445:0x0695  */
    /* JADX WARN: Code duplicated, block: B:447:0x069a  */
    /* JADX WARN: Code duplicated, block: B:449:0x069d A[PHI: r21
  0x069d: PHI (r21v2 java.lang.Long) = (r21v1 java.lang.Long), (r21v5 java.lang.Long) binds: [B:448:0x069b, B:442:0x0690] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:453:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:455:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:458:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:459:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:461:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:462:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:464:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:465:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:525:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x063b A[SYNTHETIC] */
    @Override // defpackage.fu3
    public kih i(fka fkaVar) throws Throwable {
        int iU;
        ew5 ew5Var;
        List listA;
        Long lValueOf;
        r66 r66Var;
        Long l2;
        fp0 fp0Var;
        long j2;
        List list;
        long jLongValue;
        Throwable th;
        String strX;
        Iterator it;
        int iD;
        Throwable th2;
        Iterator it2;
        int iD2;
        long jT;
        int iU2;
        String strX2;
        int iJ;
        int iU3;
        String strX3;
        int i2 = 1;
        int i3 = 0;
        String str = null;
        switch (this.a) {
            case 0:
                try {
                    iU = ch3.U(fkaVar);
                    while (true) {
                        r66Var = r66.a;
                        if (i3 < iU) {
                            try {
                                strX = ch3.X(fkaVar, str);
                                break;
                            } catch (Throwable th3) {
                                try {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                    try {
                                        Iterator it3 = fjf.a.iterator();
                                        while (it3.hasNext()) {
                                            AccountInitializer accountInitializer = ((n6) it3.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th3);
                                                accountInitializer.d().i().g().a(str, th3);
                                            } catch (Throwable th4) {
                                                gm0.V("Payload", "failed to collect exception", th4);
                                            }
                                        }
                                        int iD3 = qt4.D(pye.a);
                                        if (iD3 != 0) {
                                            try {
                                                if (iD3 != i2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th3;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                l2 = lValueOf;
                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                it = fjf.a.iterator();
                                                while (it.hasNext()) {
                                                    AccountInitializer accountInitializer2 = ((n6) it.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th);
                                                        try {
                                                            accountInitializer2.d().i().g().a(null, th);
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            gm0.V("Payload", "failed to collect exception", th);
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                }
                                                fp0Var = null;
                                                iD = qt4.D(pye.a);
                                                if (iD == 0) {
                                                    if (ew5Var == null) {
                                                        gm0.Y(gp0.class.getName(), "showTime is null in response");
                                                    }
                                                    if (listA == null) {
                                                        gm0.Y(gp0.class.getName(), "banners is null in response");
                                                    }
                                                    if (l2 == null) {
                                                        gm0.Y(gp0.class.getName(), "updateTime is null in response");
                                                    }
                                                    if (ew5Var != null) {
                                                        j2 = ew5Var.a;
                                                    } else {
                                                        ghb ghbVar = ew5.b;
                                                        j2 = 0;
                                                    }
                                                    if (listA == null) {
                                                        list = r66Var;
                                                    } else {
                                                        list = listA;
                                                    }
                                                    if (l2 != null) {
                                                        jLongValue = l2.longValue();
                                                    } else {
                                                        jLongValue = 0;
                                                    }
                                                    fp0Var = new fp0(j2, jLongValue, list);
                                                } else {
                                                    if (iD == 1) {
                                                        throw th;
                                                    }
                                                    ore.o();
                                                }
                                                return fp0Var;
                                            }
                                        }
                                        strX = str;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        l2 = lValueOf;
                                        th = th;
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                        it = fjf.a.iterator();
                                        while (it.hasNext()) {
                                            AccountInitializer accountInitializer3 = ((n6) it.next()).a;
                                            gm0.V("Payload", "error while parse payload", th);
                                            accountInitializer3.d().i().g().a(null, th);
                                        }
                                        fp0Var = null;
                                        iD = qt4.D(pye.a);
                                        if (iD == 0) {
                                            if (ew5Var == null) {
                                                gm0.Y(gp0.class.getName(), "showTime is null in response");
                                            }
                                            if (listA == null) {
                                                gm0.Y(gp0.class.getName(), "banners is null in response");
                                            }
                                            if (l2 == null) {
                                                gm0.Y(gp0.class.getName(), "updateTime is null in response");
                                            }
                                            if (ew5Var != null) {
                                                j2 = ew5Var.a;
                                            } else {
                                                ghb ghbVar2 = ew5.b;
                                                j2 = 0;
                                            }
                                            if (listA == null) {
                                                list = r66Var;
                                            } else {
                                                list = listA;
                                            }
                                            if (l2 != null) {
                                                jLongValue = l2.longValue();
                                            } else {
                                                jLongValue = 0;
                                            }
                                            fp0Var = new fp0(j2, jLongValue, list);
                                        } else {
                                            if (iD == 1) {
                                                throw th;
                                            }
                                            ore.o();
                                        }
                                        return fp0Var;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                }
                            }
                            if (strX != null) {
                                try {
                                    int iHashCode = strX.hashCode();
                                    if (iHashCode != -338830486) {
                                        try {
                                            if (iHashCode == -336959801) {
                                                l2 = lValueOf;
                                                if (strX.equals("banners")) {
                                                    listA = fjf.a(fkaVar, r66Var, i9.f);
                                                }
                                                lValueOf = l2;
                                            } else if (iHashCode == -295931082 && strX.equals("updateTime")) {
                                                l2 = lValueOf;
                                                try {
                                                    jT = ch3.T(fkaVar, 0L);
                                                } catch (Throwable th10) {
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                                    Iterator it4 = fjf.a.iterator();
                                                    while (it4.hasNext()) {
                                                        AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                                        try {
                                                            gm0.V("Payload", "error while parse payload", th10);
                                                            accountInitializer4.d().i().g().a(null, th10);
                                                        } catch (Throwable th11) {
                                                            gm0.V("Payload", "failed to collect exception", th11);
                                                        }
                                                    }
                                                    int iD4 = qt4.D(pye.a);
                                                    if (iD4 != 0) {
                                                        if (iD4 != 1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th10;
                                                    }
                                                    jT = 0;
                                                }
                                                lValueOf = Long.valueOf(jT);
                                            } else {
                                                l2 = lValueOf;
                                            }
                                            fkaVar.x();
                                            break;
                                        } catch (Throwable th12) {
                                            try {
                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                                                Iterator it5 = fjf.a.iterator();
                                                while (it5.hasNext()) {
                                                    AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th12);
                                                        accountInitializer5.d().i().g().a(null, th12);
                                                    } catch (Throwable th13) {
                                                        gm0.V("Payload", "failed to collect exception", th13);
                                                    }
                                                }
                                                int iD5 = qt4.D(pye.a);
                                                if (iD5 != 0) {
                                                    if (iD5 != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw th12;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th2 = th;
                                                try {
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                                                    it2 = fjf.a.iterator();
                                                    while (it2.hasNext()) {
                                                        AccountInitializer accountInitializer6 = ((n6) it2.next()).a;
                                                        try {
                                                            gm0.V("Payload", "error while parse payload", th2);
                                                            accountInitializer6.d().i().g().a(null, th2);
                                                        } catch (Throwable th15) {
                                                            gm0.V("Payload", "failed to collect exception", th15);
                                                        }
                                                    }
                                                    iD2 = qt4.D(pye.a);
                                                    if (iD2 != 0) {
                                                        if (iD2 != 1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (Throwable th16) {
                                                    th = th16;
                                                    th = th;
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                    it = fjf.a.iterator();
                                                    while (it.hasNext()) {
                                                        AccountInitializer accountInitializer7 = ((n6) it.next()).a;
                                                        gm0.V("Payload", "error while parse payload", th);
                                                        accountInitializer7.d().i().g().a(null, th);
                                                    }
                                                    fp0Var = null;
                                                    iD = qt4.D(pye.a);
                                                    if (iD == 0) {
                                                        if (ew5Var == null) {
                                                            gm0.Y(gp0.class.getName(), "showTime is null in response");
                                                        }
                                                        if (listA == null) {
                                                            gm0.Y(gp0.class.getName(), "banners is null in response");
                                                        }
                                                        if (l2 == null) {
                                                            gm0.Y(gp0.class.getName(), "updateTime is null in response");
                                                        }
                                                        if (ew5Var != null) {
                                                            j2 = ew5Var.a;
                                                        } else {
                                                            ghb ghbVar3 = ew5.b;
                                                            j2 = 0;
                                                        }
                                                        if (listA == null) {
                                                            list = r66Var;
                                                        } else {
                                                            list = listA;
                                                        }
                                                        if (l2 != null) {
                                                            jLongValue = l2.longValue();
                                                        } else {
                                                            jLongValue = 0;
                                                        }
                                                        fp0Var = new fp0(j2, jLongValue, list);
                                                    } else {
                                                        if (iD == 1) {
                                                            throw th;
                                                        }
                                                        ore.o();
                                                    }
                                                    return fp0Var;
                                                }
                                            }
                                        }
                                        lValueOf = l2;
                                    } else {
                                        l2 = lValueOf;
                                        if (strX.equals("showTime")) {
                                            ghb ghbVar4 = ew5.b;
                                            long jT2 = 0;
                                            try {
                                                jT2 = ch3.T(fkaVar, 0L);
                                            } catch (Throwable th17) {
                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                                                Iterator it6 = fjf.a.iterator();
                                                while (it6.hasNext()) {
                                                    AccountInitializer accountInitializer8 = ((n6) it6.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th17);
                                                        accountInitializer8.d().i().g().a(null, th17);
                                                    } catch (Throwable th18) {
                                                        gm0.V("Payload", "failed to collect exception", th18);
                                                    }
                                                }
                                                int iD6 = qt4.D(pye.a);
                                                if (iD6 != 0) {
                                                    if (iD6 != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw th17;
                                                }
                                            }
                                            lValueOf = l2;
                                            ew5Var = new ew5(qe7.P(jT2, lw5.MILLISECONDS));
                                        } else {
                                            fkaVar.x();
                                            lValueOf = l2;
                                        }
                                        th = th14;
                                        th2 = th;
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                                        it2 = fjf.a.iterator();
                                        while (it2.hasNext()) {
                                            AccountInitializer accountInitializer9 = ((n6) it2.next()).a;
                                            gm0.V("Payload", "error while parse payload", th2);
                                            accountInitializer9.d().i().g().a(null, th2);
                                        }
                                        iD2 = qt4.D(pye.a);
                                        if (iD2 != 0) {
                                            if (iD2 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th2;
                                        }
                                        lValueOf = l2;
                                    }
                                } catch (Throwable th19) {
                                    th = th19;
                                    l2 = lValueOf;
                                }
                            }
                            i3++;
                            i2 = 1;
                            str = null;
                        } else {
                            l2 = lValueOf;
                        }
                    }
                } catch (Throwable th20) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th20);
                    Iterator it7 = fjf.a.iterator();
                    while (it7.hasNext()) {
                        AccountInitializer accountInitializer10 = ((n6) it7.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th20);
                            accountInitializer10.d().i().g().a(null, th20);
                        } catch (Throwable th21) {
                            gm0.V("Payload", "failed to collect exception", th21);
                        }
                    }
                    int iD7 = qt4.D(pye.a);
                    if (iD7 != 0) {
                        if (iD7 == 1) {
                            throw th20;
                        }
                        ore.o();
                        return null;
                    }
                    iU = 0;
                }
                ew5Var = null;
                listA = null;
                lValueOf = null;
                if (ew5Var == null) {
                    gm0.Y(gp0.class.getName(), "showTime is null in response");
                }
                if (listA == null) {
                    gm0.Y(gp0.class.getName(), "banners is null in response");
                }
                if (l2 == null) {
                    gm0.Y(gp0.class.getName(), "updateTime is null in response");
                }
                if (ew5Var != null) {
                    j2 = ew5Var.a;
                } else {
                    ghb ghbVar5 = ew5.b;
                    j2 = 0;
                }
                if (listA == null) {
                    list = r66Var;
                } else {
                    list = listA;
                }
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                fp0Var = new fp0(j2, jLongValue, list);
                return fp0Var;
            case 1:
            case 2:
            case 4:
            case 5:
            case 11:
            default:
                if (!fkaVar.l()) {
                    return null;
                }
                try {
                    iU3 = ch3.U(fkaVar);
                } catch (Throwable th22) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th22);
                    Iterator it8 = fjf.a.iterator();
                    while (it8.hasNext()) {
                        AccountInitializer accountInitializer11 = ((n6) it8.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th22);
                            accountInitializer11.d().i().g().a(null, th22);
                        } catch (Throwable th23) {
                            gm0.V("Payload", "failed to collect exception", th23);
                        }
                    }
                    int iD8 = qt4.D(pye.a);
                    if (iD8 != 0) {
                        if (iD8 == 1) {
                            throw th22;
                        }
                        ore.o();
                        return null;
                    }
                    iU3 = 0;
                }
                String strX4 = null;
                String strX5 = null;
                long jT3 = 0;
                while (i3 < iU3) {
                    try {
                        strX3 = ch3.X(fkaVar, null);
                    } catch (Throwable th24) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th24);
                        Iterator it9 = fjf.a.iterator();
                        while (it9.hasNext()) {
                            AccountInitializer accountInitializer12 = ((n6) it9.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th24);
                                accountInitializer12.d().i().g().a(null, th24);
                            } catch (Throwable th25) {
                                gm0.V("Payload", "failed to collect exception", th25);
                            }
                        }
                        int iD9 = qt4.D(pye.a);
                        if (iD9 != 0) {
                            if (iD9 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th24;
                        }
                        strX3 = null;
                    }
                    if (strX3 != null) {
                        try {
                            int iHashCode2 = strX3.hashCode();
                            if (iHashCode2 != 3195150) {
                                if (iHashCode2 != 106642798) {
                                    if (iHashCode2 == 1431776630 && strX3.equals("authDate")) {
                                        try {
                                            jT3 = ch3.T(fkaVar, 0L);
                                        } catch (Throwable th26) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th26);
                                            Iterator it10 = fjf.a.iterator();
                                            while (it10.hasNext()) {
                                                AccountInitializer accountInitializer13 = ((n6) it10.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th26);
                                                    accountInitializer13.d().i().g().a(null, th26);
                                                } catch (Throwable th27) {
                                                    gm0.V("Payload", "failed to collect exception", th27);
                                                }
                                            }
                                            int iD10 = qt4.D(pye.a);
                                            if (iD10 != 0) {
                                                if (iD10 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th26;
                                            }
                                            jT3 = 0;
                                        }
                                    } else {
                                        try {
                                            fkaVar.x();
                                        } catch (Throwable th28) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th28);
                                            Iterator it11 = fjf.a.iterator();
                                            while (it11.hasNext()) {
                                                AccountInitializer accountInitializer14 = ((n6) it11.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th28);
                                                    accountInitializer14.d().i().g().a(null, th28);
                                                } catch (Throwable th29) {
                                                    gm0.V("Payload", "failed to collect exception", th29);
                                                }
                                            }
                                            int iD11 = qt4.D(pye.a);
                                            if (iD11 != 0) {
                                                if (iD11 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th28;
                                            }
                                        }
                                    }
                                } else if (strX3.equals("phone")) {
                                    try {
                                        strX4 = ch3.X(fkaVar, null);
                                    } catch (Throwable th30) {
                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th30);
                                        Iterator it12 = fjf.a.iterator();
                                        while (it12.hasNext()) {
                                            AccountInitializer accountInitializer15 = ((n6) it12.next()).a;
                                            try {
                                                gm0.V("Payload", "error while parse payload", th30);
                                                accountInitializer15.d().i().g().a(null, th30);
                                            } catch (Throwable th31) {
                                                gm0.V("Payload", "failed to collect exception", th31);
                                            }
                                        }
                                        int iD12 = qt4.D(pye.a);
                                        if (iD12 != 0) {
                                            if (iD12 != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw th30;
                                        }
                                        strX4 = null;
                                    }
                                } else {
                                    fkaVar.x();
                                }
                            } else if (strX3.equals("hash")) {
                                try {
                                    strX5 = ch3.X(fkaVar, null);
                                } catch (Throwable th32) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th32);
                                    Iterator it13 = fjf.a.iterator();
                                    while (it13.hasNext()) {
                                        AccountInitializer accountInitializer16 = ((n6) it13.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th32);
                                            accountInitializer16.d().i().g().a(null, th32);
                                        } catch (Throwable th33) {
                                            gm0.V("Payload", "failed to collect exception", th33);
                                        }
                                    }
                                    int iD13 = qt4.D(pye.a);
                                    if (iD13 != 0) {
                                        if (iD13 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th32;
                                    }
                                    strX5 = null;
                                }
                            } else {
                                fkaVar.x();
                            }
                        } catch (Throwable th34) {
                            try {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th34);
                                Iterator it14 = fjf.a.iterator();
                                while (it14.hasNext()) {
                                    AccountInitializer accountInitializer17 = ((n6) it14.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th34);
                                        accountInitializer17.d().i().g().a(null, th34);
                                    } catch (Throwable th35) {
                                        gm0.V("Payload", "failed to collect exception", th35);
                                    }
                                }
                                int iD14 = qt4.D(pye.a);
                                if (iD14 != 0) {
                                    if (iD14 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th34;
                                }
                            } catch (Throwable th36) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th36);
                                Iterator it15 = fjf.a.iterator();
                                while (it15.hasNext()) {
                                    AccountInitializer accountInitializer18 = ((n6) it15.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th36);
                                        accountInitializer18.d().i().g().a(null, th36);
                                    } catch (Throwable th37) {
                                        gm0.V("Payload", "failed to collect exception", th37);
                                    }
                                }
                                int iD15 = qt4.D(pye.a);
                                if (iD15 != 0) {
                                    if (iD15 == 1) {
                                        throw th36;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    i3++;
                    break;
                }
                String str2 = strX5;
                if (strX4 == null && str2 == null && jT3 != 0) {
                    return null;
                }
                return new eqj(jT3, strX4, str2);
            case 3:
                if (!fkaVar.l()) {
                    return null;
                }
                try {
                    iU2 = ch3.U(fkaVar);
                } catch (Throwable th38) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th38);
                    Iterator it16 = fjf.a.iterator();
                    while (it16.hasNext()) {
                        AccountInitializer accountInitializer19 = ((n6) it16.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th38);
                            accountInitializer19.d().i().g().a(null, th38);
                        } catch (Throwable th39) {
                            gm0.V("Payload", "failed to collect exception", th39);
                        }
                    }
                    int iD16 = qt4.D(pye.a);
                    if (iD16 != 0) {
                        if (iD16 == 1) {
                            throw th38;
                        }
                        ore.o();
                        return null;
                    }
                    iU2 = 0;
                }
                if (iU2 == 0) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(iU2);
                for (int i4 = 0; i4 < iU2; i4++) {
                    try {
                        strX2 = ch3.X(fkaVar, null);
                    } catch (Throwable th40) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th40);
                        Iterator it17 = fjf.a.iterator();
                        while (it17.hasNext()) {
                            AccountInitializer accountInitializer20 = ((n6) it17.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th40);
                                accountInitializer20.d().i().g().a(null, th40);
                            } catch (Throwable th41) {
                                gm0.V("Payload", "failed to collect exception", th41);
                            }
                        }
                        int iD17 = qt4.D(pye.a);
                        if (iD17 != 0) {
                            if (iD17 == 1) {
                                throw th40;
                            }
                            ore.o();
                            return null;
                        }
                        strX2 = null;
                    }
                    if (strX2 != null) {
                        if (strX2.equals("liveStreams")) {
                            try {
                                iJ = ch3.J(fkaVar);
                            } catch (Throwable th42) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th42);
                                Iterator it18 = fjf.a.iterator();
                                while (it18.hasNext()) {
                                    AccountInitializer accountInitializer21 = ((n6) it18.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th42);
                                        accountInitializer21.d().i().g().a(null, th42);
                                    } catch (Throwable th43) {
                                        gm0.V("Payload", "failed to collect exception", th43);
                                    }
                                }
                                int iD18 = qt4.D(pye.a);
                                if (iD18 != 0) {
                                    if (iD18 == 1) {
                                        throw th42;
                                    }
                                    ore.o();
                                    return null;
                                }
                                iJ = 0;
                            }
                            for (int i5 = 0; i5 < iJ; i5++) {
                                f99 f99VarF = xsg.f(fkaVar);
                                if (f99VarF != null) {
                                    arrayList.add(f99VarF);
                                }
                            }
                            break;
                        } else {
                            try {
                                fkaVar.x();
                            } catch (Throwable th44) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th44);
                                Iterator it19 = fjf.a.iterator();
                                while (it19.hasNext()) {
                                    AccountInitializer accountInitializer22 = ((n6) it19.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th44);
                                        accountInitializer22.d().i().g().a(null, th44);
                                    } catch (Throwable th45) {
                                        gm0.V("Payload", "failed to collect exception", th45);
                                    }
                                }
                                int iD19 = qt4.D(pye.a);
                                if (iD19 != 0) {
                                    if (iD19 == 1) {
                                        throw th44;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    break;
                }
                return new g13(arrayList);
            case 6:
                return e(fkaVar);
            case 7:
                return f(fkaVar);
            case 8:
                return g(fkaVar);
            case 9:
                return j(fkaVar);
            case 10:
                return k(fkaVar);
            case 12:
                return l(fkaVar);
        }
    }

    public void m(xgh xghVar, View view, View view2, float f2, Drawable drawable) {
        RectF rectFB = b(xghVar, view);
        RectF rectFB2 = b(xghVar, view2);
        drawable.setBounds(lk.c((int) rectFB.left, f2, (int) rectFB2.left), drawable.getBounds().top, lk.c((int) rectFB.right, f2, (int) rectFB2.right), drawable.getBounds().bottom);
    }

    public /* synthetic */ gp0(int i2) {
        this.a = i2;
    }
}
