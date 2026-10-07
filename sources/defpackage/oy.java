package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public final class oy extends zp0 {
    public static final /* synthetic */ int j = 0;
    public final long[] h;
    public final long i;

    public oy(long j2, int i, long[] jArr, long j3) {
        super(j2, i);
        this.h = jArr;
        this.i = j3;
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.AssetsListModify assetsListModify = new Tasks.AssetsListModify();
        assetsListModify.assetType = a.p(this.f);
        assetsListModify.requestId = this.a;
        assetsListModify.ids = this.h;
        assetsListModify.modifyTime = this.i;
        return sia.toByteArray(assetsListModify);
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_ASSETS_LIST_MODIFY;
    }

    @Override // defpackage.aq
    public final Object m() {
        vsb vsbVar = new vsb((kfc) null, 3);
        int i = this.f;
        if (i == 0) {
            ore.p("type must not be null");
            return null;
        }
        long[] jArr = this.h;
        if (jArr == null) {
            ore.p("ids must not be null");
            return null;
        }
        vsbVar.h("type", qt4.f(i));
        vsbVar.e("ids", jArr);
        long j2 = this.i;
        if (j2 >= 0) {
            vsbVar.f(j2, "updateTime");
        }
        return vsbVar;
    }

    @Override // defpackage.zp0
    public final void w(kih kihVar) {
        py pyVar = (py) kihVar;
        if (pyVar.c) {
            x(pyVar.d);
        } else {
            f(new yhh("asset.task.failed", "failed to modify asset list", null));
        }
    }
}
