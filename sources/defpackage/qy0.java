package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;

    public /* synthetic */ qy0(Bitmap bitmap, int i) {
        this.a = i;
        this.b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bitmap bitmap = this.b;
        switch (i) {
            case 0:
                try {
                    bitmap.recycle();
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                break;
        }
    }
}
