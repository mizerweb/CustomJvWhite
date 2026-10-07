package one.me.mediaeditor;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a6j;
import defpackage.b68;
import defpackage.bwc;
import defpackage.dwd;
import defpackage.e3j;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.h;
import defpackage.hb9;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j8e;
import defpackage.lq4;
import defpackage.lx9;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.r8e;
import defpackage.rui;
import defpackage.sm7;
import defpackage.t2m;
import defpackage.t3f;
import defpackage.uj6;
import defpackage.vn7;
import defpackage.vv;
import defpackage.x5j;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.chatmedia.viewer.photo.BasePhotoViewerWidget;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/mediaeditor/GifViewerWidget;", "Lone/me/chatmedia/viewer/photo/BasePhotoViewerWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "localMediaId", "Lt3f;", "scopeId", "(JLt3f;)V", "media-editor"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GifViewerWidget extends BasePhotoViewerWidget {
    public static final /* synthetic */ zv8[] l = {new dwd(GifViewerWidget.class, "localMediaId", "getLocalMediaId()J", 0), zo5.f(zfe.a, GifViewerWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), new dwd(GifViewerWidget.class, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0)};
    public final String c;
    public final ny8 d;
    public final ny8 e;
    public final vv f;
    public final ny8 g;
    public final j8e h;
    public uj6 i;
    public rui j;
    public final vn7 k;

    public GifViewerWidget(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.c = GifViewerWidget.class.getName();
        this.d = hVar.getAccessor().d(26);
        this.e = hVar.getAccessor().d(85);
        this.f = new vv(Long.class, 0L, "arg_local_id");
        vv vvVar = new vv(t3f.class, getD(), Widget.ARG_SCOPE_ID);
        zv8 zv8Var = l[1];
        this.g = getSharedViewModel((t3f) vvVar.a(this), lx9.class, null);
        this.h = viewBinding(R.id.oneme_chatmedia_viewer_photo_gif_view);
        this.k = new vn7(17, this);
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void o1() {
        b68 b68VarP1 = p1();
        if (b68VarP1 == null) {
            return;
        }
        x1().S(u1());
        bwc bwcVarQ1 = q1();
        zv8[] zv8VarArr = bwc.A;
        bwcVarQ1.k(b68VarP1, false);
        ic6 ic6Var = x1().n1;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new sm7(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(x1().F, getViewLifecycleOwner().f(), n09Var), new sm7(lq4Var, this, 1), i), getViewLifecycleScope());
    }

    @Override // defpackage.br4
    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        if (getView() == null || this.j == null) {
            return;
        }
        w1().a(this.k);
        e3j e3jVarV1 = v1();
        if (e3jVarV1 != null) {
            e3jVarV1.play();
        }
    }

    @Override // defpackage.br4
    public final void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
        if (getView() == null || this.j == null) {
            return;
        }
        e3j e3jVarV1 = v1();
        if (e3jVarV1 != null) {
            e3jVarV1.pause();
            e3jVarV1.H(null);
        }
        w1().b();
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget, defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        bwc bwcVar = new bwc(frameLayout.getContext());
        bwcVar.setId(R.id.oneme_chatmedia_viewer_photo_view);
        bwcVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.addView(bwcVar);
        x5j x5jVar = new x5j(frameLayout.getContext());
        x5jVar.setId(R.id.oneme_chatmedia_viewer_photo_gif_view);
        x5jVar.setAlpha(0.0f);
        x5jVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.i = new uj6(x5jVar);
        frameLayout.addView(x5jVar);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        uj6 uj6Var = this.i;
        if (uj6Var != null) {
            uj6Var.h();
        }
        this.i = null;
        this.j = null;
        w1().b();
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final b68 p1() {
        hb9 hb9VarJ = x1().J(u1());
        if (hb9VarJ != null) {
            return t2m.c(hb9VarJ, null);
        }
        return null;
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void r1() {
        x1().R(u1());
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void s1() {
        x1().T(u1());
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final r8e t1() {
        return x1().I;
    }

    public final long u1() {
        zv8 zv8Var = l[0];
        return ((Number) this.f.a(this)).longValue();
    }

    public final e3j v1() {
        Object targetController = getTargetController();
        a6j a6jVar = targetController instanceof a6j ? (a6j) targetController : null;
        if (a6jVar != null) {
            return a6jVar.w0();
        }
        return null;
    }

    public final x5j w1() {
        return (x5j) this.h.m(this, l[2]);
    }

    public final lx9 x1() {
        return (lx9) this.g.getValue();
    }

    public GifViewerWidget(long j, t3f t3fVar) {
        this(n1g.i(new ylc("arg_local_id", Long.valueOf(j)), new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
