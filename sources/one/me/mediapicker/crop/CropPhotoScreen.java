package one.me.mediapicker.crop;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.a8j;
import defpackage.ay4;
import defpackage.br4;
import defpackage.bx;
import defpackage.bx4;
import defpackage.ch3;
import defpackage.d4f;
import defpackage.dr3;
import defpackage.dwd;
import defpackage.dx4;
import defpackage.e9i;
import defpackage.ev;
import defpackage.ex4;
import defpackage.fj3;
import defpackage.fx4;
import defpackage.fz6;
import defpackage.g5d;
import defpackage.gjf;
import defpackage.gm0;
import defpackage.gx4;
import defpackage.h;
import defpackage.h6f;
import defpackage.ha9;
import defpackage.hu4;
import defpackage.hve;
import defpackage.i19;
import defpackage.i1f;
import defpackage.ic6;
import defpackage.ifh;
import defpackage.iw4;
import defpackage.ix4;
import defpackage.j8e;
import defpackage.j95;
import defpackage.jx;
import defpackage.jx4;
import defpackage.kbc;
import defpackage.ks6;
import defpackage.kt7;
import defpackage.l5b;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.lve;
import defpackage.mc4;
import defpackage.mw4;
import defpackage.mx4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nq4;
import defpackage.nrk;
import defpackage.nx4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ore;
import defpackage.p0m;
import defpackage.pq3;
import defpackage.qe7;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rt3;
import defpackage.rx4;
import defpackage.s63;
import defpackage.t1d;
import defpackage.t3f;
import defpackage.tpe;
import defpackage.tre;
import defpackage.tx4;
import defpackage.ubf;
import defpackage.upe;
import defpackage.vd7;
import defpackage.vv;
import defpackage.ww3;
import defpackage.wwf;
import defpackage.xj7;
import defpackage.xw3;
import defpackage.y0c;
import defpackage.y3f;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw4;
import defpackage.z0c;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv;
import defpackage.zv8;
import defpackage.zw4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import one.me.mediapicker.crop.CropPhotoScreen;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB5\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\n\u0010\u0016¨\u0006\u0017"}, d2 = {"Lone/me/mediapicker/crop/CropPhotoScreen;", "Lone/me/sdk/arch/Widget;", "Lubf;", "Lix4;", "Lz4f;", "Ly0c;", "Ljx;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "imageUriAsString", "Ljx4;", "mode", "Lha9;", "localAccountId", "", "isStoriesMode", "Ly3f;", "screen", "(Ljava/lang/String;Ljx4;Lha9;ZLy3f;)V", "media-picker"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CropPhotoScreen extends Widget implements ubf, ix4, z4f, y0c, jx, mc4 {
    public static final /* synthetic */ zv8[] p = {new dwd(CropPhotoScreen.class, "isStoriesMode", "isStoriesMode()Z", 0), zo5.f(zfe.a, CropPhotoScreen.class, "screen", "getScreen()Lone/me/sdk/statistics/screen/Screen;", 0), new dwd(CropPhotoScreen.class, "cropView", "getCropView()Lone/me/image/crop/view/CropPhotoView;", 0), new dwd(CropPhotoScreen.class, "cropRotationWheel", "getCropRotationWheel()Lone/me/sdk/uikit/common/croprotationwheel/OneMeCropRotationWheel;", 0), new dwd(CropPhotoScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final String a;
    public final t3f b;
    public final h c;
    public final ny8 d;
    public final vv e;
    public final vv f;
    public final oi8 g;
    public final ks6 h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final RectF l;
    public final ny8 m;
    public final int n;
    public final wwf o;

    public CropPhotoScreen(Bundle bundle) {
        super(bundle);
        this.a = CropPhotoScreen.class.getName();
        this.b = new t3f("crop_photo", super.getD().b());
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.c = hVar;
        this.d = createViewModelLazy(rx4.class, new fj3(14, new dx4(bundle, 0, this)));
        vv vvVar = new vv("stories_mode", Boolean.class);
        this.e = vvVar;
        this.f = new vv(y3f.class, y3f.AVATAR_PICKER_CROP, "screen");
        this.g = oi8.a(oi8.f, 13);
        this.h = tre.G(this, new bx4(this, 4));
        this.i = viewBinding(R.id.media_editor_crop_id);
        this.j = viewBinding(R.id.media_editor_crop_wheel_id);
        this.k = viewBinding(R.id.media_editor_toolbar);
        this.l = new RectF();
        this.m = hVar.getAccessor().d(97);
        ifh ifhVarD = hVar.getAccessor().d(7);
        zv8 zv8Var = p[0];
        this.n = ((Boolean) vvVar.a(this)).booleanValue() ? 24 : 6;
        this.o = new wwf(ifhVarD, new bx4(this, 0), new bx4(this, 1));
    }

    public static void o1(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.stop();
            animatedVectorDrawable.start();
        }
    }

    @Override // defpackage.jx
    public final void J0(int i, int i2) {
        rx4 rx4VarV1 = v1();
        tx4 tx4VarZ = t1().z();
        ic6 ic6Var = rx4VarV1.j;
        rx4VarV1.I(tx4VarZ);
        if (i == -1 || i2 == -1) {
            a8j.x(ic6Var, iw4.a);
        } else {
            a8j.x(ic6Var, new mw4(i, i2));
        }
    }

    @Override // defpackage.z4f
    public final Integer L() {
        return Integer.valueOf(u1().b().b);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i != R.id.media_editor_reset_confirm_id) {
            if (i == R.id.media_editor_exit_confirm_id) {
                a8j.x(v1().i, rt3.b);
            }
        } else {
            View view = getView();
            if (view != null) {
                v1().G(t1().z());
                p0m.a(view, kt7.CLOCK_TICK);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.g;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getD() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.h;
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        this.o.d();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            d(window);
        }
        zv8 zv8Var = p[0];
        boolean zBooleanValue = ((Boolean) this.e.a(this)).booleanValue();
        jx4 jx4Var = jx4.b;
        if (!zBooleanValue) {
            frameLayout.setBackgroundColor(u1().b().c);
            FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
            frameLayout2.setId(R.id.media_editor_content_id);
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout2.setBackgroundColor(u1().b().c);
            q1(frameLayout2);
            if (v1().c == jx4Var) {
                p1(frameLayout2);
            }
            r1(frameLayout2);
            frameLayout.addView(frameLayout2);
            return frameLayout;
        }
        frameLayout.setBackgroundColor(u1().b().b);
        q1(frameLayout);
        FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
        frameLayout3.setId(R.id.media_editor_toolbar_background_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        frameLayout3.setLayoutParams(layoutParams);
        lvb.I(frameLayout3);
        frameLayout3.setBackgroundColor(u1().b().b);
        View view = new View(frameLayout3.getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, zo5.b(24.0f, yl5.d().getDisplayMetrics().density, gm0.K(52.0f * yl5.d().getDisplayMetrics().density))));
        frameLayout3.addView(view);
        frameLayout.addView(frameLayout3);
        FrameLayout bxVar = new bx(frameLayout.getContext(), gm0.K(72.0f * yl5.d().getDisplayMetrics().density));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        bxVar.setLayoutParams(layoutParams2);
        lvb.I(bxVar);
        if (v1().c == jx4Var) {
            p1(bxVar);
        }
        r1(bxVar);
        frameLayout.addView(bxVar);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        mx4 mx4VarT1 = t1();
        mx4VarT1.setCropViewListener(null);
        mx4VarT1.setListener(null);
        mx4VarT1.setOnReleaseListener(null);
        if (v1().c == jx4.b) {
            s1().setListener(null);
        }
        super.onDestroyView(view);
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        this.o.e();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        zw4 zw4Var = (zw4) ((Parcelable) tre.f0(bundle, "crop_state", zw4.class));
        if (zw4Var != null) {
            v1().w = zw4Var;
            rx4 rx4VarV1 = v1();
            nx4 nx4Var = zw4Var.b;
            rx4VarV1.l.setValues(nx4Var.a);
            rx4VarV1.s = nx4Var.b;
            rx4VarV1.x = nx4Var.c;
            zv zvVar = rx4VarV1.y;
            zvVar.clear();
            zvVar.addAll(zw4Var.c);
            rx4VarV1.J();
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (getView() != null) {
            tx4 onReleaseState = t1().getOnReleaseState();
            if (onReleaseState == null) {
                onReleaseState = t1().z();
            }
            if (onReleaseState != null) {
                rx4 rx4VarV1 = v1();
                float[] fArr = new float[9];
                rx4VarV1.l.getValues(fArr);
                bundle.putParcelable("crop_state", new zw4(onReleaseState, new nx4(fArr, rx4VarV1.s, rx4VarV1.x), ww3.T1(rx4VarV1.y)));
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(5, this));
        }
        t1().setCropViewListener(this);
        zw4 zw4Var = v1().w;
        if (zw4Var != null) {
            t1().H1 = zw4Var.a;
            if (v1().c == jx4.b) {
                s1().setAngle(v1().x);
            }
        }
        r8e r8eVar = v1().B;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new fx4(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(v1().i, getViewLifecycleOwner().f(), n09Var), new fx4(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(v1().j, getViewLifecycleOwner().f(), n09Var), new fx4(null, this, 2), 3), getViewLifecycleScope());
    }

    public final void p1(FrameLayout frameLayout) {
        z0c z0cVar = new z0c(frameLayout.getContext());
        z0cVar.setId(R.id.media_editor_crop_wheel_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, gm0.K(138.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 81;
        z0cVar.setLayoutParams(layoutParams);
        z0cVar.setListener(this);
        frameLayout.addView(z0cVar);
    }

    public final void q1(FrameLayout frameLayout) {
        mx4 mx4Var = new mx4(frameLayout.getContext());
        mx4Var.setId(R.id.media_editor_crop_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(0.0f * yl5.d().getDisplayMetrics().density), gm0.K(130.0f * yl5.d().getDisplayMetrics().density));
        mx4Var.setLayoutParams(layoutParams);
        mx4Var.setZoomableController(new ay4(new h6f(new l5b()), ((g5d) ((gjf) this.m.getValue())).l()));
        mx4Var.setMode(v1().c);
        mx4Var.setBackgroundColor(u1().b().b);
        mx4Var.setZoomEnabled(true);
        xj7 xj7Var = new xj7(mx4Var.getResources());
        xj7Var.l = i1f.n;
        xj7Var.b = 0;
        mx4Var.setHierarchy(xj7Var.a());
        t1d t1dVar = vd7.a.get();
        t1dVar.b(v1().d);
        t1dVar.j = mx4Var.getController();
        t1dVar.f = new ex4(0, this);
        mx4Var.setController(t1dVar.a());
        mx4Var.setListener(new s63(15, this));
        frameLayout.addView(mx4Var);
    }

    public final void r1(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        frameLayout2.setLayoutParams(layoutParams);
        final int i = 0;
        zv8 zv8Var = p[0];
        if (!((Boolean) this.e.a(this)).booleanValue()) {
            lvb.I(frameLayout2);
        }
        frameLayout2.setBackgroundColor(u1().b().b);
        rcc rccVar = new rcc(frameLayout2.getContext());
        final int i2 = 2;
        nrk.a(rccVar, u1(), new bx4(this, 2), new bx4(this, 3));
        frameLayout2.addView(rccVar);
        frameLayout.addView(frameLayout2);
        View view = new View(frameLayout.getContext());
        view.setId(R.id.media_editor_bottom_background_id);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, gm0.K(130.0f * yl5.d().getDisplayMetrics().density));
        layoutParams2.gravity = 80;
        view.setLayoutParams(layoutParams2);
        view.setBackgroundColor(u1().b().b);
        frameLayout.addView(view);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
        layoutParams3.gravity = 80;
        linearLayout.setLayoutParams(layoutParams3);
        linearLayout.setGravity(17);
        final ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setId(R.id.media_editor_rotate_id);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        layoutParams4.setMargins(iK, iK, iK, iK);
        imageView.setLayoutParams(layoutParams4);
        imageView.setImageResource(R.drawable.icon_rotate_animated);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        u1();
        imageView.setImageTintList(ColorStateList.valueOf(-1));
        o1(imageView);
        qe7.H(imageView, 300L, new View.OnClickListener(this) { // from class: cx4
            public final /* synthetic */ CropPhotoScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i;
                kt7 kt7Var = kt7.CLOCK_TICK;
                ImageView imageView2 = imageView;
                CropPhotoScreen cropPhotoScreen = this.b;
                switch (i3) {
                    case 0:
                        CropPhotoScreen.o1(imageView2);
                        p0m.a(imageView2, kt7Var);
                        rx4 rx4VarV1 = cropPhotoScreen.v1();
                        rx4VarV1.I(cropPhotoScreen.t1().z());
                        rx4VarV1.v = a8j.t(rx4VarV1, ((n0c) rx4VarV1.E()).a(), new qx4(rx4VarV1, null, 2), 2);
                        rx4VarV1.H();
                        a8j.x(rx4VarV1.j, kw4.a);
                        break;
                    case 1:
                        CropPhotoScreen.o1(imageView2);
                        p0m.a(imageView2, kt7Var);
                        rx4 rx4VarV2 = cropPhotoScreen.v1();
                        rx4VarV2.H();
                        a8j.x(rx4VarV2.j, nw4.a);
                        break;
                    default:
                        CropPhotoScreen.o1(imageView2);
                        p0m.a(imageView2, kt7Var);
                        rx4 rx4VarV3 = cropPhotoScreen.v1();
                        rx4VarV3.I(cropPhotoScreen.t1().z());
                        ic6 ic6Var = rx4VarV3.j;
                        jx4 jx4Var = rx4VarV3.c;
                        jx4 jx4Var2 = jx4.b;
                        float f = jx4Var == jx4Var2 ? rx4VarV3.x : 0.0f;
                        if (f != 0.0f) {
                            float f2 = -f;
                            rx4VarV3.x = f2;
                            if (jx4Var == jx4Var2) {
                                a8j.x(ic6Var, new lw4(f2));
                            }
                        }
                        rx4VarV3.v = a8j.t(rx4VarV3, ((n0c) rx4VarV3.E()).a(), new qx4(rx4VarV3, null, 0), 2);
                        rx4VarV3.H();
                        a8j.x(ic6Var, gw4.a);
                        break;
                }
            }
        });
        linearLayout.addView(imageView);
        final int i3 = 1;
        if (v1().c == jx4.b) {
            final ImageView imageView2 = new ImageView(linearLayout.getContext());
            imageView2.setId(R.id.media_editor_aspect_ratio_id);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
            int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
            layoutParams5.setMargins(iK2, iK2, iK2, iK2);
            imageView2.setLayoutParams(layoutParams5);
            imageView2.setImageResource(R.drawable.icon_ratio_animated);
            imageView2.setScaleType(scaleType);
            u1();
            imageView2.setImageTintList(ColorStateList.valueOf(-1));
            o1(imageView2);
            qe7.H(imageView2, 300L, new View.OnClickListener(this) { // from class: cx4
                public final /* synthetic */ CropPhotoScreen b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i4 = i3;
                    kt7 kt7Var = kt7.CLOCK_TICK;
                    ImageView imageView3 = imageView2;
                    CropPhotoScreen cropPhotoScreen = this.b;
                    switch (i4) {
                        case 0:
                            CropPhotoScreen.o1(imageView3);
                            p0m.a(imageView3, kt7Var);
                            rx4 rx4VarV1 = cropPhotoScreen.v1();
                            rx4VarV1.I(cropPhotoScreen.t1().z());
                            rx4VarV1.v = a8j.t(rx4VarV1, ((n0c) rx4VarV1.E()).a(), new qx4(rx4VarV1, null, 2), 2);
                            rx4VarV1.H();
                            a8j.x(rx4VarV1.j, kw4.a);
                            break;
                        case 1:
                            CropPhotoScreen.o1(imageView3);
                            p0m.a(imageView3, kt7Var);
                            rx4 rx4VarV2 = cropPhotoScreen.v1();
                            rx4VarV2.H();
                            a8j.x(rx4VarV2.j, nw4.a);
                            break;
                        default:
                            CropPhotoScreen.o1(imageView3);
                            p0m.a(imageView3, kt7Var);
                            rx4 rx4VarV3 = cropPhotoScreen.v1();
                            rx4VarV3.I(cropPhotoScreen.t1().z());
                            ic6 ic6Var = rx4VarV3.j;
                            jx4 jx4Var = rx4VarV3.c;
                            jx4 jx4Var2 = jx4.b;
                            float f = jx4Var == jx4Var2 ? rx4VarV3.x : 0.0f;
                            if (f != 0.0f) {
                                float f2 = -f;
                                rx4VarV3.x = f2;
                                if (jx4Var == jx4Var2) {
                                    a8j.x(ic6Var, new lw4(f2));
                                }
                            }
                            rx4VarV3.v = a8j.t(rx4VarV3, ((n0c) rx4VarV3.E()).a(), new qx4(rx4VarV3, null, 0), 2);
                            rx4VarV3.H();
                            a8j.x(ic6Var, gw4.a);
                            break;
                    }
                }
            });
            linearLayout.addView(imageView2);
        }
        final ImageView imageView3 = new ImageView(linearLayout.getContext());
        imageView3.setId(R.id.media_editor_flip_horizontally_id);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
        int iK3 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        layoutParams6.setMargins(iK3, iK3, iK3, iK3);
        imageView3.setLayoutParams(layoutParams6);
        imageView3.setImageResource(R.drawable.icon_mirror_animated);
        imageView3.setScaleType(scaleType);
        u1();
        imageView3.setImageTintList(ColorStateList.valueOf(-1));
        o1(imageView3);
        qe7.H(imageView3, 300L, new View.OnClickListener(this) { // from class: cx4
            public final /* synthetic */ CropPhotoScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i2;
                kt7 kt7Var = kt7.CLOCK_TICK;
                ImageView imageView4 = imageView3;
                CropPhotoScreen cropPhotoScreen = this.b;
                switch (i4) {
                    case 0:
                        CropPhotoScreen.o1(imageView4);
                        p0m.a(imageView4, kt7Var);
                        rx4 rx4VarV1 = cropPhotoScreen.v1();
                        rx4VarV1.I(cropPhotoScreen.t1().z());
                        rx4VarV1.v = a8j.t(rx4VarV1, ((n0c) rx4VarV1.E()).a(), new qx4(rx4VarV1, null, 2), 2);
                        rx4VarV1.H();
                        a8j.x(rx4VarV1.j, kw4.a);
                        break;
                    case 1:
                        CropPhotoScreen.o1(imageView4);
                        p0m.a(imageView4, kt7Var);
                        rx4 rx4VarV2 = cropPhotoScreen.v1();
                        rx4VarV2.H();
                        a8j.x(rx4VarV2.j, nw4.a);
                        break;
                    default:
                        CropPhotoScreen.o1(imageView4);
                        p0m.a(imageView4, kt7Var);
                        rx4 rx4VarV3 = cropPhotoScreen.v1();
                        rx4VarV3.I(cropPhotoScreen.t1().z());
                        ic6 ic6Var = rx4VarV3.j;
                        jx4 jx4Var = rx4VarV3.c;
                        jx4 jx4Var2 = jx4.b;
                        float f = jx4Var == jx4Var2 ? rx4VarV3.x : 0.0f;
                        if (f != 0.0f) {
                            float f2 = -f;
                            rx4VarV3.x = f2;
                            if (jx4Var == jx4Var2) {
                                a8j.x(ic6Var, new lw4(f2));
                            }
                        }
                        rx4VarV3.v = a8j.t(rx4VarV3, ((n0c) rx4VarV3.E()).a(), new qx4(rx4VarV3, null, 0), 2);
                        rx4VarV3.H();
                        a8j.x(ic6Var, gw4.a);
                        break;
                }
            }
        });
        linearLayout.addView(imageView3);
        frameLayout.addView(linearLayout);
        dr3 dr3Var = new dr3(frameLayout.getContext());
        dr3Var.setId(R.id.media_editor_close_id);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 38.0f), gm0.K(yl5.d().getDisplayMetrics().density * 38.0f));
        int iK4 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        float f = this.n;
        layoutParams7.setMargins(iK4, ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin, gm0.K(yl5.d().getDisplayMetrics().density * f));
        layoutParams7.gravity = 8388691;
        dr3Var.setLayoutParams(layoutParams7);
        dr3Var.setStrokeEnabled(true);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        dr3Var.setScaleType(scaleType2);
        dr3Var.setImageResource(R.drawable.icon_cross);
        u1();
        dr3Var.setImageTintList(ColorStateList.valueOf(-1));
        u1();
        dr3Var.setStrokeColor(-1);
        qe7.H(dr3Var, 300L, new View.OnClickListener(this) { // from class: ax4
            public final /* synthetic */ CropPhotoScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i;
                CropPhotoScreen cropPhotoScreen = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = CropPhotoScreen.p;
                        rx4 rx4VarV1 = cropPhotoScreen.v1();
                        if (!((Boolean) rx4VarV1.z.getValue()).booleanValue()) {
                            a8j.x(rx4VarV1.j, ow4.a);
                        } else {
                            a8j.x(rx4VarV1.i, rt3.b);
                        }
                        break;
                    default:
                        zv8[] zv8VarArr2 = CropPhotoScreen.p;
                        cropPhotoScreen.v1().H();
                        mx4 mx4VarT1 = cropPhotoScreen.t1();
                        ux4 ux4Var = new ux4(mx4VarT1.getImageTransformValues(), mx4VarT1.getDrawableCropRect(), mx4VarT1.getImageBounds());
                        rx4 rx4VarV2 = cropPhotoScreen.v1();
                        nv4 nv4Var = new nv4(1, cropPhotoScreen);
                        rx4VarV2.t.B(rx4VarV2, rx4.C[0], yab.h0(rx4VarV2.b, ((n0c) rx4VarV2.E()).b(), 2, new vk4(5, (lq4) null, (Object) rx4VarV2, (Object) ux4Var, (Object) nv4Var, false)));
                        break;
                }
            }
        });
        frameLayout.addView(dr3Var);
        dr3 dr3Var2 = new dr3(frameLayout.getContext());
        dr3Var2.setId(R.id.media_editor_done_id);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 38.0f), gm0.K(38.0f * yl5.d().getDisplayMetrics().density));
        layoutParams8.setMargins(((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin, gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(f * yl5.d().getDisplayMetrics().density));
        layoutParams8.gravity = 8388693;
        dr3Var2.setLayoutParams(layoutParams8);
        dr3Var2.setStrokeEnabled(false);
        dr3Var2.setScaleType(scaleType2);
        dr3Var2.setImageResource(R.drawable.icon_check);
        u1();
        dr3Var2.setImageTintList(ColorStateList.valueOf(-1));
        dr3Var2.setInnerColor(u1().h().a);
        qe7.H(dr3Var2, 300L, new View.OnClickListener(this) { // from class: ax4
            public final /* synthetic */ CropPhotoScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i3;
                CropPhotoScreen cropPhotoScreen = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = CropPhotoScreen.p;
                        rx4 rx4VarV1 = cropPhotoScreen.v1();
                        if (!((Boolean) rx4VarV1.z.getValue()).booleanValue()) {
                            a8j.x(rx4VarV1.j, ow4.a);
                        } else {
                            a8j.x(rx4VarV1.i, rt3.b);
                        }
                        break;
                    default:
                        zv8[] zv8VarArr2 = CropPhotoScreen.p;
                        cropPhotoScreen.v1().H();
                        mx4 mx4VarT1 = cropPhotoScreen.t1();
                        ux4 ux4Var = new ux4(mx4VarT1.getImageTransformValues(), mx4VarT1.getDrawableCropRect(), mx4VarT1.getImageBounds());
                        rx4 rx4VarV2 = cropPhotoScreen.v1();
                        nv4 nv4Var = new nv4(1, cropPhotoScreen);
                        rx4VarV2.t.B(rx4VarV2, rx4.C[0], yab.h0(rx4VarV2.b, ((n0c) rx4VarV2.E()).b(), 2, new vk4(5, (lq4) null, (Object) rx4VarV2, (Object) ux4Var, (Object) nv4Var, false)));
                        break;
                }
            }
        });
        frameLayout.addView(dr3Var2);
    }

    public final z0c s1() {
        return (z0c) this.j.m(this, p[3]);
    }

    public final mx4 t1() {
        return (mx4) this.i.m(this, p[2]);
    }

    public final kbc u1() {
        return pq3.j.e(getContext()).j().b;
    }

    public final rx4 v1() {
        return (rx4) this.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        gx4 gx4Var;
        boolean zBooleanValue;
        if (lq4Var instanceof gx4) {
            gx4Var = (gx4) lq4Var;
            int i = gx4Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gx4Var.f = i - Integer.MIN_VALUE;
            } else {
                gx4Var = new gx4(this, (nq4) lq4Var);
            }
        } else {
            gx4Var = new gx4(this, (nq4) lq4Var);
        }
        Object objZ = gx4Var.d;
        int i2 = gx4Var.f;
        Object obj = null;
        if (i2 == 0) {
            ch3.d0(objZ);
            hve router = getRouter();
            zv zvVar = new zv();
            zvVar.addLast(router);
            loop0: while (!zvVar.isEmpty()) {
                ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
                for (int iO0 = xw3.O0(arrayListE); -1 < iO0; iO0--) {
                    br4 br4Var = ((lve) arrayListE.get(iO0)).a;
                    if (br4Var instanceof yw4) {
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
            yw4 yw4Var = (yw4) obj;
            if (yw4Var != null) {
                gx4Var.f = 1;
                objZ = yw4Var.Z(gx4Var);
                hu4 hu4Var = hu4.a;
                if (objZ == hu4Var) {
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
        ch3.d0(objZ);
        zBooleanValue = ((Boolean) objZ).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public CropPhotoScreen(String str, jx4 jx4Var, ha9 ha9Var, boolean z, y3f y3fVar) {
        this(n1g.i(new ylc("uri", str), new ylc("mode", jx4Var), new ylc("stories_mode", Boolean.valueOf(z)), new ylc("screen", y3fVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }

    public /* synthetic */ CropPhotoScreen(String str, jx4 jx4Var, ha9 ha9Var, boolean z, y3f y3fVar, int i, j95 j95Var) {
        this(str, jx4Var, ha9Var, (i & 8) != 0 ? false : z, (i & 16) != 0 ? y3f.AVATAR_PICKER_CROP : y3fVar);
    }
}
