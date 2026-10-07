package one.me.sdk.gallery;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import defpackage.a8j;
import defpackage.c;
import defpackage.c0a;
import defpackage.ch8;
import defpackage.ci7;
import defpackage.di7;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ei7;
import defpackage.ej7;
import defpackage.fz6;
import defpackage.gi7;
import defpackage.gl1;
import defpackage.gm0;
import defpackage.h;
import defpackage.i19;
import defpackage.i7j;
import defpackage.j8e;
import defpackage.j95;
import defpackage.l96;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o24;
import defpackage.oi7;
import defpackage.ph7;
import defpackage.q91;
import defpackage.rq1;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.tre;
import defpackage.tzl;
import defpackage.v22;
import defpackage.vx9;
import defpackage.ww8;
import defpackage.wx9;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zg7;
import defpackage.zv8;
import java.util.WeakHashMap;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/gallery/MediaGalleryWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Lph7;", "galleryMode", "(Lt3f;Lph7;)V", "media-gallery-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaGalleryWidget extends Widget {
    public static final /* synthetic */ zv8[] i;
    public final String a;
    public final ny8 b;
    public final h c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final j8e g;
    public final gl1 h;

    static {
        dwd dwdVar = new dwd(MediaGalleryWidget.class, "galleryRecyclerView", "getGalleryRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0);
        zfe.a.getClass();
        i = new zv8[]{dwdVar};
    }

    public MediaGalleryWidget(Bundle bundle) {
        super(bundle);
        this.a = MediaGalleryWidget.class.getName();
        Object objF0 = tre.f0(bundle, "arg_scope_id", t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.b = getSharedViewModel((t3f) ((Parcelable) objF0), gi7.class, null);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.c = hVar;
        this.d = hVar.getAccessor().d(34);
        this.e = createViewModelLazy(ej7.class, new ch8(19, new vx9(this, 0, bundle)));
        this.f = rx8.P(3, new ww8(15, this));
        this.g = viewBinding(R.id.gallery_recycler_view_id);
        this.h = new gl1(this, 5);
    }

    public static final float o1(MediaGalleryWidget mediaGalleryWidget) {
        if (!mediaGalleryWidget.isAttached()) {
            return 0.0f;
        }
        return mediaGalleryWidget.p1().getTranslationY() + (-mediaGalleryWidget.p1().computeVerticalScrollOffset());
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        l96 l96Var = new l96(frameLayout.getContext());
        l96Var.setId(R.id.gallery_recycler_view_id);
        l96Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(l96Var);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ej7 ej7VarR1 = r1();
        oi7 oi7VarA = tzl.a(ej7VarR1.d);
        ej7VarR1.p = oi7VarA;
        gm0.n("ej7", "did recalculate uiOptions: " + oi7VarA);
        oi7 oi7Var = r1().p;
        WeakHashMap weakHashMap = i7j.a;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new rq1(oi7Var, view, this, 1));
        } else {
            int i2 = oi7Var.c;
            int i3 = oi7Var.d;
            float f = i3;
            int iK = gm0.K((view.getWidth() / i2) - (f - (f / i2)));
            ph7 ph7Var = r1().c;
            int width = (view.getWidth() / i2) - (i3 - (i3 / i2));
            boolean z = ph7Var.i;
            boolean z2 = ph7Var.j;
            if (z && z2) {
                iK = (iK * 2) + i3;
            }
            a8j.x(q1().d, new ci7(width, iK));
            if (z2) {
                a8j.x(q1().d, new ei7(width + i3));
            }
            a8j.x(q1().d, new di7(o1(this)));
        }
        l96 l96VarP1 = p1();
        l96VarP1.setPager(this.h);
        l96VarP1.setProgressView(R.layout.oneme_ll_chat_media_progress);
        l96VarP1.setHasFixedSize(true);
        l96VarP1.setThreshold(oi7Var.b);
        if (!r1().c.m) {
            l96VarP1.setOverScrollMode(2);
        }
        l96VarP1.setAdapter((zg7) this.f.getValue());
        int i4 = oi7Var.c;
        l96VarP1.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i4);
        gridLayoutManager.C = i4 * 4;
        l96VarP1.setLayoutManager(gridLayoutManager);
        int i5 = 5;
        l96VarP1.h(new q91(i4, oi7Var.d, i5), -1);
        l96VarP1.setItemAnimator(null);
        l96VarP1.k(new v22(i5, this));
        o24 o24Var = r1().o;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i6 = 3;
        e9i.j0(new fz6(n1g.v(o24Var, i19VarF, n09Var), new wx9(null, this, 0), i6), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().v, getViewLifecycleOwner().f(), n09Var), new wx9(null, this, 1), i6), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().r, getViewLifecycleOwner().f(), n09Var), new wx9(null, this, 2), i6), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().e, getViewLifecycleOwner().f(), n09Var), new wx9(null, this, 3), i6), getViewLifecycleScope());
    }

    public final l96 p1() {
        return (l96) this.g.m(this, i[0]);
    }

    public final gi7 q1() {
        return (gi7) this.b.getValue();
    }

    public final ej7 r1() {
        return (ej7) this.e.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaGalleryWidget(t3f t3fVar, ph7 ph7Var, int i2, j95 j95Var) {
        if ((i2 & 2) != 0) {
            Parcelable.Creator<ph7> creator = ph7.CREATOR;
            ph7Var = ph7.r;
        }
        this(t3fVar, ph7Var);
    }

    public MediaGalleryWidget(t3f t3fVar, ph7 ph7Var) {
        this(n1g.i(new ylc("arg_scope_id", t3fVar), new ylc("arg_gallery_mode", ph7Var), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar.b().a))));
    }
}
