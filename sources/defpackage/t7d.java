package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.polls.screens.create.PollCreateScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class t7d implements xee {
    public final /* synthetic */ PollCreateScreen a;
    public final /* synthetic */ RecyclerView b;

    public t7d(PollCreateScreen pollCreateScreen, RecyclerView recyclerView) {
        this.a = pollCreateScreen;
        this.b = recyclerView;
    }

    @Override // defpackage.xee
    public final void b(View view) {
        lfe lfeVarL;
        zv8[] zv8VarArr = PollCreateScreen.n;
        PollCreateScreen pollCreateScreen = this.a;
        Long l = pollCreateScreen.p1().h;
        boolean zIsFocused = view.isFocused();
        RecyclerView recyclerView = this.b;
        if (zIsFocused && l == null) {
            nl9.c(recyclerView);
        } else {
            if (l == null || (lfeVarL = recyclerView.L(l.longValue())) == null) {
                return;
            }
            lfeVarL.a.requestFocus();
            pollCreateScreen.p1().h = null;
        }
    }

    @Override // defpackage.xee
    public final void d(View view) {
        zv8[] zv8VarArr = PollCreateScreen.n;
        PollCreateScreen pollCreateScreen = this.a;
        Long l = pollCreateScreen.p1().h;
        if (l == null || this.b.Q(view) != l.longValue()) {
            return;
        }
        view.requestFocus();
        pollCreateScreen.p1().h = null;
    }
}
