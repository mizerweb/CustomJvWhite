package defpackage;

import android.net.Uri;
import android.util.TypedValue;
import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.LongFunction;
import java.util.regex.Pattern;
import ru.ok.tamtam.messages.c;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public class rt2 implements Comparable {
    public final long a;
    public final nx2 b;
    public final fda c;
    public final fda d;
    public final fda e;
    public final long f;
    public final List g;
    public volatile String h;
    public volatile CharSequence i;
    public volatile CharSequence j;
    public volatile CharSequence k;
    public final AtomicReference l = new AtomicReference(null);
    public volatile CharSequence m;
    public volatile s5e n;
    public volatile String o;
    public final jzb p;
    public final ef3 q;

    public rt2(jzb jzbVar, ef3 ef3Var, long j, long j2, nx2 nx2Var, fda fdaVar, fda fdaVar2, fda fdaVar3, LongFunction longFunction) {
        vg4 vg4Var;
        this.p = jzbVar;
        this.q = ef3Var;
        this.a = j;
        this.f = j2;
        this.b = nx2Var;
        this.c = fdaVar;
        this.d = fdaVar2;
        this.e = fdaVar3;
        if (longFunction == null) {
            this.g = Collections.EMPTY_LIST;
            return;
        }
        ArrayList arrayList = new ArrayList(nx2Var.e.size());
        for (Long l : nx2Var.e.keySet()) {
            if (l != null && (((vg4Var = (vg4) longFunction.apply(l.longValue())) != null && vg4Var.v() != this.f) || y0())) {
                arrayList.add(vg4Var);
            }
        }
        if (arrayList.isEmpty()) {
            this.g = Collections.EMPTY_LIST;
        } else {
            this.g = Collections.unmodifiableList(arrayList);
        }
    }

    public long A() {
        return this.b.a;
    }

    public final boolean A0() {
        return z0() || this.b.e.containsKey(Long.valueOf(this.f));
    }

    public final long B() {
        Long l;
        long jX = x();
        nx2 nx2Var = this.b;
        long j = nx2Var.f0;
        if (nx2Var.e0 == null) {
            j = 0;
        } else if (j == 0) {
            j = nx2Var.g0;
        }
        Long[] lArr = {Long.valueOf(nx2Var.Q), Long.valueOf(jX), Long.valueOf(j)};
        if (lArr.length == 0) {
            l = null;
        } else {
            Long l2 = lArr[0];
            int i = 1;
            int length = lArr.length - 1;
            if (1 <= length) {
                while (true) {
                    Long l3 = lArr[i];
                    if (l2.compareTo(l3) < 0) {
                        l2 = l3;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            l = l2;
        }
        long jLongValue = (l != null ? l : 0L).longValue();
        return jLongValue == 0 ? nx2Var.k : jLongValue;
    }

    public final boolean B0() {
        return this.f == this.b.d && W();
    }

    public final List C(int i, int i2) {
        List listB;
        jzb jzbVar = this.p;
        if (jzbVar != null && (listB = jzbVar.b(this)) != null) {
            return listB;
        }
        vg4 vg4VarW = w();
        return vg4VarW != null ? zdl.b(vg4VarW.a.b.c, vs0.c(i), vs0.c(i2)) : zdl.b(this.b.h, vs0.c(i), vs0.c(i2));
    }

    public final boolean C0() {
        return this.b.e.containsKey(Long.valueOf(this.f)) || Z();
    }

    public final CharSequence D(boolean z) {
        if (this.i == null || z) {
            this.i = this.q.a(this);
        }
        return this.i;
    }

    public final boolean D0() {
        boolean z = this.b.I.h;
        if (z) {
            return true;
        }
        vg4 vg4VarW = w();
        return vg4VarW != null ? vg4VarW.H() : z;
    }

    public String E() {
        return D(false).toString();
    }

    public final boolean E0() {
        return this.b.d0.b;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    public String F() {
        String strA;
        String string;
        if (this.h == null) {
            ef3 ef3Var = this.q;
            long j = this.f;
            dp5 dp5Var = ef3Var.b;
            boolean zY0 = y0();
            nx2 nx2Var = this.b;
            if (zY0) {
                string = ((p4c) dp5Var.get()).a.getString(R.string.saved_messages);
            } else {
                String strK = null;
                if (h0()) {
                    vg4 vg4VarW = w();
                    if (vg4VarW != null) {
                        strK = vg4VarW.k();
                    }
                } else {
                    if (ch3.r(nx2Var.g)) {
                        List list = this.g;
                        if (!d0() && !list.isEmpty()) {
                            strA = vol.a(list, j);
                        } else if (d0()) {
                            strA = "";
                        }
                    } else {
                        strA = nx2Var.g;
                    }
                    if (strA == null) {
                        string = ((p4c) dp5Var.get()).a.getString(R.string.tt_chat_participants_empty__title);
                    } else {
                        string = strA;
                    }
                }
                strA = strK;
                if (strA == null) {
                    string = ((p4c) dp5Var.get()).a.getString(R.string.tt_chat_participants_empty__title);
                } else {
                    string = strA;
                }
            }
            this.h = string;
        }
        return this.h;
    }

    public final boolean F0() {
        vg4 vg4VarW = w();
        return (vg4VarW == null || b0() || vg4VarW.h()) ? false : true;
    }

    public final mx2 G() {
        nx2 nx2Var = this.b;
        if (nx2Var == null) {
            return null;
        }
        return nx2Var.V;
    }

    public final boolean G0() {
        kx2 kx2Var = kx2.f;
        kx2 kx2Var2 = kx2.g;
        kx2 kx2Var3 = kx2.a;
        nx2 nx2Var = this.b;
        if (nx2Var != null) {
            long j = this.f;
            lx2 lx2Var = nx2Var.b;
            lx2 lx2Var2 = lx2.c;
            kx2 kx2Var4 = nx2Var.c;
            if (lx2Var == lx2Var2) {
                if (kx2Var4 == kx2Var3 || kx2Var4 == kx2Var2) {
                    return true;
                }
                if (kx2Var4 != kx2Var && kx2Var4 != kx2Var2) {
                    return false;
                }
                if ((kx2Var4 == kx2Var3 && nx2Var.T.containsKey(Long.valueOf(j))) || nx2Var.e.containsKey(Long.valueOf(j))) {
                    return true;
                }
            } else {
                if (kx2Var4 != kx2Var && kx2Var4 != kx2Var2) {
                    return (nx2Var.d() && nx2Var.c == kx2Var3) || (nx2Var.d() && nx2Var.c == kx2Var2) || nx2Var.c == kx2Var3;
                }
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "ChatData", "chat is closed ".concat(nx2Var.toString()), null);
                    }
                }
            }
        }
        return false;
    }

    public final boolean H() {
        if (X()) {
            return B0() || srk.a(n(this.f), 4);
        }
        return false;
    }

    public final boolean H0() {
        fda fdaVar = this.c;
        if (fdaVar == null) {
            return false;
        }
        sfa sfaVar = fdaVar.a;
        return sfaVar.M() && sfaVar.q().a == 4 && sfaVar.q().b == this.f;
    }

    public final boolean I() {
        zw2 zw2Var;
        if (f0()) {
            return false;
        }
        nx2 nx2Var = this.b;
        if (nx2Var.K.i(1)) {
            return false;
        }
        if (!X() && (!d0() || !x0())) {
            return false;
        }
        if (!B0()) {
            boolean zA = srk.a(n(this.f), 2);
            if (d0() || (zw2Var = nx2Var.I) == null || zw2Var.d) {
                return zA;
            }
        }
        return true;
    }

    public final CharSequence I0(fda fdaVar) {
        amc amcVar = (amc) this.l.updateAndGet(new pa1(this, 2, fdaVar));
        if (amcVar != null) {
            return (CharSequence) amcVar.b;
        }
        return null;
    }

    public final boolean J() {
        if (X()) {
            return B0() || srk.a(n(this.f), 8);
        }
        return false;
    }

    public final void J0() {
        String string;
        fda fdaVar;
        CharSequence charSequenceA;
        if (this.k != null) {
            return;
        }
        ef3 ef3Var = this.q;
        ef3Var.getClass();
        fda fdaVar2 = this.c;
        CharSequence charSequenceG = null;
        if (fdaVar2 != null) {
            vg4 vg4Var = fdaVar2.b;
            sfa sfaVar = fdaVar2.a;
            p4c p4cVar = (p4c) ef3Var.b.get();
            if (sfaVar.M() && sfaVar.q().a == 8) {
                string = sfaVar.q().j;
            } else if (sfaVar.M() && sfaVar.q().a == 10 && (fdaVar = fdaVar2.d) != null) {
                e13 e13Var = fdaVar.h;
                e13Var.getClass();
                charSequenceG = e13.g(e13Var, this, fdaVar, 1);
            } else {
                c cVar = fdaVar2.e;
                cVar.a(this);
                cVar.f = this;
                p4c p4cVar2 = cVar.a;
                cVar.n(this, p4cVar2.h(), p4cVar2.f());
                CharSequence charSequence = cVar.g;
                if (charSequence != null) {
                    string = charSequence.toString();
                    Pattern pattern = xoh.a;
                    if (string.length() > 200) {
                        String strSubstring = string.substring(0, 200);
                        if (Character.isHighSurrogate(strSubstring.charAt(strSubstring.length() - 1)) && strSubstring.length() > 1) {
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                        }
                        string = strSubstring.concat("…");
                    }
                }
            }
            p4cVar.getClass();
            charSequenceG = wh.a(p4cVar.m(tre.z0(p4cVar.k.c(yl5.b(18), string)), sfaVar.D, yl5.b(18)));
            if (sfaVar.M() && !ch3.r(charSequenceG)) {
                String string2 = charSequenceG.toString();
                h60 h60VarQ = sfaVar.q();
                switch (qt4.D(h60VarQ.a)) {
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                        charSequenceA = woh.a(string2, vg4Var, p4cVar, true);
                        charSequenceG = charSequenceA;
                        break;
                    case 2:
                    case 3:
                        charSequenceA = woh.b(string2, h60VarQ, vg4Var, p4cVar, (bi4) p4cVar.d.getValue(), true);
                        charSequenceG = charSequenceA;
                        break;
                    case 7:
                    default:
                        charSequenceG = string2;
                        break;
                }
            }
        }
        this.k = charSequenceG;
    }

    public final boolean K() {
        return this.b.K.i(np0.r);
    }

    public final void K0() {
        if (this.j != null) {
            return;
        }
        if (y0()) {
            this.j = F();
            return;
        }
        ef3 ef3Var = this.q;
        String strF = F();
        dp5 dp5Var = ef3Var.b;
        p4c p4cVar = (p4c) dp5Var.get();
        p4c p4cVar2 = (p4c) dp5Var.get();
        p4cVar2.getClass();
        this.j = p4cVar.k.c((int) (TypedValue.applyDimension(2, p4cVar2.j.c.d.getFloat("app.extra.text.size.sp", 0.0f), yl5.d().getDisplayMetrics()) + gm0.K(TypedValue.applyDimension(2, 16.0f, yl5.d().getDisplayMetrics()))), strF);
    }

    public final boolean L() {
        return B0() || srk.a(n(this.f), 1024);
    }

    public final void L0() {
        if (this.m != null) {
            return;
        }
        if (this.p != null && y0()) {
            this.m = "";
            return;
        }
        vg4 vg4VarW = w();
        if (vg4VarW != null) {
            this.m = vg4VarW.u();
            return;
        }
        ef3 ef3Var = this.q;
        String strF = F();
        dp5 dp5Var = ef3Var.b;
        p4c p4cVar = (p4c) dp5Var.get();
        Pattern pattern = m3c.a;
        this.m = p4cVar.k.d(m3c.a(strF, (p4c) dp5Var.get()));
    }

    public final boolean M() {
        return B0() || srk.a(n(this.f), np0.o);
    }

    public final boolean M0() {
        return this.b.d0.a || b0();
    }

    public final boolean N() {
        boolean zF = this.b.f();
        fda fdaVar = this.d;
        if (zF && fdaVar == null) {
            return true;
        }
        return (fdaVar == null || fdaVar.a.j == wja.DELETED || z() >= fdaVar.a.c) ? false : true;
    }

    public final boolean O() {
        return this.b.m > 0;
    }

    public final boolean P() {
        zw2 zw2Var;
        if (!h0() && !(this instanceof s04) && !n0()) {
            nx2 nx2Var = this.b;
            if (!nx2Var.K.i(16) && X() && !nx2Var.K.i(16)) {
                if (B0()) {
                    return true;
                }
                boolean zA = srk.a(n(this.f), 16);
                if (d0() || (zw2Var = nx2Var.I) == null || !zw2Var.e) {
                    return zA;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean Q() {
        return B0() || srk.a(n(this.f), 1);
    }

    public final boolean R() {
        return B0() || srk.a(n(this.f), np0.n);
    }

    public final boolean S() {
        if (!X() && (!d0() || !x0())) {
            return false;
        }
        zw2 zw2Var = this.b.I;
        if (zw2Var == null || !zw2Var.i) {
            return srk.a(n(this.f), np0.m);
        }
        return true;
    }

    public final boolean T() {
        if (!N()) {
            return false;
        }
        nx2 nx2Var = this.b;
        boolean zF = nx2Var.f();
        fda fdaVar = this.d;
        if (zF && nx2Var.h0 != 0 && fdaVar == null) {
            return true;
        }
        if (fdaVar != null) {
            return fdaVar.a.G(this.f);
        }
        return false;
    }

    public final boolean U() {
        fda fdaVar;
        eia eiaVar;
        fda fdaVar2;
        if (T()) {
            return true;
        }
        if (!N() || (fdaVar = this.d) == null) {
            return false;
        }
        long j = fdaVar.a.e;
        long j2 = this.f;
        return (j == j2 || (eiaVar = fdaVar.c) == null || (fdaVar2 = eiaVar.c) == null || fdaVar2.b.v() != j2) ? false : true;
    }

    public final void V() {
        boolean z = this.j != null;
        boolean z2 = this.k != null;
        boolean z3 = this.m != null;
        boolean z4 = this.l.get() != null;
        this.j = null;
        this.k = null;
        this.m = null;
        this.l.set(null);
        if (z) {
            K0();
        }
        if (z2) {
            J0();
        }
        if (z3) {
            L0();
        }
        if (z4) {
            I0(this.e);
        }
    }

    public final boolean W() {
        nx2 nx2Var = this.b;
        return nx2Var != null && nx2Var.c == kx2.a;
    }

    public final boolean X() {
        return W() && C0();
    }

    public final boolean Y(long j) {
        return this.b.T.containsKey(Long.valueOf(j));
    }

    public final boolean Z() {
        gx2 gx2Var;
        nx2 nx2Var = this.b;
        return (nx2Var == null || (gx2Var = nx2Var.L) == null || !gx2Var.i()) ? false : true;
    }

    public final boolean a() {
        zw2 zw2Var;
        if (f0() || h0() || !X()) {
            return false;
        }
        nx2 nx2Var = this.b;
        if (nx2Var.K.i(2)) {
            return false;
        }
        if (B0()) {
            return true;
        }
        boolean zJ = J();
        if (d0() || (zw2Var = nx2Var.I) == null || zw2Var.b) {
            return zJ;
        }
        return true;
    }

    public final boolean a0() {
        boolean z;
        synchronized (this.g) {
            try {
                z = false;
                if (h0() && !this.g.isEmpty() && ((vg4) this.g.get(0)).D()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean b0() {
        vg4 vg4VarW = w();
        return h0() && vg4VarW != null && vg4VarW.E();
    }

    public final boolean c0() {
        return b0() && this.b.K.i(np0.m);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return tre.P(((rt2) obj).B(), B());
    }

    public final boolean d0() {
        return this.b.b == lx2.c;
    }

    public final boolean e0() {
        return this.b.b == lx2.b;
    }

    public final boolean f0() {
        return G() != null && G().f == 2;
    }

    public final boolean g0() {
        return this.b.c == kx2.f;
    }

    public final boolean h() {
        return d0() && x0() && !A0();
    }

    public final boolean h0() {
        return this.b.b == lx2.a;
    }

    public final boolean i() {
        if (!B0()) {
            return false;
        }
        if (!d0()) {
            nx2 nx2Var = this.b;
            if (!nx2Var.c() && nx2Var.b() <= 1) {
                return false;
            }
        }
        return true;
    }

    public final boolean i0() {
        return o0() && h0() && !this.b.c();
    }

    public final boolean j0() {
        return this.b.a().e != 0;
    }

    public final String k(long j) {
        if (W() && Y(j)) {
            return ((sw2) this.b.T.get(Long.valueOf(j))).d;
        }
        return null;
    }

    public final boolean k0(e5d e5dVar) {
        return ((Boolean) e5dVar.C6.a(e5d.S6[394]).i()).booleanValue() && this.b.I.p;
    }

    public final boolean l0(et3 et3Var, nni nniVar) {
        if (s0(et3Var)) {
            return true;
        }
        return (h0() ? nniVar.i() : nniVar.h()) == 1;
    }

    public final Long m(long j) {
        if (W() && Y(j)) {
            return Long.valueOf(((sw2) this.b.T.get(Long.valueOf(j))).c);
        }
        return null;
    }

    public final boolean m0() {
        zw2 zw2Var;
        boolean zA;
        boolean zX = X();
        nx2 nx2Var = this.b;
        if (zX && !d0()) {
            zA = (!B0() && ((zw2Var = nx2Var.I) == null || zw2Var.f)) ? srk.a(n(this.f), 64) : true;
        } else {
            zA = false;
        }
        return zA && nx2Var.b() > 0;
    }

    public final int n(long j) {
        if (!W()) {
            return 0;
        }
        nx2 nx2Var = this.b;
        long j2 = nx2Var.d;
        mw mwVar = nx2Var.T;
        if (j == j2) {
            return 4095;
        }
        if (mwVar.containsKey(Long.valueOf(j))) {
            return ((sw2) mwVar.get(Long.valueOf(j))).b;
        }
        return 0;
    }

    public final boolean n0() {
        return this.b.b == lx2.d;
    }

    public final long o() {
        if (y0()) {
            return this.f;
        }
        if (b0() || h0()) {
            vg4 vg4VarW = w();
            if (vg4VarW != null) {
                return vg4VarW.v();
            }
            return 0L;
        }
        if (e0() || d0()) {
            return A();
        }
        return 0L;
    }

    public final boolean o0() {
        nx2 nx2Var = this.b;
        return nx2Var != null && nx2Var.c == kx2.h;
    }

    public final int p() {
        if (y0()) {
            return 4;
        }
        if (b0()) {
            return 3;
        }
        if (h0()) {
            return 2;
        }
        if (e0() && x0()) {
            return 5;
        }
        if (e0() && w0()) {
            return 6;
        }
        if (d0() && x0()) {
            return 7;
        }
        if (d0() && w0()) {
            return 8;
        }
        return this instanceof s04 ? 9 : 1;
    }

    public final boolean p0() {
        return e0() && x0() && W() && !C0();
    }

    public final long q() {
        if (y0()) {
            return 0L;
        }
        vg4 vg4VarW = w();
        return vg4VarW != null ? vg4VarW.v() : A();
    }

    public final boolean q0() {
        return !h0() && this.b.c == kx2.b;
    }

    public final String r(int i) {
        String strA;
        jzb jzbVar = this.p;
        if (jzbVar != null && (strA = jzbVar.a(this)) != null) {
            return strA;
        }
        vg4 vg4VarW = w();
        if (vg4VarW != null) {
            return vg4VarW.x(i);
        }
        String str = this.b.h;
        if (URLUtil.isContentUrl(str) || URLUtil.isFileUrl(str)) {
            return str;
        }
        if (ch3.r(str)) {
            return null;
        }
        return vs0.a(str, vs0.c(i));
    }

    public final boolean r0() {
        boolean zD;
        if (this.b.K.i(64)) {
            return false;
        }
        if (!h0()) {
            if (d0()) {
                return R();
            }
            return W() && C0();
        }
        if (b0()) {
            zD = E0();
        } else {
            vg4 vg4VarW = w();
            if (vg4VarW == null) {
                return false;
            }
            zD = vg4VarW.D();
        }
        return !zD;
    }

    public final String s(us0 us0Var, rs0 rs0Var) {
        String strA;
        jzb jzbVar = this.p;
        if (jzbVar != null && (strA = jzbVar.a(this)) != null) {
            return strA;
        }
        vg4 vg4VarW = w();
        if (vg4VarW != null) {
            Uri uriK = sb8.K(vs0.d(vg4VarW.a.b.c, us0Var, rs0Var));
            if (uriK == null) {
                return null;
            }
            return uriK.toString();
        }
        String str = this.b.h;
        if (URLUtil.isContentUrl(str) || URLUtil.isFileUrl(str)) {
            return str;
        }
        if (ch3.r(str)) {
            return null;
        }
        return vs0.d(str, us0Var, rs0Var);
    }

    public final boolean s0(et3 et3Var) {
        nx2 nx2Var = this.b;
        return nx2Var.a().a == -1 || nx2Var.a().a > ((s7f) et3Var).f();
    }

    public final long t(long j, mg5 mg5Var) {
        ex2 ex2VarX = sb8.x(j, this.b.n.e(mg5Var));
        if (ex2VarX == null) {
            return 0L;
        }
        long j2 = ex2VarX.a;
        long j3 = ex2VarX.b;
        if (j2 == j3) {
            return 0L;
        }
        return j3;
    }

    public final boolean t0() {
        if (b0()) {
            return E0() || this.c == null || this.b.a == 0;
        }
        return false;
    }

    public String toString() {
        return "Chat{id=" + this.a + ",data=" + this.b + '}';
    }

    public final int u(mg5 mg5Var) {
        nx2 nx2Var = this.b;
        if (nx2Var != null) {
            return nx2Var.n.d(mg5Var);
        }
        return 0;
    }

    public final boolean u0() {
        return this.b.I.c;
    }

    public final String v() {
        if (h0() && w() != null) {
            return w().a.b.n;
        }
        if (e0() || d0()) {
            return this.b.F;
        }
        return null;
    }

    public final boolean v0(long j) {
        return j == this.b.d && W();
    }

    public final vg4 w() {
        synchronized (this.g) {
            try {
                if (!h0() || this.g.isEmpty()) {
                    return null;
                }
                return (vg4) this.g.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean w0() {
        return this.b.w0 == 2;
    }

    public final long x() {
        fda fdaVar = this.c;
        if (fdaVar != null) {
            return fdaVar.a.y();
        }
        return 0L;
    }

    public final boolean x0() {
        return this.b.w0 == 1;
    }

    public final long y() {
        fda fdaVar = this.c;
        if (fdaVar != null) {
            return fdaVar.getC();
        }
        return 0L;
    }

    public final boolean y0() {
        return this.b.e(this.f);
    }

    public final long z() {
        boolean zD0 = d0();
        fda fdaVar = this.c;
        if (zD0 && g0()) {
            if (fdaVar != null) {
                return fdaVar.a.c;
            }
            return 0L;
        }
        nx2 nx2Var = this.b;
        Map map = nx2Var.e;
        long j = this.f;
        Long l = (Long) map.get(Long.valueOf(j));
        if (l != null && l.longValue() != 0) {
            return l.longValue();
        }
        if (fdaVar == null) {
            return 0L;
        }
        if (!C0() || fdaVar.a.e == j || ((d0() && !A0()) || Z())) {
            return fdaVar.a.c;
        }
        long j2 = fdaVar.a.c;
        long j3 = nx2Var.Q;
        return j2 <= j3 ? j2 - 1 : j3;
    }

    public final boolean z0() {
        return W() && Y(this.f);
    }
}
