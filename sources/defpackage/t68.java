package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.apache.http.client.methods.HttpGet;

/* JADX INFO: loaded from: classes.dex */
public final class t68 extends sb8 {
    public final ny8 l;
    public final ny8 m;
    public qsb n;
    public ExecutorService o;

    public t68(ny8 ny8Var, ny8 ny8Var2) {
        this.l = ny8Var;
        this.m = ny8Var2;
    }

    public static void w0(t68 t68Var, y8e y8eVar, Exception exc, xcb xcbVar) {
        if (y8eVar.p) {
            xcbVar.a();
        } else {
            xcbVar.onFailure(exc);
        }
    }

    public static boolean x0(t68 t68Var, dle dleVar, int i, usb usbVar, xcb xcbVar, s68 s68Var) {
        k28 k28Var;
        String str;
        String strB;
        boolean z = s68Var.a;
        HashSet hashSet = (HashSet) s68Var.b;
        if (!z2m.c(i, z) || (k28Var = dleVar.a) == null || (strB = z2m.b((str = k28Var.d), (Map) s68Var.c, hashSet)) == null) {
            return false;
        }
        hashSet.add(strB);
        t84 t84VarG = k28Var.g();
        t84VarG.l(strB);
        k28 k28VarC = t84VarG.c();
        ag5 ag5VarA = dleVar.a();
        ag5VarA.a = k28VarC;
        ag5VarA.g(UUID.randomUUID().toString());
        dle dleVarA = ag5VarA.a();
        gm0.W("OkHttpNetworkFetchProducer", "failover image host %s -> %s after HTTP %d", str, strB, Integer.valueOf(i));
        t68Var.z0(usbVar, xcbVar, dleVarA, s68Var);
        return true;
    }

    @Override // defpackage.sb8
    /* JADX INFO: renamed from: A0 */
    public final Map E(usb usbVar, int i) {
        mw mwVar = new mw(4);
        mwVar.put("queue_time", Long.toString(usbVar.e - usbVar.d));
        mwVar.put("fetch_time", Long.toString(usbVar.f - usbVar.e));
        mwVar.put("total_time", Long.toString(usbVar.f - usbVar.d));
        mwVar.put("image_size", Integer.toString(i));
        return mwVar;
    }

    @Override // defpackage.sb8
    public final void V(ep6 ep6Var, int i) {
        ((usb) ep6Var).f = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.sb8
    public final ep6 m(lq0 lq0Var, es0 es0Var) {
        return new usb(lq0Var, es0Var);
    }

    @Override // defpackage.sb8
    /* JADX INFO: renamed from: y0 */
    public final void v(usb usbVar, xcb xcbVar) {
        usbVar.d = SystemClock.elapsedRealtime();
        Uri uri = usbVar.b.a.b;
        try {
            ag5 ag5Var = new ag5(3);
            String string = new h71(false, true, -1, -1, false, false, false, -1, -1, false, false, false, null).toString();
            int length = string.length();
            p3c p3cVar = (p3c) ag5Var.c;
            if (length == 0) {
                p3cVar.n("Cache-Control");
            } else {
                p3cVar.s("Cache-Control", string);
            }
            ag5Var.h(uri.toString());
            p3c p3cVar2 = (p3c) ag5Var.c;
            p3cVar2.getClass();
            e9i.u("Accept");
            e9i.x("image/webp,/;q=0.8", "Accept");
            ArrayList arrayList = (ArrayList) p3cVar2.b;
            arrayList.add("Accept");
            arrayList.add(r5h.y1("image/webp,/;q=0.8").toString());
            ag5Var.e(HttpGet.METHOD_NAME, null);
            ag5Var.g(UUID.randomUUID().toString());
            dle dleVarA = ag5Var.a();
            e5d e5dVar = (e5d) this.m.getValue();
            s68 s68Var = new s68((Map) e5dVar.g().i(), ((Boolean) e5dVar.j2.a(e5d.S6[165]).i()).booleanValue());
            k28 k28Var = dleVarA.a;
            if (k28Var != null) {
                ((HashSet) s68Var.b).add(k28Var.d);
            }
            z0(usbVar, xcbVar, dleVarA, s68Var);
        } catch (Exception e) {
            xcbVar.onFailure(e);
        }
    }

    public final void z0(usb usbVar, xcb xcbVar, dle dleVar, s68 s68Var) {
        qsb qsbVar = this.n;
        ny8 ny8Var = this.l;
        if (qsbVar == null) {
            this.n = (qsb) ny8Var.getValue();
        }
        qsb qsbVar2 = this.n;
        if (this.o == null) {
            this.o = ((qsb) ny8Var.getValue()).a.p();
        }
        y8e y8eVarB = qsbVar2.b(dleVar);
        usbVar.b.a(new r68(this, 0, y8eVarB));
        ag5 ag5Var = new ag5();
        ag5Var.e = this;
        ag5Var.a = usbVar;
        ag5Var.b = dleVar;
        ag5Var.c = xcbVar;
        ag5Var.d = s68Var;
        y8eVarB.e(ag5Var);
    }
}
