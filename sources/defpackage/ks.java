package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ks extends ha7 {
    public final /* synthetic */ rs j;
    public final /* synthetic */ us k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(us usVar, us usVar2, rs rsVar) {
        super(usVar2);
        this.k = usVar;
        this.j = rsVar;
    }

    @Override // defpackage.ha7
    public final x3g b() {
        return this.j;
    }

    @Override // defpackage.ha7
    public final boolean c() {
        us usVar = this.k;
        if (usVar.getInternalPopup().a()) {
            return true;
        }
        usVar.f.i(usVar.getTextDirection(), usVar.getTextAlignment());
        return true;
    }
}
