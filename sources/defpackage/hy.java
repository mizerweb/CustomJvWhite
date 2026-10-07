package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public final class hy extends zp0 {
    public static final /* synthetic */ int i = 0;
    public final long h;

    public hy(int i2, long j, long j2) {
        super(j, i2);
        this.h = j2;
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.AssetsAdd assetsAdd = new Tasks.AssetsAdd();
        assetsAdd.assetType = a.p(this.f);
        assetsAdd.id = this.h;
        assetsAdd.requestId = this.a;
        return sia.toByteArray(assetsAdd);
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_ASSETS_ADD;
    }

    @Override // defpackage.aq
    public final Object m() {
        vsb vsbVar = new vsb((kfc) null, 1);
        int i2 = this.f;
        if (i2 == 0) {
            ore.p("type must not be null");
            return null;
        }
        long j = this.h;
        if (j == 0) {
            ore.p("id must not be null or empty");
            return null;
        }
        vsbVar.h("type", qt4.f(i2));
        vsbVar.f(j, "id");
        return vsbVar;
    }

    @Override // defpackage.zp0
    public final void w(kih kihVar) {
        iy iyVar = (iy) kihVar;
        if (iyVar.c) {
            x(iyVar.d);
        } else {
            f(new yhh("asset.task.failed", "failed to add asset", null));
        }
    }
}
