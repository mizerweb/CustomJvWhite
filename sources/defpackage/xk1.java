package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.Collections;
import one.me.android.root.RootController;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xk1 implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ xk1(int i) {
        this.a = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
            case 1:
                zv8[] zv8VarArr = CallHistoryScreen.D;
                return Collections.singletonList(new mcc(0, R.string.call_history_item_call_toolbar_action_remove, R.drawable.icon_delete, ((o5b) obj).b.size() == 0, null, 48));
            case 2:
                ActivityManager.AppTask appTask = (ActivityManager.AppTask) obj;
                return "(id=" + appTask.getTaskInfo().taskId + ", base=" + appTask.getTaskInfo().baseActivity + ", top=" + appTask.getTaskInfo().topActivity + ", numActivities=" + appTask.getTaskInfo().numActivities + ")";
            case 3:
                ldf ldfVar = CallLinkInfoScreen.t;
                return -1;
            case 4:
                ldf ldfVar2 = CallLinkInfoScreen.t;
                return 0;
            case 5:
                Toolbar toolbar = (Toolbar) obj;
                ldf ldfVar3 = CallLinkInfoScreen.t;
                rcc rccVar = new rcc(toolbar.getContext());
                rccVar.setId(R.id.call_info_onemetoolbar);
                rccVar.setForm(gcc.Compact);
                rccVar.setTextShimmerEnabled(false);
                rccVar.setLeftActions(new wbc(new xk1(7)));
                rccVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), rccVar.getPaddingTop(), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), rccVar.getPaddingBottom());
                toolbar.addView(rccVar);
                return sbiVar;
            case 6:
                LinearLayout linearLayout = (LinearLayout) obj;
                ldf ldfVar4 = CallLinkInfoScreen.t;
                kwb kwbVar = new kwb(linearLayout.getContext());
                kwbVar.setId(R.id.call_info_icon);
                kwbVar.setAvatarShape(awb.a);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 96.0f), gm0.K(96.0f * yl5.d().getDisplayMetrics().density));
                layoutParams.gravity = 1;
                layoutParams.topMargin = gm0.K(18.0f * yl5.d().getDisplayMetrics().density);
                kwbVar.setLayoutParams(layoutParams);
                linearLayout.addView(kwbVar);
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(R.id.call_info_title);
                q9i.a(q9i.b, textView);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout.addView(textView);
                TextView textView2 = new TextView(linearLayout.getContext());
                textView2.setId(R.id.call_info_link_state);
                q9i.a(q9i.i, textView2);
                textView2.setTextColor(pq3.j.h(textView2).getText().h);
                textView2.setGravity(17);
                textView2.setEllipsize(null);
                textView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout.addView(textView2);
                return sbiVar;
            case 7:
                ldf ldfVar5 = CallLinkInfoScreen.t;
                pk1 pk1Var = pk1.b;
                if (!pk1Var.b().f()) {
                    RootController rootController = pk1Var.b().a().e;
                    Activity activityD = rootController != null ? rootController.w1().d() : null;
                    if (activityD != null) {
                        activityD.finish();
                    }
                }
                return sbiVar;
            case 8:
                ldf ldfVar6 = CallLinkInfoScreen.t;
                return -1;
            case 9:
                ldf ldfVar7 = CallLinkInfoScreen.t;
                return 0;
            case 10:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
            case 11:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
            case 12:
                return Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD - ((ys1) obj).h);
            case 13:
                zv8[] zv8VarArr2 = CallOpponentsListWidget.v;
                ((EditText) obj).getText().clear();
                return sbiVar;
            case 14:
                return Integer.valueOf(((kbc) obj).getIcon().i);
            case 15:
                return Boolean.TRUE;
            case 16:
                ((Long) obj).getClass();
                zv8[] zv8VarArr3 = ChangeOwnerScreen.k;
                return r66.a;
            case 17:
                as2 as2Var = (as2) obj;
                as2Var.f.set(0);
                as2Var.g.set(null);
                hr2 hr2Var = (hr2) as2Var.h.get();
                if (hr2Var != null) {
                    hr2Var.i(null);
                }
                return sbiVar;
            case 18:
                String str = (String) obj;
                return str != null ? str : "null";
            case 19:
                return ((gda) obj).a(true, false);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ex2 ex2Var = (ex2) obj;
                return zo5.p(vd7.K(Long.valueOf(ex2Var.a)), ":", vd7.K(Long.valueOf(ex2Var.b)));
            case 21:
                return p90.a(null);
            case 22:
                return Integer.valueOf(((kbc) obj).getText().c);
            case 23:
                return Integer.valueOf(((kbc) obj).getText().c);
            case 24:
                return Integer.valueOf(((kbc) obj).getText().c);
            case 25:
                return Integer.valueOf(((kbc) obj).getText().d);
            case 26:
                return Integer.valueOf(((kbc) obj).getIcon().e);
            case 27:
                return Integer.valueOf(((kbc) obj).b().e);
            case 28:
                zv8[] zv8VarArr4 = ChatMediaTabWidget.n;
                trd.b.r();
                return sbiVar;
            default:
                tia tiaVar = (tia) obj;
                return new apb(new ilb(tiaVar.c), tiaVar.e, tiaVar.i, qv5.DO_NOT_DISTURB_MODE);
        }
    }

    public /* synthetic */ xk1(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
    }
}
