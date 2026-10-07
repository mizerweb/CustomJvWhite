package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class j9e extends kjh {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ l9e f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9e(l9e l9eVar) {
        super(zo5.w(new StringBuilder(), l9eVar.m, " writer"), true);
        this.f = l9eVar;
    }

    @Override // defpackage.kjh
    public final long a() {
        switch (this.e) {
            case 0:
                l9e l9eVar = this.f;
                try {
                    return l9eVar.g() ? 0L : -1L;
                } catch (IOException e) {
                    l9eVar.c(e, null);
                }
                break;
            default:
                this.f.h.d();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9e(String str, l9e l9eVar) {
        super(str, true);
        this.f = l9eVar;
    }
}
