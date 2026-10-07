package defpackage;

import android.util.Log;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dvk {
    public static String[] a(t36 t36Var) throws ClosedByInterruptException {
        if (!(t36Var instanceof u36)) {
            return b(t36Var);
        }
        u36 u36Var = (u36) t36Var;
        int i = 0;
        while (true) {
            try {
                return b(u36Var);
            } catch (ClosedByInterruptException e) {
                i++;
                if (i > 4) {
                    throw e;
                }
                Thread.interrupted();
                Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                FileInputStream fileInputStream = new FileInputStream(u36Var.a);
                u36Var.b = fileInputStream;
                u36Var.c = fileInputStream.getChannel();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01be  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01de  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fd A[LOOP:4: B:112:0x01ee->B:114:0x01fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x020f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0218  */
    /* JADX WARN: Code duplicated, block: B:122:0x021e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0221  */
    /* JADX WARN: Code duplicated, block: B:127:0x022b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:128:0x022c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0232  */
    /* JADX WARN: Code duplicated, block: B:132:0x023a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0242 A[LOOP:1: B:50:0x00f4->B:134:0x0242, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0204 A[EDGE_INSN: B:148:0x0204->B:115:0x0204 BREAK  A[LOOP:4: B:112:0x01ee->B:114:0x01fd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:77:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0152  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Code duplicated, block: B:82:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:84:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x0173  */
    /* JADX WARN: Code duplicated, block: B:87:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0194  */
    /* JADX WARN: Code duplicated, block: B:94:0x019b  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ac  */
    public static String[] b(t36 t36Var) {
        long jD;
        int i;
        long jD2;
        long jD3;
        long jD4;
        long j;
        long j2;
        int i2;
        int i3;
        long j3;
        int i4;
        String[] strArr;
        int i5;
        long jD5;
        long j4;
        long jD6;
        long j5;
        StringBuilder sb;
        long j6;
        short s;
        long jD7;
        long jD8;
        long jD9;
        long jD10;
        long jD11;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jD12 = d(t36Var, byteBufferAllocate, 0L);
        if (jD12 != 1179403647) {
            throw new vya("file is not ELF: magic is 0x" + Long.toHexString(jD12) + ", it should be " + Long.toHexString(1179403647L));
        }
        e(t36Var, byteBufferAllocate, 1, 4L);
        boolean z = ((short) (byteBufferAllocate.get() & 255)) == 1;
        e(t36Var, byteBufferAllocate, 1, 5L);
        if (((short) (byteBufferAllocate.get() & 255)) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        if (z) {
            jD = d(t36Var, byteBufferAllocate, 28L);
        } else {
            e(t36Var, byteBufferAllocate, 8, 32L);
            jD = byteBufferAllocate.getLong();
        }
        if (z) {
            e(t36Var, byteBufferAllocate, 2, 44L);
            i = byteBufferAllocate.getShort() & 65535;
        } else {
            e(t36Var, byteBufferAllocate, 2, 56L);
            i = byteBufferAllocate.getShort() & 65535;
        }
        long jD13 = i;
        e(t36Var, byteBufferAllocate, 2, z ? 42L : 54L);
        int i6 = byteBufferAllocate.getShort() & 65535;
        long j7 = 40;
        if (jD13 == 65535) {
            if (z) {
                jD11 = d(t36Var, byteBufferAllocate, 32L);
            } else {
                e(t36Var, byteBufferAllocate, 8, 40L);
                jD11 = byteBufferAllocate.getLong();
            }
            jD13 = z ? d(t36Var, byteBufferAllocate, jD11 + 28) : d(t36Var, byteBufferAllocate, jD11 + 44);
        }
        long j8 = 0;
        long j9 = jD;
        while (true) {
            if (j8 >= jD13) {
                jD2 = 0;
                break;
            }
            if ((z ? d(t36Var, byteBufferAllocate, j9) : d(t36Var, byteBufferAllocate, j9)) == 2) {
                if (!z) {
                    e(t36Var, byteBufferAllocate, 8, j9 + 8);
                    jD2 = byteBufferAllocate.getLong();
                    break;
                }
                jD2 = d(t36Var, byteBufferAllocate, j9 + 4);
                break;
            }
            j9 += (long) i6;
            j8++;
            z = z;
        }
        boolean z2 = z;
        if (jD2 == 0) {
            throw new vya("ELF file does not contain dynamic linking information");
        }
        long j10 = jD2;
        long j11 = 0;
        int i7 = 0;
        while (true) {
            if (z2) {
                jD3 = d(t36Var, byteBufferAllocate, j10);
            } else {
                e(t36Var, byteBufferAllocate, 8, j10);
                jD3 = byteBufferAllocate.getLong();
            }
            long j12 = j7;
            if (jD3 != 1) {
                if (jD3 == 5) {
                    if (z2) {
                        jD4 = d(t36Var, byteBufferAllocate, j10 + 4);
                    } else {
                        e(t36Var, byteBufferAllocate, 8, j10 + 8);
                        jD4 = byteBufferAllocate.getLong();
                    }
                    j11 = jD4;
                }
                if (z2) {
                    j = 8;
                } else {
                    j = 16;
                }
                j10 += j;
                if (jD3 == 0) {
                    if (j11 != 0) {
                        throw new vya("Dynamic section string-table not found");
                    }
                    j2 = jD;
                    i2 = 0;
                    while (true) {
                        i3 = i6;
                        if (i2 < jD13) {
                            i7 = i7;
                            j3 = 0;
                            break;
                        }
                        if (z2) {
                            jD7 = d(t36Var, byteBufferAllocate, j2);
                        } else {
                            jD7 = d(t36Var, byteBufferAllocate, j2);
                        }
                        if (jD7 == 1) {
                            if (z2) {
                                jD8 = d(t36Var, byteBufferAllocate, j2 + 8);
                            } else {
                                e(t36Var, byteBufferAllocate, 8, j2 + 16);
                                jD8 = byteBufferAllocate.getLong();
                            }
                            if (z2) {
                                jD9 = d(t36Var, byteBufferAllocate, j2 + 20);
                            } else {
                                e(t36Var, byteBufferAllocate, 8, j2 + j12);
                                jD9 = byteBufferAllocate.getLong();
                            }
                            if (jD8 <= j11 && j11 < jD9 + jD8) {
                                if (z2) {
                                    jD10 = d(t36Var, byteBufferAllocate, j2 + 4);
                                } else {
                                    e(t36Var, byteBufferAllocate, 8, j2 + 8);
                                    jD10 = byteBufferAllocate.getLong();
                                }
                                j3 = (j11 - jD8) + jD10;
                                break;
                            }
                        } else {
                            i7 = i7;
                        }
                        i6 = i3;
                        j2 += (long) i6;
                        i2++;
                        i7 = i7;
                    }
                    if (j3 != 0) {
                        throw new vya("did not find file offset of DT_STRTAB table");
                    }
                    i4 = i7;
                    strArr = new String[i4];
                    i5 = 0;
                    do {
                        if (z2) {
                            jD5 = d(t36Var, byteBufferAllocate, jD2);
                        } else {
                            e(t36Var, byteBufferAllocate, 8, jD2);
                            jD5 = byteBufferAllocate.getLong();
                        }
                        if (jD5 != 1) {
                            if (z2) {
                                jD6 = d(t36Var, byteBufferAllocate, jD2 + 4);
                            } else {
                                e(t36Var, byteBufferAllocate, 8, jD2 + 8);
                                jD6 = byteBufferAllocate.getLong();
                            }
                            j5 = j3 + jD6;
                            sb = new StringBuilder();
                            while (true) {
                                j6 = j5 + 1;
                                e(t36Var, byteBufferAllocate, 1, j5);
                                s = (short) (byteBufferAllocate.get() & 255);
                                if (s != 0) {
                                    break;
                                }
                                sb.append((char) s);
                                j5 = j6;
                            }
                            strArr[i5] = sb.toString();
                            if (i5 != Integer.MAX_VALUE) {
                                throw new vya("malformed DT_NEEDED section");
                            }
                            i5++;
                        }
                        if (z2) {
                            j4 = 8;
                        } else {
                            j4 = 16;
                        }
                        jD2 += j4;
                    } while (jD5 != 0);
                    if (i5 == i4) {
                        return strArr;
                    }
                    throw new vya(r13);
                }
                j7 = j12;
            } else {
                if (i7 == Integer.MAX_VALUE) {
                    throw new vya("malformed DT_NEEDED section");
                }
                i7++;
            }
            if (z2) {
                j = 8;
            } else {
                j = 16;
            }
            j10 += j;
            if (jD3 == 0) {
                if (j11 != 0) {
                    throw new vya("Dynamic section string-table not found");
                }
                j2 = jD;
                i2 = 0;
                while (true) {
                    i3 = i6;
                    if (i2 < jD13) {
                        i7 = i7;
                        j3 = 0;
                        break;
                    }
                    if (z2) {
                        jD7 = d(t36Var, byteBufferAllocate, j2);
                    } else {
                        jD7 = d(t36Var, byteBufferAllocate, j2);
                    }
                    if (jD7 == 1) {
                        if (z2) {
                            jD8 = d(t36Var, byteBufferAllocate, j2 + 8);
                        } else {
                            e(t36Var, byteBufferAllocate, 8, j2 + 16);
                            jD8 = byteBufferAllocate.getLong();
                        }
                        if (z2) {
                            jD9 = d(t36Var, byteBufferAllocate, j2 + 20);
                        } else {
                            e(t36Var, byteBufferAllocate, 8, j2 + j12);
                            jD9 = byteBufferAllocate.getLong();
                        }
                        if (jD8 <= j11) {
                            if (z2) {
                                jD10 = d(t36Var, byteBufferAllocate, j2 + 4);
                            } else {
                                e(t36Var, byteBufferAllocate, 8, j2 + 8);
                                jD10 = byteBufferAllocate.getLong();
                            }
                            j3 = (j11 - jD8) + jD10;
                            break;
                        }
                    } else {
                        i7 = i7;
                    }
                    i6 = i3;
                    j2 += (long) i6;
                    i2++;
                    i7 = i7;
                }
                if (j3 != 0) {
                    throw new vya("did not find file offset of DT_STRTAB table");
                }
                i4 = i7;
                strArr = new String[i4];
                i5 = 0;
                do {
                    if (z2) {
                        jD5 = d(t36Var, byteBufferAllocate, jD2);
                    } else {
                        e(t36Var, byteBufferAllocate, 8, jD2);
                        jD5 = byteBufferAllocate.getLong();
                    }
                    if (jD5 != 1) {
                        if (z2) {
                            jD6 = d(t36Var, byteBufferAllocate, jD2 + 4);
                        } else {
                            e(t36Var, byteBufferAllocate, 8, jD2 + 8);
                            jD6 = byteBufferAllocate.getLong();
                        }
                        j5 = j3 + jD6;
                        sb = new StringBuilder();
                        while (true) {
                            j6 = j5 + 1;
                            e(t36Var, byteBufferAllocate, 1, j5);
                            s = (short) (byteBufferAllocate.get() & 255);
                            if (s != 0) {
                                break;
                                break;
                            }
                            sb.append((char) s);
                            j5 = j6;
                        }
                        strArr[i5] = sb.toString();
                        if (i5 != Integer.MAX_VALUE) {
                            throw new vya("malformed DT_NEEDED section");
                        }
                        i5++;
                    }
                    if (z2) {
                        j4 = 8;
                    } else {
                        j4 = 16;
                    }
                    jD2 += j4;
                } while (jD5 != 0);
                if (i5 == i4) {
                    return strArr;
                }
                throw new vya(r13);
            }
            j7 = j12;
        }
    }

    public static String c() {
        c54 c54VarA = hg5.a();
        if (c54VarA == null) {
            return "Association(type=0)";
        }
        c54VarA.a();
        ylc ylcVar = (ylc) c54VarA.d.get(0);
        if (ylcVar == null) {
            return "Association(type=0)";
        }
        StringBuilder sb = new StringBuilder("Association(keyType=");
        sb.append((String) ylcVar.a);
        sb.append(", valueType=");
        return x05.i(sb, (String) ylcVar.b, ')');
    }

    public static long d(t36 t36Var, ByteBuffer byteBuffer, long j) {
        e(t36Var, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static void e(t36 t36Var, ByteBuffer byteBuffer, int i, long j) {
        int iD0;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (iD0 = t36Var.d0(j, byteBuffer)) != -1) {
            j += (long) iD0;
        }
        if (byteBuffer.remaining() > 0) {
            throw new vya("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
