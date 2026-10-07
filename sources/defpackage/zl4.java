package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zl4 extends wod {
    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        sj4 sj4Var = (sj4) k79Var;
        izb izbVar = (izb) this.a;
        if (sj4Var.g == zmd.CHANGE_ADMIN) {
            gm0.K(64.0f * yl5.d().getDisplayMetrics().density);
            ezb cellHeight = izbVar.getCellHeight();
            ezb ezbVar = ezb.c;
            if (cellHeight != ezbVar) {
                izbVar.setCellHeight(ezbVar);
            }
            izbVar.requestLayout();
        }
        izbVar.j(sj4Var.a, sj4Var.f, sj4Var.d);
        izbVar.setTitle(sj4Var.b);
        izbVar.setSubtitle(sj4Var.c.b(izbVar.getContext()));
    }
}
