package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class qg7 implements l8e, ine, pwa, xcb {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public qg7(float[] fArr, float[] fArr2) {
        this.a = 0;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        this.b = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
        this.c = floatBufferAsFloatBuffer2;
    }

    public static String h(long j) {
        if (j == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return "Long.MAX_VALUE";
        }
        return j == Long.MIN_VALUE ? "Long.MIN_VALUE" : String.valueOf(j);
    }

    @Override // defpackage.l8e
    public void B(Object obj, zv8 zv8Var, Object obj2) {
        Object poeVar;
        Object poeVar2;
        switch (this.a) {
            case 7:
                try {
                    ps8 ps8Var = qs8.d;
                    poeVar2 = ps8Var.b(tre.A0(ps8Var.b, zfe.c(qq9.class)), obj2);
                } catch (Throwable th) {
                    poeVar2 = new poe(th);
                }
                xb9 xb9Var = (xb9) this.b;
                Throwable thA = roe.a(poeVar2);
                if (thA != null) {
                    String str = xb9Var.c;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Got error during encoding json=" + obj2 + "!", thA);
                        }
                    }
                }
                String str2 = (String) (poeVar2 instanceof poe ? null : poeVar2);
                if (str2 != null) {
                    SharedPreferences.Editor editorEdit = ((xb9) this.b).d.edit();
                    d0g.e(editorEdit, "media.autosave.settings", str2);
                    ((zr6) editorEdit).apply();
                }
                break;
            default:
                try {
                    ps8 ps8Var2 = qs8.d;
                    poeVar = ps8Var2.b(tre.A0(ps8Var2.b, zfe.c(uq.class)), obj2);
                } catch (Throwable th2) {
                    poeVar = new poe(th2);
                }
                u9c u9cVar = (u9c) this.b;
                Throwable thA2 = roe.a(poeVar);
                if (thA2 != null) {
                    String str3 = u9cVar.c;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str3, "Got error during encoding json=" + obj2 + "!", thA2);
                        }
                    }
                }
                String str4 = (String) (poeVar instanceof poe ? null : poeVar);
                if (str4 != null) {
                    SharedPreferences.Editor editorEdit2 = ((u9c) this.b).d.edit();
                    d0g.e(editorEdit2, "stat.appclock", str4);
                    ((zr6) editorEdit2).apply();
                }
                break;
        }
    }

    @Override // defpackage.xcb
    public void a() {
        ep6 ep6Var = (ep6) this.b;
        es0 es0Var = ep6Var.b;
        es0Var.c.j(es0Var, "NetworkFetchProducer");
        ep6Var.a.c();
    }

    public void b(juc jucVar) {
        ((ConcurrentHashMap) this.b).put(((pl9) this.c).h(jucVar), jucVar);
    }

    @Override // defpackage.xcb
    public void c(InputStream inputStream, int i) {
        dba dbaVar;
        qe7.v();
        vm5 vm5Var = (vm5) this.c;
        sb8 sb8Var = (sb8) vm5Var.d;
        ep6 ep6Var = (ep6) this.b;
        uj7 uj7Var = (uj7) vm5Var.c;
        qg7 qg7Var = (qg7) vm5Var.b;
        if (i > 0) {
            qg7Var.getClass();
            dbaVar = new dba((waa) qg7Var.b, i);
        } else {
            qg7Var.getClass();
            dbaVar = new dba((waa) qg7Var.b);
        }
        byte[] bArr = (byte[]) uj7Var.get(16384);
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 < 0) {
                    sb8Var.V(ep6Var, dbaVar.c);
                    vm5Var.d(dbaVar, ep6Var);
                    uj7Var.d(bArr);
                    dbaVar.close();
                    qe7.v();
                    return;
                }
                if (i2 > 0) {
                    dbaVar.write(bArr, 0, i2);
                    es0 es0Var = ep6Var.b;
                    lq0 lq0Var = ep6Var.a;
                    if (es0Var.l.p != null && es0Var.f()) {
                        sb8Var.getClass();
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        if (jUptimeMillis - ep6Var.c >= 100) {
                            ep6Var.c = jUptimeMillis;
                            es0Var.c.g(es0Var);
                            vm5.e(dbaVar, 0, lq0Var);
                        }
                    }
                    int i3 = dbaVar.c;
                    lq0Var.i(i > 0 ? i3 / i : 1.0f - ((float) Math.exp(((double) (-i3)) / 50000.0d)));
                }
            } catch (Throwable th) {
                uj7Var.d(bArr);
                dbaVar.close();
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003d  */
    @Override // defpackage.ine
    public void d(Object obj) {
        boolean z;
        c7k c7kVar;
        nj9 nj9Var = (nj9) this.c;
        qu4 qu4Var = (qu4) this.b;
        synchronized (nj9Var) {
            synchronized (nj9Var) {
                z = false;
                oc9.r(qu4Var.c > 0);
                qu4Var.c--;
            }
            au3.E(nj9Var.o(qu4Var));
            if (!z) {
                qu4Var = null;
            }
            if (qu4Var != null && (c7kVar = qu4Var.e) != null) {
                c7kVar.w(qu4Var.a, true);
            }
            nj9Var.m();
            nj9Var.j();
        }
        synchronized (nj9Var) {
            try {
                if (!qu4Var.d && qu4Var.c == 0) {
                    nj9Var.a.k(qu4Var.a, qu4Var);
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        au3.E(nj9Var.o(qu4Var));
        if (!z) {
            qu4Var = null;
        }
        if (qu4Var != null) {
            c7kVar.w(qu4Var.a, true);
        }
        nj9Var.m();
        nj9Var.j();
    }

    public void e(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(qt4.q(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    public tsb f(String str) {
        ag5 ag5Var = new ag5(3);
        ag5Var.h(str);
        pne pneVarF = ((qsb) ((ny8) this.c).getValue()).b(ag5Var.a()).f();
        if (!pneVarF.E()) {
            y9g.c((y9g) ((ny8) this.b).getValue(), p90.O(Integer.valueOf(pneVarF.d), "code"));
        }
        return new tsb(pneVarF);
    }

    public int g(List list, kw7 kw7Var, int i, boolean z) {
        boolean z2 = false;
        if (list.isEmpty()) {
            return 0;
        }
        Comparator comparator = (Comparator) ((d2) this.c).invoke();
        int iV = oc9.v(i, 0, list.size());
        int iO0 = xw3.O0(list);
        int i2 = iV - 1;
        while (iV <= iO0) {
            int i3 = (iV + iO0) >>> 1;
            kw7 kw7Var2 = (kw7) list.get(i3);
            if (kw7Var2 instanceof jw7) {
                if (z) {
                    iV = i3 + 1;
                } else {
                    iO0 = i3 - 1;
                }
            } else if (comparator.compare(kw7Var2, kw7Var) <= 0) {
                iV = i3 + 1;
                i2 = i3;
            } else {
                iO0 = i3 - 1;
            }
        }
        int iV2 = oc9.v(i2 + 1, 0, list.size());
        if (iV2 < list.size() && (list.get(iV2) instanceof jw7)) {
            int i4 = iV2 + 1;
            int size = list.size();
            if (i4 > size) {
                i4 = size;
            }
            kw7 kw7Var3 = (kw7) ww3.u1(i4, list);
            if (kw7Var3 == null || comparator.compare(kw7Var3, kw7Var) >= 0) {
                return i4;
            }
            int i5 = i4 + 1;
            int size2 = list.size();
            if (i5 > size2) {
                i5 = size2;
            }
            return g(list, kw7Var, i5, z);
        }
        kw7 kw7Var4 = (kw7) ww3.u1(iV2, list);
        int i6 = iV2 + 1;
        kw7 kw7Var5 = (kw7) ww3.u1(i6, list);
        if (kw7Var5 instanceof jw7) {
            i6 = iV2 + 2;
            kw7Var5 = (kw7) ww3.u1(i6, list);
        }
        boolean z3 = kw7Var4 != null && comparator.compare(kw7Var4, kw7Var) < 0;
        if (kw7Var5 != null && comparator.compare(kw7Var5, kw7Var) > 0) {
            z2 = true;
        }
        if (!z3 || !z2) {
            return iV2;
        }
        int size3 = list.size();
        return i6 > size3 ? size3 : i6;
    }

    public ix2 i() {
        return (ix2) this.b;
    }

    public x2d j() {
        mu9 mu9Var = (mu9) this.b;
        d38 d38VarA = mu9Var.e.a();
        if (d38VarA != null) {
            try {
                return d38VarA.getPlaybackState();
            } catch (RemoteException | SecurityException e) {
                lvb.l0("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = mu9Var.a.getPlaybackState();
        if (playbackState != null) {
            return x2d.a(playbackState);
        }
        return null;
    }

    public ix2 k() {
        return (ix2) this.c;
    }

    public synchronized Map l() {
        try {
            if (((Map) this.c) == null) {
                this.c = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.c;
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        Object poeVar;
        Object obj2;
        Object poeVar2;
        switch (this.a) {
            case 7:
                String str = (String) d0g.d(zfe.a(String.class), ((xb9) this.b).d, null, "media.autosave.settings");
                if (str != null) {
                    xb9 xb9Var = (xb9) this.b;
                    try {
                        ps8 ps8Var = qs8.d;
                        poeVar = ps8Var.a(tre.A0(ps8Var.b, zfe.c(qq9.class)), str);
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    Throwable thA = roe.a(poeVar);
                    if (thA != null) {
                        String str2 = xb9Var.c;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str2, c0a.o("Got error during decoding json=", str, "!"), thA);
                            }
                        }
                    }
                    obj2 = poeVar instanceof poe ? null : poeVar;
                    if (obj2 != null) {
                        return obj2;
                    }
                    break;
                }
                return (qq9) this.c;
            default:
                String str3 = (String) d0g.d(zfe.a(String.class), ((u9c) this.b).d, null, "stat.appclock");
                if (str3 != null) {
                    u9c u9cVar = (u9c) this.b;
                    try {
                        ps8 ps8Var2 = qs8.d;
                        poeVar2 = ps8Var2.a(tre.A0(ps8Var2.b, zfe.c(uq.class)), str3);
                    } catch (Throwable th2) {
                        poeVar2 = new poe(th2);
                    }
                    Throwable thA2 = roe.a(poeVar2);
                    if (thA2 != null) {
                        String str4 = u9cVar.c;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.f;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str4, c0a.o("Got error during decoding json=", str3, "!"), thA2);
                            }
                        }
                    }
                    obj2 = poeVar2 instanceof poe ? null : poeVar2;
                    if (obj2 != null) {
                        return obj2;
                    }
                    break;
                }
                return (uq) this.c;
        }
    }

    public ft0 n() {
        MediaController.TransportControls transportControls = ((mu9) this.b).a.getTransportControls();
        return Build.VERSION.SDK_INT >= 29 ? new pu9(transportControls) : new ft0(transportControls);
    }

    public void o(List list, List list2) {
        kw7 kw7Var;
        int iIndexOf;
        int iIndexOf2;
        je9 je9Var = je9.d;
        boolean z = ww3.t1(list2) instanceof jw7;
        boolean z2 = ww3.D1(list2) instanceof jw7;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kw7 kw7Var2 = (kw7) it.next();
            if (!(kw7Var2 instanceof jw7)) {
                linkedHashSet.add(Long.valueOf(kw7Var2.getA()));
            }
        }
        List<kw7> listW0 = yhf.w0(yhf.n0(yhf.n0(new sw(1, list2), new ik4(7)), new qy2(linkedHashSet, 1)));
        if (listW0.isEmpty()) {
            ((qg7) this.b).r("Early return in insertItems cuz of filtered.isEmpty()");
            return;
        }
        if (list.isEmpty()) {
            ((qg7) this.b).r("insertItems: main list is empty, insert all");
            list.addAll(listW0);
            z = z;
            z2 = z2;
            listW0 = listW0;
        } else {
            Comparator comparator = (Comparator) ((d2) this.c).invoke();
            kw7 kw7Var3 = (kw7) ww3.r1(listW0);
            kw7 kw7Var4 = (kw7) ww3.B1(listW0);
            ((qg7) this.b).q(new x5(kw7Var3, 16, kw7Var4));
            int iG = g(list, kw7Var3, 0, true);
            kw7 kw7Var5 = (kw7) ww3.u1(iG, list);
            if (kw7Var5 == null || (kw7Var5 instanceof jw7)) {
                kw7Var5 = null;
            }
            String str = (String) ((qg7) this.b).b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qt4.l("insertItems: found insert index:", iG, list.size(), ", curSize:"), null);
            }
            if (kw7Var5 != null) {
                String str2 = (String) ((qg7) this.b).b;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    long a = kw7Var5.getA();
                    long c = kw7Var5.getC();
                    StringBuilder sbS = qt4.s(a, "insertItems: insertIndex item exist - ", ":");
                    sbS.append(c);
                    a4cVar2.c(je9Var, str2, sbS.toString(), null);
                }
                z2 = z2;
                listW0 = listW0;
                kw7Var = null;
            } else {
                z = z;
                kw7Var = (kw7) ww3.u1(iG + 1, list);
                if (kw7Var == null || (kw7Var instanceof jw7)) {
                    kw7Var = null;
                }
                if (kw7Var != null) {
                    String str3 = (String) ((qg7) this.b).b;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        long a2 = kw7Var.getA();
                        long c2 = kw7Var.getC();
                        StringBuilder sbS2 = qt4.s(a2, "insertItems: next item exist - ", ":");
                        sbS2.append(c2);
                        a4cVar3.c(je9Var, str3, sbS2.toString(), null);
                    }
                    kw7Var = kw7Var;
                } else {
                    z2 = z2;
                    listW0 = listW0;
                }
            }
            if ((kw7Var5 == null || comparator.compare(kw7Var4, kw7Var5) <= 0) && (kw7Var == null || comparator.compare(kw7Var4, kw7Var) <= 0)) {
                ((qg7) this.b).r("insertItems: addAll");
                list.addAll(iG, listW0);
            } else {
                ((qg7) this.b).r("insertItems: overlaps");
                if (listW0.isEmpty()) {
                    ((qg7) this.b).r("Early return in insertItemsOneByOneSorted cuz of sortedItems.isEmpty()");
                } else {
                    int i = 0;
                    for (kw7 kw7Var6 : listW0) {
                        int iG2 = g(list, kw7Var6, i, false);
                        list.add(iG2, kw7Var6);
                        i = iG2 + 1;
                    }
                }
            }
        }
        if (z && (iIndexOf2 = list.indexOf(ww3.r1(listW0))) > 0 && !(list.get(iIndexOf2 - 1) instanceof jw7)) {
            ((qg7) this.b).r("insertItems: insert first GAP");
            list.add(iIndexOf2, new jw7());
        }
        if (!z2 || (iIndexOf = list.indexOf(ww3.B1(listW0))) < 0) {
            return;
        }
        if (iIndexOf == xw3.O0(list)) {
            if (ww3.B1(list) instanceof jw7) {
                return;
            }
        } else if (list.get(iIndexOf + 1) instanceof jw7) {
            return;
        }
        ((qg7) this.b).r("insertItems: insert last GAP");
        list.add(iIndexOf + 1, new jw7());
    }

    @Override // defpackage.xcb
    public void onFailure(Throwable th) {
        ep6 ep6Var = (ep6) this.b;
        es0 es0Var = ep6Var.b;
        es0Var.c.b(es0Var, "NetworkFetchProducer", th, null);
        es0 es0Var2 = ep6Var.b;
        es0Var2.c.e(es0Var2, "NetworkFetchProducer", false);
        es0Var2.h("network", "default");
        ep6Var.a.e(th);
    }

    public boolean p(s3a s3aVar, String str) {
        int i = s3aVar.b;
        Context context = (Context) this.b;
        if (i < 0) {
            return context.getPackageManager().checkPermission(str, s3aVar.a) == 0;
        }
        return context.checkPermission(str, i, s3aVar.c) == 0;
    }

    public void q(af7 af7Var) {
        String str = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, (String) af7Var.invoke(), null);
        }
    }

    public void r(String str) {
        gm0.n((String) this.b, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(String str, nq4 nq4Var) {
        z4c z4cVar;
        if (nq4Var instanceof z4c) {
            z4cVar = (z4c) nq4Var;
            int i = z4cVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                z4cVar.f = i - Integer.MIN_VALUE;
            } else {
                z4cVar = new z4c(this, nq4Var);
            }
        } else {
            z4cVar = new z4c(this, nq4Var);
        }
        Object objA = z4cVar.d;
        int i2 = z4cVar.f;
        if (i2 == 0) {
            ch3.d0(objA);
            ag5 ag5Var = new ag5(3);
            ag5Var.h(str);
            y8e y8eVarB = ((qsb) ((ny8) this.c).getValue()).b(ag5Var.a());
            z4cVar.f = 1;
            objA = zdl.a(y8eVarB, z4cVar);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objA);
        }
        pne pneVar = (pne) objA;
        if (!pneVar.E()) {
            y9g.c((y9g) ((ny8) this.b).getValue(), p90.O(new Integer(pneVar.d), "code"));
        }
        return new tsb(pneVar);
    }

    public String toString() {
        switch (this.a) {
            case 16:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ qg7(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ qg7(Object obj) {
        this.a = 16;
        yab.s(obj);
        this.c = obj;
        this.b = new ArrayList();
    }

    public /* synthetic */ qg7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public qg7(int i, int i2, ColorSpace colorSpace) {
        this.a = 5;
        this.b = colorSpace;
        this.c = (i == -1 || i2 == -1) ? null : new ylc(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public qg7(rre rreVar) {
        this.a = 6;
        this.b = rreVar;
        this.c = Collections.newSetFromMap(new IdentityHashMap());
    }

    public qg7(c5b c5bVar, p3c p3cVar, wwa wwaVar) {
        this.a = 14;
        v2a v2aVar = new v2a(15);
        gvb gvbVar = new gvb();
        gvbVar.b = p3cVar;
        gvbVar.c = wwaVar;
        gvbVar.d = v2aVar;
        gvbVar.a = new ConcurrentHashMap();
        this.b = c5bVar;
        this.c = gvbVar;
    }

    public qg7(pl9 pl9Var) {
        this.a = 9;
        this.b = new ConcurrentHashMap();
        this.c = pl9Var;
    }

    public qg7(int i) {
        this.a = i;
        switch (i) {
            case 4:
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                this.b = config;
                this.c = config;
                break;
            case 12:
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    public qg7(Context context, u2a u2aVar) {
        this.a = 10;
        this.c = Collections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new nu9(context, u2aVar);
        } else {
            this.b = new mu9(context, u2aVar);
        }
    }

    public qg7(jv9 jv9Var, Looper looper) {
        this.a = 11;
        this.c = jv9Var;
        this.b = new Handler(looper, new q89(1, this));
    }
}
