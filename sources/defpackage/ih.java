package defpackage;

import android.R;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import one.me.sdk.vendor.StoreServicesInfo$ServicesException;
import one.video.upload.exceptions.UploadUrlExpiredException;
import org.webrtc.CapturerObserver;
import org.webrtc.DataChannel;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.YuvConverter;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.webrtc.protocol.exceptions.RtcInternalHandleException;

/* JADX INFO: loaded from: classes2.dex */
public class ih implements otb, kg7, kmc, pyc, DataChannel.Observer, h36, c56, zs3, y6g, bki, CapturerObserver, d15 {
    public static final int[] c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Object a;
    public Object b;

    public ih(int i) {
        switch (i) {
            case 23:
                AtomicReference atomicReference = new AtomicReference();
                this.a = atomicReference;
                AtomicReference atomicReference2 = new AtomicReference();
                this.b = atomicReference2;
                c3b c3bVar = new c3b();
                atomicReference2.lazySet(c3bVar);
                break;
            case 27:
                this.a = new rp4(ru.oneme.app.R.id.link_context_menu_action_open_link, new tnh(ru.oneme.app.R.string.link_context_menu_action_open_link), Integer.valueOf(ru.oneme.app.R.drawable.icon_external_link), (Integer) null, 20);
                this.b = new rp4(ru.oneme.app.R.id.link_context_menu_action_copy_link, new tnh(ru.oneme.app.R.string.link_context_menu_action_copy_link), Integer.valueOf(ru.oneme.app.R.drawable.icon_copy), (Integer) null, 20);
                break;
        }
    }

    public static tu5[] s(tu5 tu5Var, tu5 tu5Var2, tu5 tu5Var3) {
        float f = tu5Var.a;
        float f2 = tu5Var2.a;
        float f3 = f - f2;
        float f4 = tu5Var.b;
        float f5 = tu5Var2.b;
        float f6 = f4 - f5;
        float f7 = tu5Var3.a;
        float f8 = f2 - f7;
        float f9 = tu5Var3.b;
        float f10 = f5 - f9;
        float f11 = (f + f2) / 2.0f;
        float f12 = (f4 + f5) / 2.0f;
        float f13 = (f2 + f7) / 2.0f;
        float f14 = (f9 + f5) / 2.0f;
        float fSqrt = (float) Math.sqrt((f6 * f6) + (f3 * f3));
        float fSqrt2 = (float) Math.sqrt((f10 * f10) + (f8 * f8));
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float f17 = fSqrt2 / (fSqrt + fSqrt2);
        if (Float.isNaN(f17)) {
            f17 = 0.0f;
        }
        float f18 = tu5Var2.a - ((f15 * f17) + f13);
        float f19 = f5 - ((f16 * f17) + f14);
        return new tu5[]{new tu5(f11 + f18, f12 + f19), new tu5(f13 + f18, f14 + f19)};
    }

