package ru.ok.tamtam.messages.scheduled.widget;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a4c;
import defpackage.ayb;
import defpackage.cg;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.g45;
import defpackage.gm0;
import defpackage.gwc;
import defpackage.ha9;
import defpackage.ize;
import defpackage.j8e;
import defpackage.j95;
import defpackage.je9;
import defpackage.jz;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n2f;
import defpackage.ny8;
import defpackage.o2f;
import defpackage.poe;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qv1;
import defpackage.r2f;
import defpackage.roe;
import defpackage.sbi;
import defpackage.t2f;
import defpackage.vv;
import defpackage.wtc;
import defpackage.xbd;
import defpackage.xc9;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/tamtam/messages/scheduled/widget/ScheduledSendPickerBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "", "requestId", "Lr2f;", "pickerMode", "initialFireTime", "(Lha9;JLr2f;Ljava/lang/Long;)V", "scheduled-send-picker-dialog"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ScheduledSendPickerBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] D = {new dwd(ScheduledSendPickerBottomSheet.class, "requestId", "getRequestId()J", 0), zo5.f(zfe.a, ScheduledSendPickerBottomSheet.class, "initialFireTime", "getInitialFireTime()Ljava/lang/Long;", 0), new dwd(ScheduledSendPickerBottomSheet.class, "pickerMode", "getPickerMode()Lru/ok/tamtam/messages/scheduled/widget/ScheduledSendPickerMode;", 0), new dwd(ScheduledSendPickerBottomSheet.class, "title", "getTitle()Landroid/widget/TextView;", 0), new dwd(ScheduledSendPickerBottomSheet.class, "dateTimePicker", "getDateTimePicker()Lru/ok/tamtam/messages/scheduled/DateTimePicker;", 0), new dwd(ScheduledSendPickerBottomSheet.class, "sendButton", "getSendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final j8e A;
    public final j8e B;
    public cg C;
    public final wtc u;
    public final vv v;
    public final vv w;
    public final vv x;
    public final ny8 y;
    public final j8e z;

    public ScheduledSendPickerBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new wtc(m35getAccountScopeuqN4xOY());
        this.v = new vv(Long.class, -1L, "KEY_REQUEST_ID");
        this.w = new vv(Long.class, null, "KEY_INITIAL_FIRE_TIME");
        this.x = new vv(r2f.class, r2f.c, "KEY_PICKER_MODE");
        this.y = createViewModelLazy(t2f.class, new ztd(10, new ize(2, this)));
        this.z = viewBinding(R.id.toolbar_title);
        this.A = viewBinding(R.id.scheduled_date_time_picker);
        this.B = viewBinding(R.id.scheduled_send_button);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        TextView textViewE = qv1.e(context, R.id.toolbar_title);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        textViewE.setLayoutParams(layoutParams);
        textViewE.setGravity(17);
        q9i.a(q9i.c, textViewE);
        n1g.N(new xc9(3, null, 15), textViewE);
        g45 g45Var = new g45(context);
        g45Var.setId(R.id.scheduled_date_time_picker);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, g45Var.getContext().getResources().getDimensionPixelSize(R.dimen.picker_height));
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        g45Var.setLayoutParams(layoutParams2);
        cyb cybVar = new cyb(context);
        cybVar.setId(R.id.scheduled_send_button);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setVisibility(4);
        qe7.H(cybVar, 300L, new gwc(18, this));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
        cybVar.setLayoutParams(layoutParams3);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setNestedScrollingEnabled(true);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setPaddingRelative(0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0, 0);
        linearLayout.addView(textViewE);
        linearLayout.addView(g45Var);
        linearLayout.addView(cybVar);
        return linearLayout;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    /* JADX INFO: renamed from: E1 */
    public final boolean getB() {
        return false;
    }

    public final g45 F1() {
        return (g45) this.A.m(this, D[4]);
    }

    public final t2f G1() {
        return (t2f) this.y.getValue();
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        cg cgVar = this.C;
        if (cgVar != null) {
            Object poeVar = null;
            this.C = null;
            try {
                Context applicationContext = getContext().getApplicationContext();
                if (applicationContext != null) {
                    applicationContext.unregisterReceiver(cgVar);
                    poeVar = sbi.a;
                }
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                gm0.V(this.m, "Failed to unregister timezone receiver", thA);
            }
        }
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        int i;
        int i2 = 0;
        s1().setPadding(0, 0, 0, 0);
        lq4 lq4Var = null;
        if (this.C != null) {
            String str = this.m;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Trying to register timezone receiver twice", null);
                }
            }
        } else {
            this.C = new cg(7, this);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
            Context applicationContext = getApplicationContext();
            if (applicationContext != null) {
                applicationContext.registerReceiver(this.C, intentFilter);
            }
        }
        j8e j8eVar = this.z;
        zv8[] zv8VarArr = D;
        int i3 = 3;
        TextView textView = (TextView) j8eVar.m(this, zv8VarArr[3]);
        vv vvVar = this.x;
        int i4 = 2;
        zv8 zv8Var = zv8VarArr[2];
        int iOrdinal = ((r2f) vvVar.a(this)).ordinal();
        int i5 = 1;
        if (iOrdinal != 0) {
            i = iOrdinal != 1 ? R.string.scheduled_send_message_title : R.string.scheduled_send_post_title;
        } else {
            i = R.string.scheduled_remind_title;
        }
        textView.setText(i);
        F1().setListener$scheduled_send_picker_dialog(G1());
        jz jzVar = new jz(G1().f, 13);
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(jzVar, getViewLifecycleOwner().f(), n09Var), new o2f(lq4Var, this, i2), i3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(G1().i, 13), getViewLifecycleOwner().f(), n09Var), new o2f(lq4Var, this, i5), i3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(G1().m, getViewLifecycleOwner().f(), n09Var), new o2f(lq4Var, this, i4), i3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new n2f(this);
    }

    public ScheduledSendPickerBottomSheet(ha9 ha9Var, long j, r2f r2fVar, Long l) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("KEY_REQUEST_ID", Long.valueOf(j)), new ylc("KEY_PICKER_MODE", r2fVar), new ylc("KEY_INITIAL_FIRE_TIME", l)));
    }

    public /* synthetic */ ScheduledSendPickerBottomSheet(ha9 ha9Var, long j, r2f r2fVar, Long l, int i, j95 j95Var) {
        this(ha9Var, j, (i & 4) != 0 ? r2f.c : r2fVar, (i & 8) != 0 ? null : l);
    }
}
