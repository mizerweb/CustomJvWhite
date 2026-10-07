package androidx.datastore.preferences.protobuf;

import defpackage.bp5;
import defpackage.c71;
import defpackage.di9;
import defpackage.fm9;
import defpackage.l3f;
import defpackage.o8e;
import defpackage.ore;
import defpackage.ox6;
import defpackage.pwd;
import defpackage.rxj;
import defpackage.tu3;
import defpackage.wj8;
import defpackage.xh6;
import defpackage.xi8;
import defpackage.xtj;
import defpackage.zy8;
import defpackage.zz0;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements o8e {
    public final tu3 a;
    public int b;
    public int c;
    public int d = 0;

    public c(tu3 tu3Var) {
        Charset charset = wj8.a;
        this.a = tu3Var;
        tu3Var.b = this;
    }

    public static void T(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public static void U(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    @Override // defpackage.o8e
    public final long A() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(0);
        return this.a.w();
    }

    @Override // defpackage.o8e
    public final String B() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(2);
        return this.a.x();
    }

    @Override // defpackage.o8e
    public final int C() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.z();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // defpackage.o8e
    public final Object D(l3f l3fVar, xh6 xh6Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(2);
        return O(l3fVar, xh6Var);
    }

    @Override // defpackage.o8e
    public final void E(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(list, false);
    }

    @Override // defpackage.o8e
    public final void F(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof ox6) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 2) {
            int iA = tu3Var.A();
            T(iA);
            int iC = tu3Var.c() + iA;
            do {
                list.add(Float.valueOf(tu3Var.q()));
            } while (tu3Var.c() < iC);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Float.valueOf(tu3Var.q()));
            if (tu3Var.d()) {
                return;
            } else {
                iZ = tu3Var.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    @Override // defpackage.o8e
    public final int G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(5);
        return this.a.t();
    }

    @Override // defpackage.o8e
    public final void H(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZ;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(q());
            tu3 tu3Var = this.a;
            if (tu3Var.d()) {
                return;
            } else {
                iZ = tu3Var.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    @Override // defpackage.o8e
    public final void I(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof bp5) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 1) {
            do {
                list.add(Double.valueOf(tu3Var.m()));
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iA = tu3Var.A();
        U(iA);
        int iC = tu3Var.c() + iA;
        do {
            list.add(Double.valueOf(tu3Var.m()));
        } while (tu3Var.c() < iC);
    }

    @Override // defpackage.o8e
    public final void J(List list, l3f l3fVar, xh6 xh6Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZ;
        int i = this.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(N(l3fVar, xh6Var));
            tu3 tu3Var = this.a;
            if (tu3Var.d() || this.d != 0) {
                return;
            } else {
                iZ = tu3Var.z();
            }
        } while (iZ == i);
        this.d = iZ;
    }

    @Override // defpackage.o8e
    public final long K() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(0);
        return this.a.s();
    }

    @Override // defpackage.o8e
    public final String L() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(2);
        return this.a.y();
    }

    public final Object M(rxj rxjVar, Class cls, xh6 xh6Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        switch (rxjVar.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(K());
            case 3:
                return Long.valueOf(u());
            case 4:
                return Integer.valueOf(r());
            case 5:
                return Long.valueOf(a());
            case 6:
                return Integer.valueOf(w());
            case 7:
                return Boolean.valueOf(d());
            case 8:
                return L();
            case 9:
            default:
                ore.q("unsupported field type.");
                return null;
            case 10:
                R(2);
                return O(pwd.c.a(cls), xh6Var);
            case 11:
                return q();
            case 12:
                return Integer.valueOf(h());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Integer.valueOf(G());
            case 15:
                return Long.valueOf(f());
            case 16:
                return Integer.valueOf(m());
            case 17:
                return Long.valueOf(A());
        }
    }

    public final Object N(l3f l3fVar, xh6 xh6Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object objE = l3fVar.e();
            l3fVar.d(objE, this, xh6Var);
            l3fVar.a(objE);
            if (this.b != this.c) {
                throw InvalidProtocolBufferException.e();
            }
            this.c = i;
            return objE;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final Object O(l3f l3fVar, xh6 xh6Var) throws InvalidProtocolBufferException {
        tu3 tu3Var = this.a;
        int iA = tu3Var.A();
        if (tu3Var.a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iJ = tu3Var.j(iA);
        Object objE = l3fVar.e();
        tu3Var.a++;
        l3fVar.d(objE, this, xh6Var);
        l3fVar.a(objE);
        tu3Var.a(0);
        tu3Var.a--;
        tu3Var.i(iJ);
        return objE;
    }

    public final void P(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZ;
        int iZ2;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        boolean z2 = list instanceof zy8;
        tu3 tu3Var = this.a;
        if (!z2 || z) {
            do {
                list.add(z ? L() : B());
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        zy8 zy8Var = (zy8) list;
        do {
            zy8Var.h(q());
            if (tu3Var.d()) {
                return;
            } else {
                iZ2 = tu3Var.z();
            }
        } while (iZ2 == this.b);
        this.d = iZ2;
    }

    public final void Q(int i) throws InvalidProtocolBufferException {
        if (this.a.c() != i) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final void R(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean S() {
        int i;
        tu3 tu3Var = this.a;
        if (tu3Var.d() || (i = this.b) == this.c) {
            return false;
        }
        return tu3Var.C(i);
    }

    @Override // defpackage.o8e
    public final long a() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(1);
        return this.a.p();
    }

    @Override // defpackage.o8e
    public final void b(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof xi8) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 2) {
            int iA = tu3Var.A();
            T(iA);
            int iC = tu3Var.c() + iA;
            do {
                list.add(Integer.valueOf(tu3Var.t()));
            } while (tu3Var.c() < iC);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Integer.valueOf(tu3Var.t()));
            if (tu3Var.d()) {
                return;
            } else {
                iZ = tu3Var.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    @Override // defpackage.o8e
    public final void c(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof di9) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(tu3Var.w()));
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC = tu3Var.c() + tu3Var.A();
        do {
            list.add(Long.valueOf(tu3Var.w()));
        } while (tu3Var.c() < iC);
        Q(iC);
    }

    @Override // defpackage.o8e
    public final boolean d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(0);
        return this.a.k();
    }

    @Override // defpackage.o8e
    public final void e(List list, l3f l3fVar, xh6 xh6Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZ;
        int i = this.b;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(O(l3fVar, xh6Var));
            tu3 tu3Var = this.a;
            if (tu3Var.d() || this.d != 0) {
                return;
            } else {
                iZ = tu3Var.z();
            }
        } while (iZ == i);
        this.d = iZ;
    }

    @Override // defpackage.o8e
    public final long f() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(1);
        return this.a.u();
    }

    @Override // defpackage.o8e
    public final void g(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof di9) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(tu3Var.B()));
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC = tu3Var.c() + tu3Var.A();
        do {
            list.add(Long.valueOf(tu3Var.B()));
        } while (tu3Var.c() < iC);
        Q(iC);
    }

    @Override // defpackage.o8e
    public final int getTag() {
        return this.b;
    }

    @Override // defpackage.o8e
    public final int h() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(0);
        return this.a.A();
    }

    @Override // defpackage.o8e
    public final void i(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof di9) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(tu3Var.s()));
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC = tu3Var.c() + tu3Var.A();
        do {
            list.add(Long.valueOf(tu3Var.s()));
        } while (tu3Var.c() < iC);
        Q(iC);
    }

    @Override // defpackage.o8e
    public final void j(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof xi8) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(tu3Var.n()));
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC = tu3Var.c() + tu3Var.A();
        do {
            list.add(Integer.valueOf(tu3Var.n()));
        } while (tu3Var.c() < iC);
        Q(iC);
    }

    @Override // defpackage.o8e
    public final void k(fm9 fm9Var, xtj xtjVar, xh6 xh6Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(2);
        tu3 tu3Var = this.a;
        int iJ = tu3Var.j(tu3Var.A());
        Object obj = xtjVar.d;
        Object objM = "";
        Object objM2 = obj;
        while (true) {
            try {
                int iC = C();
                if (iC == Integer.MAX_VALUE || tu3Var.d()) {
                    break;
                }
                if (iC == 1) {
                    objM = M((rxj) xtjVar.b, null, null);
                } else if (iC != 2) {
                    try {
                        if (!S()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!S()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM2 = M((rxj) xtjVar.c, obj.getClass(), xh6Var);
                }
            } catch (Throwable th) {
                tu3Var.i(iJ);
                throw th;
            }
        }
        fm9Var.put(objM, objM2);
        tu3Var.i(iJ);
    }

    @Override // defpackage.o8e
    public final int l() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(0);
        return this.a.n();
    }

    @Override // defpackage.o8e
    public final int m() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(0);
        return this.a.v();
    }

    @Override // defpackage.o8e
    public final void n(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof zz0) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(tu3Var.k()));
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC = tu3Var.c() + tu3Var.A();
        do {
            list.add(Boolean.valueOf(tu3Var.k()));
        } while (tu3Var.c() < iC);
        Q(iC);
    }

    @Override // defpackage.o8e
    public final Object o(l3f l3fVar, xh6 xh6Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(3);
        return N(l3fVar, xh6Var);
    }

    @Override // defpackage.o8e
    public final void p(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(list, true);
    }

    @Override // defpackage.o8e
    public final c71 q() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(2);
        return this.a.l();
    }

    @Override // defpackage.o8e
    public final int r() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(0);
        return this.a.r();
    }

    @Override // defpackage.o8e
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(1);
        return this.a.m();
    }

    @Override // defpackage.o8e
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(5);
        return this.a.q();
    }

    @Override // defpackage.o8e
    public final void s(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof di9) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 1) {
            do {
                list.add(Long.valueOf(tu3Var.p()));
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iA = tu3Var.A();
        U(iA);
        int iC = tu3Var.c() + iA;
        do {
            list.add(Long.valueOf(tu3Var.p()));
        } while (tu3Var.c() < iC);
    }

    @Override // defpackage.o8e
    public final void t(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof xi8) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(tu3Var.v()));
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC = tu3Var.c() + tu3Var.A();
        do {
            list.add(Integer.valueOf(tu3Var.v()));
        } while (tu3Var.c() < iC);
        Q(iC);
    }

    @Override // defpackage.o8e
    public final long u() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(0);
        return this.a.B();
    }

    @Override // defpackage.o8e
    public final void v(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof xi8) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(tu3Var.A()));
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC = tu3Var.c() + tu3Var.A();
        do {
            list.add(Integer.valueOf(tu3Var.A()));
        } while (tu3Var.c() < iC);
        Q(iC);
    }

    @Override // defpackage.o8e
    public final int w() throws InvalidProtocolBufferException.InvalidWireTypeException {
        R(5);
        return this.a.o();
    }

    @Override // defpackage.o8e
    public final void x(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof di9) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 1) {
            do {
                list.add(Long.valueOf(tu3Var.u()));
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iA = tu3Var.A();
        U(iA);
        int iC = tu3Var.c() + iA;
        do {
            list.add(Long.valueOf(tu3Var.u()));
        } while (tu3Var.c() < iC);
    }

    @Override // defpackage.o8e
    public final void y(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof xi8) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(tu3Var.r()));
                if (tu3Var.d()) {
                    return;
                } else {
                    iZ = tu3Var.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC = tu3Var.c() + tu3Var.A();
        do {
            list.add(Integer.valueOf(tu3Var.r()));
        } while (tu3Var.c() < iC);
        Q(iC);
    }

    @Override // defpackage.o8e
    public final void z(List list) throws InvalidProtocolBufferException {
        int iZ;
        if (list instanceof xi8) {
            ore.m();
            return;
        }
        int i = this.b & 7;
        tu3 tu3Var = this.a;
        if (i == 2) {
            int iA = tu3Var.A();
            T(iA);
            int iC = tu3Var.c() + iA;
            do {
                list.add(Integer.valueOf(tu3Var.o()));
            } while (tu3Var.c() < iC);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Integer.valueOf(tu3Var.o()));
            if (tu3Var.d()) {
                return;
            } else {
                iZ = tu3Var.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }
}
