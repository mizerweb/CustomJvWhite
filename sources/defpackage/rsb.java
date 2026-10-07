package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes2.dex */
public final class rsb extends pq0 {
    public final qsb e;
    public final qg7 f;
    public final qg7 g;
    public a35 h;
    public pne i;
    public InputStream j;
    public boolean k;
    public long l;
    public long m;

    static {
        sz9.a("media3.datasource.okhttp");
    }

    public rsb(qsb qsbVar, qg7 qg7Var) {
        super(true);
        qsbVar.getClass();
        this.e = qsbVar;
        this.g = qg7Var;
        this.f = new qg7(3);
    }

    @Override // defpackage.u25
    public final void close() {
        if (this.k) {
            this.k = false;
            b();
            e();
        }
        this.i = null;
        this.h = null;
    }

    public final void e() {
        pne pneVar = this.i;
        if (pneVar != null) {
            rne rneVar = pneVar.g;
            rneVar.getClass();
            rneVar.close();
        }
        this.j = null;
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [byte[], java.io.Serializable] */
    @Override // defpackage.u25
    public final long f(a35 a35Var) throws HttpDataSource$HttpDataSourceException {
        k28 k28VarC;
        long j;
        DataSourceException dataSourceException;
        hle hleVar;
        byte[] bArrB;
        this.h = a35Var;
        this.m = 0L;
        this.l = 0L;
        c(a35Var);
        long j2 = a35Var.f;
        int i = a35Var.c;
        long j3 = a35Var.g;
        String string = a35Var.a.toString();
        try {
            t84 t84Var = new t84();
            t84Var.n(null, string);
            k28VarC = t84Var.c();
        } catch (IllegalArgumentException unused) {
            k28VarC = null;
        }
        if (k28VarC == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", 1004);
        }
        ag5 ag5Var = new ag5(3);
        ag5Var.a = k28VarC;
        HashMap map = new HashMap();
        qg7 qg7Var = this.g;
        if (qg7Var != null) {
            map.putAll(qg7Var.l());
        }
        map.putAll(this.f.l());
        map.putAll(a35Var.e);
        for (Map.Entry entry : map.entrySet()) {
            ag5Var.d((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = p28.a(j2, j3);
        if (strA != null) {
            p3c p3cVar = (p3c) ag5Var.c;
            p3cVar.getClass();
            e9i.u("Range");
            e9i.x(strA, "Range");
            ArrayList arrayList = (ArrayList) p3cVar.b;
            arrayList.add("Range");
            arrayList.add(r5h.y1(strA).toString());
        }
        if (!a35Var.c(1)) {
            p3c p3cVar2 = (p3c) ag5Var.c;
            p3cVar2.getClass();
            e9i.u("Accept-Encoding");
            e9i.x(HTTP.IDENTITY_CODING, "Accept-Encoding");
            ArrayList arrayList2 = (ArrayList) p3cVar2.b;
            arrayList2.add("Accept-Encoding");
            arrayList2.add(r5h.y1(HTTP.IDENTITY_CODING).toString());
        }
        ?? r12 = a35Var.d;
        int i2 = 0;
        if (r12 != 0) {
            int length = r12.length;
            j = 0;
            uqi.c(r12.length, 0L, length);
            hleVar = new hle(null, length, r12, i2);
            dataSourceException = null;
        } else {
            j = 0;
            if (i == 2) {
                ?? r2 = vqi.b;
                int length2 = r2.length;
                uqi.c(r2.length, 0L, length2);
                dataSourceException = null;
                hleVar = new hle(dataSourceException, length2, r2, 0);
            } else {
                dataSourceException = null;
                hleVar = null;
            }
        }
        ag5Var.e(a35.b(i), hleVar);
        y8e y8eVarB = this.e.b(ag5Var.a());
        try {
            mof mofVar = new mof();
            y8eVarB.e(new ks9(22, mofVar));
            try {
                pne pneVar = (pne) mofVar.get();
                this.i = pneVar;
                rne rneVar = pneVar.g;
                rneVar.getClass();
                this.j = rneVar.E().Q0();
                int i3 = pneVar.d;
                if (!pneVar.E()) {
                    if (i3 == 416 && j2 == p28.b(pneVar.f.a("Content-Range"))) {
                        this.k = true;
                        d(a35Var);
                        return j3 != -1 ? j3 : j;
                    }
                    try {
                        InputStream inputStream = this.j;
                        inputStream.getClass();
                        bArrB = z61.b(inputStream);
                    } catch (IOException unused2) {
                        bArrB = vqi.b;
                    }
                    byte[] bArr = bArrB;
                    TreeMap treeMapD = pneVar.f.d();
                    e();
                    throw new HttpDataSource$InvalidResponseCodeException(i3, pneVar.c, i3 == 416 ? new DataSourceException(2008) : dataSourceException, treeMapD, bArr);
                }
                rneVar.A();
                if (i3 != 200 || j2 == j) {
                    j2 = j;
                }
                if (j3 != -1) {
                    this.l = j3;
                } else {
                    long jY = rneVar.y();
                    this.l = jY != -1 ? jY - j2 : -1L;
                }
                this.k = true;
                d(a35Var);
                try {
                    g(j2);
                    return this.l;
                } catch (HttpDataSource$HttpDataSourceException e) {
                    e();
                    throw e;
                }
            } catch (InterruptedException unused3) {
                y8eVarB.d();
                throw new InterruptedIOException();
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw HttpDataSource$HttpDataSourceException.a(1, e3);
        }
    }

    public final void g(long j) throws HttpDataSource$HttpDataSourceException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[np0.r];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                InputStream inputStream = this.j;
                String str = vqi.a;
                int i = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i == -1) {
                    throw new HttpDataSource$HttpDataSourceException(2008);
                }
                j -= (long) i;
                a(i);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(2000);
                }
                throw ((HttpDataSource$HttpDataSourceException) e);
            }
        }
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        pne pneVar = this.i;
        if (pneVar != null) {
            return Uri.parse(pneVar.a.a.h);
        }
        a35 a35Var = this.h;
        if (a35Var != null) {
            return a35Var.a;
        }
        return null;
    }

    @Override // defpackage.u25
    public final Map p() {
        pne pneVar = this.i;
        return pneVar == null ? Collections.EMPTY_MAP : pneVar.f.d();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.l;
            if (j != -1) {
                long j2 = j - this.m;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.j;
                    String str = vqi.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.m += (long) i3;
                        a(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.j;
                String str2 = vqi.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.m += (long) i3;
                    a(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = vqi.a;
            throw HttpDataSource$HttpDataSourceException.a(2, e);
        }
    }
}
