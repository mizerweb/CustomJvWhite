package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class v6e {
    public final Context a;
    public final i6e b;
    public u6e c;
    public final kog d;
    public final RecyclerView e;

    public v6e(Context context, ExecutorService executorService) {
        this.a = context;
        i6e i6eVar = new i6e(context);
        this.b = i6eVar;
        kog kogVar = new kog(executorService, i6eVar, new p7d(16, this), new a8d(22, this), 3);
        this.d = kogVar;
        nt4 nt4Var = new nt4(yl5.d().getDisplayMetrics().density * 24.0f);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.one_chat_react_panel_layout);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(b()));
        recyclerView.h(new uo5(new s57(recyclerView, 2), gm0.K((hsl.c(context) >= 360 ? 10 : 8) * yl5.d().getDisplayMetrics().density), new kd9(this, v6e.class, "isExpanded", "isExpanded()Z", 0)), -1);
        recyclerView.setOutlineProvider(nt4Var);
        recyclerView.setHasFixedSize(true);
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(kogVar);
        recyclerView.setOverScrollMode(2);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToOutline(false);
        recyclerView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        n1g.N(new vqa(this, (lq4) null, 15), recyclerView);
        this.e = recyclerView;
    }

    public static /* synthetic */ void d(v6e v6eVar, List list, Integer num, gb3 gb3Var, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            gb3Var = null;
        }
        v6eVar.c(list, num, gb3Var);
    }

    public final int a(int i) {
        int iB = i % b() == 0 ? i / b() : (i / b()) + 1;
        return Math.min(bc1.g(12.0f, yl5.d().getDisplayMetrics().density, iB - 1, bc1.g(this.b.a(), yl5.d().getDisplayMetrics().density, iB, c0a.d(8.0f, yl5.d().getDisplayMetrics().density, 2))), gm0.K(240.0f * yl5.d().getDisplayMetrics().density));
    }

    public final int b() {
        return yl5.e(this.a) ? 7 : 8;
    }

    public final void c(List list, Integer num, af7 af7Var) {
        int size = list.size();
        int iB = b();
        RecyclerView recyclerView = this.e;
        if (size > iB) {
            if (num != null) {
                int iIntValue = num.intValue();
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                }
                int iA = a(list.size());
                if (iIntValue > 0) {
                    iA = Math.min(iA, iIntValue);
                }
                layoutParams.height = iA;
                recyclerView.setLayoutParams(layoutParams);
            }
        } else if (list.size() < b()) {
            ((GridLayoutManager) recyclerView.getLayoutManager()).C1(list.size());
        }
        this.d.I(list, new i7b(this, 27, af7Var));
    }
}
