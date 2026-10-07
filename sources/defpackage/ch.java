package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.collections.a;
import org.webrtc.IceCandidate;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class ch implements o78, jt9, kg7, jg7, w5g, s8g {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public ch(bg2 bg2Var) {
        this.a = 4;
        this.c = bg2Var;
        int[] iArr = (int[]) ((qb2) bg2Var).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        this.b = iArr != null ? a.L0(18, iArr) : false;
        this.d = hvl.a(bg2Var);
    }

    public static boolean g(fx5 fx5Var, fx5 fx5Var2) {
        int i;
        boolean zB = fx5Var2.b();
        int i2 = fx5Var2.a;
        if (zB) {
            int i3 = fx5Var.a;
            return !(i3 == 2 && i2 == 1) && (i3 == 2 || i3 == 0 || i3 == i2) && ((i = fx5Var.b) == 0 || i == fx5Var2.b);
        }
        c.p(fx5Var2, " not actually fully specified.", "Fully specified range ");
        return false;
    }

    public static boolean h(fx5 fx5Var, fx5 fx5Var2, Set set) {
        if (set.contains(fx5Var2)) {
            return g(fx5Var, fx5Var2);
        }
        if (!tvj.f(3, "CXCP")) {
            return false;
        }
        Log.d("CXCP", "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + fx5Var + "\nCandidate dynamic range:\n  " + fx5Var2);
        return false;
    }

    public static fx5 l(fx5 fx5Var, LinkedHashSet linkedHashSet, Set set) {
        if (fx5Var.a != 1) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                fx5 fx5Var2 = (fx5) it.next();
                int i = fx5Var2.a;
                if (!fx5Var2.b()) {
                    ore.k("Fully specified DynamicRange must have fully defined encoding.");
                    break;
                }
                if (i != 1 && h(fx5Var, fx5Var2, set)) {
                    return fx5Var2;
                }
            }
        }
        return null;
    }

    public static void o(Set set, fx5 fx5Var, b1k b1kVar) {
        qyj.l("Cannot update already-empty constraints.", !set.isEmpty());
        Set setB = ((kx5) b1kVar.b).b(fx5Var);
        if (setB.isEmpty()) {
            return;
        }
        Set setX1 = ww3.X1(set);
        set.retainAll(setB);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + fx5Var + "\nConstraints:\n  " + setB + "\nExisting constraints:\n  " + setX1).toString());
        }
    }

    @Override // defpackage.o78
    public void D(final n78 n78Var, final Executor executor) {
        Handler handler;
        synchronized (this.d) {
            this.b = false;
            ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: bh
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    ch chVar = this.a;
                    Executor executor2 = executor;
                    n78 n78Var2 = n78Var;
                    synchronized (chVar.d) {
                        try {
                            if (!chVar.b) {
                                executor2.execute(new qe(chVar, 1, n78Var2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
            ImageReader imageReader = (ImageReader) this.c;
            if (ml9.a != null) {
                handler = ml9.a;
            } else {
                synchronized (ml9.class) {
                    try {
                        if (ml9.a == null) {
                            ml9.a = lvb.e0(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                handler = ml9.a;
            }
            imageReader.setOnImageAvailableListener(onImageAvailableListener, handler);
        }
    }

    @Override // defpackage.o78
    public l78 H() {
        Image imageAcquireNextImage;
        synchronized (this.d) {
            try {
                imageAcquireNextImage = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new ah(imageAcquireNextImage);
        }
    }

    @Override // defpackage.kg7
    public void a(Object obj) {
        int i;
        int i2 = 2;
        switch (this.a) {
            case 2:
                p17 p17Var = (p17) obj;
                synchronized (this.d) {
                    try {
                        if (this.b) {
                            return;
                        }
                        if (p17Var == null) {
                            return;
                        }
                        tvj.a("CameraController", "Tap-to-focus onSuccess: " + p17Var.a);
                        g8b g8bVar = (g8b) this.c;
                        if (!p17Var.a) {
                            i2 = 3;
                        }
                        g8bVar.i(new vih(i2));
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 3:
                Bitmap bitmap = (Bitmap) obj;
                qlb qlbVar = (qlb) this.c;
                if (this.b) {
                    return;
                }
                qlbVar.g(bitmap);
                vf6 vf6Var = (vf6) this.d;
                ex8 ex8Var = new ex8(qlbVar.a());
                m0a m0aVar = (m0a) vf6Var.c;
                m0aVar.e.execute(new c86(m0aVar, vf6Var.b, (k2a) vf6Var.d, ex8Var, 2));
                return;
            case 6:
                d3a d3aVar = (d3a) this.d;
                i2a i2aVar = (i2a) this.c;
                boolean z = this.b;
                gm0.M(d3aVar.t, (j2a) obj);
                vqi.L(d3aVar.t);
                if (z) {
                    d3aVar.q(i2aVar);
                    return;
                }
                return;
            case 9:
                if (this.b) {
                    return;
                }
                ((s8g) this.c).a(obj);
                return;
            default:
                u72 u72Var = (u72) this.c;
                bui buiVar = (bui) this.d;
                if (u72Var != buiVar.y || (i = buiVar.A) == 3) {
                    return;
                }
                i2 = this.b ? 1 : 2;
                if (i2 != i) {
                    buiVar.A = i2;
                    buiVar.Q().h(i2);
                    return;
                }
                return;
        }
    }

    public void b(du1 du1Var, qpc qpcVar) {
        ((y3e) this.d).log("IceCandidatesHandler", "handle, participant=" + du1Var + ", client=" + qpcVar);
        if (!this.b || !du1Var.c() || qpcVar == null || !qpcVar.X) {
            ((y3e) this.d).log("IceCandidatesHandler", "Cant apply ice candidates, isIceApplyPermitted=" + this.b + ", " + du1Var + ", client=" + qpcVar);
            return;
        }
        ((y3e) this.d).log("IceCandidatesHandler", qpcVar + " is iceable for " + du1Var);
        Map map = (Map) ((HashMap) this.c).get(du1Var);
        if (map != null) {
            if (Objects.equals(du1Var.k, du1.u)) {
                ((y3e) this.d).log("IceCandidatesHandler", "push all ice candidates to " + qpcVar);
                for (Map.Entry entry : map.entrySet()) {
                    Iterator it = ((List) ((ylc) entry.getValue()).a).iterator();
                    while (it.hasNext()) {
                        qpcVar.t((IceCandidate) it.next());
                    }
                    if (!((List) ((ylc) entry.getValue()).b).isEmpty()) {
                        qpcVar.K((IceCandidate[]) ((List) ((ylc) entry.getValue()).b).toArray(new IceCandidate[((List) ((ylc) entry.getValue()).b).size()]));
                    }
                }
            } else {
                ylc ylcVar = (ylc) map.get(du1Var.k);
                if (ylcVar != null) {
                    Iterator it2 = ((List) ylcVar.a).iterator();
                    while (it2.hasNext()) {
                        qpcVar.t((IceCandidate) it2.next());
                    }
                    if (!((List) ylcVar.b).isEmpty()) {
                        List list = (List) ylcVar.b;
                        qpcVar.K((IceCandidate[]) list.toArray(new IceCandidate[list.size()]));
                    }
                }
            }
            map.clear();
        }
    }

    @Override // defpackage.s8g
    public void c(ko5 ko5Var) {
        s8g s8gVar = (s8g) this.c;
        try {
            ((rg4) this.d).accept(ko5Var);
            s8gVar.c(ko5Var);
        } catch (Throwable th) {
            iwl.a(th);
            this.b = true;
            ko5Var.dispose();
            l66.a(th, s8gVar);
        }
    }

    @Override // defpackage.o78
    public void close() {
        synchronized (this.d) {
            ((ImageReader) this.c).close();
        }
    }

    @Override // defpackage.o78
    public l78 d() {
        Image imageAcquireLatestImage;
        synchronized (this.d) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new ah(imageAcquireLatestImage);
        }
    }

    @Override // defpackage.o78
    public int e() {
        int imageFormat;
        synchronized (this.d) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.o78
    public void f() {
        synchronized (this.d) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.o78
    public int getHeight() {
        int height;
        synchronized (this.d) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    @Override // defpackage.o78
    public Surface getSurface() {
        Surface surface;
        synchronized (this.d) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    @Override // defpackage.o78
    public int getWidth() {
        int width;
        synchronized (this.d) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    @Override // defpackage.jt9
    /* JADX INFO: renamed from: i */
    public v30 p(yfj yfjVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        mt9 x30Var;
        int i;
        String str = ((nt9) yfjVar.a).a;
        v30 v30Var = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.b || Build.VERSION.SDK_INT < 36) {
                    x30Var = new x30(mediaCodecCreateByCodecName, (HandlerThread) ((u30) this.d).get());
                    i = 0;
                } else {
                    x30Var = new due(mediaCodecCreateByCodecName);
                    i = 4;
                }
                v30 v30Var2 = new v30(mediaCodecCreateByCodecName, (HandlerThread) ((u30) this.c).get(), x30Var, (euc) yfjVar.f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) yfjVar.d;
                    if (surface == null && ((nt9) yfjVar.a).k && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    v30.a(v30Var2, (MediaFormat) yfjVar.b, surface, (MediaCrypto) yfjVar.e, i);
                    return v30Var2;
                } catch (Exception e) {
                    e = e;
                    v30Var = v30Var2;
                    if (v30Var != null) {
                        v30Var.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.b = true;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0202  */
    /* JADX WARN: Code duplicated, block: B:90:0x0215  */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x0215, please report this as an issue */
    public LinkedHashMap m(ArrayList arrayList, List list, List list2) {
        fx5 fx5Var;
        Iterator it;
        Set set;
        LinkedHashSet linkedHashSet;
        Iterator it2;
        fx5 fx5Var2;
        fx5 fx5VarE;
        b1k b1kVar = (b1k) this.d;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            linkedHashSet2.add(((pg0) it3.next()).d);
        }
        Set setC = ((kx5) b1kVar.b).c();
        Set setW1 = ww3.W1(setC);
        Iterator it4 = linkedHashSet2.iterator();
        while (it4.hasNext()) {
            o(setW1, (fx5) it4.next(), b1kVar);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            cmi cmiVar = (cmi) list.get(((Number) it5.next()).intValue());
            fx5 fx5VarB = cmiVar.B();
            if (fx5VarB.equals(fx5.c)) {
                arrayList4.add(cmiVar);
            } else {
                int i = fx5VarB.a;
                int i2 = fx5VarB.b;
                if (i == 2 || ((i != 0 && i2 == 0) || (i == 0 && i2 != 0))) {
                    arrayList3.add(cmiVar);
                } else {
                    arrayList2.add(cmiVar);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.addAll(arrayList2);
        arrayList5.addAll(arrayList3);
        arrayList5.addAll(arrayList4);
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            cmi cmiVar2 = (cmi) it6.next();
            fx5 fx5VarB2 = cmiVar2.B();
            String str = (String) cmiVar2.i(wih.S0);
            if (fx5VarB2.b()) {
                linkedHashSet = linkedHashSet2;
                set = setC;
                it = it6;
                fx5Var = setW1.contains(fx5VarB2) ? fx5VarB2 : null;
            } else {
                int i3 = fx5VarB2.a;
                int i4 = fx5VarB2.b;
                fx5Var = fx5.d;
                if (i3 == 1 && i4 == 0) {
                    if (!setW1.contains(fx5Var)) {
                        fx5Var = null;
                    }
                    linkedHashSet = linkedHashSet2;
                    set = setC;
                    it = it6;
                } else {
                    fx5 fx5VarL = l(fx5VarB2, linkedHashSet2, setW1);
                    it = it6;
                    set = setC;
                    linkedHashSet = linkedHashSet2;
                    if (fx5VarL == null) {
                        fx5VarL = l(fx5VarB2, linkedHashSet3, setW1);
                        if (fx5VarL == null) {
                            if (!h(fx5VarB2, fx5Var, setW1)) {
                                if (i3 != 2 || (i4 != 10 && i4 != 0)) {
                                    it2 = setW1.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            fx5Var = null;
                                            break;
                                        }
                                        fx5Var2 = (fx5) it2.next();
                                        if (fx5Var2.b()) {
                                            ore.k("Candidate dynamic range must be fully specified.");
                                            return null;
                                        }
                                        if (!fx5Var2.equals(fx5Var) && g(fx5VarB2, fx5Var2)) {
                                            if (tvj.f(3, "CXCP")) {
                                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + fx5VarB2 + "\n->\n" + fx5Var2);
                                            }
                                            fx5Var = fx5Var2;
                                            break;
                                        }
                                    }
                                } else {
                                    LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        fx5VarE = u4.e((bg2) this.c);
                                        if (fx5VarE != null) {
                                            linkedHashSet4.add(fx5VarE);
                                        }
                                    } else {
                                        fx5VarE = null;
                                    }
                                    linkedHashSet4.add(fx5.e);
                                    fx5 fx5VarL2 = l(fx5VarB2, linkedHashSet4, setW1);
                                    if (fx5VarL2 == null) {
                                        it2 = setW1.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                fx5Var = null;
                                                break;
                                            }
                                            fx5Var2 = (fx5) it2.next();
                                            if (fx5Var2.b()) {
                                                ore.k("Candidate dynamic range must be fully specified.");
                                                return null;
                                            }
                                            if (!fx5Var2.equals(fx5Var)) {
                                                if (tvj.f(3, "CXCP")) {
                                                    Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + fx5VarB2 + "\n->\n" + fx5Var2);
                                                }
                                                fx5Var = fx5Var2;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (tvj.f(3, "CXCP")) {
                                            StringBuilder sbV = qt4.v("DynamicRangeResolver: Resolved dynamic range for use case ", str, "from ");
                                            sbV.append(fx5VarL2.equals(fx5VarE) ? "recommended" : "required");
                                            sbV.append(" 10-bit supported dynamic range.\n");
                                            sbV.append(fx5VarB2);
                                            sbV.append("\n->\n");
                                            sbV.append(fx5VarL2);
                                            Log.d("CXCP", sbV.toString());
                                        }
                                        fx5Var = fx5VarL2;
                                    }
                                }
                            } else if (tvj.f(3, "CXCP")) {
                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " to no compatible HDR dynamic ranges.\n" + fx5VarB2 + "\n->\n" + fx5Var);
                            }
                        } else if (tvj.f(3, "CXCP")) {
                            Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from concurrently bound use case.\n" + fx5VarB2 + "\n->\n" + fx5VarL);
                        }
                    } else if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from existing attached surface.\n" + fx5VarB2 + "\n->\n" + fx5VarL);
                    }
                    fx5Var = fx5VarL;
                }
            }
            if (fx5Var == null) {
                throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + ((String) cmiVar2.i(wih.S0)) + "\nRequested dynamic range:\n  " + fx5VarB2 + "\nSupported dynamic ranges:\n  " + set + "\nConstrained set of concurrent dynamic ranges:\n  " + setW1);
            }
            o(setW1, fx5Var, b1kVar);
            linkedHashMap.put(cmiVar2, fx5Var);
            linkedHashSet2 = linkedHashSet;
            if (!linkedHashSet2.contains(fx5Var)) {
                linkedHashSet3.add(fx5Var);
            }
            it6 = it;
            setC = set;
        }
        return linkedHashMap;
    }

    @Override // defpackage.o78
    public int n() {
        int maxImages;
        synchronized (this.d) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    @Override // defpackage.s8g
    public void onError(Throwable th) {
        if (this.b) {
            tre.s0(th);
        } else {
            ((s8g) this.c).onError(th);
        }
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 2:
                synchronized (this.d) {
                    try {
                        if (this.b) {
                            return;
                        }
                        if (!(th instanceof CameraControl$OperationCanceledException)) {
                            tvj.b("CameraController", "Tap-to-focus failed.", th);
                            ((g8b) this.c).i(new vih(4));
                            return;
                        }
                        tvj.b("CameraController", "Tap-to-focus canceled", th);
                        ((g8b) this.c).i(new vih(0));
                        synchronized (this.d) {
                            this.b = true;
                            break;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 3:
                if (this.b) {
                    return;
                }
                lvb.G0("NotificationProvider", "Failed to load bitmap: " + th.getMessage());
                return;
            case 4:
            case 5:
            case 7:
            default:
                if (th instanceof CancellationException) {
                    return;
                }
                tvj.d("VideoCapture", "Surface update completed with unexpected exception", th);
                return;
            case 6:
                d3a d3aVar = (d3a) this.d;
                if (th instanceof UnsupportedOperationException) {
                    lvb.H0("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    lvb.l0("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                vqi.L(d3aVar.t);
                if (this.b) {
                    d3aVar.q((i2a) this.c);
                    return;
                }
                return;
            case 8:
                u5g u5gVar = ((y5g) this.c).n;
                if (u5gVar == null || !u5gVar.a) {
                    y5g.access$handleSocketFailure((y5g) this.c, ((u3k) this.d).a, th);
                    return;
                }
                xjk xjkVarAccess$getReconnectContext = y5g.access$getReconnectContext((y5g) this.c);
                xjkVarAccess$getReconnectContext.b++;
                g5g signalingLogger = xjkVarAccess$getReconnectContext.c.getSignalingLogger();
                signalingLogger.a.log(signalingLogger.d, "Reconnection registered. Total count " + xjkVarAccess$getReconnectContext.b + ", total time reconnecting " + (y5g.access$time(xjkVarAccess$getReconnectContext.c) - xjkVarAccess$getReconnectContext.a));
                long jAccess$time = y5g.access$time(xjkVarAccess$getReconnectContext.c) - xjkVarAccess$getReconnectContext.a;
                Long l = ((y5g) this.c).n.b;
                boolean z = (((u3k) this.d).a && !this.b) || jAccess$time >= (l != null ? l.longValue() : y5g.FALLBACK_TO_OTHER_TRANSPORT_TIMEOUT);
                g5g signalingLogger2 = ((y5g) this.c).getSignalingLogger();
                boolean z2 = ((u3k) this.d).a;
                boolean z3 = this.b;
                StringBuilder sbB = zo5.B("Connection failed, fallback_allowed=", z, ", because initial_connection=", z2, ", did_open=");
                sbB.append(z3);
                sbB.append(", total_time_in_reconnect=");
                sbB.append(jAccess$time);
                signalingLogger2.a.log(signalingLogger2.d, sbB.toString());
                y5g.access$handleSocketFailure((y5g) this.c, z, th);
                return;
        }
    }

    public /* synthetic */ ch(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ ch(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public ch(CidLogger cidLogger) {
        this.a = 13;
        this.c = new HashMap();
        this.d = cidLogger;
    }

    public ch(CidLogger cidLogger, esh eshVar, boolean z) {
        this.a = 10;
        eshVar.getClass();
        this.c = cidLogger;
        this.d = eshVar;
        this.b = z;
    }

    public /* synthetic */ ch() {
        this.a = 5;
    }

    public ch(ImageReader imageReader) {
        this.a = 0;
        this.d = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public ch(int i) {
        this.a = 1;
        u30 u30Var = new u30(i, 0);
        u30 u30Var2 = new u30(i, 1);
        this.c = u30Var;
        this.d = u30Var2;
        this.b = true;
    }

    public ch(d3a d3aVar, i2a i2aVar, boolean z, h3d h3dVar) {
        this.a = 6;
        this.d = d3aVar;
        this.c = i2aVar;
        this.b = z;
    }

    public ch(bui buiVar, u72 u72Var, boolean z) {
        this.a = 11;
        this.d = buiVar;
        this.c = u72Var;
        this.b = z;
    }

    public ch(PointF pointF, g8b g8bVar) {
        this.a = 2;
        this.b = false;
        this.d = new Object();
        this.c = g8bVar;
    }
}
