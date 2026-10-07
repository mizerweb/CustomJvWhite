package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b1f {
    public boolean b;
    public Bundle c;
    public boolean d;
    public jee e;
    public final iye a = new iye();
    public boolean f = true;

    public final Bundle a(String str) {
        if (!this.d) {
            ore.k("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.c = null;
        return bundle2;
    }

    public final a1f b() {
        String str;
        a1f a1fVar;
        Iterator it = this.a.iterator();
        do {
            gye gyeVar = (gye) it;
            if (!gyeVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) gyeVar.next();
            str = (String) entry.getKey();
            a1fVar = (a1f) entry.getValue();
        } while (!cqk.d(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return a1fVar;
    }

    public final void c(String str, a1f a1fVar) {
        Object obj;
        iye iyeVar = this.a;
        eye eyeVarA = iyeVar.a(str);
        if (eyeVarA != null) {
            obj = eyeVarA.b;
        } else {
            eye eyeVar = new eye(str, a1fVar);
            iyeVar.d++;
            eye eyeVar2 = iyeVar.b;
            if (eyeVar2 == null) {
                iyeVar.a = eyeVar;
                iyeVar.b = eyeVar;
            } else {
                eyeVar2.c = eyeVar;
                eyeVar.d = eyeVar2;
                iyeVar.b = eyeVar;
            }
            obj = null;
        }
        if (((a1f) obj) == null) {
            return;
        }
        ore.p("SavedStateProvider with the given key is already registered");
    }

    public final void d() {
        if (!this.f) {
            ore.k("Can not perform this action after onSaveInstanceState");
            return;
        }
        jee jeeVar = this.e;
        if (jeeVar == null) {
            jeeVar = new jee(this);
        }
        this.e = jeeVar;
        try {
            pz8.class.getDeclaredConstructor(null);
            jee jeeVar2 = this.e;
            if (jeeVar2 != null) {
                jeeVar2.b(pz8.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + pz8.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
