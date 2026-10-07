package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.exception.ApiArgumentValidateException;

/* JADX INFO: loaded from: classes.dex */
public final class pvb {
    public static final long[] f = new long[0];
    public final String a = pvb.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ifh e;

    public pvb(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ifh ifhVar) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ifhVar;
    }

    public static long e(pvb pvbVar, String str) {
        return s(pvbVar, new z22(pvbVar.u().a.g(), str, 0));
    }

    public static long s(pvb pvbVar, aq aqVar) {
        sih sihVar = (sih) pvbVar.b.getValue();
        sihVar.getClass();
        return sih.a(sihVar.a, new rih(aqVar, false, false, 0L, 0));
    }

    public static long t(pvb pvbVar, aq aqVar) {
        return ((sih) pvbVar.b.getValue()).c(aqVar, (12 & 2) != 0 ? false : false, 0L, (12 & 8) == 0 ? 1 : 0);
    }

    public final long A(boolean z) {
        gm0.n(this.a, "ping, active = " + z + ", current time = " + vd7.K(Long.valueOf(System.currentTimeMillis())));
        return s(this, new h0d(u().a.g(), z));
    }

    public final long B(String str, r60 r60Var, String str2, long j, int i) {
        return t(this, new akd(u().a.g(), null, null, str, j, r60Var, null, str2, i));
    }

    public final long C(long j, long j2, List list, boolean z, int i) {
        d73 d73Var = new d73(0, i, u().a.g(), j, j2, p63.ADMIN, e73.REMOVE, list, true);
        return z ? t(this, d73Var) : s(this, d73Var);
    }

    public final Object D(hih hihVar, lq4 lq4Var) {
        return ((sih) this.b.getValue()).a.g(hihVar, lq4Var);
    }

    public final long a(long j, long j2, List list, boolean z) {
        if (j(j)) {
            return t(this, new d73(0, 0, u().a.g(), j, j2, p63.MEMBER, e73.ADD, list, z));
        }
        return 0L;
    }

    public void b(int i, List list) {
        s(this, new jy(i, u().a.g(), ww3.U1(list)));
    }

    public final long c(int i, long[] jArr) {
        return t(this, new uy(i, u().a.g(), jArr));
    }

    public final long d(int i, long j) {
        return s(this, new wy(i, u().a.g(), j));
    }

    public final long f(long j) {
        return s(this, new mz2(u().a.g(), Collections.singletonList(Long.valueOf(j))));
    }

    public final long g(long j, long j2, int i, String str, boolean z, Map map) {
        if (j(j)) {
            return s(this, new cg3(u().a.g(), j, j2, i, str, z, null, map, null, null, null, null, false));
        }
        return 0L;
    }

    public final long h(long j, long j2, String str) {
        if (j(j)) {
            return t(this, new cg3(u().a.g(), j, j2, 0, null, false, str, null, null, null, null, null, false));
        }
        return 0L;
    }

    public final long i(long j, long j2, String str, String str2, r60 r60Var) {
        if (j(j)) {
            return t(this, new cg3(u().a.g(), j, j2, 0, null, false, null, null, str, str2, r60Var, null, false));
        }
        return 0L;
    }

    public final boolean j(long j) {
        int iOrdinal;
        if (j != 0 || (iOrdinal = ((ovb) this.e.getValue()).ordinal()) == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            gm0.V(this.a, "invalid chat local id", new ApiArgumentValidateException("invalid chat local id"));
            return false;
        }
        if (iOrdinal == 2) {
            throw new ApiArgumentValidateException("invalid chat local id");
        }
        ore.o();
        return false;
    }

    public final boolean k(long j) {
        int iOrdinal;
        if (j != 0 || (iOrdinal = ((ovb) this.e.getValue()).ordinal()) == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            gm0.V(this.a, "invalid message local id", new ApiArgumentValidateException("invalid message local id"));
            return false;
        }
        if (iOrdinal == 2) {
            throw new ApiArgumentValidateException("invalid message local id");
        }
        ore.o();
        return false;
    }

    public final boolean l(long j) {
        int iOrdinal;
        if (j != 0 || (iOrdinal = ((ovb) this.e.getValue()).ordinal()) == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            gm0.V(this.a, "invalid message server id", new ApiArgumentValidateException("invalid message server id"));
            return false;
        }
        if (iOrdinal == 2) {
            throw new ApiArgumentValidateException("invalid message server id");
        }
        ore.o();
        return false;
    }

    public final long[] m(long j, long j2, List list, List list2) {
        int iOrdinal;
        long[] jArr = gp0.c;
        if (list.size() != list2.size() && (iOrdinal = ((ovb) this.e.getValue()).ordinal()) != 0) {
            if (iOrdinal == 1) {
                gm0.V(this.a, "messageIds.size() != messageServerIds.size()", new ApiArgumentValidateException("messageIds.size() != messageServerIds.size()"));
                return jArr;
            }
            if (iOrdinal == 2) {
                throw new ApiArgumentValidateException("messageIds.size() != messageServerIds.size()");
            }
            ore.o();
            return null;
        }
        if (list2.isEmpty()) {
            return jArr;
        }
        ArrayList arrayListY1 = ww3.Y1(list2, 100, 100);
        ArrayList arrayListY2 = ww3.Y1(list, 100, 100);
        ArrayList arrayList = new ArrayList(yw3.W0(arrayListY2, 10));
        int i = 0;
        for (Object obj : arrayListY2) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            arrayList.add(Long.valueOf(t(this, new my3(u().a.g(), new q24(j, j2), (List) obj, (List) arrayListY1.get(i), 0))));
            i = i2;
        }
        return ww3.U1(arrayList);
    }

    public final long n(long j, long j2, long j3, String str, String str2, wja wjaVar, List list) {
        if (k(j3)) {
            return t(this, new ty3(u().a.g(), new q24(j, j2), j3, str, str2, wjaVar, list));
        }
        return 0L;
    }

    public final long o(long j) {
        if (j(j)) {
            return t(this, new v94(u().a.g(), j, false, null, false, f));
        }
        return 0L;
    }

    public final long p() {
        return t(this, new v94(u().a.g(), 0L, true, null, false, f));
    }

    public long q(lni lniVar) {
        return t(this, new v94(u().a.g(), 0L, false, lniVar, false, f));
    }

    public final long r(long j) {
        return s(this, new z22(u().a.g(), new long[]{j}, 1));
    }

    public final zed u() {
        return (zed) this.c.getValue();
    }

    public final long v(String str) {
        if (str != null && !r5h.X0(str)) {
            return sih.b((sih) this.b.getValue(), new m29(u().a.g(), str));
        }
        ore.p("link is empty");
        return 0L;
    }

    public final long[] w(long j, long j2, List list, List list2, boolean z, mg5 mg5Var) {
        int iOrdinal;
        long[] jArr = gp0.c;
        if (j(j)) {
            if (list.size() != list2.size() && (iOrdinal = ((ovb) this.e.getValue()).ordinal()) != 0) {
                if (iOrdinal == 1) {
                    gm0.V(this.a, "messageIds.size() != messageServerIds.size()", new ApiArgumentValidateException("messageIds.size() != messageServerIds.size()"));
                    return jArr;
                }
                if (iOrdinal == 2) {
                    throw new ApiArgumentValidateException("messageIds.size() != messageServerIds.size()");
                }
                ore.o();
                return null;
            }
            if (!list2.isEmpty()) {
                ArrayList arrayListY1 = ww3.Y1(list2, 100, 100);
                ArrayList arrayListY2 = ww3.Y1(list, 100, 100);
                ArrayList arrayList = new ArrayList(yw3.W0(arrayListY2, 10));
                int i = 0;
                for (Object obj : arrayListY2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        xw3.V0();
                        throw null;
                    }
                    arrayList.add(Long.valueOf(t(this, new g3b(u().a.g(), j, j2, (List) obj, (List) arrayListY1.get(i), 0, z, mg5Var, false))));
                    i = i2;
                }
                return ww3.U1(arrayList);
            }
        }
        return jArr;
    }

    public final long x(long j, long j2, long j3, long j4, String str, String str2, wja wjaVar, List list, boolean z, List list2) {
        if (j(j) && k(j2) && l(j4)) {
            return t(this, new o3b(u().a.g(), j, j2, j3, j4, str, str2, wjaVar, list, list2, z));
        }
        return 0L;
    }

    public final long y(long j, List list) {
        return s(this, new p01(1, u().a.g(), j, list));
    }

    public final Object z(String str, r60 r60Var, nq4 nq4Var) {
        ar2 ar2Var = new ar2(u().a.g(), str, 0L, r60Var);
        wzj wzjVar = (wzj) this.d.getValue();
        if (wzjVar instanceof yz8) {
            return new Long(((yz8) wzjVar).e(ar2Var));
        }
        if (wzjVar instanceof jgb) {
            return ((jgb) wzjVar).f(ar2Var, nq4Var);
        }
        qr7.v(wzjVar, "unknown implementation ");
        return null;
    }
}
