package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ar4 {
    public static final List f = xw3.P0(2, 4, 3);
    public static final List g = xw3.P0(2, 3);
    public static final List h = xw3.P0(2, 6, 4, 5);
    public static final List i = Collections.singletonList(3);
    public static final List j = Collections.singletonList(3);
    public static final List k = xw3.P0(4, 5);
    public static final List l = xw3.P0(2, 4, 3);
    public static final List m = xw3.P0(2, 3);
    public static final Map n;
    public static final Map o;
    public static final Map p;
    public static final Map q;
    public static final i64 r;
    public static final List s;
    public static final List t;
    public static final List u;
    public static final Map v;
    public static final Map w;
    public static final p7d x;
    public final yp7 a;
    public final bg2 b;
    public final gq7 c;
    public final n89 d;
    public i64 e;

    static {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        n = Collections.singletonMap(key, 1);
        o = Collections.singletonMap(key, 2);
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        p = Collections.singletonMap(key2, 1);
        q = wm9.Q0(new ylc(key, 1), new ylc(key2, 1));
        r = qyj.a(new toe(4, null));
        s = xw3.P0(0, 1, 2, 4);
        List listP0 = xw3.P0(0, 3, 1, 2, 6);
        t = listP0;
        u = xw3.P0(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        Collections.singletonMap(key3, bool);
        wm9.Q0(new ylc(key, 2), new ylc(key3, bool));
        Collections.singletonMap(key3, Boolean.FALSE);
        v = Collections.singletonMap(key2, 2);
        w = wm9.Q0(new ylc(key, 2), new ylc(key2, 2));
        x = new p7d(19, Collections.singletonMap(CaptureResult.CONTROL_AF_STATE, listP0));
    }

    public ar4(yp7 yp7Var, bg2 bg2Var, gq7 gq7Var, n89 n89Var) {
        this.a = yp7Var;
        this.b = bg2Var;
        this.c = gq7Var;
        this.d = n89Var;
    }

    public static i64 b(ar4 ar4Var, oe oeVar, pe peVar, ql0 ql0Var, jx6 jx6Var, List list, List list2, List list3, int i2) {
        pe peVar2 = (i2 & 2) != 0 ? null : peVar;
        ql0 ql0Var2 = (i2 & 4) != 0 ? null : ql0Var;
        jx6 jx6Var2 = (i2 & 8) != 0 ? null : jx6Var;
        List list4 = (i2 & 16) != 0 ? null : list;
        List list5 = (i2 & 32) != 0 ? null : list2;
        List list6 = (i2 & 64) != 0 ? null : list3;
        if (ar4Var.a.c.l() == null) {
            gq7.b(ar4Var.c, oeVar, peVar2, ql0Var2, jx6Var2, list4, list5, list6, null, null, null, 896);
            ar4Var.a.f(ar4Var.c.a());
            return r;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (oeVar != null) {
        }
        if (peVar2 != null) {
        }
        if (ql0Var2 != null) {
        }
        if (jx6Var2 != null) {
        }
        uoe uoeVar = new uoe(wm9.X0(linkedHashMap));
        ar4Var.d.e(uoeVar);
        gq7.b(ar4Var.c, oeVar, peVar2, ql0Var2, jx6Var2, list4, list5, list6, null, null, null, 896);
        ar4Var.a.f(ar4Var.c.a());
        i64 i64Var = uoeVar.d;
        synchronized (ar4Var) {
            try {
                Log.d("CXCP", "Controller3A#update3A: cancelling previous request " + ar4Var.e);
                i64 i64Var2 = ar4Var.e;
                if (i64Var2 != null) {
                    i64Var2.b(mwl.a("A newer call for 3A state update initiated.", null));
                }
                ar4Var.e = i64Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i64Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:123:0x0225 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:124:0x0226  */
    /* JADX WARN: Code duplicated, block: B:137:0x028a  */
    /* JADX WARN: Code duplicated, block: B:138:0x028d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0293  */
    /* JADX WARN: Code duplicated, block: B:141:0x0296  */
    /* JADX WARN: Code duplicated, block: B:143:0x029c  */
    /* JADX WARN: Code duplicated, block: B:144:0x029e  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:147:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:165:0x0326  */
    /* JADX WARN: Code duplicated, block: B:168:0x032b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x032d  */
    /* JADX WARN: Code duplicated, block: B:170:0x036e  */
    /* JADX WARN: Code duplicated, block: B:174:0x037d  */
    /* JADX WARN: Code duplicated, block: B:176:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x012d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code duplicated, block: B:81:0x0153  */
    /* JADX WARN: Code duplicated, block: B:84:0x0168  */
    /* JADX WARN: Code duplicated, block: B:85:0x016a  */
    /* JADX WARN: Code duplicated, block: B:87:0x016f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0176  */
    /* JADX WARN: Code duplicated, block: B:94:0x017d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0180 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0186  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r9.e(defpackage.ar4.o) == false) goto L25;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:164:0x02d7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x0186, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r34, java.util.List r35, java.util.List r36, defpackage.jd9 r37, defpackage.jd9 r38, defpackage.jd9 r39, defpackage.oe r40, defpackage.cf7 r41, int r42, java.lang.Long r43, java.lang.Long r44, defpackage.nq4 r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar4.a(java.util.List, java.util.List, java.util.List, jd9, jd9, jd9, oe, cf7, int, java.lang.Long, java.lang.Long, nq4):java.lang.Object");
    }
}
