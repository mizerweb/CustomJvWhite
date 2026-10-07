package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vli implements cle {
    public final /* synthetic */ zli a;

    public vli(zli zliVar) {
        this.a = zliVar;
    }

    @Override // defpackage.cle
    public final void W(jme jmeVar, long j, wg wgVar) {
        Integer num;
        if (this.a.q.a == 0 || (num = (Integer) jmeVar.a(ihh.b)) == null) {
            return;
        }
        zli zliVar = this.a;
        int iIntValue = num.intValue();
        synchronized (zliVar.c) {
            zv zvVar = zliVar.f;
            while (!zvVar.isEmpty() && ((wli) zvVar.first()).a <= iIntValue) {
                ((wli) zvVar.first()).b.Q(sbi.a);
                cx3.e1(zvVar);
                this.a.q.a();
            }
        }
    }

    @Override // defpackage.cle
    public final void Y(jme jmeVar, long j, eme emeVar) {
        Integer num;
        if (this.a.q.a == 0 || (num = (Integer) jmeVar.a(ihh.b)) == null) {
            return;
        }
        zli zliVar = this.a;
        int iIntValue = num.intValue();
        synchronized (zliVar.c) {
            zv zvVar = zliVar.f;
            Throwable th = new Throwable("Failed in framework level".concat(" with CaptureFailure.reason = " + emeVar.r0()));
            while (!zvVar.isEmpty() && ((wli) zvVar.first()).a <= iIntValue) {
                ((wli) zvVar.first()).b.j0(th);
                cx3.e1(zvVar);
                this.a.q.a();
            }
        }
    }
}
