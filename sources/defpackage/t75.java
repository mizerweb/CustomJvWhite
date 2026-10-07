package defpackage;

import android.net.Uri;
import android.util.Base64;
import android.util.LruCache;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t75 {
    public final wo6 a;
    public final u50 b;
    public final m7f c;
    public final LruCache d;

    public t75(wo6 wo6Var, u50 u50Var, m7f m7fVar, wmi wmiVar) {
        this.a = wo6Var;
        this.b = u50Var;
        this.c = m7fVar;
        cqk.D(wmiVar, wk8.a());
        new HashMap();
        Collections.synchronizedMap(new yo9(200));
        this.d = new LruCache(200);
        ConcurrentHashMap.newKeySet();
    }

    public final Uri a(e70 e70Var) {
        j60 j60Var = e70Var.j;
        t60 t60Var = e70Var.g;
        Uri uri = (Uri) ((mj9) this.b.b).c(e70Var.t);
        if (uri != null) {
            return uri;
        }
        if (e70Var.h() || cqk.A(e70Var)) {
            return sb8.K((cqk.A(e70Var) ? j60Var.d.d : e70Var.d).e);
        }
        boolean zE = e70Var.e();
        us0 us0Var = us0.e;
        if (zE || cqk.z(e70Var)) {
            return sb8.K((cqk.z(e70Var) ? j60Var.d.b : e70Var.b).b(us0Var));
        }
        if (!e70Var.g() || !t60Var.i()) {
            return uri;
        }
        o60 o60VarD = t60Var.d();
        return sb8.K(o60VarD != null ? o60VarD.b(us0Var) : null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    public final Uri b(e70 e70Var, boolean z) {
        byte[] bArr;
        byte[] bArr2;
        Uri uri;
        e70 e70Var2;
        je9 je9Var = je9.f;
        s75 s75Var = new s75(e70Var.t, z);
        Uri uri2 = (Uri) this.d.get(s75Var);
        if (uri2 != null) {
            return uri2;
        }
        j60 j60Var = e70Var.j;
        if (j60Var != null && (e70Var2 = j60Var.d) != null) {
            e70Var = e70Var2;
        }
        Uri uri3 = null;
        if (((Boolean) ((f5d) this.a).a.F5.a(e5d.S6[345]).i()).booleanValue()) {
            boolean zE = e70Var.e();
            t60 t60Var = e70Var.g;
            j60 j60Var2 = e70Var.j;
            if (zE) {
                bArr = e70Var.b.g;
            } else if (e70Var.h()) {
                bArr = e70Var.d.l;
            } else if (cqk.z(e70Var)) {
                bArr = j60Var2.d.b.g;
            } else if (cqk.A(e70Var)) {
                bArr = j60Var2.d.d.l;
            } else if (e70Var.g() && t60Var.i()) {
                bArr = t60Var.d().g;
            } else {
                bArr = null;
            }
        } else {
            bArr = null;
        }
        if (bArr == null || bArr.length == 0) {
            boolean zE2 = e70Var.e();
            t60 t60Var2 = e70Var.g;
            j60 j60Var3 = e70Var.j;
            if (zE2) {
                bArr2 = e70Var.b.f;
            } else if (e70Var.h()) {
                bArr2 = e70Var.d.k;
            } else if (cqk.z(e70Var)) {
                bArr2 = j60Var3.d.b.f;
            } else if (cqk.A(e70Var)) {
                bArr2 = j60Var3.d.d.k;
            } else {
                bArr2 = (e70Var.g() && t60Var2.i()) ? t60Var2.d().f : null;
            }
            if (bArr2 != null && bArr2.length != 0) {
                if (z) {
                    try {
                        this.c.getClass();
                    } catch (Exception e) {
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "t75", "Error blurring preview bytes", e);
                        }
                    }
                }
                uri = Uri.parse("data:image/png;base64," + Base64.encodeToString(bArr2, 2));
                uri3 = uri;
                this.d.put(s75Var, uri3);
            }
        } else {
            try {
                uri = Uri.parse(lrh.a(bArr));
                uri3 = uri;
                this.d.put(s75Var, uri3);
            } catch (Throwable th) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, "t75", "Error encoding thumbhash bytes to base64 uri", th);
                }
            }
        }
        return uri3;
    }
}
