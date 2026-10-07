package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gz4 implements u25 {
    public final u25 a;
    public final uik b;
    public final gve c;
    public long d = -1;
    public final Handler e = new Handler(Looper.getMainLooper());

    public gz4(u25 u25Var, uik uikVar, gve gveVar) {
        this.a = u25Var;
        this.b = uikVar;
        this.c = gveVar;
    }

    @Override // defpackage.u25
    public final void close() {
        this.a.close();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    @Override // defpackage.u25
    public final long f(a35 a35Var) {
        uui uuiVar;
        String str;
        String str2;
        u25 u25Var = this.a;
        long jF = u25Var.f(a35Var);
        Map mapP = u25Var.p();
        int iM = vqi.M(a35Var.a);
        uui uuiVar2 = uui.b;
        if (iM != 0) {
            uuiVar = iM != 2 ? null : uuiVar2;
        } else {
            uuiVar = uui.c;
        }
        Handler handler = this.e;
        if (uuiVar != null) {
            List list = (List) mapP.get("X-Playback-Duration");
            gve gveVar = this.c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        long j = Long.parseLong((String) it.next());
                        if (uuiVar != uuiVar2) {
                            j *= 1000;
                        }
                        if (j != this.d && gveVar != null) {
                            this.d = j;
                            handler.post(new jj2(this, j));
                            break;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        Log.e("CustomHttpDataSource", "error parse X-Playback-Duration", e);
                    }
                }
            } else {
                long j2 = 0;
                if (0 != this.d && gveVar != null) {
                    this.d = 0L;
                    handler.post(new jj2(this, j2));
                }
            }
        }
        List list2 = (List) mapP.get("X-Delivery-Type");
        List list3 = (List) mapP.get("X-Reused");
        String str3 = list2 != null ? (String) ww3.u1(0, list2) : null;
        if (str3 == null) {
            str = "http1";
        } else {
            int iHashCode = str3.hashCode();
            if (iHashCode != 3274) {
                if (iHashCode != 101593) {
                    if (iHashCode == 3482174 && str3.equals("quic")) {
                        str = "http3";
                    }
                } else if (str3.equals("h2c")) {
                    str = "http2";
                }
                str = "http1";
            } else if (str3.equals("h2")) {
                str = "http2";
            } else {
                str = "http1";
            }
        }
        if (list3 == null || (str2 = (String) ww3.u1(0, list3)) == null) {
            str2 = "0";
        }
        handler.post(new i0(this, str, str2, 15));
        return jF;
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.u25
    public final Map p() {
        return new iu7(this.a.p());
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        fz4 fz4Var = (fz4) this.b.b;
        if (!fz4Var.d && i3 > 0) {
            fz4Var.d = true;
            pgg pggVar = fz4Var.b;
            if (pggVar != null) {
                ldc ldcVar = (ldc) pggVar.a;
                ldcVar.k.p(ldcVar);
            }
        }
        return i3;
    }

    @Override // defpackage.u25
    public final void w(v1i v1iVar) {
        this.a.w(new p0k(this, v1iVar));
    }
}
