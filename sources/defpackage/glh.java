package defpackage;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class glh implements l18 {
    public static final /* synthetic */ int c = 0;
    public final int a = -1;
    public final xvc b = xvc.g;

    static {
        qt4.D(1);
        qt4.D(1);
        qt4.D(3);
        qt4.D(1);
        qt4.D(5);
        qt4.D(3);
    }

    @Override // defpackage.l18
    public final a28 r(ljf ljfVar) throws IOException {
        this.b.getClass();
        bwd bwdVarD = ft0.t().D();
        URL url = new URL(ljfVar.I());
        bwdVarD.getClass();
        url.getPath();
        url.getHost();
        if (url.getPort() > 0) {
            url.getPort();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        try {
            httpURLConnection.setRequestMethod(ljfVar.E());
            Iterator it = ljfVar.B().iterator();
            while (true) {
                y1 y1Var = (y1) it;
                if (!y1Var.hasNext()) {
                    break;
                }
                r18 r18Var = (r18) y1Var.next();
                httpURLConnection.setRequestProperty(r18Var.a(), r18Var.b());
            }
            t80 t80VarY = ljfVar.y();
            if (t80VarY != null) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setChunkedStreamingMode(0);
            }
            a8g.b(httpURLConnection, this.a);
            if (t80VarY != null) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
                try {
                    t80VarY.e(bufferedOutputStream);
                    bufferedOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(bufferedOutputStream, th);
                        throw th2;
                    }
                }
            }
            int iM = a8g.m(httpURLConnection);
            ed7 ed7VarA = c2m.a();
            ed7VarA.U(iM);
            for (String str : httpURLConnection.getHeaderFields().keySet()) {
                if (str != null) {
                    ed7VarA.K(str, httpURLConnection.getHeaderField(str));
                }
            }
            ed7VarA.z(new flh(httpURLConnection, 0));
            return ed7VarA.B();
        } catch (IOException e) {
            httpURLConnection.disconnect();
            throw e;
        }
    }
}
