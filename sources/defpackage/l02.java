package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes.dex */
public final class l02 implements tj8 {
    public final boolean a;

    public l02(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x016b A[Catch: IOException -> 0x00bc, TryCatch #6 {IOException -> 0x00bc, blocks: (B:49:0x00b7, B:52:0x00bf, B:59:0x00e4, B:60:0x0100, B:64:0x0111, B:71:0x014e, B:73:0x015c, B:76:0x0165, B:83:0x017e, B:85:0x0182, B:89:0x018f, B:91:0x01a2, B:92:0x01aa, B:93:0x01b4, B:78:0x016b, B:65:0x011e, B:70:0x0148, B:96:0x01b7, B:97:0x01ba, B:66:0x0126, B:69:0x0131), top: B:114:0x00b7, inners: #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v3, types: [one] */
    /* JADX WARN: Type inference failed for: r12v4, types: [one] */
    @Override // defpackage.tj8
    public final pne a(f9e f9eVar) throws Throwable {
        ?? r12;
        IOException iOException;
        ?? C;
        pne pneVarA;
        yf2 yf2Var = f9eVar.d;
        dle dleVar = f9eVar.e;
        hle hleVar = dleVar.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Object obj = yf2Var.c;
            try {
                y8e y8eVar = (y8e) yf2Var.b;
                jd6 jd6Var = (jd6) yf2Var.e;
                jd6Var.a(dleVar);
                ?? V = f55.v(dleVar.b);
                boolean z = true;
                try {
                    if (V == 0 || hleVar == null) {
                        y8eVar.i(yf2Var, true, false, null);
                        V = 0;
                    } else {
                        if (HTTP.EXPECT_CONTINUE.equalsIgnoreCase(dleVar.c.a(HTTP.EXPECT_DIRECTIVE))) {
                            try {
                                jd6Var.h();
                                V = yf2Var.c(true);
                            } catch (IOException e) {
                                yf2Var.d(e);
                                throw e;
                            }
                        } else {
                            V = 0;
                        }
                        if (V == 0) {
                            long j = dleVar.d.b;
                            s8e s8eVar = new s8e(new hd6(yf2Var, jd6Var.c(dleVar, j), j));
                            byte[] bArr = (byte[]) hleVar.d;
                            int i = hleVar.b;
                            if (s8eVar.c) {
                                throw new IllegalStateException("closed");
                            }
                            s8eVar.b.k0(i, bArr);
                            s8eVar.l();
                            s8eVar.close();
                        } else {
                            y8eVar.i(yf2Var, true, false, null);
                            if (((c9e) yf2Var.f).g == null) {
                                z = false;
                            }
                            if (!z) {
                                jd6Var.d().k();
                            }
                        }
                    }
                    try {
                        jd6Var.b();
                        iOException = null;
                        C = V;
                    } catch (IOException e2) {
                        yf2Var.d(e2);
                        throw e2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    r12 = V;
                    if (!(e instanceof ConnectionShutdownException) || !yf2Var.a) {
                        throw e;
                    }
                    iOException = e;
                }
                if (C == 0) {
                    try {
                        C = r12;
                        C = yf2Var.c(false);
                    } catch (IOException e4) {
                        if (iOException == null) {
                            throw e4;
                        }
                        gm0.b(iOException, e4);
                        throw iOException;
                    }
                }
                C = r12;
                C.a = dleVar;
                C.e = ((c9e) yf2Var.f).e;
                C.k = jCurrentTimeMillis;
                C.l = System.currentTimeMillis();
                pne pneVarA2 = C.a();
                int i2 = pneVarA2.d;
                if (i2 == 100 || (102 <= i2 && i2 < 200)) {
                    one oneVarC = yf2Var.c(false);
                    oneVarC.a = dleVar;
                    oneVarC.e = ((c9e) yf2Var.f).e;
                    oneVarC.k = jCurrentTimeMillis;
                    oneVarC.l = System.currentTimeMillis();
                    pneVarA2 = oneVarC.a();
                    i2 = pneVarA2.d;
                }
                ((lc6) yf2Var.c).e(pneVarA2);
                if (this.a && i2 == 101) {
                    one oneVarI = pneVarA2.I();
                    oneVarI.g = uqi.c;
                    pneVarA = oneVarI.a();
                } else {
                    one oneVarI2 = pneVarA2.I();
                    jd6 jd6Var2 = (jd6) yf2Var.e;
                    try {
                        String strA = pneVarA2.f.a(HTTP.CONTENT_TYPE);
                        if (strA == null) {
                            strA = null;
                        }
                        long jF = jd6Var2.f(pneVarA2);
                        oneVarI2.g = new g9e(strA, jF, new u8e(new id6(yf2Var, jd6Var2.e(pneVarA2), jF)));
                        pneVarA = oneVarI2.a();
                    } catch (IOException e5) {
                        yf2Var.d(e5);
                        throw e5;
                    }
                }
                if ("close".equalsIgnoreCase(pneVarA.a.c.a(HTTP.CONN_DIRECTIVE))) {
                    ((jd6) yf2Var.e).d().k();
                } else {
                    String strA2 = pneVarA.f.a(HTTP.CONN_DIRECTIVE);
                    if (strA2 == null) {
                        strA2 = null;
                    }
                    if ("close".equalsIgnoreCase(strA2)) {
                        ((jd6) yf2Var.e).d().k();
                    }
                }
                if (i2 == 204 || i2 == 205) {
                    rne rneVar = pneVarA.g;
                    if ((rneVar != null ? rneVar.y() : -1L) > 0) {
                        StringBuilder sb = new StringBuilder("HTTP ");
                        sb.append(i2);
                        sb.append(" had non-zero Content-Length: ");
                        rne rneVar2 = pneVarA.g;
                        sb.append(rneVar2 != null ? Long.valueOf(rneVar2.y()) : null);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return pneVarA;
            } catch (IOException e6) {
                yf2Var.d(e6);
                throw e6;
            }
        } catch (IOException e7) {
            e = e7;
            r12 = 0;
            if (!(e instanceof ConnectionShutdownException)) {
                throw e;
            }
            throw e;
        }
    }
}
