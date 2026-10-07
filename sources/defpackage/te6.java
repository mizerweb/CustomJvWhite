package defpackage;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class te6 extends FilterOutputStream {
    public static final byte[] g = "Exif\u0000\u0000".getBytes(he6.d);
    public final le6 a;
    public final byte[] b;
    public final ByteBuffer c;
    public int d;
    public int e;
    public int f;

    public te6(ByteArrayOutputStream byteArrayOutputStream, le6 le6Var) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.b = new byte[1];
        this.c = ByteBuffer.allocate(4);
        this.d = 0;
        this.a = le6Var;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        le6 le6Var;
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = this.e;
            if ((i5 <= 0 && this.f <= 0 && this.d == 2) || i4 <= 0) {
                break;
            }
            if (i5 > 0) {
                int iMin = Math.min(i4, i5);
                i4 -= iMin;
                this.e -= iMin;
                i3 += iMin;
            }
            int i6 = this.f;
            if (i6 > 0) {
                int iMin2 = Math.min(i4, i6);
                ((FilterOutputStream) this).out.write(bArr, i3, iMin2);
                i4 -= iMin2;
                this.f -= iMin2;
                i3 += iMin2;
            }
            if (i4 == 0) {
                return;
            }
            int i7 = this.d;
            int i8 = 4;
            ByteBuffer byteBuffer = this.c;
            if (i7 == 0) {
                int iMin3 = Math.min(i4, 2 - byteBuffer.position());
                byteBuffer.put(bArr, i3, iMin3);
                i3 += iMin3;
                i4 -= iMin3;
                if (byteBuffer.position() < 2) {
                    return;
                }
                byteBuffer.rewind();
                if (byteBuffer.getShort() != -40) {
                    qr7.k("Not a valid jpeg image, cannot write exif");
                    return;
                }
                ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                this.d = 1;
                byteBuffer.rewind();
                OutputStream outputStream = ((FilterOutputStream) this).out;
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                t61 t61Var = new t61(outputStream);
                t61Var.l((short) -31);
                int[] iArr = new int[4];
                int[] iArr2 = new int[4];
                ue6[] ue6VarArr = le6.c;
                int i9 = 0;
                while (true) {
                    le6Var = this.a;
                    if (i9 >= i8) {
                        break;
                    }
                    ue6 ue6Var = ue6VarArr[i9];
                    int i10 = 0;
                    while (true) {
                        ue6[] ue6VarArr2 = le6.c;
                        if (i10 < i8) {
                            le6Var.a(i10).remove(ue6Var.b);
                            i10++;
                            i8 = 4;
                        }
                    }
                    i9++;
                    i8 = 4;
                }
                Map mapA = le6Var.a(1);
                ByteOrder byteOrder2 = le6Var.b;
                if (!mapA.isEmpty()) {
                    le6Var.a(0).put(le6.c[1].b, he6.a(0L, byteOrder2));
                }
                if (!le6Var.a(2).isEmpty()) {
                    le6Var.a(0).put(le6.c[2].b, he6.a(0L, byteOrder2));
                }
                if (!le6Var.a(3).isEmpty()) {
                    le6Var.a(1).put(le6.c[3].b, he6.a(0L, byteOrder2));
                }
                int i11 = 0;
                while (true) {
                    ue6[] ue6VarArr3 = le6.c;
                    if (i11 >= 4) {
                        break;
                    }
                    Iterator it = le6Var.a(i11).entrySet().iterator();
                    int i12 = 0;
                    while (it.hasNext()) {
                        he6 he6Var = (he6) ((Map.Entry) it.next()).getValue();
                        int i13 = he6.f[he6Var.a] * he6Var.b;
                        if (i13 > 4) {
                            i12 += i13;
                        }
                    }
                    iArr2[i11] = iArr2[i11] + i12;
                    i11++;
                }
                int i14 = 0;
                int size = 8;
                while (true) {
                    ue6[] ue6VarArr4 = le6.c;
                    if (i14 >= 4) {
                        break;
                    }
                    if (!le6Var.a(i14).isEmpty()) {
                        iArr[i14] = size;
                        size += (le6Var.a(i14).size() * 12) + 6 + iArr2[i14];
                    }
                    i14++;
                }
                int i15 = size + 8;
                if (!le6Var.a(1).isEmpty()) {
                    le6Var.a(0).put(le6.c[1].b, he6.a(iArr[1], byteOrder2));
                }
                if (!le6Var.a(2).isEmpty()) {
                    le6Var.a(0).put(le6.c[2].b, he6.a(iArr[2], byteOrder2));
                }
                if (!le6Var.a(3).isEmpty()) {
                    le6Var.a(1).put(le6.c[3].b, he6.a(iArr[3], byteOrder2));
                }
                t61Var.l((short) i15);
                t61Var.write(g);
                t61Var.l(byteOrder2 == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                t61Var.b = byteOrder2;
                t61Var.l((short) 42);
                t61Var.g(8);
                int i16 = 0;
                while (true) {
                    ue6[] ue6VarArr5 = le6.c;
                    if (i16 >= 4) {
                        break;
                    }
                    if (!le6Var.a(i16).isEmpty()) {
                        t61Var.l((short) le6Var.a(i16).size());
                        int size2 = (le6Var.a(i16).size() * 12) + iArr[i16] + 2 + 4;
                        for (Map.Entry entry : le6Var.a(i16).entrySet()) {
                            ue6 ue6Var2 = (ue6) ((HashMap) ke6.f.get(i16)).get(entry.getKey());
                            qyj.k(ue6Var2, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                            int i17 = ue6Var2.a;
                            he6 he6Var2 = (he6) entry.getValue();
                            int[] iArr3 = he6.f;
                            int i18 = he6Var2.a;
                            int i19 = he6Var2.b;
                            int i20 = iArr3[i18] * i19;
                            t61Var.l((short) i17);
                            t61Var.l((short) he6Var2.a);
                            t61Var.g(i19);
                            if (i20 > 4) {
                                t61Var.g(size2);
                                size2 += i20;
                            } else {
                                t61Var.write(he6Var2.c);
                                if (i20 < 4) {
                                    for (int i21 = 4; i20 < i21; i21 = 4) {
                                        t61Var.c.write(0);
                                        i20++;
                                    }
                                }
                            }
                        }
                        t61Var.g(0);
                        Iterator it2 = le6Var.a(i16).entrySet().iterator();
                        while (it2.hasNext()) {
                            byte[] bArr2 = ((he6) ((Map.Entry) it2.next()).getValue()).c;
                            if (bArr2.length > 4) {
                                t61Var.write(bArr2, 0, bArr2.length);
                            }
                        }
                    }
                    i16++;
                }
                t61Var.b = ByteOrder.BIG_ENDIAN;
            } else if (i7 != 1) {
                continue;
            } else {
                int iMin4 = Math.min(i4, 4 - byteBuffer.position());
                byteBuffer.put(bArr, i3, iMin4);
                i3 += iMin4;
                i4 -= iMin4;
                if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                    byteBuffer.rewind();
                }
                if (byteBuffer.position() < 4) {
                    return;
                }
                byteBuffer.rewind();
                short s = byteBuffer.getShort();
                if (s == -31) {
                    this.e = (byteBuffer.getShort() & 65535) - 2;
                    this.d = 2;
                } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.f = (byteBuffer.getShort() & 65535) - 2;
                } else {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.d = 2;
                }
                byteBuffer.rewind();
            }
        }
        if (i4 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i3, i4);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
