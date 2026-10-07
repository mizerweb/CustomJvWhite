package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class np {
    public final ArrayList a = new ArrayList();
    public boolean b = true;
    public boolean c;
    public boolean d;
    public boolean e;

    public final void a(mp mpVar) {
        this.a.add(mpVar);
        this.b &= mpVar.a();
        this.c |= mpVar.c();
        this.d |= !mpVar.b();
        this.e = mpVar.b() | this.e;
    }

    public final void b(String str, String str2) {
        a(new j5h(str, str2));
    }

    public final void c(mv8 mv8Var) {
        if (this.d) {
            ArrayList<mp> arrayList = this.a;
            if (arrayList.size() > 1) {
                bx3.Y0(arrayList, new lv5(5));
            }
            for (mp mpVar : arrayList) {
                if (!mpVar.b()) {
                    mpVar.d(mv8Var);
                }
            }
        }
    }

    public final void d(mv8 mv8Var) {
        if (this.e) {
            for (mp mpVar : this.a) {
                if (mpVar.b()) {
                    mpVar.d(mv8Var);
                }
            }
        }
    }
}
