package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b8a extends g8b {
    public final iye l = new iye();

    @Override // defpackage.b99
    public final void g() {
        Iterator it = this.l.iterator();
        while (true) {
            gye gyeVar = (gye) it;
            if (!gyeVar.hasNext()) {
                return;
            } else {
                ((a8a) ((Map.Entry) gyeVar.next()).getValue()).b();
            }
        }
    }

    @Override // defpackage.b99
    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            gye gyeVar = (gye) it;
            if (!gyeVar.hasNext()) {
                return;
            }
            a8a a8aVar = (a8a) ((Map.Entry) gyeVar.next()).getValue();
            a8aVar.a.j(a8aVar);
        }
    }

    public void l(b99 b99Var, srb srbVar) {
        Object obj;
        if (b99Var == null) {
            ore.n("source cannot be null");
            return;
        }
        a8a a8aVar = new a8a(b99Var, srbVar);
        iye iyeVar = this.l;
        eye eyeVarA = iyeVar.a(b99Var);
        if (eyeVarA != null) {
            obj = eyeVarA.b;
        } else {
            eye eyeVar = new eye(b99Var, a8aVar);
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
        a8a a8aVar2 = (a8a) obj;
        if (a8aVar2 != null && a8aVar2.b != srbVar) {
            ore.p("This source was already added with the different observer");
        } else if (a8aVar2 == null && this.c > 0) {
            a8aVar.b();
        }
    }
}
