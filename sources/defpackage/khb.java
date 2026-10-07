package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class khb implements fu3, nsi, ut4, bmh, aw4, ff0, pe7, e78, em9, cbb, b8h, lpd {
    public static khb b;
    public static final khb c = new khb(1);
    public static final khb d = new khb(2);
    public static final khb e = new khb(3);
    public static final /* synthetic */ khb f = new khb(4);
    public static final khb g = new khb(6);
    public static final khb h = new khb(7);
    public static final khb i = new khb(8);
    public static final khb j = new khb(9);
    public static final khb k = new khb(10);
    public static final khb l = new khb(11);
    public static final khb m = new khb(12);
    public static final khb n = new khb(13);
    public final /* synthetic */ int a;

    public /* synthetic */ khb(int i2) {
        this.a = i2;
    }

    public static gi6 q(pi6 pi6Var) {
        hi6 hi6Var = pi6Var instanceof hi6 ? (hi6) pi6Var : null;
        if (hi6Var != null) {
            return hi6Var.a;
        }
        return null;
    }

    private final kih r(fka fkaVar) {
        int iU;
        long j2;
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
        hm4 hm4VarA = null;
        long jT = Long.MIN_VALUE;
        for (int i2 = 0; i2 < iU; i2++) {
            try {
                strX = ch3.X(fkaVar, null);
                j2 = Long.MIN_VALUE;
            } catch (Throwable th3) {
                j2 = Long.MIN_VALUE;
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
                    if (strX.equals(ApiProtocol.PARAM_CHAT_ID)) {
                        try {
                            jT = ch3.T(fkaVar, jT);
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
                    } else if (strX.equals("messages")) {
                        hm4VarA = hm4.a(fkaVar);
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
        j2 = Long.MIN_VALUE;
        if (jT == j2 || hm4VarA == null) {
            return null;
        }
        return new q3b(jT, hm4VarA);
    }

    /* JADX WARN: Code duplicated, block: B:191:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final kih s(fka fkaVar) {
        int iU;
        String strX;
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
        ew5 ew5Var = null;
        Long lValueOf = null;
        List listA = null;
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
                    int iHashCode = strX.hashCode();
                    long jT = 0;
                    if (iHashCode != -338830486) {
                        if (iHashCode != -336959801) {
                            if (iHashCode == -295931082 && strX.equals("updateTime")) {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
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
                                lValueOf = Long.valueOf(jT);
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
                        } else if (strX.equals("banners")) {
                            listA = fjf.a(fkaVar, r66.a, dz7.j);
                        } else {
                            fkaVar.x();
                        }
                    } else if (strX.equals("showTime")) {
                        ghb ghbVar = ew5.b;
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
                        }
                        ew5Var = new ew5(qe7.P(jT, lw5.MILLISECONDS));
                    } else {
                        fkaVar.x();
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
            i2 = 1;
            str = null;
        }
        if (ew5Var == null) {
            ore.p("showTime is required field in NOTIF_BANNERS");
            return null;
        }
        long j2 = ew5Var.a;
        if (listA == null) {
            ore.p("banners is required field in NOTIF_BANNERS");
            return null;
        }
        if (lValueOf != null) {
            return new tib(j2, lValueOf.longValue(), listA);
        }
        ore.p("updateTime is required field in NOTIF_BANNERS");
        return null;
    }

    private final kih t(fka fkaVar) {
        int iU;
        String strX;
        int iJ;
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
        u8b u8bVar = null;
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
                    if (strX.equals("organizations")) {
                        u8b u8bVar2 = cqb.b;
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
                                u8b u8bVar3 = new u8b(iJ);
                                for (int i3 = 0; i3 < iJ; i3++) {
                                    yhc yhcVarC = xhc.c(fkaVar);
                                    if (yhcVarC != null) {
                                        u8bVar3.b(yhcVarC);
                                    }
                                }
                                u8bVar2 = u8bVar3;
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
                        }
                        u8bVar = u8bVar2;
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
        }
        if (u8bVar != null) {
            return new bic(u8bVar);
        }
        return null;
    }

    @Override // defpackage.b8h
    public boolean a(b87 b87Var) {
        String str = b87Var.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.ff0
    public void b(id7 id7Var) {
        id7Var.I("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // defpackage.lpd
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.lpd
    public void d(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // defpackage.cbb
    public void e(String str, Throwable th) {
        gm0.V("RLottie", str, th);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // defpackage.bmh
    public int g(int i2, CharSequence charSequence) {
        int i3 = 0;
        i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            cmh cmhVar = emh.a;
            if (directionality == 0) {
                i3 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        i3 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        i3 = 2;
                        continue;
                }
            }
        }
        return i3;
    }

    @Override // defpackage.cbb
    public void h(Throwable th) {
        gm0.V("RLottie", "fail!", th);
    }

    @Override // defpackage.fu3
    public kih i(fka fkaVar) {
        int iU;
        String strX;
        int iU2;
        String strX2;
        int iU3;
        String strX3;
        int iJ;
        switch (this.a) {
            case 1:
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
                long jT = 0;
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
                            if (strX.equals("timestamp")) {
                                try {
                                    jT = ch3.T(fkaVar, 0L);
                                } catch (Throwable th5) {
                                    try {
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
                                        jT = 0;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        Throwable th8 = th;
                                        try {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                                            Iterator it4 = fjf.a.iterator();
                                            while (it4.hasNext()) {
                                                AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th8);
                                                    accountInitializer4.d().i().g().a(null, th8);
                                                } catch (Throwable th9) {
                                                    gm0.V("Payload", "failed to collect exception", th9);
                                                }
                                            }
                                            int iD4 = qt4.D(pye.a);
                                            if (iD4 != 0) {
                                                if (iD4 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th8;
                                            }
                                        } catch (Throwable th10) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                            Iterator it5 = fjf.a.iterator();
                                            while (it5.hasNext()) {
                                                AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th10);
                                                    accountInitializer5.d().i().g().a(null, th10);
                                                } catch (Throwable th11) {
                                                    gm0.V("Payload", "failed to collect exception", th11);
                                                }
                                            }
                                            int iD5 = qt4.D(pye.a);
                                            if (iD5 != 0) {
                                                if (iD5 == 1) {
                                                    throw th10;
                                                }
                                                ore.o();
                                                return null;
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    fkaVar.x();
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
                                        if (iD6 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th12;
                                    }
                                }
                            }
                        } catch (Throwable th14) {
                            th = th14;
                        }
                    }
                    break;
                }
                return new rd0(jT);
            case 2:
            case 4:
            case 5:
            case 6:
            default:
                if (!fkaVar.l()) {
                    return null;
                }
                u8b u8bVar = cqb.b;
                try {
                    iU3 = ch3.U(fkaVar);
                } catch (Throwable th15) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                    Iterator it7 = fjf.a.iterator();
                    while (it7.hasNext()) {
                        AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th15);
                            accountInitializer7.d().i().g().a(null, th15);
                        } catch (Throwable th16) {
                            gm0.V("Payload", "failed to collect exception", th16);
                        }
                    }
                    int iD7 = qt4.D(pye.a);
                    if (iD7 != 0) {
                        if (iD7 == 1) {
                            throw th15;
                        }
                        ore.o();
                        return null;
                    }
                    iU3 = 0;
                }
                for (int i3 = 0; i3 < iU3; i3++) {
                    try {
                        strX3 = ch3.X(fkaVar, null);
                    } catch (Throwable th17) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                        Iterator it8 = fjf.a.iterator();
                        while (it8.hasNext()) {
                            AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th17);
                                accountInitializer8.d().i().g().a(null, th17);
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
                        strX3 = null;
                    }
                    if (strX3 != null) {
                        try {
                            if (strX3.equals("storyStats")) {
                                u8b u8bVar2 = cqb.b;
                                try {
                                    if (fkaVar.y().a() == 7) {
                                        try {
                                            iJ = ch3.J(fkaVar);
                                        } catch (Throwable th19) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th19);
                                            Iterator it9 = fjf.a.iterator();
                                            while (it9.hasNext()) {
                                                AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                                                try {
                                                    gm0.V("Payload", "error while parse payload", th19);
                                                    accountInitializer9.d().i().g().a(null, th19);
                                                } catch (Throwable th20) {
                                                    gm0.V("Payload", "failed to collect exception", th20);
                                                }
                                            }
                                            int iD9 = qt4.D(pye.a);
                                            if (iD9 != 0) {
                                                if (iD9 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th19;
                                            }
                                            iJ = 0;
                                        }
                                        u8b u8bVar3 = new u8b(iJ);
                                        for (int i4 = 0; i4 < iJ; i4++) {
                                            u8bVar3.b(dtl.d(fkaVar));
                                        }
                                        u8bVar2 = u8bVar3;
                                    } else {
                                        fkaVar.x();
                                    }
                                } catch (Throwable th21) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th21);
                                    Iterator it10 = fjf.a.iterator();
                                    while (it10.hasNext()) {
                                        AccountInitializer accountInitializer10 = ((n6) it10.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th21);
                                            accountInitializer10.d().i().g().a(null, th21);
                                        } catch (Throwable th22) {
                                            gm0.V("Payload", "failed to collect exception", th22);
                                        }
                                    }
                                    int iD10 = qt4.D(pye.a);
                                    if (iD10 != 0) {
                                        if (iD10 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th21;
                                    }
                                    u8bVar = u8bVar2;
                                }
                                u8bVar = u8bVar2;
                                break;
                            } else {
                                try {
                                    fkaVar.x();
                                } catch (Throwable th23) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th23);
                                    Iterator it11 = fjf.a.iterator();
                                    while (it11.hasNext()) {
                                        AccountInitializer accountInitializer11 = ((n6) it11.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th23);
                                            accountInitializer11.d().i().g().a(null, th23);
                                        } catch (Throwable th24) {
                                            gm0.V("Payload", "failed to collect exception", th24);
                                        }
                                    }
                                    int iD11 = qt4.D(pye.a);
                                    if (iD11 != 0) {
                                        if (iD11 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th23;
                                    }
                                }
                            }
                        } catch (Throwable th25) {
                            try {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th25);
                                Iterator it12 = fjf.a.iterator();
                                while (it12.hasNext()) {
                                    AccountInitializer accountInitializer12 = ((n6) it12.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th25);
                                        accountInitializer12.d().i().g().a(null, th25);
                                    } catch (Throwable th26) {
                                        gm0.V("Payload", "failed to collect exception", th26);
                                    }
                                }
                                int iD12 = qt4.D(pye.a);
                                if (iD12 != 0) {
                                    if (iD12 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th25;
                                }
                            } catch (Throwable th27) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th27);
                                Iterator it13 = fjf.a.iterator();
                                while (it13.hasNext()) {
                                    AccountInitializer accountInitializer13 = ((n6) it13.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th27);
                                        accountInitializer13.d().i().g().a(null, th27);
                                    } catch (Throwable th28) {
                                        gm0.V("Payload", "failed to collect exception", th28);
                                    }
                                }
                                int iD13 = qt4.D(pye.a);
                                if (iD13 != 0) {
                                    if (iD13 == 1) {
                                        throw th27;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    break;
                }
                return new nrg(u8bVar);
            case 3:
                if (!fkaVar.l()) {
                    return null;
                }
                try {
                    iU2 = ch3.U(fkaVar);
                } catch (Throwable th29) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th29);
                    Iterator it14 = fjf.a.iterator();
                    while (it14.hasNext()) {
                        AccountInitializer accountInitializer14 = ((n6) it14.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th29);
                            accountInitializer14.d().i().g().a(null, th29);
                        } catch (Throwable th30) {
                            gm0.V("Payload", "failed to collect exception", th30);
                        }
                    }
                    int iD14 = qt4.D(pye.a);
                    if (iD14 != 0) {
                        if (iD14 == 1) {
                            throw th29;
                        }
                        ore.o();
                        return null;
                    }
                    iU2 = 0;
                }
                List listA = null;
                long jT2 = 0;
                for (int i5 = 0; i5 < iU2; i5++) {
                    try {
                        strX2 = ch3.X(fkaVar, null);
                    } catch (Throwable th31) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th31);
                        Iterator it15 = fjf.a.iterator();
                        while (it15.hasNext()) {
                            AccountInitializer accountInitializer15 = ((n6) it15.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th31);
                                accountInitializer15.d().i().g().a(null, th31);
                            } catch (Throwable th32) {
                                gm0.V("Payload", "failed to collect exception", th32);
                            }
                        }
                        int iD15 = qt4.D(pye.a);
                        if (iD15 != 0) {
                            if (iD15 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th31;
                        }
                        strX2 = null;
                    }
                    if (strX2 != null) {
                        try {
                            if (strX2.equals("complainSync")) {
                                try {
                                    jT2 = ch3.T(fkaVar, 0L);
                                } catch (Throwable th33) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th33);
                                    Iterator it16 = fjf.a.iterator();
                                    while (it16.hasNext()) {
                                        AccountInitializer accountInitializer16 = ((n6) it16.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th33);
                                            accountInitializer16.d().i().g().a(null, th33);
                                        } catch (Throwable th34) {
                                            gm0.V("Payload", "failed to collect exception", th34);
                                        }
                                    }
                                    int iD16 = qt4.D(pye.a);
                                    if (iD16 != 0) {
                                        if (iD16 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th33;
                                    }
                                    jT2 = 0;
                                }
                            } else if (strX2.equals("complains")) {
                                listA = fjf.a(fkaVar, r66.a, new oo3(1, j54.c, i54.class, "invoke", "newInstance(Lorg/msgpack/core/MessageUnpacker;)Lru/ok/tamtam/api/commands/base/ComplainReasons;", 0, 1));
                            } else {
                                try {
                                    fkaVar.x();
                                } catch (Throwable th35) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th35);
                                    Iterator it17 = fjf.a.iterator();
                                    while (it17.hasNext()) {
                                        AccountInitializer accountInitializer17 = ((n6) it17.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th35);
                                            accountInitializer17.d().i().g().a(null, th35);
                                        } catch (Throwable th36) {
                                            gm0.V("Payload", "failed to collect exception", th36);
                                        }
                                    }
                                    int iD17 = qt4.D(pye.a);
                                    if (iD17 != 0) {
                                        if (iD17 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th35;
                                    }
                                }
                            }
                        } catch (Throwable th37) {
                            try {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th37);
                                Iterator it18 = fjf.a.iterator();
                                while (it18.hasNext()) {
                                    AccountInitializer accountInitializer18 = ((n6) it18.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th37);
                                        accountInitializer18.d().i().g().a(null, th37);
                                    } catch (Throwable th38) {
                                        gm0.V("Payload", "failed to collect exception", th38);
                                    }
                                }
                                int iD18 = qt4.D(pye.a);
                                if (iD18 != 0) {
                                    if (iD18 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th37;
                                }
                            } catch (Throwable th39) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th39);
                                Iterator it19 = fjf.a.iterator();
                                while (it19.hasNext()) {
                                    AccountInitializer accountInitializer19 = ((n6) it19.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th39);
                                        accountInitializer19.d().i().g().a(null, th39);
                                    } catch (Throwable th40) {
                                        gm0.V("Payload", "failed to collect exception", th40);
                                    }
                                }
                                int iD19 = qt4.D(pye.a);
                                if (iD19 != 0) {
                                    if (iD19 == 1) {
                                        throw th39;
                                    }
                                    ore.o();
                                    return null;
                                }
                            }
                        }
                    }
                    break;
                }
                if (listA == null) {
                    return null;
                }
                return new p54(jT2, listA);
            case 7:
                return r(fkaVar);
            case 8:
                return s(fkaVar);
            case 9:
                return t(fkaVar);
        }
    }

    @Override // defpackage.e78
    public ojd j(Context context, uj7 uj7Var, ib5 ib5Var, t3a t3aVar, at5 at5Var, boolean z, ee6 ee6Var, qg7 qg7Var, vi8 vi8Var, vi8 vi8Var2, dn5 dn5Var, j85 j85Var, k2d k2dVar, w4 w4Var) {
        return new ojd(context, uj7Var, ib5Var, t3aVar, at5Var, z, ee6Var, qg7Var, vi8Var, vi8Var2, dn5Var, j85Var, k2dVar, w4Var);
    }

    @Override // defpackage.em9
    public Map k(Map map) {
        return map == null ? new HashMap() : map;
    }

    @Override // defpackage.cbb
    public void l(String str) {
        gm0.n("RLottie", str);
    }

    @Override // defpackage.b8h
    public d8h m(b87 b87Var) {
        String str = b87Var.n;
        List list = b87Var.q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new tw5(list);
                case "application/pgs":
                    return new ljf(26);
                case "application/x-mp4-vtt":
                    return new x2b();
                case "text/vtt":
                    return new xp9(25);
                case "application/x-quicktime-tx3g":
                    return new c9i(list);
                case "text/x-ssa":
                    return new rfg(list);
                case "application/x-subrip":
                    return new k7h();
                case "application/ttml+xml":
                    return new q5i();
            }
        }
        ore.p(qv1.k("Unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.b8h
    public int n(b87 b87Var) {
        String str = b87Var.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        ore.p(qv1.k("Unsupported MIME type: ", str));
        return 0;
    }

    public HashMap o(Object obj) {
        ConcurrentHashMap concurrentHashMap = sn.a;
        Class<?> cls = obj.getClass();
        HashMap map = new HashMap();
        Map map2 = (Map) sn.a.get(cls);
        Map map3 = map2;
        if (map2 == null) {
            HashMap map4 = new HashMap();
            sn.a(cls, map4, new HashMap());
            map3 = map4;
        }
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                map.put(entry.getKey(), new uc6(obj, (Method) entry.getValue()));
            }
        }
        return map;
    }

    public HashMap p(Object obj) {
        ConcurrentHashMap concurrentHashMap = sn.a;
        Class<?> cls = obj.getClass();
        HashMap map = new HashMap();
        Map map2 = (Map) sn.b.get(cls);
        Map map3 = map2;
        if (map2 == null) {
            HashMap map4 = new HashMap();
            sn.a(cls, new HashMap(), map4);
            map3 = map4;
        }
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                HashSet hashSet = new HashSet();
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    hashSet.add(new jc6(obj, (Method) it.next()));
                }
                map.put(entry.getKey(), hashSet);
            }
        }
        return map;
    }

    @Override // defpackage.nsi
    public long v(kbc kbcVar) {
        return rx8.q(-1, kbcVar.getIcon().h);
    }
}
