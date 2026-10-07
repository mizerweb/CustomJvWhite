package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.ProcessingException;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public class g85 implements ee6, h74, v7h, sf7 {
    public static int f;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public g85(v64 v64Var, h74 h74Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<ph5> set = v64Var.c;
        Set set2 = v64Var.g;
        for (ph5 ph5Var : set) {
            int i = ph5Var.c;
            int i2 = ph5Var.b;
            boolean z = i == 0;
            x0e x0eVar = ph5Var.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(x0eVar);
                } else {
                    hashSet.add(x0eVar);
                }
            } else if (i == 2) {
                hashSet3.add(x0eVar);
            } else if (i2 == 2) {
                hashSet5.add(x0eVar);
            } else {
                hashSet2.add(x0eVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(x0e.a(ryd.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.c = Collections.unmodifiableSet(hashSet4);
        this.d = Collections.unmodifiableSet(hashSet5);
        this.e = h74Var;
    }

    public static g85 D(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        g85 g85Var = new g85();
        g85Var.d = new ArrayDeque();
        g85Var.a = sharedPreferences;
        g85Var.b = "topic_operation_queue";
        g85Var.c = ",";
        g85Var.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) g85Var.d)) {
            try {
                ((ArrayDeque) g85Var.d).clear();
                String string = ((SharedPreferences) g85Var.a).getString((String) g85Var.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) g85Var.c)) {
                    String[] strArrSplit = string.split((String) g85Var.c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) g85Var.d).add(str);
                        }
                    }
                    return g85Var;
                }
                return g85Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void W(byte[] bArr, Uri uri) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                new n15().n(uri, byteArrayInputStream);
                byteArrayInputStream.close();
                Log.d("DashManifestRefresher", "Manifest validated uri=" + uri);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(byteArrayInputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Log.e("DashManifestRefresher", "Failed to parse DASH MPD uri=" + uri, e);
            throw new IOException("Failed to parse DASH MPD", e);
        }
    }

    public static hnf s(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1881281404) {
            if (str.equals("REMOVE")) {
                return hnf.b;
            }
            return null;
        }
        if (iHashCode == -1785516855) {
            if (str.equals("UPDATE")) {
                return hnf.a;
            }
            return null;
        }
        if (iHashCode == -873347853) {
            if (str.equals("ACTIVATE")) {
                return hnf.c;
            }
            return null;
        }
        if (iHashCode == -595928767 && str.equals("TIMEOUT")) {
            return hnf.d;
        }
        return null;
    }

    public static final void t(g85 g85Var) {
        SparseArray sparseArray = (SparseArray) g85Var.d;
        SparseArray sparseArray2 = (SparseArray) g85Var.c;
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray2.keyAt(i);
            vpg vpgVar = (vpg) sparseArray2.valueAt(i);
            vpgVar.getClass();
            List arrayList = (List) sparseArray.get(0);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(0, arrayList);
            }
            arrayList.add(vpgVar);
        }
        sparseArray2.clear();
        ((SparseArray) g85Var.e).clear();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x007c, B:26:0x0052, B:28:0x0058, B:29:0x005c, B:31:0x0060, B:32:0x006b, B:22:0x0043, B:25:0x004f, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x007c, B:26:0x0052, B:28:0x0058, B:29:0x005c, B:31:0x0060, B:32:0x006b, B:22:0x0043, B:25:0x004f, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0058 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x007c, B:26:0x0052, B:28:0x0058, B:29:0x005c, B:31:0x0060, B:32:0x006b, B:22:0x0043, B:25:0x004f, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060 A[Catch: all -> 0x0034, LOOP:0: B:29:0x005c->B:31:0x0060, LOOP_END, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x007c, B:26:0x0052, B:28:0x0058, B:29:0x005c, B:31:0x0060, B:32:0x006b, B:22:0x0043, B:25:0x004f, B:19:0x003c), top: B:40:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0079 -> B:35:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0043
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final void u(defpackage.g85 r7, defpackage.nq4 r8) {
        /*
            java.lang.Object r0 = r7.d
            p41 r0 = (defpackage.p41) r0
            java.lang.Object r1 = r7.e
            zv r1 = (defpackage.zv) r1
            boolean r2 = r8 instanceof defpackage.gjd
            if (r2 == 0) goto L1b
            r2 = r8
            gjd r2 = (defpackage.gjd) r2
            int r3 = r2.g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.g = r3
            goto L20
        L1b:
            gjd r2 = new gjd
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.e
            int r3 = r2.g
            hu4 r4 = defpackage.hu4.a
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L40
            if (r3 == r6) goto L3c
            if (r3 != r5) goto L36
            int r3 = r2.d
            defpackage.ch3.d0(r8)     // Catch: java.lang.Throwable -> L34
            goto L7c
        L34:
            r8 = move-exception
            goto L81
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return
        L3c:
            defpackage.ch3.d0(r8)     // Catch: java.lang.Throwable -> L34
            goto L4f
        L40:
            defpackage.ch3.d0(r8)
        L43:
            r2.g = r6     // Catch: java.lang.Throwable -> L34
            r0.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = defpackage.p41.J(r0, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r4) goto L4f
            goto L7b
        L4f:
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
        L52:
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L43
            java.lang.Object r8 = r0.h()     // Catch: java.lang.Throwable -> L34
        L5c:
            boolean r3 = r8 instanceof defpackage.cs2     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L6b
            defpackage.ds2.b(r8)     // Catch: java.lang.Throwable -> L34
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.h()     // Catch: java.lang.Throwable -> L34
            goto L5c
        L6b:
            int r3 = r1.c     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r7.b     // Catch: java.lang.Throwable -> L34
            m20 r8 = (defpackage.m20) r8     // Catch: java.lang.Throwable -> L34
            r2.d = r3     // Catch: java.lang.Throwable -> L34
            r2.g = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r8.invoke(r1, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r4) goto L7c
        L7b:
            return
        L7c:
            int r8 = r1.c     // Catch: java.lang.Throwable -> L34
            if (r3 != r8) goto L52
            goto L43
        L81:
            r7.Q(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g85.u(g85, nq4):void");
    }

    public void A() {
        try {
            u25 u25Var = (u25) this.d;
            if (u25Var != null) {
                u25Var.close();
            }
        } catch (Exception e) {
            Log.e("DashManifestRefresher", "close data source exception", e);
        } finally {
            this.d = null;
        }
    }

    public wb2 B(jd2 jd2Var, Map map, Map map2) {
        zqh zqhVar = (zqh) this.a;
        se2 se2Var = (se2) this.b;
        int i = se2Var.i;
        i4h i4hVar = (i4h) this.c;
        d5h d5hVar = (d5h) this.e;
        lc2 lc2Var = (lc2) this.d;
        lc2Var.b.getClass();
        se2Var.o.getClass();
        ag2 ag2Var = bg2.U;
        bg2 bg2VarD = lc2Var.a.d(se2Var.a);
        ag2Var.getClass();
        return new wb2(jd2Var, zqhVar, i, map, map2, i4hVar, d5hVar, ag2.b(bg2VarD));
    }

    public void C(pf2 pf2Var, pf2 pf2Var2, zbh zbhVar, zbh zbhVar2, Map.Entry entry) {
        zbh zbhVar3 = (zbh) entry.getValue();
        tvj.a("DualSurfaceProcessorNode", "     -> outputEdge = " + zbhVar3);
        zi0 zi0Var = new zi0(zbhVar.g.a, ((eh0) entry.getKey()).a.d, zbhVar.c ? pf2Var : null, ((eh0) entry.getKey()).a.f, ((eh0) entry.getKey()).a.g);
        zi0 zi0Var2 = new zi0(zbhVar2.g.a, ((eh0) entry.getKey()).b.d, zbhVar2.c ? pf2Var2 : null, ((eh0) entry.getKey()).b.f, ((eh0) entry.getKey()).b.g);
        int i = ((eh0) entry.getKey()).a.c;
        zbhVar3.getClass();
        wxl.a();
        zbhVar3.b();
        qyj.l("Consumer can only be linked once.", !zbhVar3.j);
        zbhVar3.j = true;
        ybh ybhVar = zbhVar3.l;
        o9b.a(o9b.j(ybhVar.c(), new xbh(zbhVar3, ybhVar, i, zi0Var, zi0Var2), zjl.d()), new xp9(this, zbhVar3, false, 15), zjl.d());
    }

    public byte[] E(Uri uri) throws IOException {
        u25 u25VarA = ((s25) this.a).a();
        this.d = u25VarA;
        Map map = Collections.EMPTY_MAP;
        lvb.W(uri, "The uri must be set.");
        a35 a35Var = new a35(uri, 0L, 1, null, map, 0L, -1L, null, 1, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        try {
            try {
                Log.d("DashManifestRefresher", "Downloading manifest uri=" + uri);
                u25VarA.f(a35Var);
                while (true) {
                    int i = u25VarA.read(bArr, 0, 8192);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    A();
                    throw th;
                }
                A();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray.length != 0) {
                    Log.d("DashManifestRefresher", "Downloaded manifest size=" + byteArray.length + " uri=" + uri);
                    return byteArray;
                }
                Log.e("DashManifestRefresher", "Downloaded manifest is empty uri=" + uri);
                throw new IOException("Downloaded DASH manifest is empty (uri=" + uri + ")");
            } catch (Exception e) {
                Log.e("DashManifestRefresher", "Failed to download manifest uri=" + uri, e);
                throw new IOException("Failed to download DASH manifest (uri=" + uri + ")", e);
            }
        } catch (Throwable th) {
            A();
            throw th;
        }
    }

    public p3a F() {
        ms9 ms9Var = ((y3a) this.d).f;
        if (ms9Var != null) {
            return ms9Var.d;
        }
        ore.k("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        return null;
    }

    public Object G(int i) {
        SparseArray sparseArray = (SparseArray) this.e;
        if (sparseArray.indexOfKey(i) >= 0) {
            return sparseArray.get(i);
        }
        Object objG = ((aqg) this.b).G(i);
        sparseArray.put(i, objG);
        return objG;
    }

    public vpg H(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        aqg aqgVar = (aqg) this.b;
        SparseArray sparseArray = (SparseArray) this.c;
        vpg vpgVarP = (vpg) sparseArray.get(i);
        if (vpgVarP == null) {
            SparseArray sparseArray2 = (SparseArray) this.d;
            aqgVar.getClass();
            List list = (List) sparseArray2.get(0);
            List list2 = list;
            vpgVarP = (list2 == null || list2.isEmpty()) ? aqgVar.p(recyclerView) : (vpg) list.remove(0);
            sparseArray.put(i, vpgVarP);
            aqgVar.R(vpgVarP, i);
            View view = vpgVarP.a;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(marginLayoutParams.width == -1 ? View.MeasureSpec.makeMeasureSpec((recyclerView.getMeasuredWidth() - marginLayoutParams.rightMargin) - recyclerView.getScrollBarSize(), 1073741824) : ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredWidth(), 0, view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredHeight(), 0, view.getLayoutParams().height));
            yab.j0(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), view, (RecyclerView) this.a);
            vpgVarP.b = marginLayoutParams.getMarginStart();
            vpgVarP.c = marginLayoutParams.topMargin;
        }
        return vpgVarP;
    }

    public Surface I() {
        return (Surface) this.a;
    }

    public void J(cf7 cf7Var) {
        int i;
        int i2;
        EGLDisplay eGLDisplay = (EGLDisplay) this.b;
        if (cqk.d((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGLSurface eGLSurface = (EGLSurface) this.d;
        boolean zEglMakeCurrent = EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) this.c);
        wk8.g("eglMakeCurrent", 12291, 12297, 12299);
        if (zEglMakeCurrent) {
            if (cqk.d((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
                i = 0;
            } else {
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay, (EGLSurface) this.d, 12375, iArr, 0);
                wk8.g("eglQuerySurface", new int[0]);
                i = iArr[0];
            }
            if (cqk.d((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
                i2 = 0;
            } else {
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(eGLDisplay, (EGLSurface) this.d, 12374, iArr2, 0);
                wk8.g("eglQuerySurface", new int[0]);
                i2 = iArr2[0];
            }
            if (i != ((Size) this.e).getWidth() || i2 != ((Size) this.e).getHeight()) {
                this.e = new Size(i, i2);
            }
            try {
                cf7Var.invoke((Size) this.e);
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                wk8.g("eglMakeCurrent", new int[0]);
            } catch (Throwable th) {
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                wk8.g("eglMakeCurrent", new int[0]);
                throw th;
            }
        }
    }

    public void K(String str) {
        long jLongValue = ((Number) ((af7) this.c).invoke()).longValue();
        xp9 xp9Var = new xp9(12);
        xp9Var.L(Long.valueOf(jLongValue), "onevideo_dash_manifest_last_refresh_success_at_ms");
        ((j6g) ((tw5) this.b).d).c(str, xp9Var);
        Log.d("DashManifestRefresher", "Mark refresh success key=" + str + " at=" + jLongValue);
    }

    public void L(gs5 gs5Var, boolean z) {
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        ws5 ws5Var = (ws5) this.b;
        if (((AtomicBoolean) this.a).get()) {
            return;
        }
        try {
            boolean zContains = xw3.P0(uui.b, uui.c).contains(ws5Var.k.a.a);
            if (z && zContains && gs5Var.d() > 0) {
                ws5.g(ws5Var, gs5Var);
            }
            ((AtomicReference) this.c).set(ws5.h(ws5Var, gs5Var));
        } catch (Exception e) {
            ((AtomicReference) this.d).set(e);
        } finally {
            countDownLatch.countDown();
        }
    }

    public synchronized void M(b2i b2iVar) {
        try {
            lvb.b0(((AtomicInteger) this.d).getAndDecrement() > 0);
            p21 p21VarA = ((b2i) this.e).a();
            if (!Objects.equals(b2iVar.b, ((b2i) this.c).b)) {
                p21VarA.d(b2iVar.b);
            }
            if (!Objects.equals(b2iVar.c, ((b2i) this.c).c)) {
                p21VarA.j(b2iVar.c);
            }
            int i = b2iVar.a;
            b2i b2iVar2 = (b2i) this.c;
            if (i != b2iVar2.a) {
                p21VarA.a = i;
            }
            int i2 = b2iVar.d;
            if (i2 != b2iVar2.d) {
                p21VarA.b = i2;
            }
            b2i b2iVarC = p21VarA.c();
            this.e = b2iVarC;
            if (((AtomicInteger) this.d).get() == 0 && !((b2i) this.c).equals((b2i) this.e)) {
                ((sfh) this.b).f(new gf5(this, 25, b2iVarC));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public n5g N(JSONObject jSONObject) throws JSONException {
        m5g m5gVar;
        m5g m5gVarA;
        cnc cncVar = (cnc) this.b;
        int i = jSONObject.getInt("id");
        String string = jSONObject.getString(SdkMetricStatEvent.NAME_KEY);
        string.getClass();
        Boolean boolValueOf = jSONObject.has("active") ? Boolean.valueOf(jSONObject.optBoolean("active")) : null;
        f6m.b(jSONObject, "countdownSec");
        Long lC = f6m.c(jSONObject, "timeoutMs");
        int iOptInt = jSONObject.optInt("participantCount");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("participantIds");
        ArrayList arrayListB = jSONArrayOptJSONArray != null ? cncVar.b(jSONArrayOptJSONArray) : null;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("addParticipantIds");
        ArrayList arrayListB2 = jSONArrayOptJSONArray2 != null ? cncVar.b(jSONArrayOptJSONArray2) : null;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("removeParticipantIds");
        ArrayList arrayListB3 = jSONArrayOptJSONArray3 != null ? cncVar.b(jSONArrayOptJSONArray3) : null;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("recordInfo");
        if (jSONObjectOptJSONObject != null) {
            cnc cncVar2 = (cnc) this.d;
            try {
                m5gVarA = cnc.a(jSONObjectOptJSONObject);
            } catch (JSONException e) {
                cncVar2.a.logException("RecordInfoParser", "Can't parse record info", e);
                m5gVarA = null;
            }
            m5gVar = m5gVarA;
        } else {
            m5gVar = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("asrInfo");
        ob1 ob1VarC = jSONObjectOptJSONObject2 != null ? tx.c(jSONObjectOptJSONObject2) : null;
        Map mapL = jSONObject.has("muteStates") ? kql.l(jSONObject) : s66.a;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("participants");
        l5g l5gVarY = jSONObjectOptJSONObject3 != null ? ((kzi) this.c).y(jSONObjectOptJSONObject3, new cnf(i)) : null;
        c6g c6gVar = null;
        boolean zIsNull = jSONObject.isNull("pinnedParticipantId");
        String strD = f6m.d(jSONObject, "pinnedParticipantId");
        yt1 yt1VarA = (zIsNull || strD == null) ? null : yt1.a(strD);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("urlSharingInfo");
        if (jSONObjectOptJSONObject4 != null) {
            wmc wmcVar = (wmc) this.e;
            try {
                yt1 yt1VarA2 = yt1.a(jSONObjectOptJSONObject4.getString("initiatorId"));
                String string2 = jSONObjectOptJSONObject4.getString("sharedUrl");
                string2.getClass();
                c6gVar = new c6g(yt1VarA2, string2);
            } catch (JSONException e2) {
                wmcVar.a.logException("UrlSharingParser", "Can't parse url sharing", e2);
            }
        }
        return new n5g(i, string, boolValueOf, arrayListB, arrayListB2, arrayListB3, lC, Integer.valueOf(iOptInt), m5gVar, ob1VarC, mapL, l5gVarY, yt1VarA, c6gVar);
    }

    public synchronized void O(Uri uri) {
        Object obj = ((tw5) this.b).a;
        String string = uri.toString();
        if (!S(string)) {
            Log.d("DashManifestRefresher", "Skip refresh (TTL not expired) uri=" + uri + " key=" + string);
            return;
        }
        Log.d("DashManifestRefresher", "Start refresh manifest uri=" + uri + " key=" + string);
        byte[] bArrE = E(uri);
        W(bArrE, uri);
        try {
            ((j6g) ((tw5) this.b).d).n(string);
            X(string, uri, bArrE);
            K(string);
            Log.d("DashManifestRefresher", "Manifest refreshed successfully uri=" + uri + " key=" + string + " size=" + bArrE.length);
        } catch (Exception e) {
            Log.e("DashManifestRefresher", "Failed to refresh manifest uri=" + uri + " key=" + string, e);
            throw new IOException("Failed to refresh manifest cache (uri=" + uri + ", key=" + string + ")", e);
        }
    }

    public void P() {
        if (cqk.d((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface((EGLDisplay) this.b, (EGLSurface) this.d);
        wk8.g("eglDestroySurface", new int[0]);
        this.d = EGL14.EGL_NO_SURFACE;
    }

    public void Q(Throwable th) {
        zv zvVar = (zv) this.e;
        p41 p41Var = (p41) this.d;
        if (p41Var.l(false, th)) {
            for (Object objH = p41Var.h(); !(objH instanceof cs2); objH = p41Var.h()) {
                ds2.b(objH);
                zvVar.addLast(objH);
            }
            if (zvVar.isEmpty()) {
                return;
            }
            ((cf7) this.a).invoke(new ArrayList(zvVar));
            zvVar.clear();
        }
    }

    public void R() {
        uvc uvcVar = (uvc) this.c;
        uvcVar.b = null;
        uvcVar.c = null;
        ((fi9) this.d).a = null;
        ((fi9) this.e).a = null;
    }

    public boolean S(String str) {
        byte[] bArr = (byte[]) ((j6g) ((tw5) this.b).d).h(str).b.get("onevideo_dash_manifest_last_refresh_success_at_ms");
        long j = bArr != null ? ByteBuffer.wrap(bArr).getLong() : -1L;
        if (j == -1) {
            Log.d("DashManifestRefresher", "No previous refresh -> should refresh key=".concat(str));
            return true;
        }
        long jLongValue = ((Number) ((af7) this.c).invoke()).longValue() - j;
        boolean z = jLongValue >= 1800000;
        StringBuilder sbB = nbh.B(j, "Check refresh key=", str, " lastSuccess=");
        qt4.z(jLongValue, " diffMs=", " ttlMs=1800000 shouldRefresh=", sbB);
        sbB.append(z);
        Log.d("DashManifestRefresher", sbB.toString());
        return z;
    }

    public boolean T() {
        if (cqk.d((EGLSurface) this.d, EGL14.EGL_NO_SURFACE)) {
            return false;
        }
        boolean zEglSwapBuffers = EGL14.eglSwapBuffers((EGLDisplay) this.b, (EGLSurface) this.d);
        wk8.g("eglSwapBuffers", 12299, 12301, 12291);
        return zEglSwapBuffers;
    }

    public aw5 U(fh0 fh0Var) {
        g85 g85Var = this;
        wxl.a();
        StringBuilder sb = new StringBuilder("[StreamSharing] DualSurfaceProcessorNode Transform Processor = ");
        dch dchVar = (dch) g85Var.a;
        sb.append(dchVar);
        sb.append("\n   primary input = ");
        sb.append(fh0Var.a);
        sb.append("\n   secondary input = ");
        sb.append(fh0Var.b);
        tvj.a("DualSurfaceProcessorNode", sb.toString());
        Iterator it = fh0Var.c.iterator();
        while (it.hasNext()) {
            tvj.a("SurfaceProcessorNode", "   outputConfig = " + ((eh0) it.next()));
        }
        g85Var.e = fh0Var;
        g85Var.d = new aw5();
        fh0 fh0Var2 = (fh0) g85Var.e;
        zbh zbhVar = fh0Var2.a;
        zbh zbhVar2 = fh0Var2.b;
        Iterator it2 = fh0Var2.c.iterator();
        while (it2.hasNext()) {
            eh0 eh0Var = (eh0) it2.next();
            aw5 aw5Var = (aw5) g85Var.d;
            ei0 ei0Var = eh0Var.a;
            Rect rect = ei0Var.d;
            int i = ei0Var.f;
            boolean z = ei0Var.g;
            Matrix matrix = new Matrix(zbhVar.b);
            RectF rectF = new RectF(rect);
            Size size = ei0Var.e;
            Iterator it3 = it2;
            matrix.postConcat(y1i.a(rectF, y1i.j(size), i, z));
            qyj.i(y1i.d(y1i.h(i, y1i.f(rect)), false, size));
            Rect rectI = y1i.i(size);
            tw5 tw5VarB = zbhVar.g.b();
            tw5VarB.a = size;
            aw5Var.put(eh0Var, new zbh(ei0Var.b, ei0Var.c, tw5VarB.j(), matrix, false, rectI, zbhVar.i - i, -1, zbhVar.e != z));
            it2 = it3;
        }
        try {
            dchVar.e(zbhVar.d((pf2) g85Var.b, true));
        } catch (ProcessingException e) {
            tvj.d("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        try {
            dchVar.e(zbhVar2.d((pf2) g85Var.c, false));
        } catch (ProcessingException e2) {
            tvj.d("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e2);
        }
        pf2 pf2Var = (pf2) g85Var.b;
        pf2 pf2Var2 = (pf2) g85Var.c;
        for (Map.Entry entry : ((aw5) g85Var.d).entrySet()) {
            zbh zbhVar3 = zbhVar2;
            zbh zbhVar4 = zbhVar;
            pf2 pf2Var3 = pf2Var2;
            g85Var.C(pf2Var, pf2Var3, zbhVar4, zbhVar3, entry);
            g85Var = this;
            ((zbh) entry.getValue()).a(new xp4(g85Var, pf2Var, pf2Var3, zbhVar4, zbhVar3, entry, 1));
            pf2Var2 = pf2Var3;
            zbhVar = zbhVar4;
            zbhVar2 = zbhVar3;
        }
        return (aw5) g85Var.d;
    }

    public boolean V(rp7 rp7Var) {
        return !(((p41) this.d).c(rp7Var) instanceof cs2);
    }

    public void X(String str, Uri uri, byte[] bArr) {
        k71 k71VarA = ((tw5) this.b).r(new m15(0, bArr), false, null).a();
        this.e = k71VarA;
        try {
            Map map = Collections.EMPTY_MAP;
            long length = bArr.length;
            lvb.W(uri, "The uri must be set.");
            new e81(k71VarA, new a35(uri, 0L, 1, null, map, 0L, length, str, 0, null), null, null).a();
            Log.d("DashManifestRefresher", "Manifest written to cache key=" + str + " size=" + bArr.length);
        } finally {
            z();
        }
    }

    @Override // defpackage.h74
    public Object a(Class cls) {
        if (!((Set) this.a).contains(x0e.a(cls))) {
            ahc.c(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object objA = ((h74) this.e).a(cls);
        if (!cls.equals(ryd.class)) {
            return objA;
        }
        return new goe();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        long jRandom;
        qn0 qn0Var = (qn0) this.b;
        Throwable th = (Throwable) obj;
        th.getClass();
        if (!((Boolean) ((cf7) this.a).invoke(th)).booleanValue()) {
            return new qqb(0, new gg7(th));
        }
        int i = qn0Var.c + 1;
        qn0Var.c = i;
        if (i > 3) {
            jRandom = 0;
        } else {
            kh6 kh6Var = qn0Var.a;
            float fMin = (long) Math.min(kh6Var.a * ((float) Math.pow(kh6Var.b, i - 1.0f)), 30000.0f);
            float f2 = 0.2f * fMin;
            long jMax = (long) Math.max(fMin - f2, 1.0f);
            jRandom = jMax + ((long) ((int) (Math.random() * ((((long) Math.min(f2 + fMin, 30000.0f)) - jMax) + 1))));
            if (jRandom == 0) {
                jRandom = 0;
            } else {
                if (jRandom < 0) {
                    ore.k("Interval is invalid. Must be greater than 0.");
                    return null;
                }
                long j = qn0Var.d + jRandom;
                qn0Var.d = j;
                boolean z = j > qn0Var.b;
                if (z) {
                    jRandom = 0;
                } else if (z) {
                    ore.o();
                    return null;
                }
            }
        }
        if (jRandom == 0) {
            ((cf7) this.e).invoke(th);
            return new qqb(0, new gg7(th));
        }
        ((qf7) this.c).invoke(th, Integer.valueOf(qn0Var.c));
        z2f z2fVar = (z2f) this.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Objects.requireNonNull(timeUnit, "unit is null");
        return new krb(Math.max(jRandom, 0L), timeUnit, z2fVar);
    }

    @Override // defpackage.ee6
    public ExecutorService b() {
        return (ExecutorService) this.c;
    }

    @Override // defpackage.ee6
    public ExecutorService c() {
        return (ExecutorService) this.d;
    }

    @Override // defpackage.h74
    public xwd d(x0e x0eVar) {
        if (((Set) this.d).contains(x0eVar)) {
            return ((h74) this.e).d(x0eVar);
        }
        ahc.c(x0eVar, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    @Override // defpackage.v7h
    public int e(long j) {
        long[] jArr = (long[]) this.b;
        int iB = vqi.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.ee6
    public ScheduledExecutorService f() {
        return (ScheduledExecutorService) this.e;
    }

    @Override // defpackage.h74
    public xwd g(x0e x0eVar) {
        if (((Set) this.b).contains(x0eVar)) {
            return ((h74) this.e).g(x0eVar);
        }
        ahc.c(x0eVar, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // defpackage.v7h
    public List h(long j) {
        o5i o5iVar = (o5i) this.a;
        Map map = (Map) this.c;
        HashMap map2 = (HashMap) this.d;
        HashMap map3 = (HashMap) this.e;
        ArrayList<Pair> arrayList = new ArrayList();
        o5iVar.g(j, o5iVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        o5iVar.i(j, false, o5iVar.h, treeMap);
        o5iVar.h(j, map, map2, o5iVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                r5i r5iVar = (r5i) map2.get(pair.first);
                r5iVar.getClass();
                arrayList2.add(new yy4(null, null, null, bitmapDecodeByteArray, r5iVar.c, 0, r5iVar.e, r5iVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, r5iVar.f, r5iVar.g, false, -16777216, r5iVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            r5i r5iVar2 = (r5i) map2.get(entry.getKey());
            r5iVar2.getClass();
            xy4 xy4Var = (xy4) entry.getValue();
            CharSequence charSequence = xy4Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (kh5 kh5Var : (kh5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), kh5.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(kh5Var), spannableStringBuilder.getSpanEnd(kh5Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f2 = r5iVar2.c;
            int i9 = r5iVar2.d;
            xy4Var.e = f2;
            xy4Var.f = i9;
            xy4Var.g = r5iVar2.e;
            xy4Var.h = r5iVar2.b;
            xy4Var.l = r5iVar2.f;
            float f3 = r5iVar2.i;
            int i10 = r5iVar2.h;
            xy4Var.k = f3;
            xy4Var.j = i10;
            xy4Var.p = r5iVar2.j;
            arrayList2.add(xy4Var.a());
        }
        return arrayList2;
    }

    @Override // defpackage.h74
    public Object i(x0e x0eVar) {
        if (((Set) this.a).contains(x0eVar)) {
            return ((h74) this.e).i(x0eVar);
        }
        ahc.c(x0eVar, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override // defpackage.ee6
    public ExecutorService j() {
        return (ExecutorService) this.a;
    }

    @Override // defpackage.h74
    public Set k(x0e x0eVar) {
        if (((Set) this.c).contains(x0eVar)) {
            return ((h74) this.e).k(x0eVar);
        }
        ahc.c(x0eVar, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // defpackage.ee6
    public ExecutorService l() {
        return (ExecutorService) this.b;
    }

    @Override // defpackage.v7h
    public long m(int i) {
        return ((long[]) this.b)[i];
    }

    @Override // defpackage.h74
    public xwd n(Class cls) {
        return g(x0e.a(cls));
    }

    @Override // defpackage.v7h
    public int o() {
        return ((long[]) this.b).length;
    }

    @Override // defpackage.ee6
    public ExecutorService p() {
        return (ExecutorService) this.d;
    }

    @Override // defpackage.ee6
    public ExecutorService q() {
        return (ExecutorService) this.d;
    }

    public gnf r(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("events");
        jSONArray.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            string.getClass();
            hnf hnfVarS = s(string);
            if (hnfVarS != null) {
                linkedHashSet.add(hnfVarS);
            }
        }
        int i2 = jSONObject.getInt("roomId");
        boolean zOptBoolean = jSONObject.optBoolean("deactivate");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("room");
        return new gnf(linkedHashSet, i2, jSONObjectOptJSONObject != null ? N(jSONObjectOptJSONObject) : null, zOptBoolean);
    }

    public vn7 v(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("updates");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject2.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            hnf hnfVarS = s(next);
            if (hnfVarS != null) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                if (jSONObject3.has("rooms")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("rooms");
                    jSONArray.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                        jSONObject4.getClass();
                        arrayList2.add(N(jSONObject4));
                    }
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        n5g n5gVar = (n5g) obj;
                        arrayList.add(new gnf(Collections.singleton(hnfVarS), n5gVar.a, n5gVar, false));
                    }
                } else {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roomIds");
                    jSONArray2.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    int length2 = jSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        arrayList3.add(Integer.valueOf(jSONArray2.getInt(i3)));
                    }
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList3.get(i4);
                        i4++;
                        arrayList.add(new gnf(Collections.singleton(hnfVarS), ((Number) obj2).intValue(), null, false));
                    }
                }
            }
        }
        return new vn7(27, arrayList);
    }

    public rg0 w() {
        if (!"".isEmpty()) {
            ore.k("Missing required properties:".concat(""));
            return null;
        }
        int iIntValue = ((Integer) this.a).intValue();
        int iIntValue2 = ((Integer) this.b).intValue();
        int iIntValue3 = ((Integer) this.c).intValue();
        int iIntValue4 = ((Integer) this.d).intValue();
        int iIntValue5 = ((Integer) this.e).intValue();
        rg0 rg0Var = new rg0(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5);
        String strConcat = iIntValue == -1 ? " audioSource" : "";
        if (iIntValue2 <= 0) {
            strConcat = strConcat.concat(" captureSampleRate");
        }
        if (iIntValue3 <= 0) {
            strConcat = strConcat.concat(" encodeSampleRate");
        }
        if (iIntValue4 <= 0) {
            strConcat = strConcat.concat(" channelCount");
        }
        if (iIntValue5 == -1) {
            strConcat = strConcat.concat(" audioFormat");
        }
        if (strConcat.isEmpty()) {
            return rg0Var;
        }
        ore.p("Required settings missing or non-positive:".concat(strConcat));
        return null;
    }

    public ui0 x() {
        String strConcat = ((wf5) this.a) == null ? " surface" : "";
        if (((List) this.b) == null) {
            strConcat = strConcat.concat(" sharedSurfaces");
        }
        if (((Integer) this.c) == null) {
            strConcat = strConcat.concat(" mirrorMode");
        }
        if (((Integer) this.d) == null) {
            strConcat = strConcat.concat(" surfaceGroupId");
        }
        if (((fx5) this.e) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (strConcat.isEmpty()) {
            return new ui0((wf5) this.a, (List) this.b, ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (fx5) this.e);
        }
        ore.k("Missing required properties:".concat(strConcat));
        return null;
    }

    public void y() {
        i88 i88Var;
        wxl.a();
        js8 js8Var = (js8) this.c;
        js8Var.getClass();
        wxl.a();
        zg0 zg0Var = (zg0) js8Var.e;
        Objects.requireNonNull(zg0Var);
        ls9 ls9Var = (ls9) js8Var.b;
        Objects.requireNonNull(ls9Var);
        ls9 ls9Var2 = (ls9) js8Var.c;
        i88 i88Var2 = zg0Var.c;
        Objects.requireNonNull(i88Var2);
        i88Var2.a();
        i88 i88Var3 = zg0Var.c;
        Objects.requireNonNull(i88Var3);
        o9b.g(i88Var3.e).b(new nl2(ls9Var, 0), zjl.d());
        i88 i88Var4 = zg0Var.e;
        if (i88Var4 != null) {
            i88Var4.a();
            o9b.g(zg0Var.e.e).b(new nl2(null, 1), zjl.d());
        }
        if (zg0Var.h.size() > 1 && (i88Var = zg0Var.d) != null) {
            i88Var.a();
            o9b.g(zg0Var.d.e).b(new nl2(ls9Var2, 2), zjl.d());
        }
        ((fjd) this.d).getClass();
    }

    public void z() {
        try {
            k71 k71Var = (k71) this.e;
            if (k71Var != null) {
                k71Var.close();
            }
        } catch (Exception e) {
            Log.e("DashManifestRefresher", "close data source exception", e);
        } finally {
            this.e = null;
        }
    }

    public g85(int i) {
        this.d = Executors.newFixedThreadPool(2, new aid("FrescoIoBoundExecutor", 0));
        this.a = Executors.newFixedThreadPool(i, new aid("FrescoDecodeExecutor", 0));
        this.b = Executors.newFixedThreadPool(i, new aid("FrescoBackgroundExecutor", 0));
        this.c = Executors.newFixedThreadPool(1, new aid("FrescoLightWeightBackgroundExecutor", 0));
        this.e = Executors.newScheduledThreadPool(i, new aid("FrescoBackgroundExecutor", 0));
    }

    public g85(k2d k2dVar, ri riVar, Bitmap.Config config, ExecutorService executorService) {
        this.a = k2dVar;
        this.b = riVar;
        this.c = config;
        this.d = executorService;
        this.e = new SparseArray();
    }

    public /* synthetic */ g85(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public g85(o5i o5iVar, HashMap map, HashMap map2, HashMap map3) {
        this.a = o5iVar;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        o5iVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    public /* synthetic */ g85(String str, String str2, Long l, String str3, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3, (Object) null);
    }

    public g85(y3a y3aVar) {
        this.e = y3aVar;
        this.d = y3aVar;
        this.a = new ArrayList();
    }
}
