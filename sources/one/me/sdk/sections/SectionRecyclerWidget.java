package one.me.sdk.sections;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.dwd;
import defpackage.gm0;
import defpackage.j8e;
import defpackage.kbc;
import defpackage.pq3;
import defpackage.qh1;
import defpackage.r84;
import defpackage.rj5;
import defpackage.rsf;
import defpackage.sbf;
import defpackage.uo5;
import defpackage.yl5;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/sections/SectionRecyclerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "sections-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class SectionRecyclerWidget extends Widget {
    public static final /* synthetic */ zv8[] c;
    public final j8e a;
    public final rj5 b;

    static {
        dwd dwdVar = new dwd(SectionRecyclerWidget.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        zfe.a.getClass();
        c = new zv8[]{dwdVar};
    }

    public SectionRecyclerWidget(Bundle bundle) {
        super(bundle);
        this.a = viewBinding(R.id.oneme_settingslist_rv);
        this.b = new rj5(23, this);
    }

    /* JADX INFO: renamed from: o1 */
    public abstract qh1 getI();

    public final RecyclerView p1() {
        return (RecyclerView) this.a.m(this, c[0]);
    }

    /* JADX INFO: renamed from: q1 */
    public abstract rsf getH();

    public final RecyclerView r1(int i) {
        r84 r84Var = new r84(getH(), getI());
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(R.id.oneme_settingslist_rv);
        recyclerView.setAdapter(r84Var);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), recyclerView.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        kbc kbcVarH = pq3.j.h(recyclerView);
        rj5 rj5Var = this.b;
        recyclerView.h(new sbf(kbcVarH, rj5Var, null, null, null, 60), -1);
        recyclerView.h(new uo5(rj5Var, i), -1);
        return recyclerView;
    }
}
