package one.me.chatmedia.viewer.photo;

import android.os.Bundle;
import defpackage.b68;
import defpackage.bwc;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.g58;
import defpackage.ky9;
import defpackage.l63;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.qy9;
import defpackage.qz9;
import defpackage.r8e;
import defpackage.t2m;
import defpackage.t3f;
import defpackage.vv;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/chatmedia/viewer/photo/PhotoViewerWidget;", "Lone/me/chatmedia/viewer/photo/BasePhotoViewerWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Lt3f;", "scopeId", "(JLjava/lang/String;Lt3f;)V", "chat-media-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoViewerWidget extends BasePhotoViewerWidget {
    public static final /* synthetic */ zv8[] f = {new dwd(PhotoViewerWidget.class, "msgId", "getMsgId()J", 0), zo5.f(zfe.a, PhotoViewerWidget.class, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), new dwd(PhotoViewerWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0)};
    public final vv c;
    public final vv d;
    public final ny8 e;

    public PhotoViewerWidget(Bundle bundle) {
        super(bundle);
        this.c = new vv(Long.class, 0L, "chat.media.viewer.message_id");
        this.d = new vv(String.class, "", "chat.media.viewer.attach_id");
        vv vvVar = new vv(t3f.class, getB(), Widget.ARG_SCOPE_ID);
        zv8 zv8Var = f[2];
        this.e = getSharedViewModel((t3f) vvVar.a(this), l63.class, null);
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void o1() {
        b68 b68VarP1 = p1();
        if (b68VarP1 == null) {
            return;
        }
        w1().S(v1(), u1());
        bwc bwcVarQ1 = q1();
        zv8[] zv8VarArr = bwc.A;
        bwcVarQ1.k(b68VarP1, false);
        e9i.j0(new fz6(n1g.v(w1().Y, getViewLifecycleOwner().f(), n09.d), new qz9((lq4) null, this, 18), 3), getViewLifecycleScope());
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final b68 p1() {
        g58 g58Var;
        qy9 qy9VarM = w1().M(v1(), u1());
        ky9 ky9Var = qy9VarM instanceof ky9 ? (ky9) qy9VarM : null;
        if (ky9Var == null || (g58Var = ky9Var.d) == null) {
            return null;
        }
        return t2m.b(g58Var);
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void r1() {
        w1().R(v1(), u1());
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void s1() {
        w1().T(v1(), u1());
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final r8e t1() {
        return w1().w1;
    }

    public final String u1() {
        zv8 zv8Var = f[1];
        return (String) this.d.a(this);
    }

    public final long v1() {
        zv8 zv8Var = f[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final l63 w1() {
        return (l63) this.e.getValue();
    }

    public PhotoViewerWidget(long j, String str, t3f t3fVar) {
        this(n1g.i(new ylc("chat.media.viewer.message_id", Long.valueOf(j)), new ylc("chat.media.viewer.attach_id", str), new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
