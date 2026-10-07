package defpackage;

import android.content.Context;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public interface po9 extends vm7 {
    @Override // defpackage.vm7
    default cn7 a(Context context, boolean z) {
        return md5.j(context, c98.r(this), ghe.e, z);
    }

    Matrix b();

    default int c() {
        return 9729;
    }

    default lag d(int i, int i2) {
        return new lag(i, i2);
    }
}
