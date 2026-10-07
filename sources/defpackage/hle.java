package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public class hle {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public hle() {
        this.a = 6;
        this.c = new Object();
        this.d = new PriorityQueue(10, Collections.reverseOrder());
        this.b = Integer.MIN_VALUE;
    }

    public void a(int i) {
        synchronized (this.c) {
            ((PriorityQueue) this.d).add(Integer.valueOf(i));
            this.b = Math.max(this.b, i);
        }
    }

    public void b() {
        lh6 lh6Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            vt5.a(drawable);
        }
        if (drawable == null || (lh6Var = (lh6) this.d) == null) {
            return;
        }
        xr.d(drawable, lh6Var, imageView.getDrawableState());
    }

    public lhe c(boolean z) {
        f98 f98Var;
        f98 f98Var2;
        if (z && (f98Var2 = (f98) this.d) != null) {
            throw f98Var2.a();
        }
        lhe lheVarI = lhe.i(this.b, (Object[]) this.c, this);
        if (!z || (f98Var = (f98) this.d) == null) {
            return lheVarI;
        }
        throw f98Var.a();
    }

    public g98 d() {
        return c(false);
    }

    public synchronized int e() {
        return ((LinkedHashMap) this.d).size();
    }

    public synchronized ArrayList f(ck0 ck0Var) {
        ArrayList arrayList;
        arrayList = new ArrayList(((LinkedHashMap) this.d).entrySet().size());
        Iterator it = ((LinkedHashMap) this.d).entrySet().iterator();
        while (it.hasNext()) {
            ck0Var.mo28apply(((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }

    public String g() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof fif) {
                fif fifVar = (fif) obj;
                boolean zD = cqk.d(fifVar.d(), c6h.g);
                int[] iArr = (int[]) this.d;
                if (!zD) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(fifVar.f(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.d)[i2]);
                    sb.append("]");
                }
            } else if (obj != ldf.h) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public synchronized int h() {
        return this.b;
    }

    public void i(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = l3e.f;
        vbf vbfVarK = vbf.k(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) vbfVarK.b;
        i7j.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) vbfVarK.b, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = wk8.o(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                vt5.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                m3m.d(imageView, vbfVarK.c(2));
            }
            if (typedArray.hasValue(3)) {
                m3m.e(imageView, vt5.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            vbfVarK.l();
        }
    }

    public hle j(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, r88.b(objArr.length, i));
        }
        oc9.n(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public synchronized void k(v71 v71Var, Object obj) {
        Object objRemove = ((LinkedHashMap) this.d).remove(v71Var);
        this.b -= objRemove == null ? 0 : ((w4) this.c).d(objRemove);
        ((LinkedHashMap) this.d).put(v71Var, obj);
        this.b += ((w4) this.c).d(obj);
    }

    public hle l(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.b) * 2;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, r88.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public synchronized Object m(Object obj) {
        Object objRemove;
        objRemove = ((LinkedHashMap) this.d).remove(obj);
        this.b -= objRemove == null ? 0 : ((w4) this.c).d(objRemove);
        return objRemove;
    }

    public void n(int i) {
        int iIntValue;
        synchronized (this.c) {
            ((PriorityQueue) this.d).remove(Integer.valueOf(i));
            if (((PriorityQueue) this.d).isEmpty()) {
                iIntValue = Integer.MIN_VALUE;
            } else {
                Integer num = (Integer) ((PriorityQueue) this.d).peek();
                String str = vqi.a;
                iIntValue = num.intValue();
            }
            this.b = iIntValue;
            this.c.notifyAll();
        }
    }

    public synchronized ArrayList o(gdd gddVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.d).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (gddVar.mo28apply(entry.getKey())) {
                arrayList.add(entry.getValue());
                int i = this.b;
                Object value = entry.getValue();
                this.b = i - (value == null ? 0 : ((w4) this.c).d(value));
                it.remove();
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return g();
            case 6:
            default:
                return super.toString();
            case 7:
                StringBuilder sb = new StringBuilder();
                if (((twd) this.c) == twd.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
        }
    }

    public /* synthetic */ hle(Object obj, int i, Serializable serializable, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = serializable;
    }

    public hle(w4 w4Var) {
        this.a = 2;
        this.d = new LinkedHashMap();
        this.b = 0;
        this.c = w4Var;
    }

    public hle(ImageView imageView) {
        this.a = 1;
        this.b = 0;
        this.c = imageView;
    }

    public /* synthetic */ hle(int i, byte b) {
        this.a = i;
    }

    public hle(int i) {
        this.a = 4;
        this.c = new Object[i * 2];
        this.b = 0;
    }
}
