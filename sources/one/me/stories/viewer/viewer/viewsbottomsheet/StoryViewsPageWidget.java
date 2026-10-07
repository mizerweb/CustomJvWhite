package one.me.stories.viewer.viewer.viewsbottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.af7;
import defpackage.gl1;
import defpackage.ha9;
import defpackage.i94;
import defpackage.k96;
import defpackage.n1g;
import defpackage.nee;
import defpackage.va;
import defpackage.ylc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B9\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/stories/viewer/viewer/viewsbottomsheet/StoryViewsPageWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "Lnee;", "listAdapter", "Lkotlin/Function0;", "Lsbi;", "onLoadMore", "", "canLoadMore", "(Lha9;Lnee;Laf7;Laf7;)V", "stories-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StoryViewsPageWidget extends Widget {
    public final nee a;
    public final af7 b;
    public final af7 c;

    public StoryViewsPageWidget(ha9 ha9Var, nee neeVar, af7 af7Var, af7 af7Var2) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
        this.a = neeVar;
        this.b = af7Var;
        this.c = af7Var2;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k96 k96Var = new k96(layoutInflater.getContext());
        k96Var.setId(R.id.story_views_page_recycler);
        k96Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager());
        k96Var.setPadding(k96Var.getPaddingLeft(), 8, k96Var.getPaddingRight(), k96Var.getPaddingBottom());
        k96Var.setOverScrollMode(2);
        k96Var.setAdapter(this.a);
        k96Var.setIgnoreRefreshingFlagsForScrollEvent(true);
        k96Var.setThreshold(5);
        k96Var.setPager(new gl1(this, 12));
        return k96Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        k96 k96Var = view instanceof k96 ? (k96) view : null;
        if (k96Var != null) {
            k96Var.setPager(null);
            k96Var.setAdapter(null);
        }
        super.onDestroyView(view);
    }

    public StoryViewsPageWidget(Bundle bundle) {
        super(bundle);
        this.b = new va(22);
        this.c = new i94(10);
    }
}
