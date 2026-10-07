package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.media.MediaMetadataRetriever;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dc9 implements o5j, aa9, iu3, qf, s72, v7h, wp, otb {
    public static final dc1 e = new dc1(0, -9223372036854775807L, false);
    public static final dc1 f = new dc1(2, -9223372036854775807L, false);
    public static final dc1 g = new dc1(3, -9223372036854775807L, false);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public dc9(Iterable iterable) {
        this.a = 11;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof spa) {
                arrayList.add(obj);
            }
        }
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : iterable) {
            if (obj2 instanceof o34) {
                arrayList2.add(obj2);
            }
        }
        this.c = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.d = arrayList3;
    }

    public static void t(dc9 dc9Var) {
        Context context = (Context) ((WeakReference) dc9Var.b).get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener((sa3) dc9Var.c);
    }

    public void A() {
        x99 x99Var = (x99) this.c;
        x99Var.getClass();
        x99Var.a(false);
    }

    public void B(Collection collection) {
        b81 b81Var;
        HashMap map = new HashMap(collection.size());
        Iterator it = collection.iterator();
        long j = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            b81Var = b81.a;
            if (!zHasNext) {
                break;
            }
            b81 b81Var2 = (b81) it.next();
            Iterator it2 = ((ArrayList) this.b).iterator();
            long j2 = 0;
            long j3 = 0;
            while (it2.hasNext()) {
                l71 l71Var = (l71) it2.next();
                if (b81Var2 != b81Var) {
                    try {
                        if (l71Var.d == b81Var2) {
                        }
                    } catch (Throwable unused) {
                    }
                }
                it2.remove();
                if (l71Var.a.delete()) {
                    j2++;
                    j3 += l71Var.b;
                    gm0.m("dc9", "deleteEntries: delete=%s", l71Var);
                } else {
                    gm0.s("dc9", "deleteEntries: failed to delete=%s", l71Var);
                }
                j = j;
            }
            gm0.m("dc9", "deleteEntries: cacheType=%s removed: files=%d, bytes=%d", b81Var2, Long.valueOf(j2), Long.valueOf(j3));
            j += j3;
            map.put(b81Var2, Long.valueOf(j3));
        }
        long j4 = j;
        if (collection.contains(b81.c) || collection.contains(b81Var)) {
            b78 b78VarA = vd7.A();
            eu6 eu6Var = new eu6(23);
            b78VarA.f.c(eu6Var);
            b78VarA.g.c(eu6Var);
            cn5 cn5Var = (cn5) b78VarA.c.get();
            cn5Var.b().a();
            cn5Var.c().a();
            Iterator it3 = cn5Var.a().entrySet().iterator();
            while (it3.hasNext()) {
                ((w41) ((Map.Entry) it3.next()).getValue()).a();
            }
        }
        ny8 ny8Var = ((fq6) this.d).a;
        if (collection.size() == 1 && ww3.q1(collection) == b81Var) {
            ma6 ma6Var = eq6.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : ma6Var) {
                if (((b81) obj) != b81Var) {
                    arrayList.add(obj);
                }
            }
            ((wzj) ny8Var.getValue()).c(new xkf(arrayList));
        } else {
            ((wzj) ny8Var.getValue()).c(new xkf(collection));
        }
        ((ae9) ((kz8) this.c).a.getValue()).g("ACTION_CACHE_CLEARED", s66.a);
        gm0.m("dc9", "clearCacheTypes: removed %d bytes", Long.valueOf(j4));
    }

    public void C(long j, nmc nmcVar) {
        if (nmcVar.a() < 9) {
            return;
        }
        int iM = nmcVar.m();
        int iM2 = nmcVar.m();
        int iA = nmcVar.A();
        if (iM == 434 && iM2 == 1195456820 && iA == 3) {
            ((ake) this.d).a(j, nmcVar);
        }
    }

    public LayerDrawable D(int i, int i2) {
        Drawable drawable = ((Context) this.d).getDrawable(i);
        if (drawable != null) {
            drawable.setTintList(ColorStateList.valueOf(i2));
        } else {
            drawable = null;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setAlpha(40);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawable});
        layerDrawable.setLayerInset(1, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    public void E(lj6 lj6Var, m5i m5iVar) {
        kyh[] kyhVarArr = (kyh[]) this.c;
        for (int i = 0; i < kyhVarArr.length; i++) {
            m5iVar.a();
            m5iVar.b();
            kyh kyhVarG = lj6Var.G(m5iVar.d, 3);
            b87 b87Var = (b87) ((List) this.b).get(i);
            String str = b87Var.n;
            lvb.S("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            a87 a87Var = new a87();
            m5iVar.b();
            a87Var.a = m5iVar.e;
            a87Var.l = uya.n("video/mp2t");
            a87Var.m = uya.n(str);
            a87Var.e = b87Var.e;
            a87Var.d = b87Var.d;
            a87Var.J = b87Var.K;
            a87Var.p = b87Var.q;
            ewi.n(a87Var, kyhVarG);
            kyhVarArr[i] = kyhVarG;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object F(defpackage.rt2 r12, defpackage.t73 r13, defpackage.opa r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc9.F(rt2, t73, opa, nq4):java.lang.Object");
    }

    public void G(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.b;
        rwd rwdVar = new rwd(byteArrayOutputStream, map, (HashMap) this.c, (zpb) this.d);
        if (obj == null) {
            return;
        }
        zpb zpbVar = (zpb) map.get(obj.getClass());
        if (zpbVar != null) {
            zpbVar.a(obj, rwdVar);
            return;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    public long H(b81 b81Var) {
        long j = 0;
        for (l71 l71Var : (ArrayList) this.b) {
            try {
                if (b81Var == b81.a || l71Var.d == b81Var) {
                    j += l71Var.b;
                }
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    public boolean I() {
        return ((IOException) this.d) != null;
    }

    public boolean J() {
        return ((x99) this.c) != null;
    }

    public void K(JSONObject jSONObject) {
        ru1 ru1Var = (ru1) this.b;
        xva xvaVar = (xva) this.c;
        xvaVar.getClass();
        wze wzeVar = null;
        try {
            hi1 hi1VarI = jSONObject.has("decorativeExternalParticipantId") ? kql.i(jSONObject) : null;
            yt1 yt1VarA = yt1.a(jSONObject.getString("participantId"));
            String strD = f6m.d(jSONObject, "decorativeParticipantId");
            if (strD != null) {
                yt1.a(strD);
            }
            wzeVar = new wze(yt1VarA, 1, hi1VarI);
        } catch (JSONException e2) {
            ((CidLogger) xvaVar.b).logException("ContactCallParser", "Can't parse decorative-id-changed info", e2);
        }
        if (wzeVar == null) {
            return;
        }
        hi1 hi1Var = (hi1) wzeVar.c;
        yt1 yt1Var = (yt1) wzeVar.b;
        if (hi1Var == null || ru1Var.l(yt1Var) == null) {
            return;
        }
        xq1 xq1Var = ru1Var.b;
        if (ru1Var.l(yt1Var) != null) {
            dnf dnfVarC = ru1Var.c(yt1Var);
            List listSingletonList = Collections.singletonList((du1) ru1Var.a(new smc(yt1Var, new xr8(), new xr8(), new xr8(), new xr8(), new due(hi1Var), new xr8(), new xr8(), new xr8()), dnfVarC).c);
            if (cqk.d(dnfVarC, ru1Var.k)) {
                List list = listSingletonList;
                xq1Var.a.onActiveParticipantsDeAnonimized(new v91(list, ru1Var.d(ru1Var.k).values(), ru1Var.a));
            }
            xq1Var.c.onCallParticipantsDeAnonimized(new uu1(dnfVarC, listSingletonList));
        }
        ((ye1) this.d).onDecorativeParticipantIdChanged(new we1(yt1Var, hi1Var));
    }

    public void L(z99 z99Var) {
        she sheVar = (she) this.b;
        x99 x99Var = (x99) this.c;
        if (x99Var != null) {
            x99Var.a(true);
        }
        if (z99Var != null) {
            sheVar.execute(new pi(26, z99Var));
        }
        sheVar.b.accept(sheVar.a);
    }

    public void M(pf pfVar) {
        z3d z3dVar = (z3d) ((HashMap) this.b).remove(pfVar);
        z3dVar.getClass();
        xb5 xb5Var = (xb5) ((yb5) this.d).q.get(z3dVar);
        if (xb5Var != null) {
            synchronized (xb5Var) {
                xb5Var.d--;
            }
        }
    }

    public void N(y99 y99Var, w99 w99Var, int i) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.d = null;
        x99 x99Var = new x99(this, looperMyLooper, y99Var, w99Var, i, SystemClock.elapsedRealtime());
        lvb.b0(((x99) this.c) == null);
        this.c = x99Var;
        x99Var.b();
    }

    public void O(Object obj, String str) {
        kr6 kr6Var = new kr6();
        ((kr6) this.d).c = kr6Var;
        this.d = kr6Var;
        kr6Var.b = obj;
        kr6Var.a = str;
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        r72Var.a(new pi(20, this), zjl.a());
        ((ts7) this.d).a.set(r72Var);
        return "HandlerScheduledFuture-" + ((Callable) this.c).toString();
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r10v0, types: [long] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [android.graphics.Point] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.o5j
    public Object a(lq4 lq4Var) {
        Throwable th;
        ?? r0;
        ?? r4;
        ?? r15;
        Object obj;
        ?? r5;
        Throwable thA;
        int i;
        String str;
        a4c a4cVar;
        je9 je9Var;
        ?? r6;
        long j;
        Point point;
        Throwable th2;
        Point pointG;
        long jB;
        long jC;
        Throwable th3;
        String str2 = (String) this.c;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.d;
            if (a4cVar2.b(je9Var2)) {
                r6 = "Fetch video. Local fetcher, path ";
                a4cVar2.c(je9Var2, str2, qv1.k("Fetch video. Local fetcher, path ", (String) this.b), null);
            }
        }
        long j2 = 0;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    if (mediaMetadataRetriever instanceof AutoCloseable) {
                        Log.w("compatUse", "early return cuz of mediaMetadataRetriever is AutoCloseable");
                        MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever3 = mediaMetadataRetriever2;
                            mediaMetadataRetriever3.setDataSource((Context) this.d, Uri.parse((String) this.b));
                            pointG = y3m.g(mediaMetadataRetriever3);
                            try {
                                jB = y3m.b(mediaMetadataRetriever3);
                                try {
                                    jC = y3m.c(mediaMetadataRetriever3);
                                    p90.f(mediaMetadataRetriever2, null);
                                } catch (Throwable th4) {
                                    th = th4;
                                    j = jB;
                                    point = pointG;
                                    th3 = th;
                                    try {
                                        throw th3;
                                    } catch (Throwable th5) {
                                        p90.f(mediaMetadataRetriever2, th3);
                                        throw th5;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                j = 0;
                            }
                        } catch (Throwable th7) {
                            th3 = th7;
                            point = null;
                            j = 0;
                        }
                    } else {
                        try {
                            mediaMetadataRetriever.setDataSource((Context) this.d, Uri.parse((String) this.b));
                            pointG = y3m.g(mediaMetadataRetriever);
                            try {
                                jB = y3m.b(mediaMetadataRetriever);
                                try {
                                    jC = y3m.c(mediaMetadataRetriever);
                                    mediaMetadataRetriever.release();
                                } catch (Throwable th8) {
                                    th = th8;
                                    j = jB;
                                    point = pointG;
                                    th2 = th;
                                    try {
                                        throw th2;
                                    } catch (Throwable th9) {
                                        try {
                                            mediaMetadataRetriever.release();
                                            throw th9;
                                        } catch (Throwable th10) {
                                            gm0.b(th2, th10);
                                            throw th9;
                                        }
                                    }
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                j = 0;
                            }
                        } catch (Throwable th12) {
                            th2 = th12;
                            point = null;
                            j = 0;
                        }
                    }
                    Point point2 = pointG;
                    r6 = jC;
                    j2 = jB;
                    try {
                        obj = sbi.a;
                        r5 = r6;
                        r15 = point2;
                    } catch (Throwable th13) {
                        r0 = point2;
                        th = th13;
                        r4 = r6;
                        poe poeVar = new poe(th);
                        r15 = r0;
                        obj = poeVar;
                        r5 = r4;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    r0 = r6;
                    r4 = j2;
                    j2 = jB;
                }
            } catch (Throwable th15) {
                th = th15;
                r0 = point;
                r4 = 0;
                j2 = j;
                poe poeVar2 = new poe(th);
                r15 = r0;
                obj = poeVar2;
                r5 = r4;
                ?? r10 = r5;
                thA = roe.a(obj);
                if (thA != null) {
                    str = (String) this.c;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, qv1.k("Can't get video params for path ", (String) this.b), thA);
                        }
                    }
                }
                String str3 = (String) this.b;
                if (r15 != 0) {
                    i = ((Point) r15).x;
                } else {
                    i = 0;
                }
                return new dp6(Collections.singletonList(new cp6(3, str3, i, r15 != 0 ? ((Point) r15).y : 0, (int) j2, r10)), null);
            }
        } catch (Throwable th16) {
            th = th16;
            r0 = 0;
            r4 = 0;
        }
        ?? r11 = r5;
        thA = roe.a(obj);
        if (thA != null) {
            str = (String) this.c;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, qv1.k("Can't get video params for path ", (String) this.b), thA);
                }
            }
        }
        String str4 = (String) this.b;
        if (r15 != 0) {
            i = ((Point) r15).x;
        } else {
            i = 0;
        }
        return new dp6(Collections.singletonList(new cp6(3, str4, i, r15 != 0 ? ((Point) r15).y : 0, (int) j2, r11)), null);
    }

    @Override // defpackage.aa9
    public void b() throws IOException {
        IOException iOException = (IOException) this.d;
        if (iOException != null) {
            throw iOException;
        }
        x99 x99Var = (x99) this.c;
        if (x99Var != null) {
            int i = x99Var.a;
            IOException iOException2 = x99Var.e;
            if (iOException2 != null && x99Var.f > i) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.iu3
    public i95 c(b87 b87Var, LogSessionId logSessionId) {
        i95 i95VarC = ((iu3) this.d).c(b87Var, logSessionId);
        this.b = i95VarC.c();
        return i95VarC;
    }

    @Override // defpackage.wp
    public uo d(uo uoVar) {
        un unVar = (un) ((i18) ((to) this.d)).a(new vuh((String) this.b, (Provider) this.c), uoVar);
        return uoVar.e(unVar.a, unVar.b);
    }

    @Override // defpackage.v7h
    public int e(long j) {
        long[] jArr = (long[]) this.d;
        int iB = vqi.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.iu3
    public boolean f() {
        return ((iu3) this.d).f();
    }

    @Override // defpackage.qf
    public synchronized pf g() {
        pf pfVarG;
        pfVarG = ((yb5) this.d).c.g();
        ((HashMap) this.b).put(pfVarG, (z3d) this.c);
        xb5 xb5Var = (xb5) ((yb5) this.d).q.get((z3d) this.c);
        if (xb5Var != null) {
            synchronized (xb5Var) {
                xb5Var.d++;
            }
        }
        return pfVarG;
    }

    @Override // defpackage.v7h
    public List h(long j) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                suj sujVar = (suj) list.get(i);
                yy4 yy4Var = sujVar.a;
                if (yy4Var.e == -3.4028235E38f) {
                    arrayList2.add(sujVar);
                } else {
                    arrayList.add(yy4Var);
                }
            }
        }
        Collections.sort(arrayList2, new ps0(20));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            xy4 xy4VarA = ((suj) arrayList2.get(i3)).a.a();
            xy4VarA.e = (-1) - i3;
            xy4VarA.f = 1;
            arrayList.add(xy4VarA.a());
        }
        return arrayList;
    }

    @Override // defpackage.qf
    public synchronized void i(n21 n21Var) {
        ((yb5) this.d).c.i(n21Var);
        while (n21Var != null) {
            pf pfVar = (pf) n21Var.c;
            pfVar.getClass();
            M(pfVar);
            n21Var = n21Var.d();
        }
    }

    @Override // defpackage.otb
    public void j(Task task) {
        ove oveVar = (ove) this.c;
        String str = (String) this.b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (oveVar.a) {
            oveVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // defpackage.qf
    public synchronized void k(pf pfVar) {
        ((yb5) this.d).c.k(pfVar);
        M(pfVar);
    }

    @Override // defpackage.qf
    public synchronized void l() {
        ((yb5) this.d).c.l();
    }

    @Override // defpackage.v7h
    public long m(int i) {
        long[] jArr = (long[]) this.d;
        lvb.R(i >= 0);
        lvb.R(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.iu3
    public boolean n() {
        return ((iu3) this.d).n();
    }

    @Override // defpackage.v7h
    public int o() {
        return ((long[]) this.d).length;
    }

    @Override // defpackage.iu3
    public i95 p(b87 b87Var, LogSessionId logSessionId) {
        i95 i95VarP = ((iu3) this.d).p(b87Var, logSessionId);
        this.c = i95VarP.c();
        return i95VarP;
    }

    @Override // defpackage.qf
    public synchronized int q() {
        return ((yb5) this.d).c.b;
    }

    public j28 r(JSONObject jSONObject) throws JSONException {
        List listT1;
        yt1 yt1VarA;
        cnc cncVar = (cnc) this.c;
        dnf dnfVarK = iw8.k(jSONObject);
        int iOptInt = jSONObject.optInt("participantCount", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("addedParticipantIds");
        List listB = r66.a;
        if (jSONArrayOptJSONArray != null) {
            listB = cncVar.b(jSONArrayOptJSONArray);
            listT1 = listB;
        } else {
            listT1 = listB;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("removedParticipantMarkers");
        if (jSONArrayOptJSONArray2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArrayOptJSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                jSONObject2.getClass();
                try {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("GRID");
                    yt1VarA = jSONObjectOptJSONObject == null ? null : yt1.a(jSONObjectOptJSONObject.getString("id"));
                } catch (JSONException e2) {
                    cncVar.a.logException("ParticipantParser", "Can't parse id from " + jSONObject2, e2);
                }
                if (yt1VarA != null) {
                    linkedHashSet.add(yt1VarA);
                }
            }
            listT1 = ww3.T1(linkedHashSet);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("addedParticipants");
        return new j28(dnfVarK, iOptInt, listB, jSONArrayOptJSONArray3 != null ? ((ljf) this.d).T(jSONArrayOptJSONArray3, dnfVarK) : null, listT1);
    }

    public void s(pve pveVar) {
        ((Handler) this.d).post(new nfk(this, pveVar, 1));
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 12:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                kr6 kr6Var = (kr6) ((kr6) this.c).c;
                while (kr6Var != null) {
                    Object obj = kr6Var.b;
                    sb.append(str);
                    String str2 = (String) kr6Var.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    kr6Var = (kr6) kr6Var.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 15:
                return "RtcCommandConfig{command=" + ((pve) this.b) + ", sentListener=null, successListener=" + ((tve) this.c) + ", errorListener=" + ((jl5) this.d) + ", maxRetryCount=0, minRetryTimeoutMs=200, maxRetryTimeoutMs=4000, retryBackoffFactor=2.0, retryBackoffJitter=0.1}";
            case 23:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                kr6 kr6Var2 = (kr6) ((kr6) this.c).c;
                while (kr6Var2 != null) {
                    Object obj2 = kr6Var2.b;
                    sb2.append(str);
                    String str3 = (String) kr6Var2.a;
                    if (str3 != null) {
                        sb2.append(str3);
                        sb2.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        String strDeepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb2.append((CharSequence) strDeepToString2, 1, strDeepToString2.length() - 1);
                    }
                    kr6Var2 = (kr6) kr6Var2.c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i, String str) {
        x(String.valueOf(i), str);
    }

    public void v(Object obj, String str) {
        x(obj, str);
    }

    public void w(String str, boolean z) {
        x(String.valueOf(z), str);
    }

    public void x(Object obj, String str) {
        kr6 kr6Var = new kr6();
        ((kr6) this.d).c = kr6Var;
        this.d = kr6Var;
        kr6Var.b = obj;
        kr6Var.a = str;
    }

    public int y(int i) {
        BiometricPrompt.CryptoObject cryptoObjectF;
        int i2;
        ax0 ax0Var = (ax0) this.b;
        int i3 = Build.VERSION.SDK_INT;
        int iA = 1;
        if (i3 >= 30) {
            BiometricManager biometricManager = (BiometricManager) this.c;
            if (biometricManager != null) {
                return zw0.a(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        int iZ = 0;
        if (!(i == 15 || i == 255 || (i == 32768 ? Build.VERSION.SDK_INT >= 30 : !(i == 32783 ? !((i2 = Build.VERSION.SDK_INT) < 28 || i2 > 29) : !(i == 33023 || i == 0))))) {
            return -2;
        }
        if (i != 0) {
            Context context = ax0Var.a;
            if (fx8.a(context) != null) {
                if (zcl.b(i)) {
                    KeyguardManager keyguardManagerA = fx8.a(context);
                    return keyguardManagerA == null ? false : fx8.b(keyguardManagerA) ? 0 : 11;
                }
                if (i3 != 29) {
                    if (i3 != 28) {
                        return z();
                    }
                    if (context == null || context.getPackageManager() == null || !glc.a(context.getPackageManager())) {
                        return 12;
                    }
                    KeyguardManager keyguardManagerA2 = fx8.a(ax0Var.a);
                    if (keyguardManagerA2 == null ? false : fx8.b(keyguardManagerA2)) {
                        return z() == 0 ? 0 : -1;
                    }
                    return z();
                }
                if ((i & 255) == 255) {
                    BiometricManager biometricManager2 = (BiometricManager) this.c;
                    if (biometricManager2 != null) {
                        return yw0.a(biometricManager2);
                    }
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    return 1;
                }
                Method methodC = yw0.c();
                if (methodC != null && (cryptoObjectF = xpl.f(xpl.a())) != null) {
                    try {
                        Object objInvoke = methodC.invoke((BiometricManager) this.c, cryptoObjectF);
                        if (objInvoke instanceof Integer) {
                            return ((Integer) objInvoke).intValue();
                        }
                        Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                    }
                }
                BiometricManager biometricManager3 = (BiometricManager) this.c;
                if (biometricManager3 == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                } else {
                    iA = yw0.a(biometricManager3);
                }
                String str = Build.MODEL;
                if (Build.VERSION.SDK_INT < 30 && str != null) {
                    for (String str2 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                        if (str.equals(str2)) {
                            return iA;
                        }
                    }
                }
                if (iA != 0) {
                    return iA;
                }
                KeyguardManager keyguardManagerA3 = fx8.a(ax0Var.a);
                if (!(keyguardManagerA3 == null ? false : fx8.b(keyguardManagerA3))) {
                    iZ = z();
                } else if (z() != 0) {
                    iZ = -1;
                }
                return iZ;
            }
        }
        return 12;
    }

    public int z() {
        vn7 vn7Var = (vn7) this.d;
        if (vn7Var == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = (Context) vn7Var.b;
        FingerprintManager fingerprintManagerC = fv6.c(context);
        if (fingerprintManagerC == null || !fv6.e(fingerprintManagerC)) {
            return 12;
        }
        FingerprintManager fingerprintManagerC2 = fv6.c(context);
        return (fingerprintManagerC2 == null || !fv6.d(fingerprintManagerC2)) ? 11 : 0;
    }

    public /* synthetic */ dc9(int i, Serializable serializable, Serializable serializable2, Object obj) {
        this.a = i;
        this.b = serializable;
        this.c = serializable2;
        this.d = obj;
    }

    public /* synthetic */ dc9(ove oveVar, String str, ScheduledFuture scheduledFuture) {
        this.a = 22;
        this.c = oveVar;
        this.b = str;
        this.d = scheduledFuture;
    }

    public dc9(ru1 ru1Var, xva xvaVar, ye1 ye1Var) {
        this.a = 6;
        ru1Var.getClass();
        xvaVar.getClass();
        ye1Var.getClass();
        this.b = ru1Var;
        this.c = xvaVar;
        this.d = ye1Var;
    }

    public dc9(kr6 kr6Var) {
        this.a = 15;
        this.b = (pve) kr6Var.a;
        this.c = (tve) kr6Var.b;
        this.d = (jl5) kr6Var.c;
    }

    public dc9(y3e y3eVar) {
        this.a = 21;
        this.c = new CopyOnWriteArrayList();
        this.d = new Handler(Looper.getMainLooper());
        if (y3eVar != null) {
            this.b = y3eVar;
        } else {
            ore.p("Illegal 'uncaughtExceptionHandler' value: null");
            throw null;
        }
    }

    public dc9(CidLogger cidLogger, iw8 iw8Var, cnc cncVar, ljf ljfVar) {
        this.a = 16;
        this.b = cidLogger;
        this.c = cncVar;
        this.d = ljfVar;
    }

    public dc9(Context context, String str) {
        this.a = 0;
        this.b = str;
        this.d = context;
        this.c = dc9.class.getName();
    }

    public /* synthetic */ dc9() {
        this.a = 20;
    }

    public dc9(Context context) {
        this.a = 10;
        this.d = context;
        final int i = 0;
        this.b = rx8.P(3, new af7(this) { // from class: pq8
            public final /* synthetic */ dc9 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                a8g a8gVar = pq3.j;
                dc9 dc9Var = this.b;
                switch (i2) {
                    case 0:
                        return dc9Var.D(R.drawable.icon_check, c0a.h(a8gVar, (Context) dc9Var.d).i);
                    default:
                        return dc9Var.D(R.drawable.icon_cross, c0a.h(a8gVar, (Context) dc9Var.d).j);
                }
            }
        });
        final int i2 = 1;
        this.c = rx8.P(3, new af7(this) { // from class: pq8
            public final /* synthetic */ dc9 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                a8g a8gVar = pq3.j;
                dc9 dc9Var = this.b;
                switch (i3) {
                    case 0:
                        return dc9Var.D(R.drawable.icon_check, c0a.h(a8gVar, (Context) dc9Var.d).i);
                    default:
                        return dc9Var.D(R.drawable.icon_cross, c0a.h(a8gVar, (Context) dc9Var.d).j);
                }
            }
        });
    }

    public dc9(to toVar, String str, fvb fvbVar) {
        this.a = 18;
        this.b = str == null ? "test" : str;
        this.c = fvbVar;
        this.d = toVar;
    }

    public dc9(iu3 iu3Var) {
        this.a = 5;
        this.d = iu3Var;
    }

    public dc9(ArrayList arrayList, iq6 iq6Var, kz8 kz8Var, fq6 fq6Var) {
        this.a = 4;
        this.b = arrayList;
        this.c = kz8Var;
        this.d = fq6Var;
        System.currentTimeMillis();
    }

    public dc9(ArrayList arrayList) {
        this.a = 13;
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            suj sujVar = (suj) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            jArr[i2] = sujVar.b;
            jArr[i2 + 1] = sujVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public dc9(List list) {
        this.a = 19;
        this.b = list;
        this.c = new kyh[list.size()];
        ake akeVar = new ake(new vuf(25, this));
        this.d = akeVar;
        akeVar.d(3);
    }

    public dc9(ts7 ts7Var, Handler handler, Callable callable) {
        this.a = 9;
        this.d = ts7Var;
        this.b = handler;
        this.c = callable;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dc9(String str, int i) {
        this.a = i;
        switch (i) {
            case 12:
                kr6 kr6Var = new kr6();
                this.c = kr6Var;
                this.d = kr6Var;
                this.b = str;
                break;
            case 23:
                kr6 kr6Var2 = new kr6();
                this.c = kr6Var2;
                this.d = kr6Var2;
                this.b = str;
                break;
            default:
                String strConcat = "ExoPlayer:Loader:".concat(str);
                String str2 = vqi.a;
                this(new she(Executors.newSingleThreadExecutor(new ct5(2, strConcat)), new eu6(27)));
                break;
        }
    }

    public dc9(she sheVar) {
        this.a = 1;
        this.b = sheVar;
    }

    public dc9(ax0 ax0Var) {
        this.a = 3;
        Context context = ax0Var.a;
        this.b = ax0Var;
        int i = Build.VERSION.SDK_INT;
        this.c = i >= 29 ? yw0.b(context) : null;
        this.d = i <= 29 ? new vn7(16, context) : null;
    }

    public dc9(ic0 ic0Var) {
        this.a = 2;
        this.d = ic0Var;
        Handler handlerP = vqi.p(null);
        this.b = handlerP;
        hc0 hc0Var = new hc0(this);
        this.c = hc0Var;
        ic0Var.a.registerStreamEventCallback(new gc0(0, handlerP), hc0Var);
    }

    public dc9(yb5 yb5Var, z3d z3dVar) {
        this.a = 7;
        this.d = yb5Var;
        this.b = new HashMap();
        this.c = z3dVar;
    }

    public dc9(bg6 bg6Var, Context context) {
        this.a = 8;
        this.d = bg6Var;
        this.b = new WeakReference(context);
        sa3 sa3Var = new sa3(1, this);
        this.c = sa3Var;
        context.registerDeviceIdChangeListener(new ag6(((nfh) bg6Var.w).a(bg6Var.u, null), 0), sa3Var);
    }
}
