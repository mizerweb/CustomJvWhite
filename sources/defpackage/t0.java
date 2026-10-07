package defpackage;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements mr4 {
    public final ArrayList a = new ArrayList(2);

    public final synchronized void a(mr4 mr4Var) {
        this.a.add(mr4Var);
    }

    @Override // defpackage.mr4
    public final synchronized void b(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                mr4 mr4Var = (mr4) this.a.get(i);
                if (mr4Var != null) {
                    mr4Var.b(str, th);
                }
            } catch (Exception e) {
                d(e, "InternalListener exception in onFailure");
            }
        }
    }

    @Override // defpackage.mr4
    public final synchronized void c(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                mr4 mr4Var = (mr4) this.a.get(i);
                if (mr4Var != null) {
                    mr4Var.c(str);
                }
            } catch (Exception e) {
                d(e, "InternalListener exception in onRelease");
            }
        }
    }

    public final synchronized void d(Exception exc, String str) {
        Log.e("FdingControllerListener", str, exc);
    }

    @Override // defpackage.mr4
    public final synchronized void e(String str, Object obj, Animatable animatable) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                mr4 mr4Var = (mr4) this.a.get(i);
                if (mr4Var != null) {
                    mr4Var.e(str, obj, animatable);
                }
            } catch (Exception e) {
                d(e, "InternalListener exception in onFinalImageSet");
            }
        }
    }

    @Override // defpackage.mr4
    public final synchronized void f(Object obj, String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                mr4 mr4Var = (mr4) this.a.get(i);
                if (mr4Var != null) {
                    mr4Var.f(obj, str);
                }
            } catch (Exception e) {
                d(e, "InternalListener exception in onSubmit");
            }
        }
    }

    @Override // defpackage.mr4
    public final void j(String str, Throwable th) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                mr4 mr4Var = (mr4) arrayList.get(i);
                if (mr4Var != null) {
                    mr4Var.j(str, th);
                }
            } catch (Exception e) {
                d(e, "InternalListener exception in onIntermediateImageFailed");
            }
        }
    }

    @Override // defpackage.mr4
    public final void onIntermediateImageSet(String str, Object obj) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                mr4 mr4Var = (mr4) arrayList.get(i);
                if (mr4Var != null) {
                    mr4Var.onIntermediateImageSet(str, obj);
                }
            } catch (Exception e) {
                d(e, "InternalListener exception in onIntermediateImageSet");
            }
        }
    }
}
