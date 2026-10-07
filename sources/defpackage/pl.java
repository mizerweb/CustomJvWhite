package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONArray;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes.dex */
public final class pl extends ha6 {
    public final /* synthetic */ int a;

    public /* synthetic */ pl(int i) {
        this.a = i;
    }

    @Override // defpackage.ha6
    public final void a(vxe vxeVar, Object obj) {
        int i;
        byte[] byteArray;
        byte[] byteArray2;
        byte[] bArrArray;
        int i2;
        String str;
        char c = '\b';
        switch (this.a) {
            case 0:
                xl xlVar = (xl) obj;
                vxeVar.c(1, xlVar.a);
                vxeVar.c(2, xlVar.b);
                vxeVar.B(3, xlVar.c);
                String str2 = xlVar.d;
                if (str2 == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.B(4, str2);
                }
                String str3 = xlVar.e;
                if (str3 == null) {
                    vxeVar.e(5);
                } else {
                    vxeVar.B(5, str3);
                }
                Long l = xlVar.f;
                if (l == null) {
                    vxeVar.e(6);
                } else {
                    vxeVar.c(6, l.longValue());
                }
                String str4 = xlVar.g;
                if (str4 == null) {
                    vxeVar.e(7);
                    return;
                } else {
                    vxeVar.B(7, str4);
                    return;
                }
            case 1:
                dn dnVar = (dn) obj;
                vxeVar.c(1, dnVar.d());
                vxeVar.B(2, dnVar.e());
                vxeVar.B(3, dnVar.c());
                String strB = dnVar.b();
                if (strB == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.B(4, strB);
                }
                vxeVar.c(5, dnVar.f());
                String string = new JSONArray((Collection) dnVar.a()).toString();
                if (string == null) {
                    vxeVar.e(6);
                    return;
                } else {
                    vxeVar.B(6, string);
                    return;
                }
            case 2:
                dk1 dk1Var = (dk1) obj;
                vxeVar.c(1, dk1Var.i());
                vxeVar.B(2, dk1Var.a());
                String strB2 = dk1Var.b();
                if (strB2 == null) {
                    vxeVar.e(3);
                } else {
                    vxeVar.B(3, strB2);
                }
                vxeVar.c(4, dk1Var.d());
                Long lK = dk1Var.k();
                if (lK == null) {
                    vxeVar.e(5);
                } else {
                    vxeVar.c(5, lK.longValue());
                }
                vxeVar.c(6, dk1Var.e());
                vxeVar.B(7, dk1Var.c());
                String strH = dk1Var.h();
                if (strH == null) {
                    vxeVar.e(8);
                } else {
                    vxeVar.B(8, strH);
                }
                String strJ = dk1Var.j();
                if (strJ == null) {
                    vxeVar.e(9);
                } else {
                    vxeVar.B(9, strJ);
                }
                vxeVar.c(10, dk1Var.l());
                Long lF = dk1Var.f();
                if (lF == null) {
                    vxeVar.e(11);
                } else {
                    vxeVar.c(11, lF.longValue());
                }
                Integer numG = dk1Var.g();
                if (numG == null) {
                    vxeVar.e(12);
                    return;
                } else {
                    vxeVar.c(12, numG.intValue());
                    return;
                }
            case 3:
                xi4 xi4Var = (xi4) obj;
                vxeVar.c(1, xi4Var.a);
                vxeVar.c(2, xi4Var.b);
                vxeVar.d(3, vd7.n(xi4Var.c));
                return;
            case 4:
                oh5 oh5Var = (oh5) obj;
                vxeVar.B(1, oh5Var.b());
                vxeVar.B(2, oh5Var.a());
                return;
            case 5:
                rl6 rl6Var = (rl6) obj;
                vxeVar.c(1, rl6Var.a);
                vxeVar.c(2, rl6Var.b);
                return;
            case 6:
                ql6 ql6Var = (ql6) obj;
                vxeVar.c(1, ql6Var.a);
                vxeVar.c(2, ql6Var.b);
                return;
            case 7:
                ge8 ge8Var = (ge8) obj;
                vxeVar.B(1, ge8Var.i());
                vxeVar.B(2, ge8Var.p());
                vxeVar.c(3, ge8Var.m());
                String strF = ge8Var.f();
                if (strF == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.B(4, strF);
                }
                vxeVar.c(5, ge8Var.j());
                vxeVar.c(6, ge8Var.k());
                vxeVar.c(7, ge8Var.l());
                Long lB = ge8Var.b();
                if (lB == null) {
                    vxeVar.e(8);
                } else {
                    vxeVar.c(8, lB.longValue());
                }
                String strR = ge8Var.r();
                if (strR == null) {
                    vxeVar.e(9);
                } else {
                    vxeVar.B(9, strR);
                }
                vxeVar.c(10, y3m.a(ge8Var.q()));
                vxeVar.c(11, ge8Var.d());
                vxeVar.c(12, ge8Var.o());
                vxeVar.c(13, ge8Var.e());
                vxeVar.c(14, ge8Var.n());
                String strC = ge8Var.c();
                if (strC == null) {
                    vxeVar.e(15);
                    return;
                } else {
                    vxeVar.B(15, strC);
                    return;
                }
            case 8:
                jka jkaVar = (jka) obj;
                String str5 = jkaVar.b;
                if (str5 == null) {
                    vxeVar.e(1);
                } else {
                    vxeVar.B(1, str5);
                }
                vxeVar.c(2, jkaVar.c);
                vxeVar.c(3, k1m.h(jkaVar.d).intValue());
                u75 u75Var = jkaVar.a;
                vxeVar.c(4, u75Var.a);
                vxeVar.c(5, u75Var.b);
                vxeVar.B(6, (String) u75Var.c);
                a70 a70Var = jkaVar.e;
                if (a70Var == null) {
                    vxeVar.e(7);
                    vxeVar.e(8);
                    vxeVar.e(9);
                    vxeVar.e(10);
                    vxeVar.e(11);
                    return;
                }
                vxeVar.c(7, k1m.f(a70Var.a).intValue());
                vxeVar.a(8, a70Var.b);
                vxeVar.a(9, a70Var.c);
                List list = (List) a70Var.d;
                String strZ1 = list == null ? null : ww3.z1(list, ",", null, null, null, 62);
                if (strZ1 == null) {
                    vxeVar.e(10);
                } else {
                    vxeVar.B(10, strZ1);
                }
                vxeVar.c(11, a70Var.e ? 1L : 0L);
                return;
            case 9:
                dpb dpbVar = (dpb) obj;
                vxeVar.c(1, dpbVar.b);
                vxeVar.c(2, dpbVar.c);
                Integer num = dpbVar.d;
                if (num == null) {
                    vxeVar.e(3);
                } else {
                    vxeVar.c(3, num.intValue());
                }
                qv5 qv5Var = dpbVar.e;
                String str6 = qv5Var != null ? qv5Var.a : null;
                if (str6 == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.B(4, str6);
                }
                String str7 = dpbVar.f;
                if (str7 == null) {
                    vxeVar.e(5);
                } else {
                    vxeVar.B(5, str7);
                }
                vxeVar.c(6, dpbVar.g ? 1L : 0L);
                ilb ilbVar = dpbVar.a;
                vxeVar.c(7, ilbVar.a);
                vxeVar.c(8, ilbVar.b);
                return;
            case 10:
                stc stcVar = (stc) obj;
                vxeVar.c(1, stcVar.e());
                vxeVar.c(2, stcVar.i());
                vxeVar.c(3, stcVar.b());
                vxeVar.B(4, stcVar.g());
                vxeVar.B(5, stcVar.h());
                vxeVar.c(6, stcVar.j());
                String strC2 = stcVar.c();
                if (strC2 == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.B(7, strC2);
                }
                vxeVar.B(8, stcVar.d());
                String strF2 = stcVar.f();
                if (strF2 == null) {
                    vxeVar.e(9);
                } else {
                    vxeVar.B(9, strF2);
                }
                String strA = stcVar.a();
                if (strA == null) {
                    vxeVar.e(10);
                } else {
                    vxeVar.B(10, strA);
                }
                vxeVar.c(11, qt4.D(stcVar.k()));
                return;
            case 11:
                ndd nddVar = (ndd) obj;
                vxeVar.B(1, nddVar.a);
                vxeVar.c(2, nddVar.b.longValue());
                return;
            case 12:
                cpd cpdVar = (cpd) obj;
                vxeVar.c(1, cpdVar.a);
                vxeVar.c(2, cpdVar.b);
                f68 f68Var = cpdVar.c;
                byte[] bArr = a.a;
                Protos.SelfProfile selfProfile = new Protos.SelfProfile();
                HashMap map = f68Var.a;
                ArrayList arrayList = f68Var.b;
                selfProfile.restrictions = new HashMap(map.size());
                if (!map.isEmpty()) {
                    for (Integer num2 : map.keySet()) {
                        Protos.RestrictionsInfo restrictionsInfo = new Protos.RestrictionsInfo();
                        restrictionsInfo.expiration = ((loe) map.get(num2)).a();
                        selfProfile.restrictions.put(num2, restrictionsInfo);
                    }
                }
                selfProfile.profileOptions = new int[arrayList.size()];
                if (!arrayList.isEmpty()) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr = selfProfile.profileOptions;
                        if (i3 < iArr.length) {
                            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
                            i3++;
                        }
                    }
                }
                vxeVar.d(3, sia.toByteArray(selfProfile));
                return;
            case 13:
                i7e i7eVar = (i7e) obj;
                vxeVar.B(1, i7eVar.a);
                vxeVar.c(2, i7eVar.b);
                String string2 = new JSONArray((Collection) i7eVar.c).toString();
                if (string2 == null) {
                    vxeVar.e(3);
                    return;
                } else {
                    vxeVar.B(3, string2);
                    return;
                }
            case 14:
                rqe rqeVar = (rqe) obj;
                vxeVar.B(1, rqeVar.a);
                vxeVar.B(2, rqeVar.b);
                vxeVar.c(3, rqeVar.c);
                String str8 = rqeVar.d;
                if (str8 == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.B(4, str8);
                }
                vxeVar.B(5, e9i.U(rqeVar.e));
                vxeVar.c(6, rqeVar.f ? 1L : 0L);
                List list2 = rqeVar.g;
                byte[] bArrB = list2 != null ? dga.b(list2) : null;
                if (bArrB == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.d(7, bArrB);
                }
                Map map2 = rqeVar.h;
                if (map2 != null) {
                    i = 0;
                    f67 f67Var = new f67(0);
                    for (Map.Entry entry : map2.entrySet()) {
                        i37 i37Var = (i37) entry.getKey();
                        Object value = entry.getValue();
                        if (qm9.$EnumSwitchMapping$0[i37Var.ordinal()] == 1) {
                            f67Var.b = (long[]) value;
                        }
                    }
                    byteArray = sia.toByteArray(f67Var);
                } else {
                    i = 0;
                    byteArray = null;
                }
                if (byteArray == null) {
                    vxeVar.e(8);
                } else {
                    vxeVar.d(8, byteArray);
                }
                List list3 = rqeVar.i;
                if (list3 != null) {
                    f67 f67Var2 = new f67(2);
                    int size = list3.size();
                    g67[] g67VarArr = new g67[size];
                    while (i < size) {
                        f47 f47Var = (f47) list3.get(i);
                        g67 g67Var = new g67();
                        char c2 = c;
                        g67Var.a = f47Var.e();
                        g67Var.b = f47Var.f();
                        g67Var.c = f47Var.b();
                        String strC3 = f47Var.c();
                        String str9 = "";
                        if (strC3 == null) {
                            strC3 = "";
                        }
                        g67Var.d = strC3;
                        Long lA = f47Var.a();
                        int i4 = i;
                        g67Var.e = lA != null ? lA.longValue() : -1L;
                        String strH2 = f47Var.h();
                        if (strH2 == null) {
                            strH2 = "";
                        }
                        g67Var.f = strH2;
                        String strD = f47Var.d();
                        if (strD == null) {
                            strD = "";
                        }
                        g67Var.g = strD;
                        String strG = f47Var.g();
                        if (strG != null) {
                            str9 = strG;
                        }
                        g67Var.h = str9;
                        g67VarArr[i4] = g67Var;
                        i = i4 + 1;
                        c = c2;
                    }
                    f67Var2.b = g67VarArr;
                    byteArray2 = sia.toByteArray(f67Var2);
                } else {
                    byteArray2 = null;
                }
                if (byteArray2 == null) {
                    vxeVar.e(9);
                } else {
                    vxeVar.d(9, byteArray2);
                }
                Set set = rqeVar.j;
                byte[] byteArray3 = set != null ? sia.toByteArray(yab.C(set)) : null;
                if (byteArray3 == null) {
                    vxeVar.e(10);
                } else {
                    vxeVar.d(10, byteArray3);
                }
                vxeVar.c(11, rqeVar.k);
                List list4 = rqeVar.l;
                List list5 = list4;
                if (list5 == null || list5.isEmpty()) {
                    bArrArray = null;
                } else {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(list4.size() * 8);
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        byteBufferAllocate.putLong(((Number) it.next()).longValue());
                    }
                    bArrArray = byteBufferAllocate.array();
                }
                if (bArrArray == null) {
                    vxeVar.e(12);
                } else {
                    vxeVar.d(12, bArrArray);
                }
                Long l2 = rqeVar.m;
                if (l2 == null) {
                    vxeVar.e(13);
                } else {
                    vxeVar.c(13, l2.longValue());
                }
                Long l3 = rqeVar.n;
                if (l3 == null) {
                    vxeVar.e(14);
                    return;
                } else {
                    vxeVar.c(14, l3.longValue());
                    return;
                }
            case 15:
                iu2 iu2Var = (iu2) obj;
                vxeVar.c(1, iu2Var.a());
                vxeVar.B(2, iu2Var.b());
                return;
            case 16:
                sig sigVar = (sig) obj;
                vxeVar.c(1, sigVar.a);
                vxeVar.c(2, sigVar.b);
                ce9 ce9Var = sigVar.c;
                Protos.LogEvent logEvent = new Protos.LogEvent();
                logEvent.time = ce9Var.f;
                logEvent.type = ce9Var.a;
                logEvent.event = ce9Var.b;
                Map map3 = ce9Var.e;
                if (map3 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        ch3.Y(map3, byteArrayOutputStream);
                        logEvent.params = byteArrayOutputStream.toByteArray();
                    } catch (IOException e) {
                        qr7.o(e);
                        return;
                    }
                }
                logEvent.userId = ce9Var.c;
                logEvent.sessionId = ce9Var.d;
                vxeVar.d(3, sia.toByteArray(logEvent));
                return;
            case 17:
                jmg jmgVar = (jmg) obj;
                vxeVar.c(1, jmgVar.a);
                String str10 = jmgVar.b;
                if (str10 == null) {
                    vxeVar.e(2);
                } else {
                    vxeVar.B(2, str10);
                }
                String str11 = jmgVar.c;
                if (str11 == null) {
                    vxeVar.e(3);
                } else {
                    vxeVar.B(3, str11);
                }
                vxeVar.c(4, jmgVar.d);
                vxeVar.c(5, jmgVar.e);
                vxeVar.c(6, jmgVar.f);
                vxeVar.B(7, jmgVar.g);
                String string3 = new JSONArray((Collection) jmgVar.h).toString();
                if (string3 == null) {
                    vxeVar.e(8);
                } else {
                    vxeVar.B(8, string3);
                }
                vxeVar.c(9, jmgVar.i ? 1L : 0L);
                return;
            case 18:
                olg olgVar = (olg) obj;
                vxeVar.c(1, olgVar.a);
                vxeVar.c(2, olgVar.b);
                vxeVar.c(3, olgVar.c);
                vxeVar.c(4, olgVar.d);
                String str12 = olgVar.e;
                if (str12 == null) {
                    vxeVar.e(5);
                } else {
                    vxeVar.B(5, str12);
                }
                vxeVar.c(6, olgVar.f);
                String str13 = olgVar.g;
                if (str13 == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.B(7, str13);
                }
                String str14 = olgVar.h;
                if (str14 == null) {
                    vxeVar.e(8);
                } else {
                    vxeVar.B(8, str14);
                }
                String str15 = olgVar.i;
                if (str15 == null) {
                    vxeVar.e(9);
                } else {
                    vxeVar.B(9, str15);
                }
                vxeVar.B(10, ww3.z1(olgVar.j, ",", null, null, null, 62));
                int i5 = olgVar.k;
                if (i5 == 1) {
                    i2 = 0;
                } else if (i5 == 2) {
                    i2 = 10;
                } else if (i5 == 3) {
                    i2 = 20;
                } else {
                    if (i5 != 4) {
                        throw null;
                    }
                    i2 = 40;
                }
                vxeVar.c(11, i2);
                vxeVar.c(12, olgVar.l);
                String str16 = olgVar.m;
                if (str16 == null) {
                    vxeVar.e(13);
                } else {
                    vxeVar.B(13, str16);
                }
                vxeVar.c(14, olgVar.n ? 1L : 0L);
                vxeVar.c(15, c0a.a(olgVar.o));
                String str17 = olgVar.p;
                if (str17 == null) {
                    vxeVar.e(16);
                    return;
                } else {
                    vxeVar.B(16, str17);
                    return;
                }
            case 19:
                swg swgVar = (swg) obj;
                vxeVar.c(1, swgVar.d());
                vxeVar.B(2, swgVar.f());
                String strG2 = swgVar.g();
                if (strG2 == null) {
                    vxeVar.e(3);
                } else {
                    vxeVar.B(3, strG2);
                }
                vxeVar.c(4, swgVar.i().a());
                vxeVar.c(5, swgVar.e());
                vxeVar.c(6, swgVar.h());
                vxeVar.c(7, swgVar.b());
                vxeVar.c(8, swgVar.a());
                vxeVar.c(9, swgVar.c());
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                lxg lxgVar = (lxg) obj;
                vxeVar.c(1, lxgVar.a());
                vxeVar.c(2, lxgVar.b());
                vxeVar.c(3, lxgVar.e() ? 1L : 0L);
                vxeVar.a(4, lxgVar.d());
                vxeVar.a(5, lxgVar.c());
                return;
            case 21:
                ixg ixgVar = (ixg) obj;
                vxeVar.c(1, ixgVar.b());
                vxeVar.B(2, ixgVar.a());
                return;
            case 22:
                jxg jxgVar = (jxg) obj;
                vxeVar.c(1, jxgVar.c());
                vxeVar.c(2, jxgVar.b());
                vxeVar.c(3, jxgVar.e());
                vxeVar.B(4, jxgVar.a());
                vxeVar.c(5, jxgVar.n());
                vxeVar.c(6, jxgVar.i());
                vxeVar.B(7, jxgVar.h());
                vxeVar.B(8, jxgVar.o());
                vxeVar.c(9, jxgVar.d());
                vxeVar.a(10, jxgVar.p());
                vxeVar.a(11, jxgVar.q());
                vxeVar.a(12, jxgVar.g());
                vxeVar.a(13, jxgVar.f());
                Float fK = jxgVar.k();
                if (fK == null) {
                    vxeVar.e(14);
                } else {
                    vxeVar.a(14, fK.floatValue());
                }
                Float fM = jxgVar.m();
                if (fM == null) {
                    vxeVar.e(15);
                } else {
                    vxeVar.a(15, fM.floatValue());
                }
                Float fL = jxgVar.l();
                if (fL == null) {
                    vxeVar.e(16);
                } else {
                    vxeVar.a(16, fL.floatValue());
                }
                Float fJ = jxgVar.j();
                if (fJ == null) {
                    vxeVar.e(17);
                    return;
                } else {
                    vxeVar.a(17, fJ.floatValue());
                    return;
                }
            case 23:
                rwg rwgVar = (rwg) obj;
                vxeVar.c(1, rwgVar.f());
                vxeVar.c(2, rwgVar.g());
                vxeVar.c(3, rwgVar.h());
                vxeVar.c(4, rwgVar.e());
                vxeVar.a(5, rwgVar.j());
                vxeVar.d(6, msl.c(rwgVar.i()));
                vxeVar.c(7, rwgVar.b());
                vxeVar.c(8, rwgVar.d());
                vxeVar.c(9, rwgVar.c());
                vxeVar.c(10, rwgVar.a());
                return;
            case 24:
                xwg xwgVar = (xwg) obj;
                vxeVar.c(1, xwgVar.a());
                vxeVar.a(2, xwgVar.f());
                vxeVar.a(3, xwgVar.g());
                vxeVar.a(4, xwgVar.e());
                vxeVar.a(5, xwgVar.d());
                vxeVar.a(6, xwgVar.b());
                vxeVar.a(7, xwgVar.c());
                return;
            case 25:
                zzg zzgVar = (zzg) obj;
                vxeVar.c(1, zzgVar.c());
                vxeVar.c(2, zzgVar.b());
                vxeVar.c(3, zzgVar.d());
                vxeVar.c(4, zzgVar.g());
                vxeVar.B(5, zzgVar.e());
                vxeVar.c(6, zzgVar.i() ? 1L : 0L);
                String strH3 = zzgVar.h();
                if (strH3 == null) {
                    vxeVar.e(7);
                } else {
                    vxeVar.B(7, strH3);
                }
                vxeVar.c(8, zzgVar.f().a());
                vxeVar.c(9, zzgVar.a());
                return;
            case 26:
                tfh tfhVar = (tfh) obj;
                vxeVar.B(1, tfhVar.a);
                vxeVar.c(2, tfhVar.b);
                vxeVar.c(3, tfhVar.c);
                return;
            case 27:
                ujh ujhVar = (ujh) obj;
                vxeVar.c(1, ujhVar.a);
                vxeVar.c(2, ujhVar.b.a);
                vxeVar.c(3, ujhVar.c.a);
                vxeVar.c(4, ujhVar.d);
                vxeVar.c(5, ujhVar.e);
                vxeVar.c(6, ujhVar.f);
                vxeVar.d(7, ujhVar.g);
                vxeVar.c(8, ujhVar.h);
                return;
            case 28:
                chi chiVar = (chi) obj;
                String str18 = chiVar.b;
                if (str18 == null) {
                    vxeVar.e(1);
                } else {
                    vxeVar.B(1, str18);
                }
                String str19 = chiVar.c;
                if (str19 == null) {
                    vxeVar.e(2);
                } else {
                    vxeVar.B(2, str19);
                }
                String str20 = chiVar.d;
                if (str20 == null) {
                    vxeVar.e(3);
                } else {
                    vxeVar.B(3, str20);
                }
                String str21 = chiVar.e;
                if (str21 == null) {
                    vxeVar.e(4);
                } else {
                    vxeVar.B(4, str21);
                }
                vxeVar.a(5, chiVar.f);
                vxeVar.c(6, chiVar.g);
                vxeVar.c(7, k1m.g(chiVar.h).intValue());
                vxeVar.c(8, chiVar.k);
                vxeVar.c(9, chiVar.l ? 1L : 0L);
                bhi bhiVar = chiVar.a;
                vxeVar.B(10, bhiVar.a);
                vxeVar.c(11, bhiVar.b);
                vxeVar.c(12, k1m.h(bhiVar.c).intValue());
                c01 c01Var = chiVar.i;
                if (c01Var != null) {
                    String str22 = c01Var.a;
                    if (str22 == null) {
                        vxeVar.e(13);
                    } else {
                        vxeVar.B(13, str22);
                    }
                    vxeVar.c(14, c01Var.c);
                    String str23 = c01Var.b;
                    if (str23 == null) {
                        vxeVar.e(15);
                    } else {
                        vxeVar.B(15, str23);
                    }
                } else {
                    vxeVar.e(13);
                    vxeVar.e(14);
                    vxeVar.e(15);
                }
                bji bjiVar = chiVar.j;
                if (bjiVar == null) {
                    vxeVar.e(16);
                    return;
                }
                int iA = bjiVar.a();
                if (iA == 0) {
                    vxeVar.e(16);
                    return;
                }
                int i6 = mki.$EnumSwitchMapping$0[qt4.D(iA)];
                if (i6 == 1) {
                    str = "UNSPECIFIED";
                } else if (i6 == 2) {
                    str = "ONE_VIDEO";
                } else {
                    if (i6 != 3) {
                        ore.o();
                        return;
                    }
                    str = "ONE_ME";
                }
                vxeVar.B(16, str);
                return;
            default:
                bzj bzjVar = (bzj) obj;
                vxeVar.B(1, bzjVar.a);
                vxeVar.B(2, bzjVar.b);
                return;
        }
    }

    @Override // defpackage.ha6
    public final String b() {
        switch (this.a) {
            case 0:
                return "INSERT OR REPLACE INTO `animoji` (`id`,`update_time`,`emoji`,`lottie_url`,`lottie_play_url`,`set_id`,`icon_url`) VALUES (?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `animoji_set` (`id`,`name`,`icon_url`,`icon_lottie_url`,`update_time`,`animoji_ids`) VALUES (?,?,?,?,?,?)";
            case 2:
                return "INSERT INTO `call_history` (`history_id`,`call_id`,`call_name`,`caller_id`,`message_id`,`chat_id`,`call_type`,`hangup_type`,`join_link`,`time`,`duration_ms`,`group_call_type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `contacts` (`id`,`server_id`,`data`) VALUES (nullif(?, 0),?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `favorite_sticker_sets` (`id`,`index`) VALUES (?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `favorite_stickers` (`id`,`index`) VALUES (?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `informer_banner` (`id`,`title`,`settings`,`description`,`priority`,`repeat`,`rerun`,`animoji_id`,`url`,`type`,`click_time`,`show_time`,`close_time`,`show_count`,`button_text`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `message_uploads` (`path`,`last_modified`,`upload_type`,`message_id`,`chat_id`,`attach_id`,`video_quality`,`video_start_trim_position`,`video_end_trim_position`,`video_fragments_paths`,`mute`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 9:
                return "INSERT OR IGNORE INTO `notifications_tracker_messages` (`message_id`,`time`,`push_source`,`drop_reason`,`push_type`,`show_analytics_sent`,`chat_id`,`post_id`) VALUES (?,?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR ABORT INTO `phones` (`id`,`phonebook_id`,`contact_id`,`phone`,`phone_key`,`server_phone`,`email`,`first_name`,`last_name`,`avatar_path`,`type`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `profile` (`id`,`server_id`,`profile`) VALUES (nullif(?, 0),?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `reactions_section` (`id`,`update_time`,`reactions`) VALUES (?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `chat_folder` (`id`,`title`,`order`,`emoji`,`filters`,`isHiddenForAllFolder`,`elements`,`filterSubjects`,`widgets`,`options`,`updateTime`,`favorites`,`templateId`,`sourceId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `folder_and_chats` (`chatId`,`folderId`) VALUES (?,?)";
            case 16:
                return "INSERT OR ABORT INTO `stat_events` (`id`,`timestamp`,`entry`) VALUES (nullif(?, 0),?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `sticker_sets` (`id`,`name`,`icon_url`,`author_id`,`created_time`,`updated_time`,`link`,`stickers`,`draft`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `stickers` (`id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type`,`video_url`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 19:
                return "INSERT OR ABORT INTO `story_drafts` (`draft_id`,`media_path`,`preview_path`,`type`,`expiration_ms`,`settings`,`canvas_width`,`canvas_height`,`created_at`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return "INSERT OR REPLACE INTO `story_draft_video_attrs` (`draft_id`,`duration_ms`,`is_muted`,`trim_start_fraction`,`trim_end_fraction`) VALUES (?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `story_draft_text_attrs` (`draft_id`,`background_id`) VALUES (?,?)";
            case 22:
                return "INSERT OR REPLACE INTO `story_draft_text_layers` (`layer_id`,`draft_id`,`position`,`align_mode`,`text_color`,`text_background_color`,`text`,`text_style`,`layout_width`,`translation_x`,`translation_y`,`scale`,`rotation`,`text_bounds_left`,`text_bounds_top`,`text_bounds_right`,`text_bounds_bottom`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `story_draft_drawing_layers` (`draft_id`,`layer_id`,`position`,`color`,`width`,`primitives`,`bounds_left`,`bounds_top`,`bounds_right`,`bounds_bottom`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 24:
                return "INSERT OR REPLACE INTO `story_draft_media_transform` (`draft_id`,`translation_x`,`translation_y`,`scale`,`rotation`,`pivot_x`,`pivot_y`) VALUES (?,?,?,?,?,?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `story_publish` (`publish_id`,`draft_id`,`segment_index`,`story_id`,`segment_path`,`is_video`,`upload_token`,`status`,`created_at`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            case 26:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 27:
                return "INSERT OR IGNORE INTO `tasks` (`id`,`type`,`status`,`fails_count`,`depends_request_id`,`dependency_type`,`data`,`created_time`) VALUES (?,?,?,?,?,?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `uploads` (`attach_local_id`,`prepared_path`,`file_name`,`upload_url`,`upload_progress`,`total_bytes`,`upload_status`,`created_time`,`is_transload`,`path`,`last_modified`,`upload_type`,`photo_token`,`attach_id`,`thumbhash_base64`,`desired_uploader`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public /* synthetic */ pl(int i, Object obj) {
        this.a = i;
    }
}
