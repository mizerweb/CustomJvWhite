package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class bsh extends nee {
    public boolean d;
    public List e;

    public bsh() {
        D(true);
        this.e = r66.a;
    }

    public final zrh F(int i) {
        boolean z = this.d;
        List list = this.e;
        return z ? (zrh) list.get(i % list.size()) : (zrh) list.get(i);
    }

    public final void G(List list, boolean z, af7 af7Var) {
        if (cqk.d(this.e, list) && this.d == z) {
            af7Var.invoke();
            return;
        }
        this.e = list;
        this.d = z;
        C(new wpg(af7Var, 2, this));
        o();
    }

    @Override // defpackage.nee
    public final int l() {
        if (this.d) {
            return Integer.MAX_VALUE;
        }
        return this.e.size();
    }

    @Override // defpackage.nee
    public final long m(int i) {
        return F(i).a;
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        ash ashVar = (ash) lfeVar;
        AppCompatTextView appCompatTextView = ashVar.u;
        appCompatTextView.setText(F(i).b);
        appCompatTextView.setTextColor(pq3.j.e(ashVar.a.getContext()).m().getText().b);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        return new ash(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.number_item, viewGroup, false));
    }
}
