package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import one.video.calls.sdk_private.bB;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.bp;
import one.video.calls.sdk_private.bq;
import one.video.calls.sdk_private.bt;
import one.video.calls.sdk_private.by;
import one.video.calls.sdk_private.bz;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pbk {
    public e8k a;
    public ArrayList c;
    public byte[] e;
    public boolean f;
    public long b = -1;
    public int d = -1;

    public pbk() {
        this.c = new ArrayList();
        this.c = new ArrayList();
    }

    public static byte a(long j, byte b) {
        int i;
        if (j <= 255) {
            return b;
        }
        if (j <= 65535) {
            i = b | 1;
        } else if (j <= 16777215) {
            i = b | 2;
        } else {
            if (j > 4294967295L) {
                throw new bB("cannot encode pn > 4 bytes");
            }
            i = b | 3;
        }
        return (byte) i;
    }

    public static int c(long j) {
        if (j <= 255) {
            return 1;
        }
        if (j <= 65535) {
            return 2;
        }
        return j <= 16777215 ? 3 : 4;
    }

    public static byte[] m(long j) {
        if (j <= 255) {
            return new byte[]{(byte) j};
        }
        if (j <= 65535) {
            return new byte[]{(byte) (j >> 8), (byte) (j & 255)};
        }
        if (j <= 16777215) {
            return new byte[]{(byte) (j >> 16), (byte) (j >> 8), (byte) (j & 255)};
        }
        if (j <= 4294967295L) {
            return new byte[]{(byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) (j & 255)};
        }
        throw new bB("cannot encode pn > 4 bytes");
    }

    public abstract int b(int i);

    public abstract int d(z7k z7kVar, c4h c4hVar);

    public void e(byte b) {
    }

    public final void f(o8k o8kVar) {
        this.c.add(o8kVar);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03e7 A[Catch: BufferUnderflowException | bp -> 0x040f, IllegalArgumentException -> 0x0417, bq -> 0x041f, TryCatch #4 {IllegalArgumentException -> 0x0417, BufferUnderflowException | bp -> 0x040f, bq -> 0x041f, blocks: (B:62:0x017f, B:64:0x0185, B:67:0x019d, B:68:0x01a0, B:72:0x01a9, B:74:0x01b8, B:75:0x01bd, B:76:0x01be, B:78:0x01cf, B:79:0x01d3, B:80:0x01d8, B:81:0x01d9, B:86:0x01f3, B:87:0x01f8, B:88:0x01f9, B:90:0x0203, B:91:0x0209, B:93:0x020f, B:94:0x0216, B:96:0x021a, B:100:0x0228, B:101:0x022c, B:102:0x0230, B:103:0x0243, B:104:0x0248, B:106:0x0259, B:107:0x0261, B:108:0x0266, B:109:0x0267, B:110:0x027e, B:111:0x028f, B:115:0x02a3, B:116:0x02b0, B:117:0x02c1, B:118:0x02d8, B:123:0x02ee, B:124:0x02f3, B:128:0x02f9, B:129:0x0301, B:130:0x0306, B:131:0x0317, B:132:0x032f, B:133:0x0347, B:134:0x0358, B:135:0x036a, B:136:0x037b, B:137:0x0390, B:138:0x03a1, B:139:0x03ab, B:141:0x03b5, B:143:0x03bb, B:145:0x03c4, B:147:0x03d2, B:148:0x03d7, B:150:0x03e7, B:153:0x0400, B:152:0x03f5, B:154:0x0405, B:155:0x040a), top: B:180:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:151:0x03f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x03f5 A[Catch: BufferUnderflowException | bp -> 0x040f, IllegalArgumentException -> 0x0417, bq -> 0x041f, TryCatch #4 {IllegalArgumentException -> 0x0417, BufferUnderflowException | bp -> 0x040f, bq -> 0x041f, blocks: (B:62:0x017f, B:64:0x0185, B:67:0x019d, B:68:0x01a0, B:72:0x01a9, B:74:0x01b8, B:75:0x01bd, B:76:0x01be, B:78:0x01cf, B:79:0x01d3, B:80:0x01d8, B:81:0x01d9, B:86:0x01f3, B:87:0x01f8, B:88:0x01f9, B:90:0x0203, B:91:0x0209, B:93:0x020f, B:94:0x0216, B:96:0x021a, B:100:0x0228, B:101:0x022c, B:102:0x0230, B:103:0x0243, B:104:0x0248, B:106:0x0259, B:107:0x0261, B:108:0x0266, B:109:0x0267, B:110:0x027e, B:111:0x028f, B:115:0x02a3, B:116:0x02b0, B:117:0x02c1, B:118:0x02d8, B:123:0x02ee, B:124:0x02f3, B:128:0x02f9, B:129:0x0301, B:130:0x0306, B:131:0x0317, B:132:0x032f, B:133:0x0347, B:134:0x0358, B:135:0x036a, B:136:0x037b, B:137:0x0390, B:138:0x03a1, B:139:0x03ab, B:141:0x03b5, B:143:0x03bb, B:145:0x03c4, B:147:0x03d2, B:148:0x03d7, B:150:0x03e7, B:153:0x0400, B:152:0x03f5, B:154:0x0405, B:155:0x040a), top: B:180:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:202:0x0405 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0185 A[Catch: BufferUnderflowException | bp -> 0x040f, IllegalArgumentException -> 0x0417, bq -> 0x041f, TryCatch #4 {IllegalArgumentException -> 0x0417, BufferUnderflowException | bp -> 0x040f, bq -> 0x041f, blocks: (B:62:0x017f, B:64:0x0185, B:67:0x019d, B:68:0x01a0, B:72:0x01a9, B:74:0x01b8, B:75:0x01bd, B:76:0x01be, B:78:0x01cf, B:79:0x01d3, B:80:0x01d8, B:81:0x01d9, B:86:0x01f3, B:87:0x01f8, B:88:0x01f9, B:90:0x0203, B:91:0x0209, B:93:0x020f, B:94:0x0216, B:96:0x021a, B:100:0x0228, B:101:0x022c, B:102:0x0230, B:103:0x0243, B:104:0x0248, B:106:0x0259, B:107:0x0261, B:108:0x0266, B:109:0x0267, B:110:0x027e, B:111:0x028f, B:115:0x02a3, B:116:0x02b0, B:117:0x02c1, B:118:0x02d8, B:123:0x02ee, B:124:0x02f3, B:128:0x02f9, B:129:0x0301, B:130:0x0306, B:131:0x0317, B:132:0x032f, B:133:0x0347, B:134:0x0358, B:135:0x036a, B:136:0x037b, B:137:0x0390, B:138:0x03a1, B:139:0x03ab, B:141:0x03b5, B:143:0x03bb, B:145:0x03c4, B:147:0x03d2, B:148:0x03d7, B:150:0x03e7, B:153:0x0400, B:152:0x03f5, B:154:0x0405, B:155:0x040a), top: B:180:0x017f }] */
    public final void g(ByteBuffer byteBuffer, byte b, int i, z4k z4kVar, long j) throws bt, bz, bJ {
        byte[] bArrDoFinal;
        ByteBuffer byteBufferWrap;
        byte b2;
        i5k i5kVar;
        int iF;
        ArrayList arrayList;
        Object obj;
        ArrayList arrayList2;
        Object obj2;
        if (byteBuffer.remaining() < i) {
            dzh.a();
            return;
        }
        int iPosition = byteBuffer.position();
        if (byteBuffer.remaining() < 4) {
            dzh.a();
            return;
        }
        if (byteBuffer.remaining() < 16) {
            dzh.a();
            return;
        }
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        byte[] bArrF = z4kVar.f(bArr2);
        byte b3 = (byte) (b ^ ((b & 128) == 128 ? bArrF[0] & 15 : bArrF[0] & 31));
        l(b3);
        int i2 = (b3 & 3) + 1;
        byte[] bArr3 = new byte[i2];
        byteBuffer.get(bArr3);
        byte[] bArr4 = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            bArr4[i3] = (byte) (bArr3[i3] ^ bArrF[i4]);
            i3 = i4;
        }
        long j2 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j2 = (j2 << 8) | ((long) (bArr4[i5] & 255));
        }
        long j3 = j + 1;
        long j4 = 1 << (i2 << 3);
        long j5 = j4 / 2;
        long j6 = (j3 & (~(j4 - 1))) | j2;
        if (j6 <= j3 - j5 && j6 < 4611686018427387904L - j4) {
            j6 += j4;
        } else if (j6 > j3 + j5 && j6 >= j4) {
            j6 -= j4;
        }
        this.b = j6;
        int iPosition2 = byteBuffer.position();
        int iPosition3 = byteBuffer.position();
        byte[] bArr5 = new byte[iPosition3];
        byteBuffer.get(bArr5);
        bArr5[0] = b3;
        System.arraycopy(bArr4, 0, bArr5, iPosition3 - i2, i2);
        int i6 = i - i2;
        if (i6 <= 0) {
            dzh.a();
            return;
        }
        byte[] bArr6 = new byte[i6];
        byteBuffer.get(bArr6, 0, i6);
        long j7 = this.b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(j7);
        if (this instanceof rbk) {
            if (z4kVar.m % 2 != ((rbk) this).g) {
                if (z4kVar.e == null) {
                    z4kVar.a(false);
                }
                z4kVar.n = true;
            }
        }
        byte[] bArr7 = z4kVar.n ? z4kVar.g : z4kVar.f;
        byte[] bArr8 = new byte[12];
        byte[] bArrArray = byteBufferAllocate.array();
        int length = bArrArray.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            bArr8[i8] = (byte) (bArrArray[i7] ^ bArr7[i8]);
            i7++;
            i8++;
        }
        switch (z4kVar.p) {
            case 0:
                if (bArr6.length <= 16) {
                    throw new bt("ciphertext must be longer than 16 bytes");
                }
                SecretKeySpec secretKeySpecL = z4kVar.l();
                Cipher cipherM = z4kVar.m();
                try {
                    cipherM.init(2, secretKeySpecL, new GCMParameterSpec(np0.m, bArr8));
                    cipherM.updateAAD(bArr5);
                    bArrDoFinal = cipherM.doFinal(bArr6);
                    break;
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
                    hs4.b();
                    bArrDoFinal = null;
                } catch (AEADBadTagException unused2) {
                    throw new bt();
                }
                this.c = new ArrayList();
                byteBufferWrap = ByteBuffer.wrap(bArrDoFinal);
                while (byteBufferWrap.remaining() > 0) {
                    try {
                        b2 = byteBufferWrap.get();
                        if (b2 == 48 && b2 != 49) {
                            switch (b2) {
                                case 0:
                                    ArrayList arrayList3 = this.c;
                                    k8k k8kVar = new k8k();
                                    byte b4 = 0;
                                    while (byteBufferWrap.position() < byteBufferWrap.limit() && (b4 = byteBufferWrap.get()) == 0) {
                                        k8kVar.a++;
                                    }
                                    if (b4 != 0) {
                                    }
                                    arrayList3.add(k8kVar);
                                    break;
                                case 1:
                                    ArrayList arrayList4 = this.c;
                                    n8k n8kVar = new n8k();
                                    byteBufferWrap.get();
                                    arrayList4.add(n8kVar);
                                    break;
                                case 2:
                                case 3:
                                    ArrayList arrayList5 = this.c;
                                    e5k e5kVar = new e5k();
                                    e5kVar.e = 8;
                                    e5kVar.f = null;
                                    e5kVar.k(byteBufferWrap);
                                    arrayList5.add(e5kVar);
                                    break;
                                case 4:
                                    ArrayList arrayList6 = this.c;
                                    r8k r8kVar = new r8k();
                                    r8kVar.i(byteBufferWrap);
                                    arrayList6.add(r8kVar);
                                    break;
                                case 5:
                                    ArrayList arrayList7 = this.c;
                                    k5k k5kVar = new k5k(1);
                                    k5kVar.k(byteBufferWrap);
                                    arrayList7.add(k5kVar);
                                    break;
                                case 6:
                                    ArrayList arrayList8 = this.c;
                                    g5k g5kVar = new g5k();
                                    g5kVar.i(byteBufferWrap);
                                    arrayList8.add(g5kVar);
                                    break;
                                case 7:
                                    arrayList = this.c;
                                    j8k j8kVar = new j8k();
                                    byteBufferWrap.get();
                                    byte[] bArr9 = new byte[ti8.f(byteBufferWrap)];
                                    j8kVar.a = bArr9;
                                    byteBufferWrap.get(bArr9);
                                    obj = j8kVar;
                                    arrayList.add(obj);
                                    break;
                                default:
                                    switch (b2) {
                                        case 16:
                                            ArrayList arrayList9 = this.c;
                                            h5k h5kVar = new h5k(1);
                                            byteBufferWrap.get();
                                            h5kVar.b = ti8.h(byteBufferWrap);
                                            arrayList9.add(h5kVar);
                                            break;
                                        case 17:
                                            ArrayList arrayList10 = this.c;
                                            k5k k5kVar2 = new k5k(0);
                                            k5kVar2.i(byteBufferWrap);
                                            arrayList10.add(k5kVar2);
                                            break;
                                        case 18:
                                        case 19:
                                            arrayList = this.c;
                                            l5k l5kVar = new l5k();
                                            byte b5 = byteBufferWrap.get();
                                            if (b5 != 18 && b5 != 19) {
                                                throw new RuntimeException();
                                            }
                                            l5kVar.b = b5 == 18;
                                            l5kVar.a = ti8.h(byteBufferWrap);
                                            obj = l5kVar;
                                            arrayList.add(obj);
                                            break;
                                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                                            ArrayList arrayList11 = this.c;
                                            h5k h5kVar2 = new h5k(0);
                                            byteBufferWrap.get();
                                            h5kVar2.b = ti8.h(byteBufferWrap);
                                            arrayList11.add(h5kVar2);
                                            break;
                                        case 21:
                                            ArrayList arrayList12 = this.c;
                                            k5k k5kVar3 = new k5k(2);
                                            k5kVar3.m(byteBufferWrap);
                                            arrayList12.add(k5kVar3);
                                            break;
                                        case 22:
                                        case 23:
                                            ArrayList arrayList13 = this.c;
                                            v8k v8kVar = new v8k();
                                            v8kVar.a = byteBufferWrap.get() == 22;
                                            v8kVar.b = ti8.h(byteBufferWrap);
                                            arrayList13.add(v8kVar);
                                            break;
                                        case 24:
                                            ArrayList arrayList14 = this.c;
                                            i8k i8kVar = new i8k();
                                            i8kVar.i(byteBufferWrap);
                                            arrayList14.add(i8kVar);
                                            break;
                                        case 25:
                                            ArrayList arrayList15 = this.c;
                                            s8k s8kVar = new s8k();
                                            byteBufferWrap.get();
                                            s8kVar.a = o8k.e(byteBufferWrap);
                                            arrayList15.add(s8kVar);
                                            break;
                                        case 26:
                                            arrayList2 = this.c;
                                            l8k l8kVar = new l8k();
                                            if (byteBufferWrap.get() != 26) {
                                                throw new RuntimeException();
                                            }
                                            byte[] bArr10 = new byte[8];
                                            l8kVar.a = bArr10;
                                            byteBufferWrap.get(bArr10);
                                            obj2 = l8kVar;
                                            arrayList2.add(obj2);
                                            break;
                                            break;
                                        case 27:
                                            arrayList2 = this.c;
                                            m8k m8kVar = new m8k();
                                            byteBufferWrap.get();
                                            byte[] bArr11 = new byte[8];
                                            m8kVar.a = bArr11;
                                            byteBufferWrap.get(bArr11);
                                            obj2 = m8kVar;
                                            arrayList2.add(obj2);
                                            break;
                                        case 28:
                                        case 29:
                                            ArrayList arrayList16 = this.c;
                                            f5k f5kVar = new f5k();
                                            int i9 = byteBufferWrap.get() & 255;
                                            f5kVar.e = i9;
                                            if (i9 != 28 && i9 != 29) {
                                                throw new RuntimeException();
                                            }
                                            f5kVar.a = ti8.h(byteBufferWrap);
                                            if (f5kVar.e == 28) {
                                                f5kVar.b = ti8.h(byteBufferWrap);
                                            }
                                            int iF2 = ti8.f(byteBufferWrap);
                                            if (iF2 > 0) {
                                                byte[] bArr12 = new byte[iF2];
                                                f5kVar.c = bArr12;
                                                byteBufferWrap.get(bArr12);
                                            }
                                            if (f5kVar.e == 28) {
                                                long j8 = f5kVar.a;
                                                if (j8 >= 256 && j8 < 512) {
                                                    f5kVar.d = (int) (j8 - 256);
                                                }
                                            }
                                            arrayList16.add(f5kVar);
                                            break;
                                        case 30:
                                            ArrayList arrayList17 = this.c;
                                            j5k j5kVar = new j5k();
                                            if (byteBufferWrap.get() != 30) {
                                                throw new RuntimeException();
                                            }
                                            arrayList17.add(j5kVar);
                                            break;
                                            break;
                                        default:
                                            if (b2 < 8 || b2 > 15) {
                                                throw new bJ(8);
                                            }
                                            ArrayList arrayList18 = this.c;
                                            t8k t8kVar = new t8k();
                                            t8kVar.i(byteBufferWrap);
                                            arrayList18.add(t8kVar);
                                            break;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            ArrayList arrayList19 = this.c;
                            i5kVar = new i5k();
                            iF = ti8.f(byteBufferWrap);
                            if (iF == 49) {
                                byte[] bArr13 = new byte[ti8.f(byteBufferWrap)];
                                i5kVar.a = bArr13;
                                byteBufferWrap.get(bArr13);
                            } else {
                                if (iF == 48) {
                                    throw new by();
                                }
                                byte[] bArr14 = new byte[byteBufferWrap.remaining()];
                                i5kVar.a = bArr14;
                                byteBufferWrap.get(bArr14);
                            }
                            arrayList19.add(i5kVar);
                        }
                    } catch (IllegalArgumentException unused3) {
                        throw new bz("unexpected large int value");
                    } catch (BufferUnderflowException | bp unused4) {
                        throw new bJ(8, "invalid frame encoding");
                    } catch (bq unused5) {
                        throw new bJ(8, "invalid integer encoding");
                    }
                }
                e(b3);
                return;
            default:
                try {
                    Cipher cipherK = z4kVar.k();
                    cipherK.init(2, z4kVar.j(), new IvParameterSpec(bArr8));
                    cipherK.updateAAD(bArr5);
                    bArrDoFinal = cipherK.doFinal(bArr6);
                    break;
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused6) {
                    hs4.b();
                    bArrDoFinal = null;
                } catch (AEADBadTagException unused7) {
                    throw new bt();
                }
                this.c = new ArrayList();
                byteBufferWrap = ByteBuffer.wrap(bArrDoFinal);
                while (byteBufferWrap.remaining() > 0) {
                    b2 = byteBufferWrap.get();
                    if (b2 == 48) {
                    }
                    ArrayList arrayList110 = this.c;
                    i5kVar = new i5k();
                    iF = ti8.f(byteBufferWrap);
                    if (iF == 49) {
                        byte[] bArr15 = new byte[ti8.f(byteBufferWrap)];
                        i5kVar.a = bArr15;
                        byteBufferWrap.get(bArr15);
                    } else {
                        if (iF == 48) {
                            throw new by();
                        }
                        byte[] bArr16 = new byte[byteBufferWrap.remaining()];
                        i5kVar.a = bArr16;
                        byteBufferWrap.get(bArr16);
                    }
                    arrayList110.add(i5kVar);
                }
                e(b3);
                return;
        }
    }

    public final void h(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, z4k z4kVar) {
        int iPosition = byteBuffer.position() - i;
        byte[] bArr = new byte[byteBuffer.position()];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[byteBuffer2.limit()];
        byteBuffer2.get(bArr2, 0, byteBuffer2.limit());
        long j = this.b;
        byte[] bArr3 = z4kVar.n ? z4kVar.g : z4kVar.f;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr3.length);
        for (int i2 = 0; i2 < byteBufferAllocate.capacity() - 8; i2++) {
            byteBufferAllocate.put((byte) 0);
        }
        byteBufferAllocate.putLong(j);
        byte[] bArr4 = new byte[12];
        byte[] bArrArray = byteBufferAllocate.array();
        int length = bArrArray.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            bArr4[i4] = (byte) (bArrArray[i3] ^ bArr3[i4]);
            i3++;
            i4++;
        }
        byte[] bArrDoFinal = null;
        switch (z4kVar.p) {
            case 0:
                Cipher cipherM = z4kVar.m();
                try {
                    cipherM.init(1, z4kVar.l(), new GCMParameterSpec(np0.m, bArr4));
                    cipherM.updateAAD(bArr);
                    bArrDoFinal = cipherM.doFinal(bArr2);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
                    hs4.b();
                }
                break;
            default:
                try {
                    Cipher cipherK = z4kVar.k();
                    cipherK.init(1, z4kVar.j(), new IvParameterSpec(bArr4));
                    cipherK.updateAAD(bArr);
                    bArrDoFinal = cipherK.doFinal(bArr2);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused2) {
                    hs4.b();
                }
                break;
        }
        byteBuffer.put(bArrDoFinal);
        byte[] bArrM = m(this.b);
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArrDoFinal, 4 - bArrM.length, bArr5, 0, 16);
        byte[] bArrF = z4kVar.f(bArr5);
        byte[] bArr6 = new byte[bArrM.length];
        int i5 = 0;
        while (i5 < bArrM.length) {
            int i6 = i5 + 1;
            bArr6[i5] = (byte) (bArrM[i5] ^ bArrF[i6]);
            i5 = i6;
        }
        byte b = byteBuffer.get(0);
        byteBuffer.put(0, (byte) (b ^ ((byte) ((b & 128) == 128 ? bArrF[0] & 15 : bArrF[0] & 31))));
        int iPosition2 = byteBuffer.position();
        byteBuffer.put(bArr6);
    }

    public abstract void i(ByteBuffer byteBuffer, z4k z4kVar, long j, ku8 ku8Var, int i);

    public abstract byte[] j(z4k z4kVar);

    public final ByteBuffer k(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1500);
        this.c.stream().forEachOrdered(new bo8(byteBufferAllocate, 5));
        if (byteBufferAllocate.position() + i < 4) {
            k8k k8kVar = new k8k((4 - i) - byteBufferAllocate.position());
            this.c.add(k8kVar);
            k8kVar.d(byteBufferAllocate);
        }
        return byteBufferAllocate;
    }

    public void l(byte b) {
    }

    public abstract w4k n();

    public abstract y4k o();

    public Long p() {
        long j = this.b;
        if (j >= 0) {
            return Long.valueOf(j);
        }
        ore.k("PN is not yet known");
        return null;
    }

    public final int q() {
        int i = this.d;
        if (i > 0) {
            return i;
        }
        ore.k("no size for ".concat(getClass().getSimpleName()));
        return 0;
    }

    public boolean r() {
        return !(this instanceof qbk);
    }

    public boolean s() {
        return this.c.stream().anyMatch(new lak(4));
    }

    public boolean t() {
        return this.c.stream().allMatch(new lak(6));
    }

    public boolean u() {
        return this.c.stream().anyMatch(new lak(5));
    }

    public byte[] v() {
        return this.e;
    }
}
