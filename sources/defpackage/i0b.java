package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class i0b implements p48 {
    public static final Size f = new Size(480, 360);
    public final ArrayList a;
    public final int b;
    public final ro7 c;
    public final ExecutorService d;
    public Matrix e;

    public i0b(List list, ExecutorService executorService, ro7 ro7Var) {
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                this.a = new ArrayList(list);
                this.b = 1;
                this.c = ro7Var;
                this.d = executorService;
                return;
            }
            if (((bj5) it.next()).i0() == 7) {
                z = false;
            }
            yab.n("Segmentation only works with COORDINATE_SYSTEM_ORIGINAL", z);
        }
    }

    public final void a(final nof nofVar, final int i, final Matrix matrix, final HashMap map, final HashMap map2) throws Exception {
        Image imageH0 = nofVar.b.H0();
        if (imageH0 == null) {
            tvj.c("MlKitAnalyzer", "Image is null.");
            nofVar.close();
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        ExecutorService executorService = this.d;
        if (i > size) {
            nofVar.close();
            executorService.execute(new sc2(this, map, nofVar, map2, 9));
            return;
        }
        final bj5 bj5Var = (bj5) arrayList.get(i);
        try {
            bj5Var.h0(imageH0, nofVar.e.b(), matrix).c(executorService, new otb() { // from class: g0b
                @Override // defpackage.otb
                public final void j(Task task) throws Exception {
                    i0b i0bVar = this.a;
                    HashMap map3 = map2;
                    bj5 bj5Var2 = bj5Var;
                    HashMap map4 = map;
                    nof nofVar2 = nofVar;
                    int i2 = i;
                    Matrix matrix2 = matrix;
                    if (((kam) task).d) {
                        map3.put(bj5Var2, new CancellationException("The task is canceled."));
                    } else if (task.j()) {
                        map4.put(bj5Var2, task.h());
                    } else {
                        map3.put(bj5Var2, task.g());
                    }
                    i0bVar.a(nofVar2, i2 + 1, matrix2, map4, map3);
                }
            });
        } catch (Exception e) {
            map2.put(bj5Var, new RuntimeException("Failed to process the image.", e));
            a(nofVar, i + 1, matrix, map, map2);
        }
    }

    @Override // defpackage.p48
    public final Size b() {
        Iterator it = this.a.iterator();
        Size size = f;
        Size size2 = size;
        while (it.hasNext()) {
            int iI0 = ((bj5) it.next()).i0();
            Size size3 = (iI0 == 1 || iI0 == 4) ? new Size(1280, 720) : size;
            if (size3.getWidth() * size3.getHeight() > size2.getHeight() * size2.getWidth()) {
                size2 = size3;
            }
        }
        return size2;
    }

    @Override // defpackage.p48
    public final int f() {
        return this.b;
    }

    @Override // defpackage.p48
    public final void j(nof nofVar) throws Exception {
        m68 m68Var = nofVar.e;
        Matrix matrix = new Matrix();
        int i = this.b;
        if (i != 0) {
            Matrix matrix2 = this.e;
            if (i != 2 && matrix2 == null) {
                tvj.a("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                nofVar.close();
                return;
            }
            Matrix matrix3 = new Matrix(m68Var.e());
            RectF rectF = new RectF(0.0f, 0.0f, nofVar.f, nofVar.g);
            int iB = m68Var.b();
            RectF rectF2 = y1i.a;
            qyj.h("Invalid rotation degrees: " + iB, iB % 90 == 0);
            matrix3.postConcat(y1i.a(rectF, y1i.c(y1i.k(iB)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF, m68Var.b(), false));
            matrix3.invert(matrix);
            if (i != 2) {
                matrix.postConcat(matrix2);
            }
        }
        a(nofVar, 0, matrix, new HashMap(), new HashMap());
    }

    @Override // defpackage.p48
    public final void m(Matrix matrix) {
        if (matrix == null) {
            this.e = null;
        } else {
            this.e = new Matrix(matrix);
        }
    }
}