    public static Bitmap x(String str, boolean z) {
        try {
            if (!new File(str).exists()) {
                gm0.W("ih", "file by path %s not exists", str);
                return null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (z) {
                options.inMutable = true;
            }
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable th) {
            gm0.V("ih", "getBitmapFromExternalStorage fail", th);
            return null;
        }
    }

    public List A() {
        return (List) this.b;
    }

    public void B(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.a;
        vbf vbfVarK = vbf.k(absSeekBar.getContext(), attributeSet, c, i);
        Drawable drawableE = vbfVarK.e(0);
        if (drawableE != null) {
            if (drawableE instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableE;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableH = H(animationDrawable.getFrame(i2), true);
                    drawableH.setLevel(10000);
                    animationDrawable2.addFrame(drawableH, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableE = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableE);
        }
        Drawable drawableE2 = vbfVarK.e(1);
        if (drawableE2 != null) {
            absSeekBar.setProgressDrawable(H(drawableE2, false));
        }
        vbfVarK.l();
    }

    public void C() {
        String str = ((zec) this.a).j;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "finish", null);
            }
        }
        uhi.a((uhi) ((zec) this.a).o.getValue(), 0L, 0.0f, null, 23);
        ((kgf) this.b).c(new roe(new hii(100, ((zec) this.a).m, null)));
        ((kgf) this.b).i(null);
    }

    public boolean D(q8 q8Var, Menu menu) {
        return ((xde) this.a).G(q8Var, menu);
    }

    public void E(q8 q8Var) {
        xde xdeVar = (xde) this.a;
        ((ActionMode.Callback) xdeVar.b).onDestroyActionMode(xdeVar.p(q8Var));
        vr vrVar = (vr) this.b;
        if (vrVar.v != null) {
            vrVar.l.getDecorView().removeCallbacks(vrVar.w);
        }
        if (vrVar.u != null) {
            d9j d9jVar = vrVar.x;
            if (d9jVar != null) {
                d9jVar.b();
            }
            d9j d9jVarA = i7j.a(vrVar.u);
            d9jVarA.a(0.0f);
            vrVar.x = d9jVarA;
            d9jVarA.d(new lr(2, this));
        }
        vrVar.t = null;
        ViewGroup viewGroup = vrVar.A;
        WeakHashMap weakHashMap = i7j.a;
        w6j.c(viewGroup);
        vrVar.K();
    }

    public void F(Throwable th) {
        String str = ((zec) this.a).j;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.g;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.r("error ", th), null);
            }
        }
        uhi.a((uhi) ((zec) this.a).o.getValue(), 0L, 0.0f, null, 23);
        if (th instanceof UploadUrlExpiredException) {
            th = new HttpUrlExpiredException(null, null, 7);
        }
        ((kgf) this.b).c(new roe(new poe(th)));
        ((kgf) this.b).i(null);
    }

    public boolean G(q8 q8Var, Menu menu) {
        ViewGroup viewGroup = ((vr) this.b).A;
        WeakHashMap weakHashMap = i7j.a;
        w6j.c(viewGroup);
        xde xdeVar = (xde) this.a;
        ActionMode.Callback callback = (ActionMode.Callback) xdeVar.b;
        vah vahVarP = xdeVar.p(q8Var);
        h6g h6gVar = (h6g) xdeVar.e;
        Menu scaVar = (Menu) h6gVar.get(menu);
        if (scaVar == null) {
            scaVar = new sca((Context) xdeVar.c, (yba) menu);
            h6gVar.put(menu, scaVar);
        }
        return callback.onPrepareActionMode(vahVarP, scaVar);
    }

    public Drawable H(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.b) == null) {
                this.b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = H(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    @Override // defpackage.kg7
    public void a(Object obj) {
        f86 f86Var = (f86) obj;
        wb0 wb0Var = (wb0) this.b;
        boolean z = wb0Var.i;
        d60 d60Var = wb0Var.e;
        e41 e41Var = wb0Var.d;
        if (!z || wb0Var.l != ((i86) this.a)) {
            f86Var.a();
            return;
        }
        if (wb0Var.o) {
            qyj.l(null, wb0Var.p > 0);
            if (System.nanoTime() - wb0Var.p >= wb0Var.f) {
                qyj.l(null, wb0Var.o);
                try {
                    e41Var.c();
                    tvj.a("AudioSource", "Retry start AudioStream succeed");
                    d60Var.b();
                    ((AtomicBoolean) d60Var.d).set(false);
                    wb0Var.o = false;
                } catch (AudioStream$AudioStreamException e) {
                    tvj.i("AudioSource", "Retry start AudioStream failed", e);
                    wb0Var.p = System.nanoTime();
                }
            }
        }
        yb0 yb0Var = d60Var;
        if (!wb0Var.o) {
            yb0Var = e41Var;
        }
        if (f86Var.f.get()) {
            ore.k("The buffer is submitted or canceled.");
            return;
        }
        ByteBuffer byteBuffer = f86Var.c;
        tg0 tg0Var = yb0Var.read(byteBuffer);
        int i = tg0Var.a;
        long j = tg0Var.b;
        if (i > 0) {
            if (wb0Var.r) {
                byte[] bArr = wb0Var.s;
                if (bArr == null || bArr.length < i) {
                    wb0Var.s = new byte[i];
                }
                int iPosition = byteBuffer.position();
                byteBuffer.put(wb0Var.s, 0, i);
                byteBuffer.limit(byteBuffer.position()).position(iPosition);
            }
            Executor executor = wb0Var.j;
            if (executor != null && j - wb0Var.u >= 200) {
                wb0Var.u = j;
                kzi kziVar = wb0Var.k;
                if (wb0Var.v == 2) {
                    ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
                    double dMax = 0.0d;
                    while (shortBufferAsShortBuffer.hasRemaining()) {
                        dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
                    }
                    wb0Var.t = dMax / 32767.0d;
                    if (kziVar != null) {
                        executor.execute(new qe(wb0Var, 11, kziVar));
                    }
                }
            }
            byteBuffer.limit(byteBuffer.position() + i);
            f86Var.b(j / 1000);
            f86Var.c();
        } else {
            tvj.g("AudioSource", "Unable to read data from AudioStream.");
            f86Var.a();
        }
        wb0Var.c();
    }

    @Override // defpackage.b7g
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // defpackage.c56
    public Object e() {
        return (yci) this.a;
    }

    @Override // defpackage.h36
    public hb f() {
        return new hb((ju5) this.a);
    }

    @Override // defpackage.bki
    public void g(long j, long j2) {
        zec zecVar = (zec) this.a;
        float f = j / zecVar.m;
        String str = zecVar.j;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "progress " + f, null);
            }
        }
        uhi.a((uhi) ((zec) this.a).o.getValue(), ((zec) this.a).m, f, Thread.currentThread(), 12);
        if (f < 1.0d) {
            ((kgf) this.b).c(new roe(new hii((int) (f * 100.0f), ((zec) this.a).m, null)));
        }
    }

    @Override // defpackage.kmc
    public Object h(rv8 rv8Var, ArrayList arrayList) {
        Object poeVar;
        e9b e9bVar = (e9b) ((ur3) this.b).get(((qr3) rv8Var).d());
        Object jmcVar = e9bVar.a.get();
        if (jmcVar == null) {
            synchronized (e9bVar) {
                jmcVar = e9bVar.a.get();
                if (jmcVar == null) {
                    jmcVar = new jmc();
                    e9bVar.a = new SoftReference(jmcVar);
                }
            }
        }
        jmc jmcVar2 = (jmc) jmcVar;
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ew8((bw8) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = jmcVar2.a;
        Object obj = concurrentHashMap.get(arrayList2);
        if (obj == null) {
            try {
                poeVar = (aw8) ((qf7) this.a).invoke(rv8Var, arrayList);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            roe roeVar = new roe(poeVar);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, roeVar);
            obj = objPutIfAbsent == null ? roeVar : objPutIfAbsent;
        }
        return ((roe) obj).a;
    }

    @Override // defpackage.h36
    public void i(MotionEvent motionEvent) {
        ((ArrayList) this.b).add(new tu5(motionEvent.getX(), motionEvent.getY()));
    }

    @Override // defpackage.b7g
    public boolean isEmpty() {
        return ((c3b) ((AtomicReference) this.b).get()) == ((c3b) ((AtomicReference) this.a).get());
    }

    @Override // defpackage.otb
    public void j(Task task) {
        if (((kam) task).d) {
            ((ek2) this.a).n(null);
            return;
        }
        Exception excG = task.g();
        if (excG != null) {
            gp7 gp7Var = (gp7) this.b;
            if (!gp7.j(gp7Var, excG)) {
                excG = new fp7(new StoreServicesInfo$ServicesException("failure to delete token", excG));
            }
            gm0.V(gp7Var.b, "fail deletePushToken", excG);
        }
        ((ek2) this.a).resumeWith(sbi.a);
    }

    @Override // defpackage.h36
    public void l(MotionEvent motionEvent) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(new tu5(motionEvent.getX(), motionEvent.getY()));
        if (arrayList.size() == 2) {
            ((ju5) this.a).d(((tu5) arrayList.get(0)).a, ((tu5) arrayList.get(0)).b, ((tu5) arrayList.get(1)).a, ((tu5) arrayList.get(1)).b);
        }
        if (arrayList.size() > 3) {
            tu5[] tu5VarArrS = s((tu5) arrayList.get(0), (tu5) arrayList.get(1), (tu5) arrayList.get(2));
            tu5[] tu5VarArrS2 = s((tu5) arrayList.get(1), (tu5) arrayList.get(2), (tu5) arrayList.get(3));
            ju5 ju5Var = (ju5) this.a;
            float f = ((tu5) arrayList.get(1)).a;
            float f2 = ((tu5) arrayList.get(1)).b;
            tu5 tu5Var = tu5VarArrS[1];
            float f3 = tu5Var.a;
            float f4 = tu5Var.b;
            tu5 tu5Var2 = tu5VarArrS2[0];
            ju5Var.c(f, f2, f3, f4, tu5Var2.a, tu5Var2.b, ((tu5) arrayList.get(2)).a, ((tu5) arrayList.get(2)).b);
            arrayList.remove(0);
        }
    }

    @Override // defpackage.pyc
    public xx6 m(long j) {
        Object next;
        Iterator it = ((xde) this.a).r().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xyc) next).a != j);
        xyc xycVar = (xyc) next;
        return xycVar == null ? o66.a : e9i.k0(new jz(e9i.k0(new xc3(((hk4) ((ny8) this.b).getValue()).b(), 2), new zw9(xycVar, j, null, 3)), 13), new e03(j, null, 3));
    }

    @Override // defpackage.c56
    public boolean n(CharSequence charSequence, int i, int i2, l9i l9iVar) {
        if ((l9iVar.c & 4) > 0) {
            return true;
        }
        if (((yci) this.a) == null) {
            this.a = new yci(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((ou7) this.b).getClass();
        ((yci) this.a).setSpan(new m9i(l9iVar), i, i2, 33);
        return true;
    }

    @Override // defpackage.d15
    public e15 o(aa9 aa9Var, k15 k15Var, ljf ljfVar, int i, int[] iArr, rg6 rg6Var, int i2, long j, boolean z, ArrayList arrayList, w3d w3dVar, v1i v1iVar, z3d z3dVar) {
        u25 u25VarA = ((s25) this.a).a();
        if (v1iVar != null) {
            u25VarA.w(v1iVar);
        }
        return new yke(aa9Var, k15Var, ljfVar, i, iArr, rg6Var, i2, u25VarA, j, (pgg) this.b, z, arrayList, w3dVar, z3dVar);
    }

    @Override // defpackage.b7g
    public boolean offer(Object obj) {
        if (obj == null) {
            ore.n("Null is not a valid element");
            return false;
        }
        c3b c3bVar = new c3b();
        c3bVar.a = obj;
        ((c3b) ((AtomicReference) this.a).getAndSet(c3bVar)).lazySet(c3bVar);
        return true;
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onBufferedAmountChange(long j) {
        f25 f25Var = (f25) this.b;
        for (wc7 wc7Var : f25Var.e) {
            try {
                if (f25Var == wc7Var.b) {
                    wc7.b(wc7Var.g);
                }
            } catch (Throwable th) {
                f25Var.b.reportException("DataChannelRtcTransport", "rtc.datachannel.buffer.listen", new RtcInternalHandleException(th));
            }
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        ((CidLogger) ((eoc) this.b).c).log("PatchedVideoCapturer", "onCapturerStarted");
        ((CapturerObserver) this.a).onCapturerStarted(z);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        ((CidLogger) ((eoc) this.b).c).log("PatchedVideoCapturer", "onCapturerStopped");
        ((CapturerObserver) this.a).onCapturerStopped();
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        wb0 wb0Var = (wb0) this.b;
        if (wb0Var.l != ((i86) this.a)) {
            return;
        }
        tvj.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
        if (th instanceof IllegalStateException) {
            return;
        }
        Executor executor = wb0Var.j;
        kzi kziVar = wb0Var.k;
        if (executor == null || kziVar == null) {
            return;
        }
        executor.execute(new qe(kziVar, 12, th));
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        videoFrame.getClass();
        gh2 gh2Var = (gh2) ((eoc) this.b).b;
        gh2Var.b.a();
        gh2Var.c = new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        if (SystemClock.elapsedRealtime() - gh2Var.d >= 10000) {
            gh2Var.a.log("CameraStatCollector", gh2Var.toString());
            gh2Var.d = SystemClock.elapsedRealtime();
        }
        VideoSink videoSink = (VideoSink) ((eoc) this.b).f;
        if (z5h.G0(Build.MANUFACTURER, "xiaomi", true) || !(videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer)) {
            if (videoSink != null) {
                videoSink.onFrame(videoFrame);
            }
            ((CapturerObserver) this.a).onFrameCaptured(videoFrame);
            return;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        buffer.getClass();
        int rotation = videoFrame.getRotation();
        SurfaceTextureHelper surfaceTextureHelper = (SurfaceTextureHelper) ((eoc) this.b).e;
        surfaceTextureHelper.getClass();
        Handler handler = surfaceTextureHelper.getHandler();
        handler.getClass();
        YuvConverter yuvConverter = (YuvConverter) ((eoc) this.b).d;
        yuvConverter.getClass();
        VideoFrame videoFrame2 = new VideoFrame(new hue((VideoFrame.TextureBuffer) buffer, rotation, handler, yuvConverter), 0, videoFrame.getTimestampNs());
        if (videoSink != null) {
            videoSink.onFrame(videoFrame2);
        }
        ((CapturerObserver) this.a).onFrameCaptured(videoFrame2);
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onMessage(DataChannel.Buffer buffer) {
        ByteBuffer byteBuffer = buffer.data;
        byte[] bArr = new byte[byteBuffer.remaining()];
        int i = buffer.binary ? 2 : 1;
        byteBuffer.get(bArr);
        f25 f25Var = (f25) this.b;
        Iterator it = f25Var.d.iterator();
        while (it.hasNext()) {
            try {
                ((bwe) it.next()).a(f25Var, bArr, i);
            } catch (Throwable th) {
                f25Var.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.response", new RtcInternalHandleException(th));
            }
        }
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onStateChange() {
        f25 f25Var = (f25) this.b;
        boolean z = ((DataChannel) this.a).state() == DataChannel.State.OPEN;
        Iterator it = f25Var.c.iterator();
        while (it.hasNext()) {
            try {
                ((awe) it.next()).a(f25Var, z);
            } catch (Throwable th) {
                f25Var.b.reportException("DataChannelRtcTransport", "rtc.datachannel.handle.connection", new RtcInternalHandleException(th));
            }
        }
    }

    @Override // defpackage.b7g
    public Object poll() {
        c3b c3bVar;
        AtomicReference atomicReference = (AtomicReference) this.b;
        c3b c3bVar2 = (c3b) atomicReference.get();
        c3b c3bVar3 = (c3b) c3bVar2.get();
        if (c3bVar3 != null) {
            Object obj = c3bVar3.a;
            c3bVar3.a = null;
            atomicReference.lazySet(c3bVar3);
            return obj;
        }
        if (c3bVar2 == ((c3b) ((AtomicReference) this.a).get())) {
            return null;
        }
        do {
            c3bVar = (c3b) c3bVar2.get();
        } while (c3bVar == null);
        Object obj2 = c3bVar.a;
        c3bVar.a = null;
        atomicReference.lazySet(c3bVar);
        return obj2;
    }

    public void q(EventItemsMap eventItemsMap) {
        NetworkCapabilities networkCapabilities;
        String str = "unknown";
        eventItemsMap.getClass();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.a;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (networkCapabilities.hasTransport(4)) {
                    str = "vpn";
                } else if (networkCapabilities.hasTransport(1)) {
                    str = "wifi";
                } else if (networkCapabilities.hasTransport(0)) {
                    str = "cellular";
                }
            }
        } catch (Throwable th) {
            ((CidLogger) this.b).reportException("NetworkInfoStatistics", "Can't get network state", new IllegalStateException("get.network.state.error", th));
        }
        eventItemsMap.set("network_type", str);
    }

    public Float t(MediaExtractor mediaExtractor, int i) {
        try {
            t28 t28Var = new t28();
            mediaExtractor.selectTrack(i);
            long sampleTime = mediaExtractor.getSampleTime();
            while (sampleTime >= 0) {
                int i2 = 1;
                if ((mediaExtractor.getSampleFlags() & 1) == 0) {
                    i2 = 0;
                }
                t28Var.e(i2, sampleTime);
                Float f = (Float) t28Var.c;
                if (f != null) {
                    try {
                        mediaExtractor.unselectTrack(i);
                    } catch (Throwable unused) {
                    }
                    return f;
                }
                if (!mediaExtractor.advance()) {
                    break;
                }
                sampleTime = mediaExtractor.getSampleTime();
            }
            t28Var.f();
            Float f2 = (Float) t28Var.c;
            try {
                mediaExtractor.unselectTrack(i);
                return f2;
            } catch (Throwable unused2) {
                return f2;
            }
        } catch (Throwable th) {
            try {
                gm0.V((String) this.b, "Failed to parse i-frame interval with legacy extractor", th);
                return null;
            } finally {
                try {
                    mediaExtractor.unselectTrack(i);
                } catch (Throwable unused3) {
                }
            }
        }
    }

    @Override // defpackage.zs3
    public boolean u(ClickableSpan clickableSpan, int i, int i2, String str, t59 t59Var, MotionEvent motionEvent) {
        int i3;
        List listP0;
        int i4;
        ata ataVar = (ata) this.a;
        long j = ((tea) this.b).A;
        MessagesListWidget messagesListWidget = ataVar.a;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        if (((Boolean) messagesListWidget.F1().I2.getValue()).booleanValue()) {
            return true;
        }
        jsa jsaVarF1 = messagesListWidget.F1();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (jsaVarF1.c0().h()) {
            jsaVarF1.c0().i(j);
            return true;
        }
        if (t59Var != t59.a && t59Var != t59.f) {
            jsaVarF1.w0(j);
            return true;
        }
        if (y1m.b(str)) {
            i3 = 3;
        } else {
            i3 = y1m.c(str) ? 2 : 1;
        }
        sdg sdgVarT = jsaVarF1.T();
        MessageModel messageModelH = ((opa) jsaVarF1.z2.a.getValue()).h(j);
        Long lValueOf = messageModelH != null ? Long.valueOf(messageModelH.b) : null;
        if (sdgVarT != null && lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            uea ueaVar = (uea) jsaVarF1.z1.getValue();
            int iD = qt4.D(i3);
            if (iD == 0) {
                i4 = 1;
            } else if (iD == 1) {
                i4 = 3;
            } else {
                if (iD != 2) {
                    ore.o();
                    return false;
                }
                i4 = 2;
            }
            ueaVar.a(jLongValue, i4, sdgVarT, 1);
        }
        Bundle bundleI = n1g.i(new ylc("messages:context_menu:message_id", Long.valueOf(j)), new ylc("messages:context_menu:link_url", str));
        ic6 ic6Var = jsaVarF1.E2;
        xnh xnhVar = new xnh(str);
        Integer numValueOf = Integer.valueOf(ru.oneme.app.R.drawable.icon_external_link);
        Integer numValueOf2 = Integer.valueOf(ru.oneme.app.R.drawable.copy_outline_24);
        int iD2 = qt4.D(i3);
        if (iD2 == 0) {
            listP0 = xw3.P0(new rp4(t59Var == t59.e ? ru.oneme.app.R.id.link_context_menu_action_open_profile : ru.oneme.app.R.id.link_context_menu_action_open_link, new tnh(ru.oneme.app.R.string.link_context_menu_action_open_link), numValueOf, (Integer) null, 20), new rp4(ru.oneme.app.R.id.link_context_menu_action_copy_link, new tnh(ru.oneme.app.R.string.link_context_menu_action_copy_link), numValueOf2, (Integer) null, 20));
        } else if (iD2 == 1) {
            listP0 = xw3.P0(new rp4(ru.oneme.app.R.id.link_context_menu_action_open_link, new tnh(ru.oneme.app.R.string.link_context_menu_action_open_phone_link), Integer.valueOf(ru.oneme.app.R.drawable.icon_call), (Integer) null, 20), new rp4(ru.oneme.app.R.id.link_context_menu_action_copy_link, new tnh(ru.oneme.app.R.string.link_context_menu_action_copy_phone_link), numValueOf2, (Integer) null, 20));
        } else {
            if (iD2 != 2) {
                ore.o();
                return false;
            }
            listP0 = xw3.P0(new rp4(ru.oneme.app.R.id.link_context_menu_action_open_link, new tnh(ru.oneme.app.R.string.link_context_menu_action_open_mail_link), numValueOf, (Integer) null, 20), new rp4(ru.oneme.app.R.id.link_context_menu_action_copy_link, new tnh(ru.oneme.app.R.string.link_context_menu_action_copy_mail_link), numValueOf2, (Integer) null, 20));
        }
        a8j.x(ic6Var, new k2g(rawX, rawY, xnhVar, bundleI, listP0));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Multi-variable type inference failed */
    public xx9 v(Uri uri, long j) {
        xx9 xx9Var;
        MediaExtractor mediaExtractor;
        Float f;
        Integer num;
        Object next;
        xx9 xx9Var2;
        String str = (String) this.b;
        Float f2 = null;
        try {
            mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource((Context) this.a, uri, (Map<String, String>) null);
                int trackCount = mediaExtractor.getTrackCount();
                try {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i = -1;
                    Long lValueOf = null;
                    int i2 = -1;
                    int i3 = 0;
                    while (i3 < trackCount) {
                        f = f2;
                        try {
                            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                            try {
                                b87 b87VarA = trk.a(trackFormat);
                                if (uya.m(trackFormat.getString("mime"))) {
                                    arrayList.add(b87VarA);
                                    if (i2 == i) {
                                        i2 = i3;
                                    }
                                } else if (uya.i(trackFormat.getString("mime"))) {
                                    arrayList2.add(b87VarA);
                                } else {
                                    arrayList3.add(b87VarA);
                                }
                                if (trackFormat.containsKey("durationUs")) {
                                    lValueOf = lValueOf != null ? Long.valueOf(Math.max(lValueOf.longValue(), trackFormat.getLong("durationUs"))) : Long.valueOf(trackFormat.getLong("durationUs"));
                                    i2 = i2;
                                } else {
                                    i3 = i3;
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    gm0.V(str, "Failed to extract media", th);
                                    return f;
                                } finally {
                                    mediaExtractor.release();
                                }
                            }
                        } catch (Throwable unused) {
                            i3 = i3;
                        }
                        i3++;
                        f2 = f;
                        i = -1;
                    }
                    f = f2;
                    Float fT = i2 != i ? t(mediaExtractor, i2) : f;
                    if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                        xx9Var2 = f;
                    } else {
                        b87 b87Var = (b87) ww3.t1(arrayList);
                        if (b87Var != null) {
                            int i4 = b87Var.p;
                            Integer numValueOf = Integer.valueOf(i4);
                            if (i4 != -1) {
                                num = numValueOf;
                            } else {
                                num = f;
                            }
                        } else {
                            num = f;
                        }
                        Iterator it = arrayList.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = f;
                                break;
                            }
                            next = it.next();
                        } while (!ex3.h(((b87) next).D));
                        xx9Var2 = new xx9(uri, lValueOf != null ? lValueOf.longValue() : -9223372036854775807L, -1L, ((b87) next) != null, (b87[]) arrayList.toArray(new b87[0]), (b87[]) arrayList2.toArray(new b87[0]), (b87[]) arrayList3.toArray(new b87[0]), SystemClock.elapsedRealtime() - j, 3, fT != null ? Float.valueOf((float) Math.ceil(fT.floatValue())) : f, num);
                    }
                    mediaExtractor.release();
                    return xx9Var2;
                } catch (Throwable th2) {
                    th = th2;
                    f = null;
                }
            } catch (Throwable th3) {
                th = th3;
                xx9Var = null;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                gm0.V(str, "Failed to open media extractor", th);
                return xx9Var;
            }
        } catch (Throwable th4) {
            th = th4;
            xx9Var = null;
            mediaExtractor = null;
        }
    }

    public mf w() {
        ku8 ku8Var = new ku8();
        Context context = (Context) this.a;
        mf mfVar = (mf) this.b;
        return new mf(new iee[]{ku8Var, new ed7(context, mfVar), new xr8(), new yr8(8), new ku8(), new kzi(context, mfVar, false)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0043: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:15:0x0043 */
    public Bitmap y(Uri uri, boolean z) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        ParcelFileDescriptor parcelFileDescriptor3;
        String str;
        String string;
        String string2;
        je9 je9Var = je9.f;
        try {
            try {
                parcelFileDescriptorOpenFileDescriptor = ((ContentResolver) this.a).openFileDescriptor(uri, "r");
                String str2 = "***";
                try {
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            if (gm0.c()) {
                                string2 = uri.toString();
                            } else {
                                if (uri instanceof Collection) {
                                    if (((Collection) uri).isEmpty()) {
                                        str2 = "[]";
                                    } else {
                                        str2 = "[**" + ((Collection) uri).size() + "**]";
                                    }
                                } else if (uri instanceof Map) {
                                    if (((Map) uri).isEmpty()) {
                                        str2 = "{}";
                                    } else {
                                        str2 = "{**" + ((Map) uri).size() + "**}";
                                    }
                                } else if (uri instanceof Object[]) {
                                    if (((Object[]) uri).length == 0) {
                                        str2 = "[]";
                                    } else {
                                        str2 = "[**" + ((Object[]) uri).length + "**]";
                                    }
                                } else if (uri instanceof int[]) {
                                    if (((int[]) uri).length == 0) {
                                        str2 = "[]";
                                    } else {
                                        str2 = "[**" + ((int[]) uri).length + "**]";
                                    }
                                } else if (uri instanceof float[]) {
                                    if (((float[]) uri).length == 0) {
                                        str2 = "[]";
                                    } else {
                                        str2 = "[**" + ((float[]) uri).length + "**]";
                                    }
                                } else if (uri instanceof long[]) {
                                    if (((long[]) uri).length == 0) {
                                        str2 = "[]";
                                    } else {
                                        str2 = "[**" + ((long[]) uri).length + "**]";
                                    }
                                } else if (uri instanceof double[]) {
                                    if (((double[]) uri).length == 0) {
                                        str2 = "[]";
                                    } else {
                                        str2 = "[**" + ((double[]) uri).length + "**]";
                                    }
                                } else if (uri instanceof short[]) {
                                    if (((short[]) uri).length == 0) {
                                        str2 = "[]";
                                    } else {
                                        str2 = "[**" + ((short[]) uri).length + "**]";
                                    }
                                } else if (uri instanceof byte[]) {
                                    if (((byte[]) uri).length == 0) {
                                        str2 = "[]";
                                    } else {
                                        str2 = "[**" + ((byte[]) uri).length + "**]";
                                    }
                                } else if (uri instanceof char[]) {
                                    if (((char[]) uri).length == 0) {
                                        str2 = "[]";
                                    } else {
                                        str2 = "[**" + ((char[]) uri).length + "**]";
                                    }
                                } else if (uri instanceof boolean[]) {
                                    if (((boolean[]) uri).length == 0) {
                                        str2 = "[]";
                                    } else {
                                        str2 = "[**" + ((boolean[]) uri).length + "**]";
                                    }
                                }
                                string2 = str2;
                            }
                            a4cVar.c(je9Var, "ih", "getBitmapFromPath: failed to open pfd for orientation, uri=" + string2, null);
                        }
                        oxl.c(parcelFileDescriptorOpenFileDescriptor);
                        return null;
                    }
                    try {
                        try {
                            FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                            try {
                                int i = sb8.j;
                                parcelFileDescriptor3 = parcelFileDescriptorOpenFileDescriptor;
                                try {
                                    int iD = new se6(fileDescriptor).d(1, "Orientation");
                                    Point pointB = sb8.B(parcelFileDescriptor3.getFileDescriptor(), iD);
                                    parcelFileDescriptor3.close();
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    if (z) {
                                        options.inMutable = true;
                                    }
                                    options.inSampleSize = sb8.F(pointB, np0.q, np0.q);
                                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = ((ContentResolver) this.a).openFileDescriptor(uri, "r");
                                    if (parcelFileDescriptorOpenFileDescriptor2 != null) {
                                        Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor(), null, options);
                                        parcelFileDescriptorOpenFileDescriptor2.close();
                                        int iJ = sb8.J(iD);
                                        if (iJ == 0) {
                                            oxl.c(parcelFileDescriptorOpenFileDescriptor2);
                                            return bitmapDecodeFileDescriptor;
                                        }
                                        Matrix matrix = new Matrix();
                                        matrix.setRotate(iJ);
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFileDescriptor, 0, 0, bitmapDecodeFileDescriptor.getWidth(), bitmapDecodeFileDescriptor.getHeight(), matrix, true);
                                        bitmapDecodeFileDescriptor.recycle();
                                        oxl.c(parcelFileDescriptorOpenFileDescriptor2);
                                        return bitmapCreateBitmap;
                                    }
                                    a4c a4cVar2 = gm0.f;
                                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                        if (gm0.c()) {
                                            string = uri.toString();
                                        } else {
                                            if (uri instanceof Collection) {
                                                if (((Collection) uri).isEmpty()) {
                                                    str = "[]";
                                                } else {
                                                    str = "[**" + ((Collection) uri).size() + "**]";
                                                }
                                            } else if (uri instanceof Map) {
                                                if (((Map) uri).isEmpty()) {
                                                    str = "{}";
                                                } else {
                                                    str = "{**" + ((Map) uri).size() + "**}";
                                                }
                                            } else if (uri instanceof Object[]) {
                                                if (((Object[]) uri).length == 0) {
                                                    str = "[]";
                                                } else {
                                                    str = "[**" + ((Object[]) uri).length + "**]";
                                                }
                                            } else if (uri instanceof int[]) {
                                                if (((int[]) uri).length == 0) {
                                                    str = "[]";
                                                } else {
                                                    str = "[**" + ((int[]) uri).length + "**]";
                                                }
                                            } else if (uri instanceof float[]) {
                                                if (((float[]) uri).length == 0) {
                                                    str = "[]";
                                                } else {
                                                    str = "[**" + ((float[]) uri).length + "**]";
                                                }
                                            } else if (uri instanceof long[]) {
                                                if (((long[]) uri).length == 0) {
                                                    str = "[]";
                                                } else {
                                                    str = "[**" + ((long[]) uri).length + "**]";
                                                }
                                            } else if (uri instanceof double[]) {
                                                if (((double[]) uri).length == 0) {
                                                    str = "[]";
                                                } else {
                                                    str = "[**" + ((double[]) uri).length + "**]";
                                                }
                                            } else if (uri instanceof short[]) {
                                                if (((short[]) uri).length == 0) {
                                                    str = "[]";
                                                } else {
                                                    str = "[**" + ((short[]) uri).length + "**]";
                                                }
                                            } else if (uri instanceof byte[]) {
                                                if (((byte[]) uri).length == 0) {
                                                    str = "[]";
                                                } else {
                                                    str = "[**" + ((byte[]) uri).length + "**]";
                                                }
                                            } else if (uri instanceof char[]) {
                                                if (((char[]) uri).length == 0) {
                                                    str = "[]";
                                                } else {
                                                    str = "[**" + ((char[]) uri).length + "**]";
                                                }
                                            } else if (!(uri instanceof boolean[])) {
                                                str = "***";
                                            } else if (((boolean[]) uri).length == 0) {
                                                str = "[]";
                                            } else {
                                                str = "[**" + ((boolean[]) uri).length + "**]";
                                            }
                                            string = str;
                                        }
                                        a4cVar2.c(je9Var, "ih", "getBitmapFromPath: failed to open pfd for decode, uri=" + string, null);
                                    }
                                    oxl.c(parcelFileDescriptorOpenFileDescriptor2);
                                    return null;
                                } catch (IOException e) {
                                    e = e;
                                    parcelFileDescriptorOpenFileDescriptor = parcelFileDescriptor3;
                                    if (e instanceof FileNotFoundException) {
                                        Bitmap bitmapX = x(uri.toString(), z);
                                        oxl.c(parcelFileDescriptorOpenFileDescriptor);
                                        return bitmapX;
                                    }
                                    gm0.V("ih", "getBitmapFromPath: failed to get bitmap", e);
                                    oxl.c(parcelFileDescriptorOpenFileDescriptor);
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    parcelFileDescriptor = parcelFileDescriptor3;
                                    oxl.c(parcelFileDescriptor);
                                    throw th;
                                }
                            } catch (IOException e2) {
                                e = e2;
                                parcelFileDescriptor3 = parcelFileDescriptorOpenFileDescriptor;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            parcelFileDescriptor3 = parcelFileDescriptorOpenFileDescriptor;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (IOException e5) {
                e = e5;
                parcelFileDescriptorOpenFileDescriptor = null;
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptor = null;
            }
        } catch (Throwable th4) {
            th = th4;
            parcelFileDescriptor = parcelFileDescriptor2;
        }
    }

    public hyh z() {
        return (hyh) this.a;
    }

    public /* synthetic */ ih(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ ih(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public ih(Context context, int i) {
        switch (i) {
            case 14:
                this.a = context;
                mf mfVar = new mf(2);
                this.b = mfVar;
                mfVar.w(context.getApplicationInfo().sourceDir);
                break;
            default:
                this.a = context;
                this.b = ih.class.getName();
                break;
        }
    }

    public /* synthetic */ ih(Object obj) {
        this.a = obj;
    }

    public ih(qf7 qf7Var) {
        this.a = qf7Var;
        this.b = new ur3();
    }
}
