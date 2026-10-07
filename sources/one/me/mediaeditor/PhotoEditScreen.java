package one.me.mediaeditor;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.a7h;
import defpackage.aeb;
import defpackage.b36;
import defpackage.br4;
import defpackage.bvc;
import defpackage.c36;
import defpackage.c7h;
import defpackage.ch3;
import defpackage.cka;
import defpackage.cvc;
import defpackage.d4f;
import defpackage.dr3;
import defpackage.dvc;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e8c;
import defpackage.e9i;
import defpackage.ev;
import defpackage.ex8;
import defpackage.fm0;
import defpackage.fx;
import defpackage.fz6;
import defpackage.g36;
import defpackage.g8c;
import defpackage.gm0;
import defpackage.gvc;
import defpackage.h;
import defpackage.h7b;
import defpackage.ha9;
import defpackage.hta;
import defpackage.hu4;
import defpackage.hve;
import defpackage.hw;
import defpackage.i19;
import defpackage.i7j;
import defpackage.ic6;
import defpackage.ivc;
import defpackage.j06;
import defpackage.j8e;
import defpackage.jvc;
import defpackage.jz;
import defpackage.k11;
import defpackage.kbc;
import defpackage.ks6;
import defpackage.kt7;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.lvc;
import defpackage.lve;
import defpackage.lx3;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nni;
import defpackage.nq4;
import defpackage.nrk;
import defpackage.nt4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ore;
import defpackage.ovc;
import defpackage.ox5;
import defpackage.p0m;
import defpackage.p3c;
import defpackage.pq3;
import defpackage.pvc;
import defpackage.pw;
import defpackage.qe7;
import defpackage.qu5;
import defpackage.qvc;
import defpackage.qyb;
import defpackage.r5h;
import defpackage.rcc;
import defpackage.rq1;
import defpackage.rx8;
import defpackage.su5;
import defpackage.tpe;
import defpackage.tre;
import defpackage.tvc;
import defpackage.ubf;
import defpackage.upe;
import defpackage.v6h;
import defpackage.vo8;
import defpackage.vuc;
import defpackage.vv;
import defpackage.ww3;
import defpackage.wwf;
import defpackage.x26;
import defpackage.x6h;
import defpackage.xc3;
import defpackage.xw3;
import defpackage.xz5;
import defpackage.y26;
import defpackage.y3f;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yv9;
import defpackage.z26;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv;
import defpackage.zv8;
import defpackage.zw1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lone/me/mediaeditor/PhotoEditScreen;", "Lone/me/sdk/arch/Widget;", "Lubf;", "", "Lmc4;", "Lz4f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "imageUriAsString", "", "mediaId", "Lxz5;", "mode", "Lha9;", "localAccountId", "(Ljava/lang/String;Ljava/lang/Long;Lxz5;Lha9;)V", "media-editor"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoEditScreen extends Widget implements ubf, mc4, z4f {
    public static final /* synthetic */ zv8[] s1 = {new dwd(PhotoEditScreen.class, "uriAsString", "getUriAsString()Ljava/lang/String;", 0), zo5.f(zfe.a, PhotoEditScreen.class, "mediaId", "getMediaId()Ljava/lang/Long;", 0), new dwd(PhotoEditScreen.class, "mode", "getMode()Lone/me/photoeditor/view/EditMode;", 0), new dwd(PhotoEditScreen.class, "editorSurfaceContainer", "getEditorSurfaceContainer()Lone/me/photoeditor/view/EditorSurfaceViewContainer;", 0), new dwd(PhotoEditScreen.class, "toolbar", "getToolbar()Landroid/widget/FrameLayout;", 0), new dwd(PhotoEditScreen.class, "mediaToolbar", "getMediaToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(PhotoEditScreen.class, "btnDone", "getBtnDone()Landroid/widget/ImageView;", 0), new dwd(PhotoEditScreen.class, "btnLineTool", "getBtnLineTool()Lone/me/sdk/uikit/common/circleiconbutton/DrawingToolButton;", 0), new dwd(PhotoEditScreen.class, "btnArrowTool", "getBtnArrowTool()Lone/me/sdk/uikit/common/circleiconbutton/DrawingToolButton;", 0), new dwd(PhotoEditScreen.class, "btnColorSelector", "getBtnColorSelector()Lone/me/sdk/uikit/common/circleiconbutton/ColorToolButton;", 0), new dwd(PhotoEditScreen.class, "colorSelectorView", "getColorSelectorView()Lone/me/sdk/uikit/common/stylepicker/StylePickerView;", 0), new dwd(PhotoEditScreen.class, "toolsContainerView", "getToolsContainerView()Landroid/widget/FrameLayout;", 0), new dwd(PhotoEditScreen.class, "toolsSelectorView", "getToolsSelectorView()Landroid/widget/LinearLayout;", 0), new dwd(PhotoEditScreen.class, "widthSelector", "getWidthSelector()Lone/me/sdk/uikit/common/slider/OneMeSliderView;", 0), new dwd(PhotoEditScreen.class, "widthPreview", "getWidthPreview()Lone/me/sdk/uikit/common/circleiconbutton/DynamicStrokeVectorView;", 0), new dwd(PhotoEditScreen.class, "overlayView", "getOverlayView()Landroid/view/View;", 0)};
    public static final ArrayList t1;
    public final z26 A;
    public final int B;
    public final int C;
    public final int D;
    public qvc E;
    public c36 F;
    public g8c G;
    public AnimatorSet H;
    public final wwf I;
    public qu5 J;
    public k11 K;
    public Bundle X;
    public y26 Y;
    public float Z;
    public final String a;
    public final h b;
    public final vv c;
    public final vv d;
    public final vv e;
    public final ny8 f;
    public final pw g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public float n1;
    public final j8e o;
    public final int o1;
    public final j8e p;
    public final int p1;
    public final j8e q;
    public final oi8 q1;
    public final j8e r;
    public final ks6 r1;
    public final j8e s;
    public final j8e t;
    public final ny8 u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public final ny8 y;
    public final ny8 z;

    static {
        int[] iArr = {-1052689, -2368549, -3684409, -5066062, -6710887, -9211021, -11184811, -13224394, -14277082, -14923223, -12377308, -6724551, -2977978, -15486, -140617, -11565, -1210994, -3078039, -6092870, -9863937, -13068304, -9387952, -144548, -160462, -1226410, -16777216, -1};
        ArrayList arrayList = new ArrayList(27);
        for (int i = 0; i < 27; i++) {
            int i2 = iArr[i];
            arrayList.add(new x6h(i2, new int[]{i2}));
        }
        t1 = arrayList;
    }

    public PhotoEditScreen(Bundle bundle) {
        float f;
        float f2;
        super(bundle);
        this.a = PhotoEditScreen.class.getName();
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.b = hVar;
        this.c = new vv("uri", String.class);
        this.d = new vv("media_id", Long.class);
        this.e = new vv("edit_mode", xz5.class);
        this.f = createViewModelLazy(lvc.class, new hta(7, new cvc(this, 4)));
        this.g = new pw(0);
        this.h = viewBinding(R.id.photo_editor_surface_id);
        this.i = viewBinding(R.id.photo_editor_toolbar_id);
        this.j = viewBinding(R.id.media_editor_toolbar);
        this.k = viewBinding(R.id.photo_editor_done_id);
        this.l = viewBinding(R.id.photo_editor_line_tool_id);
        this.m = viewBinding(R.id.photo_editor_arrow_tool_id);
        this.n = viewBinding(R.id.photo_editor_color_tool_id);
        this.o = viewBinding(R.id.photo_editor_color_selector_id);
        this.p = viewBinding(R.id.photo_editor_tools_container_id);
        this.q = viewBinding(R.id.photo_editor_tools_id);
        this.r = viewBinding(R.id.photo_editor_width_selector_id);
        this.s = viewBinding(R.id.photo_editor_width_preview_id);
        this.t = viewBinding(R.id.photo_editor_overlay_id);
        this.u = rx8.P(3, new cka(27));
        this.v = rx8.P(3, new cka(28));
        this.w = rx8.P(3, new cka(29));
        this.x = rx8.P(3, new gvc(0));
        this.y = hVar.getAccessor().d(159);
        this.z = hVar.getAccessor().d(26);
        this.A = (z26) hVar.getAccessor().c(961);
        this.B = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        this.C = gm0.K(192.0f * yl5.d().getDisplayMetrics().density);
        this.D = gm0.K(288.0f * yl5.d().getDisplayMetrics().density);
        this.I = new wwf(hVar.getAccessor().d(7), new cvc(this, 0), new cvc(this, 1));
        this.o1 = gm0.K(72.0f * yl5.d().getDisplayMetrics().density);
        if (A1()) {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 88.0f;
        } else {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 76.0f;
        }
        this.p1 = gm0.K(f2 * f);
        this.q1 = oi8.f;
        this.r1 = tre.F(this, y3f.EDITING_MEDIA_PAINTING);
    }

    public static void H1(FrameLayout frameLayout) {
        View ox5Var = new ox5(frameLayout.getContext());
        ox5Var.setId(R.id.photo_editor_width_preview_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        ox5Var.setLayoutParams(layoutParams);
        int iK = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
        ox5Var.setPadding(iK, iK, iK, iK);
        ox5Var.setVisibility(8);
        frameLayout.addView(ox5Var);
    }

    public final boolean A1() {
        if (!((Boolean) ((e5d) this.z.getValue()).B().i()).booleanValue()) {
            return false;
        }
        zv8 zv8Var = s1[2];
        return ((xz5) this.e.a(this)) == xz5.b;
    }

    public final void B1(float f) {
        pw pwVar = this.g;
        pwVar.getClass();
        hw hwVar = new hw(pwVar);
        while (hwVar.hasNext()) {
            qvc qvcVar = (qvc) hwVar.next();
            if (qvcVar != null) {
                qvcVar.b.g = f;
            }
        }
        ((nni) this.y.getValue()).d((int) f, "app.editor.width");
        if (getView() != null) {
            ((ox5) this.s.m(this, s1[14])).setStrokeWidthPx(f);
        }
    }

    public final void C1(LinearLayout linearLayout) {
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        b36 b36Var = new b36(frameLayout.getContext());
        b36Var.e = new Rect();
        b36Var.f = new Rect();
        b36Var.c = new g36(b36Var.getContext());
        b36Var.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        b36Var.c.setBoundingListener(b36Var);
        b36Var.addView(b36Var.c);
        b36Var.a = new View(b36Var.getContext());
        b36Var.b = new View(b36Var.getContext());
        b36Var.a.setBackgroundColor(-872415232);
        b36Var.b.setBackgroundColor(-872415232);
        b36Var.a.setVisibility(8);
        b36Var.b.setVisibility(8);
        b36Var.addView(b36Var.a);
        b36Var.addView(b36Var.b);
        b36Var.setId(R.id.photo_editor_surface_id);
        b36Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        b36Var.setBackgroundColor(A1() ? 0 : v1().b().c);
        frameLayout.addView(b36Var);
        View view = new View(frameLayout.getContext());
        view.setId(R.id.photo_editor_overlay_id);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackgroundColor(v1().b().g);
        view.setAlpha(0.0f);
        view.setVisibility(8);
        qe7.H(view, 300L, new bvc(this, 0));
        frameLayout.addView(view);
        if (A1()) {
            E1(frameLayout);
            F1(frameLayout, this.p1 - this.o1);
            H1(frameLayout);
        }
        linearLayout.addView(frameLayout);
    }

    public final void D1(boolean z, boolean z2) {
        View view = (View) this.t.m(this, s1[15]);
        view.setAlpha(0.0f);
        view.setVisibility(0);
        if (z) {
            view.animate().cancel();
            view.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(300L).setInterpolator(s1()).start();
        } else if (z2) {
            view.setAlpha(1.0f);
        }
    }

    public final void E1(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(R.id.photo_editor_toolbar_id);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        frameLayout.setLayoutParams(layoutParams);
        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        frameLayout.setPadding(iK, iK, iK, iK);
        if (A1()) {
            frameLayout.setBackgroundColor(0);
        }
        rcc rccVar = new rcc(frameLayout.getContext());
        nrk.a(rccVar, v1(), new cvc(this, 2), new cvc(this, 3));
        frameLayout.addView(rccVar);
        viewGroup.addView(frameLayout);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x02a8 A[EDGE_INSN: B:18:0x02a8->B:19:0x02aa BREAK  A[LOOP:0: B:12:0x028b->B:17:0x02a3], PHI: r6
  0x02a8: PHI (r6v1 float) = (r6v0 float), (r6v0 float), (r6v15 float) binds: [B:7:0x027a, B:9:0x0284, B:24:0x02a8] A[DONT_GENERATE, DONT_INLINE]] */
    public final void F1(FrameLayout frameLayout, int i) {
        float f;
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(R.id.photo_editor_tools_container_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = i;
        frameLayout2.setLayoutParams(layoutParams);
        final int i2 = 1;
        frameLayout2.setClipToOutline(true);
        float f2 = 24.0f;
        frameLayout2.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 24.0f));
        LinearLayout linearLayout = new LinearLayout(frameLayout2.getContext());
        linearLayout.setId(R.id.photo_editor_tools_id);
        final int i3 = 0;
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        linearLayout.setLayoutParams(layoutParams2);
        final su5 su5Var = new su5(linearLayout.getContext());
        su5Var.setId(R.id.photo_editor_line_tool_id);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(yl5.d().getDisplayMetrics().density * 48.0f));
        layoutParams3.gravity = 17;
        su5Var.setLayoutParams(layoutParams3);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        su5Var.setPadding(iK, iK, iK, iK);
        v1();
        Drawable drawable = getContext().getDrawable(R.drawable.icon_line);
        qe7.K(-1, drawable);
        su5Var.setWhiteIcon(drawable);
        int i4 = v1().getIcon().f;
        Drawable drawable2 = getContext().getDrawable(R.drawable.icon_line);
        qe7.K(i4, drawable2);
        su5Var.setDarkIcon(drawable2);
        qe7.H(su5Var, 300L, new View.OnClickListener() { // from class: evc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object value2;
                int i5 = i3;
                kt7 kt7Var = kt7.CLOCK_TICK;
                PhotoEditScreen photoEditScreen = this;
                su5 su5Var2 = su5Var;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = PhotoEditScreen.s1;
                        p0m.a(su5Var2, kt7Var);
                        mjg mjgVar = photoEditScreen.y1().j;
                        do {
                            value = mjgVar.getValue();
                        } while (!mjgVar.h(value, qu5.a));
                        break;
                    default:
                        zv8[] zv8VarArr2 = PhotoEditScreen.s1;
                        p0m.a(su5Var2, kt7Var);
                        mjg mjgVar2 = photoEditScreen.y1().j;
                        do {
                            value2 = mjgVar2.getValue();
                        } while (!mjgVar2.h(value2, qu5.b));
                        break;
                }
            }
        });
        linearLayout.addView(su5Var);
        final su5 su5Var2 = new su5(linearLayout.getContext());
        su5Var2.setId(R.id.photo_editor_arrow_tool_id);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(yl5.d().getDisplayMetrics().density * 48.0f));
        layoutParams4.gravity = 17;
        su5Var2.setLayoutParams(layoutParams4);
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        su5Var2.setPadding(iK2, iK2, iK2, iK2);
        v1();
        Drawable drawable3 = getContext().getDrawable(R.drawable.icon_arrow);
        qe7.K(-1, drawable3);
        su5Var2.setWhiteIcon(drawable3);
        int i5 = v1().getIcon().f;
        Drawable drawable4 = getContext().getDrawable(R.drawable.icon_arrow);
        qe7.K(i5, drawable4);
        su5Var2.setDarkIcon(drawable4);
        qe7.H(su5Var2, 300L, new View.OnClickListener() { // from class: evc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object value2;
                int i6 = i2;
                kt7 kt7Var = kt7.CLOCK_TICK;
                PhotoEditScreen photoEditScreen = this;
                su5 su5Var3 = su5Var2;
                switch (i6) {
                    case 0:
                        zv8[] zv8VarArr = PhotoEditScreen.s1;
                        p0m.a(su5Var3, kt7Var);
                        mjg mjgVar = photoEditScreen.y1().j;
                        do {
                            value = mjgVar.getValue();
                        } while (!mjgVar.h(value, qu5.a));
                        break;
                    default:
                        zv8[] zv8VarArr2 = PhotoEditScreen.s1;
                        p0m.a(su5Var3, kt7Var);
                        mjg mjgVar2 = photoEditScreen.y1().j;
                        do {
                            value2 = mjgVar2.getValue();
                        } while (!mjgVar2.h(value2, qu5.b));
                        break;
                }
            }
        });
        linearLayout.addView(su5Var2);
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setId(R.id.photo_editor_brush_width_id);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(yl5.d().getDisplayMetrics().density * 48.0f));
        layoutParams5.gravity = 17;
        imageView.setLayoutParams(layoutParams5);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int iK3 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        imageView.setPadding(iK3, iK3, iK3, iK3);
        v1();
        Drawable drawable5 = getContext().getDrawable(R.drawable.icon_size_path);
        qe7.K(-1, drawable5);
        imageView.setImageDrawable(drawable5);
        qe7.H(imageView, 300L, new aeb(imageView, 6, this));
        linearLayout.addView(imageView);
        View lx3Var = new lx3(linearLayout.getContext());
        lx3Var.setId(R.id.photo_editor_color_tool_id);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(yl5.d().getDisplayMetrics().density * 48.0f));
        layoutParams6.gravity = 17;
        lx3Var.setLayoutParams(layoutParams6);
        int iK4 = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        lx3Var.setPadding(iK4, iK4, iK4, iK4);
        qe7.H(lx3Var, 300L, new aeb(lx3Var, 5, this));
        linearLayout.addView(lx3Var);
        frameLayout2.addView(linearLayout);
        c7h c7hVar = new c7h(frameLayout2.getContext(), (v6h) this.b.getAccessor().c(974));
        c7hVar.setId(R.id.photo_editor_color_selector_id);
        int i6 = this.C;
        c7hVar.setLayoutParams(new LinearLayout.LayoutParams(i6, -2));
        c7hVar.setVisibility(8);
        c7hVar.setInfinite(true);
        c7hVar.setPickerOverlayColor(0);
        ArrayList arrayList = t1;
        x6h x6hVar = (x6h) ww3.t1(arrayList);
        Long l = null;
        Long lValueOf = x6hVar != null ? Long.valueOf(x6hVar.a) : null;
        List listT1 = ww3.T1(arrayList);
        a7h a7hVar = c7hVar.n2;
        a7hVar.h = listT1;
        a7hVar.o();
        if (lValueOf == null) {
            f = f2;
            break;
        }
        long jLongValue = lValueOf.longValue();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    f = f2;
                    break;
                }
                f = f2;
                Iterator it2 = it;
                if (((x6h) it.next()).a == jLongValue) {
                    l = lValueOf;
                    break;
                } else {
                    f2 = f;
                    it = it2;
                }
            }
        } else {
            f = f2;
            break;
        }
        c7hVar.l2 = l;
        a7hVar.F(l, false);
        zv8 zv8Var = c7h.p2[1];
        c7hVar.G0(((Boolean) c7hVar.k2.b).booleanValue());
        c7hVar.setOnStyleSelectedListener(new qyb(4, this));
        frameLayout2.addView(c7hVar);
        e8c e8cVar = new e8c(frameLayout2.getContext());
        e8cVar.setId(R.id.photo_editor_width_selector_id);
        e8cVar.setLayoutParams(new LinearLayout.LayoutParams(i6, gm0.K(48.0f * yl5.d().getDisplayMetrics().density)));
        e8cVar.setPadding(gm0.K(f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(yl5.d().getDisplayMetrics().density * f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f));
        e8cVar.setSelectedTrackColor(R.attr.icon_primary_inverse_static);
        e8cVar.p = false;
        e8cVar.setDrawSteps(false);
        e8cVar.setVisibility(8);
        e8cVar.setValueTo(yl5.d().getDisplayMetrics().density * 36.0f);
        e8cVar.setValueFrom(yl5.d().getDisplayMetrics().density * 4.0f);
        e8cVar.setStepSize(1.0f);
        e8cVar.setCustomTheme(v1());
        e8cVar.setHapticFeedbackEnabled(false);
        float f3 = ((nni) this.y.getValue()).d.getInt("app.editor.width", this.B);
        if (f3 > 0.0f) {
            e8cVar.setValue(f3);
        }
        e8cVar.v.add(new dvc(0, this));
        frameLayout2.addView(e8cVar);
        v1();
        frameLayout2.setBackgroundColor(-871625458);
        frameLayout.addView(frameLayout2);
    }

    public final void G1(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.0f);
        view.setVisibility(z ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = z ? this.D : this.C;
        view.setLayoutParams(layoutParams);
        x1().setAlpha(z ? 0.0f : 1.0f);
        x1().setVisibility(z ? 8 : 0);
    }

    @Override // defpackage.z4f
    public final Integer L() {
        return Integer.valueOf(v1().b().c);
    }

    @Override // defpackage.z4f
    public final Integer R() {
        return Integer.valueOf(v1().b().c);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        Object obj = null;
        if (i == R.id.media_editor_exit_confirm_id) {
            if (!A1()) {
                this.A.a();
            }
            hve router = getRouter();
            zv zvVar = new zv();
            zvVar.addLast(router);
            loop0: while (!zvVar.isEmpty()) {
                ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
                for (int iO0 = xw3.O0(arrayListE); -1 < iO0; iO0--) {
                    br4 br4Var = ((lve) arrayListE.get(iO0)).a;
                    if (br4Var instanceof vuc) {
                        obj = br4Var;
                        break loop0;
                    }
                    Iterator it = new upe(br4Var.getChildRouters()).iterator();
                    while (true) {
                        ListIterator listIterator = ((tpe) it).b;
                        if (!listIterator.hasPrevious()) {
                            break;
                        } else {
                            zvVar.addLast((hve) listIterator.previous());
                        }
                    }
                }
            }
            vuc vucVar = (vuc) obj;
            if (vucVar != null) {
                vucVar.y();
            }
            yv9.b.l();
            return;
        }
        if (i == R.id.media_editor_reset_confirm_id) {
            qvc qvcVar = this.E;
            if (qvcVar != null) {
                c36 c36Var = qvcVar.b;
                g36 g36Var = c36Var.a;
                List<x26> layers = g36Var.getLayers();
                for (int size = layers.size() - 1; size >= 0; size--) {
                    x26 x26Var = layers.get(size);
                    if (!(x26Var instanceof fm0)) {
                        g36Var.a.remove(x26Var);
                        g36Var.invalidate();
                    }
                }
                c36Var.d.clear();
                c36Var.e.clear();
                c36Var.i = true;
                c36Var.c();
                tvc tvcVar = qvcVar.e;
                tvcVar.getClass();
                tvc tvcVar2 = new tvc(false, false, false, tvcVar.d, tvcVar.e, true, tvcVar.g, true);
                qvcVar.e = tvcVar2;
                qvcVar.a.p1(tvcVar2);
            }
            hve router2 = getRouter();
            zv zvVar2 = new zv();
            zvVar2.addLast(router2);
            loop4: while (!zvVar2.isEmpty()) {
                ArrayList arrayListE2 = ((hve) zvVar2.removeLast()).e();
                for (int iO1 = xw3.O0(arrayListE2); -1 < iO1; iO1--) {
                    br4 br4Var2 = ((lve) arrayListE2.get(iO1)).a;
                    if (br4Var2 instanceof vuc) {
                        obj = br4Var2;
                        break loop4;
                    }
                    Iterator it2 = new upe(br4Var2.getChildRouters()).iterator();
                    while (true) {
                        ListIterator listIterator2 = ((tpe) it2).b;
                        if (!listIterator2.hasPrevious()) {
                            break;
                        } else {
                            zvVar2.addLast((hve) listIterator2.previous());
                        }
                    }
                }
            }
            vuc vucVar2 = (vuc) obj;
            if (vucVar2 != null) {
                vucVar2.T();
            }
            qvc qvcVar2 = this.E;
            if (qvcVar2 != null) {
                qvcVar2.b.i = false;
            }
            View view = getView();
            if (view != null) {
                p0m.a(view, kt7.CLOCK_TICK);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.q1;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.r1;
    }

    public final void o1(int i) {
        ((lx3) this.n.m(this, s1[9])).setInsideColor(i);
        pw pwVar = this.g;
        pwVar.getClass();
        hw hwVar = new hw(pwVar);
        while (hwVar.hasNext()) {
            qvc qvcVar = (qvc) hwVar.next();
            if (qvcVar != null) {
                qvcVar.b.f = i;
            }
        }
        c7h.I0(r1(), i);
        ((nni) this.y.getValue()).d(i, "app.editor.color");
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        this.I.d();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        if (A1()) {
            LinearLayout fxVar = new fx(getContext(), this.o1);
            fxVar.setId(R.id.photo_editor_root_id);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            fxVar.setLayoutParams(layoutParams);
            fxVar.setOrientation(1);
            fxVar.setClickable(true);
            fxVar.setBackgroundColor(0);
            Activity activity = getActivity();
            if (activity != null && (window2 = activity.getWindow()) != null) {
                d(window2);
            }
            C1(fxVar);
            q1(fxVar);
            return fxVar;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setClickable(true);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setId(R.id.photo_editor_root_id);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(v1().b().c);
        Activity activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            d(window);
        }
        E1(linearLayout);
        C1(linearLayout);
        q1(linearLayout);
        frameLayout.addView(linearLayout);
        F1(frameLayout, this.p1);
        H1(frameLayout);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroy() {
        super.onDestroy();
        qvc qvcVar = this.E;
        if (qvcVar != null) {
            pvc pvcVar = qvcVar.d;
            p3c p3cVar = pvcVar.e;
            zv8[] zv8VarArr = pvc.f;
            vo8 vo8Var = (vo8) p3cVar.m(pvcVar, zv8VarArr[0]);
            if (vo8Var != null) {
                vo8Var.b(null);
            }
            pvcVar.e.B(pvcVar, zv8VarArr[0], null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        y26 y26VarB;
        if (A1()) {
            qvc qvcVar = this.E;
            if (qvcVar != null) {
                y26VarB = qvcVar.b.b();
                if (y26VarB.c.isEmpty()) {
                    y26VarB = null;
                }
            } else {
                y26VarB = null;
            }
            this.Y = y26VarB;
        }
        u1().setOnTouchListener(null);
        this.Z = 0.0f;
        this.n1 = 0.0f;
        super.onDestroyView(view);
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        this.I.e();
        super.onDetach(view);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        String string = bundle.getString("drawing_tool");
        this.J = string != null ? qu5.valueOf(string) : null;
        String string2 = bundle.getString("bottom_panel_mode");
        this.K = string2 != null ? k11.valueOf(string2) : null;
        this.X = bundle;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        qvc qvcVar = this.E;
        if (qvcVar != null) {
            c36 c36Var = qvcVar.b;
            bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_STATE", c36Var.b());
            bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_VIEW_STATE", qvcVar.e);
            bundle.putBoolean("ru.ok.tamtam.extra.EDITOR_DIRTY", c36Var.i);
        }
        bundle.putString("drawing_tool", ((qu5) y1().k.a.getValue()).name());
        bundle.putString("bottom_panel_mode", ((k11) y1().m.a.getValue()).name());
        if (A1()) {
            return;
        }
        zv8 zv8Var = s1[1];
        Long l = (Long) this.d.a(this);
        qvc qvcVar2 = this.E;
        this.A.c(l, qvcVar2 != null ? qvcVar2.b.b() : null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ovc ovcVar;
        super.onViewCreated(view);
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(12, this));
        }
        g36 editorSurfaceView = t1().getEditorSurfaceView();
        editorSurfaceView.setZoomEnabled(!A1());
        int iK = A1() ? 0 : gm0.K(76.0f * yl5.d().getDisplayMetrics().density);
        boolean zA1 = A1();
        zv8[] zv8VarArr = s1;
        if (zA1) {
            ovcVar = new ovc(null, 0, iK);
        } else {
            zv8 zv8Var = zv8VarArr[0];
            vv vvVar = this.c;
            if (r5h.X0((String) vvVar.a(this))) {
                ovcVar = new ovc(null, -1, iK);
            } else {
                zv8 zv8Var2 = zv8VarArr[0];
                ovcVar = new ovc(Uri.parse((String) vvVar.a(this)), 0, iK);
            }
        }
        c36 c36Var = new c36(editorSurfaceView, A1());
        this.F = c36Var;
        pvc pvcVar = new pvc(getContext().getResources(), ovcVar, getViewLifecycleScope(), this.b.getAccessor().d(23));
        zv8 zv8Var3 = zv8VarArr[1];
        y26 y26Var = (y26) this.A.b((Long) this.d.a(this)).getValue();
        ex8 ex8Var = y1().p;
        y26 y26Var2 = this.Y;
        qvc qvcVar = new qvc(this, c36Var, ex8Var, pvcVar, y26Var2 == null ? y26Var : y26Var2);
        this.E = qvcVar;
        Bundle bundle = this.X;
        if (bundle != null) {
            if (bundle.containsKey("ru.ok.tamtam.extra.EDITOR_STATE")) {
                qvcVar.d.a(c36Var, (y26) bundle.getParcelable("ru.ok.tamtam.extra.EDITOR_STATE"), true);
            }
            if (bundle.containsKey("ru.ok.tamtam.extra.EDITOR_VIEW_STATE")) {
                tvc tvcVar = (tvc) bundle.getParcelable("ru.ok.tamtam.extra.EDITOR_VIEW_STATE");
                qvcVar.e = tvcVar;
                p1(tvcVar);
            }
            if (bundle.getBoolean("ru.ok.tamtam.extra.EDITOR_DIRTY")) {
                c36Var.i = true;
            }
        }
        this.X = null;
        ny8 ny8Var = this.y;
        o1(((nni) ny8Var.getValue()).d.getInt("app.editor.color", -13068304));
        float f = ((nni) ny8Var.getValue()).d.getInt("app.editor.width", this.B);
        if (f > 0.0f) {
            B1(f);
        }
        ic6 ic6Var = y1().n;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new ivc(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(y1().i, 13), getViewLifecycleOwner().f(), n09Var), new ivc(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(y1().k, getViewLifecycleOwner().f(), n09Var), new ivc(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new xc3(y1().m, 9), getViewLifecycleOwner().f(), n09Var), new ivc(null, this, 3), 3), getViewLifecycleScope());
        x1().animate().cancel();
        w1().setScaleX(0.75f);
        w1().setScaleY(0.75f);
        w1().setAlpha(0.0f);
        w1().animate().alpha(1.0f).setDuration(333L).setInterpolator((PathInterpolator) this.v.getValue()).start();
        w1().animate().scaleX(1.1f).scaleY(1.1f).setDuration(250L).setInterpolator(s1()).withEndAction(new h7b(6, this)).start();
        if (A1()) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            rcc rccVarU1 = u1();
            WeakHashMap weakHashMap = i7j.a;
            if (!rccVarU1.isLaidOut() || rccVarU1.isLayoutRequested()) {
                rccVarU1.addOnLayoutChangeListener(new rq1(this, iArr, iArr2, 2));
            } else {
                u1().getLocationOnScreen(iArr);
                t1().getLocationOnScreen(iArr2);
                this.Z = iArr[0] - iArr2[0];
                this.n1 = iArr[1] - iArr2[1];
            }
            u1().setOnTouchListener(new zw1(3, this));
        }
    }

    public final void p1(tvc tvcVar) {
        Object value;
        mjg mjgVar = y1().g;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, tvcVar));
    }

    public final void q1(LinearLayout linearLayout) {
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, A1() ? this.o1 : -2));
        frameLayout.setBackgroundColor(v1().b().c);
        dr3 dr3Var = new dr3(frameLayout.getContext());
        dr3Var.setId(R.id.photo_editor_close_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(yl5.d().getDisplayMetrics().density * 36.0f));
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f));
        layoutParams.gravity = 8388611;
        dr3Var.setLayoutParams(layoutParams);
        dr3Var.setStrokeEnabled(true);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        dr3Var.setScaleType(scaleType);
        dr3Var.setImageResource(R.drawable.icon_cross);
        n1g.N(new j06(3, null, 1), dr3Var);
        qe7.H(dr3Var, 300L, new bvc(this, 1));
        frameLayout.addView(dr3Var);
        dr3 dr3Var2 = new dr3(frameLayout.getContext());
        dr3Var2.setId(R.id.photo_editor_done_id);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
        layoutParams2.setMargins(0, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        layoutParams2.gravity = 8388613;
        dr3Var2.setLayoutParams(layoutParams2);
        dr3Var2.setStrokeEnabled(false);
        dr3Var2.setScaleType(scaleType);
        dr3Var2.setImageResource(R.drawable.icon_check);
        n1g.N(new j06(3, null, 2), dr3Var2);
        qe7.H(dr3Var2, 300L, new bvc(this, 2));
        frameLayout.addView(dr3Var2);
        linearLayout.addView(frameLayout);
    }

    public final c7h r1() {
        return (c7h) this.o.m(this, s1[10]);
    }

    public final PathInterpolator s1() {
        return (PathInterpolator) this.u.getValue();
    }

    public final b36 t1() {
        return (b36) this.h.m(this, s1[3]);
    }

    public final rcc u1() {
        return (rcc) this.j.m(this, s1[5]);
    }

    public final kbc v1() {
        return pq3.j.e(getContext()).j().b;
    }

    public final FrameLayout w1() {
        return (FrameLayout) this.p.m(this, s1[11]);
    }

    public final LinearLayout x1() {
        return (LinearLayout) this.q.m(this, s1[12]);
    }

    public final lvc y1() {
        return (lvc) this.f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        jvc jvcVar;
        boolean zBooleanValue;
        if (lq4Var instanceof jvc) {
            jvcVar = (jvc) lq4Var;
            int i = jvcVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jvcVar.f = i - Integer.MIN_VALUE;
            } else {
                jvcVar = new jvc(this, (nq4) lq4Var);
            }
        } else {
            jvcVar = new jvc(this, (nq4) lq4Var);
        }
        Object objV0 = jvcVar.d;
        int i2 = jvcVar.f;
        Object obj = null;
        if (i2 == 0) {
            ch3.d0(objV0);
            hve router = getRouter();
            zv zvVar = new zv();
            zvVar.addLast(router);
            loop0: while (!zvVar.isEmpty()) {
                ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
                for (int iO0 = xw3.O0(arrayListE); -1 < iO0; iO0--) {
                    br4 br4Var = ((lve) arrayListE.get(iO0)).a;
                    if (br4Var instanceof vuc) {
                        obj = br4Var;
                        break loop0;
                    }
                    Iterator it = new upe(br4Var.getChildRouters()).iterator();
                    while (true) {
                        ListIterator listIterator = ((tpe) it).b;
                        if (listIterator.hasPrevious()) {
                            zvVar.addLast((hve) listIterator.previous());
                        }
                    }
                }
            }
            vuc vucVar = (vuc) obj;
            if (vucVar != null) {
                jvcVar.f = 1;
                objV0 = vucVar.V0(jvcVar);
                hu4 hu4Var = hu4.a;
                if (objV0 == hu4Var) {
                    return hu4Var;
                }
            } else {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objV0);
        zBooleanValue = ((Boolean) objV0).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public final e8c z1() {
        return (e8c) this.r.m(this, s1[13]);
    }

    public PhotoEditScreen(String str, Long l, xz5 xz5Var, ha9 ha9Var) {
        this(n1g.i(new ylc("uri", str), new ylc("edit_mode", xz5Var), new ylc("media_id", l), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
