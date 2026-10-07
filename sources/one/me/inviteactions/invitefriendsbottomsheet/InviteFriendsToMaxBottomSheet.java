package one.me.inviteactions.invitefriendsbottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.a0e;
import defpackage.bsb;
import defpackage.ch3;
import defpackage.ch8;
import defpackage.eg4;
import defpackage.et3;
import defpackage.fyb;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.kbc;
import defpackage.mm8;
import defpackage.mp5;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o37;
import defpackage.om8;
import defpackage.p3c;
import defpackage.pm8;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.qyj;
import defpackage.s7f;
import defpackage.vo8;
import defpackage.vv;
import defpackage.wf4;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/inviteactions/invitefriendsbottomsheet/InviteFriendsToMaxBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "invite-actions"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InviteFriendsToMaxBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] D = {new z8b(InviteFriendsToMaxBottomSheet.class, "inviteFriendsJob", "getInviteFriendsJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, InviteFriendsToMaxBottomSheet.class, "currentAnimationTheme", "getCurrentAnimationTheme()Ljava/lang/String;")};
    public final ny8 A;
    public final p3c B;
    public final vv C;
    public final h u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public final ny8 y;
    public final int z;

    public InviteFriendsToMaxBottomSheet(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.u = hVar;
        this.v = hVar.getAccessor().d(85);
        this.w = hVar.getAccessor().d(97);
        this.x = hVar.getAccessor().d(769);
        this.y = hVar.getAccessor().d(177);
        this.z = 1;
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(mm8.class, new ch8(3, new mp5(27, this)));
        this.A = ny8VarCreateViewModelLazy;
        this.B = qyj.S();
        this.C = new vv("current_animation_theme", String.class);
        ((mm8) ny8VarCreateViewModelLazy.getValue()).getClass();
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        wf4 pm8Var = new pm8(this, getContext());
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        rLottieImageView.setId(R.id.oneme_invite_friends_to_max_bottom_sheet_image_stack);
        rLottieImageView.setAnimation(R.raw.invite_friends, gm0.K(yl5.d().getDisplayMetrics().density * 248.0f), gm0.K(yl5.d().getDisplayMetrics().density * 80.0f));
        F1(rLottieImageView, false);
        rLottieImageView.playAnimation();
        pm8Var.addView(rLottieImageView, gm0.K(248.0f * yl5.d().getDisplayMetrics().density), gm0.K(80.0f * yl5.d().getDisplayMetrics().density));
        TextView textView = new TextView(getContext());
        textView.setId(R.id.oneme_invite_friends_to_max_bottom_sheet_title);
        textView.setGravity(17);
        q9i.a(q9i.c, textView);
        textView.setTextColor(pq3.j.h(textView).getText().b);
        textView.setText(R.string.oneme_invite_friends_to_max_bottom_sheet_title);
        pm8Var.addView(textView, -2, -2);
        fyb fybVar = new fyb(getContext());
        fybVar.setId(R.id.oneme_invite_friends_to_max_bottom_sheet_invite_button);
        fybVar.setText(R.string.oneme_invite);
        qe7.H(fybVar, 300L, new o37(14, this));
        pm8Var.addView(fybVar, 0, -2);
        n1g.N(new om8(textView, this, rLottieImageView, null, 0), pm8Var);
        eg4 eg4VarH = ch3.h(pm8Var);
        int id = rLottieImageView.getId();
        eg4VarH.d(id, 3, 0, 3);
        qt4.w(44.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id));
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = textView.getId();
        eg4VarH.d(id2, 3, rLottieImageView.getId(), 4);
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 7, 0, 7);
        int id3 = fybVar.getId();
        eg4VarH.d(id3, 3, textView.getId(), 4);
        qt4.w(48.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, 0, 7);
        eg4VarH.d(id3, 4, 0, 4);
        new bsb(4, eg4VarH, id3).a(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(pm8Var);
        return pm8Var;
    }

    public final void F1(RLottieImageView rLottieImageView, boolean z) {
        kbc kbcVarM = pq3.j.e(getContext()).m();
        String name = kbcVarM.getName();
        zv8 zv8Var = D[1];
        this.C.b(this, name);
        RLottieDrawable animatedDrawable = rLottieImageView.getAnimatedDrawable();
        if (z) {
            animatedDrawable.setCurrentFrame(animatedDrawable.getFramesCount() - 1);
        }
        animatedDrawable.beginApplyLayerColors();
        animatedDrawable.setLayerColor("**.Fill 1", kbcVarM.b().f);
        animatedDrawable.commitApplyLayerColors();
    }

    public final a0e G1() {
        return new a0e(((s7f) ((et3) this.v.getValue())).t());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        vo8 vo8Var = (vo8) this.B.m(this, D[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }

    public InviteFriendsToMaxBottomSheet(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
