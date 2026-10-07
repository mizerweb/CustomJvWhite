package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class rsf extends g6g {
    public final qsf f;

    public rsf(qsf qsfVar, ExecutorService executorService) {
        super(executorService);
        this.f = qsfVar;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N */
    public final void u(dtf dtfVar, int i) {
        if (!(dtfVar instanceof btf)) {
            if (dtfVar instanceof wvf) {
                dtfVar.B((k79) F(i));
                return;
            }
            return;
        }
        btf btfVar = (btf) dtfVar;
        View view = btfVar.a;
        psf psfVar = (psf) ((k79) F(i));
        ((atf) view).setModelItem(psfVar);
        qsf qsfVar = this.f;
        btfVar.u = qsfVar;
        if (psfVar.d() instanceof ksf) {
            ((atf) view).setOnSwitchCheckedListener(new s81(19, qsfVar));
        } else {
            ((atf) view).setOnSwitchListener(null);
        }
        qe7.H(view, 300L, new aeb(qsfVar, 27, psfVar));
        ((atf) view).setOnLongClickListener(new ro2(qsfVar, 8, psfVar));
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        dtf dtfVar = (dtf) lfeVar;
        if (list.isEmpty()) {
            u(dtfVar, i);
            return;
        }
        nsf nsfVar = new nsf(3);
        for (Object obj : list) {
            nsf nsfVar2 = obj instanceof nsf ? (nsf) obj : null;
            if (nsfVar2 != null) {
                nsfVar.e(nsfVar2);
            }
        }
        dtfVar.C((k79) this.d.f.get(i), nsfVar);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        return i == R.id.oneme_section_name_viewtype ? new wvf(new vvf(viewGroup.getContext())) : new btf(new atf(viewGroup.getContext()));
    }
}
