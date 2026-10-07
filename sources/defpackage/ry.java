package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ry extends zp0 {
    public static final /* synthetic */ int k = 0;
    public final long h;
    public final long i;
    public final int j;

    public ry(int i, int i2, long j, long j2, long j3) {
        super(j, i);
        this.h = j2;
        this.i = j3;
        this.j = i2;
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.AssetsMove assetsMove = new Tasks.AssetsMove();
        assetsMove.assetType = a.p(this.f);
        assetsMove.id = this.h;
        assetsMove.requestId = this.a;
        assetsMove.prevId = this.i;
        assetsMove.position = this.j;
        return sia.toByteArray(assetsMove);
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_ASSETS_MOVE;
    }

    @Override // defpackage.aq
    public final Object m() {
        vsb vsbVar = new vsb((kfc) null, 4);
        int i = this.f;
        if (i == 0) {
            ore.p("type must not be null");
            return null;
        }
        long j = this.h;
        if (j == 0) {
            ore.p("id must not be null or empty");
            return null;
        }
        long j2 = this.i;
        int i2 = this.j;
        if (j2 <= 0 && i2 < 0) {
            ore.p("prevId or position must be set");
            return null;
        }
        vsbVar.h("type", qt4.f(i));
        vsbVar.f(j, "id");
        if (j2 > 0) {
            vsbVar.f(j2, "prevId");
            return vsbVar;
        }
        vsbVar.c(i2, "position");
        return vsbVar;
    }

    @Override // defpackage.zp0
    public final void w(kih kihVar) {
        sy syVar = (sy) kihVar;
        if (syVar.c) {
            x(syVar.d);
        } else {
            f(new yhh("asset.task.failed", "failed to move asset", null));
        }
    }
}
