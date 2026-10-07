package one.me.mediapicker;

import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a2c;
import defpackage.b1a;
import defpackage.bdc;
import defpackage.br4;
import defpackage.c1a;
import defpackage.ch8;
import defpackage.d4f;
import defpackage.d97;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.ev;
import defpackage.f5d;
import defpackage.fg2;
import defpackage.fxb;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gi7;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.hj2;
import defpackage.i19;
import defpackage.ifh;
import defpackage.j8e;
import defpackage.jdf;
import defpackage.joh;
import defpackage.jz;
import defpackage.k1a;
import defpackage.k2e;
import defpackage.ks6;
import defpackage.kw3;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.m1a;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n2e;
import defpackage.n9j;
import defpackage.ny8;
import defpackage.o37;
import defpackage.oi8;
import defpackage.ow0;
import defpackage.ph7;
import defpackage.pi;
import defpackage.q1a;
import defpackage.qe7;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.suc;
import defpackage.svj;
import defpackage.t3f;
import defpackage.tp2;
import defpackage.tre;
import defpackage.uvc;
import defpackage.vd2;
import defpackage.vv;
import defpackage.wd2;
import defpackage.wo6;
import defpackage.wsc;
import defpackage.ylc;
import defpackage.yw4;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zp3;
import defpackage.zv8;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/mediapicker/MediaPickerScreen;", "Lone/me/sdk/arch/Widget;", "Lyw4;", "Lvd2;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lph7;", "galleryMode", "", "sourceId", "Lha9;", "localAccountId", "(Lph7;Ljava/lang/Long;Lha9;)V", "media-picker"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaPickerScreen extends Widget implements yw4, vd2 {
    public static final /* synthetic */ zv8[] J = {new dwd(MediaPickerScreen.class, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), zo5.f(zfe.a, MediaPickerScreen.class, "galleryMode", "getGalleryMode()Lone/me/sdk/gallery/GalleryMode;", 0), new dwd(MediaPickerScreen.class, "sourceId", "getSourceId()Ljava/lang/Long;", 0), new dwd(MediaPickerScreen.class, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(MediaPickerScreen.class, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new z8b(MediaPickerScreen.class, "maxHeightAlbumsContent", "getMaxHeightAlbumsContent()I"), new dwd(MediaPickerScreen.class, "mediaPickerContainer", "getMediaPickerContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(MediaPickerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(MediaPickerScreen.class, "divider", "getDivider()Landroid/view/View;", 0), new dwd(MediaPickerScreen.class, "contentContainer", "getContentContainer()Landroid/widget/FrameLayout;", 0), new dwd(MediaPickerScreen.class, "textStoryView", "getTextStoryView()Lone/me/sdk/gallery/view/TextStoryView;", 0), new dwd(MediaPickerScreen.class, "partialMediaAccessRouter", "getPartialMediaAccessRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(MediaPickerScreen.class, "partialMediaAccessContainer", "getPartialMediaAccessContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(MediaPickerScreen.class, "cameraContainerView", "getCameraContainerView()Lone/me/sdk/gallery/view/CameraContainerView;", 0)};
    public final j8e A;
    public final ny8 B;
    public final ev C;
    public final j8e D;
    public float E;
    public int F;
    public int G;
    public g8c H;
    public boolean I;
    public final String a;
    public final oi8 b;
    public final j8e c;
    public final t3f d;
    public final vv e;
    public final vv f;
    public final ifh g;
    public final ks6 h;
    public final h i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final j8e q;
    public final ow0 r;
    public final vv s;
    public final ow0 t;
    public final ow0 u;
    public final ow0 v;
    public final j8e w;
    public final ow0 x;
    public final j8e y;
    public final j8e z;

    public MediaPickerScreen(Bundle bundle) {
        super(bundle);
        this.a = MediaPickerScreen.class.getName();
        this.b = oi8.f;
        this.c = childSlotRouter(R.id.media_picker_container_id);
        this.d = new t3f("MediaPickerScreenScopeId", super.getD().b());
        this.e = new vv("gallery_mode_args", ph7.class);
        this.f = new vv("source_id_args", Long.class);
        this.g = new ifh(new k1a(this, 4));
        this.h = tre.E(this, new k1a(this, 7), new k1a(this, 8));
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.i = hVar;
        this.j = hVar.getAccessor().d(34);
        this.k = hVar.getAccessor().d(784);
        this.l = hVar.getAccessor().d(54);
        this.m = hVar.getAccessor().d(26);
        int i = 9;
        this.n = createViewModelLazy(gi7.class, new ch8(20, new k1a(this, i)));
        this.o = createViewModelLazy(jdf.class, new ch8(21, new k1a(this, 10)));
        this.p = createViewModelLazy(q1a.class, new ch8(22, new k1a(this, 11)));
        this.q = childSlotRouter(R.id.media_picker_album_container_id);
        this.r = binding(new k1a(this, 12));
        this.s = new vv(Integer.class, 0, "max_height_albums_content");
        this.t = binding(new k1a(this, 0));
        this.u = binding(new k1a(this, 1));
        this.v = binding(new k1a(this, 2));
        this.w = viewBinding(R.id.media_picker_content_id);
        this.x = binding(new k1a(this, 5));
        this.y = viewBinding(R.id.media_picker_text_story_view_id);
        this.z = childSlotRouter(R.id.media_picker_partial_media_access_container_id);
        this.A = viewBinding(R.id.media_picker_partial_media_access_container_id);
        this.B = createViewModelLazy(n2e.class, new ch8(23, new k1a(this, 6)));
        this.C = new ev(i, this);
        this.D = viewBinding(R.id.media_picker_camera_container_id);
    }

    public static final void o1(MediaPickerScreen mediaPickerScreen, boolean z) {
        ow0 ow0Var = mediaPickerScreen.x;
        if (z) {
            ((View) ow0Var.getValue()).setVisibility(0);
        } else if (ow0Var.d()) {
            ((TextView) ow0Var.getValue()).setVisibility(8);
        }
        mediaPickerScreen.t1().setVisibility(z ? 8 : 0);
    }

    public static final zp3 p1(MediaPickerScreen mediaPickerScreen) {
        return (zp3) mediaPickerScreen.z.m(mediaPickerScreen, J[11]);
    }

    @Override // defpackage.yw4
    public final void A0(suc sucVar) {
        q1a q1aVarW1 = w1();
        Uri uri = sucVar.c;
        String path = uri.getPath();
        if (path == null) {
            path = uri.toString();
        }
        q1aVarW1.u.a(new b1a(path, sucVar.a, sucVar.b));
        c1a.b.b().f();
    }

    public final void A1() {
        int i;
        if (x1()) {
            float measuredHeight = 0.0f + this.E + v1().getMeasuredHeight() + ((tp2) this.A.m(this, J[12])).getMeasuredHeight();
            View view = getView();
            if (view != null) {
                Rect rect = n9j.a;
                n9j.e(rect, view);
                i = rect.bottom;
            } else {
                i = 0;
            }
            int height = (u1().getHeight() + ((int) measuredHeight)) - i;
            int i2 = height >= 0 ? height : 0;
            int i3 = (-((int) this.E)) + this.G;
            joh johVarU1 = u1();
            kw3 kw3Var = johVarU1.e;
            kw3Var.b = i3;
            kw3Var.c = i2;
            johVarU1.invalidateOutline();
            u1().setTranslationY(measuredHeight);
        }
    }

    @Override // defpackage.vd2
    public final void P() {
        ((fxb) this.k.getValue()).a.y(false);
    }

    @Override // defpackage.vd2
    public final void V() {
        ((fxb) this.k.getValue()).a.o(false);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getD() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.h;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityPaused(Activity activity) {
        k2e k2eVar;
        if (r1() && getView() != null) {
            if (r1() && (k2eVar = q1().a) != null) {
                ((hj2) k2eVar.getCameraApi()).e();
            }
            br4 br4VarC = rx8.C(((zp3) this.q.m(this, J[3])).a);
            SelectAlbumWidget selectAlbumWidget = br4VarC instanceof SelectAlbumWidget ? (SelectAlbumWidget) br4VarC : null;
            if (selectAlbumWidget != null) {
                selectAlbumWidget.p1().j(false);
            }
            v1().setDropdownRotationProgress(0.0f);
        }
        super.onActivityPaused(activity);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        k2e k2eVar;
        if (r1()) {
            if (getView() != null && r1() && (k2eVar = q1().a) != null) {
                ((hj2) k2eVar.getCameraApi()).d();
            }
            q1a q1aVarW1 = w1();
            q1aVarW1.q.e();
            q1aVarW1.r.e();
            n2e n2eVar = (n2e) this.B.getValue();
            n2eVar.q.e();
            n2eVar.r.e();
        }
        super.onActivityResumed(activity);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i = 8;
        Object obj = null;
        byte b = 0;
        if (s1().h) {
            n1g.N(new n(3, b == true ? 1 : 0, i), linearLayout);
        }
        linearLayout.addView(v1());
        if (r1()) {
            View tp2Var = new tp2(linearLayout.getContext());
            tp2Var.setId(R.id.media_picker_partial_media_access_container_id);
            tp2Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(tp2Var);
        }
        FrameLayout frameLayout2 = new FrameLayout(linearLayout.getContext());
        frameLayout2.setId(R.id.media_picker_content_id);
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        frameLayout2.addView(t1());
        zv8[] zv8VarArr = J;
        zv8 zv8Var = zv8VarArr[4];
        frameLayout2.addView((tp2) this.r.getValue());
        zv8 zv8Var2 = zv8VarArr[8];
        frameLayout2.addView((View) this.v.getValue());
        linearLayout.addView(frameLayout2);
        frameLayout.addView(linearLayout);
        if (x1()) {
            View johVar = new joh(frameLayout.getContext());
            johVar.setId(R.id.media_picker_text_story_view_id);
            qe7.H(johVar, 300L, new o37(18, this));
            frameLayout.addView(johVar);
        }
        if (r1()) {
            wd2 wd2Var = new wd2(frameLayout.getContext());
            wd2Var.setId(R.id.media_picker_camera_container_id);
            wd2Var.setListener(this);
            ExecutorService executorServiceD = ((a2c) this.i.getAccessor().d(27).getValue()).d();
            int iIntValue = ((Number) ((e5d) this.m.getValue()).y2.a(e5d.S6[180]).i()).intValue();
            for (Object obj2 : fg2.d) {
                if (((fg2) obj2).a == iIntValue) {
                    obj = obj2;
                    break;
                }
            }
            fg2 fg2Var = (fg2) obj;
            if (fg2Var == null) {
                fg2Var = fg2.DEFAULT;
            }
            wd2Var.b((n2e) this.B.getValue(), new uvc(executorServiceD, 0, fg2Var));
            frameLayout.addView(wd2Var);
        }
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        if (r1()) {
            q1().a();
        }
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ny8 ny8Var = this.j;
        if (i == 159) {
            wsc.v((wsc) ny8Var.getValue(), new svj(this, 1), strArr, iArr, wsc.n, R.string.permissions_camera_request_photo, R.string.permissions_camera_request_photo_denied, 192);
        } else {
            if (i != 171) {
                return;
            }
            wsc.v((wsc) ny8Var.getValue(), new svj(this, 1), strArr, iArr, wsc.i, R.string.permissions_audio_for_video_request_denied, R.string.permissions_audio_for_video_not_granted, 192);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        if (((Boolean) ((e5d) this.m.getValue()).B().i()).booleanValue() && bundle.containsKey("gallery_mode_args") && !bundle2.containsKey("gallery_mode_args")) {
            gm0.n(this.a, "onUpdateArgs: new args doesn't contain gallery mode, but old had");
            ph7 ph7Var = (ph7) ((Parcelable) tre.f0(bundle, "gallery_mode_args", ph7.class));
            if (ph7Var != null) {
                getArgs().putParcelable("gallery_mode_args", ph7Var);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        r8e r8eVar = w1().v;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new m1a(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((gi7) this.n.getValue()).d, getViewLifecycleOwner().f(), n09Var), new m1a(lq4Var, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(w1().t, getViewLifecycleOwner().f(), n09Var), new m1a(lq4Var, this, i), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(w1().u, getViewLifecycleOwner().f(), n09Var), new m1a(lq4Var, this, 4), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(w1().n, 13), getViewLifecycleOwner().f(), n09Var), new m1a(lq4Var, this, 5), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(w1().p, 13), getViewLifecycleOwner().f(), n09Var), new m1a(lq4Var, this, 6), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((jdf) this.o.getValue()).e, getViewLifecycleOwner().f(), n09Var), new m1a(lq4Var, this, 7), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(w1().w, getViewLifecycleOwner().f(), n09Var), new m1a(lq4Var, this, 8), i), getViewLifecycleScope());
        if (x1() && r1()) {
            e9i.j0(new fz6(n1g.v(w1().x, getViewLifecycleOwner().f(), n09Var), new d97(lq4Var, this, view, 11), i), getViewLifecycleScope());
        }
        if (r1()) {
            e9i.j0(new fz6(n1g.v(((n2e) this.B.getValue()).p, getViewLifecycleOwner().f(), n09Var), new m1a(lq4Var, this, 9), i), getViewLifecycleScope());
        }
        int i2 = 0;
        if (r1()) {
            e9i.j0(new fz6(n1g.v(w1().x, getViewLifecycleOwner().f(), n09Var), new m1a(lq4Var, this, i2), i), getViewLifecycleScope());
        }
        if (x1() && r1() && this.I) {
            this.I = false;
            wd2 wd2VarQ1 = q1();
            bdc.a(wd2VarQ1, new pi(29, wd2VarQ1, this));
        }
        ltb onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a(getViewLifecycleOwner(), this.C);
        }
    }

    public final wd2 q1() {
        return (wd2) this.D.m(this, J[13]);
    }

    public final boolean r1() {
        ph7 ph7Var;
        return ((f5d) ((wo6) this.l.getValue())).C() && (ph7Var = (ph7) ((Parcelable) tre.f0(getArgs(), "gallery_mode_args", ph7.class))) != null && ph7Var.a;
    }

    public final ph7 s1() {
        zv8 zv8Var = J[1];
        return (ph7) this.e.a(this);
    }

    public final tp2 t1() {
        zv8 zv8Var = J[6];
        return (tp2) this.t.getValue();
    }

    public final joh u1() {
        return (joh) this.y.m(this, J[10]);
    }

    public final rcc v1() {
        zv8 zv8Var = J[7];
        return (rcc) this.u.getValue();
    }

    public final q1a w1() {
        return (q1a) this.p.getValue();
    }

    public final boolean x1() {
        if (((f5d) ((wo6) this.l.getValue())).C()) {
            return s1().i || s1().j;
        }
        return false;
    }

    public final void y1(int i) {
        zv8 zv8Var = J[5];
        this.s.b(this, Integer.valueOf(i));
    }

    public final void z1() {
        int i;
        if (r1()) {
            float measuredHeight = 0.0f + this.E + v1().getMeasuredHeight() + ((tp2) this.A.m(this, J[12])).getMeasuredHeight();
            View view = getView();
            if (view != null) {
                Rect rect = n9j.a;
                n9j.e(rect, view);
                i = rect.bottom;
            } else {
                i = 0;
            }
            int i2 = (((int) measuredHeight) + this.F) - i;
            int i3 = i2 >= 0 ? i2 : 0;
            int i4 = (-((int) this.E)) + this.G;
            wd2 wd2VarQ1 = q1();
            wd2VarQ1.h = i4;
            wd2VarQ1.i = i3;
            if (!wd2VarQ1.n) {
                kw3 kw3Var = wd2VarQ1.j;
                kw3Var.b = i4;
                kw3Var.c = i3;
                wd2VarQ1.invalidateOutline();
            }
            q1().setPreviewTranslationY(measuredHeight);
        }
    }

    public MediaPickerScreen(ph7 ph7Var, Long l, ha9 ha9Var) {
        this(n1g.i(new ylc("gallery_mode_args", ph7Var), new ylc("source_id_args", l), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
