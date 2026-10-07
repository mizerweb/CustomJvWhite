package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class vs0 {
    public static final ts0 a;
    public static final ts0 b;
    public static final ts0 c;
    public static final ts0 d;
    public static final ts0 e;
    public static final ts0 f;
    public static final ts0 g;
    public static final ts0 h;
    public static final ts0 i;
    public static final ts0 j;
    public static final ts0 k;
    public static final ts0 l;
    public static final ts0 m;
    public static final List n;
    public static final List o;

    static {
        ts0 ts0VarE = e(32);
        a = ts0VarE;
        ts0 ts0VarE2 = e(48);
        ts0 ts0VarE3 = e(50);
        b = ts0VarE3;
        ts0 ts0VarE4 = e(56);
        ts0 ts0VarE5 = e(64);
        c = ts0VarE5;
        ts0 ts0VarE6 = e(72);
        ts0 ts0VarE7 = e(80);
        ts0 ts0VarE8 = e(96);
        d = ts0VarE8;
        ts0 ts0VarE9 = e(np0.m);
        ts0 ts0VarE10 = e(160);
        ts0 ts0VarE11 = e(176);
        ts0 ts0VarE12 = e(192);
        e = ts0VarE12;
        ts0 ts0VarE13 = e(223);
        ts0 ts0VarE14 = e(224);
        int i2 = ts0VarE9.b;
        rs0 rs0Var = rs0.a;
        ts0 ts0Var = new ts0(rs0Var, i2, 2);
        ts0 ts0VarE15 = e(288);
        ts0 ts0VarE16 = e(320);
        ts0 ts0Var2 = new ts0(rs0Var, ts0VarE11.b, 2);
        f = ts0Var2;
        ts0 ts0Var3 = new ts0(rs0Var, ts0VarE14.b, 2);
        ts0 ts0VarE17 = e(480);
        g = ts0VarE17;
        ts0 ts0VarE18 = e(492);
        ts0 ts0Var4 = new ts0(rs0Var, ts0VarE15.b, 2);
        ts0 ts0VarE19 = e(600);
        ts0 ts0VarE20 = e(720);
        h = ts0VarE20;
        rs0 rs0Var2 = rs0.b;
        ts0 ts0Var5 = new ts0(rs0Var2, 180, 1);
        i = ts0Var5;
        ts0 ts0Var6 = new ts0(rs0Var2, 240, 1);
        j = ts0Var6;
        ts0 ts0Var7 = new ts0(rs0Var2, 320, 1);
        ts0 ts0Var8 = new ts0(rs0Var2, 480, 1);
        k = ts0Var8;
        ts0 ts0Var9 = new ts0(rs0Var2, 600, 1);
        ts0 ts0Var10 = new ts0(rs0Var2, 720, 1);
        ts0 ts0Var11 = new ts0(rs0Var2, 960, 1);
        ts0 ts0Var12 = new ts0(rs0Var2, 1080, 1);
        l = ts0Var12;
        ts0 ts0Var13 = new ts0(rs0Var2, 1280, 1);
        ts0 ts0Var14 = new ts0(rs0Var2, 1440, 1);
        m = ts0Var14;
        n = xw3.P0(ts0VarE, ts0VarE2, ts0VarE3, ts0VarE4, ts0VarE5, ts0VarE6, ts0VarE7, ts0VarE8, ts0VarE9, ts0VarE10, ts0VarE11, ts0VarE12, ts0VarE13, ts0VarE14, ts0Var, ts0VarE15, ts0VarE16, ts0Var2, ts0Var3, ts0VarE17, ts0VarE18, ts0Var4, ts0VarE19, ts0VarE20);
        o = xw3.P0(ts0Var5, ts0Var6, ts0Var7, ts0Var8, ts0Var9, ts0Var10, ts0Var11, ts0Var12, ts0Var13, ts0Var14);
    }

    public static final String a(String str, ts0 ts0Var) {
        if (str == null || r5h.X0(str)) {
            return null;
        }
        return zo5.p(str, "&fn=", ts0Var.d);
    }

    public static String b(String str, String str2) {
        if (str == null || r5h.X0(str)) {
            return null;
        }
        return zo5.p(str, "&fn=", str2);
    }

    public static final ts0 c(int i2) {
        int i3;
        if (i2 < 0) {
            ore.p("expected size should be more than zero");
            return null;
        }
        List list = n;
        int size = list.size();
        xw3.T0(list.size(), size);
        int i4 = size - 1;
        int i5 = 0;
        while (true) {
            if (i5 > i4) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + i4) >>> 1;
            int i6 = cqk.i(((ts0) list.get(i3)).a(), i2);
            if (i6 >= 0) {
                if (i6 <= 0) {
                    break;
                }
                i4 = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0) {
            return (ts0) list.get(i3);
        }
        int i7 = -(i3 + 1);
        if (i7 == 0) {
            return (ts0) list.get(0);
        }
        if (i7 == list.size()) {
            return (ts0) ww3.B1(list);
        }
        int i8 = i7 - 1;
        return Math.abs(i2 - ((ts0) list.get(i8)).a()) <= Math.abs(i2 - ((ts0) list.get(i7)).a()) ? (ts0) list.get(i8) : (ts0) list.get(i7);
    }

    public static final String d(String str, us0 us0Var, rs0 rs0Var) {
        ts0 ts0Var;
        int iOrdinal = us0Var.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = rs0Var.ordinal();
            if (iOrdinal2 == 0) {
                ts0Var = c;
            } else {
                if (iOrdinal2 != 1) {
                    ore.o();
                    return null;
                }
                ts0Var = i;
            }
        } else if (iOrdinal == 1) {
            int iOrdinal3 = rs0Var.ordinal();
            if (iOrdinal3 == 0) {
                ts0Var = d;
            } else {
                if (iOrdinal3 != 1) {
                    ore.o();
                    return null;
                }
                ts0Var = j;
            }
        } else if (iOrdinal == 2) {
            int iOrdinal4 = rs0Var.ordinal();
            if (iOrdinal4 == 0) {
                ts0Var = e;
            } else {
                if (iOrdinal4 != 1) {
                    ore.o();
                    return null;
                }
                ts0Var = k;
            }
        } else if (iOrdinal == 3) {
            int iOrdinal5 = rs0Var.ordinal();
            if (iOrdinal5 == 0) {
                ts0Var = g;
            } else {
                if (iOrdinal5 != 1) {
                    ore.o();
                    return null;
                }
                ts0Var = l;
            }
        } else {
            if (iOrdinal != 4) {
                ore.o();
                return null;
            }
            int iOrdinal6 = rs0Var.ordinal();
            if (iOrdinal6 == 0) {
                ts0Var = h;
            } else {
                if (iOrdinal6 != 1) {
                    ore.o();
                    return null;
                }
                ts0Var = m;
            }
        }
        return b(str, ts0Var.d);
    }

    public static ts0 e(int i2) {
        return new ts0(rs0.a, i2, 1);
    }
}
