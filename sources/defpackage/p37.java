package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class p37 extends s7g {
    @Override // defpackage.s7g
    public final void G() {
        ((izb) this.a).setFirstTrailingIconClickListener(null);
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(l37 l37Var) {
        izb izbVar = (izb) this.a;
        izbVar.setTitle(l37Var.b.b(izbVar.getContext()));
        Long l = l37Var.d;
        if (l != null) {
            izbVar.j(l.longValue(), l37Var.e, l37Var.c);
        } else {
            Integer num = l37Var.g;
            if (num != null) {
                izbVar.m(num.intValue(), null);
            }
        }
        izbVar.setFirstTrailingIcon(Integer.valueOf(R.drawable.icon_delete));
        izbVar.setVerified(l37Var.f);
    }
}
