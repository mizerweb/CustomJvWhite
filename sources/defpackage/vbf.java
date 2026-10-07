package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Window;
import com.facebook.common.file.FileUtils$RenameException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes.dex */
public final class vbf implements rhh {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ vbf(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static vbf k(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new vbf(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public dq6 a() throws FileUtils$RenameException {
        h81 h81Var = (h81) this.c;
        ((j85) h81Var.e).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File fileQ = h81Var.q((String) this.b);
        try {
            wk8.z((File) this.a, fileQ);
            if (fileQ.exists()) {
                fileQ.setLastModified(jCurrentTimeMillis);
            }
            return new dq6(fileQ);
        } catch (FileUtils$RenameException e) {
            e.getCause();
            ((ghb) h81Var.d).getClass();
            throw e;
        }
    }

    @Override // defpackage.rhh
    public void b(kih kihVar) {
        ek2 ek2Var = (ek2) this.b;
        if ((ek2Var.t() instanceof hib) && ((AtomicBoolean) this.a).compareAndSet(false, true)) {
            ek2Var.resumeWith(kihVar);
        }
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList colorStateListL;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListL = np4.l((Context) this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListL;
    }

    public Drawable d(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : wk8.o((Context) this.a, resourceId);
    }

    public Drawable e(int i) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.b).hasValue(i) || (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) == 0) {
            return null;
        }
        xr xrVarA = xr.a();
        Context context = (Context) this.a;
        synchronized (xrVarA) {
            drawableD = xrVarA.a.d(resourceId, context, true);
        }
        return drawableD;
    }

    @Override // defpackage.rhh
    public void f(yhh yhhVar) {
        ek2 ek2Var = (ek2) this.b;
        if ((ek2Var.t() instanceof hib) && ((AtomicBoolean) this.a).compareAndSet(false, true)) {
            lhb lhbVar = kfc.c;
            short sK = ((hih) this.c).k();
            lhbVar.getClass();
            ek2Var.resumeWith(new poe(new TamErrorException(yhhVar, lhb.g(sK))));
        }
    }

    public Typeface h(int i, int i2, ws wsVar) {
        int resourceId = ((TypedArray) this.b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.c) == null) {
            this.c = new TypedValue();
        }
        Context context = (Context) this.a;
        TypedValue typedValue = (TypedValue) this.c;
        ThreadLocal threadLocal = mne.a;
        if (context.isRestricted()) {
            return null;
        }
        return mne.b(context, resourceId, typedValue, i2, wsVar, true, false);
    }

    public xac i() {
        return (xac) this.a;
    }

    public xac j() {
        return (xac) this.b;
    }

    public void l() {
        ((TypedArray) this.b).recycle();
    }

    public void m(br4 br4Var, Window window, br4 br4Var2, br4 br4Var3) throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = (sgg) this.c;
        if (sggVar != null) {
            sggVar.b(null);
        }
        br4 br4Var4 = ((((br4Var instanceof CallIndicatorWidget) || (br4Var2 instanceof CallIndicatorWidget)) && (br4Var3 instanceof ubf)) || (br4Var == null && br4Var2 != null && (br4Var3 instanceof ubf))) ? br4Var3 : br4Var;
        if (br4Var4 instanceof ubf) {
            this.c = yab.i0((w09) this.a, null, 0, new l83(this, br4Var4, window, (lq4) null, 14), 3);
        } else {
            wk8.d(window, false);
        }
    }

    public void n(t41 t41Var) throws IOException {
        File file = (File) this.a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                su4 su4Var = new su4(fileOutputStream);
                su4Var.a = 0L;
                p76 p76Var = (p76) t41Var.a;
                w41 w41Var = (w41) t41Var.b;
                InputStream inputStreamA = p76Var.A();
                if (inputStreamA == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                w41Var.c.e(inputStreamA, su4Var);
                su4Var.flush();
                long j = su4Var.a;
                fileOutputStream.close();
                if (file.length() != j) {
                    throw new v95(j, file.length());
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            ((ghb) ((h81) this.c).d).getClass();
            throw e;
        }
    }

    public vbf(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }
}
