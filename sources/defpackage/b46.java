package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class b46 extends g6g {
    public final b1k f;
    public final boolean g;
    public kbc h;

    public b46(ExecutorService executorService, b1k b1kVar, boolean z) {
        super(executorService);
        this.f = b1kVar;
        this.g = z;
    }

    @Override // defpackage.g6g, defpackage.nee
    public final int n(int i) {
        return ((k79) F(i)).getF();
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.oneme_media_keyboard_view_type_category_emoji) {
            zn2 zn2Var = new zn2(viewGroup.getContext(), new va(22));
            zn2Var.v = this.h;
            return zn2Var;
        }
        a46 a46Var = new a46(viewGroup.getContext(), this.f, this.g);
        a46Var.u = this.h;
        return a46Var;
    }
}
