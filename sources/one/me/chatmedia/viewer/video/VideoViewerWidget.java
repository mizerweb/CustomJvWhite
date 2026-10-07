package one.me.chatmedia.viewer.video;

import android.os.Bundle;
import defpackage.a4c;
import defpackage.a6j;
import defpackage.cqk;
import defpackage.d3j;
import defpackage.d6j;
import defpackage.dwd;
import defpackage.e3j;
import defpackage.e9i;
import defpackage.et3;
import defpackage.fti;
import defpackage.fz6;
import defpackage.g0d;
import defpackage.gm0;
import defpackage.h;
import defpackage.i19;
import defpackage.j8e;
import defpackage.je9;
import defpackage.l63;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nic;
import defpackage.ny8;
import defpackage.o53;
import defpackage.pui;
import defpackage.py9;
import defpackage.qi9;
import defpackage.qv1;
import defpackage.qy9;
import defpackage.r8e;
import defpackage.rui;
import defpackage.s5h;
import defpackage.t3f;
import defpackage.uj6;
import defpackage.vbi;
import defpackage.vuf;
import defpackage.vv;
import defpackage.xb9;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/chatmedia/viewer/video/VideoViewerWidget;", "Lone/me/chatmedia/viewer/video/BaseVideoViewerWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Lt3f;", "scopeId", "(JLjava/lang/String;Lt3f;)V", "chat-media-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoViewerWidget extends BaseVideoViewerWidget {
    public static final /* synthetic */ zv8[] q = {new dwd(VideoViewerWidget.class, "msgId", "getMsgId()J", 0), zo5.f(zfe.a, VideoViewerWidget.class, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), new dwd(VideoViewerWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0)};
    public final String k;
    public final h l;
    public final ny8 m;
    public final vv n;
    public final vv o;
    public final ny8 p;

    public VideoViewerWidget(Bundle bundle) {
        super(bundle);
        this.k = VideoViewerWidget.class.getName();
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.l = hVar;
        this.m = hVar.getAccessor().d(85);
        this.n = new vv(Long.class, 0L, "chat.media.viewer.message_id");
        this.o = new vv(String.class, "", "chat.media.viewer.attach_id");
        vv vvVar = new vv(t3f.class, getA(), Widget.ARG_SCOPE_ID);
        zv8 zv8Var = q[2];
        this.p = getSharedViewModel((t3f) vvVar.a(this), l63.class, null);
    }

    public static final void u1(VideoViewerWidget videoViewerWidget, o53 o53Var) {
        rui ruiVar;
        e3j e3jVarW0;
        a6j a6jVarX1;
        e3j e3jVarW1;
        je9 je9Var = je9.d;
        String str = videoViewerWidget.k;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            boolean z = o53Var.b != null;
            qy9 qy9Var = o53Var.a;
            long jW1 = videoViewerWidget.w1();
            String strV1 = videoViewerWidget.v1();
            int iHashCode = videoViewerWidget.hashCode();
            StringBuilder sb = new StringBuilder("Media viewer. Video page state changed, \n                        |hasContent:");
            sb.append(z);
            sb.append(", \n                        |item:");
            sb.append(qy9Var);
            sb.append(", curMsgId:");
            qv1.s(jW1, ", \n                        |curAttachId:", strV1, sb);
            sb.append("\n                        |class:");
            sb.append(iHashCode);
            sb.append("\n                        |");
            a4cVar.c(je9Var, str, s5h.y0(sb.toString()), null);
        }
        qy9 qy9Var2 = o53Var.a;
        if (qy9Var2 == null || qy9Var2.l() != videoViewerWidget.w1() || !cqk.d(o53Var.a.B(), videoViewerWidget.v1()) || (ruiVar = o53Var.b) == null) {
            return;
        }
        videoViewerWidget.e = ruiVar;
        if (ruiVar.e() && (a6jVarX1 = videoViewerWidget.x1()) != null && (e3jVarW1 = a6jVarX1.w0()) != null) {
            e3jVarW1.b(0.0f);
        }
        a6j a6jVarX2 = videoViewerWidget.x1();
        if (a6jVarX2 != null && (e3jVarW0 = a6jVarX2.w0()) != null) {
            e3j.w(e3jVarW0, o53Var.b, true, d3j.ATTACH_VIEWER, ((xb9) ((et3) videoViewerWidget.m.getValue())).a0() == 0.0f ? 1.0f : ((xb9) ((et3) videoViewerWidget.m.getValue())).a0(), 72);
            e3jVarW0.o0(true);
            a6j a6jVarX3 = videoViewerWidget.x1();
            if (a6jVarX3 != null) {
                a6jVarX3.W(e3jVarW0.l0());
            }
        }
        String str2 = videoViewerWidget.k;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "Media viewer. Start fade animation, viewView.alpha=" + videoViewerWidget.s1().getAlpha() + ", fadeAnimator exist=" + (videoViewerWidget.d != null), null);
        }
        uj6 uj6Var = videoViewerWidget.d;
        if (uj6Var != null) {
            uj6Var.g();
        }
        videoViewerWidget.s1().a(videoViewerWidget.i);
    }

    @Override // one.me.chatmedia.viewer.video.BaseVideoViewerWidget
    public final void o1() {
        zv8[] zv8VarArr = BaseVideoViewerWidget.j;
        zv8 zv8Var = zv8VarArr[2];
        j8e j8eVar = this.c;
        ((g0d) j8eVar.m(this, zv8Var)).setLongPressRewindDelegate(new qi9(getContext(), (g0d) j8eVar.m(this, zv8VarArr[2]), new vbi(15, this), new vuf(27, this), this.l.getAccessor().d(947)));
        r8e r8eVar = y1().u1;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new d6j(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().Y, getViewLifecycleOwner().f(), n09Var), new d6j(null, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().D1, getViewLifecycleOwner().f(), n09Var), new d6j(null, this, 2), i), getViewLifecycleScope());
    }

    @Override // one.me.chatmedia.viewer.video.BaseVideoViewerWidget
    public final pui p1() {
        fti ftiVar;
        qy9 qy9VarM = y1().M(w1(), v1());
        py9 py9Var = qy9VarM instanceof py9 ? (py9) qy9VarM : null;
        if (py9Var == null || (ftiVar = py9Var.d) == null) {
            return null;
        }
        return new pui(ftiVar.b, ftiVar.i, ((nic) y1().w1.a.getValue()).b, ftiVar.c, ftiVar.d);
    }

    @Override // one.me.chatmedia.viewer.video.BaseVideoViewerWidget
    public final r8e t1() {
        return y1().w1;
    }

    public final String v1() {
        zv8 zv8Var = q[1];
        return (String) this.o.a(this);
    }

    public final long w1() {
        zv8 zv8Var = q[0];
        return ((Number) this.n.a(this)).longValue();
    }

    public final a6j x1() {
        Object targetController = getTargetController();
        if (targetController instanceof a6j) {
            return (a6j) targetController;
        }
        return null;
    }

    public final l63 y1() {
        return (l63) this.p.getValue();
    }

    public VideoViewerWidget(long j, String str, t3f t3fVar) {
        this(n1g.i(new ylc("chat.media.viewer.message_id", Long.valueOf(j)), new ylc("chat.media.viewer.attach_id", str), new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
