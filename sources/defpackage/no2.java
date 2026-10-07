package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class no2 extends qo2 {
    public final nmc h = new nmc();
    public final mo2 i = new mo2();
    public int j = -1;
    public final int k;
    public final lo2[] l;
    public lo2 m;
    public List n;
    public List o;
    public mo2 p;
    public int q;

    public no2(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = qu3.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new lo2[8];
        int i2 = 0;
        while (true) {
            lo2[] lo2VarArr = this.l;
            if (i2 >= 8) {
                this.m = lo2VarArr[0];
                return;
            } else {
                lo2VarArr[i2] = new lo2();
                i2++;
            }
        }
    }

    @Override // defpackage.qo2
    public final ft0 f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new ft0(list);
    }

    @Override // defpackage.qo2, defpackage.s55
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // defpackage.qo2
    public final void g(oo2 oo2Var) {
        ByteBuffer byteBuffer = oo2Var.d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        nmc nmcVar = this.h;
        nmcVar.L(iLimit, bArrArray);
        while (nmcVar.a() >= 3) {
            int iA = nmcVar.A();
            int i = iA & 3;
            boolean z = (iA & 4) == 4;
            byte bA = (byte) nmcVar.A();
            byte bA2 = (byte) nmcVar.A();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (bA & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            lvb.G0("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bA & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        mo2 mo2Var = new mo2(i2, i4);
                        this.p = mo2Var;
                        byte[] bArr = mo2Var.b;
                        mo2Var.e = 1;
                        bArr[0] = bA2;
                    } else {
                        lvb.R(i == 2);
                        mo2 mo2Var2 = this.p;
                        if (mo2Var2 == null) {
                            lvb.k0("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = mo2Var2.b;
                            int i5 = mo2Var2.e;
                            int i6 = i5 + 1;
                            mo2Var2.e = i6;
                            bArr2[i5] = bA;
                            mo2Var2.e = i5 + 2;
                            bArr2[i6] = bA2;
                        }
                    }
                    mo2 mo2Var3 = this.p;
                    if (mo2Var3.e == (mo2Var3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // defpackage.qo2
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x053d  */
    public final void j() {
        char c;
        boolean z;
        mo2 mo2Var = this.p;
        if (mo2Var == null) {
            return;
        }
        int i = 2;
        if (mo2Var.e != (mo2Var.d * 2) - 1) {
            lvb.g0("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        mo2 mo2Var2 = this.p;
        byte[] bArr = mo2Var2.b;
        int i2 = mo2Var2.e;
        mo2 mo2Var3 = this.i;
        mo2Var3.o(i2, bArr);
        boolean z2 = false;
        while (mo2Var3.b() > 0) {
            int i3 = 3;
            int i4 = mo2Var3.i(3);
            int i5 = mo2Var3.i(5);
            if (i4 == 7) {
                mo2Var3.t(i);
                i4 = mo2Var3.i(6);
                if (i4 < 7) {
                    qt4.y(i4, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (i5 == 0) {
                if (i4 != 0) {
                    lvb.G0("Cea708Decoder", "serviceNumber is non-zero (" + i4 + ") when blockSize is 0");
                }
                if (z2) {
                    this.n = k();
                }
                this.p = null;
            }
            if (i4 != this.k) {
                mo2Var3.u(i5);
            } else {
                int iG = (i5 * 8) + mo2Var3.g();
                while (mo2Var3.g() < iG) {
                    int i6 = mo2Var3.i(8);
                    if (i6 != 16) {
                        if (i6 <= 31) {
                            if (i6 != 0) {
                                if (i6 == i3) {
                                    this.n = k();
                                } else if (i6 != 8) {
                                    switch (i6) {
                                        case 12:
                                            l();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i6 >= 17 && i6 <= 23) {
                                                lvb.G0("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i6);
                                                mo2Var3.t(8);
                                            } else if (i6 < 24 || i6 > 31) {
                                                qt4.y(i6, "Invalid C0 command: ", "Cea708Decoder");
                                            } else {
                                                lvb.G0("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i6);
                                                mo2Var3.t(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (i6 <= 127) {
                            lo2 lo2Var = this.m;
                            if (i6 == 127) {
                                lo2Var.a((char) 9835);
                            } else {
                                lo2Var.a((char) (i6 & 255));
                            }
                            z2 = true;
                        } else {
                            if (i6 <= 159) {
                                lo2[] lo2VarArr = this.l;
                                switch (i6) {
                                    case np0.m /* 128 */:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z = true;
                                        int i7 = i6 - 128;
                                        if (this.q != i7) {
                                            this.q = i7;
                                            this.m = lo2VarArr[i7];
                                        }
                                        break;
                                    case 136:
                                        z = true;
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (mo2Var3.h()) {
                                                lo2 lo2Var2 = lo2VarArr[8 - i8];
                                                lo2Var2.a.clear();
                                                lo2Var2.b.clear();
                                                lo2Var2.o = -1;
                                                lo2Var2.p = -1;
                                                lo2Var2.q = -1;
                                                lo2Var2.s = -1;
                                                lo2Var2.u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (mo2Var3.h()) {
                                                lo2VarArr[8 - i9].d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 138:
                                        for (int i10 = 1; i10 <= 8; i10++) {
                                            if (mo2Var3.h()) {
                                                lo2VarArr[8 - i10].d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 139:
                                        for (int i11 = 1; i11 <= 8; i11++) {
                                            if (mo2Var3.h()) {
                                                lo2 lo2Var3 = lo2VarArr[8 - i11];
                                                lo2Var3.d = !lo2Var3.d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 140:
                                        for (int i12 = 1; i12 <= 8; i12++) {
                                            if (mo2Var3.h()) {
                                                lo2VarArr[8 - i12].d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 141:
                                        mo2Var3.t(8);
                                        z = true;
                                        break;
                                    case 142:
                                        z = true;
                                        break;
                                    case 143:
                                        l();
                                        z = true;
                                        break;
                                    case 144:
                                        int i13 = i;
                                        if (this.m.c) {
                                            mo2Var3.i(4);
                                            mo2Var3.i(i13);
                                            mo2Var3.i(i13);
                                            boolean zH = mo2Var3.h();
                                            boolean zH2 = mo2Var3.h();
                                            i3 = 3;
                                            mo2Var3.i(3);
                                            mo2Var3.i(3);
                                            this.m.e(zH, zH2);
                                            z = true;
                                        } else {
                                            mo2Var3.t(16);
                                            z = true;
                                            i3 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.m.c) {
                                            int iC = lo2.c(mo2Var3.i(2), mo2Var3.i(2), mo2Var3.i(2), mo2Var3.i(2));
                                            int iC2 = lo2.c(mo2Var3.i(2), mo2Var3.i(2), mo2Var3.i(2), mo2Var3.i(2));
                                            mo2Var3.t(2);
                                            lo2.c(mo2Var3.i(2), mo2Var3.i(2), mo2Var3.i(2), 0);
                                            this.m.f(iC, iC2);
                                        } else {
                                            mo2Var3.t(24);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 146:
                                        if (this.m.c) {
                                            mo2Var3.t(4);
                                            int i14 = mo2Var3.i(4);
                                            mo2Var3.t(2);
                                            mo2Var3.i(6);
                                            lo2 lo2Var4 = this.m;
                                            if (lo2Var4.u != i14) {
                                                lo2Var4.a('\n');
                                            }
                                            lo2Var4.u = i14;
                                        } else {
                                            mo2Var3.t(16);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        qt4.y(i6, "Invalid C1 command: ", "Cea708Decoder");
                                        z = true;
                                        break;
                                    case 151:
                                        if (this.m.c) {
                                            int iC3 = lo2.c(mo2Var3.i(2), mo2Var3.i(2), mo2Var3.i(2), mo2Var3.i(2));
                                            mo2Var3.i(2);
                                            lo2.c(mo2Var3.i(2), mo2Var3.i(2), mo2Var3.i(2), 0);
                                            mo2Var3.h();
                                            mo2Var3.h();
                                            mo2Var3.i(2);
                                            mo2Var3.i(2);
                                            int i15 = mo2Var3.i(2);
                                            mo2Var3.t(8);
                                            lo2 lo2Var5 = this.m;
                                            lo2Var5.n = iC3;
                                            lo2Var5.k = i15;
                                        } else {
                                            mo2Var3.t(32);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i16 = i6 - 152;
                                        lo2 lo2Var6 = lo2VarArr[i16];
                                        mo2Var3.t(i);
                                        boolean zH3 = mo2Var3.h();
                                        mo2Var3.t(i);
                                        int i17 = mo2Var3.i(i3);
                                        boolean zH4 = mo2Var3.h();
                                        int i18 = mo2Var3.i(7);
                                        int i19 = mo2Var3.i(8);
                                        int i20 = mo2Var3.i(4);
                                        int i21 = mo2Var3.i(4);
                                        mo2Var3.t(i);
                                        mo2Var3.t(6);
                                        mo2Var3.t(i);
                                        int i22 = mo2Var3.i(3);
                                        int i23 = mo2Var3.i(3);
                                        ArrayList arrayList = lo2Var6.a;
                                        lo2Var6.c = true;
                                        lo2Var6.d = zH3;
                                        lo2Var6.e = i17;
                                        lo2Var6.f = zH4;
                                        lo2Var6.g = i18;
                                        lo2Var6.h = i19;
                                        lo2Var6.i = i20;
                                        int i24 = i21 + 1;
                                        if (lo2Var6.j != i24) {
                                            lo2Var6.j = i24;
                                            while (true) {
                                                if (arrayList.size() >= lo2Var6.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i22 != 0 && lo2Var6.l != i22) {
                                            lo2Var6.l = i22;
                                            int i25 = i22 - 1;
                                            int i26 = lo2.B[i25];
                                            boolean z3 = lo2.A[i25];
                                            int i27 = lo2.y[i25];
                                            int i28 = lo2.z[i25];
                                            int i29 = lo2.x[i25];
                                            lo2Var6.n = i26;
                                            lo2Var6.k = i29;
                                        }
                                        if (i23 != 0 && lo2Var6.m != i23) {
                                            lo2Var6.m = i23;
                                            int i30 = i23 - 1;
                                            int i31 = lo2.D[i30];
                                            int i32 = lo2.C[i30];
                                            lo2Var6.e(false, false);
                                            lo2Var6.f(lo2.v, lo2.E[i30]);
                                        }
                                        if (this.q != i16) {
                                            this.q = i16;
                                            this.m = lo2VarArr[i16];
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                }
                            } else {
                                z = true;
                                if (i6 <= 255) {
                                    this.m.a((char) (i6 & 255));
                                } else {
                                    qt4.y(i6, "Invalid base command: ", "Cea708Decoder");
                                }
                                i = 2;
                                c = 7;
                            }
                            z2 = z;
                            i = 2;
                            c = 7;
                        }
                        c = 7;
                    } else {
                        int i33 = mo2Var3.i(8);
                        if (i33 <= 31) {
                            c = 7;
                            if (i33 > 7) {
                                if (i33 <= 15) {
                                    mo2Var3.t(8);
                                } else if (i33 <= 23) {
                                    mo2Var3.t(16);
                                } else if (i33 <= 31) {
                                    mo2Var3.t(24);
                                }
                            }
                        } else {
                            c = 7;
                            if (i33 <= 127) {
                                if (i33 == 32) {
                                    this.m.a(' ');
                                } else if (i33 == 33) {
                                    this.m.a((char) 160);
                                } else if (i33 == 37) {
                                    this.m.a((char) 8230);
                                } else if (i33 == 42) {
                                    this.m.a((char) 352);
                                } else if (i33 == 44) {
                                    this.m.a((char) 338);
                                } else if (i33 == 63) {
                                    this.m.a((char) 376);
                                } else if (i33 == 57) {
                                    this.m.a((char) 8482);
                                } else if (i33 == 58) {
                                    this.m.a((char) 353);
                                } else if (i33 == 60) {
                                    this.m.a((char) 339);
                                } else if (i33 != 61) {
                                    switch (i33) {
                                        case 48:
                                            this.m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (i33) {
                                                case 118:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    qt4.y(i33, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                i = 2;
                                z2 = true;
                            } else if (i33 > 159) {
                                i = 2;
                                if (i33 <= 255) {
                                    if (i33 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        qt4.y(i33, "Invalid G3 character: ", "Cea708Decoder");
                                        this.m.a('_');
                                    }
                                    z2 = true;
                                } else {
                                    qt4.y(i33, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (i33 <= 135) {
                                mo2Var3.t(32);
                            } else if (i33 <= 143) {
                                mo2Var3.t(40);
                            } else if (i33 <= 159) {
                                i = 2;
                                mo2Var3.t(2);
                                mo2Var3.t(mo2Var3.i(6) * 8);
                            }
                        }
                        i = 2;
                    }
                    i = i;
                }
            }
        }
        if (z2) {
            this.n = k();
        }
        this.p = null;
    }

    public final List k() {
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            lo2[] lo2VarArr = this.l;
            lo2 lo2Var = lo2VarArr[i];
            if (lo2Var.c && (!lo2Var.a.isEmpty() || lo2Var.b.length() != 0)) {
                lo2 lo2Var2 = lo2VarArr[i];
                if (lo2Var2.d) {
                    ArrayList arrayList2 = lo2Var2.a;
                    ko2 ko2Var = null;
                    if (lo2Var2.c && (!arrayList2.isEmpty() || lo2Var2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) lo2Var2.b());
                        int i3 = lo2Var2.k;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                qr7.p(lo2Var2.k, "Unexpected justification value: ");
                                return null;
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        boolean z = lo2Var2.f;
                        int i4 = lo2Var2.h;
                        int i5 = lo2Var2.g;
                        if (z) {
                            f = i4 / 99.0f;
                            f2 = i5 / 99.0f;
                        } else {
                            f = i4 / 209.0f;
                            f2 = i5 / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i6 = lo2Var2.i;
                        int i7 = i6 / 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = i6 % 3;
                        int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : 2;
                        int i11 = lo2Var2.n;
                        ko2Var = new ko2(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 != lo2.w, i11, lo2Var2.e);
                    }
                    if (ko2Var != null) {
                        arrayList.add(ko2Var);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, ko2.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((ko2) arrayList.get(i12)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
