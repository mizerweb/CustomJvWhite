package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f83 implements l8e {
    public final /* synthetic */ int a;
    public Object b;

    public f83(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new LinkedHashSet(1);
                break;
            case 3:
                this.b = new BitSet(22);
                break;
            case 7:
                this.b = new ConcurrentHashMap();
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }

    public static m65 c(f83 f83Var, String str, String[] strArr, f65 f65Var, int i) {
        return f83Var.b(str, (String[]) Arrays.copyOf(strArr, strArr.length), null, r1f.a(f65Var), (i & 8) != 0);
    }

    public static m65 d(f83 f83Var, String str, String[] strArr, Set set, int i) {
        if ((i & 2) != 0) {
            set = null;
        }
        return f83Var.b(str, strArr, set, r1f.a, true);
    }

    public static long l(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    @Override // defpackage.l8e
    public void B(Object obj, zv8 zv8Var, Object obj2) {
        Object obj3 = this.b;
        this.b = obj2;
        a(obj3, obj2);
    }

    public abstract void a(Object obj, Object obj2);

    public m65 b(String str, String[] strArr, Set set, c9b c9bVar, boolean z) {
        if (!r5h.o1(str, ':')) {
            ore.c("invalid route ".concat(str));
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            arrayList.add(str2.toLowerCase(Locale.ROOT));
        }
        m65 m65Var = new m65(wk8.e(str.toLowerCase(Locale.ROOT)), c9bVar, new LinkedHashSet(arrayList), z, set);
        ((LinkedHashSet) this.b).add(m65Var);
        return m65Var;
    }

    public void e(f83 f83Var) {
        ((BitSet) this.b).or((BitSet) f83Var.b);
    }

    public abstract Typeface f(Context context, j77 j77Var, Resources resources, int i);

    public abstract Typeface g(Context context, m77[] m77VarArr, int i);

    public Typeface h(int i, Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface i(Context context, Resources resources, int i, String str);

    public abstract Typeface j(Context context, Typeface typeface, int i);

    public abstract boolean k();

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        return this.b;
    }

    public boolean n(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            ore.a();
            return false;
        }
        bmh bmhVar = (bmh) this.b;
        if (bmhVar == null) {
            return k();
        }
        int iG = bmhVar.g(i, charSequence);
        if (iG == 0) {
            return true;
        }
        if (iG != 1) {
            return k();
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ObservableProperty(value=" + this.b + ')';
            case 5:
                return ww3.z1((List) this.b, "|", null, null, null, 62);
            default:
                return super.toString();
        }
    }

    public f83(ny8 ny8Var) {
        this.a = 0;
        this.b = new ifh(new fu(ny8Var, 1));
    }

    public /* synthetic */ f83(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
