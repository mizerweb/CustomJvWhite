package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class oe6 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public oe6(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static oe6 a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new oe6(1, new byte[]{(byte) (str.charAt(0) - '0')}, 1);
        }
        byte[] bytes = str.getBytes(se6.b0);
        return new oe6(1, bytes, bytes.length);
    }

    public static oe6 b(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(se6.b0);
        return new oe6(2, bytes, bytes.length);
    }

    public static oe6 c(long j, ByteOrder byteOrder) {
        return d(new long[]{j}, byteOrder);
    }

    public static oe6 d(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[se6.S[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new oe6(4, byteBufferWrap.array(), jArr.length);
    }

    public static oe6 e(qe6[] qe6VarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[se6.S[5] * qe6VarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (qe6 qe6Var : qe6VarArr) {
            byteBufferWrap.putInt((int) qe6Var.a);
            byteBufferWrap.putInt((int) qe6Var.b);
        }
        return new oe6(5, byteBufferWrap.array(), qe6VarArr.length);
    }

    public static oe6 f(int i, ByteOrder byteOrder) {
        return g(new int[]{i}, byteOrder);
    }

    public static oe6 g(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[se6.S[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putShort((short) i);
        }
        return new oe6(3, byteBufferWrap.array(), iArr.length);
    }

    public final double h(ByteOrder byteOrder) {
        Object objK = k(byteOrder);
        if (objK == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objK instanceof String) {
            return Double.parseDouble((String) objK);
        }
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objK instanceof int[]) {
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objK instanceof double[]) {
            double[] dArr = (double[]) objK;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objK instanceof qe6[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        qe6[] qe6VarArr = (qe6[]) objK;
        if (qe6VarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        qe6 qe6Var = qe6VarArr[0];
        return qe6Var.a / qe6Var.b;
    }

    public final int i(ByteOrder byteOrder) {
        Object objK = k(byteOrder);
        if (objK == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objK instanceof String) {
            return Integer.parseInt((String) objK);
        }
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objK instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objK;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String j(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            return null;
        }
        if (objK instanceof String) {
            return (String) objK;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objK instanceof int[]) {
            int[] iArr = (int[]) objK;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objK instanceof double[]) {
            double[] dArr = (double[]) objK;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objK instanceof qe6[])) {
            return null;
        }
        qe6[] qe6VarArr = (qe6[]) objK;
        while (i < qe6VarArr.length) {
            sb.append(qe6VarArr[i].a);
            sb.append('/');
            sb.append(qe6VarArr[i].b);
            i++;
            if (i != qe6VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [qe6[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [qe6[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    public final Serializable k(ByteOrder byteOrder) throws Throwable {
        ne6 ne6Var;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.d;
        InputStream inputStream2 = null;
        try {
            try {
                ne6Var = new ne6(bArr);
                try {
                    ne6Var.c = byteOrder;
                    int i = this.a;
                    int length = 0;
                    int i2 = this.b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, se6.b0);
                                try {
                                    ne6Var.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                ne6Var.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i2 >= se6.T.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = se6.T;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    ne6Var.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            ne6Var.close();
                            return str;
                        case 3:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = ne6Var.readUnsignedShort();
                                length++;
                            }
                            try {
                                ne6Var.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i2];
                            while (length < i2) {
                                r13[length] = ((long) ne6Var.readInt()) & 4294967295L;
                                length++;
                            }
                            ne6Var.close();
                            return r13;
                        case 5:
                            r13 = new qe6[i2];
                            while (length < i2) {
                                r13[length] = new qe6(((long) ne6Var.readInt()) & 4294967295L, ((long) ne6Var.readInt()) & 4294967295L);
                                length++;
                            }
                            ne6Var.close();
                            return r13;
                        case 8:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = ne6Var.readShort();
                                length++;
                            }
                            ne6Var.close();
                            return r13;
                        case 9:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = ne6Var.readInt();
                                length++;
                            }
                            ne6Var.close();
                            return r13;
                        case 10:
                            r13 = new qe6[i2];
                            while (length < i2) {
                                r13[length] = new qe6(ne6Var.readInt(), ne6Var.readInt());
                                length++;
                            }
                            ne6Var.close();
                            return r13;
                        case 11:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = ne6Var.readFloat();
                                length++;
                            }
                            ne6Var.close();
                            return r13;
                        case 12:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = ne6Var.readDouble();
                                length++;
                            }
                            ne6Var.close();
                            return r13;
                        default:
                            try {
                                ne6Var.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (ne6Var != null) {
                        try {
                            ne6Var.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (IOException e7) {
                e = e7;
                ne6Var = null;
            } catch (Throwable th) {
                th = th;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e8) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(se6.R[this.a]);
        sb.append(", data length:");
        return zo5.t(sb, this.d.length, ")");
    }

    public oe6(int i, byte[] bArr, int i2) {
        this(-1L, bArr, i, i2);
    }
}
