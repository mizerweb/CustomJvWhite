package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.vk.push.core.base.AidlException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vf8 extends sia {
    public static volatile vf8[] u;
    public long a = 0;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public long f = 0;
    public int g = 0;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public long l = 0;
    public long m = 0;
    public String n = "";
    public byte[] o = sb8.i;
    public String p = "";
    public ag8[] q = ag8.a();
    public long r = 0;
    public String s = "";
    public boolean t = false;

    public vf8() {
        this.cachedSize = -1;
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        long j = this.a;
        int i = 0;
        int iH = j != 0 ? uu3.h(1, j) : 0;
        if (!this.b.equals("")) {
            iH += uu3.l(2, this.b);
        }
        if (!this.c.equals("")) {
            iH += uu3.l(3, this.c);
        }
        if (!this.d.equals("")) {
            iH += uu3.l(4, this.d);
        }
        if (!this.e.equals("")) {
            iH += uu3.l(5, this.e);
        }
        long j2 = this.f;
        if (j2 != 0) {
            iH += uu3.k(j2) + uu3.m(6);
        }
        int i2 = this.g;
        if (i2 != 0) {
            iH += uu3.f(7, i2);
        }
        int i3 = this.h;
        if (i3 != 0) {
            iH += uu3.f(8, i3);
        }
        if (this.i) {
            iH += uu3.a(9);
        }
        if (this.j) {
            iH += uu3.a(10);
        }
        if (this.k) {
            iH += uu3.a(11);
        }
        long j3 = this.l;
        if (j3 != 0) {
            iH += uu3.k(j3) + uu3.m(12);
        }
        long j4 = this.m;
        if (j4 != 0) {
            iH += uu3.h(13, j4);
        }
        if (!this.n.equals("")) {
            iH += uu3.l(14, this.n);
        }
        if (!Arrays.equals(this.o, sb8.i)) {
            iH += uu3.b(15, this.o);
        }
        if (!this.p.equals("")) {
            iH += uu3.l(16, this.p);
        }
        ag8[] ag8VarArr = this.q;
        if (ag8VarArr != null && ag8VarArr.length > 0) {
            while (true) {
                ag8[] ag8VarArr2 = this.q;
                if (i >= ag8VarArr2.length) {
                    break;
                }
                ag8 ag8Var = ag8VarArr2[i];
                if (ag8Var != null) {
                    iH = uu3.i(17, ag8Var) + iH;
                }
                i++;
            }
        }
        long j5 = this.r;
        if (j5 != 0) {
            iH += uu3.h(18, j5);
        }
        if (!this.s.equals("")) {
            iH += uu3.l(19, this.s);
        }
        return this.t ? uu3.a(20) + iH : iH;
    }

    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = su3Var.s();
            switch (iS) {
                case 0:
                    break;
                case 8:
                    this.a = su3Var.q();
                    break;
                case 18:
                    this.b = su3Var.r();
                    break;
                case 26:
                    this.c = su3Var.r();
                    break;
                case 34:
                    this.d = su3Var.r();
                    break;
                case 42:
                    this.e = su3Var.r();
                    break;
                case 48:
                    this.f = su3Var.q();
                    break;
                case 56:
                    this.g = su3Var.p();
                    break;
                case 64:
                    this.h = su3Var.p();
                    break;
                case 72:
                    this.i = su3Var.f();
                    break;
                case 80:
                    this.j = su3Var.f();
                    break;
                case 88:
                    this.k = su3Var.f();
                    break;
                case 96:
                    this.l = su3Var.q();
                    break;
                case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                    this.m = su3Var.q();
                    break;
                case 114:
                    this.n = su3Var.r();
                    break;
                case 122:
                    this.o = su3Var.g();
                    break;
                case 130:
                    this.p = su3Var.r();
                    break;
                case 138:
                    int I = sb8.I(su3Var, 138);
                    ag8[] ag8VarArr = this.q;
                    int length = ag8VarArr == null ? 0 : ag8VarArr.length;
                    int i = I + length;
                    ag8[] ag8VarArr2 = new ag8[i];
                    if (length != 0) {
                        System.arraycopy(ag8VarArr, 0, ag8VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        ag8 ag8Var = new ag8();
                        ag8VarArr2[length] = ag8Var;
                        su3Var.j(ag8Var);
                        su3Var.s();
                        length++;
                    }
                    ag8 ag8Var2 = new ag8();
                    ag8VarArr2[length] = ag8Var2;
                    su3Var.j(ag8Var2);
                    this.q = ag8VarArr2;
                    break;
                case 144:
                    this.r = su3Var.q();
                    break;
                case 154:
                    this.s = su3Var.r();
                    break;
                case 160:
                    this.t = su3Var.f();
                    break;
                default:
                    if (!su3Var.u(iS)) {
                    }
                    break;
            }
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        long j = this.a;
        if (j != 0) {
            uu3Var.x(1, j);
        }
        if (!this.b.equals("")) {
            uu3Var.E(2, this.b);
        }
        if (!this.c.equals("")) {
            uu3Var.E(3, this.c);
        }
        if (!this.d.equals("")) {
            uu3Var.E(4, this.d);
        }
        if (!this.e.equals("")) {
            uu3Var.E(5, this.e);
        }
        long j2 = this.f;
        int i = 0;
        if (j2 != 0) {
            uu3Var.F(6, 0);
            uu3Var.D(j2);
        }
        int i2 = this.g;
        if (i2 != 0) {
            uu3Var.w(7, i2);
        }
        int i3 = this.h;
        if (i3 != 0) {
            uu3Var.w(8, i3);
        }
        boolean z = this.i;
        if (z) {
            uu3Var.r(9, z);
        }
        boolean z2 = this.j;
        if (z2) {
            uu3Var.r(10, z2);
        }
        boolean z3 = this.k;
        if (z3) {
            uu3Var.r(11, z3);
        }
        long j3 = this.l;
        if (j3 != 0) {
            uu3Var.F(12, 0);
            uu3Var.D(j3);
        }
        long j4 = this.m;
        if (j4 != 0) {
            uu3Var.x(13, j4);
        }
        if (!this.n.equals("")) {
            uu3Var.E(14, this.n);
        }
        if (!Arrays.equals(this.o, sb8.i)) {
            uu3Var.s(15, this.o);
        }
        if (!this.p.equals("")) {
            uu3Var.E(16, this.p);
        }
        ag8[] ag8VarArr = this.q;
        if (ag8VarArr != null && ag8VarArr.length > 0) {
            while (true) {
                ag8[] ag8VarArr2 = this.q;
                if (i >= ag8VarArr2.length) {
                    break;
                }
                ag8 ag8Var = ag8VarArr2[i];
                if (ag8Var != null) {
                    uu3Var.y(17, ag8Var);
                }
                i++;
            }
        }
        long j5 = this.r;
        if (j5 != 0) {
            uu3Var.x(18, j5);
        }
        if (!this.s.equals("")) {
            uu3Var.E(19, this.s);
        }
        boolean z4 = this.t;
        if (z4) {
            uu3Var.r(20, z4);
        }
    }
}
