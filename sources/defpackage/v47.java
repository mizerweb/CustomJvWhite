package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Executor;
import one.me.chats.list.folderwidget.section.FolderWidgetLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class v47 extends RecyclerView {
    public final h47 j2;

    public v47(Context context, Executor executor) {
        super(context);
        h47 h47Var = new h47(executor);
        this.j2 = h47Var;
        zee u47Var = new u47();
        setLayoutManager(new FolderWidgetLayoutManager(context));
        setItemAnimator(null);
        j(u47Var);
        setAdapter(h47Var);
        h(new q91(gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), 4), -1);
    }

    public final void setListener(t47 t47Var) {
        this.j2.g = t47Var;
    }
}
