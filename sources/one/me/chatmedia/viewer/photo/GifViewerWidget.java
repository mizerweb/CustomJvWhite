package one.me.chatmedia.viewer.photo;

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
import defpackage.g58;
import defpackage.h;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j8e;
import defpackage.ky9;
import defpackage.l63;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.qy9;
import defpackage.r8e;
import defpackage.rui;
import defpackage.t2m;
import defpackage.t3f;
import defpackage.tm7;
import defpackage.uj6;
import defpackage.vv;
import defpackage.x5j;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zo7;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/chatmedia/viewer/photo/GifViewerWidget;", "Lone/me/chatmedia/viewer/photo/BasePhotoViewerWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Lt3f;", "scopeId", "(JLjava/lang/String;Lt3f;)V", "chat-media-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GifViewerWidget extends BasePhotoViewerWidget {
    public static final /* synthetic */ zv8[] m = {new dwd(GifViewerWidget.class, "msgId", "getMsgId()J", 0), zo5.f(zfe.a, GifViewerWidget.class, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), new dwd(GifViewerWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), new dwd(GifViewerWidget.class, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0)};
    public final String c;
    public final ny8 d;
    public final ny8 e;
    public final vv f;
    public final vv g;
    public final ny8 h;
    public final j8e i;
    public uj6 j;
    public rui k;
    public final zo7 l;

    public GifViewerWidget(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.c = GifViewerWidget.class.getName();
        this.d = hVar.getAccessor().d(26);
        this.e = hVar.getAccessor().d(85);
        this.f = new vv(Long.class, 0L, "chat.media.viewer.message_id");
        this.g = new vv(String.class, "", "chat.media.viewer.attach_id");
        vv vvVar = new vv(t3f.class, getD(), Widget.ARG_SCOPE_ID);
        zv8 zv8Var = m[2];
        this.h = getSharedViewModel((t3f) vvVar.a(this), l63.class, null);
        this.i = viewBinding(R.id.oneme_chatmedia_viewer_photo_gif_view);
        this.l = new zo7(16, this);
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void o1() {
        b68 b68VarP1 = p1();
        if (b68VarP1 == null) {
            return;
        }
        y1().S(v1(), u1());
        bwc bwcVarQ1 = q1();
        zv8[] zv8VarArr = bwc.A;
        bwcVarQ1.k(b68VarP1, false);
        ic6 ic6Var = y1().Y;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new tm7(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().u1, getViewLifecycleOwner().f(), n09Var), new tm7(lq4Var, this, 1), i), getViewLifecycleScope());
    }

    @Override // defpackage.br4
    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        if (getView() == null || this.k == null) {
            return;
        }
        x1().a(this.l);
        e3j e3jVarW1 = w1();
        if (e3jVarW1 != null) {
            e3jVarW1.play();
        }
    }

    @Override // defpackage.br4
    public final void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
        if (getView() == null || this.k == null) {
            return;
        }
        e3j e3jVarW1 = w1();
        if (e3jVarW1 != null) {
            e3jVarW1.pause();
            e3jVarW1.H(null);
        }
        x1().b();
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
        this.j = new uj6(x5jVar);
        frameLayout.addView(x5jVar);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        uj6 uj6Var = this.j;
        if (uj6Var != null) {
            uj6Var.h();
        }
        this.j = null;
        this.k = null;
        x1().b();
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final b68 p1() {
        g58 g58Var;
        qy9 qy9VarM = y1().M(v1(), u1());
        ky9 ky9Var = qy9VarM instanceof ky9 ? (ky9) qy9VarM : null;
        if (ky9Var == null || (g58Var = ky9Var.d) == null) {
            return null;
        }
        return t2m.b(g58Var);
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void r1() {
        y1().R(v1(), u1());
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void s1() {
        y1().T(v1(), u1());
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final r8e t1() {
        return y1().w1;
    }

    public final String u1() {
        zv8 zv8Var = m[1];
        return (String) this.g.a(this);
    }

    public final long v1() {
        zv8 zv8Var = m[0];
        return ((Number) this.f.a(this)).longValue();
    }

    public final e3j w1() {
        Object targetController = getTargetController();
        a6j a6jVar = targetController instanceof a6j ? (a6j) targetController : null;
        if (a6jVar != null) {
            return a6jVar.w0();
        }
        return null;
    }

    public final x5j x1() {
        return (x5j) this.i.m(this, m[3]);
    }

    public final l63 y1() {
        return (l63) this.h.getValue();
    }

    public GifViewerWidget(long j, String str, t3f t3fVar) {
        this(n1g.i(new ylc("chat.media.viewer.message_id", Long.valueOf(j)), new ylc("chat.media.viewer.attach_id", str), new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
