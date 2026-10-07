package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class yv4 implements rj6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ yv4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new r6a(false, (Context) ((yv4) obj).b, new lu8(), new nv8(13));
            default:
                return obj;
        }
    }
}
