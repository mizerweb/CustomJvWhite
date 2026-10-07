package one.me.inviteactions.invitebyqr;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.a0e;
import defpackage.ayb;
import defpackage.b0e;
import defpackage.ch8;
import defpackage.cs;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.et3;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h;
import defpackage.ifh;
import defpackage.im8;
import defpackage.j11;
import defpackage.j8e;
import defpackage.jz;
import defpackage.km8;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.mm8;
import defpackage.mt5;
import defpackage.n1g;
import defpackage.np4;
import defpackage.nvh;
import defpackage.ny8;
import defpackage.o24;
import defpackage.o37;
import defpackage.oi8;
import defpackage.p3c;
import defpackage.pa4;
import defpackage.qe7;
import defpackage.ql1;
import defpackage.qyj;
import defpackage.rx8;
import defpackage.s7f;
import defpackage.vo8;
import defpackage.vv;
import defpackage.yl5;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zu;
import defpackage.zv8;
import defpackage.zxb;
import defpackage.zzd;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/inviteactions/invitebyqr/InviteByQrBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "invite-actions"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InviteByQrBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] H = {new dwd(InviteByQrBottomSheet.class, "qrCodeHeight", "getQrCodeHeight()I", 0), zo5.f(zfe.a, InviteByQrBottomSheet.class, "qrCodeImageView", "getQrCodeImageView()Landroidx/appcompat/widget/AppCompatImageView;", 0), new dwd(InviteByQrBottomSheet.class, "shareButton", "getShareButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new z8b(InviteByQrBottomSheet.class, "shareQrCodeJob", "getShareQrCodeJob()Lkotlinx/coroutines/Job;")};
    public final ny8 A;
    public final Context B;
    public final ny8 C;
    public final p3c D;
    public final ifh E;
    public final oi8 F;
    public final int G;
    public final h u;
    public final oi8 v;
    public final vv w;
    public final j8e x;
    public final ny8 y;
    public final ny8 z;

    public InviteByQrBottomSheet(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.u = hVar;
        this.v = oi8.e;
        this.w = new vv("height", Integer.class);
        this.x = viewBinding(R.id.oneme_invite_by_qr_bottom_sheet_qr_code);
        viewBinding(R.id.oneme_invite_by_qr_bottom_sheet_qr_code_share);
        this.y = rx8.P(3, new im8(this, 0));
        this.z = hVar.getAccessor().d(85);
        this.A = hVar.getAccessor().d(769);
        pa4 pa4Var = (pa4) hVar.getAccessor().c(738);
        this.B = (Context) hVar.getAccessor().c(7);
        int i = 2;
        this.C = createViewModelLazy(mm8.class, new ch8(i, new im8(this, 1)));
        pa4Var.a(pa4.d, new ql1(i, this));
        this.D = qyj.S();
        this.E = new ifh(new im8(this, 2));
        int i2 = 5;
        this.F = new oi8(i2, 0, i2, null, 10);
        this.G = 1;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return new FrameLayout(getContext());
    }

    public final b0e F1() {
        long j = getArgs().getLong("id");
        String string = getArgs().getString("type");
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != 3052376) {
                if (iHashCode == 951526432 && string.equals("contact")) {
                    return new a0e(j);
                }
            } else if (string.equals("chat")) {
                return new zzd(j);
            }
        }
        return new a0e(((s7f) ((et3) this.z.getValue())).t());
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getF() {
        return this.F;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getOrientation, reason: from getter */
    public final int getG() {
        return this.G;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final FrameLayout o1(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.oneme_bottom_sheet_popup_card);
        zv8 zv8Var = H[0];
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, zo5.D(78.0f, yl5.d().getDisplayMetrics().density, ((Number) this.w.a(this)).intValue())));
        frameLayout.setClipToPadding(false);
        frameLayout.setOutlineProvider(new nvh(yl5.d().getDisplayMetrics().density * 20.0f));
        cs csVar = new cs(frameLayout.getContext());
        csVar.setId(R.id.oneme_invite_by_qr_bottom_sheet_qr_code);
        csVar.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(csVar);
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        layoutParams.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        frameLayout2.setLayoutParams(layoutParams);
        lvb.H(frameLayout2, new oi8(0, 0, 0, new j11(3, 3, false), 7), null);
        cyb cybVar = new cyb(frameLayout2.getContext());
        cybVar.setId(R.id.oneme_invite_by_qr_bottom_sheet_qr_code_share);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_action_share));
        qe7.H(cybVar, 300L, new o37(13, this));
        frameLayout2.addView(cybVar);
        frameLayout.addView(frameLayout2);
        View mt5Var = new mt5(frameLayout.getContext());
        mt5Var.setTranslationY(gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        frameLayout.addView(mt5Var);
        n1g.N(new zu(this, (lq4) null, 9), frameLayout);
        return frameLayout;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onAttach(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        super.onAttach(view);
        Activity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.screenBrightness = 1.0f;
        Window window2 = activity.getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        vo8 vo8Var = (vo8) this.D.m(this, H[3]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        super.onDetach(view);
        Activity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.screenBrightness = -1.0f;
        Window window2 = activity.getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e9i.j0(new fz6(new o24(new jz(((mm8) this.C.getValue()).i, 13), 9, this), new km8(this, null, 0), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* JADX INFO: renamed from: r1, reason: from getter */
    public final oi8 getV() {
        return this.v;
    }
}
