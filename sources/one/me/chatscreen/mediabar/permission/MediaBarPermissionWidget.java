package one.me.chatscreen.mediabar.permission;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.af7;
import defpackage.bh9;
import defpackage.ch8;
import defpackage.dwd;
import defpackage.er9;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hj2;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oc2;
import defpackage.ow0;
import defpackage.svj;
import defpackage.wsc;
import defpackage.ylc;
import defpackage.ysc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chatscreen/mediabar/permission/MediaBarPermissionWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "chat-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaBarPermissionWidget extends Widget {
    public static final /* synthetic */ zv8[] g = {new dwd(MediaBarPermissionWidget.class, "noCameraPermissionContent", "getNoCameraPermissionContent()Landroid/widget/LinearLayout;", 0), zo5.f(zfe.a, MediaBarPermissionWidget.class, "cameraContent", "getCameraContent()Landroid/widget/FrameLayout;", 0), new dwd(MediaBarPermissionWidget.class, "permissionContent", "getPermissionContent()Landroid/widget/LinearLayout;", 0)};
    public final ny8 a;
    public final ny8 b;
    public final ow0 c;
    public final ow0 d;
    public final ow0 e;
    public final ow0 f;

    public MediaBarPermissionWidget(Bundle bundle) {
        super(bundle);
        this.a = ysc.a.a();
        this.b = createViewModelLazy(er9.class, new ch8(11, new bh9(15)));
        final int i = 0;
        this.c = binding(new af7(this) { // from class: fr9
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                lq4 lq4Var = null;
                int i3 = 1;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = MediaBarPermissionWidget.g;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableMutate = linearLayout.getContext().getDrawable(R.drawable.ic_camera_add_36).mutate();
                        cs csVar = new cs(linearLayout.getContext());
                        csVar.setImageDrawable(drawableMutate);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext());
                        appCompatTextView.setText(R.string.media_type_picker__permissions_dialog__camera_permission);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), gm0.K(10.0f * yl5.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        q9i.a(q9i.q, appCompatTextView);
                        n1g.N(new d3(drawableMutate, appCompatTextView, lq4Var, 20), linearLayout);
                        linearLayout.addView(csVar);
                        linearLayout.addView(appCompatTextView);
                        qe7.H(linearLayout, 300L, new gr9(mediaBarPermissionWidget, i3));
                        return linearLayout;
                    case 1:
                        zv8[] zv8VarArr2 = MediaBarPermissionWidget.g;
                        hj2 hj2Var = new hj2(mediaBarPermissionWidget.getContext());
                        hj2Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        hj2Var.d();
                        return hj2Var;
                    case 2:
                        zv8[] zv8VarArr3 = MediaBarPermissionWidget.g;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, gm0.K(138.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        n1g.N(new ud9(gradientDrawable, lq4Var, 27), frameLayout);
                        mmc.d(new fz6(((er9) mediaBarPermissionWidget.b.getValue()).d, new wo0(mediaBarPermissionWidget, frameLayout, lq4Var, 6), 3), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        zv8[] zv8VarArr4 = MediaBarPermissionWidget.g;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, gm0.K(166.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams3.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(0.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext());
                        appCompatTextView2.setText(R.string.media_type_picker__permissions_dialog__title);
                        q9i.a(q9i.i, appCompatTextView2);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext());
                        appCompatTextView3.setText(R.string.media_type_picker__permissions_dialog__subtitle);
                        q9i.a(q9i.k, appCompatTextView3);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        cyb cybVar = new cyb(linearLayout2.getContext());
                        cybVar.setText(np4.q(cybVar.getContext(), R.string.media_type_picker__permissions_dialog__button));
                        cybVar.setSize(ayb.j);
                        cybVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        qe7.H(cybVar, 300L, new gr9(mediaBarPermissionWidget, 0));
                        n1g.N(new d3(appCompatTextView2, appCompatTextView3, lq4Var, 21), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(cybVar);
                        return linearLayout2;
                }
            }
        });
        final int i2 = 1;
        this.d = binding(new af7(this) { // from class: fr9
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                lq4 lq4Var = null;
                int i4 = 1;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = MediaBarPermissionWidget.g;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableMutate = linearLayout.getContext().getDrawable(R.drawable.ic_camera_add_36).mutate();
                        cs csVar = new cs(linearLayout.getContext());
                        csVar.setImageDrawable(drawableMutate);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext());
                        appCompatTextView.setText(R.string.media_type_picker__permissions_dialog__camera_permission);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), gm0.K(10.0f * yl5.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        q9i.a(q9i.q, appCompatTextView);
                        n1g.N(new d3(drawableMutate, appCompatTextView, lq4Var, 20), linearLayout);
                        linearLayout.addView(csVar);
                        linearLayout.addView(appCompatTextView);
                        qe7.H(linearLayout, 300L, new gr9(mediaBarPermissionWidget, i4));
                        return linearLayout;
                    case 1:
                        zv8[] zv8VarArr2 = MediaBarPermissionWidget.g;
                        hj2 hj2Var = new hj2(mediaBarPermissionWidget.getContext());
                        hj2Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        hj2Var.d();
                        return hj2Var;
                    case 2:
                        zv8[] zv8VarArr3 = MediaBarPermissionWidget.g;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, gm0.K(138.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        n1g.N(new ud9(gradientDrawable, lq4Var, 27), frameLayout);
                        mmc.d(new fz6(((er9) mediaBarPermissionWidget.b.getValue()).d, new wo0(mediaBarPermissionWidget, frameLayout, lq4Var, 6), 3), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        zv8[] zv8VarArr4 = MediaBarPermissionWidget.g;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, gm0.K(166.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams3.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(0.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext());
                        appCompatTextView2.setText(R.string.media_type_picker__permissions_dialog__title);
                        q9i.a(q9i.i, appCompatTextView2);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext());
                        appCompatTextView3.setText(R.string.media_type_picker__permissions_dialog__subtitle);
                        q9i.a(q9i.k, appCompatTextView3);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        cyb cybVar = new cyb(linearLayout2.getContext());
                        cybVar.setText(np4.q(cybVar.getContext(), R.string.media_type_picker__permissions_dialog__button));
                        cybVar.setSize(ayb.j);
                        cybVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        qe7.H(cybVar, 300L, new gr9(mediaBarPermissionWidget, 0));
                        n1g.N(new d3(appCompatTextView2, appCompatTextView3, lq4Var, 21), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(cybVar);
                        return linearLayout2;
                }
            }
        });
        final int i3 = 2;
        this.e = binding(new af7(this) { // from class: fr9
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                lq4 lq4Var = null;
                int i5 = 1;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = MediaBarPermissionWidget.g;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableMutate = linearLayout.getContext().getDrawable(R.drawable.ic_camera_add_36).mutate();
                        cs csVar = new cs(linearLayout.getContext());
                        csVar.setImageDrawable(drawableMutate);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext());
                        appCompatTextView.setText(R.string.media_type_picker__permissions_dialog__camera_permission);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), gm0.K(10.0f * yl5.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        q9i.a(q9i.q, appCompatTextView);
                        n1g.N(new d3(drawableMutate, appCompatTextView, lq4Var, 20), linearLayout);
                        linearLayout.addView(csVar);
                        linearLayout.addView(appCompatTextView);
                        qe7.H(linearLayout, 300L, new gr9(mediaBarPermissionWidget, i5));
                        return linearLayout;
                    case 1:
                        zv8[] zv8VarArr2 = MediaBarPermissionWidget.g;
                        hj2 hj2Var = new hj2(mediaBarPermissionWidget.getContext());
                        hj2Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        hj2Var.d();
                        return hj2Var;
                    case 2:
                        zv8[] zv8VarArr3 = MediaBarPermissionWidget.g;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, gm0.K(138.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        n1g.N(new ud9(gradientDrawable, lq4Var, 27), frameLayout);
                        mmc.d(new fz6(((er9) mediaBarPermissionWidget.b.getValue()).d, new wo0(mediaBarPermissionWidget, frameLayout, lq4Var, 6), 3), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        zv8[] zv8VarArr4 = MediaBarPermissionWidget.g;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, gm0.K(166.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams3.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(0.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext());
                        appCompatTextView2.setText(R.string.media_type_picker__permissions_dialog__title);
                        q9i.a(q9i.i, appCompatTextView2);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext());
                        appCompatTextView3.setText(R.string.media_type_picker__permissions_dialog__subtitle);
                        q9i.a(q9i.k, appCompatTextView3);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        cyb cybVar = new cyb(linearLayout2.getContext());
                        cybVar.setText(np4.q(cybVar.getContext(), R.string.media_type_picker__permissions_dialog__button));
                        cybVar.setSize(ayb.j);
                        cybVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        qe7.H(cybVar, 300L, new gr9(mediaBarPermissionWidget, 0));
                        n1g.N(new d3(appCompatTextView2, appCompatTextView3, lq4Var, 21), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(cybVar);
                        return linearLayout2;
                }
            }
        });
        final int i4 = 3;
        this.f = binding(new af7(this) { // from class: fr9
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                lq4 lq4Var = null;
                int i6 = 1;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = MediaBarPermissionWidget.g;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableMutate = linearLayout.getContext().getDrawable(R.drawable.ic_camera_add_36).mutate();
                        cs csVar = new cs(linearLayout.getContext());
                        csVar.setImageDrawable(drawableMutate);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext());
                        appCompatTextView.setText(R.string.media_type_picker__permissions_dialog__camera_permission);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), gm0.K(10.0f * yl5.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        q9i.a(q9i.q, appCompatTextView);
                        n1g.N(new d3(drawableMutate, appCompatTextView, lq4Var, 20), linearLayout);
                        linearLayout.addView(csVar);
                        linearLayout.addView(appCompatTextView);
                        qe7.H(linearLayout, 300L, new gr9(mediaBarPermissionWidget, i6));
                        return linearLayout;
                    case 1:
                        zv8[] zv8VarArr2 = MediaBarPermissionWidget.g;
                        hj2 hj2Var = new hj2(mediaBarPermissionWidget.getContext());
                        hj2Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        hj2Var.d();
                        return hj2Var;
                    case 2:
                        zv8[] zv8VarArr3 = MediaBarPermissionWidget.g;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, gm0.K(138.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        n1g.N(new ud9(gradientDrawable, lq4Var, 27), frameLayout);
                        mmc.d(new fz6(((er9) mediaBarPermissionWidget.b.getValue()).d, new wo0(mediaBarPermissionWidget, frameLayout, lq4Var, 6), 3), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        zv8[] zv8VarArr4 = MediaBarPermissionWidget.g;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, gm0.K(166.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams3.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(0.0f * yl5.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext());
                        appCompatTextView2.setText(R.string.media_type_picker__permissions_dialog__title);
                        q9i.a(q9i.i, appCompatTextView2);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext());
                        appCompatTextView3.setText(R.string.media_type_picker__permissions_dialog__subtitle);
                        q9i.a(q9i.k, appCompatTextView3);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        cyb cybVar = new cyb(linearLayout2.getContext());
                        cybVar.setText(np4.q(cybVar.getContext(), R.string.media_type_picker__permissions_dialog__button));
                        cybVar.setSize(ayb.j);
                        cybVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        qe7.H(cybVar, 300L, new gr9(mediaBarPermissionWidget, 0));
                        n1g.N(new d3(appCompatTextView2, appCompatTextView3, lq4Var, 21), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(cybVar);
                        return linearLayout2;
                }
            }
        });
    }

    public final void o1() {
        ny8 ny8Var = this.a;
        if (((wsc) ny8Var.getValue()).c(wsc.n)) {
            ((wsc) ny8Var.getValue()).o(new svj(this, 1));
        } else {
            ((wsc) ny8Var.getValue()).m(new svj(this, 1), wsc.p, 162);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        ((er9) this.b.getValue()).c.e();
        super.onActivityResumed(activity);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        zv8[] zv8VarArr = g;
        zv8 zv8Var = zv8VarArr[1];
        linearLayout.addView((FrameLayout) this.e.getValue());
        zv8 zv8Var2 = zv8VarArr[2];
        linearLayout.addView((LinearLayout) this.f.getValue());
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ow0 ow0Var = this.d;
        if (ow0Var.d()) {
            hj2 hj2Var = (hj2) ((oc2) ow0Var.getValue());
            hj2Var.getClass();
            gm0.n(hj2.class.getName(), "destroyCamera");
            hj2Var.j = false;
            hj2Var.h = false;
            hj2Var.c.x();
            hj2Var.d.a();
        }
        super.onDestroyView(view);
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ny8 ny8Var = this.a;
        int i2 = 0;
        if (i != 157) {
            if (i != 162) {
                return;
            }
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] != -1) {
                    return;
                } else {
                    i2++;
                }
            }
            wsc.v((wsc) ny8Var.getValue(), new svj(this, 1), strArr, iArr, wsc.p, R.string.media_type_picker__permissions_dialog__gallery_camera_title, R.string.media_type_picker__permissions_dialog__gallery_camera_subtitle, 192);
            return;
        }
        int length2 = iArr.length;
        while (i2 < length2) {
            if (iArr[i2] != -1) {
                return;
            } else {
                i2++;
            }
        }
        wsc wscVar = (wsc) ny8Var.getValue();
        svj svjVar = new svj(this, 1);
        wscVar.getClass();
        wsc.t(svjVar, strArr, iArr, R.string.media_type_picker__permissions_dialog__gallery_title, R.string.media_type_picker__permissions_dialog__gallery_subtitle);
    }

    public MediaBarPermissionWidget(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
