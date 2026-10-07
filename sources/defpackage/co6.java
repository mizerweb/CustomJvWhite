package defpackage;

import java.nio.charset.Charset;
import java.util.Map;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class co6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final cf7 p;

    public co6() {
        us5 us5Var = new us5(25);
        this.a = "mc";
        this.b = "msgid";
        this.c = "pid";
        this.d = "type";
        this.e = "ConversationReadOnOtherDevice";
        this.f = "trid";
        this.g = "ctime";
        this.h = "ttime";
        this.i = "eKey";
        this.j = "suid";
        this.k = "largeImageUrl";
        this.l = "fireM";
        this.m = "err";
        this.n = MLFeatureConfigProviderBase.URL_KEY;
        this.o = "bmd";
        this.p = us5Var;
    }

    public static Long a(Map map, String str, Long l, long j) {
        if (!map.containsKey(str)) {
            if (l != null) {
                return Long.valueOf(l.longValue() ^ j);
            }
            return null;
        }
        String str2 = (String) wm9.N0(map, str);
        if (str2 != null) {
            return y5h.C0(str2);
        }
        return null;
    }

    public static long b(String str, Map map) {
        Long lC0;
        String str2 = (String) map.get(str);
        if (str2 == null || (lC0 = y5h.C0(str2)) == null) {
            return 0L;
        }
        return lC0.longValue();
    }

    public final hn6 c(Map map, long j, long j2, long j3) {
        Long lG = g(map);
        Long lA = a(map, this.a, lG, j);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        long jB = b(this.c, map);
        String str = (String) map.get(this.f);
        long j4 = str != null ? Long.parseLong(str) : 0L;
        Long l = null;
        ilb ilbVar = new ilb(jLongValue, jB);
        long j5 = Long.parseLong((String) wm9.N0(map, this.b));
        long length = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Long l2 = l;
            Charset charset = pt2.a;
            length += ((long) str2.getBytes(charset).length) + ((long) ((String) entry.getValue()).getBytes(charset).length);
            l = l2;
        }
        Long l3 = l;
        String str3 = (String) map.get(this.h);
        Long lValueOf = str3 != null ? Long.valueOf(Long.parseLong(str3)) : l3;
        String str4 = (String) map.get(this.i);
        String str5 = (String) map.get(this.d);
        if (str5 == null) {
            str5 = "";
        }
        long jF = f(map, BuildConfig.MAX_TIME_TO_UPLOAD);
        String str6 = (String) map.get(this.g);
        return new hn6(j4, ilbVar, j5, 2, lG, length, lValueOf, str4, j2, j3, str5, jF, str6 != null ? Long.parseLong(str6) : 0L);
    }

    public final xn6 d(Map map, long j, syd sydVar) {
        bo6 bo6Var;
        bo6 bo6Var2;
        String string;
        Boolean boolX1;
        Boolean boolX2;
        String string2;
        String str;
        boolean zBooleanValue = false;
        String string3 = null;
        if (map.containsKey("gc")) {
            bo6Var2 = bo6.GROUP_CHAT;
        } else {
            bo6[] bo6VarArr = bo6.b;
            String str2 = (String) map.get(this.d);
            String string4 = str2 != null ? r5h.y1(str2).toString() : null;
            bo6[] bo6VarArr2 = bo6.b;
            int length = bo6VarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bo6Var = null;
                    break;
                }
                bo6Var = bo6VarArr2[i];
                if (bo6Var.a.equals(string4)) {
                    break;
                }
                i++;
            }
            bo6Var2 = bo6Var == null ? bo6.UNKNOWN : bo6Var;
        }
        bo6 bo6Var3 = bo6Var2;
        boolean z = bo6Var3 == bo6.GROUP_CHAT;
        Long lG = g(map);
        Long lA = a(map, this.a, lG, j);
        if (lA == null) {
            return null;
        }
        ilb ilbVar = new ilb(lA.longValue(), b(this.c, map));
        long j2 = Long.parseLong((String) wm9.N0(map, this.b));
        String str3 = (String) map.get("title");
        String str4 = "";
        if (str3 == null || (string = r5h.y1(str3).toString()) == null) {
            string = "";
        }
        if (!z && ((str = (String) map.get("userName")) == null || (string3 = r5h.y1(str).toString()) == null)) {
            string3 = "";
        }
        long jLongValue = (z || lG == null) ? 0L : lG.longValue();
        long jF = f(map, 0L);
        String str5 = (String) map.get("msg");
        if (str5 != null && (string2 = r5h.y1(str5).toString()) != null) {
            str4 = string2;
        }
        String str6 = (String) map.get(this.f);
        long j3 = str6 != null ? Long.parseLong(str6) : 0L;
        String str7 = (String) map.get(this.i);
        String str8 = (String) map.get(this.k);
        String str9 = (String) map.get(this.l);
        boolean zBooleanValue2 = (str9 == null || (boolX2 = r5h.x1(str9)) == null) ? false : boolX2.booleanValue();
        String str10 = (String) map.get(this.m);
        if (str10 != null && (boolX1 = r5h.x1(str10)) != null) {
            zBooleanValue = boolX1.booleanValue();
        }
        return new xn6(ilbVar, j2, bo6Var3, string, string3, jLongValue, jF, str4, j3, str7, str8, zBooleanValue2, zBooleanValue, (String) map.get(this.n), (String) map.get(this.o), sydVar);
    }

    public final wn6 e(Map map, long j) {
        Long lA = a(map, this.a, g(map), j);
        if (lA != null) {
            long jLongValue = lA.longValue();
            Object obj = map.get(this.b);
            if (obj != null) {
                return new wn6(new ilb(jLongValue, b(this.c, map)), Long.parseLong((String) obj));
            }
            ore.p("Required value was null.");
        }
        return null;
    }

    public final long f(Map map, long j) {
        if (map.containsKey("ectime")) {
            String str = (String) map.get("ectime");
            if (str != null) {
                return Long.parseLong(str);
            }
            return 0L;
        }
        String str2 = this.g;
        if (!map.containsKey(str2)) {
            return j;
        }
        String str3 = (String) map.get(str2);
        return (str3 != null ? Long.parseLong(str3) : 500L) - 500;
    }

    public final Long g(Map map) {
        String str = (String) map.get(this.j);
        if (str == null) {
            return null;
        }
        return (Long) this.p.invoke(Long.valueOf(Long.parseLong(str)));
    }
}
