package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kea implements nsi {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Long c;

    public /* synthetic */ kea(boolean z, Long l, int i) {
        this.a = i;
        this.b = z;
        this.c = l;
    }

    @Override // defpackage.nsi
    public final long v(kbc kbcVar) {
        int i = this.a;
        Long l = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                return rx8.q(0, isk.i(kbcVar, l, (z ? ((xac) kbcVar.f().a).c : ((xac) kbcVar.f().b).c).o));
            default:
                return rx8.q(0, isk.i(kbcVar, l, (z ? ((xac) kbcVar.f().a).c : ((xac) kbcVar.f().b).c).m));
        }
    }
}
