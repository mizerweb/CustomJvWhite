package defpackage;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e8j extends g8j {
    public static e8j c;
    public static final gp0 d = new gp0(26);
    public final Application b;

    public e8j(Application application) {
        this.b = application;
    }

    public static b8j d(Class cls, Application application) {
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return j25.a(cls);
        }
        try {
            return (b8j) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            ahc.j("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            ahc.j("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            ahc.j("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            ahc.j("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // defpackage.g8j, defpackage.f8j
    public final b8j a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        c.i("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.g8j, defpackage.f8j
    public final b8j b(Class cls, x7b x7bVar) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) ((LinkedHashMap) x7bVar.b).get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return j25.a(cls);
        }
        ore.p("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
