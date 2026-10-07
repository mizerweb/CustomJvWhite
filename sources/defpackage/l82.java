package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l82 {
    public final /* synthetic */ w82 a;

    public /* synthetic */ l82(w82 w82Var) {
        this.a = w82Var;
    }

    public final void a(a80 a80Var, a80 a80Var2) {
        Object value;
        w82 w82Var = this.a;
        String name = w82.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "setOnAudioDeviceChangeListener: old: " + p.p(a80Var.a) + ", new: " + p.p(a80Var2.a), null);
            }
        }
        f9b f9bVar = (f9b) w82Var.v.getValue();
        do {
            value = f9bVar.getValue();
        } while (!f9bVar.h(value, a80Var2));
    }
}
