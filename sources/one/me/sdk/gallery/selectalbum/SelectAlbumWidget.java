package one.me.sdk.gallery.selectalbum;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.af7;
import defpackage.bef;
import defpackage.ccd;
import defpackage.dtd;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ecd;
import defpackage.fz6;
import defpackage.h;
import defpackage.h7b;
import defpackage.jdf;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.ow0;
import defpackage.t3f;
import defpackage.vv;
import defpackage.xbd;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/sdk/gallery/selectalbum/SelectAlbumWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "parentScope", "(Lt3f;)V", "ib", "media-gallery-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SelectAlbumWidget extends Widget {
    public static final /* synthetic */ zv8[] f = {new dwd(SelectAlbumWidget.class, "parentScope", "getParentScope()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, SelectAlbumWidget.class, "albumAdapter", "getAlbumAdapter()Lone/me/sdk/gallery/selectalbum/SelectedAlbumAdapter;", 0), new dwd(SelectAlbumWidget.class, "contentContainer", "getContentContainer()Lone/me/sdk/gallery/selectalbum/SelectedAlbumRecyclerView;", 0), new dwd(SelectAlbumWidget.class, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0)};
    public final ny8 a;
    public final ny8 b;
    public final ow0 c;
    public final ow0 d;
    public final ow0 e;

    public SelectAlbumWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(Widget.ARG_SCOPE_ID, t3f.class);
        final int i = 0;
        zv8 zv8Var = f[0];
        this.a = getSharedViewModel((t3f) vvVar.a(this), jdf.class, null);
        this.b = new h(m35getAccountScopeuqN4xOY()).getAccessor().d(27);
        this.c = binding(new af7(this) { // from class: kdf
            public final /* synthetic */ SelectAlbumWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                SelectAlbumWidget selectAlbumWidget = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = SelectAlbumWidget.f;
                        aef aefVar = new aef(new qyb(21, selectAlbumWidget), ((a2c) selectAlbumWidget.b.getValue()).a());
                        e9i.j0(new fz6(n1g.v(selectAlbumWidget.q1().i, selectAlbumWidget.getViewLifecycleOwner().f(), n09.d), new dtd((lq4) null, aefVar, 15), 3), selectAlbumWidget.getViewLifecycleScope());
                        return aefVar;
                    case 1:
                        zv8[] zv8VarArr2 = SelectAlbumWidget.f;
                        bef befVar = new bef(selectAlbumWidget.getContext());
                        befVar.setId(R.id.select_album_content_container);
                        befVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        befVar.getContext();
                        befVar.setLayoutManager(new LinearLayoutManager());
                        ow0 ow0Var = selectAlbumWidget.c;
                        zv8 zv8Var2 = SelectAlbumWidget.f[1];
                        befVar.setAdapter((aef) ow0Var.getValue());
                        befVar.setOutlineProvider(new i11(0, yl5.d().getDisplayMetrics().density * 20.0f));
                        n1g.N(new vqa(3, (lq4) null, 25), befVar);
                        return befVar;
                    default:
                        zv8[] zv8VarArr3 = SelectAlbumWidget.f;
                        ecd ecdVar = new ecd(selectAlbumWidget.getContext());
                        ecdVar.setStackFromBottom(false);
                        ecdVar.setCallback(new ib(selectAlbumWidget, 5));
                        ecdVar.addView(selectAlbumWidget.o1());
                        n1g.N(new zu(3, (lq4) null, 12), ecdVar);
                        return ecdVar;
                }
            }
        });
        final int i2 = 1;
        this.d = binding(new af7(this) { // from class: kdf
            public final /* synthetic */ SelectAlbumWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                SelectAlbumWidget selectAlbumWidget = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = SelectAlbumWidget.f;
                        aef aefVar = new aef(new qyb(21, selectAlbumWidget), ((a2c) selectAlbumWidget.b.getValue()).a());
                        e9i.j0(new fz6(n1g.v(selectAlbumWidget.q1().i, selectAlbumWidget.getViewLifecycleOwner().f(), n09.d), new dtd((lq4) null, aefVar, 15), 3), selectAlbumWidget.getViewLifecycleScope());
                        return aefVar;
                    case 1:
                        zv8[] zv8VarArr2 = SelectAlbumWidget.f;
                        bef befVar = new bef(selectAlbumWidget.getContext());
                        befVar.setId(R.id.select_album_content_container);
                        befVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        befVar.getContext();
                        befVar.setLayoutManager(new LinearLayoutManager());
                        ow0 ow0Var = selectAlbumWidget.c;
                        zv8 zv8Var2 = SelectAlbumWidget.f[1];
                        befVar.setAdapter((aef) ow0Var.getValue());
                        befVar.setOutlineProvider(new i11(0, yl5.d().getDisplayMetrics().density * 20.0f));
                        n1g.N(new vqa(3, (lq4) null, 25), befVar);
                        return befVar;
                    default:
                        zv8[] zv8VarArr3 = SelectAlbumWidget.f;
                        ecd ecdVar = new ecd(selectAlbumWidget.getContext());
                        ecdVar.setStackFromBottom(false);
                        ecdVar.setCallback(new ib(selectAlbumWidget, 5));
                        ecdVar.addView(selectAlbumWidget.o1());
                        n1g.N(new zu(3, (lq4) null, 12), ecdVar);
                        return ecdVar;
                }
            }
        });
        final int i3 = 2;
        this.e = binding(new af7(this) { // from class: kdf
            public final /* synthetic */ SelectAlbumWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                SelectAlbumWidget selectAlbumWidget = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = SelectAlbumWidget.f;
                        aef aefVar = new aef(new qyb(21, selectAlbumWidget), ((a2c) selectAlbumWidget.b.getValue()).a());
                        e9i.j0(new fz6(n1g.v(selectAlbumWidget.q1().i, selectAlbumWidget.getViewLifecycleOwner().f(), n09.d), new dtd((lq4) null, aefVar, 15), 3), selectAlbumWidget.getViewLifecycleScope());
                        return aefVar;
                    case 1:
                        zv8[] zv8VarArr2 = SelectAlbumWidget.f;
                        bef befVar = new bef(selectAlbumWidget.getContext());
                        befVar.setId(R.id.select_album_content_container);
                        befVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        befVar.getContext();
                        befVar.setLayoutManager(new LinearLayoutManager());
                        ow0 ow0Var = selectAlbumWidget.c;
                        zv8 zv8Var2 = SelectAlbumWidget.f[1];
                        befVar.setAdapter((aef) ow0Var.getValue());
                        befVar.setOutlineProvider(new i11(0, yl5.d().getDisplayMetrics().density * 20.0f));
                        n1g.N(new vqa(3, (lq4) null, 25), befVar);
                        return befVar;
                    default:
                        zv8[] zv8VarArr3 = SelectAlbumWidget.f;
                        ecd ecdVar = new ecd(selectAlbumWidget.getContext());
                        ecdVar.setStackFromBottom(false);
                        ecdVar.setCallback(new ib(selectAlbumWidget, 5));
                        ecdVar.addView(selectAlbumWidget.o1());
                        n1g.N(new zu(3, (lq4) null, 12), ecdVar);
                        return ecdVar;
                }
            }
        });
    }

    public final bef o1() {
        zv8 zv8Var = f[2];
        return (bef) this.d.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return p1();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(q1().f, getViewLifecycleOwner().f(), n09.d), new dtd((lq4) null, this, 16), 3), getViewLifecycleScope());
    }

    public final ecd p1() {
        zv8 zv8Var = f[3];
        return (ecd) this.e.getValue();
    }

    public final jdf q1() {
        return (jdf) this.a.getValue();
    }

    public final void r1() {
        View viewE;
        if (p1().getScrollState() != ccd.a) {
            p1().j(true);
            return;
        }
        xbd callback = p1().getCallback();
        if (callback == null || (viewE = callback.e()) == null || viewE.getHeight() != 0) {
            p1().k();
        } else {
            p1().post(new h7b(21, this));
        }
    }

    public SelectAlbumWidget(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
