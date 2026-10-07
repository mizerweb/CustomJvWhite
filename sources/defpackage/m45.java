package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class m45 extends y69 {
    @Override // defpackage.nee
    public final long m(int i) {
        return ((j45) F(i)).a;
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        l45 l45Var = (l45) lfeVar;
        AppCompatTextView appCompatTextView = l45Var.u;
        appCompatTextView.setText(((j45) F(i)).e);
        appCompatTextView.setTextColor(pq3.j.e(l45Var.a.getContext()).m().getText().b);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        return new l45(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.day_item, viewGroup, false));
    }
}
