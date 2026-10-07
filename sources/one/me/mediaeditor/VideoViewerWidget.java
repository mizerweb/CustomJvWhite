package one.me.mediaeditor;

import android.net.Uri;
import android.os.Bundle;
import defpackage.a4c;
import defpackage.b6j;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h;
import defpackage.hb9;
import defpackage.i19;
import defpackage.je9;
import defpackage.lq4;
import defpackage.lx9;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nic;
import defpackage.ny8;
import defpackage.pui;
import defpackage.r8e;
import defpackage.t3f;
import defpackage.vv;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.chatmedia.viewer.video.BaseVideoViewerWidget;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/mediaeditor/VideoViewerWidget;", "Lone/me/chatmedia/viewer/video/BaseVideoViewerWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "localId", "Lt3f;", "scopeId", "(JLt3f;)V", "media-editor"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoViewerWidget extends BaseVideoViewerWidget {
    public static final /* synthetic */ zv8[] o = {new dwd(VideoViewerWidget.class, "localMediaId", "getLocalMediaId()J", 0), zo5.f(zfe.a, VideoViewerWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0)};
    public final String k;
    public final ny8 l;
    public final vv m;
    public final ny8 n;

    public VideoViewerWidget(Bundle bundle) {
        super(bundle);
        this.k = VideoViewerWidget.class.getName();
        this.l = new h(m35getAccountScopeuqN4xOY()).getAccessor().d(26);
        this.m = new vv(Long.class, 0L, "arg_local_id");
        vv vvVar = new vv(t3f.class, getD(), Widget.ARG_SCOPE_ID);
        zv8 zv8Var = o[1];
        this.n = getSharedViewModel((t3f) vvVar.a(this), lx9.class, null);
    }

    @Override // one.me.chatmedia.viewer.video.BaseVideoViewerWidget
    public final void o1() {
        r8e r8eVar = v1().F;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new b6j(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(v1().n1, getViewLifecycleOwner().f(), n09Var), new b6j(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(v1().A1, getViewLifecycleOwner().f(), n09Var), new b6j(lq4Var, this, 2), i), getViewLifecycleScope());
    }

    @Override // one.me.chatmedia.viewer.video.BaseVideoViewerWidget
    public final pui p1() {
        hb9 hb9VarJ = v1().J(u1());
        if (hb9VarJ != null && hb9VarJ.c()) {
            return new pui(Uri.parse(hb9VarJ.d), null, ((nic) v1().I.a.getValue()).b, 0, 0);
        }
        String str = this.k;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onViewCreated: localId: " + u1() + " is not video, " + hb9VarJ, null);
            }
        }
        return null;
    }

    @Override // one.me.chatmedia.viewer.video.BaseVideoViewerWidget
    public final r8e t1() {
        return v1().I;
    }

    public final long u1() {
        zv8 zv8Var = o[0];
        return ((Number) this.m.a(this)).longValue();
    }

    public final lx9 v1() {
        return (lx9) this.n.getValue();
    }

    public VideoViewerWidget(long j, t3f t3fVar) {
        this(n1g.i(new ylc("arg_local_id", Long.valueOf(j)), new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
