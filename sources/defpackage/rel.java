package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rel {
    public static void a(dc9 dc9Var, int i, qg4 qg4Var) {
        long jM = dc9Var.m(i);
        List listH = dc9Var.h(jM);
        if (((ArrayList) listH).isEmpty()) {
            return;
        }
        if (i == ((long[]) dc9Var.d).length - 1) {
            c.t();
            return;
        }
        long jM2 = dc9Var.m(i + 1) - dc9Var.m(i);
        if (jM2 > 0) {
            qg4Var.accept(new bz4(jM, jM2, listH));
        }
    }

    public static final void b(Bitmap bitmap) {
        try {
            bitmap.recycle();
        } catch (Throwable th) {
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "BitmapExt", zo5.s("Error while recycling bitmap, isRecycled=", bitmap.isRecycled()), th);
            }
        }
    }
}
