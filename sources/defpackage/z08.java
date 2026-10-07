package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class z08 implements Closeable {
    public static final Logger d = Logger.getLogger(n08.class.getName());
    public final y41 a;
    public final y08 b;
    public final d08 c;

    public z08(y41 y41Var) {
        this.a = y41Var;
        y08 y08Var = new y08(y41Var);
        this.b = y08Var;
        this.c = new d08(y08Var);
    }

    public final void A(gb3 gb3Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            qr7.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.a.readByte();
            byte[] bArr = uqi.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.a.readInt() & Integer.MAX_VALUE;
        List listL = l(w1m.b(i - 4, i2, i4), i4, i2, i3);
        w08 w08Var = (w08) gb3Var.c;
        synchronized (w08Var) {
            if (w08Var.y.contains(Integer.valueOf(i5))) {
                w08Var.P(i5, 2);
                return;
            }
            w08Var.y.add(Integer.valueOf(i5));
            w08Var.i.c(new t08(w08Var.c + '[' + i5 + "] onRequest", w08Var, i5, listL), 0L);
        }
    }

    public final boolean b(boolean z, gb3 gb3Var) throws IOException {
        int i;
        boolean z2;
        int i2;
        Object[] array;
        boolean z3 = false;
        try {
            this.a.c0(9L);
            int iT = uqi.t(this.a);
            if (iT > 16384) {
                qr7.k(zo5.h(iT, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i3 = this.a.readByte() & 255;
            byte b = this.a.readByte();
            int i4 = b & 255;
            int i5 = this.a.readInt();
            int i6 = Integer.MAX_VALUE & i5;
            Logger logger = d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(n08.a(true, i6, iT, i3, i4));
            }
            if (z && i3 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = n08.b;
                sb.append(i3 < strArr.length ? strArr[i3] : uqi.i("0x%02x", Integer.valueOf(i3)));
                throw new IOException(sb.toString());
            }
            switch (i3) {
                case 0:
                    g(gb3Var, iT, i4, i6);
                    return true;
                case 1:
                    y(gb3Var, iT, i4, i6);
                    return true;
                case 2:
                    if (iT != 5) {
                        qr7.k(c0a.k(iT, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i6 == 0) {
                        qr7.k("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    y41 y41Var = this.a;
                    y41Var.readInt();
                    y41Var.readByte();
                    return true;
                case 3:
                    if (iT != 4) {
                        qr7.k(c0a.k(iT, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i6 == 0) {
                        qr7.k("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i7 = this.a.readInt();
                    int[] iArrH = qt4.H(14);
                    int length = iArrH.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            i = iArrH[i8];
                            if (qt4.D(i) != i7) {
                                i8++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        qr7.k(zo5.h(i7, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    w08 w08Var = (w08) gb3Var.c;
                    if (i6 != 0 && (i5 & 1) == 0) {
                        w08Var.i.c(new t08(w08Var.c + '[' + i6 + "] onReset", w08Var, i6, i), 0L);
                        return true;
                    }
                    d18 d18VarY = w08Var.y(i6);
                    if (d18VarY != null) {
                        synchronized (d18VarY) {
                            if (d18VarY.m == 0) {
                                d18VarY.m = i;
                                d18VarY.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                case 4:
                    y41 y41Var2 = this.a;
                    if (i6 != 0) {
                        qr7.k("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b & 1) != 0) {
                        if (iT != 0) {
                            qr7.k("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iT % 6 != 0) {
                        qr7.k(zo5.h(iT, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    dqf dqfVar = new dqf();
                    fj8 fj8VarA0 = oc9.a0(oc9.f0(0, iT), 6);
                    int i9 = fj8VarA0.a;
                    int i10 = fj8VarA0.b;
                    int i11 = fj8VarA0.c;
                    if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                        while (true) {
                            short s = y41Var2.readShort();
                            byte[] bArr = uqi.a;
                            int i12 = s & 65535;
                            int i13 = y41Var2.readInt();
                            if (i12 == 2) {
                                z2 = z3;
                                if (i13 != 0 && i13 != 1) {
                                    qr7.k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                    return z2;
                                }
                            } else if (i12 == 3) {
                                z2 = z3;
                                i12 = 4;
                            } else if (i12 == 4) {
                                z2 = z3;
                                if (i13 < 0) {
                                    qr7.k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return z2;
                                }
                                i12 = 7;
                            } else if (i12 != 5) {
                                z2 = z3;
                            } else {
                                z2 = z3;
                                if (i13 < 16384 || i13 > 16777215) {
                                    qr7.k(zo5.h(i13, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                    return z2;
                                }
                            }
                            dqfVar.c(i12, i13);
                            if (i9 != i10) {
                                i9 += i11;
                                z3 = z2;
                            }
                        }
                    }
                    w08 w08Var2 = (w08) gb3Var.c;
                    w08Var2.h.c(new q08(2, gb3Var, dqfVar, zo5.w(new StringBuilder(), w08Var2.c, " applyAndAckSettings")), 0L);
                    return true;
                case 5:
                    A(gb3Var, iT, i4, i6);
                    return true;
                case 6:
                    if (iT != 8) {
                        qr7.k(zo5.h(iT, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i6 != 0) {
                        qr7.k("TYPE_PING streamId != 0");
                        return false;
                    }
                    int i14 = this.a.readInt();
                    int i15 = this.a.readInt();
                    byte b2 = (b & 1) != 0 ? (byte) 1 : (byte) 0;
                    w08 w08Var3 = (w08) gb3Var.c;
                    if (b2 == 0) {
                        w08Var3.h.c(new r08(zo5.w(new StringBuilder(), ((w08) gb3Var.c).c, " ping"), (w08) gb3Var.c, i14, i15, 0), 0L);
                        return true;
                    }
                    synchronized (w08Var3) {
                        try {
                            if (i14 == 1) {
                                w08Var3.l++;
                            } else if (i14 == 2) {
                                w08Var3.n++;
                            } else if (i14 == 3) {
                                w08Var3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iT < 8) {
                        qr7.k(zo5.h(iT, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i6 != 0) {
                        qr7.k("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i16 = this.a.readInt();
                    int i17 = this.a.readInt();
                    int i18 = iT - 8;
                    int[] iArrH2 = qt4.H(14);
                    int length2 = iArrH2.length;
                    int i19 = 0;
                    while (true) {
                        if (i19 < length2) {
                            i2 = iArrH2[i19];
                            if (qt4.D(i2) != i17) {
                                i19++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        qr7.k(zo5.h(i17, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    d71 d71VarF0 = d71.d;
                    if (i18 > 0) {
                        d71VarF0 = this.a.f0(i18);
                    }
                    d71VarF0.a();
                    w08 w08Var4 = (w08) gb3Var.c;
                    synchronized (w08Var4) {
                        array = w08Var4.b.values().toArray(new d18[0]);
                        w08Var4.f = true;
                    }
                    for (d18 d18Var : (d18[]) array) {
                        if (d18Var.a > i16 && d18Var.g()) {
                            synchronized (d18Var) {
                                if (d18Var.m == 0) {
                                    d18Var.m = 8;
                                    d18Var.notifyAll();
                                }
                                break;
                            }
                            ((w08) gb3Var.c).y(d18Var.a);
                        }
                    }
                    return true;
                case 8:
                    if (iT != 4) {
                        qr7.k(zo5.h(iT, "TYPE_WINDOW_UPDATE length !=4: "));
                        return false;
                    }
                    long j = 2147483647L & ((long) this.a.readInt());
                    if (j == 0) {
                        qr7.k("windowSizeIncrement was 0");
                        return false;
                    }
                    w08 w08Var5 = (w08) gb3Var.c;
                    if (i6 == 0) {
                        synchronized (w08Var5) {
                            w08Var5.u += j;
                            w08Var5.notifyAll();
                        }
                        return true;
                    }
                    d18 d18VarG = w08Var5.g(i6);
                    if (d18VarG != null) {
                        synchronized (d18VarG) {
                            d18VarG.f += j;
                            if (j > 0) {
                                d18VarG.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                default:
                    this.a.skip(iT);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final void g(gb3 gb3Var, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            qr7.k("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            qr7.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.a.readByte();
            byte[] bArr = uqi.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iB = w1m.b(i, i2, i4);
        y41 y41Var = this.a;
        w08 w08Var = (w08) gb3Var.c;
        if (i3 != 0 && (i3 & 1) == 0) {
            l31 l31Var = new l31();
            long j = iB;
            y41Var.c0(j);
            y41Var.S(j, l31Var);
            w08Var.i.c(new s08(w08Var.c + '[' + i3 + "] onData", w08Var, i3, l31Var, iB, z3), 0L);
        } else {
            d18 d18VarG = w08Var.g(i3);
            if (d18VarG == null) {
                ((w08) gb3Var.c).P(i3, 2);
                long j2 = iB;
                ((w08) gb3Var.c).I(j2);
                y41Var.skip(j2);
            } else {
                byte[] bArr2 = uqi.a;
                b18 b18Var = d18VarG.i;
                long j3 = iB;
                b18Var.getClass();
                long j4 = j3;
                while (true) {
                    d18 d18Var = b18Var.f;
                    if (j4 <= 0) {
                        byte[] bArr3 = uqi.a;
                        d18Var.b.I(j3);
                        break;
                    }
                    synchronized (d18Var) {
                        z = b18Var.b;
                        z2 = b18Var.d.b + j4 > b18Var.a;
                    }
                    if (z2) {
                        y41Var.skip(j4);
                        b18Var.f.e(4);
                        break;
                    }
                    if (z) {
                        y41Var.skip(j4);
                        break;
                    }
                    long jS = y41Var.S(j4, b18Var.c);
                    if (jS == -1) {
                        c.n();
                        return;
                    }
                    j4 -= jS;
                    d18 d18Var2 = b18Var.f;
                    synchronized (d18Var2) {
                        try {
                            if (b18Var.e) {
                                l31 l31Var2 = b18Var.c;
                                l31Var2.skip(l31Var2.b);
                            } else {
                                l31 l31Var3 = b18Var.d;
                                boolean z4 = l31Var3.b == 0;
                                l31Var3.r0(b18Var.c);
                                if (z4) {
                                    d18Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    d18VarG.i(uqi.b, true);
                }
            }
        }
        this.a.skip(i4);
    }

    public final List l(int i, int i2, int i3, int i4) throws IOException {
        y08 y08Var = this.b;
        y08Var.e = i;
        y08Var.b = i;
        y08Var.f = i2;
        y08Var.c = i3;
        y08Var.d = i4;
        d08 d08Var = this.c;
        u8e u8eVar = d08Var.c;
        ArrayList arrayList = d08Var.b;
        while (!u8eVar.l()) {
            byte b = u8eVar.readByte();
            byte[] bArr = uqi.a;
            int i5 = b & 255;
            if (i5 == 128) {
                qr7.k("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iE = d08Var.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    bu7[] bu7VarArr = f08.a;
                    if (i6 <= bu7VarArr.length - 1) {
                        arrayList.add(bu7VarArr[i6]);
                    }
                }
                int length = d08Var.e + 1 + (i6 - f08.a.length);
                if (length >= 0) {
                    bu7[] bu7VarArr2 = d08Var.d;
                    if (length < bu7VarArr2.length) {
                        arrayList.add(bu7VarArr2[length]);
                    }
                }
                qr7.k(zo5.h(iE, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                bu7[] bu7VarArr3 = f08.a;
                d71 d71VarD = d08Var.d();
                f08.a(d71VarD);
                d08Var.c(new bu7(d71VarD, d08Var.d()));
            } else if ((b & 64) == 64) {
                d08Var.c(new bu7(d08Var.b(d08Var.e(i5, 63) - 1), d08Var.d()));
            } else if ((b & 32) == 32) {
                int iE2 = d08Var.e(i5, 31);
                d08Var.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + d08Var.a);
                }
                int i7 = d08Var.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        a.X0(d08Var.d, null);
                        d08Var.e = d08Var.d.length - 1;
                        d08Var.f = 0;
                        d08Var.g = 0;
                    } else {
                        d08Var.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                bu7[] bu7VarArr4 = f08.a;
                d71 d71VarD2 = d08Var.d();
                f08.a(d71VarD2);
                arrayList.add(new bu7(d71VarD2, d08Var.d()));
            } else {
                arrayList.add(new bu7(d08Var.b(d08Var.e(i5, 15) - 1), d08Var.d()));
            }
        }
        List listT1 = ww3.T1(arrayList);
        arrayList.clear();
        return listT1;
    }

    public final void y(gb3 gb3Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            qr7.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.a.readByte();
            byte[] bArr = uqi.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            y41 y41Var = this.a;
            y41Var.readInt();
            y41Var.readByte();
            byte[] bArr2 = uqi.a;
            i -= 5;
        }
        List listL = l(w1m.b(i, i2, i4), i4, i2, i3);
        w08 w08Var = (w08) gb3Var.c;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            w08Var.i.c(new t08(w08Var.c + '[' + i3 + "] onHeaders", w08Var, i3, listL, z2), 0L);
            return;
        }
        synchronized (w08Var) {
            d18 d18VarG = w08Var.g(i3);
            if (d18VarG != null) {
                d18VarG.i(uqi.v(listL), z2);
                return;
            }
            if (w08Var.f) {
                return;
            }
            if (i3 <= w08Var.d) {
                return;
            }
            if (i3 % 2 == w08Var.e % 2) {
                return;
            }
            d18 d18Var = new d18(i3, w08Var, false, z2, uqi.v(listL));
            w08Var.d = i3;
            w08Var.b.put(Integer.valueOf(i3), d18Var);
            w08Var.g.e().c(new q08(1, w08Var, d18Var, w08Var.c + '[' + i3 + "] onStream"), 0L);
        }
    }
}
