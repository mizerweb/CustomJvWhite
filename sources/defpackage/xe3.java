package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.chats.list.ChatsListWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class xe3 extends g6g implements med {
    public final ChatsListWidget f;
    public long g;

    public xe3(ChatsListWidget chatsListWidget, ExecutorService executorService) {
        super(executorService);
        this.f = chatsListWidget;
        this.g = 0L;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void u(p9h p9hVar, int i) {
        j9h j9hVar = (j9h) ((k79) F(i));
        if (!(j9hVar instanceof h9h)) {
            if (j9hVar instanceof i9h) {
                return;
            }
            ore.o();
            return;
        }
        int i2 = i + 1;
        View view = ((df3) p9hVar).a;
        h9h h9hVar = (h9h) j9hVar;
        we3 we3Var = new we3(this, h9hVar, i2, 0);
        we3 we3Var2 = new we3(this, h9hVar, i2, 1);
        ((bf3) view).setItem(h9hVar);
        bf3 bf3Var = (bf3) view;
        qe7.H(bf3Var, 300L, new cf3(we3Var, 0, h9hVar));
        qe7.H(bf3Var.f, 300L, new ze3(0, new cf3(we3Var2, 1, h9hVar)));
        Long l = h9hVar.k;
        this.g = l != null ? l.longValue() : 0L;
    }

    @Override // defpackage.med
    public final long c() {
        return this.g;
    }

    @Override // defpackage.g6g, defpackage.nee
    public final int n(int i) {
        return ((j9h) ((k79) F(i))).getF();
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        p9h p9hVar = (p9h) lfeVar;
        Object objD1 = ww3.D1(list);
        if (objD1 != null && (objD1 instanceof f9h)) {
            df3 df3Var = p9hVar instanceof df3 ? (df3) p9hVar : null;
            if (df3Var != null) {
                ((bf3) df3Var.a).setStatus(((f9h) objD1).a());
            }
        }
        u(p9hVar, i);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.chat_suggest_item_view_type) {
            return new df3(new bf3(viewGroup.getContext()));
        }
        if (i == R.id.chat_suggest_stub_item_view_type) {
            return new l6h(new k6h(viewGroup.getContext()));
        }
        ore.k(nbh.q(i, "unknown item viewType: "));
        return null;
    }
}
