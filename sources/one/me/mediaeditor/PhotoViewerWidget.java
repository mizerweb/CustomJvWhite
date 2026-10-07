package one.me.mediaeditor;

import android.os.Bundle;
import defpackage.a4c;
import defpackage.b68;
import defpackage.cwc;
import defpackage.dwd;
import defpackage.dx9;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.i19;
import defpackage.j0g;
import defpackage.je9;
import defpackage.jz;
import defpackage.lx9;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nbh;
import defpackage.ny8;
import defpackage.r8e;
import defpackage.t3f;
import defpackage.vv;
import defpackage.xc3;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.chatmedia.viewer.photo.BasePhotoViewerWidget;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/mediaeditor/PhotoViewerWidget;", "Lone/me/chatmedia/viewer/photo/BasePhotoViewerWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "localMediaId", "Lt3f;", "scopeId", "(JLt3f;)V", "media-editor"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoViewerWidget extends BasePhotoViewerWidget {
    public static final /* synthetic */ zv8[] f = {new dwd(PhotoViewerWidget.class, "localMediaId", "getLocalMediaId()J", 0), zo5.f(zfe.a, PhotoViewerWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0)};
    public final String c;
    public final vv d;
    public final ny8 e;

    public PhotoViewerWidget(Bundle bundle) {
        super(bundle);
        this.c = PhotoViewerWidget.class.getName();
        this.d = new vv(Long.class, 0L, "arg_local_id");
        vv vvVar = new vv(t3f.class, getA(), Widget.ARG_SCOPE_ID);
        zv8 zv8Var = f[1];
        this.e = getSharedViewModel((t3f) vvVar.a(this), lx9.class, null);
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void o1() {
        v1().S(u1());
        lx9 lx9VarV1 = v1();
        jz jzVar = new jz(e9i.G0(e9i.T(new dx9(new xc3(lx9VarV1.u, 13), lx9VarV1, u1(), 0), ((n0c) lx9VarV1.H()).a()), lx9VarV1.b, j0g.a, null), 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new cwc(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(v1().n1, getViewLifecycleOwner().f(), n09Var), new cwc(null, this, 1), i), getViewLifecycleScope());
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final b68 p1() {
        b68 b68VarI = v1().I(u1());
        if (b68VarI != null) {
            return b68VarI;
        }
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, nbh.s(u1(), "getItem: localMediaId: ", ", image config is null"), null);
            }
        }
        return null;
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void r1() {
        v1().R(u1());
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void s1() {
        v1().T(u1());
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final r8e t1() {
        return v1().I;
    }

    public final long u1() {
        zv8 zv8Var = f[0];
        return ((Number) this.d.a(this)).longValue();
    }

    public final lx9 v1() {
        return (lx9) this.e.getValue();
    }

    public PhotoViewerWidget(long j, t3f t3fVar) {
        this(n1g.i(new ylc("arg_local_id", Long.valueOf(j)), new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
