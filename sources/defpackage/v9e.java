package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class v9e extends RecyclerView {
    public final zsj j2;
    public final GradientDrawable k2;

    public v9e(Context context, yi3 yi3Var, ExecutorService executorService) {
        super(context);
        zsj zsjVar = new zsj(yi3Var, executorService, 9);
        this.j2 = zsjVar;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(gm0.K(1.0f * yl5.d().getDisplayMetrics().density), gm0.J(((double) yl5.d().getDisplayMetrics().density) * 0.5d));
        this.k2 = gradientDrawable;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setLayoutManager(new LinearLayoutManager(0, false));
        setAdapter(zsjVar);
        setItemAnimator(null);
        h(new ph1(8), -1);
        uo5 uo5Var = new uo5(context);
        uo5Var.c = gradientDrawable;
        h(uo5Var, -1);
        n1g.N(new vqa(3, (lq4) null, 16), this);
    }

    public final void setContacts(List<s9e> list) {
        this.j2.H(list);
    }
}
