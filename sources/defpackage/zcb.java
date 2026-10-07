package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zcb extends kq0 {
    static {
        n1g.Z("NetworkNotRoamingCtrlr");
    }

    public zcb(hdb hdbVar) {
        super(hdbVar);
    }

    @Override // defpackage.rf4
    public final boolean b(mzj mzjVar) {
        return mzjVar.j.a == 4;
    }

    @Override // defpackage.kq0
    public final int c() {
        return 7;
    }

    @Override // defpackage.kq0
    public final boolean d(Object obj) {
        fdb fdbVar = (fdb) obj;
        return (fdbVar.a && fdbVar.d && !fdbVar.e) ? false : true;
    }
}
