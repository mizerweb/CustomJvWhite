package ru.ok.android.externcalls.sdk.ui.internal;

import android.view.Surface;
import defpackage.af7;
import defpackage.ls1;
import defpackage.m;
import defpackage.ms1;
import defpackage.os1;
import defpackage.ps1;
import defpackage.qs1;
import defpackage.t52;
import defpackage.tc;
import defpackage.u52;
import defpackage.uw;
import defpackage.xaj;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u001bR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\r008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/internal/VoipVideoRenderer;", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface;", "", SdkMetricStatEvent.NAME_KEY, "<init>", "(Ljava/lang/String;)V", "Lqs1;", "renderer", "Lorg/webrtc/RendererCommon$GlDrawer;", "drawer", "Lsbi;", "init", "(Lqs1;Lorg/webrtc/RendererCommon$GlDrawer;)V", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;", "listener", "addFrameSizeListener", "(Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;)V", "removeFrameSizeListener", "", "mirror", "setMirror", "(Z)V", "", "fps", "setFpsReduction", "(F)V", "disableFpsReduction", "()V", "pauseVideo", "clearImage", "Lorg/webrtc/VideoFrame;", "frame", "onFrame", "(Lorg/webrtc/VideoFrame;)V", "layoutAspectRatio", "setLayoutAspectRatio", "Landroid/view/Surface;", "surface", "createEglSurface", "(Landroid/view/Surface;)V", "Lkotlin/Function0;", "onDone", "releaseEglSurface", "(Laf7;)V", "release", "Lu52;", "callVideoDrawer", "Lu52;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lt52;", "drawerListener", "Lt52;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VoipVideoRenderer implements VideoRendererInterface {
    private final u52 callVideoDrawer;
    private final CopyOnWriteArrayList<VideoRendererInterface.FrameSizeListener> listeners = new CopyOnWriteArrayList<>();
    private final t52 drawerListener = new xaj(this);

    public VoipVideoRenderer(String str) {
        this.callVideoDrawer = new u52(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drawerListener$lambda$0(VoipVideoRenderer voipVideoRenderer, int i, int i2) {
        Iterator<T> it = voipVideoRenderer.listeners.iterator();
        while (it.hasNext()) {
            ((VideoRendererInterface.FrameSizeListener) it.next()).onFrame(i, i2);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void addFrameSizeListener(VideoRendererInterface.FrameSizeListener listener) {
        this.listeners.add(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void clearImage() {
        u52 u52Var = this.callVideoDrawer;
        synchronized (u52Var.h) {
            qs1 qs1Var = u52Var.g;
            if (qs1Var != null) {
                qs1Var.e.c("clearImage", new m(26, u52Var));
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void createEglSurface(Surface surface) {
        u52 u52Var = this.callVideoDrawer;
        u52Var.getClass();
        synchronized (u52Var.h) {
            try {
                qs1 qs1Var = u52Var.g;
                if (qs1Var != null) {
                    qs1Var.a.log(u52Var.j, "External request for surface creation");
                    qs1Var.e.c("createSurface", new tc(u52Var, 12, surface));
                } else {
                    u52Var.i = surface;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void init(qs1 renderer, RendererCommon.GlDrawer drawer) {
        u52 u52Var = this.callVideoDrawer;
        u52Var.getClass();
        synchronized (u52Var.h) {
            try {
                if (u52Var.g == null) {
                    u52Var.g = renderer;
                    renderer.e.c("initDrawer", new os1(u52Var, drawer, renderer));
                    Surface surface = u52Var.i;
                    if (surface != null) {
                        renderer.a.log(u52Var.j, "Got postponed surface request, process and reset reference");
                        renderer.e.c("createSurface", new tc(u52Var, 12, surface));
                    }
                    u52Var.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u52 u52Var2 = this.callVideoDrawer;
        t52 t52Var = this.drawerListener;
        u52Var2.getClass();
        t52Var.getClass();
        u52Var2.c.add(t52Var);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void onFrame(VideoFrame frame) {
        u52 u52Var = this.callVideoDrawer;
        u52Var.getClass();
        u52Var.l.c.incrementAndGet();
        synchronized (u52Var.h) {
            qs1 qs1Var = u52Var.g;
            if (qs1Var == null) {
                return;
            }
            AtomicReference atomicReference = u52Var.d;
            frame.retain();
            Object andSet = atomicReference.getAndSet(frame);
            if (andSet == null) {
                ms1 ms1Var = qs1Var.e;
                ps1 ps1Var = new ps1(u52Var, qs1Var);
                ms1Var.getClass();
                try {
                    ms1Var.k.post(new ls1(ps1Var, ms1Var, 0));
                } catch (IllegalStateException e) {
                    ms1Var.a.reportException(ms1Var.j, "OpenGL tread died, is it fine?", e);
                }
            }
            VideoFrame videoFrame = (VideoFrame) andSet;
            if (videoFrame != null) {
                videoFrame.release();
                u52Var.l.d.incrementAndGet();
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void release() {
        u52 u52Var = this.callVideoDrawer;
        t52 t52Var = this.drawerListener;
        u52Var.getClass();
        t52Var.getClass();
        u52Var.c.remove(t52Var);
        u52 u52Var2 = this.callVideoDrawer;
        synchronized (u52Var2.h) {
            qs1 qs1Var = u52Var2.g;
            if (qs1Var == null) {
                return;
            }
            qs1Var.e.c("releaseDrawer", new ps1(qs1Var, u52Var2));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void releaseEglSurface(af7 onDone) {
        u52 u52Var = this.callVideoDrawer;
        u52Var.getClass();
        synchronized (u52Var.h) {
            u52Var.i = null;
            qs1 qs1Var = u52Var.g;
            if (qs1Var == null) {
                onDone.invoke();
                return;
            }
            qs1Var.a.log(u52Var.j, "External request for surface release");
            if (!qs1Var.e.c("releaseSurface", new os1(qs1Var, u52Var, onDone, 0))) {
                onDone.invoke();
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void removeFrameSizeListener(VideoRendererInterface.FrameSizeListener listener) {
        this.listeners.remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setFpsReduction(float fps) {
        uw uwVar = this.callVideoDrawer.e;
        synchronized (uwVar) {
            try {
                long j = uwVar.c;
                if (fps <= 0.0f) {
                    uwVar.c = BuildConfig.MAX_TIME_TO_UPLOAD;
                } else {
                    uwVar.c = (long) (1.0E9f / fps);
                }
                if (uwVar.c != j) {
                    uwVar.b = System.nanoTime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setLayoutAspectRatio(float layoutAspectRatio) {
        ((AtomicReference) this.callVideoDrawer.f.b).set(Float.valueOf(layoutAspectRatio));
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setMirror(boolean mirror) {
        ((AtomicBoolean) this.callVideoDrawer.f.c).set(mirror);
    }
}
