package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ova extends g6g {
    public final c7k f;

    public ova(c7k c7kVar, ExecutorService executorService) {
        super(executorService);
        this.f = c7kVar;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        boolean z = s7gVar instanceof nva;
        c7k c7kVar = this.f;
        if (z) {
            nva nvaVar = (nva) s7gVar;
            k79 k79Var = (k79) F(i);
            if (k79Var instanceof kva) {
                nvaVar.B(k79Var);
                atf atfVar = (atf) nvaVar.a;
                kva kvaVar = (kva) k79Var;
                qe7.H(atfVar, 300L, new z36(c7kVar, 27, kvaVar));
                atfVar.setOnSwitchCheckedListener(new uv2(c7kVar, 3, kvaVar));
                return;
            }
            return;
        }
        if (!(s7gVar instanceof mva)) {
            s7gVar.B((k79) F(i));
            return;
        }
        mva mvaVar = (mva) s7gVar;
        k79 k79Var2 = (k79) F(i);
        if (k79Var2 instanceof jva) {
            mvaVar.B(k79Var2);
            qe7.H((hn) mvaVar.a, 300L, new z36(c7kVar, 26, (jva) k79Var2));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new nva(new atf(viewGroup.getContext()));
        }
        if (i != R.id.oneme_messages_settings_need_divider_above_vh) {
            ore.k(nbh.q(i, "unknown item viewType: "));
            return null;
        }
        hn hnVar = new hn(viewGroup.getContext());
        hnVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new mva(hnVar);
    }
}
