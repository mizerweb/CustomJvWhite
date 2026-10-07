package one.me.stories.viewer.viewer;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a4c;
import defpackage.a8g;
import defpackage.a8j;
import defpackage.aah;
import defpackage.azg;
import defpackage.b68;
import defpackage.bc1;
import defpackage.br4;
import defpackage.bwc;
import defpackage.c79;
import defpackage.c7k;
import defpackage.c9;
import defpackage.ca2;
import defpackage.cdc;
import defpackage.cf7;
import defpackage.d3j;
import defpackage.dwd;
import defpackage.e22;
import defpackage.e3j;
import defpackage.e5d;
import defpackage.e6c;
import defpackage.e9i;
import defpackage.eoi;
import defpackage.eyg;
import defpackage.f55;
import defpackage.fqi;
import defpackage.fz6;
import defpackage.g0d;
import defpackage.g8c;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.gpi;
import defpackage.gtg;
import defpackage.h8c;
import defpackage.ha9;
import defpackage.hde;
import defpackage.hsg;
import defpackage.hve;
import defpackage.i19;
import defpackage.i1f;
import defpackage.i3j;
import defpackage.ic6;
import defpackage.isg;
import defpackage.iyl;
import defpackage.j11;
import defpackage.j3;
import defpackage.j8e;
import defpackage.jc4;
import defpackage.je9;
import defpackage.jpi;
import defpackage.jqi;
import defpackage.jsg;
import defpackage.jvf;
import defpackage.jvg;
import defpackage.jz;
import defpackage.kbc;
import defpackage.kc4;
import defpackage.l1c;
import defpackage.l6c;
import defpackage.lp5;
import defpackage.lsg;
import defpackage.lvb;
import defpackage.lve;
import defpackage.m1m;
import defpackage.mc4;
import defpackage.mpi;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n19;
import defpackage.n1g;
import defpackage.n65;
import defpackage.noi;
import defpackage.nt4;
import defpackage.nv7;
import defpackage.ny8;
import defpackage.o3h;
import defpackage.o8c;
import defpackage.oc9;
import defpackage.oi8;
import defpackage.ore;
import defpackage.os1;
import defpackage.p;
import defpackage.p3c;
import defpackage.pkc;
import defpackage.pq3;
import defpackage.qe7;
import defpackage.qni;
import defpackage.qp4;
import defpackage.qpi;
import defpackage.qrc;
import defpackage.qyj;
import defpackage.r3h;
import defpackage.r6c;
import defpackage.rcc;
import defpackage.rea;
import defpackage.rn0;
import defpackage.rni;
import defpackage.ro1;
import defpackage.ro2;
import defpackage.roi;
import defpackage.rp4;
import defpackage.rq9;
import defpackage.rui;
import defpackage.rx8;
import defpackage.ryg;
import defpackage.sb8;
import defpackage.sgg;
import defpackage.sni;
import defpackage.t2g;
import defpackage.t3f;
import defpackage.t3h;
import defpackage.tnh;
import defpackage.tni;
import defpackage.tp2;
import defpackage.tre;
import defpackage.u8b;
import defpackage.u8h;
import defpackage.ua3;
import defpackage.uj6;
import defpackage.uni;
import defpackage.uug;
import defpackage.uw8;
import defpackage.uyg;
import defpackage.ve0;
import defpackage.ve6;
import defpackage.vo8;
import defpackage.vog;
import defpackage.vp4;
import defpackage.vug;
import defpackage.vv;
import defpackage.vvg;
import defpackage.vyg;
import defpackage.wj7;
import defpackage.wo0;
import defpackage.wpi;
import defpackage.wtc;
import defpackage.x5j;
import defpackage.xac;
import defpackage.xbc;
import defpackage.xc0;
import defpackage.xu1;
import defpackage.xyj;
import defpackage.y3d;
import defpackage.yab;
import defpackage.yic;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zhi;
import defpackage.zni;
import defpackage.zo5;
import defpackage.zp3;
import defpackage.zv8;
import defpackage.zyg;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stories.core.workers.SaveStoryToGalleryWorker;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/stories/viewer/viewer/UserStoriesScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lvp4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "parentScope", "Lha9;", "localAccountId", "Lpkc;", DatabaseHelper.ITEM_COLUMN_NAME, "(Lt3f;Lha9;Lpkc;)V", "stories-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UserStoriesScreen extends Widget implements mc4, vp4 {
    public static final /* synthetic */ zv8[] x1 = {new dwd(UserStoriesScreen.class, "ownerStoriesItem", "getOwnerStoriesItem()Lone/me/stories/viewer/viewer/model/OwnerStoriesItem;", 0), zo5.f(zfe.a, UserStoriesScreen.class, "parentScope", "getParentScope()Lone/me/sdk/arch/store/ScopeId;", 0), new dwd(UserStoriesScreen.class, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0), new dwd(UserStoriesScreen.class, "videoPreviewView", "getVideoPreviewView()Lone/me/chatmedia/viewer/video/VideoPreviewView;", 0), new dwd(UserStoriesScreen.class, "photoView", "getPhotoView()Lone/me/chatmedia/viewer/photo/PhotoView;", 0), new dwd(UserStoriesScreen.class, "photoContainerView", "getPhotoContainerView()Landroid/widget/FrameLayout;", 0), new dwd(UserStoriesScreen.class, "photoBlurBackground", "getPhotoBlurBackground()Lone/me/sdk/uikit/common/views/OneMeDraweeView;", 0), new dwd(UserStoriesScreen.class, "videoBlurBackground", "getVideoBlurBackground()Lone/me/sdk/uikit/common/views/OneMeDraweeView;", 0), new dwd(UserStoriesScreen.class, "storyInteractionLayout", "getStoryInteractionLayout()Lone/me/stories/viewer/viewer/view/StoryInteractionLayout;", 0), new dwd(UserStoriesScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(UserStoriesScreen.class, "progressBar", "getProgressBar()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0), new dwd(UserStoriesScreen.class, "progressView", "getProgressView()Lone/me/stories/viewer/viewer/view/StoriesProgressView;", 0), new dwd(UserStoriesScreen.class, "bottomRouter", "getBottomRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new dwd(UserStoriesScreen.class, "bottomContainerView", "getBottomContainerView()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(UserStoriesScreen.class, "headerContainer", "getHeaderContainer()Landroid/widget/LinearLayout;", 0), new dwd(UserStoriesScreen.class, "headerShadowView", "getHeaderShadowView()Landroid/view/View;", 0), new dwd(UserStoriesScreen.class, "overlayView", "getOverlayView()Landroid/view/View;", 0), new z8b(UserStoriesScreen.class, "progressJob", "getProgressJob()Lkotlinx/coroutines/Job;")};
    public final j8e A;
    public final j8e B;
    public final j8e C;
    public final j8e D;
    public e22 E;
    public vyg F;
    public final j8e G;
    public final j8e H;
    public final j8e I;
    public final j8e J;
    public final j8e K;
    public final j8e X;
    public uj6 Y;
    public rui Z;
    public final String a;
    public final vv b;
    public final t3f c;
    public final oi8 d;
    public final wtc e;
    public final ca2 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final t3h l;
    public final ny8 m;
    public final ny8 n;
    public ViewPropertyAnimator n1;
    public boolean o;
    public lp5 o1;
    public ValueAnimator p;
    public final p3c p1;
    public final zni q;
    public g8c q1;
    public final ny8 r;
    public View r1;
    public final ny8 s;
    public qp4 s1;
    public final ny8 t;
    public ryg t1;
    public final ny8 u;
    public final float u1;
    public final j8e v;
    public g8c v1;
    public final j8e w;
    public final vog w1;
    public final j8e x;
    public final j8e y;
    public final j8e z;

    public UserStoriesScreen(Bundle bundle) {
        super(bundle);
        this.a = UserStoriesScreen.class.getName();
        this.b = new vv("story_owner", pkc.class);
        this.c = new t3f("user_stories_scope", super.getB().b());
        this.d = oi8.e;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.e = wtcVar;
        this.f = new ca2(m35getAccountScopeuqN4xOY());
        this.g = wtcVar.getAccessor().d(85);
        this.h = wtcVar.getAccessor().d(26);
        this.i = wtcVar.getAccessor().d(94);
        this.j = wtcVar.getAccessor().d(191);
        this.k = wtcVar.getAccessor().d(788);
        this.l = (t3h) wtcVar.getAccessor().c(953);
        this.m = wtcVar.getAccessor().d(97);
        this.n = rx8.P(3, new rni(this, 1));
        this.q = new zni(this);
        this.r = rx8.P(3, new rni(this, 4));
        this.s = createViewModelLazy(gpi.class, new t2g(28, new rni(this, 5)));
        this.t = createViewModelLazy(vvg.class, new t2g(29, new rni(this, 6)));
        vv vvVar = new vv("parent_scope", t3f.class);
        zv8 zv8Var = x1[1];
        this.u = getSharedViewModel((t3f) vvVar.a(this), jvg.class, null);
        this.v = viewBinding(R.id.oneme_stories_viewer_video_view);
        this.w = viewBinding(R.id.oneme_stories_viewer_video_preview_view);
        this.x = viewBinding(R.id.oneme_stories_viewer_photo_view);
        this.y = viewBinding(R.id.oneme_stories_viewer_photo_container);
        this.z = viewBinding(R.id.oneme_stories_viewer_photo_blur_view);
        this.A = viewBinding(R.id.oneme_stories_viewer_video_blur_view);
        this.B = viewBinding(R.id.oneme_stories_viewer_interaction_layout);
        this.C = viewBinding(R.id.oneme_stories_viewer_toolbar);
        this.D = viewBinding(R.id.oneme_stories_viewer_progressbar);
        this.G = viewBinding(R.id.oneme_stories_viewer_progress_view);
        this.H = childSlotRouter(R.id.oneme_stories_viewer_bottom_container);
        this.I = viewBinding(R.id.oneme_stories_viewer_bottom_container);
        this.J = viewBinding(R.id.oneme_stories_viewer_header_container);
        this.K = viewBinding(R.id.oneme_stories_viewer_header_shadow);
        this.X = viewBinding(R.id.oneme_stories_viewer_overlay_view);
        this.p1 = qyj.S();
        this.u1 = yl5.d().getDisplayMetrics().density * 24.0f;
        this.w1 = new vog(this);
    }

    public static final zp3 o1(UserStoriesScreen userStoriesScreen) {
        return (zp3) userStoriesScreen.H.m(userStoriesScreen, x1[12]);
    }

    public static final LinearLayout p1(UserStoriesScreen userStoriesScreen) {
        return (LinearLayout) userStoriesScreen.J.m(userStoriesScreen, x1[14]);
    }

    public static final View q1(UserStoriesScreen userStoriesScreen) {
        return (View) userStoriesScreen.K.m(userStoriesScreen, x1[15]);
    }

    public static final View r1(UserStoriesScreen userStoriesScreen) {
        return (View) userStoriesScreen.X.m(userStoriesScreen, x1[16]);
    }

    public static final r6c s1(UserStoriesScreen userStoriesScreen) {
        return (r6c) userStoriesScreen.D.m(userStoriesScreen, x1[10]);
    }

    public static final l1c t1(UserStoriesScreen userStoriesScreen) {
        return (l1c) userStoriesScreen.A.m(userStoriesScreen, x1[7]);
    }

    public static final i3j u1(UserStoriesScreen userStoriesScreen) {
        return (i3j) userStoriesScreen.w.m(userStoriesScreen, x1[3]);
    }

    public static final void v1(UserStoriesScreen userStoriesScreen, u8b u8bVar) {
        UserStoriesScreen userStoriesScreen2;
        uyg uygVar;
        if (u8bVar.i()) {
            userStoriesScreen.K1();
            return;
        }
        vyg vygVar = userStoriesScreen.F;
        if (vygVar == null) {
            userStoriesScreen2 = userStoriesScreen;
            vyg vygVar2 = new vyg(userStoriesScreen.getContext(), ((Number) ((e5d) userStoriesScreen.h.getValue()).X4.a(e5d.S6[311]).i()).intValue(), new qni(userStoriesScreen, 7), new rea(2, userStoriesScreen2, UserStoriesScreen.class, "onLayerLongClick", "onLayerLongClick(Landroid/view/View;Lone/me/stories/core/models/layers/StoryLayerModel;)V", 0, 23), userStoriesScreen2.H1().F());
            vygVar2.setId(R.id.oneme_stories_viewer_layers);
            vygVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            userStoriesScreen2.F = vygVar2;
            vygVar = vygVar2;
        } else {
            userStoriesScreen2 = userStoriesScreen;
        }
        yab.e(userStoriesScreen2.F1(), vygVar, -1);
        userStoriesScreen2.F1().d = vygVar;
        u8b u8bVar2 = vygVar.e;
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ryg rygVar = (ryg) objArr[i3];
            if (rygVar.b().g) {
                if (i2 < u8bVar2.b) {
                    uygVar = (uyg) u8bVar2.g(i2);
                } else {
                    View view = new View(vygVar.getContext());
                    Integer numC1 = kotlin.collections.a.c1(i2, vygVar.d);
                    view.setId(numC1 != null ? numC1.intValue() : View.generateViewId());
                    vygVar.addView(view, new FrameLayout.LayoutParams(0, 0));
                    uyg uygVar2 = new uyg(view);
                    qe7.H(view, 300L, new jvf(uygVar2, 10, vygVar));
                    view.setOnLongClickListener(new ro2(uygVar2, 11, vygVar));
                    u8bVar2.b(uygVar2);
                    uygVar = uygVar2;
                }
                uygVar.b = rygVar;
                View view2 = uygVar.a;
                view2.clearFocus();
                view2.setPressed(false);
                view2.setVisibility(0);
                view2.setClickable(true);
                view2.setFocusable(true);
                view2.setContentDescription(rygVar.a());
                view2.setBackground(null);
                if (vygVar.c) {
                    view2.setBackgroundColor(1308557312);
                }
                i2++;
            }
        }
        int i4 = u8bVar2.b;
        while (i2 < i4) {
            vyg.a((uyg) u8bVar2.g(i2));
            i2++;
        }
        vygVar.requestLayout();
        vygVar.invalidate();
    }

    public static final void w1(UserStoriesScreen userStoriesScreen, l1c l1cVar, Uri uri) {
        ((wj7) l1cVar.getHierarchy()).h(i1f.l);
        l1c.j(l1cVar, ((rq9) userStoriesScreen.k.getValue()).a(uri), null, 6);
    }

    public static void y1(FrameLayout frameLayout, int i) {
        l1c l1cVar = new l1c(frameLayout.getContext());
        l1cVar.setId(i);
        l1cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        l1cVar.setForeground(new ColorDrawable(452984831));
        l1cVar.setVisibility(8);
        frameLayout.addView(l1cVar);
    }

    public final kbc A1() {
        return pq3.j.e(getContext()).j().b;
    }

    public final pkc B1() {
        zv8 zv8Var = x1[0];
        return (pkc) this.b.a(this);
    }

    public final jvg C1() {
        return (jvg) this.u.getValue();
    }

    public final FrameLayout D1() {
        return (FrameLayout) this.y.m(this, x1[5]);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        ylc ylcVar;
        UserStoriesScreen userStoriesScreen = this;
        je9 je9Var = je9.f;
        userStoriesScreen.H1().O(5);
        if (i == 2) {
            gpi gpiVarH1 = userStoriesScreen.H1();
            String str = gpiVarH1.p;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, str, "saveCurrentStoryToGallery", null);
                }
            }
            lsg lsgVar = (lsg) gpiVarH1.F.a.getValue();
            if (lsgVar == null) {
                String str2 = gpiVarH1.p;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "saveCurrentStoryToGallery: no current story", null);
                    return;
                }
                return;
            }
            if (lsgVar instanceof hsg) {
                ylcVar = new ylc(((hsg) lsgVar).i.a.toString(), Boolean.FALSE);
            } else {
                if (!(lsgVar instanceof jsg)) {
                    if (!(lsgVar instanceof isg)) {
                        ore.o();
                        return;
                    }
                    String str3 = gpiVarH1.p;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str3, "saveCurrentStoryToGallery: current story is unsupported", null);
                        return;
                    }
                    return;
                }
                ylcVar = new ylc(((jsg) lsgVar).k.toString(), Boolean.TRUE);
            }
            String str4 = (String) ylcVar.a;
            Boolean bool = (Boolean) ylcVar.b;
            boolean zBooleanValue = bool.booleanValue();
            vo8 vo8Var = (vo8) gpiVarH1.y1.remove(Long.valueOf(lsgVar.c()));
            if (vo8Var != null) {
                vo8Var.b(null);
            }
            xyj xyjVar = (xyj) gpiVarH1.s.getValue();
            ha9 ha9Var = gpiVarH1.e;
            long jC = lsgVar.c();
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null) {
                je9 je9Var3 = je9.e;
                if (a4cVar4.b(je9Var3)) {
                    a4cVar4.c(je9Var3, "worker:save-story-to-gallery", bc1.l(jC, "start save story ", " isVideo=", zBooleanValue), null);
                }
            }
            cdc cdcVar = (cdc) ((androidx.work.a) ((androidx.work.a) ((androidx.work.a) ((androidx.work.a) new androidx.work.a(SaveStoryToGalleryWorker.class).setExpedited(yic.a)).setBackoffCriteria(rn0.b, 10000L, TimeUnit.MILLISECONDS)).addTag("worker:save-story-to-gallery")).setInputData(f55.t(ha9Var, new ylc("storyId", Long.valueOf(jC)), new ylc(MLFeatureConfigProviderBase.URL_KEY, str4), new ylc(ApiProtocol.PARAM_IS_VIDEO, bool)))).build();
            String strA = ha9Var.a("worker:save-story-to-gallery:s=" + jC, null);
            ve6 ve6Var = ve6.b;
            a8g a8gVar = xyj.l;
            n19 n19VarB = xyjVar.b(strA, ve6Var, cdcVar);
            n19VarB.N();
            sgg sggVarJ0 = e9i.j0(e9i.T(new j3(new fz6(new fz6(sb8.p(new jz(new hde(iyl.a(n19VarB.o.O()), 3), 13), new u8h(22), sb8.c), new wo0(zBooleanValue, gpiVarH1, null), 3), new c9(2, null, 25), 1), 14, new noi(gpiVarH1, null, 1)), ((n0c) gpiVarH1.f).a()), gpiVarH1.b);
            sggVarJ0.Y(new os1(gpiVarH1, lsgVar, sggVarJ0, 25));
            gpiVarH1.y1.put(Long.valueOf(lsgVar.c()), sggVarJ0);
            return;
        }
        if (i == 3) {
            userStoriesScreen.H1().K(5);
            View view = userStoriesScreen.getView();
            if (view != null) {
                zv8[] zv8VarArr = BottomSheetWidget.t;
                jc4 jc4VarC = p.c(R.string.oneme_stories_delete_confirm_title, null, null, 6);
                jc4VarC.a(new kc4(4, new tnh(R.string.delete), 1, 32), new kc4(5, new tnh(R.string.cancel), 2, 32));
                jc4VarC.j(pq3.j.e(view.getContext()).j().b.getName());
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(userStoriesScreen);
                confirmationBottomSheetF.setTargetController(userStoriesScreen);
                br4 parentController = userStoriesScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                    p.k(false, lveVar, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar);
                    return;
                }
                return;
            }
            return;
        }
        if (i == R.id.oneme_stories_action_go_to_profile) {
            gpi gpiVarH2 = userStoriesScreen.H1();
            azg azgVar = gpiVarH2.c;
            zyg zygVar = azgVar instanceof zyg ? (zyg) azgVar : null;
            if (zygVar == null) {
                return;
            }
            a8j.x(gpiVarH2.s1, new vug(zygVar.a));
            return;
        }
        if (i == R.id.oneme_stories_action_hide_author) {
            gpi gpiVarH3 = userStoriesScreen.H1();
            azg azgVar2 = gpiVarH3.c;
            zyg zygVar2 = azgVar2 instanceof zyg ? (zyg) azgVar2 : null;
            if (zygVar2 == null) {
                return;
            }
            boolean zB = ((nv7) gpiVarH3.u.getValue()).b(zygVar2.a);
            yab.i0(gpiVarH3.b, ((n0c) gpiVarH3.f).a(), 0, new roi(gpiVarH3, zygVar2, zB, null, 0), 2);
            a8j.x(gpiVarH3.r1, new fqi(new tnh(zB ? R.string.stories_author_unhidden_snackbar : R.string.stories_author_hidden_snackbar), new ro1(gpiVarH3, zygVar2, zB)));
            return;
        }
        if (i == R.id.oneme_stories_action_complain) {
            gpi gpiVarH4 = userStoriesScreen.H1();
            Long l = (Long) gpiVarH4.G.a.getValue();
            if (l == null) {
                String str5 = gpiVarH4.p;
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                    a4cVar5.c(je9Var, str5, "complainStory failed cuz storyId is null", null);
                    return;
                }
                return;
            }
            ic6 ic6Var = gpiVarH4.s1;
            uug uugVar = uug.b;
            long jA = gpiVarH4.c.a();
            uugVar.getClass();
            n65 n65Var = new n65();
            n65Var.a = ":complaint";
            n65Var.d(l, "ids");
            n65Var.d(Long.valueOf(jA), "parent_id");
            n65Var.d("story", "type");
            n65Var.d(Boolean.TRUE, "is_dark");
            bc1.q(n65Var.b(), ic6Var);
            return;
        }
        if (i == R.id.link_context_menu_action_open_link) {
            ryg rygVar = userStoriesScreen.t1;
            if (rygVar != null) {
                userStoriesScreen.H1().H(rygVar);
            }
            userStoriesScreen.t1 = null;
            return;
        }
        if (i != R.id.link_context_menu_action_copy_link) {
            String str6 = userStoriesScreen.a;
            a4c a4cVar6 = gm0.f;
            if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                a4cVar6.c(je9Var, str6, zo5.h(i, "onActionClick: unknown id="), null);
                return;
            }
            return;
        }
        ryg rygVar2 = userStoriesScreen.t1;
        if (rygVar2 != null) {
            gpi gpiVarH5 = userStoriesScreen.H1();
            String strA2 = rygVar2.a();
            if (strA2 != null) {
                a8j.x(gpiVarH5.r1, new qpi(strA2));
            } else {
                gpiVarH5.getClass();
            }
        }
        userStoriesScreen.t1 = null;
    }

    public final bwc E1() {
        return (bwc) this.x.m(this, x1[4]);
    }

    public final eyg F1() {
        return (eyg) this.B.m(this, x1[8]);
    }

    public final x5j G1() {
        return (x5j) this.v.m(this, x1[2]);
    }

    @Override // defpackage.mc4
    public final void H(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("link_warning")) {
            H1().I();
        }
        H1().O(5);
    }

    public final gpi H1() {
        return (gpi) this.s.getValue();
    }

    public final vvg I1() {
        return (vvg) this.t.getValue();
    }

    public final void J1(rui ruiVar, boolean z) {
        uj6 uj6Var = this.Y;
        if (uj6Var != null) {
            uj6Var.h();
        }
        e3j e3jVar = (e3j) this.r.getValue();
        e3jVar.x(ruiVar, z, d3j.STORIES_VIEWER, 2, false, 1.0f, true);
        e3jVar.o0(false);
        G1().a(this.w1);
    }

    public final void K1() {
        vyg vygVar = this.F;
        if (vygVar == null) {
            return;
        }
        u8b u8bVar = vygVar.e;
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            vyg.a((uyg) objArr[i2]);
        }
        F1().d = null;
        F1().removeView(vygVar);
    }

    public final void L1(View view) {
        this.r1 = view;
        H1().K(5);
        gpi gpiVarH1 = H1();
        Integer numValueOf = Integer.valueOf(R.attr.icon_negative);
        Integer numValueOf2 = Integer.valueOf(R.attr.text_negative);
        Integer numValueOf3 = Integer.valueOf(R.drawable.icon_download);
        String str = gpiVarH1.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onMenuClick", null);
            }
        }
        boolean zB = false;
        if (!gpiVarH1.D()) {
            azg azgVar = gpiVarH1.c;
            zyg zygVar = azgVar instanceof zyg ? (zyg) azgVar : null;
            zB = zygVar != null ? ((nv7) gpiVarH1.u.getValue()).b(zygVar.a) : false;
            c79 c79VarW = yab.w();
            c79VarW.add(new rp4(R.id.oneme_stories_action_go_to_profile, new tnh(R.string.call_history_dlg_to_profile), Integer.valueOf(R.drawable.icon_profile), (Integer) null, 20));
            c79VarW.add(m1m.a(zB));
            if (!(gpiVarH1.F.a.getValue() instanceof isg)) {
                c79VarW.add(new rp4(2, new tnh(R.string.save_to_gallery), numValueOf3, (Integer) null, 20));
                c79VarW.add(new rp4(R.id.oneme_stories_action_complain, new tnh(R.string.oneme_chat_modal_action_report), numValueOf2, Integer.valueOf(R.drawable.icon_warning), numValueOf));
            }
            a8j.x(gpiVarH1.r1, new jqi(yab.j(c79VarW)));
            return;
        }
        ve0 ve0Var = gpiVarH1.z1;
        lsg lsgVar = (lsg) gpiVarH1.F.a.getValue();
        if (lsgVar != null && (!(lsgVar instanceof isg))) {
            zB = true;
        }
        ve0Var.getClass();
        c79 c79VarW2 = yab.w();
        if (zB) {
            c79VarW2.add(new rp4(2, new tnh(R.string.save_to_gallery), numValueOf3, (Integer) null, 20));
        }
        c79VarW2.add(new rp4(3, new tnh(R.string.delete), numValueOf2, Integer.valueOf(R.drawable.icon_delete), numValueOf));
        ve0Var.e.invoke(new jqi(yab.j(c79VarW2)));
    }

    public final void M1(cf7 cf7Var) {
        if (getView() != null) {
            g8c g8cVar = this.q1;
            if (g8cVar != null) {
                g8cVar.a();
            }
            h8c h8cVar = new h8c(this);
            cf7Var.invoke(h8cVar);
            h8cVar.c(N1());
            this.q1 = h8cVar.p();
        }
    }

    public final o8c N1() {
        int i = uw8.a;
        int measuredHeight = z1().getMeasuredHeight() - (((Boolean) uw8.f.getValue()).booleanValue() ? uw8.a(getContext()) : 0);
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        return new o8c(0, 0, measuredHeight, 11);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        je9 je9Var = je9.f;
        if (((xu1) this.n.getValue()).g(i)) {
            return;
        }
        if (i == 4) {
            H1().C();
            return;
        }
        if (i == 5) {
            H1().O(5);
            return;
        }
        if (i != 6) {
            if (i == 7) {
                H1().I();
                H1().O(5);
                return;
            }
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(i, "onButtonClick: unknown id="), null);
                return;
            }
            return;
        }
        gpi gpiVarH1 = H1();
        eoi eoiVar = gpiVarH1.p1;
        if (eoiVar == null) {
            String str2 = gpiVarH1.p;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "onLinkWarningAccepted: no pending link warning", null);
            }
        } else {
            gpiVarH1.p1 = null;
            if (!eoiVar.b) {
                a8j.x(gpiVarH1.r1, new wpi(eoiVar.a));
            }
            gpiVarH1.o.a(1, eoiVar.b ? 2 : 1, 1);
        }
        H1().O(5);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.c;
    }

    @Override // defpackage.br4
    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        H1().O(7);
        if (getView() == null || this.Z == null) {
            return;
        }
        G1().a(this.w1);
    }

    @Override // defpackage.br4
    public final void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
        H1().K(7);
        if (getView() == null || this.Z == null) {
            return;
        }
        ((e3j) this.r.getValue()).H(null);
        G1().b();
    }

    @Override // defpackage.br4
    public final void onAttach(View view) throws IllegalAccessException, InvocationTargetException {
        super.onAttach(view);
        gpi gpiVarH1 = H1();
        gpiVarH1.O(8);
        gpiVarH1.N();
        mpi mpiVar = (mpi) H1().t1.a.getValue();
        if (mpiVar instanceof jpi) {
            bwc bwcVarE1 = E1();
            b68 b68Var = ((jpi) mpiVar).a;
            zv8[] zv8VarArr = bwc.A;
            bwcVarE1.k(b68Var, false);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClipChildren(false);
        eyg eygVar = new eyg(frameLayout.getContext(), this, new ua3(this, 1), H1().E());
        eygVar.setId(R.id.oneme_stories_viewer_interaction_layout);
        eygVar.setClipToOutline(true);
        eygVar.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 16.0f));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 49);
        layoutParams2.bottomMargin = gm0.K(56.0f * yl5.d().getDisplayMetrics().density);
        eygVar.setLayoutParams(layoutParams2);
        g0d g0dVar = new g0d(eygVar.getContext());
        g0dVar.setId(R.id.oneme_stories_viewer_video_zoom_view);
        g0dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        g0dVar.setMinScale(1.0f);
        g0dVar.setShowCoverRect(false);
        y1(g0dVar, R.id.oneme_stories_viewer_video_blur_view);
        i3j i3jVar = new i3j(g0dVar.getContext());
        i3jVar.setId(R.id.oneme_stories_viewer_video_preview_view);
        i3jVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        ((wj7) i3jVar.getHierarchy()).h(i1f.o);
        g0dVar.addView(i3jVar);
        x5j x5jVar = new x5j(g0dVar.getContext());
        x5jVar.setId(R.id.oneme_stories_viewer_video_view);
        x5jVar.setAlpha(0.0f);
        x5jVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        this.Y = new uj6(x5jVar, 100L);
        g0dVar.addView(x5jVar);
        eygVar.addView(g0dVar);
        FrameLayout frameLayout2 = new FrameLayout(eygVar.getContext());
        frameLayout2.setId(R.id.oneme_stories_viewer_photo_container);
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout2.setVisibility(8);
        y1(frameLayout2, R.id.oneme_stories_viewer_photo_blur_view);
        bwc bwcVar = new bwc(frameLayout2.getContext());
        bwcVar.setId(R.id.oneme_stories_viewer_photo_view);
        bwcVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        bwcVar.setZoomEnabled(true);
        bwcVar.setDoubleTapToZoomEnabled(false);
        bwcVar.setResetScale(true);
        bwcVar.setListener(new c7k(29, this));
        frameLayout2.addView(bwcVar);
        eygVar.addView(frameLayout2);
        if (H1().E()) {
            lp5 lp5Var = new lp5(eygVar.getContext(), ((xac) A1().f().a).c.d);
            lp5Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.o1 = lp5Var;
            eygVar.addView(lp5Var);
        }
        lvb.H(eygVar, new oi8(0, 0, 0, new j11(5, 1, true), 7), null);
        frameLayout.addView(eygVar);
        View view = new View(frameLayout.getContext());
        view.setId(R.id.oneme_stories_viewer_header_shadow);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, gm0.K(92.0f * yl5.d().getDisplayMetrics().density)));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColors(new int[]{tre.I0(-16777216, 0.6f), tre.I0(-16777216, 0.0f)});
        view.setBackground(gradientDrawable);
        frameLayout.addView(view);
        Context context2 = frameLayout.getContext();
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setLayoutParams(layoutParams3);
        linearLayout.setId(R.id.oneme_stories_viewer_header_container);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        linearLayout.setOrientation(1);
        gtg gtgVar = new gtg(linearLayout.getContext());
        gtgVar.setId(R.id.oneme_stories_viewer_progress_view);
        gtgVar.setLayoutParams(new ViewGroup.LayoutParams(-1, gm0.K(4.0f * yl5.d().getDisplayMetrics().density)));
        gtgVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gtgVar.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gtgVar.getPaddingBottom());
        linearLayout.addView(gtgVar);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.oneme_stories_viewer_toolbar);
        rccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        rccVar.setForm(gcc.Chat);
        rccVar.setRightActions(new xbc(new qni(this, 6)));
        a8g a8gVar = pq3.j;
        rccVar.setCustomTheme(a8gVar.l(rccVar).b);
        linearLayout.addView(rccVar);
        frameLayout.addView(linearLayout);
        View view2 = new View(frameLayout.getContext());
        view2.setId(R.id.oneme_stories_viewer_overlay_view);
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view2.setVisibility(8);
        view2.setBackgroundColor(tre.I0(a8gVar.e(view2.getContext()).j().b.b().g, 0.64f));
        qe7.H(view2, 300L, new aah(7, this));
        frameLayout.addView(view2);
        r6c r6cVar = new r6c(frameLayout.getContext());
        r6cVar.setId(R.id.oneme_stories_viewer_progressbar);
        r6cVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        r6cVar.setCustomTheme(A1());
        r6cVar.setAppearance(e6c.a);
        r6cVar.setSize(l6c.a);
        r6cVar.setVisibility(8);
        frameLayout.addView(r6cVar);
        tp2 tp2VarA = oc9.a(frameLayout.getContext());
        tp2VarA.setId(R.id.oneme_stories_viewer_bottom_container);
        tp2VarA.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        tp2VarA.setClipChildren(false);
        frameLayout.addView(tp2VarA);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.addOnLayoutChangeListener(new xc0(19, this));
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroy() {
        ny8 ny8Var = this.r;
        if (ny8Var.d()) {
            e3j e3jVar = (e3j) ny8Var.getValue();
            e3jVar.q(this.q);
            e3jVar.b(0.0f);
            e3jVar.clear();
            ((y3d) this.j.getValue()).a((e3j) ny8Var.getValue());
        }
        super.onDestroy();
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.p = null;
        g8c g8cVar = this.q1;
        if (g8cVar != null) {
            g8cVar.a();
        }
        this.q1 = null;
        qp4 qp4Var = this.s1;
        if (qp4Var != null) {
            qp4Var.dismiss();
        }
        this.s1 = null;
        this.t1 = null;
        this.r1 = null;
        uj6 uj6Var = this.Y;
        if (uj6Var != null) {
            uj6Var.h();
        }
        this.Y = null;
        ViewPropertyAnimator viewPropertyAnimator = this.n1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.n1 = null;
        this.Z = null;
        this.E = null;
        G1().b();
        g8c g8cVar2 = this.v1;
        if (g8cVar2 != null) {
            g8cVar2.b();
        }
        this.v1 = null;
        eyg eygVarF1 = F1();
        eygVarF1.c();
        eygVarF1.e = 0;
        eygVarF1.h = false;
        F1().d = null;
        vyg vygVar = this.F;
        if (vygVar != null) {
            u8b u8bVar = vygVar.e;
            Object[] objArr = u8bVar.a;
            int i = u8bVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                vyg.a((uyg) objArr[i2]);
            }
            vygVar.removeAllViews();
            u8bVar.f();
        }
        this.F = null;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        gpi gpiVarH1 = H1();
        String str = gpiVarH1.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "detach", null);
            }
        }
        gpiVarH1.K(8);
        gpiVarH1.K(6);
    }

    @Override // defpackage.vp4
    public final void onDismiss() {
        this.s1 = null;
        this.t1 = null;
        this.r1 = null;
        H1().O(5);
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((xu1) this.n.getValue()).b(i, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        zhi zhiVar = new zhi(H1().J, 1, this);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(zhiVar, i19VarF, n09Var), new uni(null, this, 13), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(H1().t1, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 12), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(H1().v1, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 14), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(H1().K, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(H1().C, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(H1().w1, 13), getViewLifecycleOwner().f(), n09Var), new uni(null, this, 4), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(I1().n, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 16), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(H1().H, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(H1().G, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 5), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(H1().G, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(H1().r1, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 15), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().y, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 7), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().s, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 8), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new hde(C1().j, 14), getViewLifecycleOwner().f(), n09Var), new uni(null, this, 9), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().p, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 10), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(C1().h, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 11), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(H1().s1, getViewLifecycleOwner().f(), n09Var), new uni(null, this, 6), 3), getViewLifecycleScope());
        ((rcc) this.C.m(this, x1[9])).setTitleClickListener(new rni(this, 7));
        azg azgVar = B1().d;
        t3h t3hVar = this.l;
        r3h r3hVar = (r3h) t3hVar.g.get();
        if (r3hVar instanceof o3h) {
            o3h o3hVar = (o3h) r3hVar;
            if (t3h.B(o3hVar.b(), azgVar)) {
                qrc.k(t3hVar, "story_screen_created", 1, o3hVar.a(), false, null, null, 120);
            }
        }
    }

    public final void x1(boolean z) {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (getView() != null) {
            ValueAnimator valueAnimator = this.p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ylc ylcVar = z ? new ylc(fValueOf2, fValueOf) : new ylc(fValueOf, fValueOf2);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Number) ylcVar.a).floatValue(), ((Number) ylcVar.b).floatValue());
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new sni(this, valueAnimatorOfFloat));
            if (z) {
                valueAnimatorOfFloat.addListener(new tni(this, 1));
            } else {
                valueAnimatorOfFloat.addListener(new tni(this, 0));
            }
            valueAnimatorOfFloat.start();
            this.p = valueAnimatorOfFloat;
        }
    }

    public final tp2 z1() {
        return (tp2) this.I.m(this, x1[13]);
    }

    public UserStoriesScreen(t3f t3fVar, ha9 ha9Var, pkc pkcVar) {
        this(n1g.i(new ylc("parent_scope", t3fVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("story_owner", pkcVar)));
    }
}
