package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mp0 extends s7g {
    public final kp0 u;
    public final vm4 v;

    public mp0(Context context, um4 um4Var, kp0 kp0Var) {
        y8j y8jVar = new y8j(context);
        lvb.m0(y8jVar);
        super(y8jVar);
        this.u = kp0Var;
        vm4 vm4Var = new vm4(um4Var, kp0Var);
        this.v = vm4Var;
        y8jVar.setId(R.id.banners_view_pager);
        y8jVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        y8jVar.setAdapter(vm4Var);
        y8jVar.setOrientation(0);
        y8jVar.setOffscreenPageLimit(2);
        y8jVar.setClipToPadding(false);
        y8jVar.setClipChildren(false);
        int i = 1;
        y8jVar.setPageTransformer(new hu(y8jVar, i, this));
        y8jVar.e(new wy7(i, this));
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(bp0 bp0Var) {
        List list = bp0Var.b;
        this.v.I(list, new c3(14, this));
        y8j y8jVar = (y8j) this.a;
        y8jVar.setUserInputEnabled(list.size() > 1);
        if (list.size() == 1 && ((wm4) list.get(0)).a == 1) {
            y8jVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            y8jVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
    }
}
