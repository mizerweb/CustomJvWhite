package one.me.chatmedia.viewer.video;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a6j;
import defpackage.dwd;
import defpackage.e3j;
import defpackage.e9i;
import defpackage.ft0;
import defpackage.fz6;
import defpackage.g0d;
import defpackage.h;
import defpackage.i3j;
import defpackage.j8e;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.pp5;
import defpackage.pui;
import defpackage.qo7;
import defpackage.r8e;
import defpackage.rui;
import defpackage.sfd;
import defpackage.uj6;
import defpackage.x5j;
import defpackage.xva;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/chatmedia/viewer/video/BaseVideoViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-media-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BaseVideoViewerWidget extends Widget {
    public static final /* synthetic */ zv8[] j = {new dwd(BaseVideoViewerWidget.class, "videoPreviewView", "getVideoPreviewView()Lone/me/chatmedia/viewer/video/VideoPreviewView;", 0), zo5.f(zfe.a, BaseVideoViewerWidget.class, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0), new dwd(BaseVideoViewerWidget.class, "zoomWrapper", "getZoomWrapper()Lone/me/chatmedia/viewer/video/PinchToZoomVideoWrapper;", 0)};
    public final j8e a;
    public final j8e b;
    public final j8e c;
    public uj6 d;
    public rui e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ft0 i;

    public BaseVideoViewerWidget(Bundle bundle) {
        super(bundle);
        this.a = viewBinding(R.id.oneme_chatmedia_viewer_video_preview_view);
        this.b = viewBinding(R.id.oneme_chatmedia_viewer_video_view);
        this.c = viewBinding(R.id.oneme_chatmedia_viewer_video_zoom_view);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.f = hVar.getAccessor().d(85);
        this.g = hVar.getAccessor().d(82);
        this.h = hVar.getAccessor().d(26);
        this.i = new ft0(this);
    }

    public abstract void o1();

    @Override // defpackage.br4
    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        a6j a6jVarQ1 = q1();
        e3j e3jVarW0 = a6jVarQ1 != null ? a6jVarQ1.w0() : null;
        boolean z = e3jVarW0 != null && (e3jVarW0.P() || e3jVarW0.isIdle());
        if (getView() == null || this.e == null || !z) {
            return;
        }
        s1().a(this.i);
    }

    @Override // defpackage.br4
    public final void onActivityStopped(Activity activity) {
        e3j e3jVarW0;
        super.onActivityStopped(activity);
        if (getView() == null || this.e == null) {
            return;
        }
        a6j a6jVarQ1 = q1();
        if (a6jVarQ1 != null && (e3jVarW0 = a6jVarQ1.w0()) != null) {
            e3jVarW0.pause();
            e3jVarW0.H(null);
        }
        s1().b();
    }

    @Override // defpackage.br4
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g0d g0dVar = new g0d(getContext());
        g0dVar.setId(R.id.oneme_chatmedia_viewer_video_zoom_view);
        g0dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        g0dVar.setEnabled(getArgs().getBoolean("arg_gesture_enabled", true));
        g0dVar.setDoubleTapSeekEventDelegate(new pp5(g0dVar.getContext(), g0dVar, new qo7(20, this), new xva(2, this)));
        i3j i3jVar = new i3j(g0dVar.getContext());
        i3jVar.setId(R.id.oneme_chatmedia_viewer_video_preview_view);
        i3jVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        g0dVar.addView(i3jVar);
        x5j x5jVar = new x5j(g0dVar.getContext());
        x5jVar.setId(R.id.oneme_chatmedia_viewer_video_view);
        x5jVar.setAlpha(0.0f);
        x5jVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.d = new uj6(x5jVar);
        g0dVar.addView(x5jVar);
        return g0dVar;
    }

    @Override // defpackage.br4
    public void onDestroyView(View view) {
        super.onDestroyView(view);
        uj6 uj6Var = this.d;
        if (uj6Var != null) {
            uj6Var.h();
        }
        this.d = null;
        this.e = null;
        s1().b();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        o1();
        e9i.j0(new fz6(n1g.v(t1(), getViewLifecycleOwner().f(), n09.d), new sfd(22, (lq4) null, this), 3), getViewLifecycleScope());
        pui puiVarP1 = p1();
        if (puiVarP1 == null) {
            return;
        }
        r1().l(puiVarP1);
    }

    public abstract pui p1();

    public final a6j q1() {
        Object targetController = getTargetController();
        if (targetController instanceof a6j) {
            return (a6j) targetController;
        }
        return null;
    }

    public final i3j r1() {
        return (i3j) this.a.m(this, j[0]);
    }

    public final x5j s1() {
        return (x5j) this.b.m(this, j[1]);
    }

    public abstract r8e t1();
}
