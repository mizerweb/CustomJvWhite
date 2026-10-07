package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q36 implements x18, iw7 {
    public static final long[] e = new long[0];
    public long a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    public q36(String str, List list) {
        long length;
        byte[] bArr;
        x18 x18Var;
        long contentLength;
        this.b = str;
        this.c = list;
        this.d = "multipart/form-data; boundary=".concat(str);
        List list2 = list;
        long j = -1;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            List<w18> list3 = (List) this.c;
            length = ((long) u18.b.length) + ((long) u18.b((String) this.b)) + ((long) u18.a.length);
            for (w18 w18Var : list3) {
                long length2 = length + ((long) u18.b.length) + ((long) u18.b((String) this.b));
                bArr = u18.a;
                long length3 = length2 + ((long) bArr.length);
                x18Var = w18Var.a;
                if (x18Var.getContentLength() < 0) {
                    contentLength = -1;
                } else {
                    contentLength = x18Var.getContentLength() + ((long) (u18.b(w18Var.b) + bArr.length)) + ((long) bArr.length);
                }
                length = length3 + contentLength;
            }
            j = length;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((w18) it.next()).a.getContentLength() < 0) {
                }
            }
            List<w18> list4 = (List) this.c;
            length = ((long) u18.b.length) + ((long) u18.b((String) this.b)) + ((long) u18.a.length);
            while (r13.hasNext()) {
                long length4 = length + ((long) u18.b.length) + ((long) u18.b((String) this.b));
                bArr = u18.a;
                long length5 = length4 + ((long) bArr.length);
                x18Var = w18Var.a;
                if (x18Var.getContentLength() < 0) {
                    contentLength = -1;
                } else {
                    contentLength = x18Var.getContentLength() + ((long) (u18.b(w18Var.b) + bArr.length)) + ((long) bArr.length);
                }
                length = length5 + contentLength;
            }
            j = length;
        }
        this.a = j;
    }

    public void a(long j) {
        c9h c9hVar = (c9h) this.d;
        if (this.a != j) {
            this.a = j;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c9hVar.a = jElapsedRealtime;
            ((y36) this.b).a(((uw) this.c).d(j, jElapsedRealtime));
        }
    }

    public void b(ixa ixaVar, int i) {
        qyj.h("Invalid metering mode " + i, i >= 1 && i <= 7);
        if ((i & 1) != 0) {
            ((ArrayList) this.b).add(ixaVar);
        }
        if ((i & 2) != 0) {
            ((ArrayList) this.c).add(ixaVar);
        }
    }

    @Override // defpackage.iw7
    public hw7 g() {
        int iOrdinal = ((mg5) this.b).ordinal();
        if (iOrdinal == 0) {
            return (lzb) ((ifh) this.c).getValue();
        }
        if (iOrdinal == 1) {
            return (kzb) ((ifh) this.d).getValue();
        }
        ore.o();
        return null;
    }

    @Override // defpackage.x18
    public long getContentLength() {
        return this.a;
    }

    @Override // defpackage.x18
    public String getContentType() {
        return (String) this.d;
    }

    @Override // defpackage.x18
    public void writeTo(OutputStream outputStream) throws IOException {
        String str = (String) this.b;
        for (w18 w18Var : (List) this.c) {
            outputStream.write(u18.b);
            u18.c(outputStream, str);
            byte[] bArr = u18.a;
            outputStream.write(bArr);
            u18.c(outputStream, w18Var.b);
            outputStream.write(bArr);
            w18Var.a.writeTo(outputStream);
            outputStream.write(bArr);
        }
        byte[] bArr2 = u18.b;
        outputStream.write(bArr2);
        u18.c(outputStream, str);
        outputStream.write(bArr2);
    }

    public q36(c9h c9hVar) {
        this.d = c9hVar;
        this.b = new y36(0.3d, 0.0d, 6);
        this.c = new uw(1);
    }

    public q36(String str, long j, x60 x60Var, tf7 tf7Var) {
        this.b = str;
        this.a = j;
        this.c = x60Var;
        this.d = tf7Var;
    }
}
