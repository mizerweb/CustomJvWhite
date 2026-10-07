package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class sfa extends sq0 {
    public final long A;
    public final int B;
    public final long C;
    public final List D;
    public final kja E;
    public final long F;
    public final ng5 G;
    public final mg5 H;
    public final int I;
    public final int J;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final long h;
    public final xfa i;
    public final wja j;
    public final long k;
    public final String l;
    public final String m;
    public final c46 n;
    public final int o;
    public final long p;
    public final sfa q;
    public final String r;
    public final String s;
    public final String t;
    public final boolean u;
    public final int v;
    public final int w;
    public final long x;
    public final long y;
    public final sfa z;

    public sfa(long j, long j2, long j3, long j4, long j5, long j6, long j7, String str, xfa xfaVar, wja wjaVar, long j8, String str2, String str3, c46 c46Var, int i, long j9, sfa sfaVar, String str4, String str5, String str6, int i2, boolean z, int i3, int i4, int i5, long j10, long j11, sfa sfaVar2, long j12, int i6, long j13, List list, kja kjaVar, ng5 ng5Var, long j14) {
        super(j);
        this.b = j2;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = str;
        this.h = j3;
        this.i = xfaVar;
        this.j = wjaVar;
        this.k = j8;
        this.l = str2;
        this.m = str3;
        this.o = i;
        this.p = j9;
        this.q = sfaVar;
        this.n = c46Var;
        this.r = str4;
        this.s = str5;
        this.t = str6;
        this.I = i2;
        this.u = z;
        this.v = i3;
        this.w = i4;
        this.J = i5;
        this.x = j10;
        this.y = j11;
        this.z = sfaVar2;
        this.A = j12;
        this.B = i6;
        this.C = j13;
        this.D = list;
        this.E = kjaVar;
        this.F = j14;
        this.G = ng5Var;
        this.H = ng5Var != null ? mg5.DELAYED : mg5.REGULAR;
    }

    public final qvj A() {
        if (a0()) {
            return this.n.l(y60.n).n;
        }
        return null;
    }

    public final boolean B(y60 y60Var) {
        if (C()) {
            int i = 0;
            while (true) {
                c46 c46Var = this.n;
                if (i >= c46Var.i()) {
                    break;
                }
                if (c46Var.h(i).a == y60Var) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean C() {
        c46 c46Var = this.n;
        return c46Var != null && c46Var.i() > 0;
    }

    public final boolean D() {
        return this.G != null;
    }

    public final boolean E() {
        return this.q != null && this.o == 2;
    }

    public final boolean F() {
        if (this.q == null) {
            return false;
        }
        int i = this.o;
        return i == 2 || i == 1;
    }

    public final boolean G(long j) {
        List<cga> list = this.D;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (cga cgaVar : list) {
            if (cgaVar.c == bga.a && cgaVar.a == j) {
                return true;
            }
        }
        return false;
    }

    public final boolean H() {
        return this.q != null && this.o == 1;
    }

    public final boolean I() {
        return B(y60.d) && z() != null && z().b == 2;
    }

    public final boolean J() {
        return C() && this.n.l(y60.e) != null;
    }

    public final boolean K() {
        return C() && this.n.l(y60.h) != null;
    }

    public final boolean L() {
        return C() && this.n.l(y60.k) != null;
    }

    public final boolean M() {
        return C() && this.n.l(y60.b) != null;
    }

    public final boolean N() {
        return this.H == mg5.DELAYED;
    }

    public final boolean O() {
        return this.j == wja.DELETED;
    }

    public final boolean P() {
        return C() && this.n.l(y60.j) != null;
    }

    public final boolean Q() {
        return C() && this.n.l(y60.m) != null;
    }

    public final boolean R() {
        return C() && this.n.l(y60.c) != null;
    }

    public final boolean S() {
        return C() && this.n.l(y60.o) != null;
    }

    public final boolean T() {
        o5d o5dVarU = u();
        if (o5dVarU == null) {
            return false;
        }
        if (E()) {
            sfa sfaVar = this.q;
            if (sfaVar.S()) {
                return o5dVarU.c() != sfaVar.u().c();
            }
        }
        return true;
    }

    public final boolean U() {
        return C() && this.n.l(y60.l) != null;
    }

    public final boolean V() {
        return C() && this.n.l(y60.g) != null;
    }

    public final boolean W() {
        return C() && this.n.l(y60.f) != null;
    }

    public final boolean X() {
        return C() && this.n.l(y60.p) != null;
    }

    public final boolean Y() {
        if (F() && this.q.Y()) {
            return true;
        }
        if (!C()) {
            return false;
        }
        int i = 0;
        while (true) {
            c46 c46Var = this.n;
            if (i >= c46Var.i()) {
                return true;
            }
            if (c46Var.h(i).a != y60.a) {
                return false;
            }
            i++;
        }
    }

    public final boolean Z() {
        return C() && this.n.l(y60.d) != null;
    }

    public final boolean a0() {
        return C() && this.n.l(y60.n) != null;
    }

    public final boolean b0(long j) {
        if (K()) {
            return !(o().i() || o().g()) || this.e == j;
        }
        return false;
    }

    public final rfa c0() {
        rfa rfaVar = new rfa();
        rfaVar.a = this.a;
        rfaVar.b = this.b;
        rfaVar.c = this.c;
        rfaVar.d = this.d;
        rfaVar.e = this.e;
        rfaVar.f = this.f;
        rfaVar.g = this.g;
        rfaVar.h = this.h;
        rfaVar.i = this.i;
        rfaVar.j = this.j;
        rfaVar.k = this.k;
        rfaVar.l = this.l;
        rfaVar.m = this.m;
        rfaVar.n = this.n;
        rfaVar.o = this.o;
        rfaVar.p = this.p;
        rfaVar.q = this.q;
        rfaVar.r = this.r;
        rfaVar.s = this.s;
        rfaVar.t = this.t;
        rfaVar.H = this.I;
        rfaVar.u = this.u;
        rfaVar.w = this.w;
        rfaVar.v = this.v;
        rfaVar.I = this.J;
        rfaVar.x = this.x;
        rfaVar.y = this.y;
        rfaVar.z = this.z;
        rfaVar.A = this.A;
        rfaVar.B = this.B;
        rfaVar.C = this.C;
        rfaVar.b(this.D);
        rfaVar.E = this.E;
        rfaVar.G = this.F;
        rfaVar.F = this.G;
        return rfaVar;
    }

    public final String h() {
        if (F()) {
            sfa sfaVar = this.q;
            if (sfaVar.Y()) {
                return sfaVar.h();
            }
        }
        if (!Y()) {
            return null;
        }
        int i = 0;
        while (true) {
            c46 c46Var = this.n;
            if (i >= c46Var.i()) {
                return null;
            }
            e70 e70VarH = c46Var.h(i);
            boolean z = e70VarH.a == y60.a;
            String str = e70VarH.C;
            if (z && str != null) {
                return str;
            }
            i++;
        }
    }

    public final e70 i(String str) {
        Object obj = null;
        if (!C()) {
            return null;
        }
        List list = (List) this.n.a;
        if (list != null) {
            for (Object obj2 : list) {
                try {
                    if (Objects.equals(((e70) obj2).t, str)) {
                        obj = obj2;
                        break;
                    }
                } catch (Throwable th) {
                    qr7.o(th);
                    return null;
                }
            }
        }
        return (e70) obj;
    }

    public final e70 k(y60 y60Var) {
        Object obj = null;
        if (!C()) {
            return null;
        }
        List list = (List) this.n.a;
        if (list != null) {
            for (Object obj2 : list) {
                try {
                    if (((e70) obj2).a == y60Var) {
                        obj = obj2;
                        break;
                    }
                } catch (Throwable th) {
                    qr7.o(th);
                    return null;
                }
            }
        }
        return (e70) obj;
    }

    public final int m() {
        c46 c46Var = this.n;
        if (c46Var != null) {
            return c46Var.i();
        }
        return 0;
    }

    public final b60 n() {
        if (J()) {
            return this.n.l(y60.e).e;
        }
        return null;
    }

    public final e60 o() {
        if (K()) {
            return this.n.l(y60.h).i;
        }
        return null;
    }

    public final f60 p() {
        if (L()) {
            return this.n.l(y60.k).k;
        }
        return null;
    }

    public final h60 q() {
        if (M()) {
            return this.n.l(y60.b).c;
        }
        return null;
    }

    public final j60 r() {
        if (P()) {
            return this.n.l(y60.j).j;
        }
        return null;
    }

    public final long s() {
        long j = this.d;
        long j2 = this.c;
        return j > j2 ? j : j2;
    }

    public final String t() {
        boolean zI = I();
        c46 c46Var = this.n;
        if (zI) {
            return c46Var.l(y60.d).d.u;
        }
        y60 y60Var = y60.e;
        if (!B(y60Var) || n() == null) {
            return null;
        }
        return c46Var.l(y60Var).e.f;
    }

    @Override // defpackage.sq0
    public final String toString() {
        long j = this.a;
        boolean zC = gm0.c();
        c46 c46Var = this.n;
        wja wjaVar = this.j;
        long j2 = this.c;
        long j3 = this.f;
        long j4 = this.h;
        long j5 = this.b;
        if (!zC) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("{id=");
            sb.append(j);
            qt4.z(j5, ",serverId=", ",chatId=", sb);
            sb.append(j4);
            qt4.z(j3, ",cid=", ",time=", sb);
            sb.append(j2);
            sb.append(",status=");
            sb.append(wjaVar);
            sb.append(", attaches count=");
            return zo5.t(sb, c46Var != null ? c46Var.i() : 0, "}");
        }
        StringBuilder sbS = qt4.s(j, "MessageDb{id=", ", serverId='");
        sbS.append(j5);
        sbS.append("', text='");
        sbS.append(this.g);
        sbS.append("', delayedAttrs =");
        sbS.append(this.G);
        sbS.append(", time=");
        sbS.append(vd7.K(Long.valueOf(j2)));
        sbS.append(", timeLocal=");
        sbS.append(vd7.K(Long.valueOf(this.k)));
        sbS.append(", updateTime=");
        sbS.append(vd7.K(Long.valueOf(this.d)));
        sbS.append(", sender=");
        sbS.append(this.e);
        qt4.z(j3, ", cid='", "', chatId=", sbS);
        sbS.append(j4);
        sbS.append(", deliveryStatus=");
        sbS.append(this.i);
        sbS.append(", status=");
        sbS.append(wjaVar);
        sbS.append(", error=");
        sbS.append(this.l);
        sbS.append(", localizedMessageError=");
        sbS.append(this.m);
        sbS.append(", attaches count=");
        sbS.append(c46Var != null ? c46Var.i() : 0);
        sbS.append(", elements count=");
        sbS.append(tre.O(this.D));
        sbS.append(", reactions=");
        kja kjaVar = this.E;
        sbS.append(kjaVar != null ? kjaVar.toString() : "null");
        sbS.append("} ");
        sbS.append(super.toString());
        return sbS.toString();
    }

    public final o5d u() {
        if (S()) {
            return this.n.l(y60.o).o;
        }
        return null;
    }

    public final t60 v() {
        if (V()) {
            return this.n.l(y60.g).g;
        }
        return null;
    }

    public final w60 w() {
        if (W()) {
            return this.n.l(y60.f).f;
        }
        return null;
    }

    public final ntg x() {
        if (X()) {
            return this.n.l(y60.p).p;
        }
        return null;
    }

    public final long y() {
        return this.b == 0 ? this.k : this.c;
    }

    public final d70 z() {
        if (Z()) {
            return this.n.l(y60.d).d;
        }
        return null;
    }
}
