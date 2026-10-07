package defpackage;

import android.net.Uri;
import android.util.Log;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public class j85 implements fu3, h18, pl9, gd4, o4d, aw4, k0g {
    public static j85 b;
    public static final j85 c = new j85(1);
    public static final j85 d = new j85(2);
    public static final j85 e = new j85(3);
    public static final j85 f = new j85(4);
    public static final j85 g = new j85(5);
    public static final j85 h = new j85(6);
    public static final j85 i = new j85(7);
    public static final /* synthetic */ j85 j = new j85(8);
    public static final j85 k = new j85(9);
    public static final j85 l = new j85(10);
    public static final j85 m = new j85(11);
    public static final j85 n = new j85(12);
    public static final j85 o = new j85(13);
    public final /* synthetic */ int a;

    public /* synthetic */ j85(int i2) {
        this.a = i2;
    }

    public static final ar3 f(j85 j85Var, String str) {
        ar3 ar3Var = new ar3(str);
        ar3.d.put(str, ar3Var);
        return ar3Var;
    }

    private final kih q(fka fkaVar) {
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
        ka3 ka3VarV = null;
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
                    if (strX.equals("chatReactionsSettings")) {
                        ka3VarV = np4.v(fkaVar);
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
        if (ka3VarV != null) {
            return new de3(ka3VarV);
        }
        return null;
    }

    private final kih r(fka fkaVar) {
        int iU;
        String strX;
        if (!fkaVar.l()) {
            return new qj4(null);
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
        if (iU == 0) {
            return new qj4(null);
        }
        pj4 pj4VarE = null;
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
                    if (iD2 == 1) {
                        throw th3;
                    }
                    ore.o();
                    return null;
                }
                strX = null;
            }
            if (strX != null) {
                if (strX.equals("contact")) {
                    try {
                        pj4VarE = pj4.e(fkaVar);
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
                            if (iD3 == 1) {
                                throw th5;
                            }
                            ore.o();
                            return null;
                        }
                        pj4VarE = null;
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
                            if (iD4 == 1) {
                                throw th7;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        return new qj4(pj4VarE);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x01b1 A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #4 {all -> 0x01e3, blocks: (B:45:0x00a9, B:174:0x0259, B:175:0x0262, B:177:0x0268, B:181:0x0285, B:182:0x0289, B:186:0x0294, B:187:0x0299, B:188:0x029a, B:52:0x00be, B:55:0x00c8, B:124:0x01a2, B:125:0x01ab, B:127:0x01b1, B:131:0x01ce, B:132:0x01d2, B:136:0x01dd, B:137:0x01e2, B:140:0x01e7, B:142:0x01ec, B:167:0x0244, B:150:0x01fe, B:151:0x0207, B:153:0x020d, B:157:0x022a, B:159:0x0230, B:163:0x023b, B:164:0x0240, B:165:0x0241, B:168:0x024a, B:189:0x029b, B:178:0x0270, B:154:0x0215, B:128:0x01b9, B:170:0x0252, B:146:0x01f7), top: B:239:0x00a9, outer: #2, inners: #6, #9, #12, #18, #20 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x01dd A[Catch: all -> 0x01e3, TryCatch #4 {all -> 0x01e3, blocks: (B:45:0x00a9, B:174:0x0259, B:175:0x0262, B:177:0x0268, B:181:0x0285, B:182:0x0289, B:186:0x0294, B:187:0x0299, B:188:0x029a, B:52:0x00be, B:55:0x00c8, B:124:0x01a2, B:125:0x01ab, B:127:0x01b1, B:131:0x01ce, B:132:0x01d2, B:136:0x01dd, B:137:0x01e2, B:140:0x01e7, B:142:0x01ec, B:167:0x0244, B:150:0x01fe, B:151:0x0207, B:153:0x020d, B:157:0x022a, B:159:0x0230, B:163:0x023b, B:164:0x0240, B:165:0x0241, B:168:0x024a, B:189:0x029b, B:178:0x0270, B:154:0x0215, B:128:0x01b9, B:170:0x0252, B:146:0x01f7), top: B:239:0x00a9, outer: #2, inners: #6, #9, #12, #18, #20 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x01e7 A[Catch: all -> 0x01e3, TryCatch #4 {all -> 0x01e3, blocks: (B:45:0x00a9, B:174:0x0259, B:175:0x0262, B:177:0x0268, B:181:0x0285, B:182:0x0289, B:186:0x0294, B:187:0x0299, B:188:0x029a, B:52:0x00be, B:55:0x00c8, B:124:0x01a2, B:125:0x01ab, B:127:0x01b1, B:131:0x01ce, B:132:0x01d2, B:136:0x01dd, B:137:0x01e2, B:140:0x01e7, B:142:0x01ec, B:167:0x0244, B:150:0x01fe, B:151:0x0207, B:153:0x020d, B:157:0x022a, B:159:0x0230, B:163:0x023b, B:164:0x0240, B:165:0x0241, B:168:0x024a, B:189:0x029b, B:178:0x0270, B:154:0x0215, B:128:0x01b9, B:170:0x0252, B:146:0x01f7), top: B:239:0x00a9, outer: #2, inners: #6, #9, #12, #18, #20 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:266:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x01da A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [kih] */
    private final kih s(fka fkaVar) {
        int iU;
        String str;
        String strX;
        long jT;
        Throwable th;
        Iterator it;
        int iD;
        int iJ;
        u8b u8bVar;
        int i2;
        String strX2;
        int i3;
        int i4 = 1;
        String str2 = null;
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
        vy2 vy2VarI = null;
        Long lValueOf = null;
        u8b u8bVar2 = null;
        int i5 = 0;
        while (i5 < iU) {
            try {
                strX = ch3.X(fkaVar, str2);
            } catch (Throwable th4) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it3 = fjf.a.iterator();
                while (it3.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it3.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th4);
                        accountInitializer2.d().i().g().a(str2, th4);
                    } catch (Throwable th5) {
                        gm0.V("Payload", "failed to collect exception", th5);
                    }
                }
                int iD3 = qt4.D(pye.a);
                if (iD3 != 0) {
                    if (iD3 != i4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th4;
                }
                strX = str2;
            }
            if (strX != null) {
                try {
                    int iHashCode = strX.hashCode();
                    if (iHashCode != -1268966290) {
                        if (iHashCode != -828062679) {
                            if (iHashCode == -321816439 && strX.equals("foldersOrder")) {
                                u8b u8bVar3 = cqb.b;
                                try {
                                    if (fkaVar.y().a() == 7) {
                                        try {
                                            iJ = ch3.J(fkaVar);
                                        } catch (Throwable th6) {
                                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                            try {
                                                Iterator it4 = fjf.a.iterator();
                                                while (it4.hasNext()) {
                                                    AccountInitializer accountInitializer3 = ((n6) it4.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th6);
                                                        accountInitializer3.d().i().g().a(str2, th6);
                                                    } catch (Throwable th7) {
                                                        gm0.V("Payload", "failed to collect exception", th7);
                                                    }
                                                }
                                                int iD4 = qt4.D(pye.a);
                                                if (iD4 != 0) {
                                                    try {
                                                        if (iD4 != i4) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th6;
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        u8bVar3 = u8bVar3;
                                                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                        it = fjf.a.iterator();
                                                        while (it.hasNext()) {
                                                            AccountInitializer accountInitializer4 = ((n6) it.next()).a;
                                                            try {
                                                                gm0.V("Payload", "error while parse payload", th);
                                                                accountInitializer4.d().i().g().a(null, th);
                                                            } catch (Throwable th9) {
                                                                gm0.V("Payload", "failed to collect exception", th9);
                                                            }
                                                        }
                                                        iD = qt4.D(pye.a);
                                                        if (iD != 0) {
                                                            if (iD != 1) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            throw th;
                                                        }
                                                        u8bVar2 = u8bVar3;
                                                        i5++;
                                                        i4 = 1;
                                                        str2 = null;
                                                    }
                                                } else {
                                                    iJ = 0;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
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
                                                    if (iD != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw th;
                                                }
                                                u8bVar2 = u8bVar3;
                                                i5++;
                                                i4 = 1;
                                                str2 = null;
                                            }
                                        }
                                        u8b u8bVar4 = new u8b(iJ);
                                        int i6 = 0;
                                        while (i6 < iJ) {
                                            try {
                                                strX2 = ch3.X(fkaVar, str2);
                                                i2 = i6;
                                            } catch (Throwable th11) {
                                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                                                Iterator it5 = fjf.a.iterator();
                                                while (it5.hasNext()) {
                                                    AccountInitializer accountInitializer6 = ((n6) it5.next()).a;
                                                    try {
                                                        gm0.V("Payload", "error while parse payload", th11);
                                                        i3 = i6;
                                                        try {
                                                            accountInitializer6.d().i().g().a(null, th11);
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            gm0.V("Payload", "failed to collect exception", th);
                                                            i6 = i3;
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        i3 = i6;
                                                    }
                                                    i6 = i3;
                                                }
                                                i2 = i6;
                                                int iD5 = qt4.D(pye.a);
                                                if (iD5 != 0) {
                                                    if (iD5 != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    throw th11;
                                                }
                                                strX2 = null;
                                            }
                                            if (strX2 != null) {
                                                try {
                                                    u8bVar4.b(strX2);
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    th = th;
                                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                                                    it = fjf.a.iterator();
                                                    while (it.hasNext()) {
                                                        AccountInitializer accountInitializer7 = ((n6) it.next()).a;
                                                        gm0.V("Payload", "error while parse payload", th);
                                                        accountInitializer7.d().i().g().a(null, th);
                                                    }
                                                    iD = qt4.D(pye.a);
                                                    if (iD != 0) {
                                                        if (iD != 1) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        throw th;
                                                    }
                                                    u8bVar2 = u8bVar3;
                                                    i5++;
                                                    i4 = 1;
                                                    str2 = null;
                                                }
                                            }
                                            i6 = i2 + 1;
                                            str2 = null;
                                        }
                                        u8bVar = u8bVar4;
                                    } else {
                                        fkaVar.x();
                                        u8bVar = u8bVar3;
                                    }
                                    u8bVar2 = u8bVar;
                                } catch (Throwable th15) {
                                    th = th15;
                                }
                            } else {
                                try {
                                    fkaVar.x();
                                } catch (Throwable th16) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th16);
                                    Iterator it6 = fjf.a.iterator();
                                    while (it6.hasNext()) {
                                        AccountInitializer accountInitializer8 = ((n6) it6.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th16);
                                            accountInitializer8.d().i().g().a(null, th16);
                                        } catch (Throwable th17) {
                                            gm0.V("Payload", "failed to collect exception", th17);
                                        }
                                    }
                                    int iD6 = qt4.D(pye.a);
                                    if (iD6 != 0) {
                                        if (iD6 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th16;
                                    }
                                }
                            }
                        } else if (strX.equals("folderSync")) {
                            try {
                                jT = ch3.T(fkaVar, 0L);
                            } catch (Throwable th18) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th18);
                                Iterator it7 = fjf.a.iterator();
                                while (it7.hasNext()) {
                                    AccountInitializer accountInitializer9 = ((n6) it7.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th18);
                                        accountInitializer9.d().i().g().a(null, th18);
                                    } catch (Throwable th19) {
                                        gm0.V("Payload", "failed to collect exception", th19);
                                    }
                                }
                                int iD7 = qt4.D(pye.a);
                                if (iD7 != 0) {
                                    if (iD7 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th18;
                                }
                                jT = 0;
                            }
                            lValueOf = Long.valueOf(jT);
                        } else {
                            fkaVar.x();
                        }
                    } else if (strX.equals("folder")) {
                        vy2VarI = qyj.I(fkaVar);
                    } else {
                        fkaVar.x();
                    }
                } catch (Throwable th20) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th20);
                        Iterator it8 = fjf.a.iterator();
                        while (it8.hasNext()) {
                            AccountInitializer accountInitializer10 = ((n6) it8.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th20);
                                accountInitializer10.d().i().g().a(null, th20);
                            } catch (Throwable th21) {
                                gm0.V("Payload", "failed to collect exception", th21);
                            }
                        }
                        int iD8 = qt4.D(pye.a);
                        if (iD8 != 0) {
                            if (iD8 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th20;
                        }
                    } catch (Throwable th22) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th22);
                        Iterator it9 = fjf.a.iterator();
                        while (it9.hasNext()) {
                            AccountInitializer accountInitializer11 = ((n6) it9.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th22);
                                accountInitializer11.d().i().g().a(null, th22);
                            } catch (Throwable th23) {
                                gm0.V("Payload", "failed to collect exception", th23);
                            }
                        }
                        int iD9 = qt4.D(pye.a);
                        if (iD9 != 0) {
                            if (iD9 == 1) {
                                throw th22;
                            }
                            ore.o();
                            return null;
                        }
                        str = null;
                    }
                }
            }
            i5++;
            i4 = 1;
            str2 = null;
        }
        str = str2;
        if (vy2VarI == null || lValueOf == null) {
            return str;
        }
        long jLongValue = lValueOf.longValue();
        if (u8bVar2 == null) {
            u8bVar2 = cqb.b;
        }
        return new p67(vy2VarI, jLongValue, u8bVar2);
    }

    private final kih t(fka fkaVar) {
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
        ysg ysgVarG = null;
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
                    if (strX.equals("storiesPreview")) {
                        try {
                            ysgVarG = xsg.g(fkaVar);
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
                            ysgVarG = null;
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
        if (ysgVarG != null) {
            return new skb(ysgVarG);
        }
        return null;
    }

    private final kih u(fka fkaVar) {
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
        return new bje(jT);
    }

    private final kih v(fka fkaVar) {
        int iU;
        String strX;
        int iJ;
        int iJ2;
        if (!fkaVar.l()) {
            return null;
        }
        u8b u8bVar = cqb.b;
        int i2 = 1;
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
        int i3 = 0;
        while (i3 < iU) {
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
                    if (iD2 != i2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    if (strX.equals("peerStories")) {
                        u8b u8bVar3 = cqb.b;
                        try {
                            if (fkaVar.y().a() == 7) {
                                try {
                                    iJ2 = ch3.J(fkaVar);
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
                                        if (iD3 != i2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th5;
                                    }
                                    iJ2 = 0;
                                }
                                u8b u8bVar4 = new u8b(iJ2);
                                for (int i4 = 0; i4 < iJ2; i4++) {
                                    tpc tpcVarC = spc.c(fkaVar);
                                    if (tpcVarC != null) {
                                        u8bVar4.b(tpcVarC);
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
                        }
                        u8bVar = u8bVar3;
                    } else if (strX.equals("storiesPreviews")) {
                        u8b u8bVar5 = cqb.b;
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
                                        if (iD5 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th9;
                                    }
                                    iJ = 0;
                                }
                                u8b u8bVar6 = new u8b(iJ);
                                for (int i5 = 0; i5 < iJ; i5++) {
                                    ysg ysgVarG = xsg.g(fkaVar);
                                    if (ysgVarG != null) {
                                        u8bVar6.b(ysgVarG);
                                    }
                                }
                                u8bVar5 = u8bVar6;
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
                        u8bVar2 = u8bVar5;
                    } else {
                        try {
                            fkaVar.x();
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
                        }
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
                        i3++;
                        i2 = 1;
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
            i3++;
            i2 = 1;
        }
        return new jrg(u8bVar, u8bVar2);
    }

    public static String w(ahb ahbVar) {
        if (ahbVar.equals(wgb.b)) {
            return "disabled";
        }
        if (ahbVar instanceof ygb) {
            ygb ygbVar = (ygb) ahbVar;
            long j2 = ygbVar.b;
            lw5 lw5Var = lw5.MINUTES;
            return qt4.l("schedule,", (int) oc9.x(ew5.s(j2, lw5Var), -2147483648L, 2147483647L), (int) oc9.x(ew5.s(ygbVar.c, lw5Var), -2147483648L, 2147483647L), ",");
        }
        if (ahbVar.equals(zgb.b)) {
            return "system";
        }
        if (ahbVar.equals(xgb.b)) {
            return "enabled";
        }
        ore.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    public static void y(cv4 cv4Var, Collection collection) throws JSONException {
        String string;
        String str;
        swh swhVar = swh.a;
        String strA = swh.a();
        if (strA == null) {
            return;
        }
        File file = new File(cv4Var.e());
        if (file.exists()) {
            Charset charset = pt2.a;
            JSONObject jSONObject = new JSONObject(lu6.p0(file, charset));
            if (!jSONObject.has("tags")) {
                File file2 = new File(cv4Var.f());
                if (!file2.exists()) {
                    file2 = null;
                }
                String strP0 = file2 != null ? lu6.p0(file2, charset) : null;
                if (strP0 != null) {
                    jSONObject.put("tags", new JSONArray(strP0));
                }
            }
            String string2 = jSONObject.toString();
            byte[] bArrA = pzl.a(new File(cv4Var.d()));
            File file3 = new File(cv4Var.b());
            byte[] bArrA2 = file3.exists() ? pzl.a(file3) : null;
            File file4 = new File(cv4Var.c());
            byte[] bArrA3 = file4.exists() ? pzl.a(file4) : null;
            if (collection == null) {
                string = null;
            } else {
                if (collection.isEmpty()) {
                    collection = null;
                }
                if (collection != null) {
                    string = qtl.b(collection).toString();
                } else {
                    string = null;
                }
            }
            int iH = cv4Var.h();
            int iD = qt4.D(iH);
            String str2 = (iD == 8 || iD == 9) ? "file" : "stackTrace";
            int iD2 = qt4.D(iH);
            String str3 = (iD2 == 8 || iD2 == 9) ? "file.gzip" : "stack.gzip";
            int iD3 = qt4.D(iH);
            if (iD3 != 8) {
                str = iD3 != 9 ? "api/crash/upload" : "api/crash/uploadAnr";
            } else {
                str = "api/crash/uploadNative";
            }
            Object obj = swh.c().get(cqk.b);
            lt4 lt4Var = obj instanceof lt4 ? (lt4) obj : null;
            if (lt4Var == null) {
                lt4Var = new lt4(new v2a(18));
            }
            String string3 = Uri.parse(lt4Var.b()).buildUpon().appendEncodedPath(str).appendQueryParameter("crashToken", strA).toString();
            rj5 rj5Var = new rj5(16);
            rj5Var.E("type", iic.d(iH));
            rj5Var.E("format", iic.a(iH));
            if (iic.b(iH) != null) {
                rj5Var.E("severity", iic.b(iH));
            }
            rj5Var.C(str2, str3, so2.J(bArrA));
            rj5Var.C("uploadBean", null, so2.K(BaseHttpHeadersHolder.CONTENT_TYPE_JSON, string2));
            if (bArrA2 != null) {
                rj5Var.C("threadDump", "threads.gzip", so2.J(bArrA2));
            }
            if (bArrA3 != null) {
                rj5Var.C("logs", "logs.gzip", so2.J(bArrA3));
            }
            if (string != null) {
                rj5Var.C("drops", "drops.json", so2.K("application/json", string));
            }
            a28 a28VarB = ((l28) swh.h.getValue()).b(new euc(string3, rj5Var.I()));
            try {
                int iK = a28VarB.K();
                String strI = a28VarB.I();
                String strF0 = z5h.F0(a28VarB.y().y());
                so2.Q(strF0, "CRASH_REPORT");
                if (iK != 200) {
                    Log.e("Tracer", strI + " , " + strF0);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(a28VarB, th);
                    throw th2;
                }
            }
        }
    }

    public static void z(List list) {
        Collection collectionE;
        list.size();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            cv4 cv4Var = (cv4) list.get(i2);
            if (i2 == 0) {
                swh swhVar = swh.a;
                collectionE = swh.b().e();
            } else {
                collectionE = null;
            }
            try {
                y(cv4Var, collectionE);
                cv4Var.a();
            } catch (Throwable unused) {
                if (collectionE != null) {
                    swh swhVar2 = swh.a;
                    swh.b().b(collectionE);
                }
            }
        }
    }

    @Override // defpackage.k0g
    public xx6 a(gjg gjgVar) {
        return new bye(new ryf(gjgVar, null, 6));
    }

    @Override // defpackage.gd4
    public void b(byte[] bArr) {
        throw new IllegalStateException("No connection");
    }

    @Override // defpackage.gd4
    public int c(int i2, byte[] bArr, int i3) {
        throw new IllegalStateException("No connection");
    }

    @Override // defpackage.gd4
    public boolean close() {
        return false;
    }

    @Override // defpackage.gd4
    public void d(byte[] bArr) {
        throw new IllegalStateException("No connection");
    }

    @Override // defpackage.gd4
    public vc4 e() {
        return new vc4(new pfh(0));
    }

    @Override // defpackage.o4d
    public m4d g(ArrayList arrayList) {
        return new m4d(arrayList);
    }

    @Override // defpackage.pl9
    public Object h(juc jucVar) {
        return jucVar.I;
    }

    /* JADX WARN: Code duplicated, block: B:448:0x037b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.fu3
    public kih i(fka fkaVar) {
        int iU;
        String strX;
        int iU2;
        String strX2;
        int iU3;
        List listA;
        int i2;
        boolean zL;
        long jT;
        r66 r66Var;
        String strX3;
        rj1 rj1Var = null;
        switch (this.a) {
            case 1:
                if (!fkaVar.l()) {
                    return null;
                }
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
                String strX4 = null;
                for (int i3 = 0; i3 < iU2; i3++) {
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
                            if (strX2.equals("trackId")) {
                                try {
                                    strX4 = ch3.X(fkaVar, null);
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
                                    strX4 = null;
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
                    break;
                }
                if (strX4 == null) {
                    return null;
                }
                return new gd0(strX4);
            case 2:
                if (fkaVar.l()) {
                    try {
                        iU3 = ch3.U(fkaVar);
                        while (true) {
                            r66Var = r66.a;
                            if (i2 < iU3) {
                                try {
                                    strX3 = ch3.X(fkaVar, null);
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
                                    strX3 = null;
                                }
                                if (strX3 != null) {
                                    try {
                                        int iHashCode = strX3.hashCode();
                                        if (iHashCode != -1417629679) {
                                            if (iHashCode != -1006239478) {
                                                if (iHashCode == 108404047 && strX3.equals("reset")) {
                                                    try {
                                                        zL = ch3.L(fkaVar);
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
                                                        zL = false;
                                                    }
                                                } else {
                                                    try {
                                                        fkaVar.x();
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
                                                    }
                                                }
                                            } else if (strX3.equals("callHistoryItems")) {
                                                listA = fjf.a(fkaVar, r66Var, new n61(1));
                                            } else {
                                                fkaVar.x();
                                            }
                                        } else if (strX3.equals("callHistorySync")) {
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
                                        } else {
                                            fkaVar.x();
                                        }
                                    } catch (Throwable th21) {
                                        try {
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
                                            i2++;
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
                                                if (iD12 == 1) {
                                                    throw th23;
                                                }
                                                ore.o();
                                            }
                                        }
                                    }
                                }
                                i2++;
                                break;
                            }
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
                        if (iD13 == 0) {
                            iU3 = 0;
                        } else {
                            if (iD13 == 1) {
                                throw th25;
                            }
                            ore.o();
                        }
                        return rj1Var;
                    }
                    listA = null;
                    i2 = 0;
                    zL = false;
                    jT = 0;
                    if (listA == null) {
                        listA = r66Var;
                    }
                    rj1Var = new rj1(listA, jT, zL);
                }
                return rj1Var;
            case 3:
                return q(fkaVar);
            case 4:
                return r(fkaVar);
            case 5:
            case 7:
            case 8:
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
                String strX5 = null;
                String strX6 = null;
                for (int i4 = 0; i4 < iU; i4++) {
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
                            if (strX.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                                try {
                                    strX5 = ch3.X(fkaVar, null);
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
                                    strX5 = null;
                                }
                            } else if (strX.equals("internalParams")) {
                                try {
                                    strX6 = ch3.X(fkaVar, null);
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
                                    strX6 = null;
                                }
                            } else {
                                try {
                                    fkaVar.x();
                                } catch (Throwable th35) {
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
                                }
                            }
                        } catch (Throwable th37) {
                            try {
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
                                    if (iD19 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th37;
                                }
                            } catch (Throwable th39) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th39);
                                Iterator it20 = fjf.a.iterator();
                                while (it20.hasNext()) {
                                    AccountInitializer accountInitializer20 = ((n6) it20.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th39);
                                        accountInitializer20.d().i().g().a(null, th39);
                                    } catch (Throwable th40) {
                                        gm0.V("Payload", "failed to collect exception", th40);
                                    }
                                }
                                int iD20 = qt4.D(pye.a);
                                if (iD20 != 0) {
                                    if (iD20 == 1) {
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
                return new hui(strX5, strX6);
            case 6:
                return s(fkaVar);
            case 9:
                return t(fkaVar);
            case 10:
                return u(fkaVar);
            case 11:
                return v(fkaVar);
        }
    }

    public nql j(b87 b87Var) {
        String str = b87Var.n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new pt(0);
                case "application/x-icy":
                    return new y38();
                case "application/id3":
                    return new d48();
                case "application/x-emsg":
                    return new pt(1);
                case "application/x-scte35":
                    return new weg();
            }
        }
        ore.p(qv1.k("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    public synchronized ar3 k(String str) {
        ar3 ar3Var;
        String strConcat;
        try {
            LinkedHashMap linkedHashMap = ar3.d;
            ar3Var = (ar3) linkedHashMap.get(str);
            if (ar3Var == null) {
                if (z5h.K0(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = z5h.K0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                ar3Var = (ar3) linkedHashMap.get(strConcat);
                if (ar3Var == null) {
                    ar3Var = new ar3(str);
                }
                linkedHashMap.put(str, ar3Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ar3Var;
    }

    public hn5 l(sm5 sm5Var) {
        ax5 ax5Var = new ax5(sm5Var.a, sm5Var.c, sm5Var.b, sm5Var.h);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        long j2 = sm5Var.f;
        long j3 = sm5Var.e;
        long j4 = sm5Var.d;
        gn5 gn5Var = new gn5();
        gn5Var.a = j3;
        gn5Var.b = j4;
        return new hn5(ax5Var, sm5Var.g, gn5Var, sm5Var.i, sm5Var.h, executorServiceNewSingleThreadExecutor);
    }

    public ay0 m(v78 v78Var, Object obj) {
        ay0 ay0Var = new ay0(n(v78Var.b).toString(), v78Var.h, v78Var.i, v78Var.g, null, null);
        ay0Var.g = obj;
        return ay0Var;
    }

    public Uri n(Uri uri) {
        return uri;
    }

    public l6g o(Uri uri) {
        return new l6g(n(uri).toString());
    }

    public ay0 p(v78 v78Var, Object obj) {
        v71 v71Var;
        String name;
        qcd qcdVar = v78Var.o;
        if (qcdVar != null) {
            v71 v71VarB = qcdVar.b();
            name = qcdVar.getClass().getName();
            v71Var = v71VarB;
        } else {
            v71Var = null;
            name = null;
        }
        ay0 ay0Var = new ay0(n(v78Var.b).toString(), v78Var.h, v78Var.i, v78Var.g, v71Var, name);
        ay0Var.g = obj;
        return ay0Var;
    }

    public String toString() {
        switch (this.a) {
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return "NoConnection";
            case 24:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public boolean x(b87 b87Var) {
        String str = b87Var.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
