package one.me.calls.ui.bottomsheet.raisehand;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.bsb;
import defpackage.ch3;
import defpackage.cyb;
import defpackage.d4e;
import defpackage.dtd;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.fu1;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.j8e;
import defpackage.k9d;
import defpackage.kbc;
import defpackage.lq4;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.sx1;
import defpackage.t3f;
import defpackage.wf4;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/raisehand/RaiseHandActionBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Lfu1;", "opponentId", "(Lt3f;Lfu1;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RaiseHandActionBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] y = {new dwd(RaiseHandActionBottomSheet.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), zo5.f(zfe.a, RaiseHandActionBottomSheet.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), new dwd(RaiseHandActionBottomSheet.class, "positiveBtn", "getPositiveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(RaiseHandActionBottomSheet.class, "negativeBtn", "getNegativeBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final sx1 u;
    public final ny8 v;
    public final j8e w;
    public final j8e x;

    public RaiseHandActionBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new sx1(m35getAccountScopeuqN4xOY());
        this.v = createViewModelLazy(d4e.class, new ztd(3, new k9d(this, 19, bundle)));
        this.w = viewBinding(R.id.call_screen_raisehand_manage_title);
        this.x = viewBinding(R.id.call_screen_raisehand_manage_subtitle);
        viewBinding(R.id.call_screen_raisehand_manage_positive_btn);
        viewBinding(R.id.call_screen_raisehand_manage_negative_btn);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        wf4 wf4Var = new wf4(layoutInflater.getContext());
        TextView textView = new TextView(wf4Var.getContext());
        textView.setId(R.id.call_screen_raisehand_manage_title);
        q9i.a(q9i.c, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.l(textView).b.getText().b);
        textView.setGravity(17);
        final int i = 0;
        textView.setPadding(0, gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), 0, 0);
        TextView textView2 = new TextView(wf4Var.getContext());
        textView2.setId(R.id.call_screen_raisehand_manage_subtitle);
        q9i.a(q9i.i, textView2);
        textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
        textView2.setGravity(17);
        cyb cybVar = new cyb(wf4Var.getContext());
        cybVar.setId(R.id.call_screen_raisehand_manage_negative_btn);
        cybVar.setAppearance(zxb.SECONDARY);
        ayb aybVar = ayb.g;
        cybVar.setSize(aybVar);
        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.call_screen_raisehand_manage_negative_btn));
        qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: c4e
            public final /* synthetic */ RaiseHandActionBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = RaiseHandActionBottomSheet.y;
                        raiseHandActionBottomSheet.v1(true);
                        break;
                    default:
                        zv8[] zv8VarArr2 = RaiseHandActionBottomSheet.y;
                        d4e d4eVar = (d4e) raiseHandActionBottomSheet.v.getValue();
                        fu1 fu1Var = d4eVar.c;
                        w82 w82Var = d4eVar.d;
                        boolean zD = cqk.d(fu1Var, w82Var.b().a.getId());
                        da1 da1Var = w82Var.h;
                        if (zD) {
                            ((ya1) da1Var).p(false);
                        } else {
                            ya1 ya1Var = (ya1) da1Var;
                            ParticipantStatesManager participantStatesManagerH = ya1Var.h();
                            if (participantStatesManagerH != null) {
                                participantStatesManagerH.lowerHandParticipant(anc.c(fu1Var));
                            }
                            ya1Var.s.a(ud.a);
                        }
                        raiseHandActionBottomSheet.v1(true);
                        break;
                }
            }
        });
        cyb cybVar2 = new cyb(wf4Var.getContext());
        cybVar2.setId(R.id.call_screen_raisehand_manage_positive_btn);
        cybVar2.setAppearance(zxb.PRIMARY);
        cybVar2.setSize(aybVar);
        cybVar2.setCustomTheme(a8gVar.l(cybVar2).b);
        cybVar2.setText(np4.q(cybVar2.getContext(), R.string.call_screen_raisehand_manage_positive_btn));
        final int i2 = 1;
        qe7.H(cybVar2, 300L, new View.OnClickListener(this) { // from class: c4e
            public final /* synthetic */ RaiseHandActionBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = RaiseHandActionBottomSheet.y;
                        raiseHandActionBottomSheet.v1(true);
                        break;
                    default:
                        zv8[] zv8VarArr2 = RaiseHandActionBottomSheet.y;
                        d4e d4eVar = (d4e) raiseHandActionBottomSheet.v.getValue();
                        fu1 fu1Var = d4eVar.c;
                        w82 w82Var = d4eVar.d;
                        boolean zD = cqk.d(fu1Var, w82Var.b().a.getId());
                        da1 da1Var = w82Var.h;
                        if (zD) {
                            ((ya1) da1Var).p(false);
                        } else {
                            ya1 ya1Var = (ya1) da1Var;
                            ParticipantStatesManager participantStatesManagerH = ya1Var.h();
                            if (participantStatesManagerH != null) {
                                participantStatesManagerH.lowerHandParticipant(anc.c(fu1Var));
                            }
                            ya1Var.s.a(ud.a);
                        }
                        raiseHandActionBottomSheet.v1(true);
                        break;
                }
            }
        });
        wf4Var.addView(textView, -1, -2);
        wf4Var.addView(textView2, -1, -2);
        wf4Var.addView(cybVar2, 0, -2);
        wf4Var.addView(cybVar, 0, -2);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = textView.getId();
        eg4VarH.d(id, 3, 0, 3);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id));
        eg4VarH.d(id, 7, 0, 7);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 4, textView2.getId(), 3);
        eg4VarH.g(id).d.W = 2;
        int id2 = textView2.getId();
        eg4VarH.d(id2, 3, textView.getId(), 4);
        qt4.w(4.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id2));
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 4, cybVar2.getId(), 3);
        int id3 = cybVar2.getId();
        eg4VarH.d(id3, 3, textView2.getId(), 4);
        new bsb(3, eg4VarH, id3).a(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id3, 7, cybVar.getId(), 6);
        qt4.w(4.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id3));
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 4, 0, 3);
        int id4 = cybVar.getId();
        eg4VarH.d(id4, 3, cybVar2.getId(), 3);
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.d(id4, 6, cybVar2.getId(), 7);
        new bsb(6, eg4VarH, id4).a(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id4, 4, cybVar2.getId(), 4);
        eg4VarH.a(wf4Var);
        return wf4Var;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(((d4e) this.v.getValue()).e, new dtd(this, (lq4) null, 5), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return pq3.j.k(getContext()).b;
    }

    public RaiseHandActionBottomSheet(t3f t3fVar, fu1 fu1Var) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("opponent_id", fu1Var)));
    }
}
