package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class zrb extends uud {
    public final e5d u;
    public final ny8 v;
    public final ny8 w;

    public zrb(Context context, e5d e5dVar) {
        super(new atf(context));
        this.u = e5dVar;
        this.v = rx8.P(3, new cka(11));
        this.w = rx8.P(3, new cka(12));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        xqd xqdVar = (xqd) k79Var;
        boolean z = xqdVar.b;
        View view = this.a;
        if (!z) {
            atf atfVar = (atf) view;
            atfVar.setModelItem((ctf) this.v.getValue());
            atfVar.setTitleMaxLines(2);
            return;
        }
        atf atfVar2 = (atf) view;
        atfVar2.setModelItem((ctf) this.w.getValue());
        xnh xnhVar = xqdVar.c;
        xnhVar.getClass();
        Object obj = null;
        if (xnhVar == ynh.b) {
            xnhVar = null;
        }
        atfVar2.setTitle(xnhVar);
        atfVar2.setTitleMaxLines(3);
        if (((Boolean) this.u.i().i()).booleanValue()) {
            u8b u8bVar = xqdVar.d;
            Object[] objArr = u8bVar.a;
            int i = u8bVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj2 = objArr[i2];
                if (((rhc) obj2).a == uhc.a) {
                    obj = obj2;
                    break;
                }
            }
            rhc rhcVar = (rhc) obj;
            if (rhcVar == null || !rhcVar.a()) {
                return;
            }
            atfVar2.setEndView(fsf.a);
        }
    }

    @Override // defpackage.uud
    public final void J(View.OnClickListener onClickListener) {
        qe7.H(this.a, 300L, onClickListener);
    }
}
