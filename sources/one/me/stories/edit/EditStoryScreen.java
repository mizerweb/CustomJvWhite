package one.me.stories.edit;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.a6a;
import defpackage.a8j;
import defpackage.ac;
import defpackage.boh;
import defpackage.br4;
import defpackage.bs0;
import defpackage.bx;
import defpackage.ci1;
import defpackage.col;
import defpackage.d16;
import defpackage.dr3;
import defpackage.dwd;
import defpackage.e3j;
import defpackage.e5d;
import defpackage.e6c;
import defpackage.e9i;
import defpackage.ee;
import defpackage.ev;
import defpackage.ew5;
import defpackage.fj3;
import defpackage.fwg;
import defpackage.fy8;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gcc;
import defpackage.ghb;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.gy8;
import defpackage.h06;
import defpackage.h8c;
import defpackage.ha9;
import defpackage.ht1;
import defpackage.hu;
import defpackage.hve;
import defpackage.i06;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j06;
import defpackage.j11;
import defpackage.j16;
import defpackage.j8e;
import defpackage.j95;
import defpackage.je9;
import defpackage.k06;
import defpackage.kb9;
import defpackage.kbc;
import defpackage.kj1;
import defpackage.l06;
import defpackage.l1c;
import defpackage.l6c;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.lve;
import defpackage.lw5;
import defpackage.m20;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.mvh;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n61;
import defpackage.nt1;
import defpackage.nt4;
import defpackage.nv4;
import defpackage.ny8;
import defpackage.oc9;
import defpackage.oi8;
import defpackage.oyg;
import defpackage.p26;
import defpackage.pq3;
import defpackage.psg;
import defpackage.qe7;
import defpackage.qm0;
import defpackage.qt4;
import defpackage.r6c;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.s5a;
import defpackage.s63;
import defpackage.sgg;
import defpackage.suc;
import defpackage.t3f;
import defpackage.t5a;
import defpackage.tnh;
import defpackage.tp2;
import defpackage.tpe;
import defpackage.u3m;
import defpackage.upe;
import defpackage.uvc;
import defpackage.vk4;
import defpackage.vt3;
import defpackage.vuc;
import defpackage.vv;
import defpackage.w8c;
import defpackage.wbc;
import defpackage.wr0;
import defpackage.wr4;
import defpackage.wtc;
import defpackage.wy7;
import defpackage.xk2;
import defpackage.xph;
import defpackage.xw3;
import defpackage.y16;
import defpackage.y26;
import defpackage.y5h;
import defpackage.y8j;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw4;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zk2;
import defpackage.zo5;
import defpackage.zp3;
import defpackage.zv;
import defpackage.zv8;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.sdk.arch.Widget;
import one.me.videoeditor.trimslider.VideoTrimSliderWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/stories/edit/EditStoryScreen;", "Lone/me/sdk/arch/Widget;", "Ls5a;", "Lz4f;", "Lyw4;", "Lvuc;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "mediaId", "", "mediaType", "", "shareUri", "Lha9;", "localAccountId", "(Ljava/lang/Long;ILjava/lang/String;Lha9;Lj95;)V", "stories"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditStoryScreen extends Widget implements s5a, z4f, yw4, vuc, mc4 {
    public static final /* synthetic */ zv8[] A1 = {new dwd(EditStoryScreen.class, "mediaId", "getMediaId()Ljava/lang/Long;", 0), zo5.f(zfe.a, EditStoryScreen.class, "mediaType", "getMediaType()I", 0), new dwd(EditStoryScreen.class, "shareUri", "getShareUri()Ljava/lang/String;", 0), new dwd(EditStoryScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(EditStoryScreen.class, "cropAction", "getCropAction()Landroid/widget/ImageView;", 0), new dwd(EditStoryScreen.class, "actions", "getActions()Landroid/view/ViewGroup;", 0), new dwd(EditStoryScreen.class, "backgroundSwipeLayout", "getBackgroundSwipeLayout()Lone/me/stories/edit/background/BackgroundSwipeFrameLayout;", 0), new dwd(EditStoryScreen.class, "backgroundSelectorView", "getBackgroundSelectorView()Lone/me/stories/edit/background/TextStoryBackgroundSelectorView;", 0), new dwd(EditStoryScreen.class, "backgroundViewPager", "getBackgroundViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new dwd(EditStoryScreen.class, "storyLayerCanvasView", "getStoryLayerCanvasView()Lone/me/photoeditor/canvas/CanvasLayerView;", 0), new dwd(EditStoryScreen.class, "layerDragOverlayView", "getLayerDragOverlayView()Lone/me/stories/editor/LayerDragOverlayView;", 0), new dwd(EditStoryScreen.class, "addTextPlaceholderView", "getAddTextPlaceholderView()Lone/me/stories/edit/AddTextPlaceholderView;", 0), new dwd(EditStoryScreen.class, "videoDownloadProgressView", "getVideoDownloadProgressView()Landroid/view/View;", 0), new dwd(EditStoryScreen.class, "videoDownloadProgressBar", "getVideoDownloadProgressBar()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0), new dwd(EditStoryScreen.class, "contentRouter", "getContentRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(EditStoryScreen.class, "trimSliderRouter", "getTrimSliderRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(EditStoryScreen.class, "trimSliderContainer", "getTrimSliderContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(EditStoryScreen.class, "blurBackgroundView", "getBlurBackgroundView()Lone/me/sdk/uikit/common/views/OneMeDraweeView;", 0), new dwd(EditStoryScreen.class, "textEditRouter", "getTextEditRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(EditStoryScreen.class, "textEditorContainer", "getTextEditorContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0)};
    public final j8e A;
    public g8c B;
    public t5a C;
    public sgg D;
    public wr0 E;
    public wy7 F;
    public String G;
    public boolean H;
    public mvh I;
    public final fwg J;
    public final ha9 K;
    public final ny8 X;
    public final int Y;
    public final int Z;
    public final String a;
    public final vv b;
    public final vv c;
    public final vv d;
    public final t3f e;
    public final wtc f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public LinearLayout m;
    public final j8e n;
    public final int n1;
    public final j8e o;
    public final float o1;
    public final j8e p;
    public final int p1;
    public final j8e q;
    public final int[] q1;
    public final j8e r;
    public final int[] r1;
    public final j8e s;
    public final int[] s1;
    public final j8e t;
    public float t1;
    public final j8e u;
    public float u1;
    public final j8e v;
    public boolean v1;
    public final j8e w;
    public final ExecutorService w1;
    public final j8e x;
    public a6a x1;
    public final j8e y;
    public final vt3 y1;
    public final j8e z;
    public final oi8 z1;

    public EditStoryScreen(Bundle bundle) {
        super(bundle);
        this.a = EditStoryScreen.class.getName();
        this.b = new vv("id", Long.class);
        this.c = new vv("type", Integer.class);
        this.d = new vv("share_uri", String.class);
        t3f t3fVar = new t3f("storyEditor", super.getB().b());
        this.e = t3fVar;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.f = wtcVar;
        this.g = wtcVar.getAccessor().d(788);
        wtcVar.getAccessor().getClass();
        this.h = wtcVar.getAccessor().d(26);
        this.i = createViewModelLazy(p26.class, new fj3(19, new i06(this, 1)));
        this.j = viewBinding(R.id.story_editor_toolbar_id);
        this.k = viewBinding(R.id.story_editor_crop_action_id);
        this.l = viewBinding(R.id.story_editor_actions_id);
        this.n = viewBinding(R.id.story_editor_background_swipe_id);
        this.o = viewBinding(R.id.story_editor_color_selector_id);
        this.p = viewBinding(R.id.story_editor_background_viewpager_id);
        this.q = viewBinding(R.id.story_layer_canvas_id);
        this.r = viewBinding(R.id.story_layer_drag_overlay_id);
        this.s = viewBinding(R.id.story_editor_add_text_placeholder_id);
        this.t = viewBinding(R.id.story_video_download_progress_id);
        this.u = viewBinding(R.id.story_video_download_progress_bar_id);
        this.v = childSlotRouter(R.id.story_editor_content_container_id);
        this.w = childSlotRouter(R.id.story_editor_video_trim_container_id);
        this.x = viewBinding(R.id.story_editor_video_trim_container_id);
        this.y = viewBinding(R.id.story_editor_blur_view_id);
        this.z = childSlotRouter(R.id.story_editor_text_editor_container_id);
        this.A = viewBinding(R.id.story_editor_text_editor_container_id);
        this.J = new fwg();
        this.K = t3fVar.b();
        this.X = rx8.P(3, new i06(this, 2));
        this.Y = gm0.K(72.0f * yl5.d().getDisplayMetrics().density);
        this.Z = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        this.n1 = gm0.K(14.0f * yl5.d().getDisplayMetrics().density);
        this.o1 = yl5.d().getDisplayMetrics().density * 24.0f;
        this.p1 = gm0.K(56.0f * yl5.d().getDisplayMetrics().density);
        this.q1 = new int[2];
        this.r1 = new int[2];
        this.s1 = new int[2];
        this.w1 = ((a2c) wtcVar.getAccessor().c(27)).a();
        this.y1 = new vt3(2, this);
        this.z1 = new oi8(5, 3, 5, new j11(3, 1, false));
    }

    public static final void o1(EditStoryScreen editStoryScreen) {
        if (editStoryScreen.C1().N1.a.getValue() != wr4.c || ((Boolean) ((gjg) editStoryScreen.C1().t1.getValue()).getValue()).booleanValue()) {
            return;
        }
        t5a t5aVar = editStoryScreen.C;
        if (t5aVar != null) {
            t5aVar.e(false);
        }
        editStoryScreen.C1().O();
    }

    @Override // defpackage.yw4
    public final void A0(suc sucVar) {
        p26 p26VarC1 = C1();
        Uri uri = sucVar.c;
        a8j.t(p26VarC1, ((n0c) p26VarC1.H()).a(), new vk4(13, (lq4) null, p26VarC1, sucVar.b, sucVar.d, uri), 2);
    }

    public final tp2 A1() {
        return (tp2) this.x.m(this, A1[16]);
    }

    public final VideoTrimSliderWidget B1() {
        br4 br4VarC = rx8.C(((zp3) this.w.m(this, A1[15])).a);
        if (br4VarC instanceof VideoTrimSliderWidget) {
            return (VideoTrimSliderWidget) br4VarC;
        }
        return null;
    }

    public final p26 C1() {
        return (p26) this.i.getValue();
    }

    public final void D1(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        if (C1().I1) {
            return;
        }
        C1().I1 = true;
        br4 br4VarC = rx8.C(t1().a);
        SingleMediaViewerWidget singleMediaViewerWidget = br4VarC instanceof SingleMediaViewerWidget ? (SingleMediaViewerWidget) br4VarC : null;
        if (singleMediaViewerWidget != null) {
            if (singleMediaViewerWidget.d.d()) {
                e3j e3jVarW0 = singleMediaViewerWidget.w0();
                e3jVarW0.pause();
                e3jVarW0.H(null);
                e3jVarW0.stop();
            }
            View view = singleMediaViewerWidget.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                br4 br4VarC2 = rx8.C(singleMediaViewerWidget.getChildRouter(viewGroup));
                VideoViewerWidget videoViewerWidget = br4VarC2 instanceof VideoViewerWidget ? (VideoViewerWidget) br4VarC2 : null;
                if (videoViewerWidget != null) {
                    videoViewerWidget.w1();
                }
            }
            if (z) {
                View view2 = singleMediaViewerWidget.getView();
                if (view2 != null && (viewPropertyAnimatorAnimate = view2.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(200L)) != null) {
                    duration.start();
                }
            } else {
                View view3 = singleMediaViewerWidget.getView();
                if (view3 != null) {
                    view3.setAlpha(0.0f);
                }
            }
        }
        if (z) {
            s1().animate().alpha(0.0f).setDuration(200L).start();
        } else {
            s1().setAlpha(0.0f);
        }
    }

    public final boolean E1() {
        sgg sggVar;
        return (w1() == null || (sggVar = this.D) == null || !sggVar.isActive()) ? false : true;
    }

    public final void F1() throws IllegalAccessException, InvocationTargetException {
        e3j e3jVarW0;
        br4 br4VarC = rx8.C(t1().a);
        sgg sggVarJ0 = null;
        SingleMediaViewerWidget singleMediaViewerWidget = br4VarC instanceof SingleMediaViewerWidget ? (SingleMediaViewerWidget) br4VarC : null;
        if (singleMediaViewerWidget == null) {
            return;
        }
        wr0 wr0Var = this.E;
        if (wr0Var != null) {
            singleMediaViewerWidget.w0().q(wr0Var);
        }
        wr0 wr0Var2 = new wr0(this, 1);
        this.E = wr0Var2;
        singleMediaViewerWidget.w0().q0(wr0Var2);
        sgg sggVar = this.D;
        if (sggVar != null) {
            sggVar.b(null);
        }
        br4 br4VarC2 = rx8.C(t1().a);
        SingleMediaViewerWidget singleMediaViewerWidget2 = br4VarC2 instanceof SingleMediaViewerWidget ? (SingleMediaViewerWidget) br4VarC2 : null;
        if (singleMediaViewerWidget2 != null && (e3jVarW0 = singleMediaViewerWidget2.w0()) != null) {
            ghb ghbVar = ew5.b;
            sggVarJ0 = e9i.j0(new fz6(n1g.v(u3m.b(e3jVarW0, qe7.O(16, lw5.MILLISECONDS)), getViewLifecycleOwner().f(), n09.d), new k06(null, this, 1), 3), getViewLifecycleScope());
        }
        this.D = sggVarJ0;
    }

    public final void G1(boolean z) {
        g8c g8cVar = this.B;
        if (g8cVar != null) {
            g8cVar.a();
        }
        tnh tnhVar = new tnh(z ? R.string.oneme_chatmedia_viewer_load_video_fail : R.string.oneme_chatmedia_viewer_load_photo_fail);
        h8c h8cVar = new h8c(this);
        h8cVar.m(tnhVar);
        h8cVar.h(new w8c(R.drawable.icon_warning));
        this.B = h8cVar.p();
    }

    public final void H1(int i) {
        t5a t5aVar;
        if (!((Boolean) ((gjg) C1().t1.getValue()).getValue()).booleanValue() || (t5aVar = this.C) == null) {
            return;
        }
        t5aVar.d(i);
    }

    @Override // defpackage.z4f
    public final Integer L() {
        return Integer.valueOf(u1().b().c);
    }

    @Override // defpackage.z4f
    public final Integer R() {
        return Integer.valueOf(u1().b().c);
    }

    @Override // defpackage.vuc
    public final void T() {
        p26 p26VarC1 = C1();
        p26VarC1.h.c(p26VarC1.c, null);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.media_editor_reset_confirm_id) {
            p1();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getG() {
        return this.z1;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.e;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(u1().b().c);
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            d(window);
        }
        Context context = frameLayout.getContext();
        int i = this.Y;
        bx bxVar = new bx(context, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        bxVar.setLayoutParams(layoutParams);
        bxVar.setClipToOutline(true);
        bxVar.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
        bxVar.setMotionEventSplittingEnabled(false);
        qm0 qm0Var = new qm0(bxVar.getContext());
        qm0Var.setId(R.id.story_editor_background_swipe_id);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.bottomMargin = i;
        qm0Var.setLayoutParams(layoutParams2);
        FrameLayout frameLayout2 = new FrameLayout(qm0Var.getContext());
        frameLayout2.setClipChildren(true);
        frameLayout2.setClipToOutline(true);
        frameLayout2.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
        y8j y8jVar = new y8j(frameLayout2.getContext());
        y8jVar.setId(R.id.story_editor_background_viewpager_id);
        y8jVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        y8jVar.setOffscreenPageLimit(-1);
        y8jVar.setAdapter((xph) this.X.getValue());
        lvb.m0(y8jVar);
        y8jVar.setVisibility(((Boolean) C1().G.a.getValue()).booleanValue() ? 0 : 8);
        qm0Var.setBackgroundViewPager(y8jVar);
        bx bxVar2 = new bx(frameLayout2.getContext(), 0);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        bxVar2.setLayoutParams(layoutParams3);
        bxVar2.setClipToOutline(true);
        bxVar2.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
        bxVar2.addView(y8jVar);
        l1c l1cVar = new l1c(bxVar2.getContext());
        l1cVar.setId(R.id.story_editor_blur_view_id);
        l1cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        l1cVar.setForeground(new ColorDrawable(452984831));
        l1cVar.setVisibility(!((Boolean) C1().G.a.getValue()).booleanValue() ? 0 : 8);
        bxVar2.addView(l1cVar);
        tp2 tp2VarA = oc9.a(bxVar2.getContext());
        tp2VarA.setId(R.id.story_editor_content_container_id);
        tp2VarA.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        bxVar2.addView(tp2VarA);
        zk2 zk2Var = new zk2(bxVar2.getContext(), this.f.getAccessor().d(254));
        zk2Var.setId(R.id.story_layer_canvas_id);
        zk2Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        zk2Var.setDrawingInteractive(((Boolean) C1().S1.getValue()).booleanValue());
        zk2Var.addOnLayoutChangeListener(new ci1(4, this));
        zk2Var.setOnLayerSelected(new n61(1, C1().s, oyg.class, "onLayerSelected", "onLayerSelected(Ljava/lang/Long;)V", 0, 18));
        zk2Var.setOnLayerEditRequested(new n61(1, C1(), p26.class, "onTextLayerEditRequested", "onTextLayerEditRequested(J)V", 0, 19));
        zk2Var.setOnLayerTransformChanged(new l06(5, 0, oyg.class, C1().s, "onLayerTransformChanged", "onLayerTransformChanged(JFFFF)V"));
        zk2Var.setOnDrawingLayersChanged(new m20(2, C1(), p26.class, "onDrawingLayersChanged", "onDrawingLayersChanged(Ljava/util/List;Landroid/graphics/Rect;)V", 0, 17));
        zk2Var.setOnLayerReordered(new n61(1, C1(), p26.class, "onLayerReordered", "onLayerReordered([J)V", 0, 20));
        zk2Var.setOnEmptyAreaDoubleTapped(new kj1(0, C1(), p26.class, "onTextLayerActionClick", "onTextLayerActionClick()V", 0, 15));
        zk2Var.setOnMediaTransformChanged(new i06(this, 3));
        zk2Var.setListener(new uvc(this, 15, zk2Var));
        bxVar2.addView(zk2Var);
        ac acVar = new ac(bxVar2.getContext());
        acVar.setListener(new s63(20, this));
        acVar.setTheme(u1());
        acVar.setVisibility(((Boolean) C1().G.a.getValue()).booleanValue() ? 0 : 8);
        bxVar2.addView(acVar);
        frameLayout2.addView(bxVar2);
        View fy8Var = new fy8(frameLayout2.getContext());
        fy8Var.setVisibility(8);
        fy8Var.setAlpha(0.0f);
        frameLayout2.addView(fy8Var);
        boh bohVar = new boh(frameLayout2.getContext(), this.w1);
        bohVar.setId(R.id.story_editor_color_selector_id);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        bohVar.setLayoutParams(layoutParams4);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        bohVar.setPadding(iK, 0, iK, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f));
        bohVar.setListener(new hu(bohVar, 22, this));
        bohVar.setClickable(true);
        bohVar.setVisibility(8);
        frameLayout2.addView(bohVar);
        qm0Var.addView(frameLayout2);
        bxVar.addView(qm0Var);
        FrameLayout frameLayout3 = new FrameLayout(bxVar.getContext());
        frameLayout3.setId(R.id.story_editor_actions_id);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, i);
        layoutParams5.gravity = 80;
        frameLayout3.setLayoutParams(layoutParams5);
        frameLayout3.setVisibility(4);
        frameLayout3.setBackgroundColor(u1().b().c);
        LinearLayout linearLayout = new LinearLayout(frameLayout3.getContext());
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 17;
        linearLayout.setLayoutParams(layoutParams6);
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setId(R.id.story_editor_crop_action_id);
        int i2 = this.p1;
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams7.gravity = 17;
        int i3 = this.n1;
        imageView.setPadding(i3, i3, i3, i3);
        imageView.setLayoutParams(layoutParams7);
        imageView.setVisibility(!((Boolean) C1().G.a.getValue()).booleanValue() ? 0 : 8);
        int i4 = ((bs0) u1().u().c.g).c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        u1();
        paint.setColor(-1);
        imageView.setBackground(col.b(i4, null, shapeDrawable));
        imageView.setImageResource(R.drawable.ic_trim_video);
        u1();
        imageView.setImageTintList(ColorStateList.valueOf(-1));
        qe7.H(imageView, 300L, new h06(imageView, this, 2));
        linearLayout.addView(imageView);
        ImageView imageView2 = new ImageView(linearLayout.getContext());
        imageView2.setId(R.id.story_editor_text_layer_action_id);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams8.gravity = 17;
        imageView2.setPadding(i3, i3, i3, i3);
        imageView2.setLayoutParams(layoutParams8);
        imageView2.setVisibility(0);
        int i5 = ((bs0) u1().u().c.g).c;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        Paint paint2 = shapeDrawable2.getPaint();
        u1();
        paint2.setColor(-1);
        imageView2.setBackground(col.b(i5, null, shapeDrawable2));
        imageView2.setImageResource(R.drawable.ic_input_text);
        u1();
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
        qe7.H(imageView2, 300L, new h06(imageView2, this, 0));
        linearLayout.addView(imageView2);
        ImageView imageView3 = new ImageView(linearLayout.getContext());
        imageView3.setId(R.id.story_editor_draw_layer_action_id);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams9.gravity = 17;
        imageView3.setPadding(i3, i3, i3, i3);
        imageView3.setLayoutParams(layoutParams9);
        imageView3.setVisibility(0);
        int i6 = ((bs0) u1().u().c.g).c;
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
        Paint paint3 = shapeDrawable3.getPaint();
        u1();
        paint3.setColor(-1);
        imageView3.setBackground(col.b(i6, null, shapeDrawable3));
        imageView3.setImageResource(R.drawable.icon_paint);
        u1();
        imageView3.setImageTintList(ColorStateList.valueOf(-1));
        qe7.H(imageView3, 300L, new h06(imageView3, this, 1));
        linearLayout.addView(imageView3);
        ImageView imageView4 = new ImageView(linearLayout.getContext());
        imageView4.setId(R.id.story_editor_link_action_id);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams10.gravity = 17;
        imageView4.setPadding(i3, i3, i3, i3);
        imageView4.setLayoutParams(layoutParams10);
        imageView4.setVisibility(((Boolean) ((e5d) this.h.getValue()).W4.a(e5d.S6[310]).i()).booleanValue() ? 0 : 8);
        int i7 = ((bs0) u1().u().c.g).c;
        ShapeDrawable shapeDrawable4 = new ShapeDrawable(new OvalShape());
        Paint paint4 = shapeDrawable4.getPaint();
        u1();
        paint4.setColor(-1);
        imageView4.setBackground(col.b(i7, null, shapeDrawable4));
        imageView4.setImageResource(R.drawable.icon_link);
        u1();
        imageView4.setImageTintList(ColorStateList.valueOf(-1));
        qe7.H(imageView4, 300L, new h06(this, imageView4));
        linearLayout.addView(imageView4);
        this.m = linearLayout;
        frameLayout3.addView(linearLayout);
        dr3 dr3Var = new dr3(frameLayout3.getContext());
        dr3Var.setId(R.id.story_editor_next_id);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
        layoutParams11.setMargins(0, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        layoutParams11.gravity = 8388613;
        dr3Var.setLayoutParams(layoutParams11);
        dr3Var.setScaleType(ImageView.ScaleType.CENTER);
        dr3Var.setStrokeEnabled(false);
        dr3Var.setImageResource(R.drawable.icon_chevron_right);
        n1g.N(new j06(3, null, 0), dr3Var);
        qe7.H(dr3Var, 300L, new ee(dr3Var, 29, this));
        frameLayout3.addView(dr3Var);
        bxVar.addView(frameLayout3);
        rcc rccVar = new rcc(bxVar.getContext());
        rccVar.setId(R.id.story_editor_toolbar_id);
        rccVar.setForm(gcc.Chat);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams12.gravity = 48;
        rccVar.setLayoutParams(layoutParams12);
        rccVar.setCustomTheme(u1());
        rccVar.setLeftActions(new wbc("M7.825 13l4.887 4.888a0.999 0.999 0 0 1-1.412 1.413l-6.593-6.593a1 1 0 0 1 0-1.415L11.3 4.7a0.999 0.999 0 1 1 1.412 1.413L7.825 11H19a1 1 0 1 1 0 2z", this.o1, new nv4(6, this)));
        rccVar.setBackgroundColor(0);
        rccVar.setOnTouchListener(new nt1(this, 1, rccVar));
        bxVar.addView(rccVar);
        View tp2Var = new tp2(bxVar.getContext());
        tp2Var.setId(R.id.story_editor_text_editor_container_id);
        tp2Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tp2Var.setVisibility(8);
        tp2Var.setBackgroundColor(u1().b().g);
        bxVar.addView(tp2Var);
        frameLayout.addView(bxVar);
        FrameLayout frameLayout4 = new FrameLayout(frameLayout.getContext());
        frameLayout4.setId(R.id.story_video_download_progress_id);
        frameLayout4.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout4.setBackgroundColor(-1728053248);
        frameLayout4.setVisibility(8);
        frameLayout4.setClickable(true);
        r6c r6cVar = new r6c(frameLayout4.getContext());
        r6cVar.setId(R.id.story_video_download_progress_bar_id);
        r6cVar.setSize(l6c.a);
        r6cVar.setAppearance(e6c.a);
        r6cVar.setIndeterminate(false);
        r6cVar.setMax(100);
        r6cVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout4.addView(r6cVar);
        frameLayout.addView(frameLayout4);
        View viewA = oc9.a(frameLayout.getContext());
        viewA.setId(R.id.story_editor_video_trim_container_id);
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams13.gravity = 80;
        viewA.setLayoutParams(layoutParams13);
        viewA.setVisibility(8);
        viewA.setBackgroundColor(u1().b().c);
        frameLayout.addView(viewA);
        this.C = new t5a(frameLayout, this);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) throws IllegalAccessException, InvocationTargetException {
        fwg fwgVar = this.J;
        fwgVar.b = true;
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) fwgVar.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        fwgVar.e = null;
        ViewPropertyAnimator viewPropertyAnimator2 = (ViewPropertyAnimator) fwgVar.f;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        fwgVar.f = null;
        ViewPropertyAnimator viewPropertyAnimator3 = (ViewPropertyAnimator) fwgVar.g;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.cancel();
        }
        fwgVar.g = null;
        ViewPropertyAnimator viewPropertyAnimator4 = (ViewPropertyAnimator) fwgVar.h;
        if (viewPropertyAnimator4 != null) {
            viewPropertyAnimator4.cancel();
        }
        fwgVar.h = null;
        ValueAnimator valueAnimator = (ValueAnimator) fwgVar.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fwgVar.i = null;
        v1().a();
        Object obj = (Drawable) C1().E.getValue();
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null && animatable.isRunning()) {
            animatable.stop();
        }
        zk2 zk2VarX1 = x1();
        gy8 gy8Var = zk2VarX1.n1;
        gy8Var.p = null;
        gy8Var.r = false;
        if (gy8Var.I != 1) {
            gy8Var.h(1);
            gy8Var.e = -1;
            gy8Var.f = -1;
        }
        gy8Var.q = null;
        zk2VarX1.c();
        zk2VarX1.m = null;
        zk2VarX1.C = null;
        zk2VarX1.D = null;
        zk2VarX1.H = null;
        zk2VarX1.E = null;
        zk2VarX1.F = null;
        zk2VarX1.G = null;
        zk2VarX1.J = null;
        zk2VarX1.setDeleteZoneRect(null);
        y1().setOnTouchListener(null);
        this.v1 = false;
        ((ac) this.s.m(this, A1[11])).setListener(null);
        q1().setListener(null);
        wy7 wy7Var = this.F;
        if (wy7Var != null) {
            r1().j(wy7Var);
        }
        this.F = null;
        this.m = null;
        g8c g8cVar = this.B;
        if (g8cVar != null) {
            g8cVar.a();
        }
        getRouter().M(this.y1);
        wr0 wr0Var = this.E;
        if (wr0Var != null) {
            br4 br4VarC = rx8.C(t1().a);
            SingleMediaViewerWidget singleMediaViewerWidget = br4VarC instanceof SingleMediaViewerWidget ? (SingleMediaViewerWidget) br4VarC : null;
            if (singleMediaViewerWidget != null) {
                singleMediaViewerWidget.w0().q(wr0Var);
            }
        }
        C1().X();
        x1().setMediaLayer(null);
        this.x1 = null;
        super.onDestroyView(view);
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        mvh mvhVar = this.I;
        if (mvhVar != null) {
            mvhVar.dismiss();
        }
        this.I = null;
        super.onDetach(view);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.G = bundle.getString("selected_background");
        this.H = bundle.getBoolean("overlay_visible");
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = (String) C1().N().h.a.getValue();
        if (str != null) {
            bundle.putString("selected_background", str);
        }
        bundle.putBoolean("overlay_visible", !z1());
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) throws IllegalAccessException, InvocationTargetException {
        Integer numB0;
        je9 je9Var = je9.d;
        String string = bundle2.getString("share_uri");
        if (string == null) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onUpdateArgs: no share URI in new args", null);
                return;
            }
            return;
        }
        if (string.equals(bundle.getString("share_uri"))) {
            String str2 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "onUpdateArgs: same URI, skipping reload", null);
                return;
            }
            return;
        }
        String string2 = bundle2.getString("type");
        if (string2 == null || (numB0 = y5h.B0(string2)) == null) {
            String str3 = this.a;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str3, "onUpdateArgs: invalid type in new args", null);
                return;
            }
            return;
        }
        int iIntValue = numB0.intValue();
        if (((Boolean) C1().G.a.getValue()).booleanValue()) {
            C1().s.b();
        }
        p26 p26VarC1 = C1();
        p26VarC1.I1 = false;
        mjg mjgVar = p26VarC1.F;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        sgg sggVar = p26VarC1.q1;
        if (sggVar != null) {
            sggVar.b(null);
        }
        sgg sggVar2 = p26VarC1.Z;
        if (sggVar2 != null) {
            sggVar2.b(null);
        }
        p26VarC1.h.a();
        xk2 xk2Var = p26VarC1.i;
        xk2Var.a = null;
        xk2Var.e();
        mjg mjgVar2 = xk2Var.d;
        List list = xk2Var.b;
        mjgVar2.getClass();
        mjgVar2.j(null, list);
        mjg mjgVar3 = p26VarC1.K;
        d16 d16Var = d16.a;
        mjgVar3.getClass();
        mjgVar3.j(null, d16Var);
        mjg mjgVar4 = p26VarC1.w1;
        Float fValueOf = Float.valueOf(0.0f);
        mjgVar4.getClass();
        mjgVar4.j(null, fValueOf);
        mjg mjgVar5 = p26VarC1.y1;
        Float fValueOf2 = Float.valueOf(1.0f);
        mjgVar5.getClass();
        mjgVar5.j(null, fValueOf2);
        mjg mjgVar6 = p26VarC1.r1;
        j16 j16Var = j16.a;
        mjgVar6.getClass();
        mjgVar6.j(null, j16Var);
        mjg mjgVar7 = p26VarC1.G1;
        y16 y16Var = new y16((kb9) null, 3);
        mjgVar7.getClass();
        mjgVar7.j(null, y16Var);
        p26VarC1.Q1.setValue(null);
        p26VarC1.q1 = a8j.t(p26VarC1, null, new ht1(p26VarC1, string, iIntValue, (lq4) null, 11), 3);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        qt4.C(this.H, C1().H, null);
        String str = this.G;
        if (str != null) {
            mjg mjgVar = C1().N().g;
            mjgVar.getClass();
            mjgVar.j(null, str);
        }
        getRouter().a(this.y1);
        wy7 wy7Var = new wy7(6, this);
        this.F = wy7Var;
        r1().e(wy7Var);
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(6, this));
        }
        ic6 ic6Var = C1().E1;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new k06(null, this, 14), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().F1, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().X, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 15), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().N1, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 16), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().s1, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 17), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v((gjg) C1().t1.getValue(), getViewLifecycleOwner().f(), n09Var), new k06(null, this, 18), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().C1, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 19), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().J1, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 20), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().K1, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 21), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().u1, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 8), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().R1, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 9), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().s.h, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 10), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().N().f, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().N().i, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().P1, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 4), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().O1, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 5), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().G, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 6), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().I, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 7), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().s.e, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 11), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().s.f, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 12), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().s.j, getViewLifecycleOwner().f(), n09Var), new k06(null, this, 13), 3), getViewLifecycleScope());
    }

    @Override // defpackage.s5a
    public final void p0(int i) {
        Object value;
        int iD = qt4.D(i);
        if (iD != 1 && iD != 2) {
            if (iD != 4) {
                return;
            }
            H1(4);
            C1().T(4);
            return;
        }
        e3j e3jVarW1 = w1();
        if (e3jVarW1 == null) {
            return;
        }
        if (!e3jVarW1.d()) {
            e3jVarW1.play();
            C1().O();
            return;
        }
        e3jVarW1.pause();
        p26 p26VarC1 = C1();
        p26VarC1.F();
        mjg mjgVar = p26VarC1.M1;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, wr4.d));
    }

    public final void p1() {
        hve router = getRouter();
        zv zvVar = new zv();
        zvVar.addLast(router);
        while (!zvVar.isEmpty()) {
            ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
            for (int iO0 = xw3.O0(arrayListE); -1 < iO0; iO0--) {
                Iterator it = new upe(((lve) arrayListE.get(iO0)).a.getChildRouters()).iterator();
                while (true) {
                    ListIterator listIterator = ((tpe) it).b;
                    if (listIterator.hasPrevious()) {
                        zvVar.addLast((hve) listIterator.previous());
                    }
                }
            }
        }
        psg.b.j();
    }

    public final boh q1() {
        return (boh) this.o.m(this, A1[7]);
    }

    @Override // defpackage.vuc
    public final void r(Uri uri, y26 y26Var) {
        p26 p26VarC1 = C1();
        p26VarC1.h.c(p26VarC1.c, y26Var);
    }

    public final y8j r1() {
        return (y8j) this.p.m(this, A1[8]);
    }

    public final l1c s1() {
        return (l1c) this.y.m(this, A1[17]);
    }

    public final zp3 t1() {
        return (zp3) this.v.m(this, A1[14]);
    }

    public final kbc u1() {
        return pq3.j.k(getContext()).b;
    }

    public final fy8 v1() {
        return (fy8) this.r.m(this, A1[10]);
    }

    public final e3j w1() {
        br4 br4VarC = rx8.C(t1().a);
        SingleMediaViewerWidget singleMediaViewerWidget = br4VarC instanceof SingleMediaViewerWidget ? (SingleMediaViewerWidget) br4VarC : null;
        if (singleMediaViewerWidget != null) {
            return singleMediaViewerWidget.w0();
        }
        return null;
    }

    public final zk2 x1() {
        return (zk2) this.q.m(this, A1[9]);
    }

    @Override // defpackage.vuc
    public final void y() {
    }

    public final rcc y1() {
        return (rcc) this.j.m(this, A1[3]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [br4] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    public final boolean z1() {
        ?? parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarW1 = rootController != null ? rootController.w1() : null;
        return !((hveVarW1 != null ? rx8.C(hveVarW1) : null) instanceof PhotoEditScreen);
    }

    public EditStoryScreen(Long l, int i, String str, ha9 ha9Var, j95 j95Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("id", l), new ylc("type", Integer.valueOf(i)), new ylc("share_uri", str)));
    }

    public /* synthetic */ EditStoryScreen(Long l, int i, String str, ha9 ha9Var, int i2, j95 j95Var) {
        this(l, i, (i2 & 4) != 0 ? null : str, ha9Var, null);
    }
}
