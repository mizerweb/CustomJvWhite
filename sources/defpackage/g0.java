package defpackage;

import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 implements op {
    private volatile np cachedParams;

    public final synchronized np a() {
        np npVar = this.cachedParams;
        if (npVar != null) {
            return npVar;
        }
        np npVar2 = new np();
        populateParams(npVar2);
        this.cachedParams = npVar2;
        return npVar2;
    }

    @Override // defpackage.op
    public boolean canRepeat() {
        return a().b;
    }

    public final synchronized void invalidateParams() {
        this.cachedParams = null;
    }

    public abstract void populateParams(np npVar);

    public boolean shouldPost() {
        return a().c;
    }

    @Override // defpackage.op
    public final boolean willWriteParams() {
        return a().d;
    }

    @Override // defpackage.op
    public final boolean willWriteSupplyParams() {
        return a().e;
    }

    @Override // defpackage.op
    public final void writeParams(mv8 mv8Var) throws JsonSerializeException, IOException {
        a().c(mv8Var);
    }

    @Override // defpackage.op
    public final void writeSupplyParams(mv8 mv8Var) throws JsonSerializeException, IOException {
        a().d(mv8Var);
    }
}
