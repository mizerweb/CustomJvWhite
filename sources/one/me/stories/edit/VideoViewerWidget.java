package one.me.stories.edit;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a4c;
import defpackage.a6j;
import defpackage.c4h;
import defpackage.c6j;
import defpackage.dwd;
import defpackage.e3j;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.g0d;
import defpackage.g8c;
import defpackage.gm0;
import defpackage.hb9;
import defpackage.i19;
import defpackage.i3j;
import defpackage.ic6;
import defpackage.je9;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.p26;
import defpackage.pp5;
import defpackage.pui;
import defpackage.pxg;
import defpackage.r5j;
import defpackage.r8e;
import defpackage.t3f;
import defpackage.uj6;
import defpackage.vbi;
import defpackage.vv;
import defpackage.wtc;
import defpackage.x5j;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.chatmedia.viewer.video.BaseVideoViewerWidget;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/stories/edit/VideoViewerWidget;", "Lone/me/chatmedia/viewer/video/BaseVideoViewerWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "isGesturesEnabled", "(Lt3f;Z)V", "stories"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoViewerWidget extends BaseVideoViewerWidget {
    public static final /* synthetic */ zv8[] o;
    public final String k;
    public final ny8 l;
    public final ny8 m;
    public g8c n;

    static {
        dwd dwdVar = new dwd(VideoViewerWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0);
        zfe.a.getClass();
        o = new zv8[]{dwdVar};
    }

    public VideoViewerWidget(Bundle bundle) {
        super(bundle);
        this.k = VideoViewerWidget.class.getName();
        this.l = new wtc(m35getAccountScopeuqN4xOY()).getAccessor().d(26);
        vv vvVar = new vv(t3f.class, pxg.a, "arg_story_editor_parent_scope_id");
        zv8 zv8Var = o[0];
        this.m = getSharedViewModel((t3f) vvVar.a(this), p26.class, null);
    }

    @Override // one.me.chatmedia.viewer.video.BaseVideoViewerWidget
    public final void o1() {
        ic6 ic6Var = v1().F1;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new c6j(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(v1().D1, getViewLifecycleOwner().f(), n09Var), new c6j(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(v1().H1, getViewLifecycleOwner().f(), n09Var), new c6j(lq4Var, this, 2), i), getViewLifecycleScope());
    }

    @Override // one.me.chatmedia.viewer.video.BaseVideoViewerWidget, defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g0d g0dVar = new g0d(getContext());
        g0dVar.setId(R.id.oneme_chatmedia_viewer_video_zoom_view);
        g0dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        g0dVar.setDoubleTapSeekEventDelegate(new pp5(g0dVar.getContext(), g0dVar, new vbi(14, this), new c4h(4, this)));
        i3j i3jVar = new i3j(g0dVar.getContext());
        i3jVar.setId(R.id.oneme_chatmedia_viewer_video_preview_view);
        i3jVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        g0dVar.addView(i3jVar);
        x5j x5jVar = new x5j(g0dVar.getContext());
        x5jVar.setId(R.id.oneme_chatmedia_viewer_video_view);
        x5jVar.setAlpha(0.0f);
        x5jVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        this.d = new uj6(x5jVar);
        x5jVar.setVideoContentMode(r5j.b);
        g0dVar.addView(x5jVar);
        return g0dVar;
    }

    @Override // one.me.chatmedia.viewer.video.BaseVideoViewerWidget, defpackage.br4
    public final void onDestroyView(View view) {
        g8c g8cVar = this.n;
        if (g8cVar != null) {
            g8cVar.a();
        }
        w1();
        super.onDestroyView(view);
    }

    @Override // one.me.chatmedia.viewer.video.BaseVideoViewerWidget
    public final pui p1() {
        hb9 hb9VarI = v1().I();
        if (hb9VarI != null && hb9VarI.c()) {
            return new pui(Uri.parse(hb9VarI.d), null, 0.0f, 0, 0);
        }
        String str = this.k;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onViewCreated: local media is not video, " + hb9VarI, null);
            }
        }
        return null;
    }

    @Override // one.me.chatmedia.viewer.video.BaseVideoViewerWidget
    public final r8e t1() {
        return v1().L1;
    }

    public final a6j u1() {
        Object targetController = getTargetController();
        if (targetController instanceof a6j) {
            return (a6j) targetController;
        }
        return null;
    }

    public final p26 v1() {
        return (p26) this.m.getValue();
    }

    public final void w1() {
        e3j e3jVarW0;
        String str = this.k;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "stopAndReleaseVideo", null);
            }
        }
        this.e = null;
        uj6 uj6Var = this.d;
        if (uj6Var != null) {
            uj6Var.h();
        }
        a6j a6jVarU1 = u1();
        if (a6jVarU1 != null && (e3jVarW0 = a6jVarU1.w0()) != null) {
            e3jVarW0.pause();
            e3jVarW0.H(null);
            e3jVarW0.stop();
        }
        s1().b();
    }

    public VideoViewerWidget(t3f t3fVar, boolean z) {
        this(n1g.i(new ylc("arg_story_editor_parent_scope_id", t3fVar), new ylc("arg_gesture_enabled", Boolean.valueOf(z)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar.b().a))));
    }
}
