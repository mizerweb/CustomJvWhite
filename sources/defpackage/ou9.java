package defpackage;

import android.opengl.GLES20;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ou9 implements ngk {
    public int a;
    public int b;
    public int c;
    public final int d;
    public final Object e;
    public final Object f;

    public ou9(float[] fArr, int i, float[] fArr2, int i2) {
        this.a = i;
        this.b = i2;
        this.e = bgc.a(fArr);
        this.f = bgc.a(fArr2);
        this.d = 5;
        this.c = 4;
    }

    @Override // defpackage.ngk
    public void a() {
    }

    @Override // defpackage.ngk
    public void b() {
        int i = this.b;
        int i2 = this.a;
        if (((FloatBuffer) this.e) == null || ((FloatBuffer) this.f) == null) {
            return;
        }
        GLES20.glEnableVertexAttribArray(i2);
        bgc.c("glEnableVertexAttribArray");
        GLES20.glEnableVertexAttribArray(i);
        bgc.c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.a, 2, 5126, false, 8, (Buffer) this.e);
        bgc.c("glVertexAttribPointer");
        GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 8, (Buffer) this.f);
        bgc.c("glVertexAttribPointer");
        GLES20.glDrawArrays(this.d, 0, this.c);
        bgc.c("glDrawArrays");
        GLES20.glDisableVertexAttribArray(i2);
        bgc.c("glDisableVertexAttribArray");
        GLES20.glDisableVertexAttribArray(i);
        bgc.c("glDisableVertexAttribArray");
    }

    public void c() {
        View view = (View) qv1.f(1, (ArrayList) this.e);
        mgg mggVar = (mgg) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.f).r.d(view);
        mggVar.getClass();
    }

    public void d() {
        ((ArrayList) this.e).clear();
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 0;
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.f).w;
        ArrayList arrayList = (ArrayList) this.e;
        return z ? g(arrayList.size() - 1, -1, false, true) : g(0, arrayList.size(), false, true);
    }

    public int f() {
        boolean z = ((StaggeredGridLayoutManager) this.f).w;
        ArrayList arrayList = (ArrayList) this.e;
        return z ? g(0, arrayList.size(), false, true) : g(arrayList.size() - 1, -1, false, true);
    }

    public int g(int i, int i2, boolean z, boolean z2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        int iM = staggeredGridLayoutManager.r.m();
        int i3 = staggeredGridLayoutManager.r.i();
        int i4 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.e).get(i);
            int iG = staggeredGridLayoutManager.r.g(view);
            int iD = staggeredGridLayoutManager.r.d(view);
            boolean z3 = false;
            boolean z4 = !z2 ? iG >= i3 : iG > i3;
            if (!z2 ? iD > iM : iD >= iM) {
                z3 = true;
            }
            if (z4 && z3) {
                if (z) {
                    return vee.M(view);
                }
                if (iG < iM || iD > i3) {
                    return vee.M(view);
                }
            }
            i += i4;
        }
        return -1;
    }

    public int h() {
        return this.d;
    }

    public int i(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.e).size() == 0) {
            return i;
        }
        c();
        return this.b;
    }

    public View j(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        ArrayList arrayList = (ArrayList) this.e;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && vee.M(view2) >= i) || ((!staggeredGridLayoutManager.w && vee.M(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.w && vee.M(view3) <= i) || ((!staggeredGridLayoutManager.w && vee.M(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public int k(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        int i2 = this.a;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        mgg mggVar = (mgg) view.getLayoutParams();
        this.a = ((StaggeredGridLayoutManager) this.f).r.g(view);
        mggVar.getClass();
        return this.a;
    }

    public ou9(int i, p70 p70Var, int i2, int i3, int i4, String str) {
        this.a = i;
        this.e = p70Var;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.f = str;
    }

    public ou9(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = new ArrayList();
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 0;
        this.d = i;
    }
}
