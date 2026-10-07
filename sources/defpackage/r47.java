package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class r47 extends g6g {
    public final ExecutorService f;
    public final gve g;
    public final tl3 h;

    public r47(ExecutorService executorService, gve gveVar, tl3 tl3Var) {
        super(executorService);
        this.f = executorService;
        this.g = gveVar;
        this.h = tl3Var;
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.oneme_folder_widget_section_view_type) {
            return new am0(viewGroup.getContext(), this.f, this.g);
        }
        if (i == R.id.oneme_folder_widget_section_empty_view_type) {
            return new s47(viewGroup.getContext(), this.h);
        }
        throw new IllegalStateException(("Not supported viewType " + i + " for " + r47.class.getName()).toString());
    }
}
