package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qcb extends kq0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qcb(hdb hdbVar, int i) {
        super(hdbVar);
        this.b = i;
    }

    @Override // defpackage.rf4
    public final boolean b(mzj mzjVar) {
        switch (this.b) {
            case 0:
                return mzjVar.j.a == 2;
            default:
                return mzjVar.j.a == 3;
        }
    }

    @Override // defpackage.kq0
    public final int c() {
        switch (this.b) {
        }
        return 7;
    }

    @Override // defpackage.kq0
    public final boolean d(Object obj) {
        switch (this.b) {
            case 0:
                fdb fdbVar = (fdb) obj;
                return (!fdbVar.e && fdbVar.a && fdbVar.b) ? false : true;
            default:
                fdb fdbVar2 = (fdb) obj;
                return !fdbVar2.a || fdbVar2.c || fdbVar2.e;
        }
    }
}
