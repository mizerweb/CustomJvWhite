package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import one.me.calllist.ui.CallHistoryScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rl1 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryScreen b;

    public /* synthetic */ rl1(CallHistoryScreen callHistoryScreen, int i) {
        this.a = i;
        this.b = callHistoryScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        CallHistoryScreen callHistoryScreen = this.b;
        switch (i) {
            case 0:
                View view = (View) obj;
                zv8[] zv8VarArr = CallHistoryScreen.D;
                Integer numValueOf = Integer.valueOf(R.attr.icon_primary);
                if (((o5b) callHistoryScreen.r1().h.b.a.getValue()).a) {
                    gm0.Y(CallHistoryScreen.class.getName(), "don't show popup menu when multiselect is enabled");
                } else {
                    c79 c79VarW = yab.w();
                    c79VarW.add(new rp4(0, new tnh(R.string.call_history_item_call_context_action_select), numValueOf, Integer.valueOf(R.drawable.ic_check_outline_24), numValueOf));
                    if (((Boolean) ((e5d) callHistoryScreen.g.getValue()).c().i()).booleanValue()) {
                        c79VarW.add(new rp4(1, new tnh(R.string.call_history_toolbar_action_clear_all), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative)));
                    }
                    opl.b(callHistoryScreen, 1).l(yab.j(c79VarW)).f(view).i().build().u(callHistoryScreen);
                }
                return sbi.a;
            default:
                ((Integer) obj).getClass();
                zv8[] zv8VarArr2 = CallHistoryScreen.D;
                vl1 vl1VarR1 = callHistoryScreen.r1();
                Set set = ((o5b) vl1VarR1.h.b.a.getValue()).b;
                l8b l8bVar = vl1VarR1.i;
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    yw7 yw7Var = (yw7) l8bVar.f(((Number) it.next()).longValue());
                    if (yw7Var != null) {
                        arrayList.add(yw7Var);
                    }
                }
                Iterator it2 = arrayList.iterator();
                int size = 0;
                while (it2.hasNext()) {
                    List list = ((yw7) it2.next()).m;
                    size += list.isEmpty() ? 1 : list.size();
                }
                return size == 0 ? "" : String.valueOf(size);
        }
    }
}
