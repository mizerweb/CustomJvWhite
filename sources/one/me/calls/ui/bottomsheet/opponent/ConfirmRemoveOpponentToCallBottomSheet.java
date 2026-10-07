package one.me.calls.ui.bottomsheet.opponent;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.bsb;
import defpackage.ch3;
import defpackage.cyb;
import defpackage.eg4;
import defpackage.fj3;
import defpackage.fu1;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.kbc;
import defpackage.l9;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.sx1;
import defpackage.tmc;
import defpackage.wf4;
import defpackage.yb4;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.za2;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponent/ConfirmRemoveOpponentToCallBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lfu1;", "opponentId", "Lha9;", "localAccountId", "(Lfu1;Lha9;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConfirmRemoveOpponentToCallBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int w = 0;
    public final sx1 u;
    public final ny8 v;

    public ConfirmRemoveOpponentToCallBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new sx1(m35getAccountScopeuqN4xOY());
        this.v = createViewModelLazy(yb4.class, new fj3(7, new za2(this, 25, bundle)));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        wf4 wf4Var = new wf4(layoutInflater.getContext());
        TextView textView = new TextView(wf4Var.getContext());
        textView.setId(R.id.call_screen_admin_confirm_remove_user_title);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        q9i.a(q9i.c, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.l(textView).b.getText().b);
        textView.setGravity(17);
        final int i = 0;
        textView.setPadding(0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0, 0);
        textView.setText(R.string.call_screen_admin_confirm_remove_user_title);
        wf4Var.addView(textView);
        TextView textView2 = new TextView(wf4Var.getContext());
        textView2.setId(R.id.call_screen_admin_confirm_remove_user_subtitle);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        q9i.a(q9i.i, textView2);
        textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
        textView2.setGravity(17);
        Context context = textView2.getContext();
        yb4 yb4Var = (yb4) this.v.getValue();
        tmc tmcVar = (tmc) ((l9) yb4Var.d.r.a.getValue()).c.c.get(yb4Var.c);
        CharSequence name = tmcVar != null ? tmcVar.b.getName() : null;
        if (name == null) {
            name = "";
        }
        textView2.setText(context.getString(R.string.call_screen_admin_confirm_remove_user_subtitle, name));
        wf4Var.addView(textView2);
        cyb cybVar = new cyb(wf4Var.getContext());
        cybVar.setId(R.id.call_screen_admin_confirm_remove_user_positive);
        cybVar.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        cybVar.setAppearance(zxb.PRIMARY);
        ayb aybVar = ayb.g;
        cybVar.setSize(aybVar);
        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.call_screen_admin_confirm_remove_user_positive));
        qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: xb4
            public final /* synthetic */ ConfirmRemoveOpponentToCallBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        int i3 = ConfirmRemoveOpponentToCallBottomSheet.w;
                        yb4 yb4Var2 = (yb4) confirmRemoveOpponentToCallBottomSheet.v.getValue();
                        yb4Var2.e.h(yb4Var2.c);
                        confirmRemoveOpponentToCallBottomSheet.v1(true);
                        break;
                    default:
                        int i4 = ConfirmRemoveOpponentToCallBottomSheet.w;
                        confirmRemoveOpponentToCallBottomSheet.v1(true);
                        break;
                }
            }
        });
        wf4Var.addView(cybVar);
        cyb cybVar2 = new cyb(wf4Var.getContext());
        cybVar2.setId(R.id.call_screen_admin_confirm_remove_user_neutral);
        cybVar2.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        cybVar2.setAppearance(zxb.SECONDARY);
        cybVar2.setSize(aybVar);
        cybVar2.setCustomTheme(a8gVar.l(cybVar2).b);
        cybVar2.setText(np4.q(cybVar2.getContext(), R.string.call_screen_admin_confirm_remove_user_neutral));
        final int i2 = 1;
        qe7.H(cybVar2, 300L, new View.OnClickListener(this) { // from class: xb4
            public final /* synthetic */ ConfirmRemoveOpponentToCallBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        int i4 = ConfirmRemoveOpponentToCallBottomSheet.w;
                        yb4 yb4Var2 = (yb4) confirmRemoveOpponentToCallBottomSheet.v.getValue();
                        yb4Var2.e.h(yb4Var2.c);
                        confirmRemoveOpponentToCallBottomSheet.v1(true);
                        break;
                    default:
                        int i5 = ConfirmRemoveOpponentToCallBottomSheet.w;
                        confirmRemoveOpponentToCallBottomSheet.v1(true);
                        break;
                }
            }
        });
        wf4Var.addView(cybVar2);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = textView.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 7, 0, 7);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 4, textView2.getId(), 3);
        new bsb(4, eg4VarH, id).a(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.g(id).d.W = 2;
        int id2 = textView2.getId();
        eg4VarH.d(id2, 3, textView.getId(), 4);
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 4, cybVar2.getId(), 3);
        new bsb(4, eg4VarH, id2).a(gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
        int id3 = cybVar.getId();
        eg4VarH.d(id3, 3, textView2.getId(), 4);
        eg4VarH.d(id3, 7, cybVar2.getId(), 6);
        qt4.w(4.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id3));
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 4, 0, 3);
        int id4 = cybVar2.getId();
        eg4VarH.d(id4, 3, cybVar.getId(), 3);
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.d(id4, 6, cybVar.getId(), 7);
        new bsb(6, eg4VarH, id4).a(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id4, 4, cybVar.getId(), 4);
        eg4VarH.a(wf4Var);
        return wf4Var;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return pq3.j.k(getContext()).b;
    }

    public ConfirmRemoveOpponentToCallBottomSheet(fu1 fu1Var, ha9 ha9Var) {
        this(n1g.i(new ylc("opponent_id", fu1Var), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
