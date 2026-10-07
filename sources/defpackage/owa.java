package defpackage;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class owa implements rj6 {
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;

    public /* synthetic */ owa(Provider provider, Provider provider2, int i) {
        this.a = i;
        this.b = provider;
        this.c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.a;
        Provider provider = this.b;
        switch (i) {
            case 0:
                return new nwa((Context) ((yv4) provider).b, (r6a) ((yv4) this.c).get());
            default:
                return new uxe(new lu8(), new nv8(13), lh0.f, (n3f) provider.get(), this.c);
        }
    }
}
