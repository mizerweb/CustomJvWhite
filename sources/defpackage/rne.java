package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class rne implements Closeable {
    public abstract y6a A();

    public abstract y41 E();

    /* JADX WARN: Code duplicated, block: B:18:0x0037 A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #1 {all -> 0x0045, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x001b, B:9:0x0024, B:16:0x0031, B:19:0x0039, B:18:0x0037), top: B:30:0x0004 }] */
    public final String I() throws IOException {
        Charset charsetForName;
        String str;
        y41 y41VarE = E();
        try {
            y6a y6aVarA = A();
            if (y6aVarA != null) {
                charsetForName = pt2.a;
                String[] strArr = y6aVarA.b;
                int i = 0;
                int iS = wk8.s(0, strArr.length - 1, 2);
                if (iS < 0) {
                    str = null;
                    break;
                }
                while (true) {
                    if (!z5h.G0(strArr[i], "charset", true)) {
                        if (i == iS) {
                            str = null;
                            break;
                        }
                        i += 2;
                    } else {
                        str = strArr[i + 1];
                        break;
                    }
                }
                if (str != null) {
                    try {
                        charsetForName = Charset.forName(str);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (charsetForName == null) {
                    charsetForName = pt2.a;
                }
            } else {
                charsetForName = pt2.a;
            }
            String strY0 = y41VarE.y0(uqi.s(y41VarE, charsetForName));
            y41VarE.close();
            return strY0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(y41VarE, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        uqi.d(E());
    }

    public final byte[] l() throws IOException {
        long jY = y();
        if (jY > 2147483647L) {
            qr7.k(zo5.j(jY, "Cannot buffer entire body for content length: "));
            return null;
        }
        y41 y41VarE = E();
        try {
            byte[] bArrN0 = y41VarE.n0();
            y41VarE.close();
            int length = bArrN0.length;
            if (jY == -1 || jY == length) {
                return bArrN0;
            }
            StringBuilder sbQ = c0a.q(length, jY, "Content-Length (", ") and stream length (");
            sbQ.append(") disagree");
            throw new IOException(sbQ.toString());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(y41VarE, th);
                throw th2;
            }
        }
    }

    public abstract long y();
}
