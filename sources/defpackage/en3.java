package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class en3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ en3(yzg yzgVar, w0h w0hVar, long j) {
        this.a = 9;
        this.c = w0hVar;
        this.b = j;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x068b  */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        String str;
        String str2;
        rq3 rq3Var;
        a70 a70Var;
        zhc zhcVar;
        List list;
        mxg mxgVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object obj2 = null;
        long j = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                pq3 pq3Var = (pq3) obj3;
                ConcurrentHashMap concurrentHashMap = pq3Var.h().j;
                long j2 = this.b;
                mjg mjgVarA = p90.a((rt2) concurrentHashMap.get(Long.valueOf(j2)));
                rt2 rt2Var = (rt2) mjgVarA.getValue();
                if (rt2Var == null) {
                    yab.i0((gu4) ((ifh) pq3Var.d).getValue(), null, 0, new gn3(mjgVarA, null, pq3Var, j2, 1), 3);
                } else {
                    ((f9b) ((ConcurrentHashMap) pq3Var.e).computeIfAbsent(Long.valueOf(rt2Var.a), new hn3(new ol0(9, rt2Var)))).setValue(rt2Var);
                }
                return mjgVarA;
            case 1:
                ts8 ts8Var = (ts8) obj;
                du8 du8Var = new du8();
                String str3 = "ph";
                l51.d(du8Var, "ph", "M");
                l51.c(du8Var, "pid", 1);
                l51.c(du8Var, "tid", 1);
                l51.d(du8Var, SdkMetricStatEvent.NAME_KEY, "process_name");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                du8Var.b(new cu8(linkedHashMap), "args");
                ts8Var.a(du8Var.a());
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                List list2 = (List) obj3;
                ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    wrc wrcVar = (wrc) it.next();
                    rwh rwhVar = wrcVar.b;
                    String str4 = rwhVar.b;
                    String str5 = rwhVar.a;
                    if (str4 != null) {
                        Object obj4 = linkedHashMap2.get(str4);
                        if (obj4 == null) {
                            int iIntValue = ((Number) linkedHashMap3.getOrDefault(str5, 0)).intValue();
                            linkedHashMap3.put(str5, Integer.valueOf(iIntValue + 1));
                            rq3 rq3Var2 = new rq3(str5, iIntValue);
                            linkedHashMap2.put(str4, rq3Var2);
                            obj4 = rq3Var2;
                        }
                        rq3Var = (rq3) obj4;
                    } else {
                        ts8Var = ts8Var;
                        it = it;
                        int iIntValue2 = ((Number) linkedHashMap3.getOrDefault(str5, 0)).intValue();
                        linkedHashMap3.put(str5, Integer.valueOf(iIntValue2 + 1));
                        rq3Var = new rq3(str5, iIntValue2);
                    }
                    arrayList.add(new qq3(wrcVar, rq3Var));
                    it = it;
                    ts8Var = ts8Var;
                }
                ts8 ts8Var2 = ts8Var;
                ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((qq3) it2.next()).b);
                }
                List listK1 = ww3.k1(arrayList2);
                ArrayList arrayList3 = new ArrayList(yw3.W0(listK1, 10));
                int i2 = 0;
                for (Object obj5 : listK1) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    arrayList3.add(new ylc((rq3) obj5, Integer.valueOf(i3)));
                    i2 = i3;
                }
                Map mapW0 = wm9.W0(arrayList3);
                for (Map.Entry entry : mapW0.entrySet()) {
                    rq3 rq3Var3 = (rq3) entry.getKey();
                    int iIntValue3 = ((Number) entry.getValue()).intValue();
                    du8 du8Var2 = new du8();
                    l51.d(du8Var2, "ph", "M");
                    l51.c(du8Var2, "pid", 1);
                    l51.c(du8Var2, "tid", Integer.valueOf(iIntValue3));
                    l51.d(du8Var2, SdkMetricStatEvent.NAME_KEY, "thread_name");
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    int i4 = rq3Var3.b;
                    String strJ = rq3Var3.a;
                    if (i4 != 0) {
                        strJ = qt4.j(i4 + 1, strJ, " #");
                    }
                    du8Var2.b(new cu8(linkedHashMap4), "args");
                    ts8Var2.a(du8Var2.a());
                }
                ts8 ts8Var3 = ts8Var2;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    qq3 qq3Var = (qq3) it3.next();
                    wrc wrcVar2 = qq3Var.a;
                    int iIntValue4 = ((Number) wm9.N0(mapW0, qq3Var.b)).intValue();
                    List list3 = wrcVar2.e;
                    String str6 = wrcVar2.a;
                    boolean zIsEmpty = list3.isEmpty();
                    Iterable iterable = r66.a;
                    if (zIsEmpty) {
                        str = str3;
                    } else {
                        long jLongValue = ((Number) ((ylc) ww3.r1(list3)).b).longValue();
                        if (jLongValue < 0) {
                            str = str3;
                        } else {
                            long j3 = wrcVar2.g - jLongValue;
                            du8 du8Var3 = new du8();
                            l51.d(du8Var3, str3, "X");
                            l51.d(du8Var3, SdkMetricStatEvent.NAME_KEY, str6);
                            long j4 = j3;
                            l51.d(du8Var3, "cat", "perf");
                            l51.c(du8Var3, "pid", 1);
                            l51.c(du8Var3, "tid", Integer.valueOf(iIntValue4));
                            l51.c(du8Var3, "ts", Long.valueOf((j3 - j) * 1000));
                            l51.c(du8Var3, "dur", Long.valueOf(jLongValue * 1000));
                            String str7 = "dur";
                            j22 j22Var = new j22(19, wrcVar2);
                            du8 du8Var4 = new du8();
                            j22Var.invoke(du8Var4);
                            du8Var3.b(du8Var4.a(), "args");
                            ArrayList arrayListR0 = xw3.R0(du8Var3.a());
                            int size = list3.size();
                            int i5 = 1;
                            while (i5 < size) {
                                ylc ylcVar = (ylc) list3.get(i5);
                                int i6 = size;
                                String str8 = (String) ylcVar.a;
                                long jLongValue2 = ((Number) ylcVar.b).longValue();
                                if (jLongValue2 > 0) {
                                    du8 du8Var5 = new du8();
                                    l51.d(du8Var5, str3, "X");
                                    l51.d(du8Var5, SdkMetricStatEvent.NAME_KEY, str6 + "." + str8);
                                    l51.d(du8Var5, "cat", "perf");
                                    l51.c(du8Var5, "pid", 1);
                                    l51.c(du8Var5, "tid", Integer.valueOf(iIntValue4));
                                    l51.c(du8Var5, "ts", Long.valueOf((j4 - j) * 1000));
                                    str2 = str7;
                                    l51.c(du8Var5, str2, Long.valueOf(jLongValue2 * 1000));
                                    du8Var5.b(new cu8(new LinkedHashMap()), "args");
                                    arrayListR0.add(du8Var5.a());
                                    j4 += jLongValue2;
                                } else {
                                    str2 = str7;
                                }
                                i5++;
                                str7 = str2;
                                size = i6;
                                str3 = str3;
                            }
                            str = str3;
                            iterable = arrayListR0;
                        }
                    }
                    Iterator it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        ts8Var3.a((jt8) it4.next());
                    }
                    mapW0 = mapW0;
                    it3 = it3;
                    ts8Var3 = ts8Var3;
                    str3 = str;
                }
                return sbiVar;
            case 2:
                ((q04) obj3).k.remove(Long.valueOf(j));
                return sbiVar;
            case 3:
                nka nkaVar = (nka) obj3;
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM message_uploads WHERE message_id = ?");
                try {
                    vxeVarO0.c(1, j);
                    int iE = qyj.E(vxeVarO0, ClientCookie.PATH_ATTR);
                    int iE2 = qyj.E(vxeVarO0, "last_modified");
                    int iE3 = qyj.E(vxeVarO0, "upload_type");
                    int iE4 = qyj.E(vxeVarO0, "message_id");
                    int iE5 = qyj.E(vxeVarO0, "chat_id");
                    int iE6 = qyj.E(vxeVarO0, "attach_id");
                    int iE7 = qyj.E(vxeVarO0, "video_quality");
                    int iE8 = qyj.E(vxeVarO0, "video_start_trim_position");
                    int iE9 = qyj.E(vxeVarO0, "video_end_trim_position");
                    int iE10 = qyj.E(vxeVarO0, "video_fragments_paths");
                    int iE11 = qyj.E(vxeVarO0, "mute");
                    ArrayList arrayList4 = new ArrayList();
                    while (vxeVarO0.M0()) {
                        u75 u75Var = new u75();
                        int i7 = iE2;
                        int i8 = iE3;
                        u75Var.a = vxeVarO0.getLong(iE4);
                        u75Var.b = vxeVarO0.getLong(iE5);
                        u75Var.c = vxeVarO0.B0(iE6);
                        if (vxeVarO0.isNull(iE7) && vxeVarO0.isNull(iE8) && vxeVarO0.isNull(iE9) && vxeVarO0.isNull(iE10) && vxeVarO0.isNull(iE11)) {
                            iE4 = iE4;
                            a70Var = null;
                        } else {
                            a70Var = new a70();
                            a70Var.a = k1m.e(vxeVarO0.isNull(iE7) ? null : Integer.valueOf((int) vxeVarO0.getLong(iE7)));
                            a70Var.b = (float) vxeVarO0.getDouble(iE8);
                            a70Var.c = (float) vxeVarO0.getDouble(iE9);
                            String strB0 = vxeVarO0.isNull(iE10) ? null : vxeVarO0.B0(iE10);
                            if (strB0 == null) {
                                a70Var.d = null;
                            } else {
                                lhb lhbVar = nkaVar.c;
                                a70Var.d = lhb.o(strB0);
                            }
                            a70Var.e = ((int) vxeVarO0.getLong(iE11)) != 0;
                        }
                        jka jkaVar = new jka();
                        if (vxeVarO0.isNull(iE)) {
                            jkaVar.b = null;
                        } else {
                            jkaVar.b = vxeVarO0.B0(iE);
                        }
                        int i9 = iE5;
                        int i10 = iE6;
                        jkaVar.c = vxeVarO0.getLong(i7);
                        jkaVar.d = k1m.d(vxeVarO0.isNull(i8) ? null : Integer.valueOf((int) vxeVarO0.getLong(i8)));
                        jkaVar.a = u75Var;
                        jkaVar.e = a70Var;
                        arrayList4.add(jkaVar);
                        iE7 = iE7;
                        iE2 = i7;
                        iE3 = i8;
                        iE4 = iE4;
                        iE6 = i10;
                        iE5 = i9;
                        break;
                    }
                    return arrayList4;
                } finally {
                    vxeVarO0.close();
                }
            case 4:
                kic kicVar = (kic) obj3;
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT * FROM organizations WHERE id = ?");
                try {
                    vxeVarO1.c(1, j);
                    int iE12 = qyj.E(vxeVarO1, "id");
                    int iE13 = qyj.E(vxeVarO1, SdkMetricStatEvent.NAME_KEY);
                    int iE14 = qyj.E(vxeVarO1, "description");
                    int iE15 = qyj.E(vxeVarO1, "parentId");
                    int iE16 = qyj.E(vxeVarO1, "folderTemplateId");
                    int iE17 = qyj.E(vxeVarO1, "updateTime");
                    int iE18 = qyj.E(vxeVarO1, "iconUrl");
                    int iE19 = qyj.E(vxeVarO1, "links");
                    if (vxeVarO1.M0()) {
                        long j5 = vxeVarO1.getLong(iE12);
                        String strB1 = vxeVarO1.B0(iE13);
                        String strB2 = vxeVarO1.isNull(iE14) ? null : vxeVarO1.B0(iE14);
                        Long lValueOf = vxeVarO1.isNull(iE15) ? null : Long.valueOf(vxeVarO1.getLong(iE15));
                        Long lValueOf2 = vxeVarO1.isNull(iE16) ? null : Long.valueOf(vxeVarO1.getLong(iE16));
                        long j6 = vxeVarO1.getLong(iE17);
                        String strB3 = vxeVarO1.isNull(iE18) ? null : vxeVarO1.B0(iE18);
                        String strB4 = vxeVarO1.isNull(iE19) ? null : vxeVarO1.B0(iE19);
                        shc shcVar = (shc) kicVar.c.getValue();
                        if (strB4 == null) {
                            shcVar.getClass();
                            list = null;
                        } else {
                            qs8 qs8Var = (qs8) shcVar.a.getValue();
                            qs8Var.getClass();
                            list = (List) qs8Var.a(lvb.o0(new fw(rhc.Companion.serializer())), strB4);
                        }
                        zhcVar = new zhc(j5, strB1, strB2, lValueOf, lValueOf2, j6, strB3, list);
                    } else {
                        zhcVar = null;
                    }
                    return zhcVar;
                } finally {
                    vxeVarO1.close();
                }
            case 5:
                Throwable th = (Throwable) obj;
                gm0.x(((hjc) obj3).g, zo5.j(j, "complete mediatyping job for #"), !(th instanceof CancellationException) ? th : null);
                return sbiVar;
            case 6:
                dvd dvdVar = (dvd) obj3;
                if (yud.$EnumSwitchMapping$1[((j8c) obj).ordinal()] != 1) {
                    yab.i0((wmi) dvdVar.A.getValue(), ((n0c) dvdVar.F()).b(), 0, new avd(dvdVar, this.b, null, 1), 2);
                }
                return sbiVar;
            case 7:
                tpg tpgVar = (tpg) obj3;
                ((Long) obj).getClass();
                int i11 = 0;
                for (Object obj6 : ((jpg) tpgVar.k.getValue()).b) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    k79 k79Var = (k79) obj6;
                    boolean z = k79Var instanceof omg;
                    long j7 = this.b;
                    if ((z && ((omg) k79Var).a == j7) || ((k79Var instanceof co2) && ((co2) k79Var).b.a == j7)) {
                        mjg mjgVar = tpgVar.n;
                        ipg ipgVar = new ipg(j7, i11, 0, 4);
                        mjgVar.getClass();
                        mjgVar.j(null, ipgVar);
                    }
                    i11 = i12;
                }
                return sbiVar;
            case 8:
                qwg qwgVar = (qwg) obj3;
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO2 = qxeVar.O0("SELECT * FROM story_drafts WHERE draft_id = ?");
                try {
                    vxeVarO2.c(1, j);
                    int iE20 = qyj.E(vxeVarO2, "draft_id");
                    int iE21 = qyj.E(vxeVarO2, "media_path");
                    int iE22 = qyj.E(vxeVarO2, "preview_path");
                    int iE23 = qyj.E(vxeVarO2, "type");
                    int iE24 = qyj.E(vxeVarO2, "expiration_ms");
                    int iE25 = qyj.E(vxeVarO2, "settings");
                    int iE26 = qyj.E(vxeVarO2, "canvas_width");
                    int iE27 = qyj.E(vxeVarO2, "canvas_height");
                    int iE28 = qyj.E(vxeVarO2, "created_at");
                    vi9 vi9Var = new vi9((Object) null);
                    vi9 vi9Var2 = new vi9((Object) null);
                    vi9 vi9Var3 = new vi9((Object) null);
                    vi9 vi9Var4 = new vi9((Object) null);
                    vi9 vi9Var5 = new vi9((Object) null);
                    while (vxeVarO2.M0()) {
                        int i13 = iE25;
                        int i14 = iE26;
                        vi9Var.f(vxeVarO2.getLong(iE20), obj2);
                        vi9Var2.f(vxeVarO2.getLong(iE20), obj2);
                        long j8 = vxeVarO2.getLong(iE20);
                        if (!(vi9Var3.c(j8) >= 0)) {
                            vi9Var3.f(j8, new ArrayList());
                        }
                        long j9 = vxeVarO2.getLong(iE20);
                        if (!(vi9Var4.c(j9) >= 0)) {
                            vi9Var4.f(j9, new ArrayList());
                        }
                        vi9Var5.f(vxeVarO2.getLong(iE20), null);
                        iE25 = i13;
                        iE26 = i14;
                        obj2 = null;
                    }
                    int i15 = iE25;
                    int i16 = iE26;
                    vxeVarO2.reset();
                    qwgVar.e(qxeVar, vi9Var);
                    qwgVar.c(qxeVar, vi9Var2);
                    qwgVar.d(qxeVar, vi9Var3);
                    qwgVar.a(qxeVar, vi9Var4);
                    qwgVar.b(qxeVar, vi9Var5);
                    if (vxeVarO2.M0()) {
                        swg swgVar = new swg(vxeVarO2.getLong(iE20), vxeVarO2.B0(iE21), vxeVarO2.isNull(iE22) ? null : vxeVarO2.B0(iE22), ghb.t((int) vxeVarO2.getLong(iE23)), vxeVarO2.getLong(iE24), (int) vxeVarO2.getLong(i15), (int) vxeVarO2.getLong(i16), (int) vxeVarO2.getLong(iE27), vxeVarO2.getLong(iE28));
                        lxg lxgVar = (lxg) vi9Var.b(vxeVarO2.getLong(iE20));
                        ixg ixgVar = (ixg) vi9Var2.b(vxeVarO2.getLong(iE20));
                        Object objB = vi9Var3.b(vxeVarO2.getLong(iE20));
                        if (objB == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        List list4 = (List) objB;
                        Object objB2 = vi9Var4.b(vxeVarO2.getLong(iE20));
                        if (objB2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        mxgVar = new mxg(swgVar, lxgVar, ixgVar, list4, (List) objB2, (xwg) vi9Var5.b(vxeVarO2.getLong(iE20)));
                    } else {
                        mxgVar = null;
                    }
                    vxeVarO2.close();
                    return mxgVar;
                } catch (Throwable th2) {
                    vxeVarO2.close();
                    throw th2;
                }
            default:
                w0h w0hVar = (w0h) obj3;
                vxe vxeVarO3 = ((qxe) obj).O0("UPDATE story_publish SET status = ? WHERE publish_id = ?");
                try {
                    vxeVarO3.c(1, w0hVar.a);
                    vxeVarO3.c(2, j);
                    vxeVarO3.M0();
                    return sbiVar;
                } finally {
                    vxeVarO3.close();
                }
        }
    }

    public /* synthetic */ en3(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public /* synthetic */ en3(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
