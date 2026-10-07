package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ysf extends f83 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ atf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysf(atf atfVar) {
        super(4, usf.a);
        this.d = atfVar;
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        atf atfVar = this.d;
        switch (i) {
            case 0:
                psf psfVar = (psf) obj2;
                if (!cqk.d((psf) obj, psfVar)) {
                    atfVar.o(psfVar.getTitle(), psfVar.v());
                    atfVar.p(psfVar.t());
                    atfVar.setStartView(psfVar.e());
                    atfVar.setDescription(psfVar.f());
                    atfVar.setCounter(psfVar.b());
                    ynh ynhVarC = psfVar.c();
                    atfVar.setUpperText(ynhVarC != null ? ynhVarC.b(atfVar.getContext()) : null);
                    atfVar.setEndView(psfVar.d());
                    psfVar.getItemId();
                    atfVar.setType(atfVar.getModelItem().getType());
                    atfVar.requestLayout();
                    atfVar.invalidate();
                    atfVar.onThemeChanged(pq3.j.h(atfVar));
                }
                break;
            default:
                if (((usf) obj) != ((usf) obj2)) {
                    atfVar.onThemeChanged(atfVar.getCurrentTheme());
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysf(asf asfVar, atf atfVar) {
        super(4, asfVar);
        this.d = atfVar;
    }
}
