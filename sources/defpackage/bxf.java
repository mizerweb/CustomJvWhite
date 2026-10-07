package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bxf extends hxf {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public bxf(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.hxf
    public final void a(Matrix matrix, swf swfVar, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((hxf) it.next()).a(this.d, swfVar, i, canvas);
        }
    }
}
