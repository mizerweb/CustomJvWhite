package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import kotlin.collections.a;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wv1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallRateBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv1(lq4 lq4Var, CallRateBottomSheet callRateBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callRateBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallRateBottomSheet callRateBottomSheet = this.g;
        switch (i) {
            case 0:
                wv1 wv1Var = new wv1(lq4Var, callRateBottomSheet, 0);
                wv1Var.f = obj;
                return wv1Var;
            case 1:
                wv1 wv1Var2 = new wv1(lq4Var, callRateBottomSheet, 1);
                wv1Var2.f = obj;
                return wv1Var2;
            case 2:
                wv1 wv1Var3 = new wv1(lq4Var, callRateBottomSheet, 2);
                wv1Var3.f = obj;
                return wv1Var3;
            default:
                wv1 wv1Var4 = new wv1(lq4Var, callRateBottomSheet, 3);
                wv1Var4.f = obj;
                return wv1Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((wv1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((wv1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((wv1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((wv1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        CallRateBottomSheet callRateBottomSheet = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                ((TextView) callRateBottomSheet.B.m(callRateBottomSheet, CallRateBottomSheet.F[4])).setText(((ynh) obj2).b(callRateBottomSheet.getContext()));
                return sbiVar;
            case 1:
                ch3.d0(obj);
                ((q4e) callRateBottomSheet.C.m(callRateBottomSheet, CallRateBottomSheet.F[5])).setButtonToolDataList((List) obj2);
                return sbiVar;
            case 2:
                ch3.d0(obj);
                ((cyb) callRateBottomSheet.E.m(callRateBottomSheet, CallRateBottomSheet.F[7])).setVisibility(((Boolean) obj2).booleanValue() ? 0 : 8);
                return sbiVar;
            default:
                ch3.d0(obj);
                zv1 zv1Var = (zv1) obj2;
                if (cqk.d(zv1Var, xv1.a)) {
                    x4e x4eVarF1 = CallRateBottomSheet.F1(callRateBottomSheet);
                    int childCount = x4eVarF1.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = x4eVarF1.getChildAt(i2);
                        if (childAt instanceof r4e) {
                            ((r4e) childAt).setChecked(false);
                        }
                    }
                    return sbiVar;
                }
                if (!(zv1Var instanceof yv1)) {
                    ore.o();
                    return null;
                }
                if (((yv1) zv1Var).a) {
                    String upperCase = np4.q(callRateBottomSheet.getContext(), R.string.tt_app_name).toUpperCase(Locale.ROOT);
                    h8c h8cVar = new h8c(callRateBottomSheet);
                    h8cVar.m(new tnh(R.string.call_rate_success_snackbar_title));
                    h8cVar.a(new vnh(R.string.call_rate_success_snackbar_subtitle, a.n1(new Object[]{upperCase})));
                    h8cVar.h(new w8c(R.drawable.avd_heart));
                    h8cVar.p();
                }
                callRateBottomSheet.v1(true);
                return sbiVar;
        }
    }
}
