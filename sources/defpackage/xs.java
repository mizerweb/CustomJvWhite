package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.biometric.BiometricFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class xs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public xs(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = 2;
        this.d = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        r72 r72Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i = this.a;
        String str = null;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((TextView) obj2).setTypeface((Typeface) obj, i2);
                return;
            case 1:
                ((BiometricFragment) obj).V(i2, (CharSequence) obj2);
                return;
            case 2:
                ((BottomSheetBehavior) obj).F((View) obj2, i2, false);
                return;
            case 3:
                j79 j79Var = (j79) obj;
                e89 e89Var = (e89) obj2;
                boolean z = j79Var.c;
                AtomicInteger atomicInteger = j79Var.d;
                ArrayList arrayList7 = j79Var.b;
                if (j79Var.isDone() || arrayList7 == null) {
                    qyj.l("Future was done before all dependencies completed", z);
                    return;
                }
                try {
                    qyj.l("Tried to set value from future which is not done", e89Var.isDone());
                    arrayList7.set(i2, o9b.e(e89Var));
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    qyj.l("Less than 0 remaining futures", iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        if (arrayList6 != null) {
                            r72Var = j79Var.f;
                            arrayList2 = new ArrayList(arrayList6);
                            r72Var.b(arrayList2);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (RuntimeException e) {
                    if (z) {
                        j79Var.f.d(e);
                    }
                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                    qyj.l("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                    if (iDecrementAndGet2 == 0) {
                        if (arrayList5 != null) {
                            r72Var = j79Var.f;
                            arrayList2 = new ArrayList(arrayList5);
                        }
                        return;
                    }
                    return;
                } catch (ExecutionException e2) {
                    if (z) {
                        j79Var.f.d(e2.getCause());
                    }
                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                    qyj.l("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                    if (iDecrementAndGet3 == 0) {
                        if (arrayList4 != null) {
                            r72Var = j79Var.f;
                            arrayList2 = new ArrayList(arrayList4);
                        }
                        return;
                    }
                    return;
                } catch (CancellationException unused) {
                    if (z) {
                        j79Var.cancel(false);
                    }
                    int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                    qyj.l("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                    if (iDecrementAndGet4 == 0) {
                        if (arrayList3 != null) {
                            r72Var = j79Var.f;
                            arrayList2 = new ArrayList(arrayList3);
                        }
                        return;
                    }
                    return;
                } catch (Error e3) {
                    j79Var.f.d(e3);
                    int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                    qyj.l("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                    if (iDecrementAndGet5 == 0) {
                        if (arrayList != null) {
                            r72Var = j79Var.f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } finally {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    qyj.l("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        ArrayList arrayList8 = j79Var.b;
                        if (arrayList8 != null) {
                            j79Var.f.b(new ArrayList(arrayList8));
                        } else {
                            qyj.l(null, j79Var.isDone());
                        }
                    }
                }
            default:
                cyb cybVar = (cyb) obj2;
                ScrollView scrollView = (ScrollView) obj;
                ViewGroup.LayoutParams layoutParams = cybVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), cybVar.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + i2);
                return;
        }
    }

    public /* synthetic */ xs(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }

    public /* synthetic */ xs(View view, Object obj, int i, int i2) {
        this.a = i2;
        this.c = view;
        this.d = obj;
        this.b = i;
    }
}
