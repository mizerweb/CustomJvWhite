package defpackage;

import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gv1 extends g6g {
    public final zo7 f;

    public gv1(zo7 zo7Var, ExecutorService executorService) {
        super(executorService);
        this.f = zo7Var;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        if (s7gVar instanceof fv1) {
        } else {
            s7gVar.B((k79) F(i));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.call_info_presettings_item_vh) {
            return new fv1(new atf(viewGroup.getContext()));
        }
        if (i != R.id.call_info_presettings_change_name_vh) {
            ore.k(nbh.q(i, "unknown item viewType "));
            return null;
        }
        jac jacVar = new jac(viewGroup.getContext());
        z91 z91Var = new z91(jacVar, 5);
        jacVar.setLayoutParams(new LinearLayout.LayoutParams(-1, gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
        jacVar.setMaxLengthForLabel(100);
        jacVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        jacVar.setBackgroundColorAttr(Integer.valueOf(R.attr.background_card));
        jacVar.k(new m(27, this.f));
        jacVar.setTypingMode(hac.a);
        return z91Var;
    }
}
