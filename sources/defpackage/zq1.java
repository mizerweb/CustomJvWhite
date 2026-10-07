package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class zq1 {
    public final ru1 a;
    public final CidLogger b;
    public qf7 c;
    public final jc1 d;
    public final lb9 e;
    public final xt1 f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public n8b i;

    public zq1(ru1 ru1Var, CidLogger cidLogger, wf0 wf0Var, iw8 iw8Var, jc1 jc1Var, lb9 lb9Var, xt1 xt1Var) {
        xt1Var.getClass();
        this.a = ru1Var;
        this.b = cidLogger;
        this.c = wf0Var;
        this.d = jc1Var;
        this.e = lb9Var;
        this.f = xt1Var;
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new n8b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        if (r6 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.o0a a(defpackage.n0a r2, defpackage.o0a r3, java.util.List r4, java.util.ArrayList r5, boolean r6) {
        /*
            if (r3 != 0) goto L3
            goto L14
        L3:
            int[] r0 = defpackage.yq1.$EnumSwitchMapping$0
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L17
            r2 = 2
            if (r0 == r2) goto L12
            goto L31
        L12:
            if (r6 == 0) goto L31
        L14:
            o0a r2 = defpackage.o0a.a
            return r2
        L17:
            bu1 r6 = defpackage.bu1.a
            boolean r6 = r4.contains(r6)
            if (r6 != 0) goto L32
            bu1 r6 = defpackage.bu1.b
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L28
            goto L32
        L28:
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L31
            o0a r2 = defpackage.o0a.d
            return r2
        L31:
            return r3
        L32:
            o0a r2 = defpackage.o0a.b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq1.a(n0a, o0a, java.util.List, java.util.ArrayList, boolean):o0a");
    }

    public static boolean d(y8b y8bVar) {
        Object obj = y8bVar.get();
        o0a o0aVar = o0a.c;
        if (obj == o0aVar) {
            return false;
        }
        if (y8bVar.get() == o0a.b) {
            y8bVar.k(o0a.a);
        }
        if (y8bVar.get() != o0a.d) {
            return true;
        }
        y8bVar.k(o0aVar);
        return true;
    }

    public static void e(y8b y8bVar) {
        o0a o0aVar = (o0a) y8bVar.get();
        if (o0aVar == o0a.c) {
            y8bVar.k(o0a.b);
        } else if (o0aVar == o0a.d) {
            y8bVar.k(o0a.a);
        }
    }

    public final void b(JSONObject jSONObject) {
        yt1 yt1VarA;
        yt1 yt1VarA2;
        yt1 yt1Var;
        dnf dnfVarK = iw8.k(jSONObject);
        ru1 ru1Var = this.a;
        yt1 yt1Var2 = ru1Var.a.a;
        String strD = f6m.d(jSONObject, "adminId");
        if (strD != null) {
            try {
                yt1VarA = yt1.a(strD);
            } catch (Exception unused) {
                yt1VarA = null;
            }
        } else {
            yt1VarA = null;
        }
        String strD2 = f6m.d(jSONObject, "participantId");
        if (strD2 != null) {
            try {
                yt1VarA2 = yt1.a(strD2);
            } catch (Exception unused2) {
                yt1VarA2 = null;
            }
            yt1Var = yt1VarA2;
        } else {
            yt1Var = null;
        }
        boolean zOptBoolean = jSONObject.optBoolean("muteAll", false);
        Map mapL = s66.a;
        if (yt1Var != null && !yt1Var.equals(yt1Var2)) {
            if (jSONObject.has("muteStates")) {
                mapL = kql.l(jSONObject);
            }
            ru1Var.g(new smc(yt1Var, new xr8(), new due(f(jSONObject, yt1Var, "handleMuteParticipant", mapL, false)), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8()), null);
            return;
        }
        if (yt1VarA != null && yt1VarA.equals(yt1Var2)) {
            n(jSONObject, "handleMuteParticipant", 3, dnfVarK, false);
            ArrayList arrayList = new ArrayList(ru1Var.u());
            for (yt1 yt1Var3 : ru1Var.d(dnfVarK).keySet()) {
                n8b n8bVarF = f(jSONObject, yt1Var3, "handleMuteParticipant", mapL, false);
                yt1Var3.getClass();
                arrayList.add(new smc(yt1Var3, new xr8(), new due(n8bVarF), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8()));
            }
            ru1Var.h(dnfVarK, arrayList);
            return;
        }
        if (!zOptBoolean) {
            c(jSONObject, dnfVarK, false);
            return;
        }
        c(jSONObject, dnfVarK, true);
        n(jSONObject, "handleMuteParticipant", 3, dnfVarK, false);
        ArrayList arrayList2 = new ArrayList(ru1Var.u());
        for (yt1 yt1Var4 : ru1Var.d(dnfVarK).keySet()) {
            n8b n8bVarF2 = f(jSONObject, yt1Var4, "handleMuteParticipant", mapL, false);
            yt1Var4.getClass();
            arrayList2.add(new smc(yt1Var4, new xr8(), new due(n8bVarF2), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8()));
        }
        ru1Var.h(dnfVarK, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:101:0x016f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0172  */
    /* JADX WARN: Code duplicated, block: B:103:0x0175  */
    /* JADX WARN: Code duplicated, block: B:105:0x0178 A[Catch: JSONException -> 0x017e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x017e, blocks: (B:73:0x011f, B:74:0x012c, B:76:0x0132, B:105:0x0178), top: B:153:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0196  */
    /* JADX WARN: Code duplicated, block: B:118:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:157:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0132 A[Catch: JSONException -> 0x017e, TRY_LEAVE, TryCatch #1 {JSONException -> 0x017e, blocks: (B:73:0x011f, B:74:0x012c, B:76:0x0132, B:105:0x0178), top: B:153:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x013b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x014e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155  */
    /* JADX WARN: Code duplicated, block: B:90:0x0157  */
    /* JADX WARN: Code duplicated, block: B:93:0x015e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0160  */
    /* JADX WARN: Code duplicated, block: B:97:0x0167  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [zq1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashSet] */
    public final void c(JSONObject jSONObject, dnf dnfVar, boolean z) {
        List<n0a> list;
        List list2;
        int i;
        n0a n0aVar;
        o0a o0aVar;
        o0a o0aVar2;
        o0a o0aVar3;
        o0a o0aVar4;
        ?? hashSet;
        boolean zIsEmpty;
        HashMap map;
        Iterator it;
        o0a o0aVar5;
        int iOrdinal;
        JSONArray jSONArray;
        int i2;
        String string;
        int i3;
        n0a n0aVar2;
        Map map2;
        n0a n0aVar3;
        n0a n0aVar4 = n0a.a;
        n0a n0aVar5 = n0a.b;
        n0a n0aVar6 = n0a.c;
        n0a n0aVar7 = n0a.d;
        if (dnfVar.equals(this.d.get())) {
            try {
                if (jSONObject.has("mediaOptions")) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray2 = jSONObject.getJSONArray("mediaOptions");
                    for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                        String string2 = jSONArray2.getString(i4);
                        if (string2 != null) {
                            switch (string2) {
                                case "MOVIE_SHARING":
                                    n0aVar3 = n0aVar7;
                                    break;
                                case "AUDIO":
                                    n0aVar3 = n0aVar4;
                                    break;
                                case "VIDEO":
                                    n0aVar3 = n0aVar5;
                                    break;
                                case "SCREEN_SHARING":
                                    n0aVar3 = n0aVar6;
                                    break;
                                default:
                                    n0aVar3 = null;
                                    break;
                            }
                        } else {
                            n0aVar3 = null;
                        }
                        if (n0aVar3 != null) {
                            arrayList.add(n0aVar3);
                        }
                    }
                    list = arrayList;
                } else {
                    list = Collections.EMPTY_LIST;
                }
                list.getClass();
            } catch (JSONException e) {
                this.b.logException("CallMediaOptionsDelegate", "media options parsing error", e);
                list = r66.a;
            }
            try {
                if (!list.isEmpty()) {
                    if (list.isEmpty()) {
                        map2 = s66.a;
                    } else {
                        HashMap mapL = kql.l(jSONObject);
                        HashMap map3 = new HashMap();
                        for (n0a n0aVar8 : list) {
                            List list3 = list;
                            o0a o0aVar6 = (o0a) mapL.get(n0aVar8);
                            if (o0aVar6 != null) {
                                map3.put(n0aVar8, o0aVar6);
                            }
                            list = list3;
                        }
                        map2 = map3;
                    }
                    list2 = list;
                    if (!list2.isEmpty() || jSONObject.has("unmuteOptions") || jSONObject.has("unmute")) {
                        i = 1;
                        n0aVar = n0aVar7;
                        o(jSONObject, "handleMuteParticipant", map2, false, z, dnfVar, null);
                    }
                    n8b n8bVar = this.i;
                    o0aVar = n8bVar.a;
                    o0aVar2 = n8bVar.b;
                    o0aVar3 = n8bVar.c;
                    o0aVar4 = n8bVar.d;
                    hashSet = new HashSet();
                    jSONArray = jSONObject.getJSONArray("requestedMedia");
                    for (i2 = 0; i2 < jSONArray.length(); i2++) {
                        string = jSONArray.getString(i2);
                        if (string == null) {
                            switch (string.hashCode()) {
                                case -214017395:
                                    if (string.equals("MOVIE_SHARING")) {
                                        i3 = 0;
                                    } else {
                                        i3 = -1;
                                    }
                                    break;
                                case 62628790:
                                    if (string.equals("AUDIO")) {
                                        i3 = i;
                                    } else {
                                        i3 = -1;
                                    }
                                    break;
                                case 81665115:
                                    if (string.equals("VIDEO")) {
                                        i3 = 2;
                                    } else {
                                        i3 = -1;
                                    }
                                    break;
                                case 1982835689:
                                    if (string.equals("SCREEN_SHARING")) {
                                        i3 = 3;
                                    } else {
                                        i3 = -1;
                                    }
                                    break;
                                default:
                                    i3 = -1;
                                    break;
                            }
                            switch (i3) {
                                case 0:
                                    n0aVar2 = n0aVar;
                                    break;
                                case 1:
                                    n0aVar2 = n0aVar4;
                                    break;
                                case 2:
                                    n0aVar2 = n0aVar5;
                                    break;
                                case 3:
                                    n0aVar2 = n0aVar6;
                                    break;
                                default:
                                    n0aVar2 = null;
                                    break;
                            }
                        } else {
                            n0aVar2 = null;
                        }
                        if (n0aVar2 != null) {
                            hashSet.add(n0aVar2);
                        }
                    }
                    hashSet.getClass();
                    zIsEmpty = hashSet.isEmpty();
                    map = new HashMap();
                    it = list2.iterator();
                    while (it.hasNext()) {
                        iOrdinal = ((n0a) it.next()).ordinal();
                        if (iOrdinal != 0) {
                            map.put(n0aVar4, o0aVar);
                        } else if (iOrdinal != i) {
                            map.put(n0aVar5, o0aVar2);
                        } else if (iOrdinal != 2) {
                            map.put(n0aVar6, o0aVar3);
                        } else {
                            if (iOrdinal == 3) {
                                ore.o();
                                return;
                            }
                            map.put(n0aVar, o0aVar4);
                        }
                    }
                    o0aVar5 = o0a.c;
                    if (o0aVar == o0aVar5 && hashSet.contains(n0aVar4)) {
                        hashSet.remove(n0aVar4);
                        map.remove(n0aVar4);
                    }
                    if (o0aVar2 == o0aVar5 && hashSet.contains(n0aVar5)) {
                        hashSet.remove(n0aVar5);
                        map.remove(n0aVar5);
                    }
                    if (o0aVar3 == o0aVar5 && hashSet.contains(n0aVar6)) {
                        hashSet.remove(n0aVar6);
                        map.remove(n0aVar6);
                    }
                    if (o0aVar4 == o0aVar5 && hashSet.contains(n0aVar)) {
                        hashSet.remove(n0aVar);
                        map.remove(n0aVar);
                    }
                    if (zIsEmpty && hashSet.isEmpty()) {
                        return;
                    }
                    if (map.isEmpty() || !hashSet.isEmpty()) {
                        this.c.invoke(oh1.A, new i9b(new h9b(map, hashSet), z));
                    }
                    return;
                }
                list2 = list;
                hashSet = new HashSet();
                jSONArray = jSONObject.getJSONArray("requestedMedia");
                while (i2 < jSONArray.length()) {
                    string = jSONArray.getString(i2);
                    if (string == null) {
                        switch (string.hashCode()) {
                            case -214017395:
                                if (string.equals("MOVIE_SHARING")) {
                                    i3 = -1;
                                } else {
                                    i3 = 0;
                                }
                                break;
                            case 62628790:
                                if (string.equals("AUDIO")) {
                                    i3 = -1;
                                } else {
                                    i3 = i;
                                }
                                break;
                            case 81665115:
                                if (string.equals("VIDEO")) {
                                    i3 = -1;
                                } else {
                                    i3 = 2;
                                }
                                break;
                            case 1982835689:
                                if (string.equals("SCREEN_SHARING")) {
                                    i3 = -1;
                                } else {
                                    i3 = 3;
                                }
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                        switch (i3) {
                            case 0:
                                n0aVar2 = n0aVar;
                                break;
                            case 1:
                                n0aVar2 = n0aVar4;
                                break;
                            case 2:
                                n0aVar2 = n0aVar5;
                                break;
                            case 3:
                                n0aVar2 = n0aVar6;
                                break;
                            default:
                                n0aVar2 = null;
                                break;
                        }
                    } else {
                        n0aVar2 = null;
                    }
                    if (n0aVar2 != null) {
                        hashSet.add(n0aVar2);
                    }
                }
            } catch (JSONException unused) {
                hashSet = Collections.EMPTY_SET;
            }
            i = 1;
            n0aVar = n0aVar7;
            n8b n8bVar2 = this.i;
            o0aVar = n8bVar2.a;
            o0aVar2 = n8bVar2.b;
            o0aVar3 = n8bVar2.c;
            o0aVar4 = n8bVar2.d;
            hashSet.getClass();
            zIsEmpty = hashSet.isEmpty();
            map = new HashMap();
            it = list2.iterator();
            while (it.hasNext()) {
                iOrdinal = ((n0a) it.next()).ordinal();
                if (iOrdinal != 0) {
                    map.put(n0aVar4, o0aVar);
                } else if (iOrdinal != i) {
                    map.put(n0aVar5, o0aVar2);
                } else if (iOrdinal != 2) {
                    map.put(n0aVar6, o0aVar3);
                } else {
                    if (iOrdinal == 3) {
                        ore.o();
                        return;
                    }
                    map.put(n0aVar, o0aVar4);
                }
            }
            o0aVar5 = o0a.c;
            if (o0aVar == o0aVar5) {
                hashSet.remove(n0aVar4);
                map.remove(n0aVar4);
            }
            if (o0aVar2 == o0aVar5) {
                hashSet.remove(n0aVar5);
                map.remove(n0aVar5);
            }
            if (o0aVar3 == o0aVar5) {
                hashSet.remove(n0aVar6);
                map.remove(n0aVar6);
            }
            if (o0aVar4 == o0aVar5) {
                hashSet.remove(n0aVar);
                map.remove(n0aVar);
            }
            if (zIsEmpty) {
            }
            if (map.isEmpty()) {
            }
            this.c.invoke(oh1.A, new i9b(new h9b(map, hashSet), z));
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x016c A[PHI: r1
  0x016c: PHI (r1v3 java.util.List) = (r1v1 java.util.List), (r1v4 java.util.List) binds: [B:59:0x0169, B:64:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    public final n8b f(JSONObject jSONObject, yt1 yt1Var, String str, Map map, boolean z) {
        HashMap linkedHashMap;
        List list;
        jSONObject.getClass();
        ru1 ru1Var = this.a;
        du1 du1VarL = yt1Var != null ? ru1Var.l(yt1Var) : null;
        boolean zIsEmpty = map.isEmpty();
        CidLogger cidLogger = this.b;
        n0a n0aVar = n0a.d;
        n0a n0aVar2 = n0a.c;
        n0a n0aVar3 = n0a.b;
        n0a n0aVar4 = n0a.a;
        if (!zIsEmpty) {
            linkedHashMap = new HashMap(n0a.values().length);
            o0a o0aVar = this.i.a;
            o0a o0aVar2 = (o0a) map.get(n0aVar4);
            if (o0aVar2 != null) {
                o0aVar = o0aVar2;
            }
            linkedHashMap.put(n0aVar4, o0aVar);
            o0a o0aVar3 = this.i.b;
            o0a o0aVar4 = (o0a) map.get(n0aVar3);
            if (o0aVar4 != null) {
                o0aVar3 = o0aVar4;
            }
            linkedHashMap.put(n0aVar3, o0aVar3);
            o0a o0aVar5 = this.i.c;
            o0a o0aVar6 = (o0a) map.get(n0aVar2);
            if (o0aVar6 != null) {
                o0aVar5 = o0aVar6;
            }
            linkedHashMap.put(n0aVar2, o0aVar5);
            o0a o0aVar7 = this.i.d;
            o0a o0aVar8 = (o0a) map.get(n0aVar);
            if (o0aVar8 != null) {
                o0aVar7 = o0aVar8;
            }
            linkedHashMap.put(n0aVar, o0aVar7);
        } else if (cqk.d(yt1Var, ru1Var.a.a)) {
            linkedHashMap = new HashMap(n0a.values().length);
            linkedHashMap.put(n0aVar4, this.i.a);
            linkedHashMap.put(n0aVar3, this.i.b);
            linkedHashMap.put(n0aVar2, this.i.c);
            linkedHashMap.put(n0aVar, this.i.d);
        } else if ((du1VarL != null ? du1VarL.b : null) != null) {
            linkedHashMap = new HashMap(n0a.values().length);
            n8b n8bVar = du1VarL.b;
            linkedHashMap.put(n0aVar4, n8bVar.a);
            linkedHashMap.put(n0aVar3, n8bVar.b);
            linkedHashMap.put(n0aVar2, n8bVar.c);
            linkedHashMap.put(n0aVar, n8bVar.d);
        } else {
            linkedHashMap = new LinkedHashMap();
            cidLogger.log("CallMediaOptionsDelegate", "createParticipantMediaOptions null participant or null media options");
        }
        if (z) {
            for (Map.Entry entry : kql.l(jSONObject).entrySet()) {
                n0a n0aVar5 = (n0a) entry.getKey();
                o0a o0aVar9 = (o0a) entry.getValue();
                if (o0aVar9 != null) {
                    linkedHashMap.put(n0aVar5, o0aVar9);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unmuteOptions");
        if (jSONArrayOptJSONArray != null) {
            try {
                int length = jSONArrayOptJSONArray.length();
                int i = 0;
                while (i < length) {
                    Object obj = jSONArrayOptJSONArray.get(i);
                    obj.getClass();
                    try {
                        arrayList.add(n0a.valueOf((String) obj));
                    } catch (IllegalArgumentException e) {
                        cidLogger.logException("CallMediaOptionsDelegate", "invalid MediaOption in " + str, e);
                    }
                    i++;
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                }
            } catch (JSONException e2) {
                cidLogger.logException("CallMediaOptionsDelegate", str, e2);
            }
        }
        boolean zOptBoolean = jSONObject.optBoolean("unmute", false);
        boolean zHas = jSONObject.has("roles");
        List listU = r66.a;
        if (zHas) {
            try {
                listU = kql.u(jSONObject);
            } catch (Exception unused) {
                if (du1VarL != null && (list = du1VarL.e) != null) {
                    listU = list;
                }
            }
        } else if (du1VarL != null && (list = du1VarL.e) != null) {
            listU = list;
        }
        n8b n8bVar2 = new n8b();
        n8bVar2.a = a(n0aVar4, (o0a) linkedHashMap.get(n0aVar4), listU, arrayList, zOptBoolean);
        n8bVar2.b = a(n0aVar3, (o0a) linkedHashMap.get(n0aVar3), listU, arrayList, zOptBoolean);
        n8bVar2.c = a(n0aVar2, (o0a) linkedHashMap.get(n0aVar2), listU, arrayList, zOptBoolean);
        n8bVar2.d = a(n0aVar, (o0a) linkedHashMap.get(n0aVar), listU, arrayList, zOptBoolean);
        return n8bVar2;
    }

    public final Map g(dnf dnfVar, int i) {
        Map map;
        if (i == 0) {
            throw null;
        }
        int i2 = yq1.$EnumSwitchMapping$1[qt4.D(i)];
        if (i2 != 1) {
            return (i2 == 2 && (map = (Map) this.g.get(dnfVar)) != null) ? map : s66.a;
        }
        return h(dnfVar).a();
    }

    public final n8b h(dnf dnfVar) {
        dnfVar.getClass();
        LinkedHashMap linkedHashMap = this.h;
        Object n8bVar = linkedHashMap.get(dnfVar);
        if (n8bVar == null) {
            n8bVar = new n8b();
            linkedHashMap.put(dnfVar, n8bVar);
        }
        return (n8b) n8bVar;
    }

    public final void i(JSONObject jSONObject) {
        try {
            b(jSONObject);
        } catch (JSONException e) {
            this.b.logException("CallMediaOptionsDelegate", "can't handle mute participant", e);
        }
    }

    public final void j(yt1 yt1Var, boolean z) {
        if (z || !cqk.d(this.a.a.a, yt1Var)) {
            return;
        }
        jc1 jc1Var = new jc1(0, 14, n8b.class, this.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        Object obj = jc1Var.get();
        o0a o0aVar = o0a.d;
        o0a o0aVar2 = o0a.c;
        if (obj == o0aVar2) {
            jc1Var.k(o0aVar);
        }
        jc1 jc1Var2 = new jc1(0, 15, n8b.class, this.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        if (jc1Var2.get() == o0aVar2) {
            jc1Var2.k(o0aVar);
        }
        jc1 jc1Var3 = new jc1(0, 16, n8b.class, this.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        if (jc1Var3.get() == o0aVar2) {
            jc1Var3.k(o0aVar);
        }
        jc1 jc1Var4 = new jc1(0, 17, n8b.class, this.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
        if (jc1Var4.get() == o0aVar2) {
            jc1Var4.k(o0aVar);
        }
    }

    public final void k(ArrayList arrayList, yt1 yt1Var) {
        du1 du1Var = this.a.a;
        if (yt1Var.equals(du1Var.a)) {
            ArrayList arrayList2 = du1Var.d;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            if (arrayList.contains(bu1.b)) {
                e(new jc1(0, 18, n8b.class, this.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new jc1(0, 19, n8b.class, this.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new jc1(0, 20, n8b.class, this.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new jc1(0, 21, n8b.class, this.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
            }
        }
    }

    public final void l(boolean z) {
        EnumMap enumMapA = this.i.a();
        this.c.invoke(oh1.B, new i9b(new h9b(enumMapA, c76.a), z && this.f.r.h));
    }

    public final void m(Map map, JSONObject jSONObject, String str, int i, dnf dnfVar, boolean z) {
        if (i == 0) {
            throw null;
        }
        n8b n8bVar = new n8b();
        n0a n0aVar = n0a.a;
        o0a o0aVar = (o0a) map.get(n0aVar);
        if (o0aVar != null) {
            n8bVar.a = o0aVar;
        }
        n0a n0aVar2 = n0a.b;
        o0a o0aVar2 = (o0a) map.get(n0aVar2);
        if (o0aVar2 != null) {
            n8bVar.b = o0aVar2;
        }
        n0a n0aVar3 = n0a.c;
        o0a o0aVar3 = (o0a) map.get(n0aVar3);
        if (o0aVar3 != null) {
            n8bVar.c = o0aVar3;
        }
        n0a n0aVar4 = n0a.d;
        o0a o0aVar4 = (o0a) map.get(n0aVar4);
        if (o0aVar4 != null) {
            n8bVar.d = o0aVar4;
        }
        n8b n8bVarH = h(dnfVar);
        EnumMap enumMap = new EnumMap(n0a.class);
        o0a o0aVar5 = n8bVar.a;
        if (o0aVar5 != n8bVarH.a) {
            enumMap.put(n0aVar, o0aVar5);
        }
        o0a o0aVar6 = n8bVar.b;
        if (o0aVar6 != n8bVarH.b) {
            enumMap.put(n0aVar2, o0aVar6);
        }
        o0a o0aVar7 = n8bVar.c;
        if (o0aVar7 != n8bVarH.c) {
            enumMap.put(n0aVar3, o0aVar7);
        }
        o0a o0aVar8 = n8bVar.d;
        if (o0aVar8 != n8bVarH.d) {
            enumMap.put(n0aVar4, o0aVar8);
        }
        if (enumMap.isEmpty()) {
            return;
        }
        this.g.put(dnfVar, enumMap);
        this.h.put(dnfVar, n8bVar);
        if (z) {
            o(jSONObject, str, g(dnfVar, i), false, true, dnfVar, null);
        }
    }

    public final void n(JSONObject jSONObject, String str, int i, dnf dnfVar, boolean z) {
        Map mapL;
        if (i == 0) {
            throw null;
        }
        if (jSONObject.has("muteStates")) {
            mapL = kql.l(jSONObject);
        } else if (jSONObject.has("requestedMedia")) {
            return;
        } else {
            mapL = s66.a;
        }
        m(mapL, jSONObject, str, i, dnfVar, z);
    }

    public final void o(JSONObject jSONObject, String str, Map map, boolean z, boolean z2, dnf dnfVar, dnf dnfVar2) {
        JSONArray jSONArrayOptJSONArray;
        if (dnfVar2 == null) {
            dnfVar2 = (dnf) this.d.get();
        }
        if (dnfVar.equals(dnfVar2)) {
            n8b n8bVarF = f(jSONObject, this.a.a.a, str, map, z);
            if (!n8bVarF.equals(this.i)) {
                this.i = n8bVarF;
                if (!this.f.r.h) {
                    l(false);
                } else if (!z2) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("muteStates");
                    if (((jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) && ((jSONArrayOptJSONArray = jSONObject.optJSONArray("unmuteOptions")) == null || jSONArrayOptJSONArray.length() <= 0)) ? jSONObject.has("unmute") : true) {
                        l(false);
                    }
                }
            }
            this.g.put(dnfVar, s66.a);
        }
    }
}
