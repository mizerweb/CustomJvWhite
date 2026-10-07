package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.WeakHashMap;
import org.webrtc.RendererCommon;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.tamtam.exception.IssueKeyException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c62 extends FrameLayout implements qnc {
    public static final /* synthetic */ int r = 0;
    public final h a;
    public final ifh b;
    public final Handler c;
    public TextureViewRenderer d;
    public ImageView e;
    public Bitmap f;
    public z52 g;
    public cf7 h;
    public af7 i;
    public npi j;
    public boolean k;
    public p4j l;
    public p4j m;
    public a62 n;
    public final ny8 o;
    public boolean p;
    public boolean q;

    public c62(Context context, ha9 ha9Var) {
        lxi videoLayoutUpdatesController;
        super(context);
        r7 r7Var = r7.a;
        this.a = new h(r7.d(ha9Var));
        final int i = 0;
        this.b = new ifh(new af7(this) { // from class: y52
            public final /* synthetic */ c62 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                c62 c62Var = this.b;
                switch (i2) {
                    case 0:
                        return (rnc) c62Var.a.getAccessor().c(57);
                    default:
                        return new c3(23, c62Var);
                }
            }
        });
        this.c = new Handler(Looper.getMainLooper());
        final int i2 = 1;
        this.o = rx8.P(3, new af7(this) { // from class: y52
            public final /* synthetic */ c62 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                c62 c62Var = this.b;
                switch (i3) {
                    case 0:
                        return (rnc) c62Var.a.getAccessor().c(57);
                    default:
                        return new c3(23, c62Var);
                }
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addOnLayoutChangeListener(new xc0(4, this));
        if (!isLaidOut() || this.d == null || (videoLayoutUpdatesController = getVideoLayoutUpdatesController()) == null) {
            return;
        }
        videoLayoutUpdatesController.a(this, this.l);
    }

    public static void a(c62 c62Var) {
        c62Var.c.post(c62Var.getUpdateWhenReadyRunnable());
    }

    public static void b(c62 c62Var) {
        if (c62Var.q) {
            return;
        }
        d(c62Var);
        z52 z52Var = c62Var.g;
        if (z52Var != null) {
            z52Var.c(true);
        }
        c62Var.q = true;
        lxi videoLayoutUpdatesController = c62Var.getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            ((x02) ((b95) videoLayoutUpdatesController.d.getValue()).i.a.getValue()).f();
        }
    }

    public static void d(c62 c62Var) {
        ImageView imageView = c62Var.e;
        if (imageView != null) {
            imageView.setVisibility(8);
            Bitmap bitmap = c62Var.f;
            ImageView imageView2 = c62Var.e;
            if (imageView2 != null) {
                imageView2.setImageDrawable(null);
            }
            c62Var.f = null;
            if (bitmap != null) {
                c62Var.c.post(new qy0(bitmap, 1));
            }
        }
    }

    private final boolean getHasLastFrame() {
        ImageView imageView = this.e;
        return imageView != null && imageView.getVisibility() == 0;
    }

    private final FrameLayout.LayoutParams getParams() {
        if (this.p) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        return layoutParams2;
    }

    private final Runnable getUpdateWhenReadyRunnable() {
        return (Runnable) this.o.getValue();
    }

    private final rnc getVideoController() {
        return (rnc) this.b.getValue();
    }

    public final lxi getVideoLayoutUpdatesController() {
        af7 af7Var = this.i;
        if (af7Var != null) {
            return (lxi) af7Var.invoke();
        }
        return null;
    }

    public final void e(boolean z) {
        Object poeVar;
        a62 a62Var;
        Bitmap bitmap;
        if (z) {
            d(this);
            p4j p4jVar = this.l;
            if (p4jVar != null && (bitmap = (Bitmap) ((unc) getVideoController()).e.remove(unc.f(p4jVar))) != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        if (this.d != null && (a62Var = this.n) != null) {
            p4j p4jVar2 = this.l;
            ((z42) a62Var).a(null, (p4jVar2 != null ? p4jVar2.b.getType() : null) == v4j.b);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            p4j p4jVar3 = this.l;
            if (p4jVar3 != null) {
                rnc videoController = getVideoController();
                ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = p4jVar3.b;
                unc uncVar = (unc) videoController;
                uncVar.getClass();
                uncVar.removeParticipantView(conversationVideoTrackParticipantKey, textureViewRenderer);
            }
            lxi videoLayoutUpdatesController = getVideoLayoutUpdatesController();
            if (videoLayoutUpdatesController != null) {
                videoLayoutUpdatesController.c(textureViewRenderer);
            }
            ((unc) getVideoController()).getClass();
            textureViewRenderer.release();
        }
        if (!z) {
            d(this);
        }
        if (getChildCount() > 0) {
            Object poeVar2 = sbi.a;
            try {
                removeAllViews();
                poeVar = poeVar2;
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                gm0.x(c62.class.getName(), "Can't remove child views by removeAllViews, try use fallback", thA);
            }
            if (poeVar instanceof poe) {
                try {
                    for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
                        removeViewAt(childCount);
                    }
                } catch (Throwable th2) {
                    poeVar2 = new poe(th2);
                }
                Throwable thA2 = roe.a(poeVar2);
                if (thA2 != null) {
                    IssueKeyException issueKeyException = new IssueKeyException("43758", "Can't remove child view from CallVideoView", thA2);
                    gm0.V(c62.class.getName(), issueKeyException.getMessage(), issueKeyException);
                }
            }
        }
        this.e = null;
        z52 z52Var = this.g;
        if (z52Var != null) {
            z52Var.c(false);
        }
        this.l = null;
        this.d = null;
        this.m = null;
        this.q = false;
        this.c.removeCallbacks(getUpdateWhenReadyRunnable());
        ((unc) getVideoController()).f.remove(this);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7 A[ORIG_RETURN, RETURN] */
    public final void f(Bitmap bitmap) {
        p4j p4jVar;
        ImageView imageView;
        Bitmap bitmap2;
        Object poeVar;
        if (this.p || (p4jVar = this.l) == null) {
            return;
        }
        if (cqk.d(this.m, p4jVar)) {
            unc uncVar = (unc) getVideoController();
            uncVar.getClass();
            snc sncVarF = unc.f(p4jVar);
            tnc tncVar = uncVar.e;
            Bitmap bitmap3 = (Bitmap) tncVar.get(sncVarF);
            if (bitmap3 != null && bitmap3.isRecycled()) {
                tncVar.remove(sncVarF);
            } else if (bitmap3 != null) {
                return;
            }
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            if (!textureViewRenderer.getHasImage() || !textureViewRenderer.isAvailable() || textureViewRenderer.getWidth() <= 0 || textureViewRenderer.getHeight() <= 0) {
                bitmap2 = null;
            } else {
                float fMin = Math.min(1.0f, 240.0f / Math.max(textureViewRenderer.getWidth(), textureViewRenderer.getHeight()));
                int width = (int) (textureViewRenderer.getWidth() * fMin);
                if (width < 1) {
                    width = 1;
                }
                int height = (int) (textureViewRenderer.getHeight() * fMin);
                if (height < 1) {
                    height = 1;
                }
                try {
                    poeVar = textureViewRenderer.getBitmap(width, height);
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                if (poeVar instanceof poe) {
                    poeVar = null;
                }
                bitmap2 = (Bitmap) poeVar;
                if (bitmap2 == null || bitmap2.isRecycled()) {
                    bitmap2 = null;
                }
            }
            if (bitmap2 != null) {
                bitmap = bitmap2;
            } else if (bitmap == null) {
                return;
            }
        } else if (bitmap == null) {
            return;
        }
        boolean z = bitmap == this.f;
        unc uncVar2 = (unc) getVideoController();
        uncVar2.getClass();
        if (!bitmap.isRecycled()) {
            uncVar2.e.put(unc.f(p4jVar), bitmap);
        }
        if (z && (imageView = this.e) != null) {
            imageView.setVisibility(8);
            ImageView imageView2 = this.e;
            if (imageView2 != null) {
                imageView2.setImageDrawable(null);
            }
            this.f = null;
        }
        this.m = p4jVar;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final void g() {
        p4j p4jVar;
        boolean z;
        p4j p4jVar2;
        p4j p4jVar3;
        TextureViewRenderer textureViewRenderer;
        npi npiVar = this.j;
        boolean z2 = this.k;
        ParticipantId participantId = null;
        if (npiVar == null) {
            p4jVar = null;
        } else {
            p4jVar = npiVar.d;
            boolean z3 = npiVar.c;
            boolean z4 = npiVar.g;
            if (npiVar.b && z4) {
                p4jVar = null;
            } else if (!z2 || !z3) {
                if (z4) {
                    p4jVar = npiVar.h;
                } else if (!z3) {
                    p4jVar = null;
                }
            }
        }
        boolean z5 = false;
        boolean z6 = (npiVar != null && ((npiVar != null && npiVar.b) || (npiVar.e && npiVar.f))) && (p4jVar != null && p4jVar.a);
        if (z6) {
            boolean z7 = (p4jVar != null ? p4jVar.b.getType() : null) == v4j.b;
            p4j p4jVar4 = this.l;
            if (!cqk.d(p4jVar4, p4jVar)) {
                this.m = null;
            }
            p4j p4jVar5 = this.l;
            if (p4jVar5 != null && (textureViewRenderer = this.d) != null) {
                boolean zEquals = p4jVar5.equals(p4jVar);
                if (!zEquals) {
                    f(null);
                    this.q = false;
                }
                lxi videoLayoutUpdatesController = getVideoLayoutUpdatesController();
                if (videoLayoutUpdatesController != null) {
                    videoLayoutUpdatesController.c(textureViewRenderer);
                }
                if (!zEquals) {
                    rnc videoController = getVideoController();
                    ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = p4jVar5.b;
                    unc uncVar = (unc) videoController;
                    uncVar.getClass();
                    uncVar.removeParticipantView(conversationVideoTrackParticipantKey, textureViewRenderer);
                    getVideoController().setParticipantView(p4jVar.b, textureViewRenderer);
                }
                lxi videoLayoutUpdatesController2 = getVideoLayoutUpdatesController();
                if (videoLayoutUpdatesController2 != null) {
                    videoLayoutUpdatesController2.a(textureViewRenderer, p4jVar);
                }
            }
            wfe wfeVar = new wfe();
            TextureViewRenderer textureViewRenderer2 = this.d;
            wfeVar.a = textureViewRenderer2;
            if (textureViewRenderer2 != null) {
                textureViewRenderer2.setScalingType((z7 && this.p) ? RendererCommon.ScalingType.SCALE_ASPECT_FIT : RendererCommon.ScalingType.SCALE_ASPECT_FILL, RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            }
            if (this.p || this.q) {
                d(this);
            } else if (!cqk.d(p4jVar4, p4jVar) || !getHasLastFrame()) {
                Bitmap bitmap = (Bitmap) ((unc) getVideoController()).e.remove(unc.f(p4jVar));
                if (bitmap == null || bitmap.isRecycled()) {
                    bitmap = null;
                }
                if (bitmap == null) {
                    d(this);
                } else {
                    ImageView imageView = this.e;
                    if (imageView == null) {
                        imageView = new ImageView(getContext());
                        imageView.setId(R.id.call_participant_last_frame);
                        imageView.setLayoutParams(getParams());
                        this.e = imageView;
                    }
                    imageView.setScaleType(z7 ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_CROP);
                    Bitmap bitmap2 = this.f;
                    if (bitmap2 != bitmap) {
                        ImageView imageView2 = this.e;
                        if (imageView2 != null) {
                            imageView2.setImageDrawable(null);
                        }
                        this.f = null;
                        if (bitmap2 != null) {
                            this.c.post(new qy0(bitmap2, 1));
                        }
                    }
                    imageView.setImageBitmap(bitmap);
                    this.f = bitmap;
                    if (imageView.getParent() == null) {
                        addView(imageView, getParams());
                    }
                    imageView.setVisibility(0);
                }
            }
            Object obj = wfeVar.a;
            if (obj == null) {
                RendererView rendererViewMo135createVideoViewInstance = ((unc) getVideoController()).mo135createVideoViewInstance(getContext());
                TextureViewRenderer textureViewRenderer3 = (TextureViewRenderer) rendererViewMo135createVideoViewInstance;
                textureViewRenderer3.setId(R.id.call_participant_video_renderer);
                wfeVar.a = rendererViewMo135createVideoViewInstance;
                textureViewRenderer3.setScalingType((z7 && this.p) ? RendererCommon.ScalingType.SCALE_ASPECT_FIT : RendererCommon.ScalingType.SCALE_ASPECT_FILL, RendererCommon.ScalingType.SCALE_ASPECT_FIT);
                addView((View) wfeVar.a, 0, getParams());
                getVideoController().setParticipantView(p4jVar.b, (RendererView) wfeVar.a);
                lxi videoLayoutUpdatesController3 = getVideoLayoutUpdatesController();
                if (videoLayoutUpdatesController3 != null) {
                    videoLayoutUpdatesController3.a((View) wfeVar.a, p4jVar);
                }
                this.d = (TextureViewRenderer) wfeVar.a;
                WeakHashMap weakHashMap = i7j.a;
                if (!isLaidOut() || isLayoutRequested()) {
                    addOnLayoutChangeListener(new b62(this, 0, wfeVar));
                } else {
                    lxi videoLayoutUpdatesController4 = getVideoLayoutUpdatesController();
                    if (videoLayoutUpdatesController4 != null) {
                        videoLayoutUpdatesController4.a((View) wfeVar.a, this.l);
                    }
                }
                ((TextureViewRenderer) wfeVar.a).setFrameSizeListener(new s81(5, this));
                a62 a62Var = this.n;
                if (a62Var != null) {
                    ((z42) a62Var).a((TextureViewRenderer) wfeVar.a, z7);
                }
            } else {
                a62 a62Var2 = this.n;
                if (a62Var2 != null) {
                    ((z42) a62Var2).a((TextureViewRenderer) obj, z7);
                }
            }
            this.l = p4jVar;
        } else {
            p4j p4jVar6 = this.l;
            if (p4jVar6 == null) {
                z = false;
            } else {
                ParticipantId participantId2 = p4jVar6.b.getParticipantId();
                if (!cqk.d((npiVar == null || (p4jVar3 = npiVar.d) == null) ? null : p4jVar3.b.getParticipantId(), participantId2)) {
                    if (npiVar != null && (p4jVar2 = npiVar.h) != null) {
                        participantId = p4jVar2.b.getParticipantId();
                    }
                    if (!cqk.d(participantId, participantId2)) {
                        z = false;
                    }
                }
                z = true;
            }
            e(z);
        }
        z52 z52Var = this.g;
        if (z52Var != null) {
            if (z6 && (this.q || getHasLastFrame())) {
                z5 = true;
            }
            z52Var.c(z5);
        }
        ((unc) getVideoController()).f.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
        lxi videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.a(this, this.l);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        f(this.f);
        lxi videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.c(this);
        }
        e(false);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cf7 cf7Var = this.h;
        return cf7Var != null ? ((Boolean) cf7Var.invoke(motionEvent)).booleanValue() : super.onTouchEvent(motionEvent);
    }

    public final void setFullScreen(boolean z) {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            ViewGroup.LayoutParams layoutParams = textureViewRenderer.getLayoutParams();
            if (layoutParams == null) {
                p51.d();
                return;
            } else {
                setLayoutParams(getParams());
                textureViewRenderer.setLayoutParams(layoutParams);
            }
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 == null) {
                p51.d();
                return;
            } else {
                setLayoutParams(getParams());
                imageView.setLayoutParams(layoutParams2);
            }
        }
        this.p = z;
    }

    public final void setListener(z52 z52Var) {
        this.g = z52Var;
    }

    public final void setRendererListener(a62 a62Var) {
        this.n = a62Var;
    }

    public final void setTouchEventHandler(cf7 cf7Var) {
        this.h = cf7Var;
    }

    public final void setVideoLayoutUpdatesControllerProvider(af7 af7Var) {
        this.i = af7Var;
    }
}
