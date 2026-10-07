package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d1f implements f8j {
    public final Application a;
    public final e8j b;
    public final Bundle c;
    public final i19 d;
    public final b1f e;

    public d1f(Application application, c1f c1fVar, Bundle bundle) {
        e8j e8jVar;
        this.e = c1fVar.c();
        this.d = c1fVar.f();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (e8j.c == null) {
                e8j.c = new e8j(application);
            }
            e8jVar = e8j.c;
        } else {
            e8jVar = new e8j(null);
        }
        this.b = e8jVar;
    }

    @Override // defpackage.f8j
    public final b8j a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        ore.p("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.f8j
    public final b8j b(Class cls, x7b x7bVar) {
        khb khbVar = khb.n;
        LinkedHashMap linkedHashMap = (LinkedHashMap) x7bVar.b;
        String str = (String) linkedHashMap.get(khbVar);
        if (str == null) {
            ore.k("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(yab.e) == null || linkedHashMap.get(yab.f) == null) {
            if (this.d != null) {
                return d(str, cls);
            }
            ore.k("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(e8j.d);
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? e1f.a(cls, e1f.b) : e1f.a(cls, e1f.a);
        if (constructorA == null) {
            return this.b.b(cls, x7bVar);
        }
        return (!zIsAssignableFrom || application == null) ? e1f.b(cls, constructorA, yab.x(x7bVar)) : e1f.b(cls, constructorA, application, yab.x(x7bVar));
    }

    public final b8j d(String str, Class cls) {
        AutoCloseable autoCloseable;
        Application application;
        i19 i19Var = this.d;
        if (i19Var == null) {
            c.i("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.a == null) ? e1f.a(cls, e1f.b) : e1f.a(cls, e1f.a);
        if (constructorA == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (g8j.a == null) {
                g8j.a = new g8j();
            }
            g8j.a.getClass();
            return j25.a(cls);
        }
        b1f b1fVar = this.e;
        Bundle bundle = this.c;
        Bundle bundleA = b1fVar.a(str);
        Class[] clsArr = v0f.f;
        v0f v0fVarA = nol.a(bundleA, bundle);
        w0f w0fVar = new w0f(str, v0fVarA);
        if (w0fVar.c) {
            ore.k("Already attached to lifecycleOwner");
            return null;
        }
        w0fVar.c = true;
        i19Var.a(w0fVar);
        b1fVar.c(str, v0fVarA.e);
        n09 n09Var = i19Var.d;
        if (n09Var == n09.b || n09Var.a(n09.d)) {
            b1fVar.d();
        } else {
            i19Var.a(new qz8(i19Var, b1fVar));
        }
        b8j b8jVarB = (!zIsAssignableFrom || (application = this.a) == null) ? e1f.b(cls, constructorA, v0fVarA) : e1f.b(cls, constructorA, application, v0fVarA);
        d8j d8jVar = b8jVarB.a;
        if (d8jVar == null) {
            return b8jVarB;
        }
        if (d8jVar.d) {
            d8j.a(w0fVar);
            return b8jVarB;
        }
        synchronized (d8jVar.a) {
            autoCloseable = (AutoCloseable) d8jVar.b.put("androidx.lifecycle.savedstate.vm.tag", w0fVar);
        }
        d8j.a(autoCloseable);
        return b8jVarB;
    }

    public final void e(b8j b8jVar) {
        i19 i19Var = this.d;
        if (i19Var != null) {
            tfb.b(b8jVar, this.e, i19Var);
        }
    }
}
