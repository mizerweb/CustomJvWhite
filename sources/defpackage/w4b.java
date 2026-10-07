package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class w4b extends aq implements qih, btc {
    public final String f;
    public final long g;

    public w4b(long j, long j2, String str) {
        super(j);
        this.f = str;
        this.g = j2;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        x4b x4bVar = (x4b) kihVar;
        long j = this.g;
        if (j != -1) {
            sfa sfaVarL = r().l(j);
            boolean zIsEmpty = x4bVar.c.isEmpty();
            wja wjaVar = wja.ACTIVE;
            String str = this.f;
            if (zIsEmpty || sfaVarL == null) {
                toa toaVar = (toa) ((ose) r().b.c()).h();
                ((Number) ch3.G(toaVar.a, false, true, new iaa(toaVar, 10, new cei(j, null, 0)))).intValue();
                if (sfaVarL != null) {
                    String str2 = sfaVarL.g;
                    if (!cqk.d(str2, str) && str2 != null && str != null && !r5h.L0(str2, str, false)) {
                        r().s(this.g, zo5.p(str2, "\n", str), null, p(), wjaVar);
                    }
                }
            } else {
                b50 b50Var = x4bVar.c;
                bq bqVar = this.e;
                if (bqVar == null) {
                    bqVar = null;
                }
                r().o(sfaVarL, pm9.e(b50Var, (m7f) bqVar.M.getValue()));
                if (cqk.d(sfaVarL.g, str)) {
                    r().s(this.g, null, null, p(), wjaVar);
                }
            }
            bq bqVar2 = this.e;
            ((wzj) (bqVar2 != null ? bqVar2 : null).g.getValue()).b();
        }
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
        wna wnaVarH = ((ose) r().b.c()).h();
        toa toaVar = (toa) wnaVarH;
        ((Number) ch3.G(toaVar.a, false, true, new iaa(toaVar, 10, new cei(this.g, null, 0)))).intValue();
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (p90.C(yhhVar.b)) {
            return;
        }
        d();
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.MsgSharePreview msgSharePreview = new Tasks.MsgSharePreview();
        msgSharePreview.requestId = this.a;
        msgSharePreview.text = this.f;
        msgSharePreview.messageId = this.g;
        return sia.toByteArray(msgSharePreview);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_MSG_SHARE_PREVIEW;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.aq
    public final Object m() {
        h3b h3bVar = new h3b((kfc) null, 13);
        h3bVar.h("text", this.f);
        return h3bVar;
    }
}
