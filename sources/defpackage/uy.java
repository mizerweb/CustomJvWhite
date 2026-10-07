package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public final class uy extends zp0 {
    public static final /* synthetic */ int i = 0;
    public final long[] h;

    public uy(int i2, long j, long[] jArr) {
        super(j, i2);
        this.h = jArr;
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.AssetsRemove assetsRemove = new Tasks.AssetsRemove();
        assetsRemove.assetType = a.p(this.f);
        assetsRemove.ids = this.h;
        assetsRemove.requestId = this.a;
        return sia.toByteArray(assetsRemove);
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_ASSETS_REMOVE;
    }

    @Override // defpackage.aq
    public final Object m() {
        vsb vsbVar = new vsb((kfc) null, 5);
        int i2 = this.f;
        if (i2 == 0) {
            ore.p("type must not be null");
            return null;
        }
        long[] jArr = this.h;
        if (jArr == null || jArr.length == 0) {
            ore.p("ids must not be null or empty");
            return null;
        }
        vsbVar.h("type", qt4.f(i2));
        vsbVar.e("ids", jArr);
        return vsbVar;
    }

    @Override // defpackage.zp0
    public final void w(kih kihVar) {
        vy vyVar = (vy) kihVar;
        if (vyVar.c) {
            x(vyVar.d);
        } else {
            f(new yhh("asset.task.failed", "failed to remove asset", null));
        }
    }
}
