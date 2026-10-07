package one.me.stories.edit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a6j;
import defpackage.as0;
import defpackage.br4;
import defpackage.dwd;
import defpackage.e3j;
import defpackage.hve;
import defpackage.ize;
import defpackage.k16;
import defpackage.mjg;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oc9;
import defpackage.ore;
import defpackage.p26;
import defpackage.pxg;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.tp2;
import defpackage.vv;
import defpackage.w8g;
import defpackage.wr4;
import defpackage.wtc;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/stories/edit/SingleMediaViewerWidget;", "Lone/me/sdk/arch/Widget;", "La6j;", "Las0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", ApiProtocol.PARAM_IS_VIDEO, "(Lt3f;Z)V", "stories"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SingleMediaViewerWidget extends Widget implements a6j, as0 {
    public static final /* synthetic */ zv8[] f = {new dwd(SingleMediaViewerWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, SingleMediaViewerWidget.class, ApiProtocol.PARAM_IS_VIDEO, "isVideo()Z", 0)};
    public final vv a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final vv e;

    public SingleMediaViewerWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(t3f.class, pxg.a, "arg_story_editor_parent_scope_id");
        this.a = vvVar;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        zv8 zv8Var = f[0];
        this.b = getSharedViewModel((t3f) vvVar.a(this), p26.class, null);
        this.c = wtcVar.getAccessor().d(192);
        this.d = rx8.P(3, new ize(23, this));
        this.e = new vv(Boolean.class, Boolean.FALSE, "arg_is_video");
    }

    @Override // defpackage.a6j
    public final void I0(long j) {
    }

    @Override // defpackage.a6j
    public final void N0() {
    }

    @Override // defpackage.a6j
    public final void W(float f2) {
    }

    @Override // defpackage.as0
    public final void k() {
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        tp2 tp2VarA = oc9.a(getContext());
        tp2VarA.setId(R.id.single_media_viewer_container);
        tp2VarA.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return tp2VarA;
    }

    @Override // defpackage.br4
    public final void onDestroy() {
        super.onDestroy();
        ny8 ny8Var = this.d;
        if (ny8Var.d()) {
            ((w8g) this.c.getValue()).a((e3j) ny8Var.getValue());
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        br4 photoViewerWidget;
        super.onViewCreated(view);
        hve childRouter = getChildRouter((ViewGroup) view);
        zv8[] zv8VarArr = f;
        zv8 zv8Var = zv8VarArr[1];
        boolean zBooleanValue = ((Boolean) this.e.a(this)).booleanValue();
        vv vvVar = this.a;
        if (zBooleanValue) {
            zv8 zv8Var2 = zv8VarArr[0];
            photoViewerWidget = new VideoViewerWidget((t3f) vvVar.a(this), false);
            photoViewerWidget.setTargetController(this);
        } else {
            zv8 zv8Var3 = zv8VarArr[0];
            photoViewerWidget = new PhotoViewerWidget((t3f) vvVar.a(this), false);
            photoViewerWidget.setTargetController(this);
        }
        childRouter.T(oc9.e(photoViewerWidget, null, null));
    }

    @Override // defpackage.a6j
    public final e3j w0() {
        return (e3j) this.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    @Override // defpackage.a6j
    public final void y0() {
        Object value;
        wr4 wr4Var;
        p26 p26Var = (p26) this.b.getValue();
        boolean zD = w0().d();
        if (p26Var.r1.getValue() instanceof k16) {
            mjg mjgVar = p26Var.M1;
            do {
                value = mjgVar.getValue();
                int iOrdinal = ((wr4) value).ordinal();
                wr4Var = wr4.b;
                if (iOrdinal != 0) {
                    wr4 wr4Var2 = wr4.a;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            wr4Var = wr4Var2;
                        } else if (iOrdinal != 3) {
                            ore.o();
                            return;
                        }
                    } else if (zD) {
                        wr4Var = wr4Var2;
                    } else {
                        wr4Var = wr4.d;
                    }
                }
            } while (!mjgVar.h(value, wr4Var));
        }
    }

    public SingleMediaViewerWidget(t3f t3fVar, boolean z) {
        this(n1g.i(new ylc("arg_story_editor_parent_scope_id", t3fVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar.b().a)), new ylc("arg_is_video", Boolean.valueOf(z))));
    }
}
