package defpackage;

import ru.ok.tamtam.shared.lifecycle.AlreadyHandledEventException;

/* JADX INFO: loaded from: classes3.dex */
public class ec6 {
    public final Object a;
    public boolean b;

    public ec6(Object obj) {
        this.a = obj;
        System.currentTimeMillis();
    }

    public final Object a() {
        if (this.b) {
            return new poe(new AlreadyHandledEventException());
        }
        this.b = true;
        return this.a;
    }
}
