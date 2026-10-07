package defpackage;

import android.app.ActivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class h85 implements oah {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h85(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.oah
    public final Object get() {
        int i;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                int iMin = Math.min(((ActivityManager) obj).getMemoryClass() * 1048576, Integer.MAX_VALUE);
                if (iMin < 33554432) {
                    i = 4194304;
                } else {
                    i = iMin < 67108864 ? 6291456 : iMin / 4;
                }
                return new uaa(i, np0.n, Integer.MAX_VALUE, Integer.MAX_VALUE);
            case 1:
                return ((ju6) ((ny8) obj).getValue()).n();
            default:
                return obj;
        }
    }
}
