package defpackage;

import java.text.CollationKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class vg4 implements Comparable {
    public final li4 a;
    public CharSequence b;
    public CharSequence c;
    public String d;
    public CollationKey e;
    public final boolean f;
    public final p4c g;

    public vg4(li4 li4Var, boolean z, p4c p4cVar) {
        this.a = li4Var;
        this.f = z;
        this.g = p4cVar;
    }

    public static vg4 a(long j, long j2, p4c p4cVar) {
        di4 di4Var = new di4();
        di4Var.a = j;
        di4Var.f = Collections.singletonList(fi4.e);
        di4Var.r = j2;
        di4Var.k = ji4.b;
        di4Var.j = 3;
        return new vg4(new li4(0L, di4Var.a()), false, p4cVar);
    }

    public static vg4 b(long j, long j2, p4c p4cVar) {
        di4 di4Var = new di4();
        di4Var.a = j;
        di4Var.f = Collections.singletonList(fi4.e);
        di4Var.r = j2;
        di4Var.k = ji4.b;
        return new vg4(new li4(0L, di4Var.a()), false, p4cVar);
    }

    public final String A(String str) {
        ki4 ki4Var = this.a.b;
        if (!I()) {
            if (!this.f) {
                str = null;
            }
            if (!ch3.r(str)) {
                return str;
            }
            String strD = vs0.d(ki4Var.c, us0.c, rs0.a);
            if (!ch3.r(strD)) {
                return strD;
            }
            if (!ch3.r(ki4Var.b)) {
                return ki4Var.b;
            }
        }
        return null;
    }

    public final boolean B() {
        int i = this.a.b.j;
        if (i == 0) {
            i = 1;
        }
        return i == 1;
    }

    public final boolean C() {
        int i = this.a.b.j;
        if (i == 0) {
            i = 1;
        }
        return i == 3;
    }

    public final boolean D() {
        return this.a.b.i == ii4.a;
    }

    public final boolean E() {
        return this.a.b.z.h();
    }

    public final boolean F() {
        return (this.a.b.z.b & 32) != 0;
    }

    public final boolean G() {
        return (this.a.b.z.b & 1) != 0;
    }

    public final boolean H() {
        return this.a.b.z.j();
    }

    public final boolean I() {
        return B() && this.a.b.a();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return k().toLowerCase().compareTo(((vg4) obj).k().toLowerCase());
    }

    public final boolean h() {
        li4 li4Var = this.a;
        return li4Var.a != 0 && li4Var.b.k == ji4.a;
    }

    public final String i() {
        return this.a.b.w;
    }

    public final String k() {
        String strA = null;
        if (this.f) {
            fi4 fi4VarP = p();
            String strA2 = fi4VarP != null ? fi4VarP.a() : null;
            if (ch3.s(strA2)) {
                return strA2;
            }
        }
        boolean zC = C();
        p4c p4cVar = this.g;
        if (zC) {
            return p4cVar.a.getString(R.string.tt_unbind_ok_deleted_user);
        }
        if (I()) {
            return p4cVar.a.getString(R.string.tt_contact_name_unknown);
        }
        for (fi4 fi4Var : this.a.b.f) {
            if (!fi4Var.equals(fi4.e)) {
                strA = fi4Var.a();
                if (ch3.s(strA)) {
                    return strA;
                }
            }
        }
        return ch3.r(strA) ? p4cVar.a.getString(R.string.tt_contact_name_unknown) : strA;
    }

    public final String m() {
        fi4 fi4VarP;
        if (this.f && (fi4VarP = p()) != null) {
            String str = fi4VarP.a;
            if (ch3.s(str)) {
                return str;
            }
        }
        boolean zC = C();
        p4c p4cVar = this.g;
        if (zC) {
            return p4cVar.a.getString(R.string.tt_unbind_ok_deleted_user);
        }
        List list = this.a.b.f;
        return list.isEmpty() ? p4cVar.a.getString(R.string.tt_contact_name_unknown) : ((fi4) list.get(0)).a;
    }

    public final String n() {
        if (!this.f) {
            if (C()) {
                return null;
            }
            List list = this.a.b.f;
            if (list.isEmpty()) {
                return null;
            }
            return ((fi4) list.get(0)).b;
        }
        fi4 fi4VarP = p();
        if (fi4VarP == null) {
            return null;
        }
        String str = fi4VarP.b;
        if (ch3.s(str)) {
            return str;
        }
        return null;
    }

    public final String o() {
        return this.a.b.o;
    }

    public final fi4 p() {
        Object next;
        List list = this.a.b.f;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                try {
                } catch (Throwable th) {
                    qr7.o(th);
                    return null;
                }
            } while (((fi4) next).c != ei4.c);
        } else {
            next = null;
            break;
        }
        fi4 fi4Var = (fi4) next;
        if (fi4Var == null || ch3.r(fi4Var.a().trim())) {
            return null;
        }
        return fi4Var;
    }

    public final List q() {
        return this.a.b.f;
    }

    public final String r() {
        String strB = xoh.b(this.a.b.o);
        return !ch3.r(strB) ? strB : "";
    }

    public final List s() {
        return this.a.b.x;
    }

    public final CharSequence t(p4c p4cVar) {
        if (this.b == null) {
            this.b = p4cVar.k.c(0, k());
        }
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact{id=");
        li4 li4Var = this.a;
        sb.append(li4Var.a);
        sb.append(", data=");
        sb.append(li4Var.b);
        sb.append('}');
        return sb.toString();
    }

    public final CharSequence u() {
        if (this.d == null) {
            Pattern pattern = m3c.a;
            this.d = m3c.b(m(), n());
        }
        return this.d;
    }

    public final long v() {
        return this.a.b.a;
    }

    public final long w() {
        return this.a.b.h;
    }

    public final String x(int i) {
        qyj.i(i > 0);
        if (I()) {
            return null;
        }
        String strA = vs0.a(this.a.b.c, vs0.c(i));
        if (ch3.r(strA)) {
            return null;
        }
        return strA;
    }

    public final String y(ts0 ts0Var) {
        qyj.h("size not contains: " + ts0Var, xw3.M0(vs0.n, ts0Var) >= 0 || xw3.M0(vs0.o, ts0Var) >= 0);
        return vs0.a(this.a.b.c, ts0Var);
    }

    public final String z(us0 us0Var) {
        if (I()) {
            return null;
        }
        String strD = vs0.d(this.a.b.c, us0Var, rs0.a);
        if (ch3.r(strD)) {
            return null;
        }
        return strD;
    }
}
