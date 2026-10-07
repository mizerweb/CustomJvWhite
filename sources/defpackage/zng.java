package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zng extends s7g {
    public final yng u;
    public final zsj v;
    public omg w;

    public zng(Context context, dj9 dj9Var, ExecutorService executorService, wmg wmgVar) {
        yng yngVar = new yng(context);
        yngVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        super(yngVar);
        this.u = yngVar;
        zsj zsjVar = new zsj(executorService, new rj5(26, wmgVar), new occ(0, wmgVar, wmg.class, "onAddNewClick", "onAddNewClick()V", 0, 11));
        this.v = zsjVar;
        yngVar.setHeaderClickAction(new xre(this, 20, wmgVar));
        RecyclerView recyclerView = yngVar.c;
        if (dj9Var != null) {
            recyclerView.i(new yw8(5, dj9Var));
        }
        recyclerView.setAdapter(zsjVar);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof omg) {
            omg omgVar = (omg) k79Var;
            List list = omgVar.e;
            this.w = omgVar;
            int size = list.size();
            yng yngVar = this.u;
            String str = String.format(yngVar.getContext().getResources().getQuantityString(R.plurals.oneme_stickers_set_count, size), Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            CharSequence charSequenceB = omgVar.b.b(yngVar.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            CharSequence charSequence = charSequenceB;
            boolean z = omgVar.h;
            yngVar.b.a(charSequence, str, z ? R.string.oneme_stickers_set_remove_button : R.string.oneme_stickers_set_add_button, z ? zxb.SECONDARY : zxb.PRIMARY, false);
            this.v.H(list);
        }
    }
}
