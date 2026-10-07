package one.me.stories.edit;

import android.os.Bundle;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.b68;
import defpackage.bwc;
import defpackage.dwc;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.hb9;
import defpackage.i19;
import defpackage.i1f;
import defpackage.ic6;
import defpackage.je9;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.p26;
import defpackage.pxg;
import defpackage.r06;
import defpackage.r8e;
import defpackage.t2m;
import defpackage.t3f;
import defpackage.vv;
import defpackage.wj7;
import defpackage.xc3;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.chatmedia.viewer.photo.BasePhotoViewerWidget;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/stories/edit/PhotoViewerWidget;", "Lone/me/chatmedia/viewer/photo/BasePhotoViewerWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "isZoomEnabled", "(Lt3f;Z)V", "stories"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoViewerWidget extends BasePhotoViewerWidget {
    public static final /* synthetic */ zv8[] e;
    public final String c;
    public final ny8 d;

    static {
        dwd dwdVar = new dwd(PhotoViewerWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0);
        zfe.a.getClass();
        e = new zv8[]{dwdVar};
    }

    public PhotoViewerWidget(Bundle bundle) {
        super(bundle);
        this.c = PhotoViewerWidget.class.getName();
        vv vvVar = new vv(t3f.class, pxg.a, "arg_story_editor_parent_scope_id");
        zv8 zv8Var = e[0];
        this.d = getSharedViewModel((t3f) vvVar.a(this), p26.class, null);
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void o1() {
        u1().R();
        ic6 ic6Var = u1().F1;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new dwc(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new xc3(u1().X, 21), getViewLifecycleOwner().f(), n09Var), new dwc(null, this, 1), i), getViewLifecycleScope());
        b68 b68VarP1 = p1();
        if (b68VarP1 == null) {
            return;
        }
        ((wj7) q1().getHierarchy()).h(i1f.n);
        q1().setZoomEnabled(false);
        bwc bwcVarQ1 = q1();
        zv8[] zv8VarArr = bwc.A;
        bwcVarQ1.k(b68VarP1, false);
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final b68 p1() {
        p26 p26VarU1 = u1();
        hb9 hb9VarI = p26VarU1.I();
        b68 b68VarC = (hb9VarI == null || !hb9VarI.b()) ? null : t2m.c(hb9VarI, p26VarU1.M(hb9VarI));
        if (b68VarC != null) {
            return b68VarC;
        }
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "getItem: image config is null", null);
            }
        }
        return null;
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void r1() {
        p26 p26VarU1 = u1();
        hb9 hb9VarI = p26VarU1.I();
        if (hb9VarI != null) {
            long j = hb9VarI.b;
            Long l = p26VarU1.c;
            if (l != null && j == l.longValue()) {
                a8j.x(p26VarU1.F1, new r06(5, false));
                return;
            }
        }
        String str = p26VarU1.j;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "onPhotoLoadFail: " + p26VarU1.c + ", currentItemId: " + (hb9VarI != null ? Long.valueOf(hb9VarI.b) : null), null);
        }
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final void s1() {
        u1().S();
    }

    @Override // one.me.chatmedia.viewer.photo.BasePhotoViewerWidget
    public final r8e t1() {
        return u1().L1;
    }

    public final p26 u1() {
        return (p26) this.d.getValue();
    }

    public PhotoViewerWidget(t3f t3fVar, boolean z) {
        this(n1g.i(new ylc("arg_story_editor_parent_scope_id", t3fVar), new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("arg_key_zoom_enabled", Boolean.valueOf(z))));
    }
}
