package defpackage;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class wc6 implements rj6 {
    public final /* synthetic */ int a;
    public final Provider b;

    public /* synthetic */ wc6(Provider provider, int i) {
        this.a = i;
        this.b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.a;
        Provider provider = this.b;
        switch (i) {
            case 0:
                String packageName = ((Context) provider.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                ore.n("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new n3f(Integer.valueOf(n3f.d).intValue(), (Context) provider.get(), "com.google.android.datatransport.events");
        }
    }
}
