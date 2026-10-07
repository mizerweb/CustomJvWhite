package defpackage;

import com.vk.push.common.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zck implements bub, stb {
    public final /* synthetic */ kdk a;

    @Override // defpackage.bub
    public void a(Object obj) {
        Logger.DefaultImpls.info$default(this.a.g, "Re-subscription result is Success!", null, 2, null);
    }

    @Override // defpackage.stb
    public void onFailure(Throwable th) {
        Logger.DefaultImpls.info$default(this.a.g, "Re-subscription is completed with exception " + th.getMessage(), null, 2, null);
    }
}
